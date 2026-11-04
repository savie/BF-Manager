package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4742 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C13477 f16672 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0310 f16673;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15714 f16674;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24705 f16675;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14764 f16676;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12863 f16677;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18499 f16678 = new C18499();

    public C4742(C4747 c4747) {
        c4747.m14646(f16672, this);
        this.f16673 = C0310.m1899(c4747);
        this.f16677 = C12863.m31895(c4747);
        C15252.m36599(c4747);
        this.f16674 = C15714.m37502(c4747);
        this.f16676 = C14764.m35506(c4747);
        this.f16675 = C24705.m55066(c4747);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14640() {
        AbstractC22664 abstractC22664M14638;
        C15714 c15714;
        while (true) {
            C18499 c18499 = this.f16678;
            if (!c18499.m43096()) {
                return;
            }
            C7022 c7022 = (C7022) c18499.remove();
            C18499 c184910 = new C18499();
            C3168 c3168 = c7022.f23160;
            C3168 c3169 = c7022.f23160;
            C14479 c14479 = c7022.f23161;
            AbstractC11781 abstractC11781 = c7022.f23156;
            boolean zM21911 = c3168.f10273.m21911(EnumC21461.f68526);
            boolean z = false;
            C14764 c14764 = this.f16676;
            if (zM21911) {
                C24533 c24533 = (C24533) c3168.f10273;
                boolean z2 = (abstractC11781.mo29591() & 17179869184L) != 0;
                if (z2 || c24533.f79555.m35551() <= abstractC11781.f38067.mo50621().m35551()) {
                    C14769 c14769 = c24533.f79555;
                    C14769 c14769Mo50621 = abstractC11781.f38067.mo50621();
                    while (true) {
                        boolean zM35550 = c14769.m35550();
                        c15714 = this.f16674;
                        if (!zM35550 || !c14769Mo50621.m35550()) {
                            break;
                        }
                        AbstractC22295 abstractC22295 = (AbstractC22295) c14769.f48335;
                        AbstractC22664 abstractC22664 = (c14769Mo50621.f48336.m35550() || !z2) ? (AbstractC22664) c14769Mo50621.f48335 : ((C2832) c14769Mo50621.f48335).f9333;
                        if (abstractC22295.m21911(EnumC21461.f68453)) {
                            final C16327 c16327 = (C16327) abstractC22295;
                            if (c16327.f53000 == EnumC17819.IMPLICIT) {
                                for (Iterator it = c16327.f52999.iterator(); it.hasNext(); it = it) {
                                    ((C12510) it.next()).f40166 = null;
                                }
                            }
                            C24705 c24705 = this.f16675;
                            if (c24705.m55087(abstractC22664)) {
                                boolean zM51067 = c24705.m55143(abstractC22664).mo31585().m51067(EnumC21172.VOID);
                                c16327.f53001 = new C8513(this, zM51067, c184910, c16327).mo8479(c16327.f53001);
                                if (!zM51067) {
                                    C13891 c13891M37568 = c15714.m37568();
                                    c13891M37568.f26659 = c14764.f48263;
                                    final C11018 c11018M37553 = c15714.m37553(c13891M37568);
                                    C4197 c4197 = (C4197) c16327.f53001;
                                    c4197.f15344 = c4197.f15344.m35546(c11018M37553);
                                    c184910.m43089(new Runnable() { // from class: l.ۢ۠᩺
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C4197 c4198 = (C4197) c16327.f53001;
                                            c4198.f15344 = C14769.m35541(c11018M37553, c4198.f15344);
                                        }
                                    });
                                }
                            }
                            z = true;
                        }
                        c14769 = c14769.f48336;
                        if (c14769Mo50621.f48336.m35550() || !z2) {
                            c14769Mo50621 = c14769Mo50621.f48336;
                        }
                    }
                    C14769 c147610 = c24533.f79555;
                    while (c14769Mo50621.m35550()) {
                        C14769 c147611 = c24533.f79555;
                        C13891 c13891M37569 = c15714.m37568();
                        c13891M37569.f26659 = c14764.f48263;
                        c24533.f79555 = c147611.m35546(c13891M37569);
                        c14769Mo50621 = c14769Mo50621.f48336;
                        z = true;
                    }
                    c184910.m43089(new RunnableC11879(5, c24533, c147610));
                }
            }
            if (z) {
                C14769 c14769M28327 = C11239.m28327(c3168.f10273);
                AbstractC22664 abstractC22665 = c14479.f45575;
                AbstractC22664 abstractC22666 = c14479.f45575;
                C14769 c14769Mo50622 = abstractC22665.mo50621();
                while (c14769Mo50622.m35551() < c14769M28327.m35551()) {
                    c14769Mo50622 = c14769Mo50622.m35546(c14764.f48263);
                }
                AbstractC22664 abstractC22667 = c7022.f23159;
                AbstractC11781 abstractC11782 = c7022.f23156;
                C0310 c0310 = this.f16673;
                C17359.requireNonNull(c0310);
                abstractC22664M14638 = c0310.m1943(abstractC22667, abstractC11782, new C14479(c0310, c14479.f45572, abstractC22666.mo31585(), c14479.f45571, c14479.f45574), c3169, c14769M28327, c14769Mo50622, abstractC22666.mo15882());
                C1170.stream(c184910).forEach(new C1056());
            } else {
                abstractC22664M14638 = m14638(c7022.f23158, c7022.f23159, c7022.f23157, c3169, c7022.f23161);
            }
            c7022.f23158.f26659 = abstractC22664M14638;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m14639(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781, C3168 c3168, C14479 c14479) {
        if ((abstractC11781.f38071 & 1099511627776L) != 0 && ((C7768) c3168.f10272).f25555.m52830()) {
            AbstractC11781 abstractC11782 = ((C13733) abstractC11781.f38067).f43588;
            this.f16673.getClass();
            this.f16678.m43089(new C7022(abstractC8036, abstractC22664, abstractC11781, abstractC11782, C0310.m1922(c3168), c14479));
            return this.f16676.f48263;
        }
        return m14638(abstractC8036, abstractC22664, abstractC11781, c3168, c14479);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC22664 m14638(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781, C3168 c3168, C14479 c14479) {
        AbstractC22664 abstractC22665 = c14479.f45575;
        C12863 c12863 = this.f16677;
        C17359.requireNonNull(c12863);
        C19576 c19576 = new C19576(c12863, EnumC16124.SPECULATIVE, abstractC11781, ((C7768) c3168.f10272).f25570);
        abstractC22665.getClass();
        AbstractC22664 abstractC22664M1937 = this.f16673.m1937(abstractC8036, abstractC22664, abstractC11781, (AbstractC22664) c19576.m34207(null, abstractC22665), c3168, c14479);
        AbstractC22664 abstractC22666 = c14479.f45575;
        C17359.requireNonNull(c12863);
        C19576 c19577 = new C19576(c12863, EnumC16124.CHECK, abstractC11781, ((C7768) c3168.f10272).f25570);
        abstractC22666.getClass();
        return abstractC22664M1937;
    }
}
