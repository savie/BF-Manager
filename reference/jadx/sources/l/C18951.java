package l;

/* JADX INFO: renamed from: l.ᩴᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H9PH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18951 implements InterfaceC4154 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18951 f61364 = new C18951();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18951 m43653() {
        return f61364;
    }

    @Override // l.InterfaceC4154
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo11797(Class cls) {
        return AbstractC16129.class.isAssignableFrom(cls);
    }

    @Override // l.InterfaceC4154
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13328 mo11796(Class cls) {
        if (!AbstractC16129.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            AbstractC16129 abstractC16129M38183 = AbstractC16129.m38183(cls.asSubclass(AbstractC16129.class));
            EnumC7662 enumC7662 = EnumC7662.GET_MEMOIZED_IS_INITIALIZED;
            return (InterfaceC13328) abstractC16129M38183.m38184();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
