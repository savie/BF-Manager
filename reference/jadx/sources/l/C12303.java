package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f39554;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f39555;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f39556;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12129 f39557;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f39558;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f39559;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f39560;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f39561;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f39562;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f39563;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f39564;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f39565;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f39566;

    public C12303(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i6, C12129 c12129) throws IOException {
        if (i6 < 0 || (i6 & (-32)) != 0) {
            throw new IOException("Invalid session view field mask");
        }
        this.f39559 = i6;
        if (i3 < 0 || i3 > 255 || i4 < -1 || i5 < -1) {
            throw new IOException("Invalid session view coordinates or wrap mode");
        }
        this.f39558 = i;
        this.f39566 = i2;
        this.f39562 = i3;
        this.f39561 = z;
        this.f39555 = z2;
        this.f39560 = z3;
        this.f39554 = i4;
        this.f39556 = i5;
        this.f39557 = c12129;
        if ((i6 & 2) == 0 && bArr.length != 0) {
            throw new IOException("Unexpected session text config");
        }
        if ((i6 & 8) != 0) {
            m30701(bArr2);
        } else if (bArr2.length != 0) {
            throw new IOException("Unexpected backward navigation stack");
        }
        if ((i6 & 16) != 0) {
            m30701(bArr3);
        } else if (bArr3.length != 0) {
            throw new IOException("Unexpected forward navigation stack");
        }
        this.f39565 = bArr;
        this.f39564 = bArr2;
        this.f39563 = bArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12303 m30698(int i, int i2, int i3, boolean z, boolean z2, boolean z3, C14540 c14540, C17853 c17853, C17853 c17854) {
        C6178 c6178 = new C6178();
        c14540.m35085(c6178);
        C6178 c6179 = new C6178();
        c17853.m41703(c6179);
        C6178 c61710 = new C6178();
        c17854.m41703(c61710);
        return new C12303(i, i2, i3, z, z2, z3, c14540.f45785, c14540.f45754, c6178.m17796(), c6179.m17796(), c61710.m17796(), 31, C12129.m30317(c14540));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12303 m30700(C3926 c3926) {
        int i = (c3926.f13393 ? 1 : 0) | (c3926.f13394 != null ? 2 : 0);
        boolean z = c3926.f13390;
        int i2 = i | (z ? 4 : 0) | (c3926.f13404 != null ? 8 : 0) | (c3926.f13398 != null ? 16 : 0);
        int i3 = c3926.f13406;
        int i4 = c3926.f13391;
        int i5 = c3926.f13396;
        boolean z2 = c3926.f13403;
        boolean z3 = c3926.f13392;
        boolean z4 = c3926.f13395;
        int i6 = z ? c3926.f13401 : -1;
        int i7 = z ? c3926.f13400 : -1;
        byte[] bArr = c3926.f13402;
        return new C12303(i3, i4, i5, z2, z3, z4, i6, i7, bArr == null ? new byte[0] : (byte[]) bArr.clone(), m30702(c3926.f13404), m30702(c3926.f13398), i2, c3926.f13394);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30706(String str) {
        return (this.f39559 & 2) == 0 ? str : this.f39557.m30318();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12303 m30713(String str) {
        if ((this.f39559 & 2) == 0) {
            return this;
        }
        byte[] bArr = this.f39565;
        C20348 c20348 = new C20348(bArr);
        c20348.m46756();
        C6178 c6178 = new C6178(bArr.length + 8);
        c6178.m17786((CharSequence) str);
        int iAvailable = (int) c20348.available();
        byte[] bArr2 = new byte[iAvailable];
        c20348.m46745(iAvailable, bArr2);
        c6178.write(bArr2, 0, iAvailable);
        return new C12303(this.f39558, this.f39566, this.f39562, this.f39561, this.f39555, this.f39560, this.f39554, this.f39556, c6178.m17796(), this.f39564, this.f39563, this.f39559, this.f39557.m30319(str, false));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12303 m30709(C12303 c12303) throws IOException {
        if ((c12303.f39559 & 3) != 3) {
            throw new IOException("Page switch requires captured current view settings");
        }
        int iMin = this.f39566;
        C12129 c12129 = this.f39557;
        if (c12129 != null) {
            float f = c12129.f38997;
            if (f > 0.0f) {
                float f2 = c12303.f39557.f38997;
                if (f2 > 0.0f) {
                    iMin = (int) Math.min(2147483647L, Math.round((((double) iMin) / ((double) f)) * ((double) f2)));
                }
            }
        }
        int i = c12303.f39562;
        boolean z = c12303.f39561;
        boolean z2 = c12303.f39555;
        boolean z3 = c12303.f39560;
        byte[] bArr = c12303.f39565;
        int i2 = this.f39559 | 3;
        C12129 c121210 = c12303.f39557;
        return new C12303(this.f39558, iMin, i, z, z2, z3, this.f39554, this.f39556, bArr, this.f39564, this.f39563, i2, c121210);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12303 m30708(int i, int i2, String str) throws IOException {
        int i3 = this.f39559;
        int i4 = i3 & 2;
        if (i4 == 0) {
            throw new IOException("Reload requires a captured current view config");
        }
        byte[] bArrM17796 = this.f39565;
        if (i4 != 0) {
            C20348 c20348 = new C20348(bArrM17796);
            c20348.m46756();
            C6178 c6178 = new C6178(bArrM17796.length + 8);
            c6178.m17786((CharSequence) str);
            byte[] bArr = new byte[11];
            c20348.m46745(11, bArr);
            c6178.write(bArr, 0, 11);
            c20348.m46753();
            c6178.writeByte(0);
            int iAvailable = (int) c20348.available();
            byte[] bArr2 = new byte[iAvailable];
            c20348.m46745(iAvailable, bArr2);
            c6178.write(bArr2, 0, iAvailable);
            bArrM17796 = c6178.m17796();
        }
        int i5 = i3 | 5;
        C12129 c12129M30319 = this.f39557.m30319(str, true);
        return new C12303(i, i2, this.f39562, this.f39561, this.f39555, this.f39560, -1, -1, bArrM17796, this.f39564, this.f39563, i5, c12129M30319);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30702(ArrayList arrayList) {
        if (arrayList == null) {
            return new byte[0];
        }
        C6178 c6178 = new C6178((arrayList.size() * 8) + 6);
        c6178.writeInt(-1568513661);
        c6178.mo17812(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17107 c17107 = (C17107) it.next();
            c6178.writeInt(c17107.f55832);
            c6178.writeInt(c17107.f55831);
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30714() {
        return (this.f39559 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m30712() {
        return (this.f39559 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12303 m30707(int i, int i2) {
        if (this.f39561 || i <= i2) {
            return this;
        }
        return new C12303(this.f39558, this.f39566, this.f39562, true, this.f39555, this.f39560, this.f39554, this.f39556, this.f39565, this.f39564, this.f39563, this.f39559, this.f39557);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12303 m30699(int i, byte[] bArr) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 47) {
            throw new IOException("Invalid session view state length");
        }
        try {
            C20348 c20348 = new C20348(bArr);
            if (c20348.readInt() != 844519237) {
                throw new IOException("Unsupported session view state");
            }
            int i2 = c20348.readInt();
            if (i2 != 1 && i2 != 2) {
                throw new IOException("Unsupported session view state");
            }
            int i3 = i2 == 2 ? c20348.readInt() : 31;
            int i4 = c20348.readInt();
            int i5 = c20348.readInt();
            int i6 = c20348.readInt();
            boolean zM30704 = m30704(c20348);
            boolean zM30705 = m30704(c20348);
            boolean zM30706 = m30704(c20348);
            int i7 = c20348.readInt();
            int i8 = c20348.readInt();
            byte[] bArrM30703 = m30703(c20348);
            byte[] bArrM30704 = m30703(c20348);
            byte[] bArrM30705 = m30703(c20348);
            if (c20348.available() == 4 && c20348.readInt() == 844519237) {
                return new C12303(i4, i5, i6, zM30704, zM30705, zM30706, i7, i8, bArrM30703, bArrM30704, bArrM30705, i3, (i3 & 2) != 0 ? C12129.m30316(new ByteArrayInputStream(bArrM30703), bArrM30703.length, bArrM30703.length) : null);
            }
            throw new IOException("Trailing or truncated session view state");
        } catch (IndexOutOfBoundsException e) {
            throw new IOException("Truncated session view state", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30710(C6178 c6178) {
        c6178.writeInt(844519237);
        int i = this.f39559;
        c6178.writeInt(i == 31 ? 1 : 2);
        if (i != 31) {
            c6178.writeInt(i);
        }
        c6178.writeInt(this.f39558);
        c6178.writeInt(this.f39566);
        c6178.writeInt(this.f39562);
        c6178.m17789(this.f39561);
        c6178.m17789(this.f39555);
        c6178.m17789(this.f39560);
        c6178.writeInt(this.f39554);
        c6178.writeInt(this.f39556);
        c6178.m17806(this.f39565);
        c6178.m17806(this.f39564);
        c6178.m17806(this.f39563);
        c6178.writeInt(844519237);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m30705() {
        return (this.f39559 == 31 ? 47L : 51L) + ((long) this.f39565.length) + ((long) this.f39564.length) + ((long) this.f39563.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30711(C17853 c17853, C17853 c17854) {
        int i = this.f39559;
        if ((i & 8) != 0) {
            c17853.m41705(new C20348(this.f39564));
        }
        if ((i & 16) != 0) {
            c17854.m41705(new C20348(this.f39563));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30703(C20348 c20348) throws IOException {
        if (c20348.available() < 4) {
            throw new IOException("Missing session view field");
        }
        int i = c20348.readInt();
        if (i < 0 || i > c20348.available()) {
            throw new IOException("Invalid session view field length");
        }
        byte[] bArr = new byte[i];
        c20348.m46745(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m30704(C20348 c20348) throws IOException {
        int i = c20348.readByte() & 255;
        if (i == 0 || i == 255) {
            return i != 0;
        }
        throw new IOException("Invalid session view flag");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30701(byte[] bArr) throws IOException {
        if (bArr.length < 6) {
            throw new IOException("Truncated session navigation stack");
        }
        C20348 c20348 = new C20348(bArr);
        if (c20348.readInt() != -1568513661 || ((long) c20348.m46749()) * 8 != c20348.available()) {
            throw new IOException("Invalid session navigation stack");
        }
    }
}
