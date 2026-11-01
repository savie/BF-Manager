package l;

/* JADX INFO: renamed from: l.ᩴܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18795 extends AbstractC8856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f60927;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f60928;

    @Override // l.AbstractC8856, l.AbstractC23903
    /* JADX INFO: renamed from: ۫ */
    public boolean mo20273() {
        return !(this instanceof C23466);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC18795(C20145 c20145, EnumC10477 enumC10477, AbstractC23903 abstractC23903, String str) {
        super(c20145, enumC10477, str);
        this.f60928 = c20145;
        this.f60927 = abstractC23903;
    }

    @Override // l.AbstractC8856, l.AbstractC23903
    public final String toString() {
        return this.f30402 + " wrongSym=" + this.f60927;
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo22991(AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        AbstractC23903 abstractC23903 = this.f60927;
        if (abstractC23903.f77452.m26583() || !abstractC23903.f77452.m26580(C21059.f68585)) {
            return abstractC23903;
        }
        C23800 c23800 = this.f60928.f65444;
        AbstractC16579 abstractC16579 = abstractC23903.f77449;
        c23800.getClass();
        return C23800.m52331(abstractC11242, abstractC0618, abstractC16579).f53222;
    }
}
