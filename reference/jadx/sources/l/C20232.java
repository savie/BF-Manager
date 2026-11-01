package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.᩶ܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20232 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20502 f65653;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f65654;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bitmap f65655;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15999 f65656;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65657;

    public C20232(Bitmap bitmap, C20502 c20502, int i) {
        this.f65655 = bitmap;
        this.f65653 = c20502;
        this.f65654 = i;
        C15999 c15999 = new C15999();
        c15999.f51805 = 1;
        this.f65656 = c15999;
    }

    public C20232(C20232 c20232) {
        this.f65655 = c20232.f65655;
        this.f65653 = c20232.f65653;
        this.f65654 = c20232.f65654;
        this.f65656 = c20232.f65656;
    }

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final C20232 m45735() {
        C20232 c20232;
        synchronized (this.f65656) {
            if (this.f65657) {
                throw new IllegalStateException("Bitmap handle is closed");
            }
            this.f65656.f51805++;
            c20232 = new C20232(this);
        }
        return c20232;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f65656) {
            if (this.f65657) {
                return;
            }
            this.f65657 = true;
            C15999 c15999 = this.f65656;
            int i = c15999.f51805 - 1;
            c15999.f51805 = i;
            if (i == 0) {
                try {
                    if (!this.f65655.isRecycled()) {
                        this.f65655.recycle();
                    }
                    this.f65653.close();
                } catch (Throwable th) {
                    this.f65653.close();
                    throw th;
                }
            }
        }
    }
}
