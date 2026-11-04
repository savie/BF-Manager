package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C21629 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f69058;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f69060;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f69061;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69062;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f69064;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f69065;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69066;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f69059 = new C21287();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f69063 = new int[256];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49165(C21629 c21629, C21287 c21287, int i) {
        c21629.getClass();
        if (i < 19) {
            return;
        }
        c21629.f69058 = c21287.m48494();
        c21629.f69060 = c21287.m48494();
        c21287.m48503(11);
        c21629.f69066 = c21287.m48494();
        c21629.f69064 = c21287.m48494();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m49164(C21629 c21629, C21287 c21287, int i) {
        int[] iArr = c21629.f69063;
        if (i % 5 != 2) {
            return;
        }
        c21287.m48503(2);
        Arrays.fill(iArr, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM48493 = c21287.m48493();
            int iM48494 = c21287.m48493();
            int iM48495 = c21287.m48493();
            int iM48496 = c21287.m48493();
            int iM48497 = c21287.m48493();
            double d = iM48494;
            double d2 = iM48495 + a.g;
            double d3 = iM48496 + a.g;
            iArr[iM48493] = (C7116.m19460((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (iM48497 << 24) | (C7116.m19460((int) ((1.402d * d2) + d), 0, 255) << 16) | C7116.m19460((int) ((d3 * 1.772d) + d), 0, 255);
        }
        c21629.f69062 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49163(C21629 c21629, C21287 c21287, int i) {
        int iM48501;
        C21287 c21288 = c21629.f69059;
        if (i < 4) {
            return;
        }
        c21287.m48503(3);
        int i2 = i - 4;
        if ((c21287.m48493() & 128) != 0) {
            if (i2 < 7 || (iM48501 = c21287.m48501()) < 4) {
                return;
            }
            c21629.f69061 = c21287.m48494();
            c21629.f69065 = c21287.m48494();
            c21288.m48496(iM48501 - 4);
            i2 = i - 11;
        }
        int iM48516 = c21288.m48516();
        int iM48509 = c21288.m48509();
        if (iM48516 >= iM48509 || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iM48509 - iM48516);
        c21287.m48490(iM48516, iMin, c21288.m48497());
        c21288.m48510(iM48516 + iMin);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2137 m49166() {
        int iM48493;
        if (this.f69058 == 0 || this.f69060 == 0 || this.f69061 == 0 || this.f69065 == 0) {
            return null;
        }
        C21287 c21287 = this.f69059;
        if (c21287.m48509() == 0 || c21287.m48516() != c21287.m48509() || !this.f69062) {
            return null;
        }
        c21287.m48510(0);
        int i = this.f69061 * this.f69065;
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iM48494 = c21287.m48493();
            int[] iArr2 = this.f69063;
            if (iM48494 != 0) {
                iM48493 = i2 + 1;
                iArr[i2] = iArr2[iM48494];
            } else {
                int iM48495 = c21287.m48493();
                if (iM48495 != 0) {
                    iM48493 = ((iM48495 & 64) == 0 ? iM48495 & 63 : ((iM48495 & 63) << 8) | c21287.m48493()) + i2;
                    Arrays.fill(iArr, i2, iM48493, (iM48495 & 128) == 0 ? iArr2[0] : iArr2[c21287.m48493()]);
                }
            }
            i2 = iM48493;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f69061, this.f69065, Bitmap.Config.ARGB_8888);
        C5866 c5866 = new C5866();
        c5866.m17077(bitmapCreateBitmap);
        c5866.m17086(this.f69066 / this.f69058);
        c5866.m17088(0);
        c5866.m17075(this.f69064 / this.f69060, 0);
        c5866.m17076(0);
        c5866.m17091(this.f69061 / this.f69058);
        c5866.m17074(this.f69065 / this.f69060);
        return c5866.m17073();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49167() {
        this.f69058 = 0;
        this.f69060 = 0;
        this.f69066 = 0;
        this.f69064 = 0;
        this.f69061 = 0;
        this.f69065 = 0;
        this.f69059.m48496(0);
        this.f69062 = false;
    }
}
