package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩵ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes5.dex */
public final class C20683 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3529 f66308;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f66309;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7236 f66310;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12478 f66311;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f66312;

    public C20683(C12478 c12478, C3529 c3529, C7236 c7236, boolean z) {
        this.f66311 = c12478;
        this.f66308 = c3529;
        this.f66310 = c7236;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47316() {
        this.f66310.m19851();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47314(C3025 c3025, Executor executor, C5789 c5789) {
        this.f66310.m19850(c3025, executor, c5789);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17699 m47313(int i, long j, C24655 c24655) {
        return this.f66310.m19849(i, j, c24655);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2761 m47312() {
        return this.f66310.m19848();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47315() {
        if (!this.f66309) {
            this.f66309 = true;
            this.f66312 = C12478.m30976(this.f66311, this);
        }
        return this.f66312;
    }
}
