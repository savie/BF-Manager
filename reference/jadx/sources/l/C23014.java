package l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.᩺۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8N5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23014 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74800;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f74798 = new float[16];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float[] f74799 = new float[16];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3871 f74797 = new C3871();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50907(long j, float[] fArr) {
        this.f74797.m11201(j, fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50905() {
        this.f74797.m11200();
        this.f74800 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50906(long j, float[] fArr) {
        float[] fArr2 = (float[]) this.f74797.m11204(j);
        if (fArr2 == null) {
            return;
        }
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        float[] fArr3 = this.f74799;
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr3, 0);
        }
        boolean z = this.f74800;
        float[] fArr4 = this.f74798;
        if (!z) {
            m50904(fArr4, fArr3);
            this.f74800 = true;
        }
        Matrix.multiplyMM(fArr, 0, fArr4, 0, fArr3, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50904(float[] fArr, float[] fArr2) {
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
