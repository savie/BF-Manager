package l;

/* JADX INFO: renamed from: l.ۖۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2405 extends AbstractC24700 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1965 f7722;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2405(C1965 c1965, AbstractActivityC17204 abstractActivityC17204, boolean z, String str) {
        super(abstractActivityC17204, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f7722 = c1965;
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8145() {
        C1965 c1965 = this.f7722;
        c1965.f6589 = false;
        C1965.m6764(c1965);
        c1965.f6595.notifyDataSetChanged();
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8146(C11273 c11273, String str) {
        new C8371(this.f7722, str, c11273).m8197();
    }
}
