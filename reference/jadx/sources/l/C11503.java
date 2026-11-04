package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۧۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes3.dex */
public final class C11503 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bitmap f36203;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28963(Bitmap bitmap) {
        if (this.f36203 != null) {
            throw new IllegalStateException("MPEG-TS preview bitmap is already owned");
        }
        this.f36203 = bitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28964() {
        return this.f36203 != null;
    }

    public final Bitmap take() {
        Bitmap bitmap = this.f36203;
        C17359.requireNonNull(bitmap);
        this.f36203 = null;
        return bitmap;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Bitmap bitmap = this.f36203;
        this.f36203 = null;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
