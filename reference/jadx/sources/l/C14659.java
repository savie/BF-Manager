package l;

/* JADX INFO: renamed from: l.ܰܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14659 extends AbstractC24357 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f47945;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        AbstractC22664 abstractC22665 = (AbstractC22664) obj2;
        C1917 c1917 = this.f47945;
        boolean z = c1917.f6446.m55149(abstractC22664, c1917.f6447.f48282) || c1917.f6446.m55149(abstractC22665, c1917.f6447.f48282);
        EnumC21172 enumC21172 = EnumC21172.VOID;
        return z && !(abstractC22664.m51067(enumC21172) || abstractC22665.m51067(enumC21172));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14659(C1917 c1917, EnumC21461 enumC21461) {
        super(c1917, enumC21461);
        this.f47945 = c1917;
    }

    @Override // l.AbstractC24357
    /* JADX INFO: renamed from: ۙ */
    public final C7395 mo11429(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return m44271(new C6457(this, m35286(abstractC22664), m35286(abstractC22665)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22664 m35286(AbstractC22664 abstractC22664) {
        boolean zMo40452 = abstractC22664.mo40452();
        C1917 c1917 = this.f47945;
        if (zMo40452) {
            return c1917.m6596(abstractC22664);
        }
        if (abstractC22664.m51067(EnumC21172.VOID) || abstractC22664.m51067(EnumC21172.BOT) || c1917.f6446.m55149(abstractC22664, c1917.f6447.f48282)) {
            return abstractC22664;
        }
        if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            return m35286(abstractC22664.mo19992());
        }
        return c1917.f6447.f48286;
    }
}
