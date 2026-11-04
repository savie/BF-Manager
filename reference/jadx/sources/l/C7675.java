package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۟ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7675 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f25269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f25270;

    public C7675(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f25270 = width;
        this.f25269 = new boolean[width * height];
        int[] iArr = new int[width];
        for (int i = 0; i < height; i++) {
            bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = i * width;
            for (int i3 = 0; i3 < width; i3++) {
                this.f25269[i2 + i3] = (iArr[i3] >>> 24) >= C18862.f61243;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20908(int i, int i2) {
        return this.f25269[(i2 * this.f25270) + i];
    }
}
