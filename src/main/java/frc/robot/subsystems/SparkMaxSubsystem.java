// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SparkMaxSubsystem extends SubsystemBase {
  /** Creates a new SparkMaxSubsystem. */
  SparkMax sparkMax;

  public SparkMaxSubsystem(int id) {
    // Create a new SparkMax object with the given ID
     sparkMax = new SparkMax(id, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setSpeed(double speed) {
    // Set the speed of the SparkMax
    sparkMax.set(speed);
  }

  public double readEncoder() {
    // Read the encoder value of the SparkMax
    return sparkMax.getEncoder().getPosition();
  }
}
