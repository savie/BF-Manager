package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3826 extends AbstractC13630 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14266 f13044;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f13045;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3826(C14266 c14266, C4192 c4192, C1083 c1083, AbstractC22664 abstractC22664) {
        super(c14266.f45078, true, c4192, c1083);
        this.f13044 = c14266;
        this.f13045 = abstractC22664;
    }

    @Override // l.AbstractC13630, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3911(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        AbstractC22664 abstractC22666;
        AbstractC8036 abstractC8036Mo17983;
        C22010 c22010 = this.f13044.f45078;
        if (c22010.f71031 && m12369(abstractC22664, abstractC22665) && (abstractC22666 = this.f13045) != null && abstractC22666.mo9097() == EnumC21172.DEFERRED && (abstractC8036Mo17983 = ((C8666) abstractC22666).mo17983(this.f43279)) != c22010.f71035.f41173) {
            return m12366(abstractC22664, abstractC22665, abstractC8036Mo17983);
        }
        return m12365(abstractC22664, abstractC22665);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m12365(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C22010 c22010 = this.f13044.f45078;
        if (!this.f43280 && abstractC22664.mo40452() != abstractC22665.mo40452()) {
            abstractC22664 = abstractC22664.mo40452() ? c22010.f71021.m55108(abstractC22664).f38067 : c22010.f71021.m55152(abstractC22664);
        }
        return c22010.f71021.m55131(abstractC22664, this.f43279.f15335.m8710(abstractC22665), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m12369(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C22010 c22010 = this.f13044.f45078;
        C24705 c24705 = c22010.f71021;
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        c24705.getClass();
        try {
            c24705.m55092(abstractC22970);
            C24705 c24706 = c22010.f71021;
            AbstractC22970 abstractC22971 = abstractC22665.f73596;
            c24706.getClass();
            c24706.m55092(abstractC22971);
            return m12367(abstractC22664, abstractC22665);
        } catch (C11540 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m12367(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        boolean zMo18914 = abstractC22664.mo18914();
        C14266 c14266 = this.f13044;
        if (zMo18914) {
            Iterator it = c14266.f45078.f71021.m55144(abstractC22664).iterator();
            while (it.hasNext()) {
                if (!m12367((AbstractC22664) it.next(), abstractC22665)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC22665.mo18914()) {
            return c14266.f45078.f71021.m55157(abstractC22665.f73596, abstractC22664) == null && c14266.f45078.f71021.m55157(abstractC22664.f73596, abstractC22665) == null;
        }
        Iterator it2 = c14266.f45078.f71021.m55144(abstractC22665).iterator();
        while (it2.hasNext()) {
            if (!m12367(abstractC22664, (AbstractC22664) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m12366(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, AbstractC8036 abstractC8036) {
        C2596 c2596 = this.f43279.f15335;
        C22010 c22010 = this.f13044.f45078;
        C24705 c24705 = c22010.f71021;
        AbstractC22664 abstractC22664M55143 = c24705.m55143(c24705.m55158(abstractC22664));
        AbstractC22664 abstractC22664M55144 = c22010.f71021.m55143(abstractC22664);
        AbstractC22664 abstractC22664M55145 = c22010.f71021.m55143(abstractC22665);
        C14769 c14769Mo15882 = abstractC22664M55143.mo15882();
        C14769 c14769Mo15883 = abstractC22664M55144.mo15882();
        C14769 c14769Mo15884 = abstractC22664M55145.mo15882();
        if (abstractC22664M55143.m51067(EnumC21172.FORALL) && !c22010.f71021.m55112((C5291) abstractC22664M55143, (C5291) abstractC22664M55144)) {
            return false;
        }
        C14769 c14769 = c14769Mo15882;
        C14769 c147610 = c14769Mo15884;
        while (c14769.m35550() && c147610.m35550()) {
            AbstractC22664 abstractC22664Mo19992 = ((AbstractC22664) c14769.f48335).mo19992();
            AbstractC22664 abstractC22664M55103 = c22010.f71021.m55103(((AbstractC22664) c147610.f48335).mo19992(), c14769Mo15884, c14769Mo15882);
            if ((abstractC22664Mo19992.m51073(c14769Mo15882) && abstractC22664M55103.m51073(c2596.f8340)) || !c22010.f71021.m55149(abstractC22664Mo19992, c2596.m8710(abstractC22664M55103))) {
                return false;
            }
            c14769 = c14769.f48336;
            c147610 = c147610.f48336;
        }
        if (!c14769.isEmpty() || !c147610.isEmpty()) {
            return false;
        }
        C14769 c14769Mo50621 = abstractC22664M55143.mo50621();
        C14769 c14769Mo50622 = abstractC22664M55144.mo50621();
        C14769 c14769Mo50623 = abstractC22664M55145.mo50621();
        while (c14769Mo50621.m35550() && c14769Mo50622.m35550() && c14769Mo50623.m35550()) {
            AbstractC22664 abstractC22666 = (AbstractC22664) c14769Mo50621.f48335;
            AbstractC22664 abstractC22664M55104 = c22010.f71021.m55103((AbstractC22664) c14769Mo50622.f48335, c14769Mo15883, c14769Mo15882);
            AbstractC22664 abstractC22664M55105 = c22010.f71021.m55103((AbstractC22664) c14769Mo50623.f48335, c14769Mo15884, c14769Mo15882);
            if (abstractC22666.m51073(c14769Mo15882) && abstractC22664M55105.m51073(c2596.f8340)) {
                return false;
            }
            C14769 c147611 = c14769Mo15883;
            if (!c22010.f71021.m55131(c2596.m8710(abstractC22664M55105), abstractC22666, true) || !c22010.f71021.m55149(abstractC22664M55104, c2596.m8710(abstractC22664M55105))) {
                return false;
            }
            c14769Mo50621 = c14769Mo50621.f48336;
            c14769Mo50622 = c14769Mo50622.f48336;
            c14769Mo50623 = c14769Mo50623.f48336;
            c14769Mo15883 = c147611;
        }
        if (!c14769Mo50621.isEmpty() || !c14769Mo50622.isEmpty() || !c14769Mo50623.isEmpty()) {
            return false;
        }
        AbstractC22664 abstractC22664Mo31585 = abstractC22664M55143.mo31585();
        AbstractC22664 abstractC22664M55106 = c22010.f71021.m55103(abstractC22664M55145.mo31585(), c14769Mo15884, c14769Mo15882);
        if (abstractC22664Mo31585.m51073(c14769Mo15882) && abstractC22664M55106.m51073(c2596.f8340)) {
            return false;
        }
        C23964 c23964 = new C23964(this, abstractC22664Mo31585, abstractC22664M55106);
        c23964.mo5474(abstractC8036);
        return c23964.f77563;
    }
}
