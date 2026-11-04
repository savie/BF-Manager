package l;

/* JADX INFO: renamed from: l.ܳ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes5.dex */
public final class C15637 implements InterfaceC0516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13400 f50777;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15508 f50778;

    @Override // l.InterfaceC0516
    /* JADX INFO: renamed from: ۙ */
    public final void mo2478() {
    }

    public C15637(C13400 c13400, C15508 c15508) {
        this.f50777 = c13400;
        this.f50778 = c15508;
    }

    @Override // l.InterfaceC0516
    public final CharSequence getText() {
        return this.f50778;
    }

    @Override // l.InterfaceC0516
    public final int start(int i) {
        return this.f50777.f42706[i * 2];
    }

    @Override // l.InterfaceC0516
    public final int end(int i) {
        return this.f50777.f42706[(i * 2) + 1];
    }

    @Override // l.InterfaceC0516
    public final int groupCount() {
        return this.f50777.f42704;
    }

    @Override // l.InterfaceC0516
    public final C18415 pattern() {
        return this.f50777.f42705;
    }

    @Override // l.InterfaceC0516
    public final String group(int i) {
        if (i < 0 || i > this.f50777.f42704) {
            return "";
        }
        int iStart = start(i);
        int iEnd = end(i);
        return (iStart < 0 || iEnd < 0) ? "" : this.f50778.subSequence(iStart, iEnd);
    }
}
