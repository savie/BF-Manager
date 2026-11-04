package l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.֨۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1185 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f4331;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f4329 = new float[16];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float[] f4330 = new float[16];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10098 f4332 = new C10098();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4364(long j, float[] fArr) {
        this.f4332.m26055(j, fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4362() {
        this.f4332.m26054();
        this.f4331 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4363(long j, float[] fArr) {
        float[] fArr2 = (float[]) this.f4332.m26058(j);
        if (fArr2 == null) {
            return;
        }
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        float[] fArr3 = this.f4330;
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr3, 0);
        }
        boolean z = this.f4331;
        float[] fArr4 = this.f4329;
        if (!z) {
            m4361(fArr4, fArr3);
            this.f4331 = true;
        }
        Matrix.multiplyMM(fArr, 0, fArr4, 0, fArr3, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4361(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }
}
