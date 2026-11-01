package l;

/* JADX INFO: renamed from: l.ܽܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3310 f53545;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12484 f53546;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20950 f53547;

    public C16717(C12484 c12484, InterfaceC20950 interfaceC20950, AbstractC3310 abstractC3310) {
        C13465.m32966(c12484, "store");
        C13465.m32966(interfaceC20950, "factory");
        C13465.m32966(abstractC3310, "defaultCreationExtras");
        this.f53546 = c12484;
        this.f53547 = interfaceC20950;
        this.f53545 = abstractC3310;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16717(C12484 c12484, InterfaceC20950 interfaceC20950) {
        this(c12484, interfaceC20950, C1899.f7169);
        C13465.m32966(c12484, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16717(InterfaceC17422 interfaceC17422) {
        InterfaceC20950 defaultViewModelProviderFactory;
        AbstractC3310 defaultViewModelCreationExtras;
        C13465.m32966(interfaceC17422, "owner");
        C12484 viewModelStore = interfaceC17422.getViewModelStore();
        InterfaceC9662 interfaceC9662 = C7544.f25042;
        boolean z = interfaceC17422 instanceof InterfaceC16469;
        if (!z) {
            if (C20245.f65684 == null) {
                C20245.f65684 = new C20245();
            }
            defaultViewModelProviderFactory = C20245.f65684;
            C13465.m32962(defaultViewModelProviderFactory);
        } else {
            defaultViewModelProviderFactory = ((InterfaceC16469) interfaceC17422).getDefaultViewModelProviderFactory();
        }
        if (z) {
            defaultViewModelCreationExtras = ((InterfaceC16469) interfaceC17422).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C1899.f7169;
        }
        this(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8956 m39205(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m39206(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8956 m39206(Class cls, String str) {
        AbstractC8956 abstractC8956Mo4842;
        C13465.m32966(str, "key");
        C12484 c12484 = this.f53546;
        AbstractC8956 abstractC8956M31026 = c12484.m31026(str);
        boolean zIsInstance = cls.isInstance(abstractC8956M31026);
        InterfaceC20950 interfaceC20950 = this.f53547;
        if (zIsInstance) {
            C0488 c0488 = interfaceC20950 instanceof C0488 ? (C0488) interfaceC20950 : null;
            if (c0488 != null) {
                C13465.m32962(abstractC8956M31026);
                c0488.mo2365(abstractC8956M31026);
            }
            C13465.m32963((Object) abstractC8956M31026, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC8956M31026;
        }
        C11966 c11966 = new C11966(this.f53545);
        int i = C20245.f65683;
        c11966.m9814().put(C16012.f51830, str);
        try {
            abstractC8956Mo4842 = interfaceC20950.mo4843(cls, c11966);
        } catch (AbstractMethodError unused) {
            abstractC8956Mo4842 = interfaceC20950.mo4842(cls);
        }
        c12484.m31028(str, abstractC8956Mo4842);
        return abstractC8956Mo4842;
    }
}
