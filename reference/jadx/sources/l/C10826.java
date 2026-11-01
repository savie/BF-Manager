package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۧۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 570W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10826 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f36859;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5886 f36860;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18316 f36861;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f36862;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23526 f36863;

    public C10826(C23526 c23526, C5886 c5886, C18316 c18316, boolean z) {
        this.f36863 = c23526;
        this.f36860 = c5886;
        this.f36861 = c18316;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m27146() {
        this.f36861.m42551();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27144(C3768 c3768, Executor executor, C21180 c21180) {
        this.f36861.m42550(c3768, executor, c21180);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16470 m27143(int i, long j, C1569 c1569) {
        return this.f36861.m42549(i, j, c1569);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15495 m27142() {
        return this.f36861.m42548();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m27145() {
        if (!this.f36862) {
            this.f36862 = true;
            this.f36859 = C23526.m51825(this.f36863, this);
        }
        return this.f36859;
    }
}
