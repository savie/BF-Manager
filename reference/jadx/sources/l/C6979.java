package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6979 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f23030;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22092 f23031;

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

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        return abstractC11781.f38066 == EnumC13603.f43218 && (abstractC11781.mo29591() & 8796093022208L) != 0 && abstractC11781.mo26690((AbstractC11781) this.f23030.f73596, this.f23031.f71203) && !abstractC11781.m29570();
    }

    public C6979(C22092 c22092, AbstractC22664 abstractC22664) {
        this.f23031 = c22092;
        this.f23030 = abstractC22664;
    }
}
