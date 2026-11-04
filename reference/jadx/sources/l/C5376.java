package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5376 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f18856;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Rect f18857;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f18858;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f18860;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f18861;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f18862;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f18863 = new int[4];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f18859 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18864 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16060(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16065(String str) {
        int i;
        String strTrim = str.trim();
        String str2 = C7116.f23455;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (!str3.startsWith("palette: ")) {
                if (str3.startsWith("size: ")) {
                    String[] strArrSplit = str3.substring(6).trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        try {
                            this.f18856 = Integer.parseInt(strArrSplit[0]);
                            this.f18858 = Integer.parseInt(strArrSplit[1]);
                            this.f18861 = true;
                        } catch (RuntimeException e) {
                            C1896.m6514("Parsing IDX failed", e);
                        }
                    }
                }
            } else {
                String[] strArrSplit2 = str3.substring(9).split(",", -1);
                this.f18860 = new int[strArrSplit2.length];
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    int[] iArr = this.f18860;
                    try {
                        i = Integer.parseInt(strArrSplit2[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16066(C21287 c21287) {
        int[] iArr = this.f18860;
        if (iArr == null || !this.f18861) {
            return;
        }
        c21287.m48503(c21287.m48494() - 2);
        int iM48494 = c21287.m48494();
        while (c21287.m48516() < iM48494 && c21287.m48486() > 0) {
            int iM48493 = c21287.m48493();
            int[] iArr2 = this.f18863;
            switch (iM48493) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (c21287.m48486() < 2) {
                        return;
                    }
                    int iM48495 = c21287.m48493();
                    int iM48496 = c21287.m48493();
                    iArr2[3] = m16061(iM48495 >> 4, iArr);
                    iArr2[2] = m16061(iM48495 & 15, iArr);
                    iArr2[1] = m16061(iM48496 >> 4, iArr);
                    iArr2[0] = m16061(iM48496 & 15, iArr);
                    this.f18862 = true;
                    break;
                case 4:
                    if (c21287.m48486() < 2 || !this.f18862) {
                        return;
                    }
                    int iM48497 = c21287.m48493();
                    int iM48498 = c21287.m48493();
                    iArr2[3] = m16060(iArr2[3], iM48497 >> 4);
                    iArr2[2] = m16060(iArr2[2], iM48497 & 15);
                    iArr2[1] = m16060(iArr2[1], iM48498 >> 4);
                    iArr2[0] = m16060(iArr2[0], iM48498 & 15);
                    break;
                case 5:
                    if (c21287.m48486() < 6) {
                        return;
                    }
                    int iM48499 = c21287.m48493();
                    int iM484910 = c21287.m48493();
                    int i = (iM48499 << 4) | (iM484910 >> 4);
                    int iM484911 = ((iM484910 & 15) << 8) | c21287.m48493();
                    int iM484912 = c21287.m48493();
                    int iM484913 = c21287.m48493();
                    this.f18857 = new Rect(i, (iM484912 << 4) | (iM484913 >> 4), iM484911 + 1, (((iM484913 & 15) << 8) | c21287.m48493()) + 1);
                    break;
                case 6:
                    if (c21287.m48486() < 4) {
                        return;
                    }
                    this.f18859 = c21287.m48494();
                    this.f18864 = c21287.m48494();
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16061(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2137 m16063(C21287 c21287) {
        Rect rect;
        if (this.f18860 == null || !this.f18861 || !this.f18862 || (rect = this.f18857) == null || this.f18859 == -1 || this.f18864 == -1 || rect.width() < 2 || this.f18857.height() < 2) {
            return null;
        }
        Rect rect2 = this.f18857;
        int[] iArr = new int[rect2.height() * rect2.width()];
        C14573 c14573 = new C14573();
        c21287.m48510(this.f18859);
        c14573.m35155(c21287);
        m16062(c14573, true, rect2, iArr);
        c21287.m48510(this.f18864);
        c14573.m35155(c21287);
        m16062(c14573, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        C5866 c5866 = new C5866();
        c5866.m17077(bitmapCreateBitmap);
        c5866.m17086(rect2.left / this.f18856);
        c5866.m17088(0);
        c5866.m17075(rect2.top / this.f18858, 0);
        c5866.m17076(0);
        c5866.m17091(rect2.width() / this.f18856);
        c5866.m17074(rect2.height() / this.f18858);
        return c5866.m17073();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16062(C14573 c14573, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int iM35163 = 0;
                int i6 = 1;
                while (true) {
                    if (iM35163 >= i6 || i6 > 64) {
                        i = iM35163 & 3;
                        if (iM35163 >= 4) {
                            i2 = iM35163 >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (c14573.m35152() < 4) {
                        i2 = 0;
                        i = -1;
                        break;
                    } else {
                        iM35163 = (iM35163 << 4) | c14573.m35163(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.f18863[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            c14573.m35164();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16064() {
        this.f18862 = false;
        this.f18857 = null;
        this.f18859 = -1;
        this.f18864 = -1;
    }
}
