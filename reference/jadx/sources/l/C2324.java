package l;

/* JADX INFO: renamed from: l.ۖ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9PH */
/* JADX INFO: loaded from: classes3.dex */
public final class C2324 implements InterfaceC0130 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C2324 f7499 = new C2324();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2324 m7830() {
        return f7499;
    }

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo1288(Class cls) {
        return AbstractC22701.class.isAssignableFrom(cls);
    }

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18029 mo1287(Class cls) {
        if (!AbstractC22701.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            AbstractC22701 abstractC22701M51176 = AbstractC22701.m51176(cls.asSubclass(AbstractC22701.class));
            EnumC21955 enumC21955 = EnumC21955.GET_MEMOIZED_IS_INITIALIZED;
            return (InterfaceC18029) abstractC22701M51176.m51177();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
