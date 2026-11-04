package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C8824 implements InterfaceC0621 {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final InterfaceC16831 a;
    public final int b;
    public final int c;
    public final EnumC8079 d;
    public final int e;

    public long a(C16150 c16150, long j) {
        return j;
    }

    public C8824(InterfaceC16831 interfaceC16831, int i, int i2, EnumC8079 enumC8079) {
        this.a = interfaceC16831;
        this.b = i;
        this.c = i2;
        this.d = enumC8079;
        this.e = 0;
    }

    public C8824(InterfaceC16831 interfaceC16831, int i, int i2, EnumC8079 enumC8079, int i3) {
        this.a = interfaceC16831;
        this.b = i;
        this.c = i2;
        this.d = enumC8079;
        this.e = i3;
    }

    public C8824 d() {
        if (this.e == -1) {
            return this;
        }
        return new C8824(this.a, this.b, this.c, this.d, -1);
    }

    public C8824 e(int i) {
        return new C8824(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // l.InterfaceC0621
    public boolean i(C16150 c16150, StringBuilder sb) {
        InterfaceC16831 interfaceC16831 = this.a;
        Long lA = c16150.a(interfaceC16831);
        if (lA == null) {
            return false;
        }
        long jA = a(c16150, lA.longValue());
        C24488 c24488 = c16150.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new C21241("Field " + interfaceC16831 + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        c24488.getClass();
        int i2 = this.b;
        EnumC8079 enumC8079 = this.d;
        if (jA >= 0) {
            int i3 = AbstractC6588.a[enumC8079.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC6588.a[enumC8079.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C21241("Field " + interfaceC16831 + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean b(C25102 c25102) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == EnumC8079.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x014d, code lost:
    
        if (r3 <= r10) goto L112;
     */
    @Override // l.InterfaceC0621
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(l.C25102 r23, java.lang.CharSequence r24, int r25) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8824.j(l.᩻ܳۗ, java.lang.CharSequence, int):int");
    }

    public int c(C25102 c25102, long j, int i, int i2) {
        return c25102.f(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        InterfaceC16831 interfaceC16831 = this.a;
        EnumC8079 enumC8079 = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && enumC8079 == EnumC8079.NORMAL) {
            return "Value(" + interfaceC16831 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i2 == i && enumC8079 == EnumC8079.NOT_NEGATIVE) {
            return "Value(" + interfaceC16831 + "," + i2 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Value(" + interfaceC16831 + "," + i2 + "," + i + "," + enumC8079 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
