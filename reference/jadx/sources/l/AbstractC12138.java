package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12138 extends AbstractC14960 implements Predicate {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f40634;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C10498 mo15919(AbstractC16579 abstractC16579);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12138(C10727 c10727, EnumC18651 enumC18651) {
        super(c10727, enumC18651);
        this.f40634 = c10727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30212(final EnumC20604 enumC20604, final EnumC20604 enumC20605, final int... iArr) {
        this.f48853 = this.f48853.m48597(new Supplier() { // from class: l.֡ۗۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC12138 abstractC12138 = this.f1185;
                return C10727.m26953(abstractC12138.f40634, abstractC12138.f48856, C21825.of((Object) enumC20604), enumC20605, iArr);
            }
        });
    }
}
