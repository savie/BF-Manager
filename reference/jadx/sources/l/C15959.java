package l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: l.ܺ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15959 implements GLSurfaceView.Renderer, InterfaceC16664, InterfaceC15253 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f51717;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f51718;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float[] f51721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20897 f51722;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0435 f51723;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f51724;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float[] f51725;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float[] f51715 = new float[16];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f51716 = new float[16];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float[] f51720 = new float[16];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float[] f51719 = new float[16];

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        C0435.m2257(this.f51723, this.f51722.m47006());
    }

    @Override // l.InterfaceC15253
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo30899(float f, float[] fArr) {
        float[] fArr2 = this.f51721;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.f51724 = f2;
        Matrix.setRotateM(this.f51718, 0, -this.f51717, (float) Math.cos(f2), (float) Math.sin(this.f51724), 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37943(PointF pointF) {
        float f = pointF.y;
        this.f51717 = f;
        Matrix.setRotateM(this.f51718, 0, -f, (float) Math.cos(this.f51724), (float) Math.sin(this.f51724), 0.0f);
        Matrix.setRotateM(this.f51725, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    public C15959(C0435 c0435, C20897 c20897) {
        this.f51723 = c0435;
        float[] fArr = new float[16];
        this.f51721 = fArr;
        float[] fArr2 = new float[16];
        this.f51718 = fArr2;
        float[] fArr3 = new float[16];
        this.f51725 = fArr3;
        this.f51722 = c20897;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f51724 = 3.1415927f;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.f51715, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f51719, 0, this.f51721, 0, this.f51725, 0);
            Matrix.multiplyMM(this.f51720, 0, this.f51718, 0, this.f51719, 0);
        }
        Matrix.multiplyMM(this.f51716, 0, this.f51715, 0, this.f51720, 0);
        this.f51722.m47007(this.f51716);
    }
}
