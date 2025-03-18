// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Out;

public class ServoSubsystem extends SubsystemBase {
  Servo servo;

  // This is a class constructor
  public ServoSubsystem(int port) {
    Servo servo = new Servo(port);
    this.servo = servo;
  }

  // Don't put anything in this function
  @Override
  public void periodic() {
  }

  // Sets the servo to a specified decimal value between 0 and 1
  public void servoSet(double value) {
    servo.set(value);
  }

  // Sets the servo to max or min value based on a boolean value (true/false)
  public void servoToggle(boolean toggle) {
    if (toggle) {
      servo.set(1.0);
    } else {
      servo.set(0);
    }
  }

  // Sets the servo to a specified angle in degrees between 0 and 270
  public void setServoAngle(double angle) {
    servo.set(angle / 270);
    Out.put("Servo Angle: " + angle);
  }
}