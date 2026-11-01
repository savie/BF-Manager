package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13698 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f45178;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f45179;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f45180;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45182;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f45183;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f45184;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45185;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f45181 = new C2460();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f45186 = new int[256];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m33402(C13698 c13698, C2460 c2460, int i) {
        c13698.getClass();
        if (i < 19) {
            return;
        }
        c13698.f45180 = c2460.m7519();
        c13698.f45184 = c2460.m7519();
        c2460.m7535(11);
        c13698.f45179 = c2460.m7519();
        c13698.f45182 = c2460.m7519();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m33401(C13698 c13698, C2460 c2460, int i) {
        int[] iArr = c13698.f45186;
        if (i % 5 != 2) {
            return;
        }
        c2460.m7535(2);
        Arrays.fill(iArr, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM7516 = c2460.m7516();
            int iM7517 = c2460.m7516();
            int iM7518 = c2460.m7516();
            int iM7519 = c2460.m7516();
            int iM75110 = c2460.m7516();
            double d = iM7517;
            double d2 = iM7518 + a.g;
            double d3 = iM7519 + a.g;
            iArr[iM7516] = (C17983.m41813((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (iM75110 << 24) | (C17983.m41813((int) ((1.402d * d2) + d), 0, 255) << 16) | C17983.m41813((int) ((d3 * 1.772d) + d), 0, 255);
        }
        c13698.f45178 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33400(C13698 c13698, C2460 c2460, int i) {
        int iM7525;
        C2460 c2461 = c13698.f45181;
        if (i < 4) {
            return;
        }
        c2460.m7535(3);
        int i2 = i - 4;
        if ((c2460.m7516() & 128) != 0) {
            if (i2 < 7 || (iM7525 = c2460.m7525()) < 4) {
                return;
            }
            c13698.f45183 = c2460.m7519();
            c13698.f45185 = c2460.m7519();
            c2461.m7517(iM7525 - 4);
            i2 = i - 11;
        }
        int iM7500 = c2461.m7500();
        int iM7509 = c2461.m7509();
        if (iM7500 >= iM7509 || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iM7509 - iM7500);
        c2460.m7507(iM7500, iMin, c2461.m7518());
        c2461.m7510(iM7500 + iMin);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0612 m33403() {
        int iM7516;
        if (this.f45180 == 0 || this.f45184 == 0 || this.f45183 == 0 || this.f45185 == 0) {
            return null;
        }
        C2460 c2460 = this.f45181;
        if (c2460.m7509() == 0 || c2460.m7500() != c2460.m7509() || !this.f45178) {
            return null;
        }
        c2460.m7510(0);
        int i = this.f45183 * this.f45185;
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iM7517 = c2460.m7516();
            int[] iArr2 = this.f45186;
            if (iM7517 != 0) {
                iM7516 = i2 + 1;
                iArr[i2] = iArr2[iM7517];
            } else {
                int iM7518 = c2460.m7516();
                if (iM7518 != 0) {
                    iM7516 = ((iM7518 & 64) == 0 ? iM7518 & 63 : ((iM7518 & 63) << 8) | c2460.m7516()) + i2;
                    Arrays.fill(iArr, i2, iM7516, (iM7518 & 128) == 0 ? iArr2[0] : iArr2[c2460.m7516()]);
                }
            }
            i2 = iM7516;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f45183, this.f45185, Bitmap.Config.ARGB_8888);
        C20369 c20369 = new C20369();
        c20369.m46000(bitmapCreateBitmap);
        c20369.m46009(this.f45179 / this.f45180);
        c20369.m46011(0);
        c20369.m45998(this.f45182 / this.f45184, 0);
        c20369.m45999(0);
        c20369.m45994(this.f45183 / this.f45180);
        c20369.m45997(this.f45185 / this.f45184);
        return c20369.m45996();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33404() {
        this.f45180 = 0;
        this.f45184 = 0;
        this.f45179 = 0;
        this.f45182 = 0;
        this.f45183 = 0;
        this.f45185 = 0;
        this.f45181.m7517(0);
        this.f45178 = false;
    }
}
