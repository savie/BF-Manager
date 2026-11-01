package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۜᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC6957 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C13465.m32966(message, "msg");
        int i = message.what;
        if (i == 0) {
            C23186.f75236.m51205();
        } else {
            if (i != 1) {
                return;
            }
            C23186.m51207();
        }
    }
}
