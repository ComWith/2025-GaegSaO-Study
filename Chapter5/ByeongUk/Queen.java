public class Queen extends BaseJudge {

    public Queen() {
        super(new KeywordPolicy("steal"));
    }

    @Override
    protected String title() {
        return "여왕";
    }
}