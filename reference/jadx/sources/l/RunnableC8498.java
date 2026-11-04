package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8498 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27795;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27797;

    public /* synthetic */ RunnableC8498(int i, Object obj, Object obj2) {
        this.f27795 = i;
        this.f27797 = obj;
        this.f27796 = obj2;
    }

    public /* synthetic */ RunnableC8498(ActivityC15913 activityC15913, AtomicBoolean atomicBoolean, Exception exc) {
        this.f27795 = 0;
        this.f27797 = activityC15913;
        this.f27796 = atomicBoolean;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.ۚۡۙ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27795) {
            case 0:
                ActivityC15913.m37891((ActivityC15913) this.f27797, (AtomicBoolean) this.f27796);
                break;
            case 1:
                C12994 c12994 = (C12994) this.f27797;
                this.f27796.mo7242(c12994.f41644, c12994.f41645);
                break;
            case 2:
                C24306.m54319((C24306) this.f27797, (String) this.f27796);
                break;
            default:
                SharedPreferencesOnSharedPreferenceChangeListenerC3444.m11214((SharedPreferencesOnSharedPreferenceChangeListenerC3444) this.f27797, (C13511) this.f27796);
                break;
        }
    }
}
