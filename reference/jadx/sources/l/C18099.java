package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C18099 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f59235;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f59236 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f59234 = new HashMap();

    public C18099(String str) {
        this.f59235 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m42221() {
        return this.f59235;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42214() {
        this.f59234.clear();
        this.f59236.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42220(String str) {
        return this.f59234.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7658 m42213(String str) {
        return (C7658) this.f59234.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42215(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        HashMap map = this.f59234;
        C7658 c7658 = (C7658) map.get(str);
        if (c7658 != null) {
            c7658.f25230 = str2;
            return;
        }
        C7658 c7659 = new C7658();
        c7659.f25231 = str;
        c7659.f25230 = str2;
        this.f59236.add(c7659);
        map.put(str, c7659);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m42216() {
        return C4681.unmodifiableList(this.f59236);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m42217() throws IOException {
        AbstractC22044 abstractC22044M19191 = C6912.m19191(this.f59235);
        StringBuilder sb = new StringBuilder(1024);
        for (C7658 c7658 : this.f59236) {
            String str = c7658.f25231;
            String str2 = c7658.f25230;
            if (str != null && str2 != null && !str.equals(str2)) {
                sb.append("{\r\n  \"");
                sb.append(C11889.m29762(str));
                sb.append("\"\r\n  \"");
                sb.append(C11889.m29762(str2));
                sb.append("\"\r\n}\r\n");
            }
        }
        abstractC22044M19191.m49843(new C8114(sb.toString()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m42219() {
        return C6912.m19191(this.f59235);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m42218() throws Throwable {
        m42214();
        C11889 c11889 = null;
        try {
            C11889 c118810 = new C11889(C6912.m19191(this.f59235).m49871());
            while (true) {
                try {
                    String strM29769 = c118810.m29769();
                    if (strM29769.length() == 0) {
                        return;
                    }
                    C11889.m29764(strM29769);
                    c118810.m29767("\"");
                    String strM29768 = c118810.m29768();
                    c118810.m29767("\"");
                    String strM297610 = c118810.m29768();
                    c118810.m29767(l.d);
                    m42215(strM29768, strM297610);
                } catch (Throwable th) {
                    th = th;
                    c11889 = c118810;
                    if (c11889 != null) {
                        throw new C0200(th.getMessage(), c11889.m29766());
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42212(CharSequence charSequence) throws C0200 {
        if (charSequence instanceof InterfaceC9629) {
            C15508 c15508Mo15350 = ((InterfaceC9629) charSequence).mo15350();
            try {
                m42212(c15508Mo15350);
                c15508Mo15350.close();
                return;
            } catch (Throwable th) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C11889 c11889 = new C11889(charSequence);
        while (true) {
            try {
                String strM29769 = c11889.m29769();
                if (strM29769.length() == 0) {
                    return;
                }
                C11889.m29764(strM29769);
                c11889.m29767("\"");
                c11889.m29768();
                c11889.m29767("\"");
                c11889.m29768();
                c11889.m29767(l.d);
            } catch (Throwable th3) {
                throw new C0200(th3.getMessage(), c11889.m29766());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18099.class != obj.getClass()) {
            return false;
        }
        return this.f59235.equals(((C18099) obj).f59235);
    }

    public final int hashCode() {
        return C17359.hash(this.f59235);
    }
}
