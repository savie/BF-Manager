package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes4.dex */
public final class C20753 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f67513;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f67515;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Rect f67516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f67517;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f67519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f67521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f67520 = new int[4];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f67518 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f67514 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46752(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46757(String str) {
        int i;
        String strTrim = str.trim();
        String str2 = C17983.f57504;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (!str3.startsWith("palette: ")) {
                if (str3.startsWith("size: ")) {
                    String[] strArrSplit = str3.substring(6).trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        try {
                            this.f67515 = Integer.parseInt(strArrSplit[0]);
                            this.f67519 = Integer.parseInt(strArrSplit[1]);
                            this.f67521 = true;
                        } catch (RuntimeException e) {
                            C0303.m1852("Parsing IDX failed", e);
                        }
                    }
                }
            } else {
                String[] strArrSplit2 = str3.substring(9).split(",", -1);
                this.f67513 = new int[strArrSplit2.length];
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    int[] iArr = this.f67513;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46758(C2460 c2460) {
        int[] iArr = this.f67513;
        if (iArr == null || !this.f67521) {
            return;
        }
        c2460.m7535(c2460.m7519() - 2);
        int iM7519 = c2460.m7519();
        while (c2460.m7500() < iM7519 && c2460.m7503() > 0) {
            int iM7516 = c2460.m7516();
            int[] iArr2 = this.f67520;
            switch (iM7516) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (c2460.m7503() < 2) {
                        return;
                    }
                    int iM7517 = c2460.m7516();
                    int iM7518 = c2460.m7516();
                    iArr2[3] = m46753(iM7517 >> 4, iArr);
                    iArr2[2] = m46753(iM7517 & 15, iArr);
                    iArr2[1] = m46753(iM7518 >> 4, iArr);
                    iArr2[0] = m46753(iM7518 & 15, iArr);
                    this.f67517 = true;
                    break;
                case 4:
                    if (c2460.m7503() < 2 || !this.f67517) {
                        return;
                    }
                    int iM75110 = c2460.m7516();
                    int iM75111 = c2460.m7516();
                    iArr2[3] = m46752(iArr2[3], iM75110 >> 4);
                    iArr2[2] = m46752(iArr2[2], iM75110 & 15);
                    iArr2[1] = m46752(iArr2[1], iM75111 >> 4);
                    iArr2[0] = m46752(iArr2[0], iM75111 & 15);
                    break;
                case 5:
                    if (c2460.m7503() < 6) {
                        return;
                    }
                    int iM75112 = c2460.m7516();
                    int iM75113 = c2460.m7516();
                    int i = (iM75112 << 4) | (iM75113 >> 4);
                    int iM75114 = ((iM75113 & 15) << 8) | c2460.m7516();
                    int iM75115 = c2460.m7516();
                    int iM75116 = c2460.m7516();
                    this.f67516 = new Rect(i, (iM75115 << 4) | (iM75116 >> 4), iM75114 + 1, (((iM75116 & 15) << 8) | c2460.m7516()) + 1);
                    break;
                case 6:
                    if (c2460.m7503() < 4) {
                        return;
                    }
                    this.f67518 = c2460.m7519();
                    this.f67514 = c2460.m7519();
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46753(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0612 m46755(C2460 c2460) {
        Rect rect;
        if (this.f67513 == null || !this.f67521 || !this.f67517 || (rect = this.f67516) == null || this.f67518 == -1 || this.f67514 == -1 || rect.width() < 2 || this.f67516.height() < 2) {
            return null;
        }
        Rect rect2 = this.f67516;
        int[] iArr = new int[rect2.height() * rect2.width()];
        C11634 c11634 = new C11634();
        c2460.m7510(this.f67518);
        c11634.m29033(c2460);
        m46754(c11634, true, rect2, iArr);
        c2460.m7510(this.f67514);
        c11634.m29033(c2460);
        m46754(c11634, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        C20369 c20369 = new C20369();
        c20369.m46000(bitmapCreateBitmap);
        c20369.m46009(rect2.left / this.f67515);
        c20369.m46011(0);
        c20369.m45998(rect2.top / this.f67519, 0);
        c20369.m45999(0);
        c20369.m45994(rect2.width() / this.f67515);
        c20369.m45997(rect2.height() / this.f67519);
        return c20369.m45996();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46754(C11634 c11634, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int iM29039 = 0;
                int i6 = 1;
                while (true) {
                    if (iM29039 >= i6 || i6 > 64) {
                        i = iM29039 & 3;
                        if (iM29039 >= 4) {
                            i2 = iM29039 >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (c11634.m29030() < 4) {
                        i2 = 0;
                        i = -1;
                        break;
                    } else {
                        iM29039 = (iM29039 << 4) | c11634.m29039(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.f67520[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            c11634.m29040();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46756() {
        this.f67517 = false;
        this.f67516 = null;
        this.f67518 = -1;
        this.f67514 = -1;
    }
}
