package l;

/* JADX INFO: renamed from: l.۬֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12758 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42516;

    public C12758(String str) {
        this.f42516 = str;
    }

    @Override // l.InterfaceC4290
    public final String getName() {
        return this.f42516;
    }

    @Override // l.InterfaceC4290
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo10597() {
        return this.f42516.endsWith("_OUTPUT");
    }

    @Override // l.InterfaceC4290
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10596() {
        return getName().matches("\\bMODULE\\b");
    }
}
