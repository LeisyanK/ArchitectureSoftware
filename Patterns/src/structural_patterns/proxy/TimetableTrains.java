package structural_patterns.proxy;

/**
 * реализуем систему, которая читает расписание поездов с диска
 */
public interface TimetableTrains {
    String[] getTimetable();
    String getTrainDepartureTime(String trainId);
}
