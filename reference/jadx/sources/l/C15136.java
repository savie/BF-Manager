package l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.ܳۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15136 implements GLSurfaceView.Renderer, InterfaceC1713, InterfaceC9387 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19612 f49377;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float[] f49378;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float[] f49382;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f49383;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f49384;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5442 f49386;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f49387;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float[] f49385 = new float[16];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float[] f49381 = new float[16];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float[] f49379 = new float[16];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float[] f49380 = new float[16];

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C5442.m16266(this.f49386, this.f49377.m45265());
    }

    @Override // l.InterfaceC9387
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo24714(float f, float[] fArr) {
        float[] fArr2 = this.f49384;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f49387 = f2;
        Matrix.setRotateM(this.f49378, 0, -this.f49383, (float) Math.cos(f2), (float) Math.sin(this.f49387), 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36413(PointF pointF) {
        float f = pointF.y;
        this.f49383 = f;
        Matrix.setRotateM(this.f49378, 0, -f, (float) Math.cos(this.f49387), (float) Math.sin(this.f49387), 0.0f);
        Matrix.setRotateM(this.f49382, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    public C15136(C5442 c5442, C19612 c19612) {
        this.f49386 = c5442;
        float[] fArr = new float[16];
        this.f49384 = fArr;
        float[] fArr2 = new float[16];
        this.f49378 = fArr2;
        float[] fArr3 = new float[16];
        this.f49382 = fArr3;
        this.f49377 = c19612;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f49387 = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f49385, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f49380, 0, this.f49384, 0, this.f49382, 0);
            Matrix.multiplyMM(this.f49379, 0, this.f49378, 0, this.f49380, 0);
        }
        Matrix.multiplyMM(this.f49381, 0, this.f49385, 0, this.f49379, 0);
        this.f49377.m45266(this.f49381);
    }
}
