package l;

/* JADX INFO: renamed from: l.ᩴܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18793 implements InterfaceC1988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8210 f60920;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3329 f60921;

    @Override // l.InterfaceC1988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6401() {
    }

    public C18793(C8210 c8210, C3329 c3329) {
        this.f60920 = c8210;
        this.f60921 = c3329;
    }

    @Override // l.InterfaceC1988
    public final CharSequence getText() {
        return this.f60921;
    }

    @Override // l.InterfaceC1988
    public final int start(int i) {
        return this.f60920.f28590[i * 2];
    }

    @Override // l.InterfaceC1988
    public final int end(int i) {
        return this.f60920.f28590[(i * 2) + 1];
    }

    @Override // l.InterfaceC1988
    public final int groupCount() {
        return this.f60920.f28588;
    }

    @Override // l.InterfaceC1988
    public final C14690 pattern() {
        return this.f60920.f28589;
    }

    @Override // l.InterfaceC1988
    public final String group(int i) {
        if (i < 0 || i > this.f60920.f28588) {
            return "";
        }
        int iStart = start(i);
        int iEnd = end(i);
        return (iStart < 0 || iEnd < 0) ? "" : this.f60921.subSequence(iStart, iEnd);
    }
}
