package l;

import android.widget.TextView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: l.ᩳۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17794 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56409;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56410;

    public /* synthetic */ RunnableC17794(int i, Object obj) {
        this.f56409 = i;
        this.f56410 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f56409;
        int i2 = 1;
        Object obj = this.f56410;
        switch (i) {
            case 0:
                ((ActivityC4471) obj).m12469();
                break;
            case 1:
                C2294 c2294 = (C2294) obj;
                int i3 = C2294.f8171;
                c2294.getClass();
                System.currentTimeMillis();
                c2294.setVisibility(0);
                break;
            case 2:
                int i4 = ActivityC19749.f63457;
                ((ActivityC19749) obj).m44944(true);
                break;
            case 3:
                ((TextView) obj).setVisibility(4);
                break;
            case 4:
                ((InterfaceC16966) obj).mo16474();
                break;
            case 5:
                int i5 = C23444.f75887;
                ((C23444) obj).m50125(new C5404(i2));
                break;
            case 6:
                C9886.m24984((C9886) obj);
                break;
            case 7:
                ((CarouselLayoutManager) obj).refreshKeylineState();
                break;
            default:
                int i6 = AbstractC16584.f53226;
                ((AbstractC16584) obj).m39014();
                break;
        }
    }
}
