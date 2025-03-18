// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SparkMaxSubsystem extends SubsystemBase {
  SparkMax sparkMax;

  public SparkMaxSubsystem(int id) {
     sparkMax = new SparkMax(id, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
  }

  public void setSpeed(double speed) {
    sparkMax.set(speed);
  }

  public double readEncoder() {
    return sparkMax.getEncoder().getPosition();
  }
}
