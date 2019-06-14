package xingweixing.memento;

//发起人
public class Originator {

    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    //恢复状态
    public void recoveryStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
