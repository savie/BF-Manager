package l;

/* JADX INFO: renamed from: l.ۢۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9901 extends AbstractC2335 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f31827;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f31828;

    @Override // l.AbstractC2335, l.AbstractC11781
    /* JADX INFO: renamed from: ۟ */
    public boolean mo7873() {
        return !(this instanceof C1699);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9901(C22010 c22010, EnumC13603 enumC13603, AbstractC11781 abstractC11781, String str) {
        super(c22010, enumC13603, str);
        this.f31827 = c22010;
        this.f31828 = abstractC11781;
    }

    @Override // l.AbstractC2335, l.AbstractC11781
    public final String toString() {
        return this.f7553 + " wrongSym=" + this.f31828;
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo7872(AbstractC19728 abstractC19728, AbstractC22970 abstractC22970) {
        AbstractC11781 abstractC11781 = this.f31828;
        if (abstractC11781.f38066.m33353() || !abstractC11781.f38066.m33349(C22114.f71269)) {
            return abstractC11781;
        }
        C24705 c24705 = this.f31827.f71021;
        AbstractC22664 abstractC22664 = abstractC11781.f38067;
        c24705.getClass();
        return C24705.m55061(abstractC19728, abstractC22970, abstractC22664).f73596;
    }
}
