package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58TM */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC12008 extends Handler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14245 f38729;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30196() {
        removeCallbacksAndMessages(null);
        this.f38728 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC12008(C14245 c14245, Looper looper) {
        super(looper);
        this.f38729 = c14245;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objM1991;
        C6043 c6043 = (C6043) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                objM1991 = ((C0316) this.f38729.f45007).m1991((C6283) c6043.f20669);
            } else if (i == 2) {
                objM1991 = ((C0316) this.f38729.f45007).m1990(this.f38729.f45019, (C3299) c6043.f20669);
            } else {
                throw new RuntimeException();
            }
        } catch (C10010 e) {
            boolean zM30195 = m30195(message, e);
            objM1991 = e;
            if (zM30195) {
                return;
            }
        } catch (Exception e2) {
            C1896.m6514("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objM1991 = e2;
        }
        Object obj = objM1991;
        InterfaceC4365 interfaceC4365 = this.f38729.f45004;
        long j = c6043.f20671;
        interfaceC4365.getClass();
        synchronized (this) {
            if (!this.f38728) {
                this.f38729.f45026.obtainMessage(message.what, Pair.create(c6043.f20669, obj)).sendToTarget();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30195(Message message, C10010 c10010) {
        IOException c3805;
        C6043 c6043 = (C6043) message.obj;
        if (c6043.f20668) {
            int i = c6043.f20670 + 1;
            c6043.f20670 = i;
            if (i <= this.f38729.f45004.mo13867(3)) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                if (!(c10010.getCause() instanceof IOException)) {
                    c3805 = new C3805(c10010.getCause());
                } else {
                    c3805 = (IOException) c10010.getCause();
                }
                long jMo13868 = this.f38729.f45004.mo13868(new C24503(c3805, c6043.f20670));
                if (jMo13868 != -9223372036854775807L) {
                    synchronized (this) {
                        if (this.f38728) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), jMo13868);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
