package edu.depaul.cdm.se450.patterns.command.undo;

public interface Command {
	void execute();

	void undo();
}
