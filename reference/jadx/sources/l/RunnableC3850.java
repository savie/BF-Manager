package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3850 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14382;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14383;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14384;

    public /* synthetic */ RunnableC3850(int i, Object obj, Object obj2) {
        this.f14383 = i;
        this.f14384 = obj;
        this.f14382 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14383;
        Object obj = this.f14382;
        Object obj2 = this.f14384;
        switch (i) {
            case 0:
                ViewOnClickListenerC15847.m37718((ViewOnClickListenerC15847) obj2, (Runnable) obj);
                break;
            case 1:
                C13710.m33417((C13710) obj2, (InterfaceC11955) obj);
                break;
            case 2:
                C13842.m33677((C13842) obj2, (C13314) obj);
                break;
            default:
                C20387 c20387 = (C20387) obj2;
                int i2 = C20387.f66063;
                c20387.m41591(R.string.MT_Protector);
                c20387.mo41554(((AbstractC20745) obj).getName());
                break;
        }
    }
}
