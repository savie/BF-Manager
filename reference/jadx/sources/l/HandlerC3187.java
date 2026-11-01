package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: renamed from: l.ۗۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC3187 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14146 f11972;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3187(C14146 c14146, Looper looper) {
        super(looper);
        this.f11972 = c14146;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        C14146 c14146 = this.f11972;
        if (i == 1) {
            C14146.m34213(c14146, obj, obj2);
        } else {
            if (i != 2) {
                return;
            }
            C14146.m34207(c14146, obj, obj2);
        }
    }
}
