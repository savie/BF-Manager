package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۟ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7367 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Bitmap f24439;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19633(Bitmap bitmap) {
        if (this.f24439 != null) {
            throw new IllegalStateException("MPEG-TS preview bitmap is already owned");
        }
        this.f24439 = bitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19634() {
        return this.f24439 != null;
    }

    public final Bitmap take() {
        Bitmap bitmap = this.f24439;
        C13638.requireNonNull(bitmap);
        this.f24439 = null;
        return bitmap;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Bitmap bitmap = this.f24439;
        this.f24439 = null;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
