package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3858 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20232 m11179(AbstractC1886 abstractC1886, C20937 c20937, C0745 c0745, long j, C9505 c9505, InterfaceC5614 interfaceC5614, C0475 c0475) throws C10354 {
        C11338 c11338 = c20937.f68252;
        C14588 c14588 = c20937.f68245;
        int i = c11338.f38258;
        int i2 = c11338.f38250;
        Rect rect = new Rect(0, 0, i, i2);
        long jMin = Math.min(j, c0745.m3238());
        int i3 = 1;
        while (i3 > 0 && i3 <= 1073741824) {
            AbstractC1886.m6135(interfaceC5614);
            int iM39173 = (int) C16704.m39173(c11338.f38258, i3);
            int iM39174 = (int) C16704.m39173(i2, i3);
            long j2 = ((long) iM39173) * ((long) iM39174);
            long j3 = 4 * j2;
            c0475.getClass();
            int i4 = i2;
            if (iM39173 <= 2048 && iM39174 <= 2048 && j2 <= 4194304 && j3 <= jMin) {
                if (c9505 != null) {
                    try {
                        return c9505.m24342(rect, i3, c0745, interfaceC5614);
                    } catch (C10354 e) {
                        if (iM39173 == 1 && iM39174 == 1) {
                            throw e;
                        }
                    }
                } else {
                    C20502 c20502M3239 = c0745.m3239(c11338.m28419(false) + j3 + j3);
                    if (c20502M3239 != null) {
                        Bitmap bitmapM6733 = null;
                        try {
                            abstractC1886.m6137(c14588);
                            InputStream inputStreamMo5285 = abstractC1886.mo5285();
                            try {
                                c11338.m28420(C2164.m6735(inputStreamMo5285));
                                bitmapM6733 = C2164.m6733(inputStreamMo5285, c11338, rect, i3, interfaceC5614);
                                if (inputStreamMo5285 != null) {
                                    inputStreamMo5285.close();
                                }
                                abstractC1886.m6137(c14588);
                                AbstractC1886.m6135(interfaceC5614);
                                if (!c20502M3239.m46302(bitmapM6733.getAllocationByteCount())) {
                                    throw new C10354("TGA preview allocation exceeds budget");
                                }
                                return new C20232(bitmapM6733, c20502M3239, i3);
                            } catch (Throwable th) {
                                if (inputStreamMo5285 == null) {
                                    throw th;
                                }
                                try {
                                    inputStreamMo5285.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (bitmapM6733 != null) {
                                bitmapM6733.recycle();
                            }
                            c20502M3239.close();
                            throw th3;
                        }
                    }
                    if (iM39173 == 1 && iM39174 == 1) {
                        break;
                    }
                }
            }
            i3 *= 2;
            i2 = i4;
        }
        throw new C10354("TGA preview does not fit bitmap budget");
    }
}
