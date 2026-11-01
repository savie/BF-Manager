package l;

/* JADX INFO: renamed from: l.֨ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0847 extends AbstractC22015 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f3490;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C10727 c10727 = this.f3490;
        EnumC6617 enumC6617Mo1933 = c10727.m26964((AbstractC16579) obj).mo1933();
        EnumC6617 enumC6617Mo1934 = c10727.m26964((AbstractC16579) obj2).mo1933();
        EnumC6617 enumC6617 = EnumC6617.LONG;
        if (enumC6617Mo1933 == enumC6617 || enumC6617Mo1933 == EnumC6617.INT) {
            return enumC6617Mo1934 == enumC6617 || enumC6617Mo1934 == EnumC6617.INT;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0847(C10727 c10727, EnumC18651 enumC18651) {
        super(c10727, enumC18651);
        this.f3490 = c10727;
    }

    @Override // l.AbstractC22015
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10498 mo3459(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        C10727 c10727 = this.f3490;
        return m35939(new C5081(this, c10727.m26964(abstractC16579), c10727.m26964(abstractC165710)));
    }
}
