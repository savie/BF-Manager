package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۟ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7834 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26108;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21259 f26109;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15291 f26110;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1122 f26111;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7660 f26112;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f26113;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC22268 f26114;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7834 f26115 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f26116;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7660 f26117;

    public C7834(C25340 c25340, C1122 c1122) {
        this.f26111 = c1122;
        this.f26110 = c25340.f20376;
        this.f26117 = c25340.f81815;
        this.f26112 = c25340.f81817;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21358(int i, long j, EnumC22268 enumC22268, C21259 c21259, Object obj) {
        this.f26113 = i;
        this.f26108 = j;
        this.f26114 = enumC22268;
        this.f26109 = c21259;
        this.f26116 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21359(InterfaceC9397 interfaceC9397) {
        EnumC11079 enumC11079M50328 = this.f26114.m50328();
        C21259 c21259 = this.f26109;
        int i = 0;
        C1122 c1122 = this.f26111;
        if (c21259 != null && (c21259 instanceof C7660)) {
            C7660 c7660 = (C7660) c21259;
            if (c7660.f25232 == null || c21259.f67820 == 0) {
                c1122.mo4166((this.f26108 - ((long) String.valueOf(c21259.f67820).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f26114.m50326(), Integer.valueOf(c21259.f67820));
            } else if (!c21259.mo20871()) {
                C15867 c15867M36708 = this.f26110.m36708(c7660);
                if (c15867M36708.isPresent()) {
                    c21259 = (C21259) c15867M36708.get();
                } else {
                    c1122.m4162((this.f26108 - ((long) String.valueOf(c21259.f67820).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f26114.m50326(), Integer.valueOf(c21259.f67820));
                    throw null;
                }
            }
        }
        this.f26109 = c21259;
        int i2 = C0376.f1908[enumC11079M50328.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    c1122.m4163("{0} has an unknown type", this.f26114.m50326());
                    throw null;
                }
                C11388 c11388 = (C11388) interfaceC9397;
                c11388.m28735(this.f26114.m50332().intValue() >> 8);
                c11388.m28735(this.f26114.m50332().intValue() & 255);
                return;
            }
            C11388 c11389 = (C11388) interfaceC9397;
            c11389.m28735(EnumC22268.f72058.m50332().intValue());
            c11389.m28735(this.f26114.m50332().intValue() & 255);
            c11389.m28740(this.f26109.f67820);
            if (this.f26114 == EnumC22268.f71882) {
                c11389.m28740(((C21259) this.f26116).f67820);
                return;
            }
            return;
        }
        EnumC22268 enumC22268 = this.f26114;
        if (enumC22268 == EnumC22268.f72038) {
            ((C11388) interfaceC9397).m28735(this.f26109.f67820);
            return;
        }
        C11388 c113810 = (C11388) interfaceC9397;
        c113810.m28735(enumC22268.m50332().intValue());
        int iM50329 = this.f26114.m50329();
        if (iM50329 == 1) {
            return;
        }
        int[] iArr = C0376.f1907;
        int i3 = iArr[this.f26114.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                final C22071 c22071 = (C22071) this.f26116;
                c22071.f71165.m32299(new Supplier() { // from class: l.ۙ۫᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        StringBuilder sb = new StringBuilder("  writeLookupSwitch: pc=");
                        C22071 c22072 = c22071;
                        sb.append(c22072.f71160);
                        sb.append(" pad=");
                        sb.append(c22072.f71162);
                        sb.append(" deflabel=");
                        sb.append(c22072.f71159.f67820);
                        return sb.toString();
                    }
                });
                for (int i4 = 0; i4 < c22071.f71162; i4++) {
                    c113810.m28735(0);
                }
                c113810.m28741(c22071.f71159.f67820 - c22071.f71160);
                c113810.m28741(c22071.f71166.size());
                while (i < c22071.f71166.size()) {
                    c113810.m28741(((Integer) c22071.f71166.get(i)).intValue());
                    c113810.m28741(((C21259) c22071.f71164.get(i)).f67820 - c22071.f71160);
                    i++;
                }
                return;
            }
            try {
                int i5 = this.f26109.f67820;
                switch (iArr[this.f26114.ordinal()]) {
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
                        i5 -= this.f26113;
                        break;
                    case 23:
                        i5 = (((C21259) this.f26116).f67820 & 255) | (i5 << 8);
                        break;
                    case 24:
                        i5 = ((i5 << 8) | (((C21259) this.f26116).f67820 & 255)) << 8;
                        break;
                    case 25:
                        i5 <<= 16;
                        break;
                    case 26:
                        if ((i5 & (-256)) != 0) {
                            c1122.m4163("Too long argument of {0}: {1}", this.f26114.m50326(), Integer.valueOf(i5));
                            throw null;
                        }
                        break;
                }
                if (iM50329 != 1) {
                    if (iM50329 == 2) {
                        if (i5 > 255) {
                            c1122.mo4165("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m21357(), this.f26114.m50326(), C7754.m21094(i5), "unsigned 8-bit value 0xFF");
                        }
                        c113810.m28735(i5);
                        return;
                    }
                    if (iM50329 == 3) {
                        if (i5 > 32767) {
                            c1122.mo4165("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m21357(), this.f26114.m50326(), C7754.m21094(i5), "signed 16-bit value " + C7754.m21094(EnumC6121.f20881));
                        }
                        c113810.m28740(i5);
                        return;
                    }
                    if (iM50329 == 4) {
                        if (i5 > 32767) {
                            c1122.mo4165("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m21357(), this.f26114.m50326(), C7754.m21094(i5), "signed 16-bit value " + C7754.m21094(EnumC6121.f20881));
                        }
                        c113810.m28740(i5);
                        c113810.m28735(((C21259) this.f26116).f67820);
                        return;
                    }
                    if (iM50329 == 5) {
                        if (i5 > Integer.MAX_VALUE) {
                            c1122.mo4165("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m21357(), this.f26114.m50326(), C7754.m21094(i5), "signed 32-bit value " + C7754.m21094(Integer.MAX_VALUE));
                        }
                        c113810.m28741(i5);
                        return;
                    }
                    c1122.m4163("{0} has wrong length {1}", this.f26114.m50326(), Integer.valueOf(iM50329));
                    throw null;
                }
                return;
            } catch (NullPointerException unused) {
                c1122.m4163("Null arg for {0}", this.f26114.m50326());
                throw null;
            }
        }
        C22071 c22072 = (C22071) this.f26116;
        for (int i6 = 0; i6 < c22072.f71162; i6++) {
            c113810.m28735(0);
        }
        c113810.m28741(c22072.f71159.f67820 - c22072.f71160);
        c113810.m28741(c22072.f71163);
        c113810.m28741(c22072.f71161);
        while (true) {
            C21259[] c21259Arr = c22072.f71158;
            if (i >= c21259Arr.length) {
                return;
            }
            c113810.m28741(c21259Arr[i].f67820 - c22072.f71160);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m21357() {
        String string;
        String string2;
        C7660 c7660 = this.f26117;
        Object obj = c7660.f25232.f61224;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = "#" + c7660.f67820;
        }
        StringBuilder sbM27333 = C10732.m27333(string);
        C7660 c7661 = this.f26112;
        Object obj2 = c7661.f25232.f61224;
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = ":#" + c7661.f67820;
        }
        sbM27333.append(string2);
        return sbM27333.toString();
    }
}
