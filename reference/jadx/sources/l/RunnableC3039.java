package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3039 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11353;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11354;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11355;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11356;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11357;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11358;

    public /* synthetic */ RunnableC3039(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f11355 = i;
        this.f11358 = obj;
        this.f11353 = obj2;
        this.f11356 = obj3;
        this.f11354 = obj4;
        this.f11357 = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11355) {
            case 0:
                boolean[] zArr = (boolean[]) this.f11358;
                ActivityC7109 activityC7109 = (ActivityC7109) this.f11353;
                DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f11356;
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f11354;
                C12562 c12562 = (C12562) this.f11357;
                zArr[0] = false;
                if (activityC7109 != null) {
                    activityC7109.m18999(false);
                }
                if (dialogInterfaceC19356.m44375() && C6696.m18094(abstractActivityC12483)) {
                    c12562.setChecked(true);
                    break;
                }
                break;
            default:
                C3645.m10748((C3645) this.f11358, (ArrayList) this.f11353, (ArrayList) this.f11356, (ArrayList) this.f11354, (ArrayList) this.f11357);
                break;
        }
    }
}
