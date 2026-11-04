package l;

import android.graphics.Bitmap;
import android.graphics.Color;

/* JADX INFO: renamed from: l.ۡܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6IY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9502 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m24884(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[Math.max(width, height)];
        bitmap.getPixels(iArr, 0, width, 0, height / 2, width, 1);
        int iM24883 = m24883(width, false, iArr);
        int iM24884 = m24883(width, true, iArr);
        bitmap.getPixels(iArr, 0, 1, width / 2, 0, 1, height);
        int iM24885 = m24883(height, false, iArr);
        int iM24886 = m24883(height, true, iArr);
        int i = (width - iM24883) - iM24884;
        int i2 = (height - iM24885) - iM24886;
        bitmap.getPixels(iArr, 0, i, iM24883, (i2 / 2) + iM24885, i, 1);
        int iMax = 0;
        for (int i3 = 0; i3 < i && iMax != 255; i3++) {
            iMax = Math.max(iMax, Color.alpha(iArr[i3]));
        }
        bitmap.getPixels(iArr, 0, 1, (i / 2) + iM24883, iM24885, 1, i2);
        int iMax2 = 0;
        for (int i4 = 0; i4 < i2 && iMax2 != 255; i4++) {
            iMax2 = Math.max(iMax2, Color.alpha(iArr[i4]));
        }
        int iMax3 = Math.max(iMax, iMax2);
        int iMin = Math.min(i, i2);
        for (int i5 = 0; i5 < iMin; i5++) {
            iArr[i5] = bitmap.getPixel(iM24883 + i5, iM24885 + i5);
        }
        float fM24883 = m24883(iMin, false, iArr) * 3.4142f;
        C6178 c6178 = new C6178(24);
        c6178.writeInt(iM24883);
        c6178.writeInt(iM24885);
        c6178.writeInt(iM24884);
        c6178.writeInt(iM24886);
        c6178.m17781(fM24883);
        c6178.writeInt(iMax3);
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24883(int i, boolean z, int[] iArr) {
        if (i < 3) {
            return 0;
        }
        int i2 = (i % 2) + (i / 2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2 && i3 != 255; i5++) {
            int iAlpha = Color.alpha(iArr[z ? (i - 1) - i5 : i5]);
            if (iAlpha > i3) {
                i4 = i5;
                i3 = iAlpha;
            }
        }
        return i4;
    }
}
