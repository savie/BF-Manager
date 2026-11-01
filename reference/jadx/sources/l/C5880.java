package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۛۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5880 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f20066;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f20067;

    public C5880(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f20067 = width;
        this.f20066 = new boolean[width * height];
        int[] iArr = new int[width];
        for (int i = 0; i < height; i++) {
            bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = i * width;
            for (int i3 = 0; i3 < width; i3++) {
                this.f20066[i2 + i3] = (iArr[i3] >>> 24) >= C10820.f36847;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m16089(int i, int i2) {
        return this.f20066[(i2 * this.f20067) + i];
    }
}
