package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.֨ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55OK */
/* JADX INFO: loaded from: classes3.dex */
public final class C0981 extends AbstractC3964 {
    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("OS/2", "MM-dd-yy HH:mm", null);
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
        String str2 = m12701(4) + " " + m12701(5);
        String strM12704 = m12701(6);
        try {
            c17388.m40831(m12702(str2));
        } catch (ParseException unused) {
        }
        if (strM12703.trim().equals("DIR") || strM12702.trim().equals("DIR")) {
            c17388.m40827(1);
        } else {
            c17388.m40827(0);
        }
        c17388.m40835(strM12704.trim());
        c17388.m40829(Long.parseLong(strM12701.trim()));
        return c17388;
    }
}
