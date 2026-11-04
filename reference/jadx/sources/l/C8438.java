package l;

import com.alipay.sdk.m.y.q;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5J2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8438 extends AbstractC3964 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f27605 = Pattern.compile("^total \\d+$");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f27606;

    public C8438(C11421 c11421, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日)|(?:\\d{1,2}月\\s+\\d{1,2}))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        mo6095(c11421);
        this.f27606 = z;
    }

    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        int i;
        boolean z;
        int iIndexOf;
        C17388 c17388 = new C17388();
        c17388.m40844(str);
        if (!m12703(str)) {
            return null;
        }
        String strM12701 = m12701(1);
        String strM12702 = m12701(15);
        String strM12703 = m12701(16);
        String strM12704 = m12701(17);
        String strM12705 = m12701(18);
        String str2 = m12701(19) + " " + m12701(20);
        String strM12706 = m12701(21);
        if (this.f27606) {
            strM12706 = strM12706.replaceFirst("^\\s+", "");
        }
        try {
            if (m12701(19).contains("月") && m12701(19).contains("日")) {
                C21118 c21118 = new C21118();
                c21118.mo6095(new C11421("UNIX", "M'月' d'日' yyyy'年'", "M'月' d'日' HH:mm"));
                c17388.m40831(c21118.m48214(str2));
            } else if (m12701(19).contains("月") && !m12701(19).contains("日")) {
                C21118 c21119 = new C21118();
                c21119.mo6095(new C11421("UNIX", "M'月' d yyyy", "M'月' d HH:mm"));
                c17388.m40831(c21119.m48214(str2));
            } else {
                c17388.m40831(m12702(str2));
            }
        } catch (ParseException unused) {
        }
        char cCharAt = strM12701.charAt(0);
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
        c17388.m40827(i);
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 3; i2 < i4; i4 = 3) {
            c17388.m40828(i2, 0, !m12701(i3).equals("-"));
            c17388.m40828(i2, 1, !m12701(i3 + 1).equals("-"));
            String strM12707 = m12701(i3 + 2);
            c17388.m40828(i2, 2, (strM12707.equals("-") || Character.isUpperCase(strM12707.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt(strM12702);
            } catch (NumberFormatException unused2) {
            }
        }
        c17388.m40840(strM12703);
        c17388.m40830(strM12704);
        try {
            c17388.m40829(Long.parseLong(strM12705));
        } catch (NumberFormatException unused3) {
        }
        if (i != 2 || (iIndexOf = strM12706.indexOf(" -> ")) == -1) {
            c17388.m40835(strM12706);
        } else {
            c17388.m40835(strM12706.substring(0, iIndexOf));
            c17388.m40842(strM12706.substring(iIndexOf + 4));
        }
        return c17388;
    }

    @Override // l.AbstractC23356, l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final List mo1713(LinkedList linkedList) {
        C1170.removeIf(linkedList, new C13848(2));
        return linkedList;
    }
}
