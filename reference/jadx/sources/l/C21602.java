package l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: renamed from: l.᩸۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C21602 implements SensorEventListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15253[] f70068;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Display f70071;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f70073;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f70072 = new float[16];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float[] f70067 = new float[16];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float[] f70070 = new float[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f70069 = new float[3];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C21602(Display display, InterfaceC15253... interfaceC15253Arr) {
        this.f70071 = display;
        this.f70068 = interfaceC15253Arr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f70072;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f70071.getRotation();
        float[] fArr3 = this.f70067;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i2 = 2;
                i = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f70069;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f70073;
        float[] fArr5 = this.f70070;
        if (!z) {
            C23014.m50904(fArr5, fArr2);
            this.f70073 = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f70068[i3].mo30899(f, fArr2);
        }
    }
}
