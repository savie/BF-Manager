package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21455 extends AbstractC17927 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC10167 f69748;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11242 f69749;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f69750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21455(C18633 c18633, boolean z, AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        super(c18633, z);
        this.f69749 = abstractC11242;
        this.f69750 = predicate;
        this.f69748 = enumC10167;
    }

    @Override // l.AbstractC17927
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo36181(AbstractC0618 abstractC0618) {
        return abstractC0618.mo20272().mo3803(this.f69749, this.f69750, this.f69748);
    }
}
