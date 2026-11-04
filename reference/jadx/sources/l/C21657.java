package l;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.᩶᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JK */
/* JADX INFO: loaded from: classes.dex */
public final class C21657 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8299 m49196(AbstractC13057 abstractC13057, C9044 c9044, C2442 c2442, long j, C10226 c10226, InterfaceC7509 interfaceC7509, C6808 c6808) throws C18740 {
        String str = c9044.f29436;
        C15294 c15294 = c9044.f29430;
        C6808 c6808M18988 = c6808.m18988(str, c9044.f29435);
        C1137 c1137 = c9044.f29432;
        int i = c1137.f4225;
        int i2 = c1137.f4228;
        Rect rect = new Rect(0, 0, i, i2);
        long jMin = Math.min(j, c2442.m8241());
        int i3 = 1;
        while (i3 > 0 && i3 <= 1073741824) {
            AbstractC13057.m32543(interfaceC7509);
            int iM33203 = (int) C13519.m33203(c1137.f4225, i3);
            int iM33204 = (int) C13519.m33203(i2, i3);
            long j2 = ((long) iM33203) * ((long) iM33204);
            long j3 = 4 * j2;
            c6808M18988.getClass();
            int i4 = i2;
            if (iM33203 <= 2048 && iM33204 <= 2048 && j2 <= 4194304 && j3 <= jMin) {
                if (c10226 != null) {
                    try {
                        return c10226.m26363(rect, i3, c2442, interfaceC7509);
                    } catch (C18740 e) {
                        if (iM33203 == 1 && iM33204 == 1) {
                            throw e;
                        }
                    }
                } else {
                    C9153 c9153M8242 = c2442.m8242(j3 + c1137.m4212(false) + j3);
                    if (c9153M8242 != null) {
                        Bitmap bitmapM23098 = null;
                        try {
                            abstractC13057.m32544(c15294);
                            C0841 c0841M33207 = C13519.m33207(abstractC13057, c6808M18988);
                            try {
                                c1137.m4213(C8594.m23099(c6808M18988.f22674, c0841M33207));
                                bitmapM23098 = C8594.m23098(c0841M33207, c1137, rect, i3, c6808M18988.f22673, interfaceC7509);
                                c0841M33207.close();
                                abstractC13057.m32544(c15294);
                                AbstractC13057.m32543(interfaceC7509);
                                if (!c9153M8242.m24288(bitmapM23098.getAllocationByteCount())) {
                                    throw new C18740("TGA preview allocation exceeds budget");
                                }
                                return new C8299(bitmapM23098, c9153M8242, i3);
                            } catch (Throwable th) {
                                try {
                                    c0841M33207.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (bitmapM23098 != null) {
                                bitmapM23098.recycle();
                            }
                            c9153M8242.close();
                            throw th3;
                        }
                    }
                    if (iM33203 == 1 && iM33204 == 1) {
                        break;
                    }
                }
            }
            i3 *= 2;
            i2 = i4;
        }
        throw new C18740("TGA preview does not fit bitmap budget");
    }
}
