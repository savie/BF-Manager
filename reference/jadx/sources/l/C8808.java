package l;

/* JADX INFO: renamed from: l.۠ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469D */
/* JADX INFO: loaded from: classes4.dex */
public class C8808 extends AbstractRunnableC15257 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f28765;

    public C8808(C5563 c5563, String str) {
        super(c5563);
        this.f28765 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f28765);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M16487 = c5563.m16487();
        long jMo4285 = 0;
        if (strM36601.contains(AbstractC22044.f71089)) {
            str = "550 No directory traversal allowed in SIZE param\r\n";
        } else {
            AbstractC22044 abstractC22044M49876 = abstractC22044M16487.m49876(strM36601);
            if (m36609(abstractC22044M49876)) {
                str = "550 SIZE target violates chroot\r\n";
            } else if (!abstractC22044M49876.mo2934()) {
                str = "550 Cannot get the SIZE of nonexistent object\r\n";
            } else if (abstractC22044M49876.mo4304()) {
                jMo4285 = abstractC22044M49876.mo4285();
                str = null;
            } else {
                str = "550 Cannot get the size of a non-file\r\n";
            }
        }
        if (str != null) {
            c5563.m16486(str);
            return;
        }
        c5563.m16486("213 " + jMo4285 + "\r\n");
    }
}
