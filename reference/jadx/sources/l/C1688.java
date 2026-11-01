package l;

import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.Matrix;

/* JADX INFO: renamed from: l.֫۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G6WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1688 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f6680;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture f6681;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f6682;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f6683;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C15801 f6684;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f6685;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6686;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f6687;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f6688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float[] f6689;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AssetManager f6690;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f6691;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f6692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f6693;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f6694;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5601() {
        if (this.f6694) {
            return;
        }
        this.f6694 = true;
        m5605();
        if (this.f6691) {
            this.f6681.release();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5602(int i, float f, int i2) {
        this.f6688 = i;
        this.f6692 = i2;
        this.f6680 = f;
        this.f6686 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5603(boolean z) {
        boolean z2 = this.f6683;
        if (z2 == z) {
            return;
        }
        if (z && !z2) {
            this.f6686 = true;
        }
        this.f6683 = z;
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5604(float[] fArr) {
        if (this.f6693) {
            return;
        }
        System.arraycopy(fArr, 0, this.f6689, 0, 16);
        this.f6686 = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5605() {
        this.f6693 = true;
        notifyAll();
    }

    public C1688(AssetManager assetManager, SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, boolean z, C15801 c15801) {
        super("MT-Logo3D");
        float[] fArr = new float[16];
        this.f6689 = fArr;
        this.f6686 = true;
        this.f6683 = true;
        this.f6690 = assetManager;
        this.f6681 = surfaceTexture;
        this.f6688 = i;
        this.f6692 = i2;
        this.f6680 = f;
        this.f6685 = i3;
        this.f6682 = z;
        this.f6684 = c15801;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x013e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0143, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0148, code lost:
    
        m5600("query width", android.opengl.EGL14.eglQuerySurface(r2, r4, 12375, r7, 0));
        m5600("query height", android.opengl.EGL14.eglQuerySurface(r2, r4, 12374, r7, 1));
        r13.m24209(r7[0], r7[1], r7, r8);
        m5600("swap buffers", android.opengl.EGL14.eglSwapBuffers(r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0172, code lost:
    
        if (r20.f6687 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r20.f6687 = true;
        r20.f6684.m37574(r20);
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
        throw new UnsupportedOperationException("Method not decompiled: l.C1688.run():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5600(String str, boolean z) {
        if (z) {
            return;
        }
        StringBuilder sbM30914 = C12441.m30914("Logo EGL ", str, " failed: ");
        sbM30914.append(EGL14.eglGetError());
        throw new IllegalStateException(sbM30914.toString());
    }
}
