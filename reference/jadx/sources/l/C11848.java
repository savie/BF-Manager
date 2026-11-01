package l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۨܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: C78L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11848 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f39762;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11601 f39763;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f39764;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f39765;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Executor f39766;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f39767;

    public C11848(C11601 c11601) {
        ExecutorService executorService = C4716.f16636;
        this.f39763 = c11601;
        this.f39766 = executorService;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29541() {
        synchronized (this) {
            this.f39767 = true;
            m29539();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29540() {
        synchronized (this) {
            this.f39762 = true;
            m29539();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29542() {
        synchronized (this) {
            this.f39764 = true;
            m29539();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m29539() {
        if (!this.f39765 && this.f39767 && this.f39762 && this.f39764) {
            this.f39765 = true;
            final C11601 c11601 = this.f39763;
            C13638.requireNonNull(c11601);
            this.f39766.execute(new Runnable() { // from class: l.ܰܿ۬
                @Override // java.lang.Runnable
                public final void run() {
                    c11601.m28928();
                }
            });
        }
    }
}
