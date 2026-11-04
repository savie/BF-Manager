package l;

/* JADX INFO: renamed from: l.֡ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: NALB */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC0605 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f2414;

    public RunnableC0605(C5563 c5563, String str) {
        super(c5563);
        this.f2414 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "500 Invalid start and end position\r\n";
        String[] strArrSplit = AbstractRunnableC15257.m36601(this.f2414).split(" ");
        int length = strArrSplit.length;
        C5563 c5563 = this.f49894;
        if (length != 2) {
            str = "500 Malformed RANG command\r\n";
        } else if (c5563.m16491()) {
            try {
                long j = Long.parseLong(strArrSplit[0]);
                long j2 = Long.parseLong(strArrSplit[1]);
                if (j == 1 && j2 == 0) {
                    c5563.m16486("350 Resetting start and end positions\r\n");
                    c5563.f19317 = -1L;
                    c5563.f19314 = -1L;
                } else if (j <= j2) {
                    c5563.f19317 = j;
                    c5563.f19314 = j2;
                    StringBuilder sbM8289 = C2458.m8289("350 Restarting at ", ". End Byte range at ", j);
                    sbM8289.append(j2);
                    sbM8289.append(".\r\n");
                    c5563.m16486(sbM8289.toString());
                }
                str = null;
            } catch (NumberFormatException unused) {
            }
        } else {
            str = "551 Server is not in binary mode\r\n";
        }
        if (str != null) {
            c5563.m16486(str);
        }
    }
}
