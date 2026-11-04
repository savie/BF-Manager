package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֡֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46Z2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f1052;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f1053;

    public C0109(List list, List list2) {
        if (list.isEmpty() || list.size() != list2.size() || list.size() > 65535) {
            throw new IllegalArgumentException("Invalid childrenSyntax mapping");
        }
        int i = 0;
        this.f1052 = (String[]) list.toArray(new String[0]);
        this.f1053 = (String[]) list2.toArray(new String[0]);
        HashSet hashSet = new HashSet(list.size());
        while (true) {
            String[] strArr = this.f1052;
            if (i >= strArr.length) {
                return;
            }
            String str = strArr[i];
            C17359.requireNonNull(str);
            String str2 = this.f1053[i];
            C17359.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax mapping target is empty");
            }
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax mapping selector: ".concat(str));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0109 m1215(ArrayList arrayList, ArrayList arrayList2) {
        return new C0109(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0109 m1216(C20348 c20348) throws IOException {
        int iM46749 = c20348.m46749();
        String[] strArr = new String[iM46749];
        String[] strArr2 = new String[iM46749];
        for (int i = 0; i < iM46749; i++) {
            strArr[i] = c20348.m46756();
            strArr2[i] = c20348.m46756();
        }
        try {
            return new C0109(C10732.m27334((Object[]) strArr), C10732.m27334((Object[]) strArr2));
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1219(C6178 c6178) {
        String[] strArr = this.f1052;
        c6178.mo17812(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            c6178.m17786((CharSequence) strArr[i]);
            c6178.m17786((CharSequence) this.f1053[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1218(LinkedHashMap linkedHashMap, boolean z, String str) {
        String[] strArr = this.f1052;
        HashSet hashSet = new HashSet(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String strM20663 = C7567.m20663(strArr[i], z);
            if (!hashSet.add(strM20663)) {
                StringBuilder sbM51387 = C22783.m51387("Duplicate childrenSyntax selector in mapping \"", str, "\": ");
                sbM51387.append(strArr[i]);
                throw new IllegalArgumentException(sbM51387.toString());
            }
            linkedHashMap.put(strM20663, new C18008(strArr[i], this.f1053[i]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1217(StringBuilder sb) {
        sb.append("{\n");
        int i = 0;
        while (true) {
            String[] strArr = this.f1052;
            if (i >= strArr.length) {
                sb.append("");
                sb.append("}\n");
                return;
            }
            sb.append("\t");
            String str = strArr[i];
            sb.append('\"');
            C23290 c23290 = C15830.f51498;
            sb.append(c23290.m10291(str));
            sb.append('\"');
            sb.append(" => ");
            String str2 = this.f1053[i];
            sb.append('\"');
            sb.append(c23290.m10291(str2));
            sb.append('\"');
            sb.append('\n');
            i++;
        }
    }
}
