package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۘۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3827 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14187;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14188;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14189;

    public /* synthetic */ RunnableC3827(int i, Object obj, Object obj2) {
        this.f14188 = i;
        this.f14189 = obj;
        this.f14187 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14188) {
            case 0:
                ServiceC6650.m18027((ServiceC6650) this.f14189, (Intent) this.f14187);
                break;
            default:
                C19271.m44217((C19271) this.f14189, (C10099) this.f14187);
                break;
        }
    }
}
