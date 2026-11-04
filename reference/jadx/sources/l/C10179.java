package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10179 extends AbstractC1231 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f32588;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19728 f32589;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13908 f32590;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10179(C9433 c9433, boolean z, AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        super(c9433, z);
        this.f32589 = abstractC19728;
        this.f32588 = predicate;
        this.f32590 = enumC13908;
    }

    @Override // l.AbstractC1231
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo4468(AbstractC22970 abstractC22970) {
        return abstractC22970.mo29571().mo7473(this.f32589, this.f32588, this.f32590);
    }
}
