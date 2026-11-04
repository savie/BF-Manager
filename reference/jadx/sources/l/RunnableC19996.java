package l;

/* JADX INFO: renamed from: l.ᩴᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5RH */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC19996 extends AbstractRunnableC15257 implements Runnable {
    public RunnableC19996(C5563 c5563, String str) {
        super(c5563);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M49858 = c5563.m16487().m49858();
        if (abstractC22044M49858 == null) {
            str = "550 Current dir cannot find parent\r\n";
        } else if (m36609(abstractC22044M49858)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (!abstractC22044M49858.mo4281()) {
            str = "550 Can't CWD to invalid directory\r\n";
        } else if (abstractC22044M49858.mo4302()) {
            c5563.m16496(abstractC22044M49858);
            str = null;
        } else {
            str = "550 That path is inaccessible\r\n";
        }
        if (str != null) {
            c5563.m16486(str);
        } else {
            c5563.m16486("200 CDUP successful\r\n");
        }
    }
}
