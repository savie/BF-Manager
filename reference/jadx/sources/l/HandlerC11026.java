package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ۤܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11026 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C15243.m36590(message, "msg");
        int i = message.what;
        if (i == 0) {
            C22961.f74590.m51811();
        } else {
            if (i != 1) {
                return;
            }
            C22961.m51806();
        }
    }
}
