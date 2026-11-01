package l;

import android.opengl.Matrix;

/* JADX INFO: renamed from: l.۫۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12273 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23562 f41039;

    public RunnableC12273(C23562 c23562) {
        this.f41039 = c23562;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23562 c23562 = this.f41039;
        float[] fArr = c23562.f76307;
        if (c23562.f76314 && c23562.f76293) {
            c23562.f76304 = System.nanoTime() - c23562.f76289;
            double d = (c23562.f76304 * 1.0E-9d) / 30.0d;
            if (d >= 4.0d) {
                c23562.f76292 = true;
                c23562.m51939();
                System.arraycopy(c23562.f76315, 0, fArr, 0, 16);
                ((RunnableC7361) c23562.f76303).run();
                return;
            }
            float f = (float) ((d % 1.0d) * 360.0d);
            float fSin = (float) Math.sin((d % 4.0d) * 1.5707963267948966d);
            Matrix.setRotateM(c23562.f76295, 0, f, 0.0f, 1.0f, 0.0f);
            Matrix.multiplyMM(c23562.f76294, 0, c23562.f76295, 0, c23562.f76315, 0);
            Matrix.setRotateM(c23562.f76295, 0, 20.0f * fSin, 1.0f, 0.0f, 0.0f);
            Matrix.multiplyMM(fArr, 0, c23562.f76295, 0, c23562.f76294, 0);
            Matrix.setRotateM(c23562.f76295, 0, fSin * 10.0f, 0.0f, 0.0f, 1.0f);
            Matrix.multiplyMM(c23562.f76294, 0, c23562.f76295, 0, fArr, 0);
            System.arraycopy(c23562.f76294, 0, fArr, 0, 16);
            ((RunnableC7361) c23562.f76303).run();
            c23562.f76308.postDelayed(this, 34L);
        }
    }
}
