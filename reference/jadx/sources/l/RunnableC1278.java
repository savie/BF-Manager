package l;

/* JADX INFO: renamed from: l.֨ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: NALB */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC1278 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f5515;

    public RunnableC1278(C0572 c0572, String str) {
        super(c0572);
        this.f5515 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "500 Invalid start and end position\r\n";
        String[] strArrSplit = AbstractRunnableC16096.m38120(this.f5515).split(" ");
        int length = strArrSplit.length;
        C0572 c0572 = this.f52046;
        if (length != 2) {
            str = "500 Malformed RANG command\r\n";
        } else if (c0572.m2714()) {
            try {
                long j = Long.parseLong(strArrSplit[0]);
                long j2 = Long.parseLong(strArrSplit[1]);
                if (j == 1 && j2 == 0) {
                    c0572.m2708("350 Resetting start and end positions\r\n");
                    c0572.f2371 = -1L;
                    c0572.f2372 = -1L;
                } else if (j <= j2) {
                    c0572.f2371 = j;
                    c0572.f2372 = j2;
                    StringBuilder sbM39970 = C17114.m39970("350 Restarting at ", ". End Byte range at ", j);
                    sbM39970.append(j2);
                    sbM39970.append(".\r\n");
                    c0572.m2708(sbM39970.toString());
                }
                str = null;
            } catch (NumberFormatException unused) {
            }
        } else {
            str = "551 Server is not in binary mode\r\n";
        }
        if (str != null) {
            c0572.m2708(str);
        }
    }
}
