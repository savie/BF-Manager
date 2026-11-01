package l;

/* JADX INFO: renamed from: l.᩻᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: QALX */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC23962 extends AbstractC10557 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f77698;

    public RunnableC23962(C0572 c0572, String str) {
        super(c0572, str);
        this.f77698 = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC20745 abstractC20745M38126;
        String strM26708;
        String strM38120 = AbstractRunnableC16096.m38120(this.f77698);
        boolean zEquals = strM38120.equals("");
        C0572 c0572 = this.f52046;
        if (zEquals) {
            abstractC20745M38126 = c0572.m2706();
        } else {
            if (strM38120.contains("*")) {
                strM26708 = "550 MLSD does not support wildcards\r\n";
            } else {
                abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
                if (m38128(abstractC20745M38126)) {
                    strM26708 = "450 MLSD target violates chroot\r\n";
                }
            }
            if (strM26708 != null) {
                c0572.m2708(strM26708);
            }
        }
        if (abstractC20745M38126.mo33974()) {
            StringBuilder sb = new StringBuilder();
            strM26708 = m26708(abstractC20745M38126, sb);
            if (strM26708 == null) {
                strM26708 = m26709(sb.toString());
            }
        } else {
            strM26708 = "501 Not a directory\r\n";
        }
        if (strM26708 != null) {
            c0572.m2708(strM26708);
        }
    }

    @Override // l.AbstractC10557
    /* JADX INFO: renamed from: ܰ */
    public final String mo24955(AbstractC20745 abstractC20745) {
        StringBuilder sb = new StringBuilder();
        if (!abstractC20745.mo33975()) {
            return null;
        }
        String name = abstractC20745.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        String[] strArrM2695 = this.f52046.m2695();
        if (strArrM2695 != null) {
            for (String str : strArrM2695) {
                if (str.equalsIgnoreCase("size")) {
                    sb.append("Size=");
                    sb.append(abstractC20745.mo33964());
                    sb.append(';');
                } else if (str.equalsIgnoreCase("modify")) {
                    String strM31287 = AbstractC12568.m31287(abstractC20745.mo33991());
                    sb.append("Modify=");
                    sb.append(strM31287);
                    sb.append(';');
                } else if (str.equalsIgnoreCase("type")) {
                    if (abstractC20745.mo33971()) {
                        sb.append("Type=file;");
                    } else if (abstractC20745.mo33974()) {
                        sb.append("Type=dir;");
                    }
                } else if (str.equalsIgnoreCase("perm")) {
                    sb.append("Perm=");
                    if (abstractC20745.mo8449()) {
                        if (abstractC20745.mo33971()) {
                            sb.append('r');
                        } else if (abstractC20745.mo33974()) {
                            sb.append("el");
                        }
                    }
                    if (abstractC20745.mo8447()) {
                        if (abstractC20745.mo33971()) {
                            sb.append("adfw");
                        } else if (abstractC20745.mo33974()) {
                            sb.append("fpcm");
                        }
                    }
                    sb.append(';');
                }
            }
        }
        sb.append(' ');
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
