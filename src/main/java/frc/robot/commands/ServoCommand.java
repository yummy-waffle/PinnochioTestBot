// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ServoSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class ServoCommand extends Command {
  /** Creates a new ServoCommand. */
  ServoSubsystem servoSub;
  XboxController controller;

  boolean toggle = true;
  boolean mode = false;
  public ServoCommand(ServoSubsystem servoSub, XboxController controller) {
    
    addRequirements(servoSub);
    this.servoSub = servoSub;
    this.controller = controller;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    servoSub.servoToggle(toggle);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (controller.getAButtonPressed() & mode == false) {
      servoSub.servoToggle(toggle);
      toggle = !toggle;
    }
    else if (mode == true) {
      servoSub.servoSet(((controller.getLeftX()+1)/2));
    }

    if (controller.getBButtonPressed() && controller.getRightBumperButton()) {
      mode = !mode;
      System.out.println("Mode changed");
      System.out.println("Mode: " + mode);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
