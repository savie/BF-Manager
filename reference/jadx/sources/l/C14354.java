package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public class C14354 extends AbstractC2422 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25301 f45261;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC5909 f45262;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
    }

    @Override // l.AbstractC2422
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1538() {
        this.f45262 = EnumC5909.f20224;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34780(AbstractC8036 abstractC8036) {
        m34778(abstractC8036);
        if (abstractC8036 != null && abstractC8036.m21911(EnumC21461.f68492) && this.f45262 == EnumC5909.f20224) {
            this.f45261.f81714.m34520(abstractC8036, C22843.f74068);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34778(AbstractC8036 abstractC8036) {
        if (this.f45262 == EnumC5909.f20224 && abstractC8036 != null) {
            this.f45261.f81714.m34520(abstractC8036, C22843.f74039);
            if (!abstractC8036.m21911(EnumC21461.f68478)) {
                this.f45262 = EnumC5909.f20222;
            }
        }
        mo5474(abstractC8036);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34779(C14769 c14769) {
        if (c14769 != null) {
            while (c14769.m35550()) {
                m34778((AbstractC8036) c14769.f48335);
                c14769 = c14769.f48336;
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1505(C7926 c7926) {
        if (c7926.f26345 == null) {
            return;
        }
        EnumC5909 enumC5909 = this.f45262;
        C18499 c18499 = this.f7757;
        C25301 c25301 = this.f45261;
        C15400 c15400 = c25301.f81715;
        this.f7757 = new C18499();
        c25301.f81715 = c25301.f81715.m36876(c7926.f26345);
        try {
            for (C14769 c14769 = c7926.f26344; c14769.m35550(); c14769 = c14769.f48336) {
                if (!((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68505) && (8 & C11239.m28344((AbstractC8036) c14769.f48335)) != 0) {
                    m34780((AbstractC8036) c14769.f48335);
                    m34773(false);
                }
            }
            for (C14769 c147610 = c7926.f26344; c147610.m35550(); c147610 = c147610.f48336) {
                if (!((AbstractC8036) c147610.f48335).m21911(EnumC21461.f68505) && (C11239.m28344((AbstractC8036) c147610.f48335) & 8) == 0) {
                    m34780((AbstractC8036) c147610.f48335);
                    m34773(false);
                }
            }
            for (C14769 c147611 = c7926.f26344; c147611.m35550(); c147611 = c147611.f48336) {
                if (((AbstractC8036) c147611.f48335).m21911(EnumC21461.f68505)) {
                    mo5474((AbstractC8036) c147611.f48335);
                }
            }
        } finally {
            this.f7757 = c18499;
            this.f45262 = enumC5909;
            c25301.f81715 = c15400;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        if (c6633.f22148 == null) {
            return;
        }
        C25301 c25301 = this.f45261;
        C15400 c15400 = c25301.f81715;
        c25301.f81715 = c25301.f81715.m36876(c6633.f22152);
        C11972.m30026(this.f7757.isEmpty());
        try {
            EnumC5909 enumC5909 = EnumC5909.f20225;
            this.f45262 = enumC5909;
            m34778(c6633.f22148);
            EnumC5909 enumC59010 = this.f45262;
            c6633.f22153 = enumC59010 != EnumC5909.f20224;
            if (enumC59010 == enumC5909 && !c6633.f22152.f38067.mo31585().m51067(EnumC21172.VOID)) {
                c25301.f81714.m34520(C11239.m28340(c6633.f22148), C22843.f74185);
            }
            m34773(true);
        } finally {
            c25301.f81715 = c15400;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34773(boolean z) {
        boolean z2;
        C14769 c14769M43093 = this.f7757.m43093();
        this.f7757 = new C18499();
        while (c14769M43093.m35550()) {
            C9133 c9133 = (C9133) c14769M43093.f48335;
            c14769M43093 = c14769M43093.f48336;
            if (z && c9133.f29691.m21911(EnumC21461.f68460)) {
                z2 = true;
            } else {
                C7312 c7312 = this.f45261.f81714;
                AbstractC8036 abstractC8036 = c9133.f29691;
                abstractC8036.getClass();
                if (c7312.m20042(abstractC8036)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C11972.m30026(z2);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        if (c12510.f40171 != null) {
            C25301 c25301 = this.f45261;
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
        m34779(c4197.f15344);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1507(C8671 c8671) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        m34778(c8671.f28313);
        this.f45262 = this.f45262.mo17153(m8185(c8671));
        mo5474(c8671.f28314);
        EnumC5909 enumC5909M17152 = this.f45262.m17152(!c8671.f28314.f26659.mo40453());
        this.f45262 = enumC5909M17152;
        this.f45262 = enumC5909M17152.mo17153(m8182(c8671, c18499));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1502(C6545 c6545) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(c6545.f21979);
        this.f45262 = EnumC5909.m17150(!c6545.f21979.f26659.mo40451());
        m34778(c6545.f21978);
        this.f45262 = this.f45262.mo17153(m8185(c6545));
        this.f45262 = m8182(c6545, c18499).m17154(!c6545.f21979.f26659.mo40453());
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1522(C20057 c20057) {
        C18499 c18499 = this.f7757;
        m34779(c20057.f64457);
        this.f7757 = new C18499();
        AbstractC22295 abstractC22295 = c20057.f64458;
        if (abstractC22295 != null) {
            mo5474(abstractC22295);
            this.f45262 = EnumC5909.m17150(!c20057.f64458.f26659.mo40451());
        } else {
            this.f45262 = EnumC5909.f20225;
        }
        m34778(c20057.f64456);
        this.f45262 = this.f45262.mo17153(m8185(c20057));
        m52092(c20057.f64455);
        EnumC5909 enumC5909M8182 = m8182(c20057, c18499);
        AbstractC22295 abstractC22296 = c20057.f64458;
        this.f45262 = enumC5909M8182.m17154((abstractC22296 == null || abstractC22296.f26659.mo40453()) ? false : true);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1504(C7180 c7180) {
        mo1513(c7180.f23710);
        C18499 c18499 = this.f7757;
        mo5474(c7180.f23711);
        this.f7757 = new C18499();
        m34778(c7180.f23709);
        this.f45262 = this.f45262.mo17153(m8185(c7180));
        m8182(c7180, c18499);
        this.f45262 = EnumC5909.f20225;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1520(C17073 c17073) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        m34778(c17073.f55742);
        this.f45262 = this.f45262.mo17153(m8182(c17073, c18499));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        C25301 c25301;
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(c15493.f50422);
        boolean z = c15493.f50420 || C1170.stream(c15493.f50421).flatMap(new C12117(0)).anyMatch(new C6152());
        HashSet hashSet = z ? new HashSet() : null;
        C14769 c14769 = c15493.f50421;
        while (true) {
            boolean zM35550 = c14769.m35550();
            c25301 = this.f45261;
            if (!zM35550) {
                break;
            }
            this.f45262 = EnumC5909.f20225;
            C21351 c21351 = (C21351) c14769.f48335;
            for (AbstractC18367 abstractC18367 : c21351.f68007) {
                mo5474(abstractC18367);
                m34772(hashSet, abstractC18367);
            }
            m34779(c21351.f68009);
            EnumC5909 enumC5909 = this.f45262;
            EnumC5909 enumC59010 = EnumC5909.f20224;
            if (enumC5909 != enumC59010 && c21351.f68011 == C21351.f68005) {
                m8183(c15493, c25301.f81713);
                this.f45262 = enumC59010;
            }
            if (this.f45262 == EnumC5909.f20225) {
                C15400 c15400 = c25301.f81715;
                EnumC19876 enumC19876 = EnumC19876.FALLTHROUGH;
                if (c15400.m36878(enumC19876) && c21351.f68009.m35550() && c14769.f48336.m35550()) {
                    C7312 c7312 = c25301.f81714;
                    C21351 c21352 = (C21351) c14769.f48336.f48335;
                    c21352.getClass();
                    c7312.m34532(enumC19876, c21352, C13146.f42055);
                }
            }
            c14769 = c14769.f48336;
        }
        if (!c15493.f50423 && z && !C11239.m28337(c15493.f50422, c15493.f50421) && (hashSet == null || !m34775(c15493.f50422.f26659, hashSet))) {
            c25301.f81714.m34520(c15493, C22843.f74055);
        }
        if (!c15493.f50423) {
            this.f45262 = EnumC5909.f20225;
        }
        this.f45262 = this.f45262.mo17153(m8182(c15493, c18499));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        C25301 c25301;
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        mo5474(c13256.f42352);
        HashSet hashSet = new HashSet();
        EnumC5909 enumC5909 = this.f45262;
        C14769 c14769 = c13256.f42355;
        while (true) {
            boolean zM35550 = c14769.m35550();
            c25301 = this.f45261;
            if (!zM35550) {
                break;
            }
            this.f45262 = EnumC5909.f20225;
            C21351 c21351 = (C21351) c14769.f48335;
            for (AbstractC18367 abstractC18367 : c21351.f68007) {
                mo5474(abstractC18367);
                m34772(hashSet, abstractC18367);
            }
            m34779(c21351.f68009);
            if (this.f45262 == EnumC5909.f20225) {
                if (c21351.f68011 == C21351.f68005) {
                    c25301.f81714.m34520(C11239.m28340(c21351.f68008), C22843.f74111);
                } else if (c14769.f48336.isEmpty()) {
                    c25301.f81714.m34520(C11239.m28340((AbstractC8036) c13256), C22843.f74057);
                }
            }
            c14769 = c14769.f48336;
        }
        if (!c13256.f42351 && !C11239.m28337(c13256.f42352, c13256.f42355) && !m34775(c13256.f42352.f26659, hashSet)) {
            c25301.f81714.m34520(c13256, C22843.f74203);
        }
        this.f45262 = enumC5909;
        this.f45262 = enumC5909.mo17153(m8186(c13256, c18499));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34772(HashSet hashSet, AbstractC18367 abstractC18367) {
        if (hashSet != null) {
            if (abstractC18367.mo9536()) {
                AbstractC22295 abstractC22295 = (AbstractC22295) abstractC18367;
                if (abstractC22295.m21911(EnumC21461.f68523)) {
                    C5887 c5887 = (C5887) abstractC22295;
                    if (c5887.f20170.m29588()) {
                        hashSet.add(c5887.f20170);
                        return;
                    }
                    return;
                }
                return;
            }
            if (abstractC18367.mo9535()) {
                C22428 c22428M28354 = C11239.m28354((AbstractC2903) abstractC18367);
                if (c22428M28354.m50573()) {
                    hashSet.add(c22428M28354.m50572().f73596);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m34775(AbstractC22664 abstractC22664, final HashSet hashSet) {
        C14769 c14769M35539 = C14769.m35539((Iterable) hashSet);
        while (c14769M35539.m35550()) {
            AbstractC11781 abstractC11781 = (AbstractC11781) c14769M35539.f48335;
            c14769M35539 = c14769M35539.f48336;
            int i = C20322.f65204[abstractC11781.f38066.ordinal()];
            if (i == 1) {
                AbstractC17836 abstractC17836Mo29571 = abstractC11781.f38069.mo29571();
                C22625 c22625 = new C22625(1);
                abstractC17836Mo29571.getClass();
                if (C12465.stream(C4937.spliterator(abstractC17836Mo29571.mo7472(c22625, EnumC13908.RECURSIVE)), false).allMatch(new C3914(0, hashSet)) && hashSet.add(abstractC11781.f38069)) {
                    c14769M35539 = c14769M35539.m35552(abstractC11781.f38069);
                }
            } else if (i == 2) {
                for (AbstractC22664 abstractC22665 : this.f45261.f81718.m55135(abstractC11781.f38067)) {
                    AbstractC22970 abstractC22970 = abstractC22665.f73596;
                    if (abstractC22970.f38066 == EnumC13603.f43213 && (abstractC22970.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 && abstractC22970.m29562() && C1170.stream(((C24550) abstractC22665.f73596).f79583).allMatch(new C3914(0, hashSet)) && hashSet.add(abstractC22665.f73596)) {
                        c14769M35539 = c14769M35539.m35552(abstractC22665.f73596);
                    }
                }
            }
        }
        int i2 = C20322.f65206[abstractC22664.mo9097().ordinal()];
        if (i2 == 1) {
            if (!abstractC22664.mo18914()) {
                return hashSet.contains(abstractC22664.f73596);
            }
            if (abstractC22664 instanceof C1562) {
                C1562 c1562 = (C1562) abstractC22664;
                return C1170.stream(c1562.f33437.m35552(c1562.f33442)).anyMatch(new Predicate() { // from class: l.᩺ۙۘ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        HashSet hashSet2 = hashSet;
                        return this.f77788.m34775((AbstractC22664) obj, hashSet2);
                    }
                });
            }
        } else if (i2 == 2) {
            return m34775(((C17969) abstractC22664).mo19992(), hashSet);
        }
        return false;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
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
        m34778(c11764.f38022);
        EnumC5909 enumC5909Mo17153 = this.f45262;
        for (C14769 c14769 = c11764.f38025; c14769.m35550(); c14769 = c14769.f48336) {
            this.f45262 = EnumC5909.f20225;
            mo5474(((C0468) c14769.f48335).f2080);
            m34778(((C0468) c14769.f48335).f2079);
            enumC5909Mo17153 = enumC5909Mo17153.mo17153(this.f45262);
        }
        C4197 c4197 = c11764.f38024;
        if (c4197 != null) {
            C18499 c184910 = this.f7757;
            this.f7757 = c18499;
            this.f45262 = EnumC5909.f20225;
            m34778(c4197);
            EnumC5909 enumC5909 = this.f45262;
            EnumC5909 enumC59010 = EnumC5909.f20224;
            c11764.f38021 = enumC5909 != enumC59010;
            if (enumC5909 == enumC59010) {
                C25301 c25301 = this.f45261;
                C15400 c15400 = c25301.f81715;
                EnumC19876 enumC19876 = EnumC19876.FINALLY;
                if (c15400.m36878(enumC19876)) {
                    c25301.f81714.m34532(enumC19876, C11239.m28340(c11764.f38024), C13146.f42052);
                    return;
                }
                return;
            }
            while (c184910.m43096()) {
                this.f7757.m43089((C9133) c184910.m43092());
            }
            this.f45262 = enumC5909Mo17153;
            return;
        }
        this.f45262 = enumC5909Mo17153;
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
        m34778(c2158.f7115);
        AbstractC19969 abstractC19969 = c2158.f7116;
        if (abstractC19969 != null) {
            EnumC5909 enumC5909 = this.f45262;
            this.f45262 = EnumC5909.f20225;
            m34778(abstractC19969);
            this.f45262 = this.f45262.mo17153(enumC5909);
            return;
        }
        this.f45262 = EnumC5909.f20225;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1515(C14637 c14637) {
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
    public void mo1510(C11018 c11018) {
        mo5474(c11018.f34795);
        m8184(new C9133(c11018));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1491(C2070 c2070) {
        mo5474(c2070.f6892);
        this.f45262 = EnumC5909.f20224;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        mo5474(c24533.f79554);
        m52092(c24533.f79555);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        mo5474(c18565.f60321);
        m52092(c18565.f60325);
        C7926 c7926 = c18565.f60319;
        if (c7926 != null) {
            mo5474(c7926);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1518(C16327 c16327) {
        AbstractC22664 abstractC22664 = c16327.f26659;
        if (abstractC22664 == null || !abstractC22664.mo9329()) {
            C18499 c18499 = this.f7757;
            EnumC5909 enumC5909 = this.f45262;
            try {
                this.f7757 = new C18499();
                this.f45262 = EnumC5909.f20225;
                m34778(c16327.f53001);
                c16327.f52998 = this.f45262 != EnumC5909.f20224;
            } finally {
                this.f7757 = c18499;
                this.f45262 = enumC5909;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34777(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        C25301 c25301 = this.f45261;
        try {
            c25301.f81716 = c3168;
            c25301.f81713 = c15714;
            this.f7757 = new C18499();
            this.f45262 = EnumC5909.f20225;
            mo5474(abstractC8036);
        } finally {
            this.f7757 = null;
            c25301.f81713 = null;
        }
    }

    public C14354(C25301 c25301) {
        this.f45261 = c25301;
    }
}
