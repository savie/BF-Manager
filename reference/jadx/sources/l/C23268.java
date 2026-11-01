package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.᩺᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 55OK */
/* JADX INFO: loaded from: classes2.dex */
public final class C23268 extends AbstractC11979 {
    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("OS/2", "MM-dd-yy HH:mm", null);
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
        String str2 = m29788(4) + " " + m29788(5);
        String strM297811 = m29788(6);
        try {
            c11086.m27951(m29789(str2));
        } catch (ParseException unused) {
        }
        if (strM297810.trim().equals("DIR") || strM29789.trim().equals("DIR")) {
            c11086.m27947(1);
        } else {
            c11086.m27947(0);
        }
        c11086.m27957(strM297811.trim());
        c11086.m27949(Long.parseLong(strM29788.trim()));
        return c11086;
    }
}
