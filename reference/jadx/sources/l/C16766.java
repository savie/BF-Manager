package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final enum C16766 extends EnumC3342 {
    public /* synthetic */ C16766(EnumC0816 enumC0816) {
        this("THROWS", 2, enumC0816);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m39577(C2596 c2596, AbstractC22664 abstractC22664) {
        return !abstractC22664.m51073(c2596.f8340);
    }

    public C16766(String str, int i, EnumC0816 enumC0816) {
        super(str, i, enumC0816, 0);
    }

    @Override // l.EnumC3342
    /* JADX INFO: renamed from: ۙ */
    public boolean mo10994(C8274 c8274, final C2596 c2596) {
        if (!c8274.m22337()) {
            return false;
        }
        final C24705 c24705 = c2596.f8338;
        final C14764 c14764 = c2596.f8336.f45699;
        return C1170.stream(c8274.m22332(EnumC0816.f3091)).filter(new Predicate() { // from class: l.ۧۤۘ
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
                return C16766.m39577(c2596, (AbstractC22664) obj);
            }
        }).allMatch(new Predicate() { // from class: l.᩻ۤۘ
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
                return C16766.m39578(c24705, c14764, (AbstractC22664) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m39578(C24705 c24705, C14764 c14764, AbstractC22664 abstractC22664) {
        return c24705.m55131(c14764.f48254, abstractC22664, true);
    }

    @Override // l.EnumC3342
    /* JADX INFO: renamed from: ۤ */
    public AbstractC22664 mo6372(C8274 c8274, C2596 c2596) {
        return c2596.f8336.f45699.f48254;
    }
}
