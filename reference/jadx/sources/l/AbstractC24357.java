package l;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩺ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24357 extends AbstractC19135 implements BiPredicate {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f79026;

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return C20517.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiPredicate negate() {
        return C20517.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return C20517.$default$or(this, biPredicate);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C7395 mo11429(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC24357(C1917 c1917, EnumC21461 enumC21461) {
        super(c1917, enumC21461);
        this.f79026 = c1917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54426(final EnumC4900 enumC4900, final EnumC4900 enumC4901, final EnumC4900 enumC4902, final int... iArr) {
        this.f61928 = this.f61928.m35552(new Supplier() { // from class: l.ۨܳۘ
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC24357 abstractC24357 = this.f39940;
                return C1917.m6586(abstractC24357.f79026, abstractC24357.f61929, C14769.of((Object) enumC4900, (Object) enumC4901), enumC4902, iArr);
            }
        });
    }
}
