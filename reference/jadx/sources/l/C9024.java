package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9024 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f30824;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f30825;

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

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        return abstractC23903.f77452 == EnumC10477.f35879 && (abstractC23903.mo20276() & 8796093022208L) != 0 && abstractC23903.mo42454((AbstractC23903) this.f30824.f53222, this.f30825.f68417) && !abstractC23903.m52713();
    }

    public C9024(C21017 c21017, AbstractC16579 abstractC16579) {
        this.f30825 = c21017;
        this.f30824 = abstractC16579;
    }
}
