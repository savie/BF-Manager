package l;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.۟ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC7627 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractServiceC21032 f25184;

    public HandlerC7627(AbstractServiceC21032 abstractServiceC21032) {
        this.f25184 = abstractServiceC21032;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractServiceC21032 abstractServiceC21032 = this.f25184;
        if (abstractServiceC21032 != null) {
            abstractServiceC21032.m47410(message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20154() {
        this.f25184 = null;
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(C5694.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20155(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}
