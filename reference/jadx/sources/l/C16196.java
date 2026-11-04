package l;

/* JADX INFO: renamed from: l.ܶܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 195U */
/* JADX INFO: loaded from: classes4.dex */
public final class C16196 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C17688 f52576 = new C17688();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14704 f52577;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16196(C23656 c23656, InterfaceC11721 interfaceC11721) {
        this(c23656, interfaceC11721, C6502.f21835);
        C15243.m36590(c23656, "store");
    }

    public C16196(C23656 c23656, InterfaceC11721 interfaceC11721, AbstractC24402 abstractC24402) {
        C15243.m36590(c23656, "store");
        C15243.m36590(interfaceC11721, "factory");
        C15243.m36590(abstractC24402, "defaultCreationExtras");
        this.f52577 = new C14704(c23656, interfaceC11721, abstractC24402);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16196(InterfaceC3518 interfaceC3518) {
        InterfaceC11721 defaultViewModelProviderFactory;
        AbstractC24402 defaultViewModelCreationExtras;
        C15243.m36590(interfaceC3518, "owner");
        C23656 viewModelStore = interfaceC3518.getViewModelStore();
        boolean z = interfaceC3518 instanceof InterfaceC21265;
        if (z) {
            defaultViewModelProviderFactory = ((InterfaceC21265) interfaceC3518).getDefaultViewModelProviderFactory();
        } else {
            defaultViewModelProviderFactory = C21418.f68214;
        }
        if (z) {
            defaultViewModelCreationExtras = ((InterfaceC21265) interfaceC3518).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C6502.f21835;
        }
        this(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 m38422(Class cls) {
        C13512 c13512M39514 = C16735.m39514(cls);
        String strM33199 = c13512M39514.m33199();
        if (strM33199 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f52577.m35375(c13512M39514, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM33199));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13213 m38423(C13512 c13512) {
        return this.f52577.m35375(c13512, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
