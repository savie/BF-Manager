package l;

/* JADX INFO: renamed from: l.ܳۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes4.dex */
public class C14317 implements InterfaceC7239, InterfaceC19940 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC7239 f46898;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4935 f46899;

    public C14317(C4935 c4935, InterfaceC7239 interfaceC7239) {
        this.f46899 = c4935;
        this.f46898 = interfaceC7239;
    }

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return this.f46898.mo1599();
    }

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۖ */
    public final int mo17670() {
        return this.f46898.mo17670();
    }

    @Override // l.InterfaceC19940
    public final String getName() {
        return ((InterfaceC19940) this.f46898).getName();
    }

    @Override // l.InterfaceC19940
    public final String getType() {
        return (String) C15604.m37269(this.f46899.f17266.m29872(), ((InterfaceC19940) this.f46898).getType());
    }

    @Override // l.InterfaceC19940
    public final String getSignature() {
        return ((InterfaceC19940) this.f46898).getSignature();
    }
}
