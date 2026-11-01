package l;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹ۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22015 extends AbstractC14960 implements BiPredicate {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10727 f71371;

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C22623.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C22623.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C22623.$default$or(this, biPredicate);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C10498 mo3459(AbstractC16579 abstractC16579, AbstractC16579 abstractC165710);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22015(C10727 c10727, EnumC18651 enumC18651) {
        super(c10727, enumC18651);
        this.f71371 = c10727;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48901(final EnumC20604 enumC20604, final EnumC20604 enumC20605, final EnumC20604 enumC20606, final int... iArr) {
        this.f48853 = this.f48853.m48597(new Supplier() { // from class: l.ۖۗۤ
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC22015 abstractC22015 = this.f8085;
                return C10727.m26953(abstractC22015.f71371, abstractC22015.f48856, C21825.of((Object) enumC20604, (Object) enumC20605), enumC20606, iArr);
            }
        });
    }
}
