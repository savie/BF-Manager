package l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.ܰ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14633 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7922 f47881;

    public RunnableC14633(C7922 c7922) {
        this.f47881 = c7922;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7922 c7922 = this.f47881;
        float[] fArr = c7922.f26310;
        if (c7922.f26329 && c7922.f26332) {
            c7922.f26335 = System.nanoTime() - c7922.f26324;
            double d = (c7922.f26335 * 1.0E-9d) / 30.0d;
            if (d >= 4.0d) {
                c7922.f26315 = true;
                c7922.m21491();
                System.arraycopy(c7922.f26326, 0, fArr, 0, 16);
                ((RunnableC4839) c7922.f26316).run();
                return;
            }
            float f = (float) ((d % 1.0d) * 360.0d);
            float fSin = (float) Math.sin((d % 4.0d) * 1.5707963267948966d);
            Matrix.setRotateM(c7922.f26322, 0, f, 0.0f, 1.0f, 0.0f);
            Matrix.multiplyMM(c7922.f26320, 0, c7922.f26322, 0, c7922.f26326, 0);
            Matrix.setRotateM(c7922.f26322, 0, 20.0f * fSin, 1.0f, 0.0f, 0.0f);
            Matrix.multiplyMM(fArr, 0, c7922.f26322, 0, c7922.f26320, 0);
            Matrix.setRotateM(c7922.f26322, 0, fSin * 10.0f, 0.0f, 0.0f, 1.0f);
            Matrix.multiplyMM(c7922.f26320, 0, c7922.f26322, 0, fArr, 0);
            System.arraycopy(c7922.f26320, 0, fArr, 0, 16);
            ((RunnableC4839) c7922.f26316).run();
            c7922.f26331.postDelayed(this, 34L);
        }
    }
}
