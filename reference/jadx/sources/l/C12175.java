package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12175 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f40742;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f40743;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f40744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f40745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f40746;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f40747;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17256 f40748;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f40749;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f40750;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f40751;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f40752;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f40753;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f40754;

    public C12175(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i6) throws IOException {
        if (i6 < 0 || (i6 & (-32)) != 0) {
            throw new IOException("Invalid session view field mask");
        }
        this.f40742 = i6;
        if (i3 < 0 || i3 > 255 || i4 < -1 || i5 < -1) {
            throw new IOException("Invalid session view coordinates or wrap mode");
        }
        this.f40747 = i;
        this.f40754 = i2;
        this.f40752 = i3;
        this.f40751 = z;
        this.f40745 = z2;
        this.f40753 = z3;
        this.f40744 = i4;
        this.f40749 = i5;
        int i7 = i6 & 2;
        this.f40748 = i7 != 0 ? C17256.m40217(new ByteArrayInputStream(bArr), bArr.length, bArr.length) : null;
        if (i7 == 0 && bArr.length != 0) {
            throw new IOException("Unexpected session text config");
        }
        if ((i6 & 8) != 0) {
            m30263(bArr2);
        } else if (bArr2.length != 0) {
            throw new IOException("Unexpected backward navigation stack");
        }
        if ((i6 & 16) != 0) {
            m30263(bArr3);
        } else if (bArr3.length != 0) {
            throw new IOException("Unexpected forward navigation stack");
        }
        this.f40743 = bArr;
        this.f40750 = bArr2;
        this.f40746 = bArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12175 m30260(int i, int i2, int i3, boolean z, boolean z2, boolean z3, C1590 c1590, C19892 c19892, C19892 c19893) {
        C11018 c11018 = new C11018();
        c1590.m5426(c11018);
        C11018 c11019 = new C11018();
        c19892.m45152(c11019);
        C11018 c110110 = new C11018();
        c19893.m45152(c110110);
        return new C12175(i, i2, i3, z, z2, z3, c1590.f6392, c1590.f6400, c11018.m27773(), c11019.m27773(), c110110.m27773(), 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12175 m30262(C23607 c23607) {
        int i = (c23607.f76482 ? 1 : 0) | (c23607.f76481 != null ? 2 : 0);
        boolean z = c23607.f76475;
        int i2 = i | (z ? 4 : 0) | (c23607.f76483 != null ? 8 : 0) | (c23607.f76489 != null ? 16 : 0);
        int i3 = c23607.f76486;
        int i4 = c23607.f76479;
        int i5 = c23607.f76480;
        boolean z2 = c23607.f76487;
        boolean z3 = c23607.f76476;
        boolean z4 = c23607.f76478;
        int i6 = z ? c23607.f76488 : -1;
        int i7 = z ? c23607.f76484 : -1;
        byte[] bArr = c23607.f76477;
        return new C12175(i3, i4, i5, z2, z3, z4, i6, i7, bArr == null ? new byte[0] : (byte[]) bArr.clone(), m30264(c23607.f76483), m30264(c23607.f76489), i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30268(String str) {
        return (this.f40742 & 2) == 0 ? str : new C17367(this.f40743).m40442();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12175 m30275(String str) {
        if ((this.f40742 & 2) == 0) {
            return this;
        }
        byte[] bArr = this.f40743;
        C17367 c17367 = new C17367(bArr);
        c17367.m40442();
        C11018 c11018 = new C11018(bArr.length + 8);
        c11018.m27782((CharSequence) str);
        int iAvailable = (int) c17367.available();
        byte[] bArr2 = new byte[iAvailable];
        c17367.m40446(iAvailable, bArr2);
        c11018.write(bArr2, 0, iAvailable);
        return new C12175(this.f40747, this.f40754, this.f40752, this.f40751, this.f40745, this.f40753, this.f40744, this.f40749, c11018.m27773(), this.f40750, this.f40746, this.f40742);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12175 m30271(C12175 c12175) throws IOException {
        if ((c12175.f40742 & 3) != 3) {
            throw new IOException("Page switch requires captured current view settings");
        }
        int iMin = this.f40754;
        C17256 c17256 = this.f40748;
        if (c17256 != null) {
            float f = c17256.f54986;
            if (f > 0.0f) {
                float f2 = c12175.f40748.f54986;
                if (f2 > 0.0f) {
                    iMin = (int) Math.min(2147483647L, Math.round((((double) iMin) / ((double) f)) * ((double) f2)));
                }
            }
        }
        int i = c12175.f40752;
        boolean z = c12175.f40751;
        boolean z2 = c12175.f40745;
        boolean z3 = c12175.f40753;
        byte[] bArr = c12175.f40743;
        int i2 = this.f40742 | 3;
        return new C12175(this.f40747, iMin, i, z, z2, z3, this.f40744, this.f40749, bArr, this.f40750, this.f40746, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12175 m30270(int i, int i2, String str) throws IOException {
        int i3 = this.f40742;
        int i4 = i3 & 2;
        if (i4 == 0) {
            throw new IOException("Reload requires a captured current view config");
        }
        byte[] bArrM27773 = this.f40743;
        if (i4 != 0) {
            C17367 c17367 = new C17367(bArrM27773);
            c17367.m40442();
            C11018 c11018 = new C11018(bArrM27773.length + 8);
            c11018.m27782((CharSequence) str);
            byte[] bArr = new byte[11];
            c17367.m40446(11, bArr);
            c11018.write(bArr, 0, 11);
            c17367.m40461();
            c11018.writeByte(0);
            int iAvailable = (int) c17367.available();
            byte[] bArr2 = new byte[iAvailable];
            c17367.m40446(iAvailable, bArr2);
            c11018.write(bArr2, 0, iAvailable);
            bArrM27773 = c11018.m27773();
        }
        return new C12175(i, i2, this.f40752, this.f40751, this.f40745, this.f40753, -1, -1, bArrM27773, this.f40750, this.f40746, i3 | 5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30264(ArrayList arrayList) {
        if (arrayList == null) {
            return new byte[0];
        }
        C11018 c11018 = new C11018((arrayList.size() * 8) + 6);
        c11018.writeInt(-1568513661);
        c11018.mo24508(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15659 c15659 = (C15659) it.next();
            c11018.writeInt(c15659.f50867);
            c11018.writeInt(c15659.f50866);
        }
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m30276() {
        return (this.f40742 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m30274() {
        return (this.f40742 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12175 m30269(int i, int i2) {
        if (this.f40751 || i <= i2) {
            return this;
        }
        return new C12175(this.f40747, this.f40754, this.f40752, true, this.f40745, this.f40753, this.f40744, this.f40749, this.f40743, this.f40750, this.f40746, this.f40742);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12175 m30261(int i, byte[] bArr) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 47) {
            throw new IOException("Invalid session view state length");
        }
        try {
            C17367 c17367 = new C17367(bArr);
            if (c17367.readInt() != 844519237) {
                throw new IOException("Unsupported session view state");
            }
            int i2 = c17367.readInt();
            if (i2 != 1 && i2 != 2) {
                throw new IOException("Unsupported session view state");
            }
            int i3 = i2 == 2 ? c17367.readInt() : 31;
            int i4 = c17367.readInt();
            int i5 = c17367.readInt();
            int i6 = c17367.readInt();
            boolean zM30266 = m30266(c17367);
            boolean zM30267 = m30266(c17367);
            boolean zM30268 = m30266(c17367);
            int i7 = c17367.readInt();
            int i8 = c17367.readInt();
            byte[] bArrM30265 = m30265(c17367);
            byte[] bArrM30266 = m30265(c17367);
            byte[] bArrM30267 = m30265(c17367);
            if (c17367.available() != 4 || c17367.readInt() != 844519237) {
                throw new IOException("Trailing or truncated session view state");
            }
            return new C12175(i4, i5, i6, zM30266, zM30267, zM30268, i7, i8, bArrM30265, bArrM30266, bArrM30267, i3);
        } catch (IndexOutOfBoundsException e) {
            throw new IOException("Truncated session view state", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30272(C11018 c11018) {
        c11018.writeInt(844519237);
        int i = this.f40742;
        c11018.writeInt(i == 31 ? 1 : 2);
        if (i != 31) {
            c11018.writeInt(i);
        }
        c11018.writeInt(this.f40747);
        c11018.writeInt(this.f40754);
        c11018.writeInt(this.f40752);
        c11018.m27784(this.f40751);
        c11018.m27784(this.f40745);
        c11018.m27784(this.f40753);
        c11018.writeInt(this.f40744);
        c11018.writeInt(this.f40749);
        c11018.m27794(this.f40743);
        c11018.m27794(this.f40750);
        c11018.m27794(this.f40746);
        c11018.writeInt(844519237);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m30267() {
        return (this.f40742 == 31 ? 47L : 51L) + ((long) this.f40743.length) + ((long) this.f40750.length) + ((long) this.f40746.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30273(C19892 c19892, C19892 c19893) {
        int i = this.f40742;
        if ((i & 8) != 0) {
            c19892.m45154(new C17367(this.f40750));
        }
        if ((i & 16) != 0) {
            c19893.m45154(new C17367(this.f40746));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30265(C17367 c17367) throws IOException {
        if (c17367.available() < 4) {
            throw new IOException("Missing session view field");
        }
        int i = c17367.readInt();
        if (i < 0 || i > c17367.available()) {
            throw new IOException("Invalid session view field length");
        }
        byte[] bArr = new byte[i];
        c17367.m40446(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m30266(C17367 c17367) throws IOException {
        int i = c17367.readByte() & 255;
        if (i == 0 || i == 255) {
            return i != 0;
        }
        throw new IOException("Invalid session view flag");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30263(byte[] bArr) throws IOException {
        if (bArr.length < 6) {
            throw new IOException("Truncated session navigation stack");
        }
        C17367 c17367 = new C17367(bArr);
        if (c17367.readInt() != -1568513661 || ((long) c17367.m40462()) * 8 != c17367.available()) {
            throw new IOException("Invalid session navigation stack");
        }
    }
}
