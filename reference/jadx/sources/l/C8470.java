package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final class C8470 extends C23174 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f27745;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashSet f27743 = new HashSet();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f27742 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27744 = false;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        mo5474(c23041.f74776);
        m22779(c23041.f74775, c23041);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22779(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036) {
        if (abstractC11781 != null) {
            EnumC13603 enumC13603 = abstractC11781.f38066;
            EnumC13603 enumC13604 = EnumC13603.f43213;
            if (enumC13603 == enumC13604) {
                C22092 c22092 = this.f27745;
                C3168 c3168M38995 = c22092.f71214.f51524.m38995((AbstractC22970) abstractC11781);
                if (c3168M38995 != null) {
                    C23393 c23393M34514 = c22092.f71200.m34514();
                    try {
                        c22092.f71200.m34530(c3168M38995.f10275.f61856);
                        mo5474(c3168M38995.f10273);
                        return;
                    } finally {
                        c22092.f71200.m34530(c23393M34514.m52573());
                    }
                }
                if (abstractC11781.f38066 == enumC13604) {
                    m22780(abstractC11781, abstractC8036, C14769.m35543());
                    return;
                }
                return;
            }
        }
        if (abstractC11781 == null || abstractC11781.f38066 != EnumC13603.f43219) {
            this.f27744 = true;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        m22779(c5887.f20170, c5887);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        mo5474(c25191.f81425);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1968(C23589 c23589) {
        mo5474(c23589.f76594);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C14769 c14769M35543 = C14769.m35543();
        AbstractC22295 abstractC22295 = c7926.f26348;
        if (abstractC22295 != null) {
            c14769M35543 = c14769M35543.m35552(abstractC22295);
        }
        C14769 c14769 = c7926.f26347;
        if (c14769 != null) {
            Iterator it = c14769.iterator();
            while (it.hasNext()) {
                c14769M35543 = c14769M35543.m35552((AbstractC8036) it.next());
            }
        }
        m22780(c7926.f26345, c7926, c14769M35543);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22780(AbstractC11781 abstractC11781, AbstractC8036 abstractC8036, C14769 c14769) {
        if ((abstractC11781.f38071 & 1073741824) != 0) {
            return;
        }
        HashSet hashSet = this.f27743;
        if (hashSet.contains(abstractC11781)) {
            this.f27742 = true;
            this.f27745.m49944((C24550) abstractC11781, (InterfaceC5075) abstractC8036);
            return;
        }
        if (abstractC11781.f38067.mo9329()) {
            return;
        }
        try {
            hashSet.add(abstractC11781);
            if (abstractC11781.f38067.m51067(EnumC21172.CLASS)) {
                if (c14769.m35550()) {
                    m52092(c14769);
                } else {
                    C10510 c10510 = (C10510) abstractC11781.f38067;
                    AbstractC22664 abstractC22664 = c10510.f33442;
                    if (abstractC22664 != null && c10510.f33437 != null) {
                        m22779(abstractC22664.f73596, abstractC8036);
                        Iterator it = c10510.f33437.iterator();
                        while (it.hasNext()) {
                            m22779(((AbstractC22664) it.next()).f73596, abstractC8036);
                        }
                    }
                    this.f27744 = true;
                    return;
                }
                AbstractC11781 abstractC11782 = abstractC11781.f38069;
                if (abstractC11782.f38066 == EnumC13603.f43213) {
                    m22779(abstractC11782, abstractC8036);
                }
            }
        } finally {
            hashSet.remove(abstractC11781);
        }
    }

    public C8470(C22092 c22092) {
        this.f27745 = c22092;
    }
}
