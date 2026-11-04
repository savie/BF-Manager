package l;

/* JADX INFO: renamed from: l.ۢᩴۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 950L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10319 implements InterfaceC3939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1371 f32921;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32922;

    public C10319(C1371 c1371, int i) {
        this.f32921 = c1371;
        this.f32922 = i;
    }

    @Override // l.InterfaceC3939
    public final int getKey() {
        return this.f32921.f4892 + this.f32922;
    }

    @Override // l.InterfaceC3939
    public final int getOffset() {
        C1371 c1371 = this.f32921;
        return c1371.f4891.f62313.m55818().mo8725((this.f32922 * 4) + c1371.f4891.f62315 + 8);
    }
}
