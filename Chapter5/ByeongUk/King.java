public class King extends BaseJudge {

    public King() {
        super(new SimplePolicy());
    }

    @Override
    protected String title() {
        return "왕";
    }
}