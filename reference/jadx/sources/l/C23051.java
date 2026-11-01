package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DS */
/* JADX INFO: loaded from: classes.dex */
public final class C23051 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f74893;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15187 f74894;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f74895;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13173 f74896;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23051 f74897 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15187 f74898;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18111 f74899;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12738 f74900;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f74901;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC20562 f74902;

    public C23051(C14585 c14585, C18111 c18111) {
        this.f74899 = c18111;
        this.f74900 = c14585.f20884;
        this.f74894 = c14585.f47732;
        this.f74898 = c14585.f47725;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50989(int i, long j, EnumC20562 enumC20562, C13173 c13173, Object obj) {
        this.f74893 = i;
        this.f74895 = j;
        this.f74902 = enumC20562;
        this.f74896 = c13173;
        this.f74901 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50990(InterfaceC19275 interfaceC19275) {
        EnumC15624 enumC15624M46396 = this.f74902.m46396();
        C13173 c13173 = this.f74896;
        int i = 0;
        C18111 c18111 = this.f74899;
        if (c13173 != null && (c13173 instanceof C15187)) {
            C15187 c15187 = (C15187) c13173;
            if (c15187.f49578 == null || c13173.f43854 == 0) {
                c18111.mo2164((this.f74895 - ((long) String.valueOf(c13173.f43854).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f74902.m46393(), Integer.valueOf(c13173.f43854));
            } else if (!c13173.mo32563()) {
                C11521 c11521M31653 = this.f74900.m31653(c15187);
                if (c11521M31653.isPresent()) {
                    c13173 = (C13173) c11521M31653.get();
                } else {
                    c18111.m42172((this.f74895 - ((long) String.valueOf(c13173.f43854).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f74902.m46393(), Integer.valueOf(c13173.f43854));
                    throw null;
                }
            }
        }
        this.f74896 = c13173;
        int i2 = C6822.f22993[enumC15624M46396.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    c18111.m42174("{0} has an unknown type", this.f74902.m46393());
                    throw null;
                }
                C23509 c23509 = (C23509) interfaceC19275;
                c23509.m51765(this.f74902.m46398().intValue() >> 8);
                c23509.m51765(this.f74902.m46398().intValue() & 255);
                return;
            }
            C23509 c235010 = (C23509) interfaceC19275;
            c235010.m51765(EnumC20562.f66907.m46398().intValue());
            c235010.m51765(this.f74902.m46398().intValue() & 255);
            c235010.m51770(this.f74896.f43854);
            if (this.f74902 == EnumC20562.f66954) {
                c235010.m51770(((C13173) this.f74901).f43854);
                return;
            }
            return;
        }
        EnumC20562 enumC20562 = this.f74902;
        if (enumC20562 == EnumC20562.f66889) {
            ((C23509) interfaceC19275).m51765(this.f74896.f43854);
            return;
        }
        C23509 c235011 = (C23509) interfaceC19275;
        c235011.m51765(enumC20562.m46398().intValue());
        int iM46392 = this.f74902.m46392();
        if (iM46392 == 1) {
            return;
        }
        int[] iArr = C6822.f22992;
        int i3 = iArr[this.f74902.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                final C8609 c8609 = (C8609) this.f74901;
                c8609.f29726.m2152(new Supplier() { // from class: l.᩵ۗۡ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        StringBuilder sb = new StringBuilder("  writeLookupSwitch: pc=");
                        C8609 c86010 = c8609;
                        sb.append(c86010.f29725);
                        sb.append(" pad=");
                        sb.append(c86010.f29719);
                        sb.append(" deflabel=");
                        sb.append(c86010.f29722.f43854);
                        return sb.toString();
                    }
                });
                for (int i4 = 0; i4 < c8609.f29719; i4++) {
                    c235011.m51765(0);
                }
                c235011.m51771(c8609.f29722.f43854 - c8609.f29725);
                c235011.m51771(c8609.f29720.size());
                while (i < c8609.f29720.size()) {
                    c235011.m51771(((Integer) c8609.f29720.get(i)).intValue());
                    c235011.m51771(((C13173) c8609.f29723.get(i)).f43854 - c8609.f29725);
                    i++;
                }
                return;
            }
            try {
                int i5 = this.f74896.f43854;
                switch (iArr[this.f74902.ordinal()]) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        i5 -= this.f74893;
                        break;
                    case 23:
                        i5 = (((C13173) this.f74901).f43854 & 255) | (i5 << 8);
                        break;
                    case 24:
                        i5 = ((i5 << 8) | (((C13173) this.f74901).f43854 & 255)) << 8;
                        break;
                    case 25:
                        i5 <<= 16;
                        break;
                    case 26:
                        if ((i5 & (-256)) != 0) {
                            c18111.m42174("Too long argument of {0}: {1}", this.f74902.m46393(), Integer.valueOf(i5));
                            throw null;
                        }
                        break;
                }
                if (iM46392 != 1) {
                    if (iM46392 == 2) {
                        if (i5 > 255) {
                            c18111.mo2157("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m50988(), this.f74902.m46393(), C1115.m4131(i5), "unsigned 8-bit value 0xFF");
                        }
                        c235011.m51765(i5);
                        return;
                    }
                    if (iM46392 == 3) {
                        if (i5 > 32767) {
                            c18111.mo2157("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m50988(), this.f74902.m46393(), C1115.m4131(i5), "signed 16-bit value " + C1115.m4131(EnumC23529.f76192));
                        }
                        c235011.m51770(i5);
                        return;
                    }
                    if (iM46392 == 4) {
                        if (i5 > 32767) {
                            c18111.mo2157("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m50988(), this.f74902.m46393(), C1115.m4131(i5), "signed 16-bit value " + C1115.m4131(EnumC23529.f76192));
                        }
                        c235011.m51770(i5);
                        c235011.m51765(((C13173) this.f74901).f43854);
                        return;
                    }
                    if (iM46392 == 5) {
                        if (i5 > Integer.MAX_VALUE) {
                            c18111.mo2157("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m50988(), this.f74902.m46393(), C1115.m4131(i5), "signed 32-bit value " + C1115.m4131(Integer.MAX_VALUE));
                        }
                        c235011.m51771(i5);
                        return;
                    }
                    c18111.m42174("{0} has wrong length {1}", this.f74902.m46393(), Integer.valueOf(iM46392));
                    throw null;
                }
                return;
            } catch (NullPointerException unused) {
                c18111.m42174("Null arg for {0}", this.f74902.m46393());
                throw null;
            }
        }
        C8609 c86010 = (C8609) this.f74901;
        for (int i6 = 0; i6 < c86010.f29719; i6++) {
            c235011.m51765(0);
        }
        c235011.m51771(c86010.f29722.f43854 - c86010.f29725);
        c235011.m51771(c86010.f29727);
        c235011.m51771(c86010.f29724);
        while (true) {
            C13173[] c13173Arr = c86010.f29721;
            if (i >= c13173Arr.length) {
                return;
            }
            c235011.m51771(c13173Arr[i].f43854 - c86010.f29725);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m50988() {
        String string;
        String string2;
        C15187 c15187 = this.f74894;
        Object obj = c15187.f49578.f69953;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = "#" + c15187.f43854;
        }
        StringBuilder sbM23356 = C9023.m23356(string);
        C15187 c15188 = this.f74898;
        Object obj2 = c15188.f49578.f69953;
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = ":#" + c15188.f43854;
        }
        sbM23356.append(string2);
        return sbM23356.toString();
    }
}
