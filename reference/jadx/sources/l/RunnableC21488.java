package l;

/* JADX INFO: renamed from: l.᩶ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I65P */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC21488 extends AbstractRunnableC15257 implements Runnable {
    public RunnableC21488(C5563 c5563, String str) {
        super(c5563);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5563 c5563 = this.f49894;
        try {
            String strMo4278 = c5563.m16487().mo4278();
            AbstractC22044 abstractC22044M16488 = c5563.m16488();
            if (abstractC22044M16488 != null) {
                strMo4278 = strMo4278.substring(abstractC22044M16488.mo4278().length());
            }
            if (strMo4278.length() == 0) {
                strMo4278 = "/";
            }
            c5563.m16486("257 \"" + strMo4278 + "\"\r\n");
        } catch (Exception unused) {
            c5563.m16494();
        }
    }
}
