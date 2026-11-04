package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W447 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3605 extends AbstractC0578 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C13477 f12356 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24705 f12357;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11518 f12358;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14764 f12359;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22092 f12360;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7312 f12361;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3168 f12362;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15846 f12363;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0310 f12364;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6147 f12365;

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3605 m11692(C4747 c4747) {
        C3605 c3605 = (C3605) c4747.m14643(f12356);
        return c3605 == null ? new C3605(c4747) : c3605;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m11695(C10377 c10377, C14769 c14769, C14769 c147610, AbstractC8036 abstractC8036, C12510 c12510, C14769 c147611, C3168 c3168) {
        AbstractC22664 abstractC22664;
        C14769 c14769M37794 = this.f12363.m37794(c14769, c3168);
        C0310 c0310 = this.f12364;
        c0310.m1959(c14769, c3168, true);
        C18499 c18499 = new C18499();
        for (C14769 c147612 = c147610; c147612.m35550(); c147612 = c147612.f48336) {
            m11696((AbstractC8036) c147612.f48335, c3168);
            c18499.m43089(((C12510) c147612.f48335).f40166.f26659);
        }
        C14764 c14764 = this.f12359;
        AbstractC22664 abstractC22664M1981 = abstractC8036 == null ? c14764.f48251 : c0310.m1981(abstractC8036, c3168, AbstractC22664.f73590);
        if (c12510 != null) {
            m11696((AbstractC8036) c12510, c3168);
            abstractC22664 = c12510.f40166.f26659;
        } else {
            abstractC22664 = null;
        }
        C18499 c184910 = new C18499();
        for (C14769 c147613 = c147611; c147613.m35550(); c147613 = c147613.f48336) {
            AbstractC22664 abstractC22664M1982 = c0310.m1981((AbstractC8036) c147613.f48335, c3168, AbstractC22664.f73590);
            if (!abstractC22664M1982.m51067(EnumC21172.TYPEVAR)) {
                AbstractC22295 abstractC22295 = (AbstractC22295) c147613.f48335;
                abstractC22295.getClass();
                abstractC22664M1982 = this.f12360.m50044(abstractC22295, abstractC22664M1982);
            } else {
                AbstractC22970 abstractC22970 = abstractC22664M1982.f73596;
                if (abstractC22970.f38069 == c10377) {
                    abstractC22970.f38071 |= 140737488355328L;
                }
            }
            c184910.m43089(abstractC22664M1982);
        }
        C23191 c23191 = new C23191(c18499.m43093(), abstractC22664M1981, c184910.m43093(), c14764.f48275);
        c23191.f75158 = abstractC22664;
        return c14769M37794.isEmpty() ? c23191 : new C5291(c23191, c14769M37794);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11696(AbstractC8036 abstractC8036, C3168 c3168) {
        C3168 c3169 = this.f12362;
        try {
            this.f12362 = c3168;
            abstractC8036.mo2284(this);
        } catch (C21566 e) {
            C22092 c22092 = this.f12360;
            abstractC8036.getClass();
            c22092.m49966(abstractC8036, e);
        } finally {
            this.f12362 = c3169;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) throws Throwable {
        InterfaceC5075 interfaceC5075;
        C3168 c3168 = this.f12362;
        this.f12363.getClass();
        AbstractC17836 abstractC17836M37792 = C15846.m37792(c3168);
        C10377 c10377 = new C10377(0L, c6633.f22150, null, abstractC17836M37792.f53083);
        c10377.f38071 = this.f12360.m49959(c6633, c6633.f22144.f15825, c10377, c6633);
        c6633.f22152 = c10377;
        if ((c6633.f22144.f15825 & 8796093022208L) != 0) {
            c10377.f38069.f38071 |= 8796093022208L;
        }
        final C3168 c3168M11694 = m11694(c6633, this.f12362);
        C6147 c6147 = this.f12365;
        InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) c6633);
        try {
            interfaceC5075 = interfaceC5075M17747;
            try {
                c10377.f38067 = m11695(c10377, c6633.f22154, c6633.f22145, c6633.f22147, c6633.f22149, c6633.f22146, c3168M11694);
                c6147.m17747(interfaceC5075);
                if (this.f12357.m55113(c10377)) {
                    c10377.f38071 |= 70368744177664L;
                }
                C18499 c18499 = new C18499();
                C12510 c12510 = null;
                for (C14769 c14769 = c6633.f22145; c14769.m35550(); c14769 = c14769.f48336) {
                    c12510 = (C12510) c14769.f48335;
                    C5816 c5816 = c12510.f40168;
                    C11972.m30021(c5816);
                    c18499.m43089(c5816);
                }
                c10377.f33013 = c18499.m43093();
                if (c12510 != null && (c12510.f40170.f15825 & 17179869184L) != 0) {
                    c10377.f38071 |= 17179869184L;
                }
                ((C7768) c3168M11694.f10272).f25562.mo7484();
                if (this.f12360.m50020(c6633, c10377, abstractC17836M37792)) {
                    abstractC17836M37792.mo7481(c10377);
                }
                C14769 c147610 = c6633.f22144.f15824;
                final C11518 c11518 = this.f12358;
                c11518.m28997(c147610, c3168M11694, c10377, c6633);
                c11518.m28996(c6633, c3168M11694, c10377, c6633);
                if (c6633.f22151 != null) {
                    c10377.f33011 = c11518.m29001();
                    final AbstractC22295 abstractC22295 = c6633.f22151;
                    c11518.m28995(new RunnableC3997(c11518, c3168M11694, c6633, abstractC22295, c10377));
                    c11518.m29005(new Runnable() { // from class: l.ۜ֨᩺
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11518.m28987(c11518, c3168M11694, abstractC22295);
                        }
                    });
                }
            } catch (Throwable th) {
                th = th;
                c6147.m17747(interfaceC5075);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC5075 = interfaceC5075M17747;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3168 m11694(C6633 c6633, C3168 c3168) {
        C7768 c7768 = (C7768) c3168.f10272;
        C3168 c3168M10350 = c3168.m10350(c6633, c7768.m21146(c7768.f25562.mo7486(c6633.f22152)));
        Object obj = c3168M10350.f10272;
        c3168M10350.f10277 = c6633;
        if (c6633.f22152.f38067 != null) {
            C0310 c0310 = this.f12364;
            C17359.requireNonNull(c0310);
            ((C7768) obj).f25564 = new C14479(c0310, C22114.f71281, c6633.f22152.f38067.mo31585());
        }
        if ((c6633.f22144.f15825 & 8) != 0) {
            ((C7768) obj).f25554++;
        }
        ((C7768) obj).f25559 = null;
        return c3168M10350;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(final C12510 c12510) {
        AbstractC22664 abstractC22664;
        C3168 c3168M10350 = this.f12362;
        boolean z = true;
        if ((c12510.f40170.f15825 & 8) != 0 || (((C7768) c3168M10350.f10272).f25562.f53083.mo29591() & 512) != 0) {
            C3168 c3168 = this.f12362;
            C7768 c7768 = (C7768) c3168.f10272;
            c3168M10350 = c3168.m10350(c12510, c7768.m21146(c7768.f25562));
            ((C7768) c3168M10350.f10272).f25554++;
        }
        C3168 c3169 = c3168M10350;
        C6147 c6147 = this.f12365;
        InterfaceC5075 interfaceC5075M17747 = c6147.m17747((InterfaceC5075) c12510);
        try {
            boolean zM28347 = C11239.m28347(c12510);
            C0310 c0310 = this.f12364;
            if (zM28347) {
                C5887 c5887 = (C5887) c12510.f40166;
                c0310.getClass();
                C0310.m1904(c3169, c5887);
            } else if (!c12510.m31064()) {
                AbstractC22295 abstractC22295 = c12510.f40166;
                c0310.getClass();
                c0310.m1981(abstractC22295, c3169, AbstractC22664.f73590);
                if (!c12510.m21911(EnumC21461.f68538) || c12510.f40169 == null) {
                    z = false;
                }
                if (z) {
                    m11698(c12510, c3169);
                }
            }
            c6147.m17747(interfaceC5075M17747);
            if ((c12510.f40170.f15825 & 17179869184L) != 0) {
                AbstractC22295 abstractC22296 = c12510.f40166;
                abstractC22296.f26659 = ((C2832) abstractC22296.f26659).m9327();
            }
            C3168 c31610 = this.f12362;
            this.f12363.getClass();
            AbstractC17836 abstractC17836M37792 = C15846.m37792(c31610);
            if (c12510.m31064()) {
                abstractC22664 = ((C7768) this.f12362.f10272).f25562.f53083.f38066 == EnumC13603.f43218 ? AbstractC22664.f73590 : this.f12359.f48263;
            } else {
                abstractC22664 = c12510.f40166.f26659;
            }
            final C5816 c5816 = new C5816(0L, c12510.f40164, abstractC22664, abstractC17836M37792.f53083);
            long jM49959 = this.f12360.m49959(c12510, c12510.f40170.f15825, c5816, c12510);
            c5816.f38071 = jM49959;
            c12510.f40168 = c5816;
            AbstractC22295 abstractC22297 = c12510.f40171;
            if (abstractC22297 != null) {
                long j = jM49959 | 262144;
                c5816.f38071 = j;
                if ((j & 16) != 0) {
                    C23743 c23743 = new C23743();
                    abstractC22297.mo2284(c23743);
                    if (c23743.f76953) {
                        C18955 c18955M11693 = m11693(c12510, this.f12362);
                        ((C7768) c18955M11693.f10272).f25557 = c5816;
                        final C18955 c18955M11694 = m11693(c12510, c18955M11693);
                        final C3168 c31611 = this.f12362;
                        final C0310 c0311 = this.f12364;
                        c5816.m16955(new Callable() { // from class: l.ܳܿ᩺
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return c0311.m1924(c18955M11694, c31611, c12510, c5816.f38067);
                            }
                        });
                    }
                }
            }
            C22092 c22092 = this.f12360;
            if (c22092.m50020((InterfaceC5075) c12510, (AbstractC11781) c5816, abstractC17836M37792)) {
                c22092.m49981((InterfaceC5075) c12510, c5816, abstractC17836M37792);
                abstractC17836M37792.mo7481(c5816);
            } else if (c5816.f38069.f38066 == EnumC13603.f43218 || (c5816.f38071 & 2305843009230471186L) != 0) {
                abstractC17836M37792.mo7481(c5816);
            }
            C14769 c14769 = c12510.f40170.f15824;
            C11518 c11518 = this.f12358;
            c11518.m28997(c14769, c3169, c5816, c12510);
            if (!c12510.m31064()) {
                c11518.m28996(c12510.f40166, c3169, c5816, c12510);
            }
            c5816.f19997 = c12510.f26658;
        } catch (Throwable th) {
            c6147.m17747(interfaceC5075M17747);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11697(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, C11040 c11040) {
        if (abstractC8036.f26659.mo9329() || this.f12357.m55149(abstractC8036.f26659, abstractC22664)) {
            return;
        }
        this.f12361.m34520(abstractC8036, c11040);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11698(C12510 c12510, C3168 c3168) {
        AbstractC22295 abstractC22295 = c12510.f40169;
        C0310 c0310 = this.f12364;
        c0310.m1933(abstractC22295, c3168, c0310.f1687);
        C10377 c10377 = c3168.f10277.f22152;
        if (c10377.m29570()) {
            AbstractC22664 abstractC22664 = c10377.f38069.f38069.f38067;
            if (abstractC22664.m51067(EnumC21172.METHOD)) {
                abstractC22664 = c10377.f38069.f38069.f38069.f38067;
            }
            if (abstractC22664.m51067(EnumC21172.CLASS)) {
                AbstractC22295 abstractC22296 = c12510.f40166;
                AbstractC22664 abstractC22665 = abstractC22296.f26659;
                C11040 c11040 = C22843.f74058;
                m11697(abstractC22296, abstractC22664, new C11040("compiler", "incorrect.constructor.receiver.type", abstractC22664, abstractC22665));
                AbstractC22295 abstractC22297 = c12510.f40169;
                m11697(abstractC22297, abstractC22664, new C11040("compiler", "incorrect.constructor.receiver.name", abstractC22664, abstractC22297.f26659));
                return;
            }
            this.f12361.m34520(c12510, C22843.f74077);
            return;
        }
        AbstractC22295 abstractC22298 = c12510.f40166;
        AbstractC22664 abstractC22666 = c10377.f38069.f38067;
        AbstractC22664 abstractC22667 = abstractC22298.f26659;
        C11040 c11041 = C22843.f74058;
        m11697(abstractC22298, abstractC22666, new C11040("compiler", "incorrect.receiver.type", abstractC22666, abstractC22667));
        AbstractC22295 abstractC22299 = c12510.f40169;
        AbstractC22664 abstractC22668 = c10377.f38069.f38067;
        m11697(abstractC22299, abstractC22668, new C11040("compiler", "incorrect.receiver.name", abstractC22668, abstractC22299.f26659));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18955 m11693(C12510 c12510, C3168 c3168) {
        C7768 c7768 = (C7768) c3168.f10272;
        C7768 c7768M21146 = c7768.m21146(c7768.f25562);
        C18955 c18955 = new C18955(c12510, c7768M21146);
        c18955.f10274 = c3168;
        c18955.f10278 = c3168.f10278;
        c18955.f10275 = c3168.f10275;
        c18955.f10279 = c3168.f10279;
        c18955.f10277 = c3168.f10277;
        C5816 c5816 = c12510.f40168;
        if (c5816.f38069.f38066 == EnumC13603.f43213) {
            c7768M21146.f25562 = ((C7768) c3168.f10272).f25562.mo7486(c5816);
        }
        if ((c12510.f40170.f15825 & 8) == 0) {
            C24550 c24550 = c3168.f10279.f26345;
            c24550.mo29590();
            if ((c24550.f38071 & 512) == 0 || c3168.f10277 != null) {
                return c18955;
            }
        }
        c7768M21146.f25554++;
        return c18955;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1957(C13891 c13891) {
        C14769 c14769 = c13891.f44048;
        if (c14769 != null) {
            C3168 c3168 = this.f12362;
            while (c14769.m35550()) {
                m11696((AbstractC8036) c14769.f48335, c3168);
                c14769 = c14769.f48336;
            }
        }
    }

    public C3605(C4747 c4747) {
        c4747.m14646(f12356, this);
        this.f12363 = C15846.m37791(c4747);
        this.f12361 = C7312.m20023(c4747);
        this.f12360 = C22092.m49912(c4747);
        this.f12364 = C0310.m1899(c4747);
        this.f12359 = C14764.m35506(c4747);
        this.f12358 = C11518.m28979(c4747);
        this.f12357 = C24705.m55066(c4747);
        this.f12365 = C6147.m17745(c4747);
    }
}
