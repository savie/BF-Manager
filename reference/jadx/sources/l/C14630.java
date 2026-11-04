package l;

/* JADX INFO: renamed from: l.ܰ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14630 implements InterfaceC0516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f47875;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f47876 = new int[2];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15508 f47877;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f47878;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18415 f47879;

    public C14630(C15508 c15508, C18415 c18415, Runnable runnable) {
        this.f47877 = c15508;
        this.f47879 = c18415;
        this.f47875 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35268(C4245 c4245, boolean z) {
        int iGroupCount = z ? c4245.groupCount() : 0;
        this.f47878 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f47876.length < i) {
            this.f47876 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f47878; i2++) {
            int i3 = i2 * 2;
            this.f47876[i3] = c4245.start(i2);
            this.f47876[i3 + 1] = c4245.end(i2);
        }
    }

    @Override // l.InterfaceC0516
    public final CharSequence getText() {
        return this.f47877;
    }

    @Override // l.InterfaceC0516
    public final C18415 pattern() {
        return this.f47879;
    }

    @Override // l.InterfaceC0516
    public final int groupCount() {
        return this.f47878;
    }

    @Override // l.InterfaceC0516
    public final int start(int i) {
        return this.f47876[i * 2];
    }

    @Override // l.InterfaceC0516
    public final int end(int i) {
        return this.f47876[(i * 2) + 1];
    }

    @Override // l.InterfaceC0516
    public final String group(int i) {
        if (i >= 0 && i <= this.f47878) {
            int iStart = start(i);
            int iEnd = end(i);
            if (iStart >= 0 && iEnd >= 0) {
                return this.f47877.subSequence(iStart, iEnd);
            }
        }
        return "";
    }

    @Override // l.InterfaceC0516
    /* JADX INFO: renamed from: ۙ */
    public final void mo2478() {
        this.f47875.run();
    }
}
