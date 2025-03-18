// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.ServoCommand;
import frc.robot.commands.SparkMaxCommand;
import frc.robot.subsystems.ServoSubsystem;
import frc.robot.subsystems.SparkMaxSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private final XboxController controller = new XboxController(0);

  // Add more ServoSubsystems for more servos - don't name them the same thing.
  private final ServoSubsystem servoSub = new ServoSubsystem(Constants.servoPWMPort);

    // Add more SparkMaxSubsystems for more Spark Maxes - don't name them the same thing.
  private final SparkMaxSubsystem sparkMaxSub = new SparkMaxSubsystem(Constants.SparkMaxID1);


  // Command section: add any commands you make here!
  private final ServoCommand servoCommand = new ServoCommand(servoSub, controller);
  private final SparkMaxCommand sparkMaxCommand = new SparkMaxCommand(sparkMaxSub, controller);
  {
    // Set any additional servos to nameOfServo.setDefaultCommand(servoCommand);
    servoSub.setDefaultCommand(servoCommand);

    // Set any additional Spark Maxes to nameOfSparkMax.setDefaultCommand(sparkMaxCommand);
    sparkMaxSub.setDefaultCommand(sparkMaxCommand);
  }

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
