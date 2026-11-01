package l;

import android.content.Context;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19285 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62240;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62241;

    public /* synthetic */ RunnableC19285(int i, Object obj) {
        this.f62240 = i;
        this.f62241 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62240) {
            case 0:
                C23519.m51779((C23519) this.f62241);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC7448(1, (Context) this.f62241));
                return;
            default:
                try {
                    ((ServerSocket) this.f62241).close();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
