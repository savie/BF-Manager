package l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1518 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5299;

    public /* synthetic */ RunnableC1518(int i, Object obj) {
        this.f5298 = i;
        this.f5299 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5298;
        Object obj = this.f5299;
        switch (i) {
            case 0:
                String str = ((String[]) obj)[1];
                C17930 c17930 = C7484.f24760;
                C15243.m36590(str, "orderId");
                new Thread(new RunnableC8518(4, str)).start();
                return;
            case 1:
                C4059.m13062((C4059) obj);
                return;
            case 2:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((C15945) it.next()).m38022();
                }
                return;
            case 3:
                ((C8230) obj).m22140();
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
                    C7543.m20611(context);
                    return;
                }
        }
    }
}
