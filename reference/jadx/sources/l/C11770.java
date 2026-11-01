package l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11770 extends AbstractC18908 implements InterfaceC18528 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C19805 f39502 = new C19805(C5464.f18831 * 2);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39503 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f39504;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39505;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f39506;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f39507;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f39508;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f39509 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f39510;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17684 f39511;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f39512;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7807 f39513;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f39514;

    public C11770(C17684 c17684, C18825 c18825, C7807 c7807, int i, InterfaceC9510 interfaceC9510, InterfaceC9510 interfaceC9511, int i2) {
        this.f39511 = c17684;
        this.f39513 = c7807;
        c18825.getClass();
        int iM43441 = c18825.m43441() + i;
        this.f39507 = iM43441;
        this.f39510 = c18825.m43449();
        this.f39504 = c18825.m43449();
        this.f39508 = i2;
        this.f39512 = interfaceC9510.seekTo(iM43441);
        this.f39514 = interfaceC9511.seekTo(iM43441);
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩹ */
    public final String mo9700() {
        return this.f39513.getType();
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۨ */
    public final int mo25750() {
        return this.f39510;
    }

    @Override // l.InterfaceC8858
    public final String getName() {
        C17684 c17684 = this.f39511;
        return c17684.m41168(c17684.m41166().mo9809(m29391() + 4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29395(Writer writer) {
        C17684 c17684 = this.f39511;
        c17684.m41171(c17684.m41166().mo9809(m29391() + 4), writer, false);
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ۖ */
    public final String mo9698() {
        C17684 c17684 = this.f39511;
        return c17684.m41204(c17684.m41166().mo9809(m29392() + 4));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29398(Writer writer) {
        C17684 c17684 = this.f39511;
        c17684.m41172(writer, c17684.m41166().mo9809(m29392() + 4));
    }

    @Override // l.InterfaceC18528
    public final List getParameters() {
        if (m29389() > 0) {
            return new ArrayList(new C24035(this, mo9699()));
        }
        return AbstractC22433.of();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m29400() {
        return AbstractC13556.m33145(this.f39511, this.f39514);
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩳ */
    public final List mo9699() {
        int iM29389 = m29389();
        if (iM29389 > 0) {
            return new C14863(this, iM29389 + 4, this.f39511.m41166().mo9809(iM29389));
        }
        return AbstractC22433.of();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29399(Writer writer) {
        int iM29389 = m29389();
        if (iM29389 > 0) {
            C17684 c17684 = this.f39511;
            int iMo9809 = c17684.m41166().mo9809(iM29389);
            int i = iM29389 + 4;
            for (int i2 = 0; i2 < iMo9809; i2++) {
                c17684.m41172(writer, c17684.m41166().m42183((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC18528
    public final Set getAnnotations() {
        return AbstractC13556.m33143(this.f39511, this.f39512);
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۠ */
    public final Set mo25749() {
        int i = this.f39508;
        if (i == 7) {
            return AbstractC23844.of();
        }
        return EnumSet.copyOf((Collection) EnumC18763.m43321(i));
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۘܰ */
    public final C4007 mo25747() {
        int i = this.f39504;
        if (i > 0) {
            return new C4007(this.f39511, this, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29396(InterfaceC3572 interfaceC3572) {
        C17684 c17684 = this.f39511;
        if (c17684.m41184()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct const-string scan");
        }
        int i = this.f39504;
        if (i <= 0) {
            return;
        }
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        int iMo9809 = abstractC18119M41166.mo9809(i + 12);
        int i2 = i + 16;
        long j = (((long) iMo9809) * 2) + ((long) i2);
        if (j > 2147483647L) {
            throw new C20749(null, "Instruction list for method %s is out of range", this);
        }
        int i3 = (int) j;
        while (i2 < i3) {
            int iM42181 = abstractC18119M41166.m42181(i2);
            if (iM42181 == 0) {
                iM42181 = abstractC18119M41166.m42183(i2);
            }
            EnumC10297 enumC10297M19966 = c17684.mo34147().m19966(iM42181);
            int iM29387 = m29387(abstractC18119M41166, i2, enumC10297M19966);
            if (iM29387 <= 0) {
                throw new C20749(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i2));
            }
            long j2 = (((long) iM29387) * 2) + ((long) i2);
            if (j2 > i3) {
                throw new C20749(null, "The last instruction in method %s is truncated", this);
            }
            if (enumC10297M19966 == EnumC10297.f35313) {
                interfaceC3572.mo10558(abstractC18119M41166.m42183(i2 + 2));
            } else if (enumC10297M19966 == EnumC10297.f35225) {
                interfaceC3572.mo10558(abstractC18119M41166.mo9809(i2 + 2));
            }
            i2 = (int) j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29393(int i, InterfaceC4713 interfaceC4713) {
        int iMo5855;
        long jMo5854;
        boolean zMo13025;
        C17684 c17684 = this.f39511;
        if (c17684.m41184()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct literal scan");
        }
        int i2 = this.f39504;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        int iMo9809 = abstractC18119M41166.mo9809(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo9809) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C20749(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM42181 = abstractC18119M41166.m42181(i3);
            if (iM42181 == 0) {
                iM42181 = abstractC18119M41166.m42183(i3);
            }
            EnumC10297 enumC10297M19966 = c17684.mo34147().m19966(iM42181);
            int iM29387 = m29387(abstractC18119M41166, i3, enumC10297M19966);
            if (iM29387 <= 0) {
                throw new C20749(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM29387) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C20749(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC10297M19966 != null) {
                switch (C9924.f33903[enumC10297M19966.f35328.ordinal()]) {
                    case 8:
                        iMo5855 = (abstractC18119M41166.mo5855(i3 + 1) << 24) >> 28;
                        jMo5854 = iMo5855;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                        break;
                    case 9:
                        iMo5855 = abstractC18119M41166.mo5854(i3 + 2);
                        jMo5854 = iMo5855;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    case 10:
                        iMo5855 = ((short) abstractC18119M41166.mo5854(i3 + 2)) << 16;
                        jMo5854 = iMo5855;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    case 11:
                        jMo5854 = ((long) ((short) abstractC18119M41166.mo5854(i3 + 2))) << 48;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    case 12:
                        iMo5855 = abstractC18119M41166.mo5855(i3 + 3);
                        jMo5854 = iMo5855;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    case 13:
                        iMo5855 = abstractC18119M41166.mo5854(i3 + 2);
                        jMo5854 = iMo5855;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    case 14:
                        iMo5855 = abstractC18119M41166.mo5859(i3 + 2);
                        jMo5854 = iMo5855;
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    case 15:
                        jMo5854 = abstractC18119M41166.mo5858(i3 + 2);
                        zMo13025 = interfaceC4713.mo13025(enumC10297M19966, jMo5854);
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                    default:
                        zMo13025 = true;
                        if (!zMo13025) {
                            return i6;
                        }
                        break;
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29394(int i, InterfaceC13887 interfaceC13887) {
        int iM42183;
        C17684 c17684 = this.f39511;
        if (c17684.m41184()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct reference scan");
        }
        int i2 = this.f39504;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC18119 abstractC18119M41166 = c17684.m41166();
        int iMo9809 = abstractC18119M41166.mo9809(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo9809) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C20749(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM42181 = abstractC18119M41166.m42181(i3);
            if (iM42181 == 0) {
                iM42181 = abstractC18119M41166.m42183(i3);
            }
            EnumC10297 enumC10297M19966 = c17684.mo34147().m19966(iM42181);
            int iM29387 = m29387(abstractC18119M41166, i3, enumC10297M19966);
            if (iM29387 <= 0) {
                throw new C20749(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM29387) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C20749(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC10297M19966 != null && enumC10297M19966.f35329 != 7) {
                switch (C9924.f33903[enumC10297M19966.f35328.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        iM42183 = abstractC18119M41166.m42183(i3 + 2);
                        break;
                    case 7:
                        iM42183 = abstractC18119M41166.mo9809(i3 + 2);
                        break;
                    default:
                        iM42183 = -1;
                        break;
                }
                if (iM42183 >= 0) {
                    if (!interfaceC13887.mo33723(i5, enumC10297M19966.f35329, iM42183, enumC10297M19966)) {
                        return i6;
                    }
                }
            }
            i3 = (int) j3;
            i5 = i6;
            j = 2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29387(AbstractC18119 abstractC18119, int i, EnumC10297 enumC10297) {
        if (enumC10297 == null) {
            return 1;
        }
        int i2 = C9924.f33904[enumC10297.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return (abstractC18119.m42183(i + 2) * 2) + 4;
            }
            if (i2 == 3) {
                return (abstractC18119.m42183(i + 2) * 4) + 2;
            }
            return enumC10297.f35328.f57758 / 2;
        }
        int iM42183 = abstractC18119.m42183(i + 2);
        if (iM42183 == 0) {
            return 4;
        }
        int iMo5859 = abstractC18119.mo5859(i + 4);
        if (iMo5859 < 0) {
            throw new C20749(null, "Invalid array-payload instruction: negative element count", new Object[0]);
        }
        long j = ((long) iM42183) * ((long) iMo5859);
        if (j > 2147483647L) {
            throw new C20749(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        return ((((int) j) + 1) / 2) + 4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m29391() {
        if (this.f39506 == 0) {
            this.f39506 = this.f39511.m41180(this.f39507);
        }
        return this.f39506;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private int m29392() {
        if (this.f39505 == 0) {
            C17684 c17684 = this.f39511;
            this.f39505 = c17684.m41189(c17684.m41166().m42183(m29391() + 2));
        }
        return this.f39505;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private int m29389() {
        if (this.f39509 == -1) {
            this.f39509 = this.f39511.m41166().mo9809(m29392() + 8);
        }
        return this.f39509;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011d A[PHI: r8
      0x011d: PHI (r8v3 l.ܳ᩸ۨ) = (r8v2 l.ܳ᩸ۨ), (r8v4 l.ܳ᩸ۨ) binds: [B:66:0x011b, B:59:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29397(C11770 c11770, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C19805 c19805 = f39502;
        if (this.f39513.getType().equals(c11770.f39513.getType()) && getName().equals(c11770.getName()) && mo9698().equals(c11770.mo9698()) && C10166.m25904(mo9699(), c11770.mo9699()) && this.f39510 == c11770.f39510 && (((this.f39512 == 0 && c11770.f39512 == 0) || C12076.m30044(getAnnotations(), c11770.getAnnotations())) && ((this.f39508 == 7 && c11770.f39508 == 7) || C12076.m30044(mo25749(), c11770.mo25749())))) {
            C4007 c4007Mo25747 = mo25747();
            C4007 c4007Mo25748 = c11770.mo25747();
            boolean z6 = c4007Mo25747 == null || c4007Mo25747.m11509() == 0;
            boolean z7 = c4007Mo25748 == null || c4007Mo25748.m11509() == 0;
            if (z6 && z7) {
                return true;
            }
            if (!z6 && !z7 && (z3 || c4007Mo25747.mo11507() == c4007Mo25748.mo11507())) {
                C20424 c20424 = new C20424();
                c20424.f66203 = false;
                c20424.f66197 = true;
                c20424.f66199 = !z;
                c20424.f66202 = z3;
                c20424.f66196 = z4;
                c20424.f66200 = true;
                c20424.f66195 = z2;
                c20424.f66198 = this.f39511.mo34147().f24881;
                C10547 c10547 = new C10547(c20424, this, c4007Mo25747);
                C10547 c10548 = new C10547(c20424, c11770, c4007Mo25748);
                C14795 c14795M29388 = null;
                try {
                    try {
                        c14795M29388 = m29388(c10547, z5);
                        C3199 c3199 = new C3199(c14795M29388);
                        c10548.m26684(new C2161(c3199, z5));
                        c3199.m9614();
                        c10547.m26687();
                        c10548.m26687();
                        c19805.m45011(c14795M29388);
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                        c10547.m26687();
                        c10548.m26687();
                        if (c14795M29388 != null) {
                            c19805.m45011(c14795M29388);
                        }
                    } catch (C9551 unused) {
                        c10547.m26687();
                        c10548.m26687();
                        if (c14795M29388 != null) {
                            c19805.m45011(c14795M29388);
                        }
                    }
                } catch (Throwable th) {
                    c10547.m26687();
                    c10548.m26687();
                    if (c14795M29388 != null) {
                        c19805.m45011(c14795M29388);
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14795 m29388(C10547 c10547, boolean z) {
        C19805 c19805 = f39502;
        C14795 c14795 = (C14795) c19805.m45009();
        if (c14795 == null) {
            c14795 = new C14795();
        } else {
            c14795.m35465(0);
        }
        try {
            c10547.m26684(new C2161(new C2093(c14795), z));
            return c14795;
        } catch (IOException | RuntimeException e) {
            c19805.m45011(c14795);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m29390() {
        f39502.m45012();
    }
}
