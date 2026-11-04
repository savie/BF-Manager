package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U6T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9475 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30700;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f30701;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30702;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f30703;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f30704;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f30705;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f30706;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f30707;

    public C9475(boolean z, boolean z2, boolean z3, int i, int i2, int i3, String str, HashMap map) {
        this.f30704 = z;
        this.f30707 = z2;
        this.f30705 = z3;
        this.f30701 = i;
        this.f30702 = i2;
        this.f30703 = i3;
        this.f30700 = str;
        this.f30706 = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9475 m24858(int i, long j, InputStream inputStream) throws IOException {
        C16475 c16475M39088 = C16475.m39088(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy parameters exceed app state limit");
            }
            if (!c16475M39088.m39096()) {
                c16475M39088.m39099();
                C9475 c9475 = new C9475(false, false, false, 0, 0, 0, null, null);
                c16475M39088.close();
                return c9475;
            }
            int i2 = c16475M39088.readByte();
            int iM39097 = c16475M39088.m39097();
            boolean zM39096 = c16475M39088.m39096();
            c16475M39088.readByte();
            int i3 = c16475M39088.readInt();
            String strM39102 = c16475M39088.m39096() ? c16475M39088.m39102(i) : null;
            boolean zM39097 = c16475M39088.m39096();
            int i4 = c16475M39088.readInt();
            if (i4 < 0 || i4 > c16475M39088.m39101() / ((long) 20)) {
                throw new IOException("Invalid legacy attribute count");
            }
            HashMap map = new HashMap();
            int i5 = 0;
            while (i5 < i4) {
                String strM39098 = c16475M39088.m39098(i);
                int i6 = c16475M39088.readInt();
                int i7 = c16475M39088.readInt();
                String strM39099 = c16475M39088.m39098(i);
                int i8 = c16475M39088.readInt();
                if (i8 >= 0) {
                    boolean z = zM39097;
                    if (i8 <= c16475M39088.m39101() / ((long) 12)) {
                        C13786[] c13786Arr = new C13786[i8];
                        int i9 = 0;
                        while (i9 < i8) {
                            c13786Arr[i9] = new C13786(c16475M39088.readInt(), c16475M39088.readInt(), c16475M39088.m39098(i));
                            i9++;
                            i4 = i4;
                            i8 = i8;
                        }
                        map.put(strM39098, new C2600(i6, strM39099, c13786Arr, i7));
                        i5++;
                        zM39097 = z;
                        i4 = i4;
                    }
                }
                throw new IOException("Invalid legacy attribute count");
            }
            c16475M39088.m39099();
            C9475 c9476 = new C9475(true, zM39097, zM39096, i2, iM39097, i3, strM39102, map);
            c16475M39088.close();
            return c9476;
        } catch (Throwable th) {
            try {
                c16475M39088.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23056 m24859() {
        C21246 c21246 = null;
        if (!this.f30704) {
            return null;
        }
        String str = this.f30700;
        AbstractC22044 abstractC22044M35193 = str == null ? null : C14584.m35193(str, new String[0]);
        if (this.f30707) {
            if (abstractC22044M35193 != null && abstractC22044M35193.mo2934()) {
                try {
                    C21246 c21247 = new C21246(abstractC22044M35193);
                    c21247.m48431();
                    c21246 = c21247;
                } catch (Throwable unused) {
                }
            }
            if (c21246 == null) {
                c21246 = new C21246();
            }
        }
        return new C23056(this.f30701, this.f30702, this.f30705, this.f30703, abstractC22044M35193, c21246, this.f30706);
    }
}
