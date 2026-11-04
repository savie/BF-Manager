package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۟֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24942;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f24943;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String[] f24944;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String[] f24945;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f24946;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f24947;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String[] f24948;

    public C7567(String str, int i, boolean z, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        this.f24943 = str;
        this.f24942 = i;
        this.f24946 = z;
        this.f24948 = strArr;
        this.f24945 = strArr2;
        this.f24944 = strArr3;
        this.f24947 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7567 m20665(String str) {
        C17359.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid fixed childrenSyntax target");
        }
        return new C7567(str, -1, false, new String[0], new String[0], new String[0], null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7567 m20664(int i, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        if (i < 0 || i > 65535 || arrayList2.size() != arrayList3.size() || ((arrayList.isEmpty() && arrayList2.isEmpty() && str == null) || arrayList.size() > 65535 || arrayList2.size() > 65535)) {
            throw new IllegalArgumentException("Invalid dynamic childrenSyntax");
        }
        if (str != null && str.isEmpty()) {
            throw new IllegalArgumentException("Invalid childrenSyntax default target");
        }
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C17359.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax include name is empty");
            }
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax include: ".concat(str2));
            }
        }
        return new C7567(null, i, z, (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), (String[]) arrayList3.toArray(new String[0]), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7567 m20666(C20348 c20348) throws IOException {
        String[] strArr;
        byte b = c20348.readByte();
        if (b == 0) {
            return null;
        }
        boolean z = true;
        if (b == 1) {
            return m20665(c20348.m46756());
        }
        if (b != 2 && b != 3 && b != 4 && b != 5) {
            throw new IOException(C13645.m33382(b, "Unknown childrenSyntax mode: "));
        }
        int iM46749 = c20348.m46749();
        boolean zM46753 = c20348.m46753();
        boolean z2 = b == 4 || b == 5;
        if (z2) {
            int iM467410 = c20348.m46749();
            if (iM467410 == 0) {
                throw new IOException("Dynamic childrenSyntax includes are empty");
            }
            String[] strArr2 = new String[iM467410];
            HashSet hashSet = new HashSet(iM467410);
            for (int i = 0; i < iM467410; i++) {
                String strM46756 = c20348.m46756();
                strArr2[i] = strM46756;
                if (strM46756.isEmpty()) {
                    throw new IOException("childrenSyntax include name is empty");
                }
                if (!hashSet.add(strArr2[i])) {
                    throw new IOException("Duplicate childrenSyntax include: " + strArr2[i]);
                }
            }
            strArr = strArr2;
        } else {
            strArr = new String[0];
        }
        int iM467411 = c20348.m46749();
        if (b != 3 && b != 5) {
            z = false;
        }
        if (iM467411 == 0 && !z2 && !z) {
            throw new IOException("Dynamic childrenSyntax cases are empty");
        }
        String[] strArr3 = new String[iM467411];
        String[] strArr4 = new String[iM467411];
        HashSet hashSet2 = new HashSet(iM467411);
        for (int i2 = 0; i2 < iM467411; i2++) {
            strArr3[i2] = c20348.m46756();
            String strM46757 = c20348.m46756();
            strArr4[i2] = strM46757;
            if (strM46757.isEmpty()) {
                throw new IOException("childrenSyntax target is empty");
            }
            if (!hashSet2.add(m20663(strArr3[i2], zM46753))) {
                throw new IOException("Duplicate childrenSyntax selector: " + strArr3[i2]);
            }
        }
        String strM46758 = z ? c20348.m46756() : null;
        if (strM46758 == null || !strM46758.isEmpty()) {
            return new C7567(null, iM46749, zM46753, strArr, strArr3, strArr4, strM46758);
        }
        throw new IOException("childrenSyntax default target is empty");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20667(C6178 c6178, C7567 c7567) {
        if (c7567 != null) {
            String[] strArr = c7567.f24945;
            String str = c7567.f24947;
            String[] strArr2 = c7567.f24948;
            if (!c7567.m20675()) {
                c6178.writeByte(1);
                String str2 = c7567.f24943;
                C17359.requireNonNull(str2);
                c6178.m17786((CharSequence) str2);
                return;
            }
            boolean z = strArr2.length != 0;
            c6178.writeByte(z ? str == null ? 4 : 5 : str == null ? 2 : 3);
            c6178.mo17812(c7567.f24942);
            c6178.m17789(c7567.f24946);
            if (z) {
                c6178.mo17812(strArr2.length);
                for (String str3 : strArr2) {
                    c6178.m17786((CharSequence) str3);
                }
            }
            c6178.mo17812(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                c6178.m17786((CharSequence) strArr[i]);
                c6178.m17786((CharSequence) c7567.f24944[i]);
            }
            if (str != null) {
                c6178.m17786((CharSequence) str);
                return;
            }
            return;
        }
        c6178.writeByte(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20672(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("childrenSyntax: ");
        if (!m20675()) {
            String str2 = this.f24943;
            C17359.requireNonNull(str2);
            m20668(sb, str2);
            sb.append('\n');
            return;
        }
        sb.append("{\n");
        String str3 = str + '\t';
        sb.append(str3);
        sb.append("capture: ");
        sb.append(this.f24942);
        sb.append('\n');
        sb.append(str3);
        sb.append("ignoreCase: ");
        sb.append(this.f24946);
        sb.append('\n');
        int i = 0;
        for (String str4 : this.f24948) {
            sb.append(str3);
            sb.append("include: ");
            m20668(sb, str4);
            sb.append('\n');
        }
        while (true) {
            String[] strArr = this.f24945;
            if (i >= strArr.length) {
                break;
            }
            sb.append(str3);
            m20668(sb, strArr[i]);
            sb.append(" => ");
            m20668(sb, this.f24944[i]);
            sb.append('\n');
            i++;
        }
        String str5 = this.f24947;
        if (str5 != null) {
            sb.append(str3);
            sb.append("default => ");
            m20668(sb, str5);
            sb.append('\n');
        }
        sb.append(str);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20668(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(C15830.f51498.m10291(str));
        sb.append('\"');
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m20675() {
        return this.f24943 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7567 m20671(C16800 c16800) {
        boolean z;
        if (m20675()) {
            String[] strArr = this.f24948;
            if (strArr.length != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = this.f24946;
                    if (i >= length) {
                        break;
                    }
                    String str = strArr[i];
                    c16800.m39678(str).m1218(linkedHashMap, z, str);
                    i++;
                }
                String[] strArr2 = this.f24945;
                HashSet hashSet = new HashSet(strArr2.length);
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    String strM20663 = m20663(strArr2[i2], z);
                    if (!hashSet.add(strM20663)) {
                        throw new IllegalArgumentException("Duplicate childrenSyntax selector: " + strArr2[i2]);
                    }
                    linkedHashMap.put(strM20663, new C18008(strArr2[i2], this.f24944[i2]));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (C18008 c18008 : linkedHashMap.values()) {
                    arrayList.add(c18008.f58959);
                    arrayList2.add(c18008.f58960);
                }
                return new C7567(null, this.f24942, this.f24946, new String[0], (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), this.f24947);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m20678() {
        return this.f24943;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20669() {
        return this.f24942;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m20674() {
        return this.f24946;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20676() {
        return this.f24945.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20670(int i) {
        return this.f24945[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m20677(int i) {
        return this.f24944[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m20673() {
        return this.f24947;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20663(String str, boolean z) {
        if (!z) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = Character.toLowerCase(Character.toUpperCase(charArray[i]));
        }
        return new String(charArray);
    }
}
