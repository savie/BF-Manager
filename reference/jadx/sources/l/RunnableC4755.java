package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P98B */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4755 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16704;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16706;

    public /* synthetic */ RunnableC4755(int i, Object obj, Object obj2) {
        this.f16704 = i;
        this.f16706 = obj;
        this.f16705 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16704) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f16706;
                C12915 c12915 = (C12915) this.f16705;
                ((C14406) arrayList.get(0)).m34838();
                ((C14406) arrayList.get(1)).m34838();
                AbstractC22044 abstractC22044M34845 = ((C14406) arrayList.get(0)).m34845();
                AbstractC22044 abstractC22044M34846 = ((C14406) arrayList.get(1)).m34845();
                C9170 c9170 = new C9170(abstractC22044M34845, abstractC22044M34846, abstractC22044M34845.mo4294(), abstractC22044M34846.mo4294(), c12915.m31987(), c12915.m31987());
                C8614 c8614M31983 = c12915.m31983();
                c9170.m24305();
                C1504.m5358(c9170, c8614M31983);
                break;
            case 1:
                C13831.m33763((C13831) this.f16706, (ActivityC0848) this.f16705);
                break;
            default:
                C18372.m42854((C18372) this.f16706, (C8230) this.f16705);
                break;
        }
    }
}
