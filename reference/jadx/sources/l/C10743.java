package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۤ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10743 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f34105;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f34106;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f34107;

    public C10743(Bitmap bitmap, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Invalid resolved image");
        }
        this.f34105 = bitmap;
        this.f34106 = i;
        this.f34107 = i2;
    }
}
