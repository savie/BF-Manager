package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۖ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3009 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9771;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9772;

    public /* synthetic */ RunnableC3009(int i, Object obj) {
        this.f9771 = i;
        this.f9772 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9771;
        Object obj = this.f9772;
        switch (i) {
            case 0:
                String str = ((String[]) obj)[1];
                C17930 c17930 = C7484.f24760;
                C15243.m36590(str, "orderId");
                new Thread(new RunnableC8518(4, str)).start();
                return;
            case 1:
                C22403.m50520((C22403) obj);
                return;
            case 2:
                C3033.m9852(((ActivityC9458) obj).f30672);
                return;
            default:
                Context context = (Context) obj;
                try {
                    Intent intent = new Intent();
                    intent.setFlags(268435456);
                    intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"));
                    context.startActivity(intent);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException("Unable to open OPPO floating window settings", e);
                }
        }
    }
}
