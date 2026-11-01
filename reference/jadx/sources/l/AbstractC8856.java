package l;

/* JADX INFO: renamed from: l.ۡۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8856 extends AbstractC23903 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f30401;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f30402;

    /* JADX INFO: renamed from: ۙ */
    public abstract C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826);

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۫ */
    public boolean mo20273() {
        return this instanceof C14294;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo22992() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8856(C20145 c20145, EnumC10477 enumC10477, String str) {
        super(enumC10477, 0L, null, null, null);
        this.f30401 = c20145;
        this.f30402 = str;
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3841(AbstractC7693 abstractC7693, Object obj) {
        throw new AssertionError();
    }

    @Override // l.AbstractC23903
    public String toString() {
        return this.f30402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 mo22991(AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        C20145 c20145 = this.f30401;
        C23800 c23800 = c20145.f65444;
        AbstractC16579 abstractC16579 = c20145.f65410.f14276.f77449;
        c23800.getClass();
        return C23800.m52331(abstractC11242, abstractC0618, abstractC16579).f53222;
    }
}
