package l;

/* JADX INFO: renamed from: l.ۜۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I97X */
/* JADX INFO: loaded from: classes3.dex */
public final class C6838 extends C13352 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C22616 f22728;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f22729;

    public C6838(C22616 c22616) {
        super(c22616.m50956(), "/" + c22616.m50957() + "/", null, c22616.size(), c22616.m50961(), !c22616.m50958());
        this.f22728 = c22616;
        this.f22729 = C14584.m35193("$RECYCLE.BIN$/" + c22616.m50957() + "/" + c22616.m50956(), new String[0]);
    }

    public C6838(AbstractC22044 abstractC22044, String str) {
        super(abstractC22044.getName(), str, null, abstractC22044.mo4285(), abstractC22044.mo4286(), !abstractC22044.mo4281());
        this.f22728 = null;
        this.f22729 = abstractC22044;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22616 m19056() {
        return this.f22728;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22616 m19055() {
        C22616 c22616 = this.f22728;
        if (c22616 != null) {
            return c22616;
        }
        String parent = getParent();
        int iIndexOf = parent.indexOf(47, 1);
        if (iIndexOf != -1) {
            return C19632.m45276(parent.substring(1, iIndexOf));
        }
        return null;
    }

    @Override // l.C13352
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8381() {
        return this.f22728 != null;
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۘ᩷ */
    public final AbstractC22044 mo8093() {
        return this.f22729;
    }
}
