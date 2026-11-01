package l;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: l.ۘ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79M1 */
/* JADX INFO: loaded from: classes2.dex */
public class C3590 implements InterfaceC3900 {
    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo10668(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            final Context applicationContext = context.getApplicationContext();
            C21936.m48753(new Runnable(this) { // from class: l.ۖ֡ܰ
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler;
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = C0768.m3298(Looper.getMainLooper());
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    handler.postDelayed(new RunnableC19285(1, applicationContext), new Random().nextInt(Math.max(1000, 1)) + OpenAuthTask.Duplex);
                }
            });
            return new C12764();
        }
        return new C12764();
    }

    @Override // l.InterfaceC3900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo10669() {
        return Collections.EMPTY_LIST;
    }
}
