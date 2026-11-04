package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.connect.common.AssistActivity;

/* JADX INFO: renamed from: l.᩹ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC23322 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f75544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC23322(AssistActivity assistActivity, Looper looper) {
        super(looper);
        this.f75544 = assistActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            AssistActivity assistActivity = this.f75544;
            if (assistActivity.isFinishing()) {
                return;
            }
            C21587.m49114(assistActivity.f882, "-->finish by timeout");
            assistActivity.finish();
        }
    }
}
