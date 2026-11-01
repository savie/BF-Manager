package l;

/* JADX INFO: renamed from: l.ܳ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: VALF */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC14790 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f48349;

    public RunnableC14790(C0572 c0572, String str) {
        super(c0572);
        this.f48349 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC20745 abstractC20745M38126;
        String strM38120 = AbstractRunnableC16096.m38120(this.f48349);
        boolean zEquals = strM38120.equals("");
        C0572 c0572 = this.f52046;
        if (zEquals) {
            abstractC20745M38126 = c0572.m2706();
            str = "/";
        } else {
            str = strM38120;
            abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        }
        if (m38128(abstractC20745M38126)) {
            c0572.m2708("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC20745M38126.mo33975()) {
            c0572.m2708("250- Listing " + str + "\r\n");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String[] strArrM2695 = c0572.m2695();
            if (strArrM2695 != null) {
                for (String str2 : strArrM2695) {
                    if (str2.equalsIgnoreCase("size")) {
                        sb2.append("Size=");
                        sb2.append(abstractC20745M38126.mo33964());
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("modify")) {
                        String strM31287 = AbstractC12568.m31287(abstractC20745M38126.mo33991());
                        sb2.append("Modify=");
                        sb2.append(strM31287);
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("type")) {
                        if (abstractC20745M38126.mo33971()) {
                            sb2.append("Type=file;");
                        } else if (abstractC20745M38126.mo33974()) {
                            sb2.append("Type=dir;");
                        }
                    } else if (str2.equalsIgnoreCase("perm")) {
                        sb2.append("Perm=");
                        if (abstractC20745M38126.mo8449()) {
                            if (abstractC20745M38126.mo33971()) {
                                sb2.append('r');
                            } else if (abstractC20745M38126.mo33974()) {
                                sb2.append("el");
                            }
                        }
                        if (abstractC20745M38126.mo8447()) {
                            if (abstractC20745M38126.mo33971()) {
                                sb2.append("adfw");
                            } else if (abstractC20745M38126.mo33974()) {
                                sb2.append("fpcm");
                            }
                        }
                        sb2.append(';');
                    }
                }
            }
            sb2.append(' ');
            sb2.append(abstractC20745M38126.getName());
            sb2.append("\r\n");
            sb.append(sb2.toString());
            sb.append("\r\n");
            c0572.m2708(sb.toString());
            c0572.m2708("250 End\r\n");
            return;
        }
        c0572.m2708("550 file does not exist\r\n");
    }
}
