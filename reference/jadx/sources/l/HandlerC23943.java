package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* JADX INFO: renamed from: l.᩺֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23943 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14245 f77502;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC23943(C14245 c14245, Looper looper) {
        super(looper);
        this.f77502 = c14245;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        C14245 c14245 = this.f77502;
        if (i == 1) {
            C14245.m34582(c14245, obj, obj2);
        } else {
            if (i != 2) {
                return;
            }
            C14245.m34574(c14245, obj, obj2);
        }
    }
}
