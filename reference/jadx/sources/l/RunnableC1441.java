package l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֨᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1441 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5907;

    public /* synthetic */ RunnableC1441(int i, Object obj) {
        this.f5906 = i;
        this.f5907 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5906;
        Object obj = this.f5907;
        switch (i) {
            case 0:
                int i2 = ServiceC8498.f29454;
                ((C22609) obj).mo39649();
                new Handler(Looper.getMainLooper()).post(new RunnableC15554(0));
                return;
            case 1:
                C8964.m23267((C8964) obj);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent.putExtra("packageName", context.getPackageName());
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    return;
                } catch (RuntimeException e) {
                    if (Build.VERSION.SDK_INT < 23) {
                        throw e;
                    }
                    C16125.m38166(context);
                    return;
                }
        }
    }
}
