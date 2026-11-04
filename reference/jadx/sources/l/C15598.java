package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15598 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13908 f50699;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2175 f50700;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f50701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19728 f50702;

    public /* synthetic */ C15598(C2175 c2175, AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        this.f50700 = c2175;
        this.f50702 = abstractC19728;
        this.f50701 = predicate;
        this.f50699 = enumC13908;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5904(this.f50700, this.f50702, this.f50701, this.f50699);
    }
}
