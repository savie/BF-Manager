package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46Z2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2898 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f10933;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f10934;

    public C2898(List list, List list2) {
        if (list.isEmpty() || list.size() != list2.size() || list.size() > 65535) {
            throw new IllegalArgumentException("Invalid childrenSyntax mapping");
        }
        int i = 0;
        this.f10933 = (String[]) list.toArray(new String[0]);
        this.f10934 = (String[]) list2.toArray(new String[0]);
        HashSet hashSet = new HashSet(list.size());
        while (true) {
            String[] strArr = this.f10933;
            if (i >= strArr.length) {
                return;
            }
            String str = strArr[i];
            C13638.requireNonNull(str);
            String str2 = this.f10934[i];
            C13638.requireNonNull(str2);
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
    public static C2898 m8704(ArrayList arrayList, ArrayList arrayList2) {
        return new C2898(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2898 m8705(C17367 c17367) throws IOException {
        int iM40462 = c17367.m40462();
        String[] strArr = new String[iM40462];
        String[] strArr2 = new String[iM40462];
        for (int i = 0; i < iM40462; i++) {
            strArr[i] = c17367.m40442();
            strArr2[i] = c17367.m40442();
        }
        try {
            return new C2898(C1679.m5595(strArr), C1679.m5595(strArr2));
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8708(C11018 c11018) {
        String[] strArr = this.f10933;
        c11018.mo24508(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            c11018.m27782((CharSequence) strArr[i]);
            c11018.m27782((CharSequence) this.f10934[i]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8707(LinkedHashMap linkedHashMap, boolean z, String str) {
        String[] strArr = this.f10933;
        HashSet hashSet = new HashSet(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String strM12848 = C4660.m12848(strArr[i], z);
            if (!hashSet.add(strM12848)) {
                StringBuilder sbM30914 = C12441.m30914("Duplicate childrenSyntax selector in mapping \"", str, "\": ");
                sbM30914.append(strArr[i]);
                throw new IllegalArgumentException(sbM30914.toString());
            }
            linkedHashMap.put(strM12848, new C9250(strArr[i], this.f10934[i]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8706(StringBuilder sb) {
        sb.append("{\n");
        int i = 0;
        while (true) {
            String[] strArr = this.f10933;
            if (i >= strArr.length) {
                sb.append("");
                sb.append("}\n");
                return;
            }
            sb.append("\t");
            String str = strArr[i];
            sb.append('\"');
            C23868 c23868 = C11168.f37849;
            sb.append(c23868.m35229(str));
            sb.append('\"');
            sb.append(" => ");
            String str2 = this.f10934[i];
            sb.append('\"');
            sb.append(c23868.m35229(str2));
            sb.append('\"');
            sb.append('\n');
            i++;
        }
    }
}
