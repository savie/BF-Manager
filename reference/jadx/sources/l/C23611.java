package l;

/* JADX INFO: renamed from: l.᩹ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23611 extends AbstractC24357 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f76639;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        AbstractC22664 abstractC22664 = (AbstractC22664) obj2;
        C1917 c1917 = this.f76639;
        AbstractC22664 abstractC22664M55145 = c1917.f6446.m55145((AbstractC22664) obj);
        EnumC21172 enumC21172 = EnumC21172.BOOLEAN;
        return abstractC22664M55145.m51067(enumC21172) && c1917.f6446.m55145(abstractC22664).m51067(enumC21172);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23611(C1917 c1917, EnumC21461 enumC21461) {
        super(c1917, enumC21461);
        this.f76639 = c1917;
    }

    @Override // l.AbstractC24357
    /* JADX INFO: renamed from: ۙ */
    public final C7395 mo11429(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C1917 c1917 = this.f76639;
        return m44271(new C6457(this, c1917.f6447.f48255, c1917.f6447.f48255));
    }
}
