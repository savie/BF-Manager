package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14654 extends C2175 {
    @Override // l.C2175
    /* JADX INFO: renamed from: ۤ */
    public final C4214 mo7477(AbstractC19728 abstractC19728) {
        C4214 c4214M7483 = m7483(abstractC19728, null);
        return c4214M7483.f15399 == null ? new C4214(this.f53083, null, null, null) : c4214M7483;
    }

    @Override // l.C2175, l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo7474(AbstractC19728 abstractC19728, Predicate predicate) {
        return m7483(abstractC19728, predicate).f15400;
    }

    @Override // l.C2175, l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7472(Predicate predicate, EnumC13908 enumC13908) {
        return new C20074(this, enumC13908, predicate);
    }

    @Override // l.C2175, l.AbstractC16344
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo7473(AbstractC19728 abstractC19728, Predicate predicate, EnumC13908 enumC13908) {
        return new C15598(this, abstractC19728, predicate, enumC13908);
    }

    public C14654(C24550 c24550) {
        super(c24550);
    }

    @Override // l.C2175, l.AbstractC17836
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC17836 mo7478(AbstractC11781 abstractC11781) {
        return new C14654(this, abstractC11781, this.f7153);
    }

    @Override // l.C2175, l.AbstractC17836
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17836 mo7486(AbstractC11781 abstractC11781) {
        return new C14654(this, abstractC11781, (C4214[]) this.f7153.clone());
    }
}
