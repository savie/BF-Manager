package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12027 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40276;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40278;

    public /* synthetic */ RunnableC12027(int i, Object obj, Object obj2) {
        this.f40277 = i;
        this.f40278 = obj;
        this.f40276 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f40277;
        Object obj = this.f40276;
        Object obj2 = this.f40278;
        switch (i) {
            case 0:
                ((C6111) obj2).m16797((AbstractC12359) obj);
                break;
            case 1:
                C21924 c21924 = (C21924) obj2;
                int i2 = C21924.f71125;
                c21924.m41591(R.string.MT_Protector);
                c21924.mo41554(((AbstractC20745) obj).getName());
                break;
            case 2:
                ViewOnClickListenerC18081.m42075((ViewOnClickListenerC18081) obj2, (C21609) obj);
                break;
            default:
                ((C15434) obj2).f50298 = (C21825) obj;
                break;
        }
    }
}
