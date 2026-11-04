package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15340 extends AbstractC19135 implements Predicate {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1917 f50096;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C7395 mo16631(AbstractC22664 abstractC22664);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15340(C1917 c1917, EnumC21461 enumC21461) {
        super(c1917, enumC21461);
        this.f50096 = c1917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36788(final EnumC4900 enumC4900, final EnumC4900 enumC4901, final int... iArr) {
        this.f61928 = this.f61928.m35552(new Supplier() { // from class: l.᩸۫ۘ
            @Override // java.util.function.Supplier
            public final Object get() {
                AbstractC15340 abstractC15340 = this.f73924;
                return C1917.m6586(abstractC15340.f50096, abstractC15340.f61929, C14769.of((Object) enumC4900), enumC4901, iArr);
            }
        });
    }
}
