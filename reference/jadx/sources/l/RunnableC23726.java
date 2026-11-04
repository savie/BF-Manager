package l;

/* JADX INFO: renamed from: l.᩹ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: VALF */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC23726 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f76920;

    public RunnableC23726(C5563 c5563, String str) {
        super(c5563);
        this.f76920 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC22044 abstractC22044M36607;
        String strM36601 = AbstractRunnableC15257.m36601(this.f76920);
        boolean zEquals = strM36601.equals("");
        C5563 c5563 = this.f49894;
        if (zEquals) {
            abstractC22044M36607 = c5563.m16487();
            str = "/";
        } else {
            str = strM36601;
            abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        }
        if (m36609(abstractC22044M36607)) {
            c5563.m16486("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC22044M36607.mo2934()) {
            c5563.m16486("250- Listing " + str + "\r\n");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String[] strArrM16498 = c5563.m16498();
            if (strArrM16498 != null) {
                for (String str2 : strArrM16498) {
                    if (str2.equalsIgnoreCase("size")) {
                        sb2.append("Size=");
                        sb2.append(abstractC22044M36607.mo4285());
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("modify")) {
                        String strM29027 = AbstractC11528.m29027(abstractC22044M36607.mo4286());
                        sb2.append("Modify=");
                        sb2.append(strM29027);
                        sb2.append(';');
                    } else if (str2.equalsIgnoreCase("type")) {
                        if (abstractC22044M36607.mo4304()) {
                            sb2.append("Type=file;");
                        } else if (abstractC22044M36607.mo4281()) {
                            sb2.append("Type=dir;");
                        }
                    } else if (str2.equalsIgnoreCase("perm")) {
                        sb2.append("Perm=");
                        if (abstractC22044M36607.mo4302()) {
                            if (abstractC22044M36607.mo4304()) {
                                sb2.append('r');
                            } else if (abstractC22044M36607.mo4281()) {
                                sb2.append("el");
                            }
                        }
                        if (abstractC22044M36607.mo4303()) {
                            if (abstractC22044M36607.mo4304()) {
                                sb2.append("adfw");
                            } else if (abstractC22044M36607.mo4281()) {
                                sb2.append("fpcm");
                            }
                        }
                        sb2.append(';');
                    }
                }
            }
            sb2.append(' ');
            sb2.append(abstractC22044M36607.getName());
            sb2.append("\r\n");
            sb.append(sb2.toString());
            sb.append("\r\n");
            c5563.m16486(sb.toString());
            c5563.m16486("250 End\r\n");
            return;
        }
        c5563.m16486("550 file does not exist\r\n");
    }
}
