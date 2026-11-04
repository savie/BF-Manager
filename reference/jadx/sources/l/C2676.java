package l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: renamed from: l.ۖ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8JK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2676 implements SensorEventListener {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Display f8507;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f8509;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9387[] f8512;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f8511 = new float[16];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f8508 = new float[16];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float[] f8510 = new float[16];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f8506 = new float[3];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C2676(Display display, InterfaceC9387... interfaceC9387Arr) {
        this.f8507 = display;
        this.f8512 = interfaceC9387Arr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f8511;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f8507.getRotation();
        float[] fArr3 = this.f8508;
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
        float[] fArr4 = this.f8506;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f8509;
        float[] fArr5 = this.f8510;
        if (!z) {
            C1185.m4361(fArr5, fArr2);
            this.f8509 = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.f8512[i3].mo24714(f, fArr2);
        }
    }
}
