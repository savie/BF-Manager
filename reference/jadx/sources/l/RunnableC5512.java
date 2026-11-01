package l;

/* JADX INFO: renamed from: l.ۚᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I65P */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5512 extends AbstractRunnableC16096 implements Runnable {
    public RunnableC5512(C0572 c0572, String str) {
        super(c0572);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0572 c0572 = this.f52046;
        try {
            String strMo24643 = c0572.m2706().mo24643();
            AbstractC20745 abstractC20745M2694 = c0572.m2694();
            if (abstractC20745M2694 != null) {
                strMo24643 = strMo24643.substring(abstractC20745M2694.mo24643().length());
            }
            if (strMo24643.length() == 0) {
                strMo24643 = "/";
            }
            c0572.m2708("257 \"" + strMo24643 + "\"\r\n");
        } catch (Exception unused) {
            c0572.m2710();
        }
    }
}
