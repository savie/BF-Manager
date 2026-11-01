package l;

/* JADX INFO: renamed from: l.᩸ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C21360 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13026 f69483;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f69484;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile C22772 f69485;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2516 f69486;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile long f69487;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7955 f69488;

    public C21360(ViewOnClickListenerC7955 viewOnClickListenerC7955, C13026 c13026, C2516 c2516) {
        this.f69488 = viewOnClickListenerC7955;
        this.f69483 = c13026;
        this.f69486 = c2516;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47893() {
        C22772 c22772 = this.f69485;
        if (c22772 == null || c22772.f74146 || c22772.f74148 == 0 || !this.f69488.m21002(this.f69486) || this.f69486.m7808() != this.f69487) {
            return;
        }
        this.f69483.m32239();
        C13026 c13026 = this.f69483;
        int i = c22772.f74147;
        C13732 c13732 = c13026.f43452;
        c13732.m33449(i, true);
        c13026.invalidate();
        c13026.m32232(c13732.m33443());
        this.f69484 = true;
    }
}
