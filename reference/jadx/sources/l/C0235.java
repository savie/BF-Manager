package l;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4LG */
/* JADX INFO: loaded from: classes3.dex */
public final class C0235 extends AbstractC3964 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8438 f1496;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1497;

    public C0235() {
        super("");
        this.f1497 = -1;
        mo6095((C11421) null);
    }

    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11421 mo1714() {
        return new C11421("MVS", "yyyy/MM/dd HH:mm", null);
    }

    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17388 mo1715(String str) {
        int i = this.f1497;
        if (i == 0) {
            if (m12703(str)) {
                C17388 c17388 = new C17388();
                c17388.m40844(str);
                String strM12701 = m12701(2);
                String strM12702 = m12701(1);
                c17388.m40835(strM12701);
                if ("PS".equals(strM12702)) {
                    c17388.m40827(0);
                    return c17388;
                }
                if (!"PO".equals(strM12702) && !"PO-E".equals(strM12702)) {
                    return null;
                }
                c17388.m40827(1);
                return c17388;
            }
            boolean zStartsWith = str.startsWith("Migrated");
            if (!zStartsWith && !str.startsWith("ARCIVE")) {
                return null;
            }
            C17388 c17389 = new C17388();
            c17389.m40844(str);
            c17389.m40827(3);
            c17389.m40835(str.split("\\s+")[zStartsWith ? (char) 1 : (char) 5]);
            return c17389;
        }
        if (i != 1) {
            if (i == 2) {
                return this.f1496.mo1715(str);
            }
            if (i == 3) {
                return m1712(3, str);
            }
            if (i != 4) {
                return null;
            }
            return m1712(4, str);
        }
        C17388 c173810 = new C17388();
        if (m12703(str)) {
            c173810.m40844(str);
            String strM12703 = m12701(1);
            String str2 = m12701(2) + " " + m12701(3);
            c173810.m40835(strM12703);
            c173810.m40827(0);
            try {
                c173810.m40831(m12702(str2));
            } catch (ParseException unused) {
            }
            return c173810;
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        c173810.m40844(str);
        c173810.m40835(str.split(" ")[0]);
        c173810.m40827(0);
        return c173810;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17388 m1712(int i, String str) {
        if (!m12703(str)) {
            return null;
        }
        C17388 c17388 = new C17388();
        if (!m12701(i).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        c17388.m40844(str);
        c17388.m40835(m12701(2));
        c17388.m40827(0);
        return c17388;
    }

    @Override // l.AbstractC23356, l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo1713(LinkedList linkedList) {
        if (linkedList != null && !linkedList.isEmpty()) {
            String str = (String) linkedList.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                this.f1497 = 0;
                m12704("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?\\S+\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (str.contains("Name") && str.contains("Id")) {
                this.f1497 = 1;
                m12704("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (str.startsWith("total")) {
                this.f1497 = 2;
                this.f1496 = new C8438(null, false);
            } else if (str.indexOf("Spool Files") >= 30) {
                this.f1497 = 3;
                m12704("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (!str.startsWith("JOBNAME") || str.indexOf("JOBID") <= 8) {
                this.f1497 = -1;
            } else {
                this.f1497 = 4;
                m12704("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            }
            if (this.f1497 != 3) {
                linkedList.remove(0);
            }
        }
        return linkedList;
    }
}
