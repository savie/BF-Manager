package l;

import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.Matrix;

/* JADX INFO: renamed from: l.ۢ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G6WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10158 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f32524;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f32525;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float[] f32526;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f32527;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f32528;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f32529;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture f32530;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f32531;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12396 f32532;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f32533;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AssetManager f32534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f32535;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f32536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32537;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f32538;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26267() {
        if (this.f32531) {
            return;
        }
        this.f32531 = true;
        m26271();
        if (this.f32524) {
            this.f32530.release();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26268(int i, float f, int i2) {
        this.f32538 = i;
        this.f32536 = i2;
        this.f32535 = f;
        this.f32525 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26269(boolean z) {
        boolean z2 = this.f32527;
        if (z2 == z) {
            return;
        }
        if (z && !z2) {
            this.f32525 = true;
        }
        this.f32527 = z;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26270(float[] fArr) {
        if (this.f32537) {
            return;
        }
        System.arraycopy(fArr, 0, this.f32526, 0, 16);
        this.f32525 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m26271() {
        this.f32537 = true;
        notifyAll();
    }

    public C10158(AssetManager assetManager, SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, boolean z, C12396 c12396) {
        super("MT-Logo3D");
        float[] fArr = new float[16];
        this.f32526 = fArr;
        this.f32525 = true;
        this.f32527 = true;
        this.f32534 = assetManager;
        this.f32530 = surfaceTexture;
        this.f32538 = i;
        this.f32536 = i2;
        this.f32535 = f;
        this.f32528 = i3;
        this.f32533 = z;
        this.f32532 = c12396;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x013e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0148, code lost:
    
        m26266("query width", android.opengl.EGL14.eglQuerySurface(r2, r4, 12375, r7, 0));
        m26266("query height", android.opengl.EGL14.eglQuerySurface(r2, r4, 12374, r7, 1));
        r13.m4430(r7[0], r7[1], r7, r8);
        m26266("swap buffers", android.opengl.EGL14.eglSwapBuffers(r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0172, code lost:
    
        if (r20.f32529 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r20.f32529 = true;
        r20.f32532.m30866(r20);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10158.run():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26266(String str, boolean z) {
        if (z) {
            return;
        }
        StringBuilder sbM51387 = C22783.m51387("Logo EGL ", str, " failed: ");
        sbM51387.append(EGL14.eglGetError());
        throw new IllegalStateException(sbM51387.toString());
    }
}
