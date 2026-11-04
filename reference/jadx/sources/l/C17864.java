package l;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܽ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17864 extends AbstractC13389 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f58557;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13389 f58558;

    @Override // l.AbstractC13389
    /* JADX INFO: renamed from: ۙ */
    public final void mo8715(C8914 c8914) {
        ThreadPoolExecutor threadPoolExecutor = this.f58557;
        try {
            this.f58558.mo8715(c8914);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // l.AbstractC13389
    /* JADX INFO: renamed from: ۙ */
    public final void mo8714(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f58557;
        try {
            this.f58558.mo8714(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public C17864(AbstractC13389 abstractC13389, ThreadPoolExecutor threadPoolExecutor) {
        this.f58558 = abstractC13389;
        this.f58557 = threadPoolExecutor;
    }
}
