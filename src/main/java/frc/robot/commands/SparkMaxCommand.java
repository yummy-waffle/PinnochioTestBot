// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SparkMaxSubsystem;

public class SparkMaxCommand extends Command {
  final XboxController controller;
  SparkMaxSubsystem sparkMaxSub;

  public SparkMaxCommand(SparkMaxSubsystem sparkMaxSub, XboxController controller) {
    addRequirements(sparkMaxSub);
    this.sparkMaxSub = sparkMaxSub;
    this.controller = controller;
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
