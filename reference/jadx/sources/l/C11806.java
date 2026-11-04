package l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۧᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C78L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11806 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9771 f38126;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38127;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f38128;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f38129;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Executor f38130;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f38131;

    public C11806(C9771 c9771) {
        ExecutorService executorService = C5261.f18540;
        this.f38126 = c9771;
        this.f38130 = executorService;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29649() {
        synchronized (this) {
            this.f38128 = true;
            m29647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29648() {
        synchronized (this) {
            this.f38131 = true;
            m29647();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29650() {
        synchronized (this) {
            this.f38129 = true;
            m29647();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m29647() {
        if (!this.f38127 && this.f38128 && this.f38131 && this.f38129) {
            this.f38127 = true;
            C9771 c9771 = this.f38126;
            C17359.requireNonNull(c9771);
            this.f38130.execute(new RunnableC7007(1, c9771));
        }
    }
}
