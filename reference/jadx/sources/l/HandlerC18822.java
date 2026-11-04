package l;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.ᩳۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X58A */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18822 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractFragmentC6889 f61168;

    public HandlerC18822(AbstractFragmentC6889 abstractFragmentC6889) {
        this.f61168 = abstractFragmentC6889;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.f61168.m19153();
    }
}
