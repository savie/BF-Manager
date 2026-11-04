package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public class C13608 extends AbstractC2422 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7926 f43227;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14769 f43228;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25301 f43229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 f43230;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f43231;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
    }

    @Override // l.AbstractC2422
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1538() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33358() {
        C9133 c9133 = (C9133) this.f7757.m43092();
        while (c9133 != null) {
            AbstractC8036 abstractC8036 = c9133.f29691;
            boolean z = c9133 instanceof C6897;
            C25301 c25301 = this.f43229;
            if (z) {
                AbstractC22664 abstractC22664 = ((C6897) c9133).f22873;
                C7926 c7926 = this.f43227;
                if (c7926 != null && c7926.f26658 == abstractC8036.f26658) {
                    C7312 c7312 = c25301.f81714;
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(abstractC8036, new C11040("compiler", "unreported.exception.default.constructor", abstractC22664));
                } else if (abstractC8036.m21911(EnumC21461.f68538)) {
                    C12510 c12510 = (C12510) abstractC8036;
                    if (c12510.f40168.m16956()) {
                        C7312 c7313 = c25301.f81714;
                        AbstractC19728 abstractC19728 = c12510.f40168.f38072;
                        C11040 c11041 = C22843.f74058;
                        c7313.m34520(abstractC8036, new C11040("compiler", "unreported.exception.implicit.close", abstractC22664, abstractC19728));
                    } else {
                        C7312 c7314 = c25301.f81714;
                        C11040 c11042 = C22843.f74058;
                        c7314.m34520(abstractC8036, new C11040("compiler", "unreported.exception.need.to.catch.or.throw", abstractC22664));
                    }
                } else {
                    C7312 c7315 = c25301.f81714;
                    C11040 c11043 = C22843.f74058;
                    c7315.m34520(abstractC8036, new C11040("compiler", "unreported.exception.need.to.catch.or.throw", abstractC22664));
                }
            } else {
                C7312 c7316 = c25301.f81714;
                abstractC8036.getClass();
                C11972.m30026(c7316.m20042(abstractC8036));
            }
            c9133 = (C9133) this.f7757.m43092();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33357(AbstractC22664 abstractC22664, AbstractC8036 abstractC8036) {
        boolean zM50054;
        C25301 c25301 = this.f43229;
        C22092 c22092 = c25301.f81711;
        c22092.getClass();
        boolean z = true;
        try {
            zM50054 = c22092.m50054(abstractC22664);
        } catch (C21566 e) {
            c22092.m49966(abstractC8036, e);
            zM50054 = true;
        }
        if (zM50054) {
            return;
        }
        C22092 c22093 = c25301.f81711;
        C14769 c14769 = this.f43230;
        if (!c22093.m50054(abstractC22664) && !c22093.m50059(abstractC22664, c14769)) {
            z = false;
        }
        if (!z) {
            C18499 c18499 = this.f7757;
            C6897 c6897 = new C6897(abstractC8036);
            c6897.f22873 = abstractC22664;
            c18499.m43089(c6897);
        }
        this.f43228 = c25301.f81711.m50043(abstractC22664, this.f43228);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1505(C7926 c7926) {
        if (c7926.f26345 == null) {
            return;
        }
        C7926 c7927 = this.f43227;
        C14769 c14769M50039 = this.f43228;
        C14769 c14769 = this.f43230;
        C18499 c18499 = this.f7757;
        C25301 c25301 = this.f43229;
        C15400 c15400 = c25301.f81715;
        boolean z = c7926.f26346 == c25301.f81710.f49799;
        this.f7757 = new C18499();
        if (!z) {
            this.f43230 = C14769.m35543();
        }
        this.f43227 = c7926;
        this.f43228 = C14769.m35543();
        c25301.f81715 = c25301.f81715.m36876(c7926.f26345);
        try {
            for (C14769 c147610 = c7926.f26344; c147610.m35550(); c147610 = c147610.f48336) {
                if (!((AbstractC8036) c147610.f48335).m21911(EnumC21461.f68505) && (C11239.m28344((AbstractC8036) c147610.f48335) & 8) != 0) {
                    mo5474((AbstractC8036) c147610.f48335);
                    m33358();
                }
            }
            if (!z) {
                boolean z2 = true;
                for (C14769 c147611 = c7926.f26344; c147611.m35550(); c147611 = c147611.f48336) {
                    if (C11239.m28318((AbstractC8036) c147611.f48335)) {
                        C14769 c14769Mo50622 = ((C6633) c147611.f48335).f22152.f38067.mo50622();
                        if (z2) {
                            this.f43230 = c14769Mo50622;
                            z2 = false;
                        } else {
                            this.f43230 = c25301.f81711.m50029(c14769Mo50622, this.f43230);
                        }
                    }
                }
            }
            for (C14769 c147612 = c7926.f26344; c147612.m35550(); c147612 = c147612.f48336) {
                if (!((AbstractC8036) c147612.f48335).m21911(EnumC21461.f68505) && (C11239.m28344((AbstractC8036) c147612.f48335) & 8) == 0) {
                    mo5474((AbstractC8036) c147612.f48335);
                    m33358();
                }
            }
            if (z) {
                for (C14769 c147613 = c7926.f26344; c147613.m35550(); c147613 = c147613.f48336) {
                    if (C11239.m28348((AbstractC8036) c147613.f48335)) {
                        C6633 c6633 = (C6633) c147613.f48335;
                        mo5474(c6633);
                        c6633.f22146 = c25301.f81713.m37562(this.f43228);
                        c6633.f22152.f38067 = c25301.f81718.m55159(c6633.f22152.f38067, this.f43228);
                    }
                }
                c14769M50039 = c25301.f81711.m50039(this.f43228, c14769M50039);
            }
            for (C14769 c147614 = c7926.f26344; c147614.m35550(); c147614 = c147614.f48336) {
                if ((!z || !C11239.m28348((AbstractC8036) c147614.f48335)) && ((AbstractC8036) c147614.f48335).m21911(EnumC21461.f68505)) {
                    mo5474((AbstractC8036) c147614.f48335);
                    m33358();
                }
            }
            this.f43228 = c14769M50039;
        } finally {
            this.f7757 = c18499;
            this.f43230 = c14769;
            this.f43227 = c7927;
            c25301.f81715 = c15400;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        boolean z;
        if (c6633.f22148 == null) {
            return;
        }
        C14769 c14769 = this.f43230;
        C14769 c14769Mo50622 = c6633.f22152.f38067.mo50622();
        C25301 c25301 = this.f43229;
        C15400 c15400 = c25301.f81715;
        c25301.f81715 = c25301.f81715.m36876(c6633.f22152);
        C11972.m30026(this.f7757.isEmpty());
        try {
            for (C14769 c147610 = c6633.f22145; c147610.m35550(); c147610 = c147610.f48336) {
                mo5474((C12510) c147610.f48335);
            }
            if (C11239.m28318(c6633)) {
                this.f43230 = c25301.f81711.m50039(this.f43230, c14769Mo50622);
            } else if ((c6633.f22152.f38071 & 1048584) != 1048576) {
                this.f43230 = c14769Mo50622;
            }
            mo5474(c6633.f22148);
            C14769 c14769M43093 = this.f7757.m43093();
            this.f7757 = new C18499();
            while (c14769M43093.m35550()) {
                C9133 c9133 = (C9133) c14769M43093.f48335;
                c14769M43093 = c14769M43093.f48336;
                if (!(c9133 instanceof C6897)) {
                    if (!c9133.f29691.m21911(EnumC21461.f68460)) {
                        C7312 c7312 = c25301.f81714;
                        AbstractC8036 abstractC8036 = c9133.f29691;
                        abstractC8036.getClass();
                        z = c7312.m20042(abstractC8036);
                    }
                    C11972.m30026(z);
                } else {
                    this.f7757.m43089(c9133);
                }
            }
        } finally {
            this.f43230 = c14769;
            c25301.f81715 = c15400;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        if (c12510.f40171 != null) {
            C25301 c25301 = this.f43229;
            C15400 c15400 = c25301.f81715;
            c25301.f81715 = c25301.f81715.m36876(c12510.f40168);
            try {
                mo5474(c12510.f40171);
            } finally {
                c25301.f81715 = c15400;
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        m52092(c4197.f15344);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(c8671.f28313);
        m8185(c8671);
        mo5474(c8671.f28314);
        m8182(c8671, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(c6545.f21979);
        mo5474(c6545.f21978);
        m8185(c6545);
        m8182(c6545, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        C18499 c18499 = this.f7757;
        m52092(c20057.f64457);
        this.f7757 = new C18499();
        AbstractC22295 abstractC22295 = c20057.f64458;
        if (abstractC22295 != null) {
            mo5474(abstractC22295);
        }
        mo5474(c20057.f64456);
        m8185(c20057);
        m52092(c20057.f64455);
        m8182(c20057, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1504(C7180 c7180) {
        mo1513(c7180.f23710);
        C18499 c18499 = this.f7757;
        mo5474(c7180.f23711);
        this.f7757 = new C18499();
        mo5474(c7180.f23709);
        m8185(c7180);
        m8182(c7180, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1520(C17073 c17073) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(c17073.f55742);
        m8182(c17073, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        m33354(c15493, c15493.f50422, c15493.f50421);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        m33354(c13256, c13256.f42352, c13256.f42355);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33354(AbstractC8036 abstractC8036, AbstractC22295 abstractC22295, C14769 c14769) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(abstractC22295);
        while (c14769.m35550()) {
            C21351 c21351 = (C21351) c14769.f48335;
            m52092(c21351.f68007);
            m52092(c21351.f68009);
            c14769 = c14769.f48336;
        }
        if (abstractC8036.m21911(EnumC21461.f68531)) {
            m8186(abstractC8036, c18499);
        } else {
            m8182(abstractC8036, c18499);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        C25301 c25301;
        C14769 c14769Of;
        C14769 c14769;
        Iterator it;
        C14769 c147610;
        C14769 c147611;
        boolean zM50054;
        C25213 c25213;
        C14769<AbstractC22664> c14769Of2;
        C14769 c14769Of3;
        C14769 c147612 = this.f43230;
        C14769 c147613 = this.f43228;
        this.f43228 = C14769.m35543();
        C14769 c147614 = c11764.f38025;
        while (true) {
            boolean zM35550 = c147614.m35550();
            c25301 = this.f43229;
            if (!zM35550) {
                break;
            }
            if (((C0468) c147614.f48335).f2080.f40166.m21911(EnumC21461.f68499)) {
                c14769Of3 = ((C23699) ((C0468) c147614.f48335).f2080.f40166).f76826;
            } else {
                c14769Of3 = C14769.of((Object) ((C0468) c147614.f48335).f2080.f40166);
            }
            Iterator it2 = c14769Of3.iterator();
            while (it2.hasNext()) {
                this.f43230 = c25301.f81711.m50043(((AbstractC22295) it2.next()).f26659, this.f43230);
            }
            c147614 = c147614.f48336;
        }
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        for (AbstractC8036 abstractC8036 : c11764.f38023) {
            if (abstractC8036 instanceof C12510) {
                mo1513((C12510) abstractC8036);
            } else if (abstractC8036 instanceof AbstractC22295) {
                mo5474((AbstractC22295) abstractC8036);
            } else {
                throw new AssertionError(c11764);
            }
        }
        Iterator it3 = c11764.f38023.iterator();
        while (true) {
            boolean z = false;
            if (!it3.hasNext()) {
                break;
            }
            AbstractC8036 abstractC8037 = (AbstractC8036) it3.next();
            if (abstractC8037.f26659.mo18914()) {
                c14769Of2 = c25301.f81718.m55144(abstractC8037.f26659).m35552(c25301.f81718.m55137(abstractC8037.f26659));
            } else {
                c14769Of2 = C14769.of((Object) abstractC8037.f26659);
            }
            for (AbstractC22664 abstractC22664 : c14769Of2) {
                if (c25301.f81718.m55157(c25301.f81712.f48280.f73596, abstractC22664) != null) {
                    C22010 c22010 = c25301.f81708;
                    C3168 c3168 = c25301.f81716;
                    AbstractC22664 abstractC22664M55161 = c25301.f81718.m55161(abstractC22664, z);
                    AbstractC19728 abstractC19728 = c25301.f81710.f49781;
                    C14769 c14769M35543 = C14769.m35543();
                    C14769 c14769M35544 = C14769.m35543();
                    c22010.getClass();
                    AbstractC8036 abstractC8038 = abstractC8037;
                    AbstractC11781 abstractC11781M49772 = c22010.m49772(c11764, c3168, abstractC22664M55161.f73596, abstractC22664M55161, abstractC19728, c14769M35543, c14769M35544);
                    AbstractC22664 abstractC22664M55126 = c25301.f81718.m55126(abstractC11781M49772, abstractC8038.f26659);
                    if (abstractC11781M49772.f38066 == EnumC13603.f43218) {
                        Iterator it4 = abstractC22664M55126.mo50622().iterator();
                        while (it4.hasNext()) {
                            m33357((AbstractC22664) it4.next(), abstractC8038);
                        }
                    }
                    abstractC8037 = abstractC8038;
                    z = false;
                }
            }
        }
        mo5474(c11764.f38022);
        C14769 c14769M50039 = c25301.f81711.m50039(this.f43228, C14769.of((Object) c25301.f81712.f48254, (Object) c25301.f81712.f48301));
        this.f43228 = c147613;
        this.f43230 = c147612;
        C14769 c14769M35545 = C14769.m35543();
        C14769 c147615 = c11764.f38025;
        while (c147615.m35550()) {
            C12510 c12510 = ((C0468) c147615.f48335).f2080;
            if (c12510.f40166.m21911(EnumC21461.f68499)) {
                c14769Of = ((C23699) ((C0468) c147615.f48335).f2080.f40166).f76826;
            } else {
                c14769Of = C14769.of((Object) ((C0468) c147615.f48335).f2080.f40166);
            }
            C14769 c14769M35546 = C14769.m35543();
            C14769 c14769M50042 = c25301.f81711.m50042(c14769M50039, c14769M35545);
            Iterator it5 = c14769Of.iterator();
            C14769 c14769M50043 = c14769M35545;
            C14769 c147616 = c14769M35546;
            while (it5.hasNext()) {
                AbstractC8036 abstractC8039 = (AbstractC22295) it5.next();
                AbstractC22664 abstractC22665 = abstractC8039.f26659;
                if (abstractC22665 != c25301.f81712.f48248) {
                    C14769 c14769M35547 = c147616.m35546(abstractC22665);
                    it = it5;
                    if (c25301.f81718.m55149(abstractC22665, c25301.f81712.f48286)) {
                        c14769 = c14769Of;
                        c147610 = c147613;
                        c147616 = c14769M35547;
                    } else {
                        if (c14769Of.m35551() <= 1) {
                            abstractC8039 = (C0468) c147615.f48335;
                            abstractC8039.getClass();
                        }
                        if (c25301.f81711.m50059(abstractC22665, c14769M50043)) {
                            C7312 c7312 = c25301.f81714;
                            C11040 c11040 = C22843.f74058;
                            c14769 = c14769Of;
                            c147611 = c14769M35547;
                            c147610 = c147613;
                            c7312.m34520(abstractC8039, new C11040("compiler", "except.already.caught", abstractC22665));
                        } else {
                            c14769 = c14769Of;
                            c147610 = c147613;
                            c147611 = c14769M35547;
                            C22092 c22092 = c25301.f81711;
                            c22092.getClass();
                            try {
                                zM50054 = c22092.m50054(abstractC22665);
                            } catch (C21566 e) {
                                c22092.m49966(abstractC8039, e);
                                zM50054 = true;
                            }
                            if (!zM50054 && !m33355(abstractC22665) && !c25301.f81711.m50035(abstractC22665, c14769M50039)) {
                                C7312 c7313 = c25301.f81714;
                                C11040 c11041 = C22843.f74058;
                                c7313.m34520(abstractC8039, new C11040("compiler", "except.never.thrown.in.try", abstractC22665));
                            } else {
                                C14769 c14769M50029 = c25301.f81711.m50029(C14769.of((Object) abstractC22665), c14769M50039);
                                if (c25301.f81711.m50042(c14769M50029, c14769M50043).isEmpty() && !m33355(abstractC22665)) {
                                    if (c14769M50029.m35551() == 1) {
                                        C25213 c25214 = C13146.f42046;
                                        c25213 = new C25213("compiler", "unreachable.catch", c14769M50029);
                                    } else {
                                        C25213 c25215 = C13146.f42046;
                                        c25213 = new C25213("compiler", "unreachable.catch.1", c14769M50029);
                                    }
                                    c25301.f81714.m34531(abstractC8039, c25213);
                                }
                            }
                        }
                        c14769M50043 = c25301.f81711.m50043(abstractC22665, c14769M50043);
                        c147616 = c147611;
                    }
                } else {
                    c14769 = c14769Of;
                    it = it5;
                    c147610 = c147613;
                }
                it5 = it;
                c14769Of = c14769;
                c147613 = c147610;
            }
            mo5474(c12510);
            this.f43231.put(c12510.f40168, c25301.f81711.m50029(c147616, c14769M50042));
            mo5474(((C0468) c147615.f48335).f2079);
            this.f43231.remove(c12510.f40168);
            c147615 = c147615.f48336;
            c14769M35545 = c14769M50043;
        }
        C14769 c147617 = c147613;
        if (c11764.f38024 != null) {
            C14769 c147618 = this.f43228;
            this.f43228 = C14769.m35543();
            C18499 c184910 = this.f7757;
            this.f7757 = c18499;
            mo5474(c11764.f38024);
            if (!c11764.f38021) {
                this.f43228 = c25301.f81711.m50039(this.f43228, c147617);
                return;
            }
            this.f43228 = c25301.f81711.m50039(this.f43228, c25301.f81711.m50042(c14769M50039, c14769M35545));
            this.f43228 = c25301.f81711.m50039(this.f43228, c147618);
            while (c184910.m43096()) {
                this.f7757.m43089((C9133) c184910.m43092());
            }
            return;
        }
        this.f43228 = c25301.f81711.m50039(this.f43228, c25301.f81711.m50042(c14769M50039, c14769M35545));
        C18499 c184911 = this.f7757;
        this.f7757 = c18499;
        while (c184911.m43096()) {
            this.f7757.m43089((C9133) c184911.m43092());
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        mo5474(c2158.f7114);
        mo5474(c2158.f7115);
        AbstractC19969 abstractC19969 = c2158.f7116;
        if (abstractC19969 != null) {
            mo5474(abstractC19969);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m33355(AbstractC22664 abstractC22664) {
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        C25301 c25301 = this.f43229;
        return abstractC22970 == c25301.f81712.f48325.f73596 || abstractC22664.f73596 == c25301.f81712.f48269.f73596;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1515(C14637 c14637) {
        m8184(new C9133(c14637));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1497(C4307 c4307) {
        mo5474(c4307.f15611);
        m8184(new C9133(c4307));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1490(C1214 c1214) {
        m8184(new C9133(c1214));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        mo5474(c11018.f34795);
        m8184(new C9133(c11018));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1491(C2070 c2070) {
        mo5474(c2070.f6892);
        AbstractC11781 abstractC11781M28352 = C11239.m28352(c2070.f6892);
        if (abstractC11781M28352 != null && abstractC11781M28352.f38066 == EnumC13603.f43205 && (abstractC11781M28352.mo29591() & 2199023255568L) != 0 && this.f43231.get(abstractC11781M28352) != null) {
            Iterator it = ((C14769) this.f43231.get(abstractC11781M28352)).iterator();
            while (it.hasNext()) {
                m33357((AbstractC22664) it.next(), c2070);
            }
            return;
        }
        m33357(c2070.f6892.f26659, c2070);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        mo5474(c24533.f79554);
        m52092(c24533.f79555);
        for (C14769 c14769Mo50622 = c24533.f79554.f26659.mo50622(); c14769Mo50622.m35550(); c14769Mo50622 = c14769Mo50622.f48336) {
            m33357((AbstractC22664) c14769Mo50622.f48335, c24533);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        mo5474(c18565.f60321);
        m52092(c18565.f60325);
        for (C14769 c14769Mo50622 = c18565.f60322.mo50622(); c14769Mo50622.m35550(); c14769Mo50622 = c14769Mo50622.f48336) {
            m33357((AbstractC22664) c14769Mo50622.f48335, c18565);
        }
        C14769 c14769 = this.f43230;
        try {
            if (c18565.f60319 != null) {
                for (C14769 c14769Mo50623 = c18565.f60318.f38067.mo50622(); c14769Mo50623.m35550(); c14769Mo50623 = c14769Mo50623.f48336) {
                    this.f43230 = this.f43229.f81711.m50043((AbstractC22664) c14769Mo50623.f48335, this.f43230);
                }
            }
            mo5474(c18565.f60319);
        } finally {
            this.f43230 = c14769;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1518(C16327 c16327) {
        boolean z;
        C25301 c25301 = this.f43229;
        AbstractC22664 abstractC22664 = c16327.f26659;
        if (abstractC22664 == null || !abstractC22664.mo9329()) {
            C14769 c14769 = this.f43230;
            C14769 c147610 = this.f43228;
            C18499 c18499 = this.f7757;
            try {
                this.f7757 = new C18499();
                this.f43230 = c16327.m37319(c25301.f81718).mo50622();
                this.f43228 = C14769.m35543();
                mo5474(c16327.f53001);
                C14769 c14769M43093 = this.f7757.m43093();
                this.f7757 = new C18499();
                while (c14769M43093.m35550()) {
                    C9133 c9133 = (C9133) c14769M43093.f48335;
                    c14769M43093 = c14769M43093.f48336;
                    if (!(c9133 instanceof C6897)) {
                        if (!c9133.f29691.m21911(EnumC21461.f68460)) {
                            C7312 c7312 = c25301.f81714;
                            AbstractC8036 abstractC8036 = c9133.f29691;
                            abstractC8036.getClass();
                            z = c7312.m20042(abstractC8036);
                        }
                        C11972.m30026(z);
                    } else {
                        this.f7757.m43089(c9133);
                    }
                }
                m33358();
            } finally {
                this.f7757 = c18499;
                this.f43230 = c14769;
                this.f43228 = c147610;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33356(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        C25301 c25301 = this.f43229;
        try {
            c25301.f81716 = c3168;
            c25301.f81713 = c15714;
            this.f7757 = new C18499();
            this.f43231 = new HashMap();
            this.f43230 = null;
            this.f43228 = null;
            this.f43227 = null;
            mo5474(abstractC8036);
        } finally {
            this.f7757 = null;
            c25301.f81713 = null;
            this.f43230 = null;
            this.f43228 = null;
            this.f43227 = null;
        }
    }

    public C13608(C25301 c25301) {
        this.f43229 = c25301;
    }
}
