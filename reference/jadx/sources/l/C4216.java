package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ۘ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O546 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4216 extends AbstractC11979 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5628 f15298;

    public C4216(C12497 c12497) {
        mo15525(c12497);
        C12497 c12498 = new C12497("WINDOWS", "MM-dd-yy kk:mm", null);
        c12498.m31040("MM-dd-yy kk:mm");
        C5628 c5628 = new C5628();
        this.f15298 = c5628;
        c5628.mo15525(c12498);
    }

    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("WINDOWS", "MM-dd-yy hh:mma", null);
    }

    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final C11086 mo4881(String str) {
        if (!m29790(str)) {
            return null;
        }
        C11086 c11086 = new C11086();
        c11086.m27944(str);
        String str2 = m29788(1) + " " + m29788(2);
        String strM29788 = m29788(3);
        String strM29789 = m29788(4);
        String strM297810 = m29788(5);
        if (strM297810 == null || strM297810.equals(".") || strM297810.equals("..")) {
            return null;
        }
        try {
            try {
                c11086.m27951(m29789(str2));
            } catch (ParseException unused) {
            }
        } catch (ParseException unused2) {
            c11086.m27951(this.f15298.m15524(str2));
        }
        c11086.m27957(strM297810);
        if ("<DIR>".equals(strM29788)) {
            c11086.m27947(1);
            c11086.m27949(0L);
        } else {
            c11086.m27947(0);
            if (strM29789 != null) {
                c11086.m27949(Long.parseLong(strM29789));
            }
        }
        return c11086;
    }
}
