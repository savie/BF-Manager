package l;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: l.ܺܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16899 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55261;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55262;

    public /* synthetic */ RunnableC16899(int i, Object obj) {
        this.f55261 = i;
        this.f55262 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55261) {
            case 0:
                ServiceC6459.m18245((ServiceC6459) this.f55262);
                break;
            case 1:
                ServiceC10702.m27282((ServiceC10702) this.f55262);
                break;
            case 2:
                ((C8614) this.f55262).m23212();
                break;
            case 3:
                C20065.m46131((C20065) this.f55262);
                break;
            case 4:
                ((InterfaceC15610) this.f55262).mo1659(-1);
                break;
            case 5:
                ((MediaPlayer) this.f55262).release();
                break;
            default:
                ViewOnLayoutChangeListenerC6673.m18654((ViewOnLayoutChangeListenerC6673) this.f55262);
                break;
        }
    }
}
