package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C21709 implements InterfaceC22415 {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final InterfaceC11002 a;
    public final int b;
    public final int c;
    public final EnumC1247 d;
    public final int e;

    public long a(C11126 c11126, long j) {
        return j;
    }

    public C21709(InterfaceC11002 interfaceC11002, int i, int i2, EnumC1247 enumC1247) {
        this.a = interfaceC11002;
        this.b = i;
        this.c = i2;
        this.d = enumC1247;
        this.e = 0;
    }

    public C21709(InterfaceC11002 interfaceC11002, int i, int i2, EnumC1247 enumC1247, int i3) {
        this.a = interfaceC11002;
        this.b = i;
        this.c = i2;
        this.d = enumC1247;
        this.e = i3;
    }

    public C21709 d() {
        if (this.e == -1) {
            return this;
        }
        return new C21709(this.a, this.b, this.c, this.d, -1);
    }

    public C21709 e(int i) {
        return new C21709(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // l.InterfaceC22415
    public boolean l(C11126 c11126, StringBuilder sb) {
        InterfaceC11002 interfaceC11002 = this.a;
        Long lA = c11126.a(interfaceC11002);
        if (lA == null) {
            return false;
        }
        long jA = a(c11126, lA.longValue());
        C4775 c4775 = c11126.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new C15464("Field " + interfaceC11002 + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        c4775.getClass();
        int i2 = this.b;
        EnumC1247 enumC1247 = this.d;
        if (jA >= 0) {
            int i3 = AbstractC2888.a[enumC1247.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC2888.a[enumC1247.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C15464("Field " + interfaceC11002 + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean b(C12537 c12537) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == EnumC1247.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x014d, code lost:
    
        if (r3 <= r10) goto L112;
     */
    @Override // l.InterfaceC22415
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m(l.C12537 r23, java.lang.CharSequence r24, int r25) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21709.m(l.۫ܽᩴ, java.lang.CharSequence, int):int");
    }

    public int c(C12537 c12537, long j, int i, int i2) {
        return c12537.f(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        InterfaceC11002 interfaceC11002 = this.a;
        EnumC1247 enumC1247 = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && enumC1247 == EnumC1247.NORMAL) {
            return "Value(" + interfaceC11002 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i2 == i && enumC1247 == EnumC1247.NOT_NEGATIVE) {
            return "Value(" + interfaceC11002 + "," + i2 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Value(" + interfaceC11002 + "," + i2 + "," + i + "," + enumC1247 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
