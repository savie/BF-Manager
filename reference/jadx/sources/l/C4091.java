package l;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4091 extends AbstractC6968 implements InterfaceC8631 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13937 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C20528 f13938 = new C20528(C11138.f35105 * 2);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24975 f13939;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f13940;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f13941 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f13942;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f13943;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f13944;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f13945;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13946;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f13947;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f13948;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22737 f13949;

    public C4091(C24975 c24975, C8565 c8565, C22737 c22737, int i, InterfaceC3476 interfaceC3476, InterfaceC3476 interfaceC3477, int i2) {
        this.f13939 = c24975;
        this.f13949 = c22737;
        c8565.getClass();
        int iM22990 = c8565.m22990() + i;
        this.f13940 = iM22990;
        this.f13946 = c8565.m22996();
        this.f13947 = c8565.m22996();
        this.f13942 = i2;
        this.f13948 = interfaceC3476.seekTo(iM22990);
        this.f13944 = interfaceC3477.seekTo(iM22990);
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܳ */
    public final String mo6804() {
        return this.f13949.getType();
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo13184() {
        return this.f13946;
    }

    @Override // l.InterfaceC4859
    public final String getName() {
        C24975 c24975 = this.f13939;
        return c24975.m55782(c24975.m55818().mo8719(m13171() + 4));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13179(Writer writer) {
        C24975 c24975 = this.f13939;
        c24975.m55786(c24975.m55818().mo8719(m13171() + 4), writer, false);
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ۤ */
    public final String mo6802() {
        C24975 c24975 = this.f13939;
        return c24975.m55822(c24975.m55818().mo8719(m13173() + 4));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13182(Writer writer) {
        C24975 c24975 = this.f13939;
        c24975.m55787(writer, c24975.m55818().mo8719(m13173() + 4));
    }

    @Override // l.InterfaceC8631
    public final List getParameters() {
        if (m13174() > 0) {
            return new ArrayList(new C16023(this, mo6805()));
        }
        return AbstractC1928.of();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final List m13183() {
        return AbstractC6460.m18260(this.f13939, this.f13944);
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܶ */
    public final List mo6805() {
        int iM13174 = m13174();
        if (iM13174 > 0) {
            return new C23483(this, iM13174 + 4, this.f13939.m55818().mo8719(iM13174));
        }
        return AbstractC1928.of();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13185(Writer writer) {
        int iM13174 = m13174();
        if (iM13174 > 0) {
            C24975 c24975 = this.f13939;
            int iMo8719 = c24975.m55818().mo8719(iM13174);
            int i = iM13174 + 4;
            for (int i2 = 0; i2 < iMo8719; i2++) {
                c24975.m55787(writer, c24975.m55818().m8721((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC8631
    public final Set getAnnotations() {
        return AbstractC6460.m18258(this.f13939, this.f13948);
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Set mo13176() {
        int i = this.f13942;
        if (i == 7) {
            return AbstractC8639.of();
        }
        return EnumSet.copyOf((Collection) EnumC13722.m33528(i));
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ֫᩷ */
    public final C7820 mo13175() {
        int i = this.f13947;
        if (i > 0) {
            return new C7820(this.f13939, this, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13180(InterfaceC12294 interfaceC12294) {
        C24975 c24975 = this.f13939;
        if (c24975.m55783()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct const-string scan");
        }
        int i = this.f13947;
        if (i <= 0) {
            return;
        }
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        int iMo8719 = abstractC2599M55818.mo8719(i + 12);
        int i2 = i + 16;
        long j = (((long) iMo8719) * 2) + ((long) i2);
        if (j > 2147483647L) {
            throw new C23044(null, "Instruction list for method %s is out of range", this);
        }
        int i3 = (int) j;
        while (i2 < i3) {
            int iM8716 = abstractC2599M55818.m8716(i2);
            if (iM8716 == 0) {
                iM8716 = abstractC2599M55818.m8721(i2);
            }
            EnumC22631 enumC22631M45296 = c24975.mo4326().m45296(iM8716);
            int iM13169 = m13169(abstractC2599M55818, i2, enumC22631M45296);
            if (iM13169 <= 0) {
                throw new C23044(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i2));
            }
            long j2 = (((long) iM13169) * 2) + ((long) i2);
            if (j2 > i3) {
                throw new C23044(null, "The last instruction in method %s is truncated", this);
            }
            if (enumC22631M45296 == EnumC22631.f73506) {
                interfaceC12294.mo30685(abstractC2599M55818.m8721(i2 + 2));
            } else if (enumC22631M45296 == EnumC22631.f73418) {
                interfaceC12294.mo30685(abstractC2599M55818.mo8719(i2 + 2));
            }
            i2 = (int) j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13177(int i, InterfaceC6329 interfaceC6329) {
        int iMo8717;
        long jMo8722;
        boolean zMo18050;
        C24975 c24975 = this.f13939;
        if (c24975.m55783()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct literal scan");
        }
        int i2 = this.f13947;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        int iMo8719 = abstractC2599M55818.mo8719(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo8719) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C23044(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM8716 = abstractC2599M55818.m8716(i3);
            if (iM8716 == 0) {
                iM8716 = abstractC2599M55818.m8721(i3);
            }
            EnumC22631 enumC22631M45296 = c24975.mo4326().m45296(iM8716);
            int iM13169 = m13169(abstractC2599M55818, i3, enumC22631M45296);
            if (iM13169 <= 0) {
                throw new C23044(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM13169) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C23044(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC22631M45296 != null) {
                switch (C20499.f65646[enumC22631M45296.f73508.ordinal()]) {
                    case 8:
                        iMo8717 = (abstractC2599M55818.mo8717(i3 + 1) << 24) >> 28;
                        jMo8722 = iMo8717;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                        break;
                    case 9:
                        iMo8717 = abstractC2599M55818.mo8722(i3 + 2);
                        jMo8722 = iMo8717;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    case 10:
                        iMo8717 = ((short) abstractC2599M55818.mo8722(i3 + 2)) << 16;
                        jMo8722 = iMo8717;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    case 11:
                        jMo8722 = ((long) ((short) abstractC2599M55818.mo8722(i3 + 2))) << 48;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    case 12:
                        iMo8717 = abstractC2599M55818.mo8717(i3 + 3);
                        jMo8722 = iMo8717;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    case 13:
                        iMo8717 = abstractC2599M55818.mo8722(i3 + 2);
                        jMo8722 = iMo8717;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    case 14:
                        iMo8717 = abstractC2599M55818.mo8725(i3 + 2);
                        jMo8722 = iMo8717;
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    case 15:
                        jMo8722 = abstractC2599M55818.mo8720(i3 + 2);
                        zMo18050 = interfaceC6329.mo18050(enumC22631M45296, jMo8722);
                        if (!zMo18050) {
                            return i6;
                        }
                        break;
                    default:
                        zMo18050 = true;
                        if (!zMo18050) {
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
    public final int m13178(int i, InterfaceC24229 interfaceC24229) {
        int iM8721;
        C24975 c24975 = this.f13939;
        if (c24975.m55783()) {
            throw new AssertionError("replaceNeverExecutedInstructionsWithNop is unsupported for direct reference scan");
        }
        int i2 = this.f13947;
        if (i2 <= 0) {
            return -1;
        }
        AbstractC2599 abstractC2599M55818 = c24975.m55818();
        int iMo8719 = abstractC2599M55818.mo8719(i2 + 12);
        int i3 = i2 + 16;
        long j = 2;
        long j2 = (((long) iMo8719) * 2) + ((long) i3);
        if (j2 > 2147483647L) {
            throw new C23044(null, "Instruction list for method %s is out of range", this);
        }
        int i4 = (int) j2;
        int i5 = 0;
        while (i3 < i4) {
            int iM8716 = abstractC2599M55818.m8716(i3);
            if (iM8716 == 0) {
                iM8716 = abstractC2599M55818.m8721(i3);
            }
            EnumC22631 enumC22631M45296 = c24975.mo4326().m45296(iM8716);
            int iM13169 = m13169(abstractC2599M55818, i3, enumC22631M45296);
            if (iM13169 <= 0) {
                throw new C23044(null, "Invalid instruction size in method %s at offset 0x%x", this, Integer.valueOf(i3));
            }
            long j3 = (((long) iM13169) * j) + ((long) i3);
            if (j3 > i4) {
                throw new C23044(null, "The last instruction in method %s is truncated", this);
            }
            int i6 = i5 + 1;
            if (i5 >= i && enumC22631M45296 != null && enumC22631M45296.f73513 != 7) {
                switch (C20499.f65646[enumC22631M45296.f73508.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        iM8721 = abstractC2599M55818.m8721(i3 + 2);
                        break;
                    case 7:
                        iM8721 = abstractC2599M55818.mo8719(i3 + 2);
                        break;
                    default:
                        iM8721 = -1;
                        break;
                }
                if (iM8721 >= 0) {
                    if (!interfaceC24229.mo43417(i5, enumC22631M45296.f73513, iM8721, enumC22631M45296)) {
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
    public static int m13169(AbstractC2599 abstractC2599, int i, EnumC22631 enumC22631) {
        if (enumC22631 == null) {
            return 1;
        }
        int i2 = C20499.f65647[enumC22631.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return (abstractC2599.m8721(i + 2) * 2) + 4;
            }
            if (i2 == 3) {
                return (abstractC2599.m8721(i + 2) * 4) + 2;
            }
            return enumC22631.f73508.f23142 / 2;
        }
        int iM8721 = abstractC2599.m8721(i + 2);
        if (iM8721 == 0) {
            return 4;
        }
        int iMo8725 = abstractC2599.mo8725(i + 4);
        if (iMo8725 < 0) {
            throw new C23044(null, "Invalid array-payload instruction: negative element count", new Object[0]);
        }
        long j = ((long) iM8721) * ((long) iMo8725);
        if (j > 2147483647L) {
            throw new C23044(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        return ((((int) j) + 1) / 2) + 4;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private int m13171() {
        if (this.f13945 == 0) {
            this.f13945 = this.f13939.m55812(this.f13940);
        }
        return this.f13945;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m13173() {
        if (this.f13943 == 0) {
            C24975 c24975 = this.f13939;
            this.f13943 = c24975.m55796(c24975.m55818().m8721(m13171() + 2));
        }
        return this.f13943;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m13174() {
        if (this.f13941 == -1) {
            this.f13941 = this.f13939.m55818().mo8719(m13173() + 8);
        }
        return this.f13941;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011d A[PHI: r8
      0x011d: PHI (r8v3 l.ܿܽۤ) = (r8v2 l.ܿܽۤ), (r8v4 l.ܿܽۤ) binds: [B:66:0x011b, B:59:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13181(C4091 c4091, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C20528 c20528 = f13938;
        if (this.f13949.getType().equals(c4091.f13949.getType()) && getName().equals(c4091.getName()) && mo6802().equals(c4091.mo6802()) && C22298.m50356(mo6805(), c4091.mo6805()) && this.f13946 == c4091.f13946 && (((this.f13948 == 0 && c4091.f13948 == 0) || C17370.m40803(getAnnotations(), c4091.getAnnotations())) && ((this.f13942 == 7 && c4091.f13942 == 7) || C17370.m40803(mo13176(), c4091.mo13176())))) {
            C7820 c7820Mo13175 = mo13175();
            C7820 c7820Mo13176 = c4091.mo13175();
            boolean z6 = c7820Mo13175 == null || c7820Mo13175.m21298() == 0;
            boolean z7 = c7820Mo13176 == null || c7820Mo13176.m21298() == 0;
            if (z6 && z7) {
                return true;
            }
            if (!z6 && !z7 && (z3 || c7820Mo13175.mo2841() == c7820Mo13176.mo2841())) {
                C5564 c5564 = new C5564();
                c5564.f19336 = false;
                c5564.f19335 = true;
                c5564.f19338 = !z;
                c5564.f19339 = z3;
                c5564.f19340 = z4;
                c5564.f19334 = true;
                c5564.f19333 = z2;
                c5564.f19332 = this.f13939.mo4326().f63286;
                C22718 c22718 = new C22718(c5564, this, c7820Mo13175);
                C22718 c22719 = new C22718(c5564, c4091, c7820Mo13176);
                C18459 c18459M13170 = null;
                try {
                    try {
                        c18459M13170 = m13170(c22718, z5);
                        C12623 c12623 = new C12623(c18459M13170);
                        c22719.m51247(new C3345(c12623, z5));
                        c12623.m31332();
                        c22718.m51250();
                        c22719.m51250();
                        c20528.m47060(c18459M13170);
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace(System.out);
                        c22718.m51250();
                        c22719.m51250();
                        if (c18459M13170 != null) {
                            c20528.m47060(c18459M13170);
                        }
                    } catch (C20828 unused) {
                        c22718.m51250();
                        c22719.m51250();
                        if (c18459M13170 != null) {
                            c20528.m47060(c18459M13170);
                        }
                    }
                } catch (Throwable th) {
                    c22718.m51250();
                    c22719.m51250();
                    if (c18459M13170 != null) {
                        c20528.m47060(c18459M13170);
                    }
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18459 m13170(C22718 c22718, boolean z) {
        C20528 c20528 = f13938;
        C18459 c18459 = (C18459) c20528.m47061();
        if (c18459 == null) {
            c18459 = new C18459();
        } else {
            c18459.m43009(0);
        }
        try {
            c22718.m51247(new C3345(new C0560(c18459), z));
            return c18459;
        } catch (IOException | RuntimeException e) {
            c20528.m47060(c18459);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m13172() {
        f13938.m47062();
    }
}
