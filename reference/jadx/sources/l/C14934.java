package l;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܶۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14934 extends AbstractC21989 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f48710;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21989 f48711;

    @Override // l.AbstractC21989
    /* JADX INFO: renamed from: ۙ */
    public final void mo34913(C1527 c1527) {
        ThreadPoolExecutor threadPoolExecutor = this.f48710;
        try {
            this.f48711.mo34913(c1527);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // l.AbstractC21989
    /* JADX INFO: renamed from: ۙ */
    public final void mo34912(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f48710;
        try {
            this.f48711.mo34912(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public C14934(AbstractC21989 abstractC21989, ThreadPoolExecutor threadPoolExecutor) {
        this.f48711 = abstractC21989;
        this.f48710 = threadPoolExecutor;
    }
}
