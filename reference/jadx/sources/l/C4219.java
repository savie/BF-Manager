package l;

/* JADX INFO: renamed from: l.ۘܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4219 extends AbstractC24357 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f15406;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C1917 c1917 = this.f15406;
        EnumC21172 enumC21172Mo9097 = c1917.m6596((AbstractC22664) obj).mo9097();
        EnumC21172 enumC21172Mo9098 = c1917.m6596((AbstractC22664) obj2).mo9097();
        EnumC21172 enumC21172 = EnumC21172.LONG;
        if (enumC21172Mo9097 == enumC21172 || enumC21172Mo9097 == EnumC21172.INT) {
            return enumC21172Mo9098 == enumC21172 || enumC21172Mo9098 == EnumC21172.INT;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4219(C1917 c1917, EnumC21461 enumC21461) {
        super(c1917, enumC21461);
        this.f15406 = c1917;
    }

    @Override // l.AbstractC24357
    /* JADX INFO: renamed from: ۙ */
    public final C7395 mo11429(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        C1917 c1917 = this.f15406;
        return m44271(new C6457(this, c1917.m6596(abstractC22664), c1917.m6596(abstractC22665)));
    }
}
