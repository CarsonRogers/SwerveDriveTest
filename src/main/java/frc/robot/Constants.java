// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final double kDeadband = 0.01;
  }

  public static class ModuleConstants {

    //how many inches is the wheel diameter
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    //find gear ratio
    public static final double kDriveMotorGearRatio = 1 / 10;
    public static final double kTurningMotorGearRatio = 1 / 18.0;

    public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter/60;

    public static final double kTurningEncoderRot2Meter = kTurningMotorGearRatio * 2 * Math.PI;
    public static final double kTurningEncoderRPM2MeterPerSec = kTurningEncoderRot2Meter/60;

    //P in PID Controller for Turning Motor
    public static final double kPTurning = 0.5;
  }

  public static class DriveConstants {

    public static final double kTrackWidth = Units.inchesToMeters(20);
    //Distance between left and right wheels
    public static final double kWheelBase = Units.inchesToMeters(20);
    //Distance between front and back wheels
    public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
      new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
      new Translation2d(kWheelBase / 2, kTrackWidth / 2),
      new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
      new Translation2d(-kWheelBase / 2, kTrackWidth / 2)
    );


    public static final double kPhysicalMaxSpeedMetersPerSecond = 5;

    public static final double kTeleDriveMaxAccelerationUnitesPerSecond = 2;
    public static final double kTeleDriveMaxSpeedMetersPerSecond = 3;
    public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 2;
    public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = 1;

    //FrontLeft
    public static final int kFrontLeftDriveCANID = 1;
    public static final int kFrontLeftTurningCANID = 2;
    public static final boolean kFrontLeftDriveEncoderReversed = false; 
    public static final boolean kFrontLeftTurningEncoderReversed = false; 
    public static final int kFrontLeftAbsoluteEncoderPort = 1;
    public static final double kFrontLeftAbsoluteEncoderOffsetRad = 0.0;
    public static final boolean kFrontLeftAbsoluteEncoderReversed = false;

    //FrontRight
    public static final int kFrontRightDriveCANID = 3;
    public static final int kFrontRightTurningCANID = 4;
    public static final boolean kFrontRightDriveEncoderReversed = false; 
    public static final boolean kFrontRightTurningEncoderReversed = false; 
    public static final int kFrontRightAbsoluteEncoderPort = 2;
    public static final double kFrontRightAbsoluteEncoderOffsetRad = 0.0;
    public static final boolean kFrontRightAbsoluteEncoderReversed = false;


    //BackLeft
    public static final int kBackLeftDriveCANID = 5;
    public static final int kBackLeftTurningCANID = 6;
    public static final boolean kBackLeftDriveEncoderReversed = false; 
    public static final boolean kBackLeftTurningEncoderReversed = false; 
    public static final int kBackLeftAbsoluteEncoderPort = 3;
    public static final double kBackLeftAbsoluteEncoderOffsetRad = 0.0;
    public static final boolean kBackLeftAbsoluteEncoderReversed = false;


    //BackRight
    public static final int kBackRightDriveCANID = 7;
    public static final int kBackRightTurningCANID = 8;
    public static final boolean kBackRightDriveEncoderReversed = false; 
    public static final boolean kBackRightTurningEncoderReversed = false; 
    public static final int kBackRightAbsoluteEncoderPort = 4;
    public static final double kBackRightAbsoluteEncoderOffsetRad = 0.0;
    public static final boolean kBackRightAbsoluteEncoderReversed = false;

  }
}
