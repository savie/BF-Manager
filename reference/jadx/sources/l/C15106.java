package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15106 extends AbstractC17927 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC10167 f49327;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f49328;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15106(C18633 c18633, boolean z, Predicate predicate, EnumC10167 enumC10167) {
        super(c18633, z);
        this.f49328 = predicate;
        this.f49327 = enumC10167;
    }

    @Override // l.AbstractC17927
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo36181(AbstractC0618 abstractC0618) {
        return abstractC0618.mo20272().mo3802(this.f49328, this.f49327);
    }
}
