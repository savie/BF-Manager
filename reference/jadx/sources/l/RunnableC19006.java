package l;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19006 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61565;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f61566;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61568;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61569;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61570;

    public /* synthetic */ RunnableC19006(Object obj, Object obj2, Object obj3, KeyEvent.Callback callback, Object obj4, int i) {
        this.f61567 = i;
        this.f61570 = obj;
        this.f61568 = obj2;
        this.f61565 = obj3;
        this.f61566 = callback;
        this.f61569 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61567) {
            case 0:
                DialogInterfaceC8327 dialogInterfaceC8327 = (DialogInterfaceC8327) this.f61570;
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f61568;
                C20956 c20956 = (C20956) this.f61565;
                C23255 c23255 = (C23255) this.f61566;
                RunnableC0361 runnableC0361 = (RunnableC0361) this.f61569;
                if (!dialogInterfaceC8327.m22434() || abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                    return;
                }
                if (abstractActivityC17204 instanceof ActivityC20852) {
                    ((ActivityC20852) abstractActivityC17204).m47679(true);
                }
                try {
                    c20956.m37643(0, R.string.MT_Protector, c23255.m54021().toString(), (String) null, (String[]) null, (Bundle) null);
                    return;
                } catch (RuntimeException e) {
                    runnableC0361.run();
                    throw e;
                }
            default:
                C11650.m29303((String) this.f61570, (String) this.f61568, (C22708) this.f61565, (Activity) this.f61566, (InterfaceC15379) this.f61569);
                return;
        }
    }
}
