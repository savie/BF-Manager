package l;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31TZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f55290;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f55291;

    public C16907() {
        this.f55291 = new HashMap();
        this.f55290 = new HashMap();
    }

    public C16907(C2551 c2551) {
        this.f55290 = c2551;
        this.f55291 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39890(C21943 c21943, C21943 c21944, List list) {
        this.f55291.put(new C4869(c21943, c21944), list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39891(C25113 c25113) {
        C25113 c25114 = (C25113) this.f55291.put(c25113.m55990(), c25113);
        C25113 c25115 = (C25113) ((HashMap) this.f55290).put(c25113.m55984(), c25113);
        if (c25114 != null) {
            throw new RuntimeException("Old Name conflict: " + c25113.m55990() + ", [" + c25113.m55990() + ", " + c25113.m55984() + "], [" + c25114.m55990() + ", " + c25114.m55984() + "]");
        }
        if (c25115 == null) {
            return;
        }
        throw new RuntimeException("New Name conflict: " + c25113.m55984() + ", [" + c25113.m55990() + ", " + c25113.m55984() + "], [" + c25115.m55990() + ", " + c25115.m55984() + "]");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List m39888(C21943 c21943, C21943 c21944) {
        return (List) this.f55291.get(new C4869(c21943, c21944));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m39894(C21943 c21943, C21943 c21944) {
        return this.f55291.containsKey(new C4869(c21943, c21944));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2551 m39889() {
        return (C2551) this.f55290;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C25113 m39893(String str) {
        if (str.length() == 1) {
            return null;
        }
        return (C25113) this.f55291.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m39892(String str) {
        return this.f55291.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m39887(String str, String str2) {
        String strSubstring;
        if (str.charAt(0) == '[') {
            int iIndexOf = str.indexOf(76);
            if (iIndexOf != -1) {
                strSubstring = str.substring(0, iIndexOf);
                str = str.substring(iIndexOf);
            }
            return str2;
        }
        strSubstring = null;
        C25113 c25113M39893 = m39893(str);
        if (c25113M39893 != null) {
            if (strSubstring == null) {
                return c25113M39893.m55984();
            }
            StringBuilder sbM27333 = C10732.m27333(strSubstring);
            sbM27333.append(c25113M39893.m55984());
            return sbM27333.toString();
        }
        return str2;
    }
}
