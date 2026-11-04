package l;

/* JADX INFO: renamed from: l.᩹ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final enum C23480 extends EnumC3342 {
    public /* synthetic */ C23480(EnumC0816 enumC0816) {
        this("CAPTURED", 5, enumC0816);
    }

    public C23480(String str, int i, EnumC0816 enumC0816) {
        super(str, i, enumC0816, 0);
    }

    @Override // l.EnumC3342
    /* JADX INFO: renamed from: ۙ */
    public boolean mo10994(C8274 c8274, C2596 c2596) {
        return c8274.m22330() && !c2596.m8704(c8274.m22332(EnumC0816.f3091, EnumC0816.f3093));
    }

    @Override // l.EnumC3342
    /* JADX INFO: renamed from: ۤ */
    public AbstractC22664 mo6372(C8274 c8274, C2596 c2596) {
        AbstractC22664 abstractC22664Mo6372;
        AbstractC22664 abstractC22664Mo6373;
        C14528 c14528 = c2596.f8336;
        EnumC3342 enumC3342 = EnumC3342.f10916;
        if (enumC3342.m10995(c8274, c2596).m35550()) {
            abstractC22664Mo6372 = enumC3342.mo6372(c8274, c2596);
        } else {
            abstractC22664Mo6372 = c14528.f45699.f48286;
        }
        AbstractC22664 abstractC22664 = abstractC22664Mo6372;
        EnumC3342 enumC3343 = EnumC3342.f10915;
        if (enumC3343.m10995(c8274, c2596).m35550()) {
            abstractC22664Mo6373 = enumC3343.mo6372(c8274, c2596);
        } else {
            abstractC22664Mo6373 = c14528.f45699.f48241;
        }
        C14018 c14018 = (C14018) c8274.f72657;
        AbstractC22970 abstractC22970 = c14018.f73596;
        return new C14018(abstractC22970.f38072, abstractC22970.f38069, abstractC22664, abstractC22664Mo6373, c14018.f44410);
    }
}
