package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۢۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9929 extends AbstractC3964 {
    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }

    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        C17388 c17388 = new C17388();
        if (!m12703(str)) {
            return null;
        }
        String strM12701 = m12701(1);
        String strM12702 = m12701(2);
        String strM12703 = m12701(3);
        String strM12704 = m12701(4);
        String strM12705 = m12701(5);
        String strM12706 = m12701(9);
        try {
            c17388.m40831(m12702(strM12705));
        } catch (ParseException unused) {
        }
        if (strM12701.trim().equals("d")) {
            c17388.m40827(1);
        } else {
            c17388.m40827(0);
        }
        c17388.m40840(strM12703);
        c17388.m40835(strM12706.trim());
        c17388.m40829(Long.parseLong(strM12704.trim()));
        if (strM12702.indexOf(82) != -1) {
            c17388.m40828(0, 0, true);
        }
        if (strM12702.indexOf(87) != -1) {
            c17388.m40828(0, 1, true);
        }
        return c17388;
    }
}
