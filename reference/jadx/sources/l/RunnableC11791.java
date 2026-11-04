package l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N585 */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC11791 extends AbstractC11045 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f38093;

    public RunnableC11791(C5563 c5563, String str) {
        super(c5563, str);
        this.f38093 = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC22044 abstractC22044M36607;
        String strM27931;
        String strMo27932;
        String strM36601 = AbstractRunnableC15257.m36601(this.f38093);
        while (strM36601.startsWith("-")) {
            strM36601 = AbstractRunnableC15257.m36601(strM36601);
        }
        boolean zEquals = strM36601.equals("");
        C5563 c5563 = this.f49894;
        if (zEquals) {
            abstractC22044M36607 = c5563.m16487();
        } else {
            if (strM36601.contains("*")) {
                strM27931 = "550 LIST does not support wildcards\r\n";
            } else {
                abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
                if (m36609(abstractC22044M36607)) {
                    strM27931 = "450 Listing target violates chroot\r\n";
                }
            }
            if (strM27931 != null) {
                c5563.m16486(strM27931);
            }
        }
        if (abstractC22044M36607.mo4281()) {
            StringBuilder sb = new StringBuilder();
            strM27931 = m27930(abstractC22044M36607, sb);
            if (strM27931 == null) {
                strMo27932 = sb.toString();
            }
        } else {
            strMo27932 = mo27932(abstractC22044M36607);
            strM27931 = strMo27932 == null ? "450 Couldn't list that file\r\n" : m27931(strMo27932);
        }
        if (strM27931 != null) {
            c5563.m16486(strM27931);
        }
    }

    @Override // l.AbstractC11045
    /* JADX INFO: renamed from: ᩷ */
    public final String mo27932(AbstractC22044 abstractC22044) {
        SimpleDateFormat simpleDateFormat;
        StringBuilder sb = new StringBuilder();
        if (!abstractC22044.mo2934()) {
            return null;
        }
        String name = abstractC22044.getName();
        if (name.contains("*") || name.contains("/")) {
            return null;
        }
        if (abstractC22044.mo4281()) {
            sb.append("drwxr-xr-x 1 owner group");
        } else {
            sb.append("-rw-r--r-- 1 owner group");
        }
        String string = Long.toString(abstractC22044.mo4285());
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
        if (System.currentTimeMillis() - abstractC22044.mo4286() < 15552000000L) {
            simpleDateFormat = new SimpleDateFormat(" MMM dd HH:mm ", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat(" MMM dd  yyyy ", Locale.US);
        }
        sb.append(simpleDateFormat.format(new Date(abstractC22044.mo4286())));
        sb.append(name);
        sb.append("\r\n");
        return sb.toString();
    }
}
