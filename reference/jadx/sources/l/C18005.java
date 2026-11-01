package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes4.dex */
public final class C18005 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f57597;

    public C18005(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128) {
        this.f57597 = new WeakReference(dialogInterfaceOnClickListenerC8128);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = (DialogInterfaceOnClickListenerC8128) this.f57597.get();
        if (dialogInterfaceOnClickListenerC8128 == null || !dialogInterfaceOnClickListenerC8128.f28460.m44375()) {
            C21843.m48614(C16737.m39277()).m48616(this);
            return;
        }
        final String stringExtra = intent.getStringExtra("pkgName");
        if (C13638.equals(stringExtra, dialogInterfaceOnClickListenerC8128.f28459.m42535())) {
            DialogInterfaceOnClickListenerC8128.f28451 = false;
            C8067 c8067BuildDialog = dialogInterfaceOnClickListenerC8128.f28458.m28824().buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۧۚ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8129 = dialogInterfaceOnClickListenerC8128;
                    dialogInterfaceOnClickListenerC8129.f28461 = true;
                    dialogInterfaceOnClickListenerC8129.f28458.m28824().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", stringExtra, null)));
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ۧۚ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterfaceOnClickListenerC8128.m21412(false);
                }
            });
            C23250.m51307(c8067BuildDialog.m21269());
        }
    }
}
