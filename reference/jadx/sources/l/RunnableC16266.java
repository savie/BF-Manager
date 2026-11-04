package l;

/* JADX INFO: renamed from: l.ܶᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: QALX */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC16266 extends AbstractC11045 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f52852;

    public RunnableC16266(C5563 c5563, String str) {
        super(c5563, str);
        this.f52852 = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC22044 abstractC22044M36607;
        String strM27930;
        String strM36601 = AbstractRunnableC15257.m36601(this.f52852);
        boolean zEquals = strM36601.equals("");
        C5563 c5563 = this.f49894;
        if (zEquals) {
            abstractC22044M36607 = c5563.m16487();
        } else {
            if (strM36601.contains("*")) {
                strM27930 = "550 MLSD does not support wildcards\r\n";
            } else {
                abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
                if (m36609(abstractC22044M36607)) {
                    strM27930 = "450 MLSD target violates chroot\r\n";
                }
            }
            if (strM27930 != null) {
                c5563.m16486(strM27930);
            }
        }
        if (abstractC22044M36607.mo4281()) {
            StringBuilder sb = new StringBuilder();
            strM27930 = m27930(abstractC22044M36607, sb);
            if (strM27930 == null) {
                strM27930 = m27931(sb.toString());
            }
        } else {
            strM27930 = "501 Not a directory\r\n";
        }
        if (strM27930 != null) {
            c5563.m16486(strM27930);
        }
    }

    @Override // l.AbstractC11045
    /* JADX INFO: renamed from: ᩷ */
    public final String mo27932(AbstractC22044 abstractC22044) {
        StringBuilder sb = new StringBuilder();
        if (!abstractC22044.mo2934()) {
            return null;
        }
        String name = abstractC22044.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        String[] strArrM16498 = this.f49894.m16498();
        if (strArrM16498 != null) {
            for (String str : strArrM16498) {
                if (str.equalsIgnoreCase("size")) {
                    sb.append("Size=");
                    sb.append(abstractC22044.mo4285());
                    sb.append(';');
                } else if (str.equalsIgnoreCase("modify")) {
                    String strM29027 = AbstractC11528.m29027(abstractC22044.mo4286());
                    sb.append("Modify=");
                    sb.append(strM29027);
                    sb.append(';');
                } else if (str.equalsIgnoreCase("type")) {
                    if (abstractC22044.mo4304()) {
                        sb.append("Type=file;");
                    } else if (abstractC22044.mo4281()) {
                        sb.append("Type=dir;");
                    }
                } else if (str.equalsIgnoreCase("perm")) {
                    sb.append("Perm=");
                    if (abstractC22044.mo4302()) {
                        if (abstractC22044.mo4304()) {
                            sb.append('r');
                        } else if (abstractC22044.mo4281()) {
                            sb.append("el");
                        }
                    }
                    if (abstractC22044.mo4303()) {
                        if (abstractC22044.mo4304()) {
                            sb.append("adfw");
                        } else if (abstractC22044.mo4281()) {
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
