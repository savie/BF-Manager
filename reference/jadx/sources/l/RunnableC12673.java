package l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N585 */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC12673 extends AbstractC10557 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f42320;

    public RunnableC12673(C0572 c0572, String str) {
        super(c0572, str);
        this.f42320 = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC20745 abstractC20745M38126;
        String strM26709;
        String strMo24955;
        String strM38120 = AbstractRunnableC16096.m38120(this.f42320);
        while (strM38120.startsWith("-")) {
            strM38120 = AbstractRunnableC16096.m38120(strM38120);
        }
        boolean zEquals = strM38120.equals("");
        C0572 c0572 = this.f52046;
        if (zEquals) {
            abstractC20745M38126 = c0572.m2706();
        } else {
            if (strM38120.contains("*")) {
                strM26709 = "550 LIST does not support wildcards\r\n";
            } else {
                abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
                if (m38128(abstractC20745M38126)) {
                    strM26709 = "450 Listing target violates chroot\r\n";
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
    /* JADX INFO: renamed from: ܰ */
    public final String mo24955(AbstractC20745 abstractC20745) {
        SimpleDateFormat simpleDateFormat;
        StringBuilder sb = new StringBuilder();
        if (!abstractC20745.mo33975()) {
            return null;
        }
        String name = abstractC20745.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        if (abstractC20745.mo33974()) {
            sb.append("drwxr-xr-x 1 owner group");
        } else {
            sb.append("-rw-r--r-- 1 owner group");
        }
        String string = Long.toString(abstractC20745.mo33964());
        int length = 13 - string.length();
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                break;
            }
            sb.append(' ');
            length = i;
        }
        sb.append(string);
        if (System.currentTimeMillis() - abstractC20745.mo33991() < 15552000000L) {
            simpleDateFormat = new SimpleDateFormat(" MMM dd HH:mm ", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat(" MMM dd  yyyy ", Locale.US);
        }
        sb.append(simpleDateFormat.format(new Date(abstractC20745.mo33991())));
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
