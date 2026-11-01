package l;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16403 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f52772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HandlerC19931 f52776;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f52775 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaSession.Callback f52773 = new C0174(this);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public WeakReference f52774 = new WeakReference(null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo38608() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38609() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo38610(long j) {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo38613() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo38614() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38615(InterfaceC12170 interfaceC12170, Handler handler) {
        synchronized (this.f52775) {
            this.f52774 = new WeakReference(interfaceC12170);
            HandlerC19931 handlerC19931 = this.f52776;
            HandlerC19931 handlerC19932 = null;
            if (handlerC19931 != null) {
                handlerC19931.removeCallbacksAndMessages(null);
            }
            if (interfaceC12170 != null && handler != null) {
                handlerC19932 = new HandlerC19931(this, handler.getLooper());
            }
            this.f52776 = handlerC19932;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo38612(Intent intent) {
        InterfaceC12170 interfaceC12170;
        HandlerC19931 handlerC19931;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f52775) {
                interfaceC12170 = (InterfaceC12170) this.f52774.get();
                handlerC19931 = this.f52776;
            }
            if (interfaceC12170 != null && handlerC19931 != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C16094 c16094Mo16004 = interfaceC12170.mo16004();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() == 0) {
                        if (this.f52772) {
                            handlerC19931.removeMessages(1);
                            this.f52772 = false;
                            C8205 c8205Mo16001 = interfaceC12170.mo16001();
                            if (((c8205Mo16001 == null ? 0L : c8205Mo16001.f28572) & 32) != 0) {
                                mo38613();
                            }
                            return true;
                        }
                        this.f52772 = true;
                        handlerC19931.sendMessageDelayed(handlerC19931.obtainMessage(1, c16094Mo16004), ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    m38611(interfaceC12170, handlerC19931);
                    return true;
                }
                m38611(interfaceC12170, handlerC19931);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38611(InterfaceC12170 interfaceC12170, Handler handler) {
        if (this.f52772) {
            this.f52772 = false;
            handler.removeMessages(1);
            C8205 c8205Mo16001 = interfaceC12170.mo16001();
            long j = c8205Mo16001 == null ? 0L : c8205Mo16001.f28572;
            boolean z = c8205Mo16001 != null && c8205Mo16001.f28571 == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                mo38609();
            } else {
                if (z || !z2) {
                    return;
                }
                mo38614();
            }
        }
    }
}
