package edu.depaul.cdm.se450.patterns.command.undo;

public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
