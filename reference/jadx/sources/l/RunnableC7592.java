package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7592 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25072;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25074;

    public /* synthetic */ RunnableC7592(int i, Object obj, Object obj2) {
        this.f25072 = i;
        this.f25074 = obj;
        this.f25073 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25072;
        Object obj = this.f25073;
        Object obj2 = this.f25074;
        switch (i) {
            case 0:
                ((C24132) obj2).m53774((AbstractC13753) obj);
                break;
            case 1:
                C4374.m13878((C4374) obj2, obj);
                break;
            default:
                C16664 c16664 = (C16664) obj2;
                int i2 = C16664.f53827;
                c16664.m43868(R.string.MT_Protector);
                c16664.mo29447(((AbstractC22044) obj).getName());
                break;
        }
    }
}
