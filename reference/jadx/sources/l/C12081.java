package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۫֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12081 extends AbstractC15254 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7141 f40423;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13843 f40424;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6143 f40425;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2283 f40426;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16314 f40427;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17432 f40428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f40429;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6143 f40430;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return 32;
    }

    public C12081(C6143 c6143, int i, C6143 c6144, InterfaceC14093 interfaceC14093, C17432 c17432) {
        if (c6143 == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC14093 == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f40430 = c6143;
        this.f40429 = i;
        this.f40425 = c6144;
        this.f40426 = interfaceC14093.size() == 0 ? null : new C2283(interfaceC14093);
        this.f40428 = c17432;
        this.f40427 = new C16314(c6143);
        this.f40424 = null;
        this.f40423 = new C7141();
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_CLASS_DEF_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C11457 c11457M12877 = c4669.m12877();
        C16665 c16665M12873 = c4669.m12873();
        C16665 c16665M12878 = c4669.m12878();
        C16665 c16665M12887 = c4669.m12887();
        C4400 c4400M12886 = c4669.m12886();
        c11457M12877.m28604(this.f40430);
        C16314 c16314 = this.f40427;
        if (!c16314.m38480()) {
            c4669.m12880().m39128((AbstractC12432) c16314);
            C13905 c13905M38481 = c16314.m38481();
            if (c13905M38481 != null) {
                this.f40424 = (C13843) c16665M12873.m39130(new C13843(c13905M38481));
            }
        }
        C6143 c6143 = this.f40425;
        if (c6143 != null) {
            c11457M12877.m28604(c6143);
        }
        C2283 c2283 = this.f40426;
        if (c2283 != null) {
            this.f40426 = (C2283) c16665M12887.m39130(c2283);
        }
        C17432 c17432 = this.f40428;
        if (c17432 != null) {
            c4400M12886.m12268(c17432);
        }
        if (this.f40423.m19044()) {
            return;
        }
        if (this.f40423.m19043()) {
            this.f40423 = (C7141) c16665M12878.m39130(this.f40423);
        } else {
            c16665M12878.m39128((AbstractC12432) this.f40423);
        }
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        boolean zM8288 = c2718.m8288();
        C11457 c11457M12877 = c4669.m12877();
        C6143 c6143 = this.f40430;
        int iM28601 = c11457M12877.m28601(c6143);
        C6143 c6144 = this.f40425;
        int iM28602 = c6144 == null ? -1 : c11457M12877.m28601(c6144);
        C2283 c2283 = this.f40426;
        int iM30904 = c2283 == null ? 0 : c2283.m30904();
        int iM30905 = this.f40423.m19044() ? 0 : this.f40423.m30904();
        C17432 c17432 = this.f40428;
        int iM12264 = c17432 != null ? c4669.m12886().m12264(c17432) : -1;
        C16314 c16314 = this.f40427;
        int iM30906 = c16314.m38480() ? 0 : c16314.m30904();
        C13843 c13843 = this.f40424;
        int iM30907 = c13843 == null ? 0 : c13843.m30904();
        int i = this.f40429;
        if (zM8288) {
            c2718.m8283(0, m36532() + ' ' + c6143.mo2376());
            c2718.m8283(4, "  class_idx:           ".concat(C22475.m49978(iM28601)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(C4961.m13746(i));
            c2718.m8283(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(C22475.m49978(iM28602));
            sb2.append(" // ");
            sb2.append(c6144 == null ? "<none>" : c6144.mo2376());
            c2718.m8283(4, sb2.toString());
            c2718.m8283(4, "  interfaces_off:      ".concat(C22475.m49978(iM30904)));
            if (iM30904 != 0) {
                InterfaceC14093 interfaceC14093M6993 = this.f40426.m6993();
                int i2 = 0;
                for (int size = interfaceC14093M6993.size(); i2 < size; size = size) {
                    c2718.m8283(0, ASN1Dump.TAB + interfaceC14093M6993.getType(i2).mo2376());
                    i2++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(C22475.m49978(iM12264));
            sb3.append(" // ");
            sb3.append(c17432 != null ? c17432.mo2376() : "<none>");
            c2718.m8283(4, sb3.toString());
            c2718.m8283(4, "  annotations_off:     ".concat(C22475.m49978(iM30905)));
            c2718.m8283(4, "  class_data_off:      ".concat(C22475.m49978(iM30906)));
            c2718.m8283(4, "  static_values_off:   ".concat(C22475.m49978(iM30907)));
        }
        c2718.m8289(iM28601);
        c2718.m8289(i);
        c2718.m8289(iM28602);
        c2718.m8289(iM30904);
        c2718.m8289(iM12264);
        c2718.m8289(iM30905);
        c2718.m8289(iM30906);
        c2718.m8289(iM30907);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6143 m30064() {
        return this.f40430;
    }

    /* JADX INFO: renamed from: ۬ۨ, reason: not valid java name and contains not printable characters */
    public final C6143 m30065() {
        return this.f40425;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 m30067() {
        C2283 c2283 = this.f40426;
        if (c2283 == null) {
            return C9672.f32573;
        }
        return c2283.m6993();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30060(C11726 c11726, AbstractC9901 abstractC9901) {
        this.f40427.m38478(c11726, abstractC9901);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30059(C11726 c11726) {
        this.f40427.m38477(c11726);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30058(C5375 c5375) {
        this.f40427.m38476(c5375);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30066(C5375 c5375) {
        this.f40427.m38479(c5375);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30057(C1661 c1661, C4669 c4669) {
        this.f40423.m19038(c1661, c4669);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30063(C23077 c23077, C1661 c1661, C4669 c4669) {
        this.f40423.m19041(c23077, c1661, c4669);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30061(C20255 c20255, C1661 c1661, C4669 c4669) {
        this.f40423.m19039(c20255, c1661, c4669);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30062(C20255 c20255, C9424 c9424, C4669 c4669) {
        this.f40423.m19040(c20255, c9424, c4669);
    }
}
