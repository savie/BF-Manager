package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes.dex */
public class C23885 implements InterfaceC16470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22438 f77353;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5985 f77354;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21122 f77355;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3747 f77356;

    public C23885(C3747 c3747, C5985 c5985) {
        this.f77356 = c3747;
        this.f77354 = c5985;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53386(C22438 c22438, C21122 c21122) {
        this.f77353 = c22438;
        this.f77355 = c21122;
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public void mo38989(C23930 c23930) {
        AbstractC18884 c20901;
        C18708 c18708M40434 = c23930.m40434();
        if (c18708M40434.m43509() == 54 || c18708M40434.m43509() == 56) {
            return;
        }
        C9012 c9012M40433 = c23930.m40433();
        C0985 c0985M40337 = C17171.m40337(c23930);
        int iM43508 = c18708M40434.m43508();
        if (iM43508 == 1 || iM43508 == 2) {
            c20901 = new C20901(c0985M40337, c9012M40433, C3747.m12173(c23930));
        } else {
            if (iM43508 == 3) {
                return;
            }
            if (iM43508 != 4) {
                if (iM43508 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
                c20901 = new C20901(c0985M40337, c9012M40433, C3747.m12173(c23930));
            } else {
                c20901 = new C24631(c0985M40337, c9012M40433, C3747.m12173(c23930), this.f77356.f12846.m30436(this.f77353.m50590().get(1)));
            }
        }
        m53385(c20901);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public void mo38985(C6030 c6030) {
        C9012 c9012M40433 = c6030.m40433();
        C0985 c0985M40337 = C17171.m40337(c6030);
        C18708 c18708M40434 = c6030.m40434();
        int iM43509 = c18708M40434.m43509();
        if (c18708M40434.m43508() != 1) {
            throw new RuntimeException("shouldn't happen");
        }
        if (iM43509 == 3) {
            C3747 c3747 = this.f77356;
            if (c3747.f12849) {
                return;
            }
            C20946 c20946M40437 = c6030.m40437();
            m53385(new C20901(c0985M40337, c9012M40433, C0063.m1031(c20946M40437, C20946.m47883((c3747.f12847 - c3747.f12850) + ((C15943) c6030.m31552()).mo17877(), c20946M40437.getType()))));
            return;
        }
        m53385(new C18138(c0985M40337, c9012M40433, C3747.m12173(c6030), c6030.m31552()));
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public void mo38984(C2301 c2301) {
        C9012 c9012M40433 = c2301.m40433();
        C24698 c24698M7783 = c2301.m7783();
        C24698 c24698M50590 = this.f77353.m50590();
        int size = c24698M7783.size();
        int size2 = c24698M50590.size();
        int iM50593 = this.f77353.m50593();
        if (size != size2 - 1 || iM50593 != c24698M50590.get(size)) {
            throw new RuntimeException("shouldn't happen");
        }
        C21122[] c21122Arr = new C21122[size];
        for (int i = 0; i < size; i++) {
            c21122Arr[i] = this.f77356.f12846.m30436(c24698M50590.get(i));
        }
        C21122 c21122 = new C21122(c9012M40433, false);
        C21122 c21123 = new C21122(this.f77355.m43799(), true);
        C6731 c6731 = new C6731(c9012M40433, c21123, c24698M7783, c21122Arr);
        AbstractC18884 c24631 = new C24631(c6731.m18814() ? C9187.f29915 : C9187.f29902, c9012M40433, C3747.m12173(c2301), c21122);
        m53385(c21123);
        m53385(c24631);
        m53387(new C13442(c9012M40433));
        m53387(c21122);
        m53387(c6731);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20946 m53384() {
        int iM50593 = this.f77353.m50593();
        if (iM50593 < 0) {
            return null;
        }
        AbstractC17216 abstractC17216M31617get = this.f77356.f12848.m25432().m36044(iM50593).m50596().m31617get(0);
        if (abstractC17216M31617get.m40434().m43509() != 56) {
            return null;
        }
        return abstractC17216M31617get.m40437();
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo39059(C23184 c23184) {
        C9012 c9012M40433 = c23184.m40433();
        C0985 c0985M40337 = C17171.m40337(c23184);
        C18708 c18708M40434 = c23184.m40434();
        if (c18708M40434.m43508() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c18708M40434.m43508());
        }
        if (!c18708M40434.m43505()) {
            throw new RuntimeException("Expected call-like operation");
        }
        m53385(this.f77355);
        m53385(new C15679(c0985M40337, c9012M40433, c23184.m40438(), new AbstractC13487[]{c23184.m52110(), c23184.m52111()}));
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public void mo38987(C8267 c8267) {
        AbstractC18884 c18138;
        AbstractC18884 abstractC18884M17413;
        int iM3867;
        C9012 c9012M40433 = c8267.m40433();
        C0985 c0985M40337 = C17171.m40337(c8267);
        C18708 c18708M40434 = c8267.m40434();
        AbstractC13487 abstractC13487M31552 = c8267.m31552();
        if (c18708M40434.m43508() != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c18708M40434.m43508());
        }
        m53385(this.f77355);
        if (c18708M40434.m43505()) {
            m53385(new C18138(c0985M40337, c9012M40433, c8267.m40438(), abstractC13487M31552));
            return;
        }
        C20946 c20946M53384 = m53384();
        C0063 c0063M12179 = C3747.m12179(c8267, c20946M53384);
        if ((c0985M40337.m3865() || c18708M40434.m43509() == 43) != (c20946M53384 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + c8267);
        }
        if (c18708M40434.m43509() == 41 && c0985M40337.m3867() != 35) {
            c18138 = new C20901(c0985M40337, c9012M40433, c0063M12179);
        } else {
            c18138 = new C18138(c0985M40337, c9012M40433, c0063M12179, abstractC13487M31552);
        }
        C5985 c5985 = this.f77354;
        int iM17419 = c5985.m17419() - 1;
        while (true) {
            if (iM17419 < 0) {
                abstractC18884M17413 = null;
                break;
            }
            abstractC18884M17413 = c5985.m17413(iM17419);
            if (abstractC18884M17413.m43802().m3867() != -1) {
                break;
            } else {
                iM17419--;
            }
        }
        if (c0985M40337.m3867() == 32 && abstractC18884M17413 != null && (((iM3867 = abstractC18884M17413.m43802().m3867()) == 7 || iM3867 == 8 || iM3867 == 9) && c18138.m43795().size() > 0 && abstractC18884M17413.m43795().size() > 1 && c18138.m43795().m31619get(0).m47903() == abstractC18884M17413.m43795().m31619get(1).m47903())) {
            m53385(new C20901(C9187.f29876, c9012M40433, C0063.f947));
        }
        m53385(c18138);
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public void mo38986(C6776 c6776) {
        C9012 c9012M40433 = c6776.m40433();
        C0985 c0985M40337 = C17171.m40337(c6776);
        if (c6776.m40434().m43508() != 6) {
            throw new RuntimeException("shouldn't happen");
        }
        C20946 c20946M53384 = m53384();
        if (c0985M40337.m3865() != (c20946M53384 != null)) {
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + c6776);
        }
        m53385(this.f77355);
        m53385(new C20901(c0985M40337, c9012M40433, C3747.m12179(c6776, c20946M53384)));
    }

    @Override // l.InterfaceC16470
    /* JADX INFO: renamed from: ۙ */
    public final void mo39058(C11249 c11249) {
        C9012 c9012M40433 = c11249.m40433();
        AbstractC13487 abstractC13487M28485 = c11249.m28485();
        ArrayList arrayListM28484 = c11249.m28484();
        if (c11249.m40434().m43508() == 1) {
            C21122 c21122 = new C21122(c9012M40433, false);
            AbstractC18884 c20376 = new C20376(c9012M40433, this.f77355, arrayListM28484, abstractC13487M28485);
            AbstractC18884 c24631 = new C24631(C9187.f29904, c9012M40433, C3747.m12173(c11249), c21122);
            m53385(this.f77355);
            m53385(c24631);
            m53387(new C13442(c9012M40433));
            m53387(c21122);
            m53387(c20376);
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53385(AbstractC18884 abstractC18884) {
        this.f77354.m17414(abstractC18884);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53387(AbstractC18884 abstractC18884) {
        this.f77354.m17417(abstractC18884);
    }
}
