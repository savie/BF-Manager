package l;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4LG */
/* JADX INFO: loaded from: classes3.dex */
public final class C1394 extends AbstractC11979 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f5794;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18328 f5795;

    public C1394() {
        super("");
        this.f5794 = -1;
        mo15525((C12497) null);
    }

    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12497 mo4882() {
        return new C12497("MVS", "yyyy/MM/dd HH:mm", null);
    }

    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11086 mo4881(String str) {
        int i = this.f5794;
        if (i == 0) {
            if (m29790(str)) {
                C11086 c11086 = new C11086();
                c11086.m27944(str);
                String strM29788 = m29788(2);
                String strM29789 = m29788(1);
                c11086.m27957(strM29788);
                if ("PS".equals(strM29789)) {
                    c11086.m27947(0);
                    return c11086;
                }
                if (!"PO".equals(strM29789) && !"PO-E".equals(strM29789)) {
                    return null;
                }
                c11086.m27947(1);
                return c11086;
            }
            boolean zStartsWith = str.startsWith("Migrated");
            if (!zStartsWith && !str.startsWith("ARCIVE")) {
                return null;
            }
            C11086 c11087 = new C11086();
            c11087.m27944(str);
            c11087.m27947(3);
            c11087.m27957(str.split("\\s+")[zStartsWith ? (char) 1 : (char) 5]);
            return c11087;
        }
        if (i != 1) {
            if (i == 2) {
                return this.f5795.mo4881(str);
            }
            if (i == 3) {
                return m4879(3, str);
            }
            if (i != 4) {
                return null;
            }
            return m4879(4, str);
        }
        C11086 c11088 = new C11086();
        if (m29790(str)) {
            c11088.m27944(str);
            String strM297810 = m29788(1);
            String str2 = m29788(2) + " " + m29788(3);
            c11088.m27957(strM297810);
            c11088.m27947(0);
            try {
                c11088.m27951(m29789(str2));
            } catch (ParseException unused) {
            }
            return c11088;
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        c11088.m27944(str);
        c11088.m27957(str.split(" ")[0]);
        c11088.m27947(0);
        return c11088;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11086 m4879(int i, String str) {
        if (!m29790(str)) {
            return null;
        }
        C11086 c11086 = new C11086();
        if (!m29788(i).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        c11086.m27944(str);
        c11086.m27957(m29788(2));
        c11086.m27947(0);
        return c11086;
    }

    @Override // l.AbstractC14614, l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo4880(LinkedList linkedList) {
        if (linkedList != null && !linkedList.isEmpty()) {
            String str = (String) linkedList.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                this.f5794 = 0;
                m29787("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?\\S+\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (str.contains("Name") && str.contains("Id")) {
                this.f5794 = 1;
                m29787("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (str.startsWith("total")) {
                this.f5794 = 2;
                this.f5795 = new C18328(null, false);
            } else if (str.indexOf("Spool Files") >= 30) {
                this.f5794 = 3;
                m29787("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (!str.startsWith("JOBNAME") || str.indexOf("JOBID") <= 8) {
                this.f5794 = -1;
            } else {
                this.f5794 = 4;
                m29787("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            }
            if (this.f5794 != 3) {
                linkedList.remove(0);
            }
        }
        return linkedList;
    }
}
