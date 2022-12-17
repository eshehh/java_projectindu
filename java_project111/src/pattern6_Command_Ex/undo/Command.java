package pattern6_Command_Ex.undo;

public interface Command {
	public void execute();
	public void undo();
}
