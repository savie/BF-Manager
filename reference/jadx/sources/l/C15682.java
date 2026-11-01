package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܺۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S978 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15682 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50916;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f50917;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f50918;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f50919;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f50920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f50921;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C0219 f50913 = new C0219();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f50914 = new AtomicReference(new C20620());

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f50912 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C15682 f50915 = m37365(null, 1447446, 1447446, 1447446, 1447446, 0);

    public C15682(String str, int i, int i2, int i3, int i4, int i5) {
        this.f50919 = i;
        this.f50920 = i2;
        this.f50921 = i3;
        this.f50918 = i4;
        this.f50916 = i5;
        this.f50917 = str;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m37367() {
        return this.f50916;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m37368() {
        return this.f50919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37369() {
        return this.f50917;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m37374() {
        return this.f50921;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m37375() {
        return this.f50920;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m37378() {
        return this.f50918;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m37379() {
        return C20368.m45991() ? this.f50921 : this.f50919;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m37376() {
        return C20368.m45991() ? this.f50918 : this.f50920;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m37377() {
        return (this.f50916 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m37370(int i) {
        if (i == this.f50916) {
            return this;
        }
        return m37365(this.f50917, this.f50919, this.f50920, this.f50921, this.f50918, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m37371(String str) {
        if (C13638.equals(str, this.f50917)) {
            return this;
        }
        return m37365(str, this.f50919, this.f50920, this.f50921, this.f50918, this.f50916);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15682 m37380() {
        return m37370(this.f50916 | 128);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m37372(C15682 c15682) {
        C15682 c15683;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        if (this == c15682 || (c15683 = f50915) == c15682) {
            return this;
        }
        if (this == c15683) {
            return c15682;
        }
        int i7 = c15682.f50916;
        if ((i7 & 128) != 0) {
            return c15682;
        }
        int i8 = c15682.f50919;
        boolean z2 = true;
        if (i8 != 1447446 || i8 == (i6 = this.f50919)) {
            i = i8;
            z = false;
        } else {
            z = true;
            i = i6;
        }
        int i9 = c15682.f50920;
        if (i9 != 1447446 || i9 == (i2 = this.f50920)) {
            i2 = i9;
        } else {
            z = true;
        }
        int i10 = c15682.f50921;
        if (i10 != 1447446 || i10 == (i3 = this.f50921)) {
            i3 = i10;
        } else {
            z = true;
        }
        int i11 = c15682.f50918;
        if (i11 != 1447446 || i11 == (i5 = this.f50918)) {
            i4 = i11;
        } else {
            z = true;
            i4 = i5;
        }
        String str2 = c15682.f50917;
        if (str2 != null || (str = this.f50917) == null) {
            z2 = z;
            str = str2;
        }
        int i12 = this.f50916 | i7;
        return (z2 || i12 != i7) ? m37365(str, i, i2, i3, i4, i12) : c15682;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37373(C11018 c11018) {
        int i = this.f50918;
        int i2 = this.f50920;
        boolean z = (i2 == 0 && i == 0) ? false : true;
        String str = this.f50917;
        boolean z2 = str != null;
        if (z2) {
            c11018.writeByte(243);
        } else if (z) {
            c11018.writeByte(242);
        } else {
            c11018.writeByte(241);
        }
        c11018.writeInt(this.f50919);
        c11018.writeInt(this.f50921);
        if (z || z2) {
            c11018.writeInt(i2);
            c11018.writeInt(i);
        }
        if (z2) {
            c11018.m27786(str);
        }
        c11018.writeByte(this.f50916);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15682 m37366(C17367 c17367) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5 = c17367.readByte() & 255;
        int i6 = c17367.readInt();
        int i7 = c17367.readInt();
        String strM40458 = null;
        if (i5 == 241) {
            str = null;
            i4 = 0;
            i3 = 0;
        } else {
            if (i5 == 242) {
                i = c17367.readInt();
                i2 = c17367.readInt();
            } else if (i5 == 243) {
                i = c17367.readInt();
                i2 = c17367.readInt();
                strM40458 = c17367.m40458();
            } else {
                throw new RuntimeException();
            }
            i3 = i2;
            str = strM40458;
            i4 = i;
        }
        return m37365(str, i6, i4, i7, i3, c17367.readByte() & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15682 m37365(String str, int i, int i2, int i3, int i4, int i5) {
        C20620 c20620;
        if ((i5 & 64) != 0 || str != null) {
            return new C15682(str, i, i2, i3, i4, i5);
        }
        AtomicReference atomicReference = f50914;
        C20620 c20621 = (C20620) atomicReference.getAndSet(null);
        ConcurrentMapC13783 concurrentMapC13783 = f50912;
        if (c20621 != null) {
            C15682 c15682 = (C15682) concurrentMapC13783.get(c20621);
            atomicReference.set(c20621);
            if (c15682 != null) {
                return c15682;
            }
            c20620 = new C20620();
        } else {
            c20620 = new C20620();
            C15682 c15683 = (C15682) concurrentMapC13783.get(c20620);
            if (c15683 != null) {
                return c15683;
            }
        }
        C15682 c15684 = new C15682(null, i, i2, i3, i4, i5);
        concurrentMapC13783.put(c20620, c15684);
        return c15684;
    }

    public final String toString() {
        return String.format("StyleItem{dayColor=#%08X, dayBgColor=#%08X, nightColor=#%08X, nightBgColor=#%08X, flags=%s, colorParserMark=%s}", Integer.valueOf(this.f50919), Integer.valueOf(this.f50920), Integer.valueOf(this.f50921), Integer.valueOf(this.f50918), Integer.toBinaryString(this.f50916), this.f50917);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C15682.class == obj.getClass()) {
            C15682 c15682 = (C15682) obj;
            if (this.f50916 == c15682.f50916 && this.f50919 == c15682.f50919 && this.f50920 == c15682.f50920 && this.f50921 == c15682.f50921 && this.f50918 == c15682.f50918 && C13638.equals(this.f50917, c15682.f50917)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hashCode(this.f50917) + (((((((((this.f50919 * 31) + this.f50920) * 31) + this.f50921) * 31) + this.f50918) * 31) + this.f50916) * 31);
    }
}
