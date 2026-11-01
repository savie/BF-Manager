package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0176 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f1282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1283 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f1281 = new HashMap();

    public C0176(String str) {
        this.f1282 = str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m1373() {
        return this.f1282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1375() {
        this.f1281.clear();
        this.f1283.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m1380(String str) {
        return this.f1281.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12172 m1374(String str) {
        return (C12172) this.f1281.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1376(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        HashMap map = this.f1281;
        C12172 c12172 = (C12172) map.get(str);
        if (c12172 != null) {
            c12172.f40737 = str2;
            return;
        }
        C12172 c12173 = new C12172();
        c12173.f40738 = str;
        c12173.f40737 = str2;
        this.f1283.add(c12173);
        map.put(str, c12173);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m1378() {
        return C0561.unmodifiableList(this.f1283);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m1379() {
        return C4678.m12969(this.f1282);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m1381() throws IOException {
        AbstractC20745 abstractC20745M12969 = C4678.m12969(this.f1282);
        StringBuilder sb = new StringBuilder(1024);
        for (C12172 c12172 : this.f1283) {
            String str = c12172.f40738;
            String str2 = c12172.f40737;
            if (str != null && str2 != null && !str.equals(str2)) {
                sb.append("{\r\n  \"");
                sb.append(C23024.m50946(str));
                sb.append("\"\r\n  \"");
                sb.append(C23024.m50946(str2));
                sb.append("\"\r\n}\r\n");
            }
        }
        abstractC20745M12969.m46698(new C22862(sb.toString()));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m1377() throws Throwable {
        m1375();
        C23024 c23024 = null;
        try {
            C23024 c23025 = new C23024(C4678.m12969(this.f1282).m46730());
            while (true) {
                try {
                    String strM50951 = c23025.m50951();
                    if (strM50951.length() == 0) {
                        return;
                    }
                    C23024.m50947(strM50951);
                    c23025.m50949("\"");
                    String strM50950 = c23025.m50950();
                    c23025.m50949("\"");
                    String strM50952 = c23025.m50950();
                    c23025.m50949(l.d);
                    m1376(strM50950, strM50952);
                } catch (Throwable th) {
                    th = th;
                    c23024 = c23025;
                    if (c23024 != null) {
                        throw new C16405(th.getMessage(), c23024.m50948());
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1372(CharSequence charSequence) throws C16405 {
        if (charSequence instanceof InterfaceC0507) {
            C3329 c3329Mo2399 = ((InterfaceC0507) charSequence).mo2399();
            try {
                m1372(c3329Mo2399);
                c3329Mo2399.close();
                return;
            } catch (Throwable th) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C23024 c23024 = new C23024(charSequence);
        while (true) {
            try {
                String strM50951 = c23024.m50951();
                if (strM50951.length() == 0) {
                    return;
                }
                C23024.m50947(strM50951);
                c23024.m50949("\"");
                c23024.m50950();
                c23024.m50949("\"");
                c23024.m50950();
                c23024.m50949(l.d);
            } catch (Throwable th3) {
                throw new C16405(th3.getMessage(), c23024.m50948());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0176.class != obj.getClass()) {
            return false;
        }
        return this.f1282.equals(((C0176) obj).f1282);
    }

    public final int hashCode() {
        return C13638.hash(this.f1282);
    }
}
