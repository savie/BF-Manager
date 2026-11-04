package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes.dex */
public final class C22251 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22970 f71660;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25235 f71661;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        m50308(c6633, c6633.f22152, this.f71660);
        super.mo1503(c6633);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C5816 c5816 = c12510.f40168;
        if (c5816.f38069.f38066 == EnumC13603.f43213) {
            m50308(c12510, c5816, this.f71660);
        }
        super.mo1513(c12510);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        AbstractC22970 abstractC22970 = this.f71660;
        this.f71660 = c7926.f26345;
        try {
            super.mo1505(c7926);
        } finally {
            this.f71660 = abstractC22970;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50308(AbstractC8036 abstractC8036, AbstractC11781 abstractC11781, AbstractC22970 abstractC22970) {
        C25235 c25235;
        AbstractC22664 abstractC22664M55137 = abstractC22970.f38067;
        while (abstractC22664M55137 != AbstractC22664.f73590) {
            Iterator it = abstractC22664M55137.f73596.mo29571().mo7473(abstractC11781.f38072, null, EnumC13908.NON_RECURSIVE).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c25235 = this.f71661;
                if (zHasNext) {
                    AbstractC11781 abstractC11782 = (AbstractC11781) it.next();
                    if (abstractC11781.f38066 == abstractC11782.f38066 && c25235.f81545.m55149(c25235.f81545.m55132(abstractC11781.f38067), c25235.f81545.m55132(abstractC11782.f38067)) && abstractC11781 != abstractC11782 && (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != (abstractC11782.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) && (abstractC11781.mo29591() & 2147483648L) == 0 && (abstractC11782.mo29591() & 2147483648L) == 0) {
                        if ((abstractC11782.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                            abstractC11781 = abstractC11782;
                        }
                        if (abstractC11781.f38067.mo9329()) {
                            return;
                        }
                        C7312 c7312 = c25235.f81533;
                        AbstractC11781 abstractC11781M29579 = abstractC11781.m29579();
                        AbstractC11781 abstractC11781M295710 = abstractC11781.m29579();
                        C15515 c15515 = C19859.f63823;
                        c7312.m34520(abstractC8036, C22843.m51552(abstractC11781M29579, new C15515("compiler", "synthetic.name.conflict", abstractC11781, abstractC11781M295710)));
                        return;
                    }
                }
            }
            abstractC22664M55137 = c25235.f81545.m55137(abstractC22664M55137);
        }
    }

    public C22251(C25235 c25235) {
        this.f71661 = c25235;
    }
}
