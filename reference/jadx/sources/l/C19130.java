package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19130 extends AbstractC1231 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f61905;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13908 f61906;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19130(C9433 c9433, boolean z, Predicate predicate, EnumC13908 enumC13908) {
        super(c9433, z);
        this.f61905 = predicate;
        this.f61906 = enumC13908;
    }

    @Override // l.AbstractC1231
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo4468(AbstractC22970 abstractC22970) {
        return abstractC22970.mo29571().mo7472(this.f61905, this.f61906);
    }
}
