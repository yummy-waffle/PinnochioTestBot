// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Autos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.ServoAngleCommand;
import frc.robot.subsystems.ServoSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class GuyFricksWithRobot extends SequentialCommandGroup {
  /** Creates a new GuyFricksWithRobot. */
  public GuyFricksWithRobot(ServoSubsystem servoSub) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new ServoAngleCommand(servoSub, 0),
      new WaitCommand(1),
      new ServoAngleCommand(servoSub, 90),
      new WaitCommand(2),
      new ServoAngleCommand(servoSub, 45),
      new WaitCommand(0.1),
      new ServoAngleCommand(servoSub, 270),
      new WaitCommand(0.1),
      new ServoAngleCommand(servoSub, 359),
      new WaitCommand(0.1),
      new ServoAngleCommand(servoSub, 0),
      new WaitCommand(0.1),
      new ServoAngleCommand(servoSub, 45),
      new WaitCommand(1),
      new ServoAngleCommand(servoSub, 0)
    );
  }
}
