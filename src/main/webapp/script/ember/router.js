Tasks.Router.map(function() {
  this.resource('tasks', {
    path : '/'
  });
});

Tasks.TasksRoute = Ember.Route.extend({
  model : function() {
    return this.store.find('task');
  }
});
