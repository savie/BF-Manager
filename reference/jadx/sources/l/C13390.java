package l;

import com.alipay.sdk.m.y.q;
import java.text.ParseException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I52W */
/* JADX INFO: loaded from: classes4.dex */
public final class C13390 extends AbstractC11979 {
    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
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
        String strM29789 = m29788(20);
        String str2 = m29788(21) + " " + m29788(22);
        String strM297810 = m29788(23);
        String strM297811 = m29788(24);
        try {
            c11086.m27951(m29789(str2));
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
            String strM297812 = m29788(i3 + 2);
            c11086.m27948(i2, 2, (strM297812.equals("-") || Character.isUpperCase(strM297812.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt("0");
            } catch (NumberFormatException unused2) {
            }
        }
        c11086.m27954(null);
        c11086.m27950((String) null);
        try {
            c11086.m27949(Long.parseLong(strM29789));
        } catch (NumberFormatException unused3) {
        }
        if (strM297811 == null) {
            c11086.m27957(strM297810);
        } else {
            String strM37076 = C15489.m37076(strM297810, strM297811);
            if (i != 2 || (iIndexOf = strM37076.indexOf(" -> ")) == -1) {
                c11086.m27957(strM37076);
            } else {
                c11086.m27957(strM37076.substring(0, iIndexOf));
                c11086.m27960(strM37076.substring(iIndexOf + 4));
            }
        }
        return c11086;
    }
}
