package l;

/* JADX INFO: renamed from: l.ۖܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2798 extends AbstractC24700 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2009 f9207;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2798(C2009 c2009, AbstractActivityC17204 abstractActivityC17204, boolean z, String str) {
        super(abstractActivityC17204, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f9207 = c2009;
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8145() {
        C2009 c2009 = this.f9207;
        c2009.f6683 = false;
        C2009.m6883(c2009);
        c2009.f6689.notifyDataSetChanged();
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8146(C11273 c11273, String str) {
        new C8764(this.f9207, str, c11273).m8197();
    }
}
