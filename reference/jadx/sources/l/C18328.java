package l;

import com.alipay.sdk.m.y.q;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P5J2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18328 extends AbstractC11979 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f58465 = Pattern.compile("^total \\d+$");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f58466;

    public C18328(C12497 c12497, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        mo15525(c12497);
        this.f58466 = z;
    }

    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final C11086 mo4881(String str) {
        int i;
        boolean z;
        int iIndexOf;
        C11086 c11086 = new C11086();
        c11086.m27944(str);
        if (!m29790(str)) {
            return null;
        }
        String strM29788 = m29788(1);
        String strM29789 = m29788(15);
        String strM297810 = m29788(16);
        String strM297811 = m29788(17);
        String strM297812 = m29788(18);
        String str2 = m29788(19) + " " + m29788(20);
        String strM297813 = m29788(21);
        if (this.f58466) {
            strM297813 = strM297813.replaceFirst("^\\s+", "");
        }
        try {
            if (m29788(19).contains("月")) {
                C5628 c5628 = new C5628();
                c5628.mo15525(new C12497("UNIX", "M'月' d'日' yyyy'年'", "M'月' d'日' HH:mm"));
                c11086.m27951(c5628.m15524(str2));
            } else {
                c11086.m27951(m29789(str2));
            }
        } catch (ParseException unused) {
        }
        char cCharAt = strM29788.charAt(0);
        if (cCharAt == '-') {
            i = 0;
            z = false;
        } else if (cCharAt != 'l') {
            switch (cCharAt) {
                case 'b':
                case q.f /* 99 */:
                    i = 0;
                    z = true;
                    break;
                case 'd':
                    i = 1;
                    z = false;
                    break;
                case 'e':
                    i = 2;
                    z = false;
                    break;
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    i = 0;
                    z = false;
                    break;
                default:
                    i = 3;
                    z = false;
                    break;
            }
        } else {
            i = 2;
            z = false;
        }
        c11086.m27947(i);
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 3; i2 < i4; i4 = 3) {
            c11086.m27948(i2, 0, !m29788(i3).equals("-"));
            c11086.m27948(i2, 1, !m29788(i3 + 1).equals("-"));
            String strM297814 = m29788(i3 + 2);
            c11086.m27948(i2, 2, (strM297814.equals("-") || Character.isUpperCase(strM297814.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt(strM29789);
            } catch (NumberFormatException unused2) {
            }
        }
        c11086.m27954(strM297810);
        c11086.m27950(strM297811);
        try {
            c11086.m27949(Long.parseLong(strM297812));
        } catch (NumberFormatException unused3) {
        }
        if (i != 2 || (iIndexOf = strM297813.indexOf(" -> ")) == -1) {
            c11086.m27957(strM297813);
        } else {
            c11086.m27957(strM297813.substring(0, iIndexOf));
            c11086.m27960(strM297813.substring(iIndexOf + 4));
        }
        return c11086;
    }

    @Override // l.AbstractC14614, l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final List mo4880(LinkedList linkedList) {
        C9030.removeIf(linkedList, new C1534(1));
        return linkedList;
    }
}
