Tasks.EditTaskView = Ember.TextField.extend({
  didInsertElement : function() {
    this.$().focus();
  }
});

Ember.Handlebars.helper('edit-task', Tasks.EditTaskView);
