package com.omatrix.shipmentplanning.models;

import lombok.Getter;
import lombok.Setter;

public class Parameters {
    @Setter
    @Getter
    private static String routeType;
    @Setter
    @Getter
    private static Double averageSpeed;
    @Setter
    @Getter
    private static Double distanceCost;
    @Setter
    @Getter
    private static Double waitingTimeCost;
    @Setter
    @Getter
    private static Double perStopCharge;
    @Setter
    @Getter
    private static Double fixedHandlingTime;
    @Setter
    @Getter
    private static Double variableHandlingRate;
    @Setter
    @Getter
    private static int StopLimit;
    @Setter
    @Getter
    private static double maxAggregateVolume;
    @Setter
    @Getter
    private static double maxAggregateWeight;
    @Getter
    @Setter
    private static boolean enableAggregation;
    @Setter
    @Getter
    private static double minTimeOverlap;
    @Setter
    @Getter
    private static boolean enablePSO;
    @Setter
    @Getter
    private static double locationMarginFactor;
    @Setter
    @Getter
    private static int particlesCount;
    @Setter
    @Getter
    private static int maxIterations;
    @Setter
    @Getter
    private static double inertiaWeight;
    @Setter
    @Getter
    private static double cognitiveWeight;
    @Setter
    @Getter
    private static double socialWeight;

    @Override
    public String toString() {
        return "Parameters{" +
                "addOrderType='" + routeType + '\'' +
                ", avgSpeed=" + averageSpeed +
                ", distanceCost=" + distanceCost +
                ", waitingTimeCost=" + waitingTimeCost +
                ", stopOffCharges=" + perStopCharge +
                ", fixedHandlingTime=" + fixedHandlingTime +
                ", variableHandlingRate=" + variableHandlingRate +
                ", StopLimit=" + StopLimit +
                ", maxAggregateVolume=" + maxAggregateVolume +
                ", maxAggregateWeight=" + maxAggregateWeight +
                ", minTimeOverlap=" + minTimeOverlap +
                ", enableAggregation=" + enableAggregation +
                ", enablePSO=" + enablePSO +
                ", locationMarginFactor=" + locationMarginFactor +
                ", numParticles=" + particlesCount +
                ", maxIterations=" + maxIterations +
                ", inertiaWeight=" + inertiaWeight +
                ", cognitiveWeight=" + cognitiveWeight +
                ", socialWeight=" + socialWeight +
                '}';
    }
}