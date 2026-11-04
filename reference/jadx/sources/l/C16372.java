package l;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܶ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16372 implements InterfaceC15626 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f53152;

    @Override // l.InterfaceC15626
    /* JADX INFO: renamed from: ۙ */
    public final void mo22081(final AbstractC13389 abstractC13389) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC18259("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: l.ܺ᩸ۙ
            @Override // java.lang.Runnable
            public final void run() {
                C16372.m38860(this.f55854, abstractC13389, threadPoolExecutor);
            }
        });
    }

    public C16372(Context context) {
        this.f53152 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38860(C16372 c16372, AbstractC13389 abstractC13389, ThreadPoolExecutor threadPoolExecutor) {
        try {
            C19356 c19356M44096 = new C19005().m44096(c16372.f53152);
            if (c19356M44096 != null) {
                InterfaceC15626 interfaceC15626 = c19356M44096.f23294;
                ((C8169) interfaceC15626).m22080(threadPoolExecutor);
                interfaceC15626.mo22081(new C17864(abstractC13389, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            abstractC13389.mo8714(th);
            threadPoolExecutor.shutdown();
        }
    }
}
