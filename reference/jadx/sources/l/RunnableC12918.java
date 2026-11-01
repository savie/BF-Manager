package l;

import android.content.Context;

/* JADX INFO: renamed from: l.۬ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12918 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42931;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42932;

    public /* synthetic */ RunnableC12918(int i, Object obj) {
        this.f42931 = i;
        this.f42932 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42931) {
            case 0:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f42932;
                if (abstractActivityC12483 instanceof ActivityC7109) {
                    ((ActivityC7109) abstractActivityC12483).m18998(false);
                }
                break;
            case 1:
                AbstractC12359.m30719((AbstractC12359) this.f42932);
                break;
            case 2:
                ((ActivityC15481) this.f42932).m37026();
                break;
            case 3:
                C3535.m10422(((ActivityC11736) this.f42932).f39456);
                break;
            default:
                C16125.m38166((Context) this.f42932);
                break;
        }
    }
}
