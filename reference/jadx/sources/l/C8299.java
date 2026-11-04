package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۠֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8299 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2333 f27261;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f27262;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bitmap f27263;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9153 f27264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f27265;

    public C8299(Bitmap bitmap, C9153 c9153, int i) {
        this.f27263 = bitmap;
        this.f27264 = c9153;
        this.f27262 = i;
        C2333 c2333 = new C2333();
        c2333.f7551 = 1;
        this.f27261 = c2333;
    }

    public C8299(C8299 c8299) {
        this.f27263 = c8299.f27263;
        this.f27264 = c8299.f27264;
        this.f27262 = c8299.f27262;
        this.f27261 = c8299.f27261;
    }

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final C8299 m22388() {
        C8299 c8299;
        synchronized (this.f27261) {
            if (this.f27265) {
                throw new IllegalStateException("Bitmap handle is closed");
            }
            this.f27261.f7551++;
            c8299 = new C8299(this);
        }
        return c8299;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f27261) {
            if (this.f27265) {
                return;
            }
            this.f27265 = true;
            C2333 c2333 = this.f27261;
            int i = c2333.f7551 - 1;
            c2333.f7551 = i;
            if (i == 0) {
                try {
                    if (!this.f27263.isRecycled()) {
                        this.f27263.recycle();
                    }
                    this.f27264.close();
                } catch (Throwable th) {
                    this.f27264.close();
                    throw th;
                }
            }
        }
    }
}
