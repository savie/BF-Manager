package l;

import com.alipay.sdk.m.y.q;
import java.text.ParseException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I52W */
/* JADX INFO: loaded from: classes4.dex */
public final class C7693 extends AbstractC3964 {
    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
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
        String strM12702 = m12701(20);
        String str2 = m12701(21) + " " + m12701(22);
        String strM12703 = m12701(23);
        String strM12704 = m12701(24);
        try {
            c17388.m40831(m12702(str2));
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
            String strM12705 = m12701(i3 + 2);
            c17388.m40828(i2, 2, (strM12705.equals("-") || Character.isUpperCase(strM12705.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt("0");
            } catch (NumberFormatException unused2) {
            }
        }
        c17388.m40840(null);
        c17388.m40830((String) null);
        try {
            c17388.m40829(Long.parseLong(strM12702));
        } catch (NumberFormatException unused3) {
        }
        if (strM12704 == null) {
            c17388.m40835(strM12703);
        } else {
            String strM34972 = C14483.m34972(strM12703, strM12704);
            if (i != 2 || (iIndexOf = strM34972.indexOf(" -> ")) == -1) {
                c17388.m40835(strM34972);
            } else {
                c17388.m40835(strM34972.substring(0, iIndexOf));
                c17388.m40842(strM34972.substring(iIndexOf + 4));
            }
        }
        return c17388;
    }
}
