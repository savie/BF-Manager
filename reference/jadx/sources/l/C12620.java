package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C12620 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2596 f40480;

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
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        return (abstractC22664.mo9329() || abstractC22664.m51073(this.f40480.f8340) || abstractC22664.m51067(EnumC21172.BOT)) ? false : true;
    }

    public C12620(C2596 c2596) {
        this.f40480 = c2596;
    }
}
