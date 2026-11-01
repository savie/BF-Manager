package l;

/* JADX INFO: renamed from: l.ۖۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2252 extends AbstractC5491 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7898 f8055;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2252(C7898 c7898, AbstractActivityC12483 abstractActivityC12483, boolean z, String str) {
        super(abstractActivityC12483, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f8055 = c7898;
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6919() {
        C7898 c7898 = this.f8055;
        c7898.f25964 = false;
        C7898.m20898(c7898);
        c7898.f25967.notifyDataSetChanged();
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6920(C2668 c2668, String str) {
        new C5075(this.f8055, str, c2668).m10243();
    }
}
