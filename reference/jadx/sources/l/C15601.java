package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܳ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15601 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f50711;

    public C15601(DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f50711 = dialogInterfaceC8327;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f50711;
        if (dialogInterfaceC8327.m22434()) {
            dialogInterfaceC8327.dismiss();
        }
    }
}
