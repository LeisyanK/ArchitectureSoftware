package Domain;

// оценка фильма
public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    /**
     * конструктор оценки фильма
     * @param s
     * @param v
     * @param excellent
     */
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    /**
     * распечатываем оценку фильма
     */
    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}