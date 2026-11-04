package l;

/* JADX INFO: renamed from: l.ܺܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f55304;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17657 f55305;

    public C16911(C17657 c17657) {
        this.f55305 = c17657;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39896(final C18787 c18787) {
        C20124 c20124 = new C20124();
        c20124.m46291(c18787.f61012);
        c20124.m46333(c18787.f61011);
        c20124.m46315("video/raw");
        this.f55304 = c20124.m46295();
        this.f55305.f58040.execute(new Runnable() { // from class: l.᩻ܳ᩷
            @Override // java.lang.Runnable
            public final void run() {
                this.f81239.f55305.f58044.mo26316(c18787);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39895(long j, long j2, boolean z) {
        C17657 c17657 = this.f55305;
        if (z && c17657.f58045 != null) {
            c17657.f58040.execute(new Runnable() { // from class: l.֫ܳ᩷
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6657.f55305.f58044.mo26317();
                }
            });
        }
        C15648 c15648M46295 = this.f55304;
        if (c15648M46295 == null) {
            c15648M46295 = new C20124().m46295();
        }
        c17657.f58041.mo24942(j2, j, c15648M46295, null);
        ((InterfaceC18338) c17657.f58042.remove()).mo30911(j);
    }
}
