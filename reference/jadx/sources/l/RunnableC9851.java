package l;

/* JADX INFO: renamed from: l.ۢ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N569 */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC9851 extends AbstractC10557 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f33638;

    public RunnableC9851(C0572 c0572, String str) {
        super(c0572, str);
        this.f33638 = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC20745 abstractC20745M38126;
        String strM26709;
        String strMo24955;
        String strM38120 = AbstractRunnableC16096.m38120(this.f33638);
        if (strM38120.startsWith("-")) {
            strM38120 = "";
        }
        boolean zEquals = strM38120.equals("");
        C0572 c0572 = this.f52046;
        if (zEquals) {
            abstractC20745M38126 = c0572.m2706();
        } else {
            if (strM38120.contains("*")) {
                strM26709 = "550 NLST does not support wildcards\r\n";
            } else {
                abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
                if (m38128(abstractC20745M38126)) {
                    strM26709 = "450 Listing target violates chroot\r\n";
                } else if (abstractC20745M38126.mo33971()) {
                    strM26709 = "550 NLST for regular files is unsupported\r\n";
                }
            }
            if (strM26709 != null) {
                c0572.m2708(strM26709);
            }
        }
        if (abstractC20745M38126.mo33974()) {
            StringBuilder sb = new StringBuilder();
            strM26709 = m26708(abstractC20745M38126, sb);
            if (strM26709 == null) {
                strMo24955 = sb.toString();
            }
        } else {
            strMo24955 = mo24955(abstractC20745M38126);
            strM26709 = strMo24955 == null ? "450 Couldn't list that file\r\n" : m26709(strMo24955);
        }
        if (strM26709 != null) {
            c0572.m2708(strM26709);
        }
    }

    @Override // l.AbstractC10557
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo24955(AbstractC20745 abstractC20745) {
        if (!abstractC20745.mo33975()) {
            return null;
        }
        String name = abstractC20745.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        return name.concat("\r\n");
    }
}
