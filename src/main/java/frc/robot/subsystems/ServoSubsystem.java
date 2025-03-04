// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ServoSubsystem extends SubsystemBase {
  /** Creates a new ServoSubsystem. */
  Servo servo = new Servo(0);
  public ServoSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void servoSet(double value) {
    servo.set(value);
  }

  public void servoToggle(boolean toggle) {
    if (toggle) {
      servo.set(1.0);
    } else {
      servo.set(0);
    }
  }

  public void setServoAngle(double angle) {
    servo.set(angle/270);
    System.out.println("Servo Angle: " + angle);
  }
}