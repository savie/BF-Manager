package l;

/* JADX INFO: renamed from: l.ܰܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 696G */
/* JADX INFO: loaded from: classes4.dex */
public final class C14704 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24402 f48039;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8398 f48040;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11721 f48041;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23656 f48042;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 m35375(C13512 c13512, String str) {
        AbstractC13213 abstractC13213M52889;
        AbstractC13213 abstractC13213Mo7000;
        C15243.m36590(str, "key");
        synchronized (this.f48040) {
            abstractC13213M52889 = this.f48042.m52889(str);
            if (c13512.m33197(abstractC13213M52889)) {
                Object obj = this.f48041;
                if (obj instanceof C16942) {
                    C15243.m36586(abstractC13213M52889);
                    ((C16942) obj).mo39918(abstractC13213M52889);
                }
                C15243.m36587((Object) abstractC13213M52889, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            } else {
                C4264 c4264 = new C4264(this.f48039);
                c4264.m54576().put(C16196.f52576, str);
                InterfaceC11721 interfaceC11721 = this.f48041;
                C15243.m36590(interfaceC11721, "factory");
                try {
                    try {
                        abstractC13213Mo7000 = interfaceC11721.mo9823(c13512, c4264);
                    } catch (AbstractMethodError unused) {
                        abstractC13213Mo7000 = interfaceC11721.mo7000(C4560.m14318(c13512));
                    }
                } catch (AbstractMethodError unused2) {
                    abstractC13213Mo7000 = interfaceC11721.mo7001(C4560.m14318(c13512), c4264);
                }
                abstractC13213M52889 = abstractC13213Mo7000;
                this.f48042.m52891(str, abstractC13213M52889);
            }
        }
        return abstractC13213M52889;
    }

    public C14704(C23656 c23656, InterfaceC11721 interfaceC11721, AbstractC24402 abstractC24402) {
        C15243.m36590(c23656, "store");
        C15243.m36590(interfaceC11721, "factory");
        C15243.m36590(abstractC24402, "defaultExtras");
        this.f48042 = c23656;
        this.f48041 = interfaceC11721;
        this.f48039 = abstractC24402;
        this.f48040 = new C8398();
    }
}
