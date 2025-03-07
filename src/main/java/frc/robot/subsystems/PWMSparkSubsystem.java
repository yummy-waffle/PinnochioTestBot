// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PWMSparkSubsystem extends SubsystemBase {
  /** Creates a new PWMSparkSubsystem. */
  PWMSparkMax spark;

  public PWMSparkSubsystem(int id) {
    spark = new PWMSparkMax(id);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void set(double speed) {
    spark.set(speed);
  }
}
