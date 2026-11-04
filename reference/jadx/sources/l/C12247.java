package l;

/* JADX INFO: renamed from: l.ۨۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12247 implements InterfaceC24928 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39403;

    public C12247(String str) {
        this.f39403 = str;
    }

    @Override // l.InterfaceC24928
    public final String getName() {
        return this.f39403;
    }

    @Override // l.InterfaceC24928
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11525() {
        return this.f39403.endsWith("_OUTPUT");
    }

    @Override // l.InterfaceC24928
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11523() {
        return getName().matches("\\bMODULE\\b");
    }
}
