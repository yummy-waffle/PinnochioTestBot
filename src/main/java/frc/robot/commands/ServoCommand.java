// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.Out;
import frc.robot.subsystems.ServoSubsystem;

public class ServoCommand extends Command {
  ServoSubsystem servoSub;
  XboxController controller;

  boolean toggle = true;
  boolean mode = false;

  public ServoCommand(ServoSubsystem servoSub, XboxController controller) {

    // addRequirements is honestly kinda weird. Don't touch it if you don't know what it does.
    addRequirements(servoSub);
    this.servoSub = servoSub;
    this.controller = controller;
  }

  @Override
  public void initialize() {
    servoSub.servoToggle(toggle);
  }

  @Override
  public void execute() {
    // if/else statements for controls. Call servoSub methods inside this boolean
    // logic to do actions. Toggle and mode can be used as shown
    // to control what actions are done. Select all the commented out code and push
    // ctrl + / to uncomment all lines selected.

    // if (controller.getAButtonPressed() & mode == false) {
    // servoSub.servoToggle(toggle);
    // toggle = !toggle;
    // }
    // else if (mode == true) {
    // servoSub.servoSet(((controller.getLeftX()+1)/2));
    // }

    // if (controller.getBButtonPressed() && controller.getRightBumperButton()) {
    // mode = !mode;
    // Out.put("Mode changed");
    // Out.put("Mode: " + mode);
    // }
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    Out.put("ServoCommand finished");
    return false;

  }
}
