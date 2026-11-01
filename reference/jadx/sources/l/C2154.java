package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2154 extends EnumC13880 {
    public /* synthetic */ C2154(EnumC8112 enumC8112) {
        this("THROWS", 2, enumC8112);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m6715(C19524 c19524, AbstractC16579 abstractC16579) {
        return !abstractC16579.m39005(c19524.f62771);
    }

    public C2154(String str, int i, EnumC8112 enumC8112) {
        super(str, i, enumC8112, 0);
    }

    @Override // l.EnumC13880
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo6717(C10229 c10229, final C19524 c19524) {
        if (!c10229.m26020()) {
            return false;
        }
        final C23800 c23800 = c19524.f62773;
        final C3836 c3836 = c19524.f62774.f43868;
        return C9030.stream(c10229.m26012(EnumC8112.f28427)).filter(new Predicate() { // from class: l.᩻᩻ۤ
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
                return C2154.m6715(c19524, (AbstractC16579) obj);
            }
        }).allMatch(new Predicate() { // from class: l.ܳ᩻ۤ
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
                return C2154.m6716(c23800, c3836, (AbstractC16579) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m6716(C23800 c23800, C3836 c3836, AbstractC16579 abstractC16579) {
        return c23800.m52413(c3836.f14233, abstractC16579, true);
    }

    @Override // l.EnumC13880
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo6718(C10229 c10229, C19524 c19524) {
        return c19524.f62774.f43868.f14233;
    }
}
