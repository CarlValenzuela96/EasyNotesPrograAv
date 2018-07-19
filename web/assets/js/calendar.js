YUI().use(
  'aui-scheduler',
 function(Y) {
    var json = JSON.parse(fechas); 
    var events;
            for (var i = 0; i < json.length; i++) {
                if(i==0){
                    events=[{
                            color:json[i].color,
                            content:json[i].content,
                            endDate: new Date(json[i].anio, json[i].mes-1, json[i].dia),
                            startDate: new Date(json[i].anio, json[i].mes-1, json[i].dia)
                    }];
                }else{
                    events=events.concat([{
                            color:json[i].color,
                            content:json[i].content,
                            endDate: new Date(json[i].anio, json[i].mes-1, json[i].dia),
                            startDate: new Date(json[i].anio, json[i].mes-1, json[i].dia)
                    }]);
                }
            }
   
    var dayView = new Y.SchedulerDayView();
    var monthView = new Y.SchedulerMonthView();
    var agendaView = new Y.SchedulerAgendaView();
    var eventRecorder = new Y.SchedulerEventRecorder();
    var f = new Date();
    new Y.Scheduler(
      {
        activeView: monthView, 
        boundingBox: '#myScheduler',
        date: new Date(f.getFullYear(),f.getMonth(), f.getDate()),
        eventRecorder: eventRecorder,  
        items: events,
        render: true,
        views: [dayView,monthView,agendaView]
      }
    );
  }
);