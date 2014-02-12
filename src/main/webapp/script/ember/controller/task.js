Tasks.TasksController = Ember.ArrayController.extend({
  actions : {
    createTask : function() {
      var title = this.get('newTitle');
      if (!title.trim()) {
        return;
      }

      var task = this.store.createRecord('task', {
        title : title,
        complete : false
      });

      this.set('newTitle', '');

      task.save();
    }
  },
  inflection : function() {
    var remaining = this.get('remaining');
    return remaining === 1 ? 'todo' : 'todos';
  }.property('remaining'),
  remaining : function() {
    return this.filterBy('complete', false).get('length');
  }.property('@each.complete')
});

Tasks.TaskController = Ember.ObjectController.extend({
  actions : {
    acceptChanges : function() {
      this.set('isEditing', false);

      if (Ember.isEmpty(this.get('model.title'))) {
        this.send('removeTask');
      } else {
        this.get('model').save();
      }
    },
    editTask : function() {
      this.set('isEditing', true);
    },
    removeTask : function() {
      var task = this.get('model');
      task.deleteRecord();
      task.save();
    }
  },
  isComplete : function(key, value) {
    var model = this.get('model');

    if (value === undefined) {
      return model.get('complete');
    } else {
      model.set('complete', value);
      model.save();
      return value;
    }
  }.property('model.complete'),
  isEditing : false
});
