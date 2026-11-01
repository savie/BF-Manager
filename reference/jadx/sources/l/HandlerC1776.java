package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC1776 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f6912;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14146 f6913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5819() {
        removeCallbacksAndMessages(null);
        this.f6912 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1776(C14146 c14146, Looper looper) {
        super(looper);
        this.f6913 = c14146;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objM14978;
        C9539 c9539 = (C9539) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                objM14978 = ((C5407) this.f6913.f46423).m14978((C9912) c9539.f32232);
            } else if (i == 2) {
                objM14978 = ((C5407) this.f6913.f46423).m14977(this.f6913.f46419, (C24023) c9539.f32232);
            } else {
                throw new RuntimeException();
            }
        } catch (C13169 e) {
            boolean zM5818 = m5818(message, e);
            objM14978 = e;
            if (zM5818) {
                return;
            }
        } catch (Exception e2) {
            C0303.m1852("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objM14978 = e2;
        }
        Object obj = objM14978;
        InterfaceC14113 interfaceC14113 = this.f6913.f46422;
        long j = c9539.f32230;
        interfaceC14113.getClass();
        synchronized (this) {
            if (!this.f6912) {
                this.f6913.f46426.obtainMessage(message.what, Pair.create(c9539.f32232, obj)).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m5818(Message message, C13169 c13169) {
        IOException c4972;
        C9539 c9539 = (C9539) message.obj;
        if (c9539.f32231) {
            int i = c9539.f32233 + 1;
            c9539.f32233 = i;
            if (i <= this.f6913.f46422.mo5494(3)) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                if (!(c13169.getCause() instanceof IOException)) {
                    c4972 = new C4972(c13169.getCause());
                } else {
                    c4972 = (IOException) c13169.getCause();
                }
                long jMo5495 = this.f6913.f46422.mo5495(new C4939(c4972, c9539.f32233));
                if (jMo5495 != -9223372036854775807L) {
                    synchronized (this) {
                        if (this.f6912) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), jMo5495);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
