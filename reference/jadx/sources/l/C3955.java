package l;

/* JADX INFO: renamed from: l.ۘ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3955 extends AbstractC5491 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20890 f14699;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3955(C20890 c20890, AbstractActivityC12483 abstractActivityC12483, boolean z, String str) {
        super(abstractActivityC12483, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f14699 = c20890;
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6919() {
        C20890 c20890 = this.f14699;
        c20890.f67867 = false;
        C20890.m46991(c20890);
        c20890.f67870.notifyDataSetChanged();
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6920(C2668 c2668, String str) {
        new C6778(this.f14699, str, c2668).m10243();
    }
}
