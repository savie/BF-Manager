package l;

import android.media.metrics.PlaybackMetrics;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21795 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70584;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70586;

    public /* synthetic */ RunnableC21795(int i, Object obj, Object obj2) {
        this.f70585 = i;
        this.f70586 = obj;
        this.f70584 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f70585) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f70586;
                C21422 c21422 = (C21422) this.f70584;
                ((C10840) arrayList.get(0)).m27172();
                ((C10840) arrayList.get(1)).m27172();
                AbstractC20745 abstractC20745M27177 = ((C10840) arrayList.get(0)).m27177();
                AbstractC20745 abstractC20745M27178 = ((C10840) arrayList.get(1)).m27177();
                C3246 c3246 = new C3246(abstractC20745M27177, abstractC20745M27178, abstractC20745M27177.mo33986(), abstractC20745M27178.mo33986(), c21422.m47960(), c21422.m47960());
                C11545 c11545M47965 = c21422.m47965();
                c3246.m9719();
                C8278.m21696(c11545M47965, c3246);
                break;
            case 1:
                ((C14663) this.f70586).f47952.reportPlaybackMetrics((PlaybackMetrics) this.f70584);
                break;
            case 2:
                C13842.m33676((C13842) this.f70586, (C12629) this.f70584);
                break;
            default:
                InterfaceC16261 interfaceC16261 = (InterfaceC16261) this.f70586;
                C20494 c20494 = (C20494) this.f70584;
                interfaceC16261.mo15791(c20494.f66457, c20494.f66458);
                interfaceC16261.mo15794();
                break;
        }
    }
}
