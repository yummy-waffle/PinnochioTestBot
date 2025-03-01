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
public class ServoRatchet extends SequentialCommandGroup {
  /** Creates a new ServoRatchet. */
  public ServoRatchet(ServoSubsystem servoSub) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new ServoAngleCommand(servoSub, 0),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 22.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 45),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 67.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 90),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 112.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 135),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 157.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 180),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 202.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 225),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 247.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 270),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 247.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 225),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 202.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 180),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 157.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 135),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 112.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 90),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 67.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 45),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 22.5),
      new WaitCommand(0.5),
      new ServoAngleCommand(servoSub, 0)
    );
  }
}