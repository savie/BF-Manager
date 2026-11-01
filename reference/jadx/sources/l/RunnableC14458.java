package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14458 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparable f47421;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47423;

    public /* synthetic */ RunnableC14458(Object obj, Comparable comparable, int i) {
        this.f47422 = i;
        this.f47423 = obj;
        this.f47421 = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f47422;
        Comparable comparable = this.f47421;
        Object obj = this.f47423;
        switch (i) {
            case 0:
                C17901.m41539((C17901) obj, (C21696) comparable);
                break;
            case 1:
                C19682 c19682 = (C19682) obj;
                int i2 = C19682.f63190;
                c19682.m41591(R.string.MT_Protector);
                c19682.mo41554(((AbstractC20745) comparable).getName());
                break;
            default:
                ViewOnClickListenerC15847.m37730((ViewOnClickListenerC15847) obj, (String) comparable);
                break;
        }
    }
}
