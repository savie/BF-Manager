package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23853 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f77111;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f77112;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f77113;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f77114;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f77115;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f77116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f77117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f77118;

    public C23853(boolean z, boolean z2, boolean z3, int i, int i2, int i3, String str, HashMap map) {
        this.f77118 = z;
        this.f77112 = z2;
        this.f77114 = z3;
        this.f77116 = i;
        this.f77115 = i2;
        this.f77111 = i3;
        this.f77113 = str;
        this.f77117 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23853 m52577(int i, long j, InputStream inputStream) throws IOException {
        C0757 c0757M3260 = C0757.m3260(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy parameters exceed app state limit");
            }
            if (!c0757M3260.m3267()) {
                c0757M3260.m3263();
                C23853 c23853 = new C23853(false, false, false, 0, 0, 0, null, null);
                c0757M3260.close();
                return c23853;
            }
            int i2 = c0757M3260.readByte();
            int iM3272 = c0757M3260.m3272();
            boolean zM3267 = c0757M3260.m3267();
            c0757M3260.readByte();
            int i3 = c0757M3260.readInt();
            String strM3270 = c0757M3260.m3267() ? c0757M3260.m3270(i) : null;
            boolean zM3268 = c0757M3260.m3267();
            int i4 = c0757M3260.readInt();
            if (i4 < 0 || i4 > c0757M3260.m3268() / ((long) 20)) {
                throw new IOException("Invalid legacy attribute count");
            }
            HashMap map = new HashMap();
            int i5 = 0;
            while (i5 < i4) {
                String strM3269 = c0757M3260.m3269(i);
                int i6 = c0757M3260.readInt();
                int i7 = c0757M3260.readInt();
                String strM32610 = c0757M3260.m3269(i);
                int i8 = c0757M3260.readInt();
                if (i8 >= 0) {
                    boolean z = zM3268;
                    if (i8 <= c0757M3260.m3268() / ((long) 12)) {
                        C21996[] c21996Arr = new C21996[i8];
                        int i9 = 0;
                        while (i9 < i8) {
                            c21996Arr[i9] = new C21996(c0757M3260.readInt(), c0757M3260.readInt(), c0757M3260.m3269(i));
                            i9++;
                            i4 = i4;
                            i8 = i8;
                        }
                        map.put(strM3269, new C11413(i6, strM32610, c21996Arr, i7));
                        i5++;
                        zM3268 = z;
                        i4 = i4;
                    }
                }
                throw new IOException("Invalid legacy attribute count");
            }
            c0757M3260.m3263();
            C23853 c23854 = new C23853(true, zM3268, zM3267, i2, iM3272, i3, strM3270, map);
            c0757M3260.close();
            return c23854;
        } catch (Throwable th) {
            try {
                c0757M3260.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2063 m52578() {
        C6037 c6037 = null;
        if (!this.f77118) {
            return null;
        }
        String str = this.f77113;
        AbstractC20745 abstractC20745M15313 = str == null ? null : C5553.m15313(str, new String[0]);
        if (this.f77112) {
            if (abstractC20745M15313 != null && abstractC20745M15313.mo33975()) {
                try {
                    C6037 c6038 = new C6037(abstractC20745M15313);
                    c6038.m16376();
                    c6037 = c6038;
                } catch (Throwable unused) {
                }
            }
            if (c6037 == null) {
                c6037 = new C6037();
            }
        }
        return new C2063(this.f77116, this.f77115, this.f77114, this.f77111, abstractC20745M15313, c6037, this.f77117);
    }
}
