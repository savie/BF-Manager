package l;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0182 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HandlerC21065 f1267;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f1268;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f1265 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaSession.Callback f1264 = new C18081(this);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public WeakReference f1266 = new WeakReference(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1478() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1479(long j) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo1482() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo1483() {
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo1485() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1484(InterfaceC7640 interfaceC7640, Handler handler) {
        synchronized (this.f1265) {
            this.f1266 = new WeakReference(interfaceC7640);
            HandlerC21065 handlerC21065 = this.f1267;
            HandlerC21065 handlerC21066 = null;
            if (handlerC21065 != null) {
                handlerC21065.removeCallbacksAndMessages(null);
            }
            if (interfaceC7640 != null && handler != null) {
                handlerC21066 = new HandlerC21065(this, handler.getLooper());
            }
            this.f1267 = handlerC21066;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1481(Intent intent) {
        InterfaceC7640 interfaceC7640;
        HandlerC21065 handlerC21065;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f1265) {
                interfaceC7640 = (InterfaceC7640) this.f1266.get();
                handlerC21065 = this.f1267;
            }
            if (interfaceC7640 != null && handlerC21065 != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C5734 c5734Mo20859 = interfaceC7640.mo20859();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() == 0) {
                        if (this.f1268) {
                            handlerC21065.removeMessages(1);
                            this.f1268 = false;
                            C3668 c3668Mo20860 = interfaceC7640.mo20860();
                            if (((c3668Mo20860 == null ? 0L : c3668Mo20860.f12611) & 32) != 0) {
                                mo1482();
                            }
                            return true;
                        }
                        this.f1268 = true;
                        handlerC21065.sendMessageDelayed(handlerC21065.obtainMessage(1, c5734Mo20859), ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    m1480(interfaceC7640, handlerC21065);
                    return true;
                }
                m1480(interfaceC7640, handlerC21065);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1480(InterfaceC7640 interfaceC7640, Handler handler) {
        if (this.f1268) {
            this.f1268 = false;
            handler.removeMessages(1);
            C3668 c3668Mo20860 = interfaceC7640.mo20860();
            long j = c3668Mo20860 == null ? 0L : c3668Mo20860.f12611;
            boolean z = c3668Mo20860 != null && c3668Mo20860.f12605 == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                mo1478();
            } else {
                if (z || !z2) {
                    return;
                }
                mo1483();
            }
        }
    }
}
