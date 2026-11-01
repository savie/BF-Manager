package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10100 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START".equals(action)) {
            if (!"bin.mt.plus.FTP_SERVER_FAILED_TO_START".equals(action)) {
                if (C15745.f51047 && "bin.mt.remote.RemoteServerService.ACTION_STOPPED".equals(action)) {
                    C15745.f51047 = false;
                    C16737.m39274(new RunnableC8689(0), 500L);
                } else if (C15745.f51048 && "bin.mt.plus.FTP_SERVER_STOPPED".equals(action)) {
                    C15745.f51048 = false;
                    C16737.m39274(new RunnableC15163(1), 500L);
                }
            } else {
                String stringExtra = intent.getStringExtra("msg");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C15829.m37613((CharSequence) stringExtra);
                }
                C15745.f51048 = false;
            }
        } else {
            String stringExtra2 = intent.getStringExtra("msg");
            if (!TextUtils.isEmpty(stringExtra2)) {
                C15829.m37613((CharSequence) stringExtra2);
            }
            C15745.f51047 = false;
        }
        C15745.m37471();
    }
}
