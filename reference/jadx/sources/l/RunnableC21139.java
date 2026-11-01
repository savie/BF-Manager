package l;

/* JADX INFO: renamed from: l.᩷᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5RH */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC21139 extends AbstractRunnableC16096 implements Runnable {
    public RunnableC21139(C0572 c0572, String str) {
        super(c0572);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M46689 = c0572.m2706().m46689();
        if (abstractC20745M46689 == null) {
            str = "550 Current dir cannot find parent\r\n";
        } else if (m38128(abstractC20745M46689)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (!abstractC20745M46689.mo33974()) {
            str = "550 Can't CWD to invalid directory\r\n";
        } else if (abstractC20745M46689.mo8449()) {
            c0572.m2712(abstractC20745M46689);
            str = null;
        } else {
            str = "550 That path is inaccessible\r\n";
        }
        if (str != null) {
            c0572.m2708(str);
        } else {
            c0572.m2708("200 CDUP successful\r\n");
        }
    }
}
