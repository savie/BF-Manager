package l;

/* JADX INFO: renamed from: l.ܽۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17512 extends EnumC3342 {
    public /* synthetic */ C17512(EnumC0816 enumC0816) {
        this("UPPER", 3, enumC0816);
    }

    public C17512(String str, int i, EnumC0816 enumC0816) {
        super(str, i, enumC0816, 0);
    }

    @Override // l.EnumC3342
    /* JADX INFO: renamed from: ۤ */
    public AbstractC22664 mo6372(C8274 c8274, C2596 c2596) {
        C14528 c14528 = c2596.f8336;
        C14769 c14769M10995 = m10995(c8274, c2596);
        AbstractC22664 abstractC22664M55167 = c14769M10995.f48336.f48336 == null ? (AbstractC22664) c14769M10995.f48335 : c14528.f45697.m55167(c14769M10995);
        if (!abstractC22664M55167.mo40452() && !abstractC22664M55167.m51067(EnumC21172.ERROR)) {
            return abstractC22664M55167;
        }
        C19991 c19991 = c14528.f45702;
        AbstractC22664 abstractC22664 = c8274.f72657;
        C15515 c15515 = C19859.f63823;
        throw C14528.m35046(c19991.m45975(new C15515("compiler", "no.unique.maximal.instance.exists", abstractC22664, c14769M10995)));
    }
}
