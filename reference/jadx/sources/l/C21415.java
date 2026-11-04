package l;

/* JADX INFO: renamed from: l.᩶ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: OIRX */
/* JADX INFO: loaded from: classes2.dex */
public final class C21415 implements InterfaceC8408 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogC7990 f68212;

    @Override // l.InterfaceC8408
    public final int getCount() {
        return 1;
    }

    @Override // l.InterfaceC8408
    public final long getItemId(int i) {
        return 1L;
    }

    @Override // l.InterfaceC8408
    public final /* synthetic */ void onPageSelected(int i) {
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo22603() {
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22604(int i, long j) {
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ boolean mo22606(int i) {
        return false;
    }

    public C21415(DialogC7990 dialogC7990) {
        this.f68212 = dialogC7990;
    }

    @Override // l.InterfaceC8408
    /* JADX INFO: renamed from: ۙ */
    public final void mo22605(AbstractC13628 abstractC13628, int i, long j) {
        DialogC7990 dialogC7990 = this.f68212;
        if (dialogC7990.f26540 != null) {
            abstractC13628.mo1644(i, j, new C0532(dialogC7990.f26540));
        }
    }
}
