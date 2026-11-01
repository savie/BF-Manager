package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22090 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f71558;

    public /* synthetic */ RunnableC22090(int i, Object obj) {
        this.f71557 = i;
        this.f71558 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f71557) {
            case 0:
                C5301.m14721(((View) this.f71558).findViewById(R.id.MT_Protector));
                break;
            case 1:
                DialogInterfaceOnClickListenerC8128.m21411((C17485) this.f71558);
                break;
            case 2:
                ((InterfaceC22438) this.f71558).mo29544(-1);
                break;
            default:
                C16830.m39476((Context) this.f71558);
                break;
        }
    }
}
