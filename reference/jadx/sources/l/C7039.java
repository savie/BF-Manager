package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۜ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7039 extends AbstractC11979 {
    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }

    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final C11086 mo4881(String str) {
        C11086 c11086 = new C11086();
        if (!m29790(str)) {
            return null;
        }
        String strM29788 = m29788(1);
        String strM29789 = m29788(2);
        String strM297810 = m29788(3);
        String strM297811 = m29788(4);
        String strM297812 = m29788(5);
        String strM297813 = m29788(9);
        try {
            c11086.m27951(m29789(strM297812));
        } catch (ParseException unused) {
        }
        if (strM29788.trim().equals("d")) {
            c11086.m27947(1);
        } else {
            c11086.m27947(0);
        }
        c11086.m27954(strM297810);
        c11086.m27957(strM297813.trim());
        c11086.m27949(Long.parseLong(strM297811.trim()));
        if (strM29789.indexOf(82) != -1) {
            c11086.m27948(0, 0, true);
        }
        if (strM29789.indexOf(87) != -1) {
            c11086.m27948(0, 1, true);
        }
        return c11086;
    }
}
