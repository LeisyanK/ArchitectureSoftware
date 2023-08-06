package structural_patterns.proxy;

/**
 * Создать класс заместителя. В нем должна быть ссылка на сервисный объект (создать в классе или передать в конструкторе);
 * На этом этапе просто создаем класс со ссылкой на оригинальный объект и передаем все вызовы ему.
 */
public class TimetableElectricTrainsProxy implements TimetableTrains{
   // Ссылка на оригинальный объект
   private TimetableTrains timetableTrains = new TimetableElectricTrains();

   private String[] timetableCache = null;

   /**
    * Метод getTimetable() проверяет, закэширован ли массив расписания в память. Если нет, он посылает запрос для загрузки данных с диска, сохраняя результат. Если же запрос уже выполняется, он быстро вернет объект из памяти.
    Благодаря простому функционалу, метод getTrainDepartireTime() не пришлось перенаправлять в оригинальный объект. Мы просто дублировали его функционал в новый метод.
    Так делать нельзя. Если пришлось дублировать код или производить подобные манипуляции, значит что-то пошло не так, и нужно посмотреть на проблему под другим углом. В нашем простом примере иного пути нет, но в реальных проектах, скорее всего, код будет написан более корректно.
    */
   @Override
   public String[] getTimetable() {
       if(timetableCache == null) {
           timetableCache = timetableTrains.getTimetable();
       }
       return timetableCache;
   }

   @Override
   public String getTrainDepartureTime(String trainId) {
       if(timetableCache == null) {
           timetableCache = timetableTrains.getTimetable();
       }
       for(int i = 0; i < timetableCache.length; i++) {
           if(timetableCache[i].startsWith(trainId+";")) return timetableCache[i];
       }
       return "";
   }

   public void clearCache() {
       timetableTrains = null;
   }
}
