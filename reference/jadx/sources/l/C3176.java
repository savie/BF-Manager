package l;

import android.graphics.Canvas;

/* JADX INFO: renamed from: l.ۗۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8IQO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3176 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f10291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10292;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f10293;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f10295;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10297;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f10298;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f10299;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10300;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f10301;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13616 f10302;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f10303;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f10304;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f10294 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f10296 = new byte[0];

    public C3176(C13616 c13616, boolean z) {
        this.f10302 = c13616;
        this.f10301 = z;
        this.f10292 = Integer.toHexString(Math.max(c13616.f43254, c13616.f43257)).length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10367(long j) {
        return this.f10302.m33368(j, this.f10301);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10368(long j, boolean z) {
        int i;
        C13616 c13616 = this.f10302;
        boolean z2 = this.f10301;
        int i2 = z2 ? c13616.f43254 : c13616.f43257;
        int iM33367 = c13616.m33367(j);
        if (iM33367 < 0) {
            i = j < 0 ? 0 : i2;
        } else {
            C9141 c9141 = c13616.f43255.get(iM33367);
            i = (z2 ? c9141.f29713 : c9141.f29710) + (z2 ? c9141.f29708 : c9141.f29711);
        }
        if (!z) {
            i--;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10366(int i) {
        boolean zM10878 = C3296.m10878();
        if (i == 2) {
            return zM10878 ? -10735568 : -8739;
        }
        if (i == 3) {
            return zM10878 ? -14268108 : -2756388;
        }
        return zM10878 ? -13085328 : -3483142;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10369(Canvas canvas, C5171 c5171, int i, int i2, int i3, int i4) {
        C13616 c13616;
        C4933 c4933;
        long j;
        C3176 c3176;
        C3176 c3177 = this;
        int iMax = Math.max(0, i3 - i2);
        if (c3177.f10296.length != iMax || c3177.f10297 != i4) {
            c3177.f10296 = new byte[iMax];
            c3177.f10297 = i4;
            C13616 c13617 = c3177.f10302;
            long j2 = c13617.f43259;
            C4933 c4934 = c13617.f43256;
            long j3 = i4;
            long j4 = 1;
            long jMax = Math.max(1L, ((j2 + j3) - 1) / j3);
            int iMax2 = Math.max(1, Math.round(c5171.f18046 * 3.0f));
            int i5 = 0;
            while (i5 < iMax) {
                int i6 = i5 + 1;
                long j5 = (((long) i6) * jMax) - j4;
                long j6 = iMax;
                int i7 = iMax - iMax2;
                int iM15139 = (c4934 == null ? 0 : c4934.m15139(i5 >= i7 ? c13617.f43259 : (((j5 / j6) + 1) * j3) - 1, true, true)) - 1;
                if (iM15139 < 0) {
                    c13616 = c13617;
                    c4933 = c4934;
                    c3176 = c3177;
                    j = 1;
                } else {
                    C9141 c9141 = c13617.f43255.get(c4934.m15137(iM15139, true));
                    long j7 = c9141.f29709;
                    c13616 = c13617;
                    int i8 = i5;
                    c4933 = c4934;
                    j = 1;
                    int iMax3 = (int) ((((((j7 + ((long) Math.max(c9141.f29713, c9141.f29710))) + j3) - 1) / j3) * j6) / jMax);
                    int iMin = Math.min(Math.max(0, i7), (int) (((j7 / j3) * j6) / jMax));
                    int iMin2 = Math.min(iMax, Math.max(iMin + iMax2, iMax3));
                    if (i8 < iMin || i8 >= iMin2) {
                        c3176 = this;
                    } else {
                        c3176 = this;
                        c3176.f10296[i8] = (byte) c9141.f29707;
                    }
                }
                j4 = j;
                c3177 = c3176;
                i5 = i6;
                c4934 = c4933;
                c13617 = c13616;
            }
        }
        C3176 c3178 = c3177;
        C10232 c10232 = c5171.f18048;
        int i9 = 0;
        while (i9 < iMax) {
            int i10 = i9 + 1;
            while (i10 < iMax) {
                byte[] bArr = c3178.f10296;
                if (bArr[i10] != bArr[i9]) {
                    break;
                } else {
                    i10++;
                }
            }
            byte b = c3178.f10296[i9];
            if (b != 0) {
                c10232.setColor(b == 1 ? C3296.m10871(-12359283, -4666379) : m10366((int) b));
                float f = i;
                canvas.drawRect(f - c5171.f18021, i2 + i9, f, i2 + i10, c10232);
            }
            i9 = i10;
        }
    }
}
