package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB7U */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22655 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73571;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73572;

    public /* synthetic */ RunnableC22655(int i, Object obj, Object obj2) {
        this.f73570 = i;
        this.f73572 = obj;
        this.f73571 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73570) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f73572;
                C12915 c12915 = (C12915) this.f73571;
                ((C14406) arrayList.get(0)).m34838();
                ((C14406) arrayList.get(1)).m34838();
                AbstractC22044 abstractC22044M34845 = ((C14406) arrayList.get(0)).m34845();
                AbstractC22044 abstractC22044M34846 = ((C14406) arrayList.get(1)).m34845();
                C9170 c9170 = new C9170(abstractC22044M34845, abstractC22044M34846, abstractC22044M34845.mo4294(), abstractC22044M34846.mo4294(), c12915.m31987(), c12915.m31987());
                C8614 c8614M31983 = c12915.m31983();
                c9170.m24305();
                C21050.m48108(c9170, c8614M31983);
                break;
            default:
                C21400.m48655((C21400) this.f73572, (C8230) this.f73571);
                break;
        }
    }
}
