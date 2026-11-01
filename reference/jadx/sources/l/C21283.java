package l;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩸ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21283 implements InterfaceC5055 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f69279;

    @Override // l.InterfaceC5055
    /* JADX INFO: renamed from: ۙ */
    public final void mo14095(final AbstractC21989 abstractC21989) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0385("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: l.᩺ۖۙ
            @Override // java.lang.Runnable
            public final void run() {
                C21283.m47739(this.f73929, abstractC21989, threadPoolExecutor);
            }
        });
    }

    public C21283(Context context) {
        this.f69279 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47739(C21283 c21283, AbstractC21989 abstractC21989, ThreadPoolExecutor threadPoolExecutor) {
        try {
            C17050 c17050M30802 = new C12381().m30802(c21283.f69279);
            if (c17050M30802 != null) {
                InterfaceC5055 interfaceC5055 = c17050M30802.f11994;
                ((C12112) interfaceC5055).m30149(threadPoolExecutor);
                interfaceC5055.mo14095(new C14934(abstractC21989, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            abstractC21989.mo34912(th);
            threadPoolExecutor.shutdown();
        }
    }
}
