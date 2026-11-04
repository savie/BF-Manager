package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۢۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10021 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START".equals(action)) {
            if (!"bin.mt.plus.FTP_SERVER_FAILED_TO_START".equals(action)) {
                if (C2564.f8238 && "bin.mt.remote.RemoteServerService.ACTION_STOPPED".equals(action)) {
                    C2564.f8238 = false;
                    C21576.m49069(new RunnableC19792(1), 500L);
                } else if (C2564.f8242 && "bin.mt.plus.FTP_SERVER_STOPPED".equals(action)) {
                    C2564.f8242 = false;
                    C21576.m49069(new RunnableC21927(1), 500L);
                }
            } else {
                String stringExtra = intent.getStringExtra("msg");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C22673.m51154((CharSequence) stringExtra);
                }
                C2564.f8242 = false;
            }
        } else {
            String stringExtra2 = intent.getStringExtra("msg");
            if (!TextUtils.isEmpty(stringExtra2)) {
                C22673.m51154((CharSequence) stringExtra2);
            }
            C2564.f8238 = false;
        }
        C2564.m8614();
    }
}
