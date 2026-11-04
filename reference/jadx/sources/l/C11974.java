package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۧ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S978 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11974 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f38544;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f38545;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38546;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f38547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38548;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f38549;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13921 f38540 = new C13921(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f38542 = new AtomicReference(new C2280());

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f38543 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C11974 f38541 = m30032(null, 1447446, 1447446, 1447446, 1447446, 0);

    public C11974(String str, int i, int i2, int i3, int i4, int i5) {
        this.f38545 = i;
        this.f38548 = i2;
        this.f38546 = i3;
        this.f38547 = i4;
        this.f38549 = i5;
        this.f38544 = str;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m30034() {
        return this.f38546;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30035() {
        return this.f38544;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m30041() {
        return this.f38545;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m30042() {
        return this.f38549;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30046() {
        return this.f38548;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m30047() {
        return this.f38547;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m30045() {
        return C3296.m10878() ? this.f38546 : this.f38545;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m30040() {
        return C3296.m10878() ? this.f38547 : this.f38548;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m30044() {
        return (this.f38549 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m30036(int i) {
        if (i == this.f38549) {
            return this;
        }
        return m30032(this.f38544, this.f38545, this.f38548, this.f38546, this.f38547, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m30037(String str) {
        if (C17359.equals(str, this.f38544)) {
            return this;
        }
        return m30032(str, this.f38545, this.f38548, this.f38546, this.f38547, this.f38549);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11974 m30043() {
        return m30036(this.f38549 | 128);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m30038(C11974 c11974) {
        C11974 c11975;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        if (this == c11974 || (c11975 = f38541) == c11974) {
            return this;
        }
        if (this == c11975) {
            return c11974;
        }
        int i7 = c11974.f38549;
        if ((i7 & 128) != 0) {
            return c11974;
        }
        int i8 = c11974.f38545;
        boolean z2 = true;
        if (i8 != 1447446 || i8 == (i6 = this.f38545)) {
            i = i8;
            z = false;
        } else {
            z = true;
            i = i6;
        }
        int i9 = c11974.f38548;
        if (i9 != 1447446 || i9 == (i2 = this.f38548)) {
            i2 = i9;
        } else {
            z = true;
        }
        int i10 = c11974.f38546;
        if (i10 != 1447446 || i10 == (i3 = this.f38546)) {
            i3 = i10;
        } else {
            z = true;
        }
        int i11 = c11974.f38547;
        if (i11 != 1447446 || i11 == (i5 = this.f38547)) {
            i4 = i11;
        } else {
            z = true;
            i4 = i5;
        }
        String str2 = c11974.f38544;
        if (str2 != null || (str = this.f38544) == null) {
            z2 = z;
            str = str2;
        }
        int i12 = this.f38549 | i7;
        return (z2 || i12 != i7) ? m30032(str, i, i2, i3, i4, i12) : c11974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30039(C6178 c6178) {
        int i = this.f38547;
        int i2 = this.f38548;
        boolean z = (i2 == 0 && i == 0) ? false : true;
        String str = this.f38544;
        boolean z2 = str != null;
        if (z2) {
            c6178.writeByte(243);
        } else if (z) {
            c6178.writeByte(242);
        } else {
            c6178.writeByte(241);
        }
        c6178.writeInt(this.f38545);
        c6178.writeInt(this.f38546);
        if (z || z2) {
            c6178.writeInt(i2);
            c6178.writeInt(i);
        }
        if (z2) {
            c6178.m17800(str);
        }
        c6178.writeByte(this.f38549);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11974 m30033(C20348 c20348) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5 = c20348.readByte() & 255;
        int i6 = c20348.readInt();
        int i7 = c20348.readInt();
        String strM46758 = null;
        if (i5 == 241) {
            str = null;
            i4 = 0;
            i3 = 0;
        } else {
            if (i5 == 242) {
                i = c20348.readInt();
                i2 = c20348.readInt();
            } else if (i5 == 243) {
                i = c20348.readInt();
                i2 = c20348.readInt();
                strM46758 = c20348.m46758();
            } else {
                throw new RuntimeException();
            }
            i3 = i2;
            str = strM46758;
            i4 = i;
        }
        return m30032(str, i6, i4, i7, i3, c20348.readByte() & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11974 m30032(String str, int i, int i2, int i3, int i4, int i5) {
        C2280 c2280;
        if ((i5 & 64) != 0 || str != null) {
            return new C11974(str, i, i2, i3, i4, i5);
        }
        AtomicReference atomicReference = f38542;
        C2280 c2281 = (C2280) atomicReference.getAndSet(null);
        ConcurrentMapC17249 concurrentMapC17249 = f38543;
        if (c2281 != null) {
            C11974 c11974 = (C11974) concurrentMapC17249.get(c2281);
            atomicReference.set(c2281);
            if (c11974 != null) {
                return c11974;
            }
            c2280 = new C2280();
        } else {
            c2280 = new C2280();
            C11974 c11975 = (C11974) concurrentMapC17249.get(c2280);
            if (c11975 != null) {
                return c11975;
            }
        }
        C11974 c11976 = new C11974(null, i, i2, i3, i4, i5);
        concurrentMapC17249.put(c2280, c11976);
        return c11976;
    }

    public final String toString() {
        return String.format("StyleItem{dayColor=#%08X, dayBgColor=#%08X, nightColor=#%08X, nightBgColor=#%08X, flags=%s, colorParserMark=%s}", Integer.valueOf(this.f38545), Integer.valueOf(this.f38548), Integer.valueOf(this.f38546), Integer.valueOf(this.f38547), Integer.toBinaryString(this.f38549), this.f38544);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C11974.class == obj.getClass()) {
            C11974 c11974 = (C11974) obj;
            if (this.f38549 == c11974.f38549 && this.f38545 == c11974.f38545 && this.f38548 == c11974.f38548 && this.f38546 == c11974.f38546 && this.f38547 == c11974.f38547 && C17359.equals(this.f38544, c11974.f38544)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hashCode(this.f38544) + (((((((((this.f38545 * 31) + this.f38548) * 31) + this.f38546) * 31) + this.f38547) * 31) + this.f38549) * 31);
    }
}
