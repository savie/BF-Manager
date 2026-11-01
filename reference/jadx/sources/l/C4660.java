package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۙ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4660 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String[] f16458;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String[] f16459;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16460;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f16461;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16462;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16463;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String[] f16464;

    public C4660(String str, int i, boolean z, String[] strArr, String[] strArr2, String[] strArr3, String str2) {
        this.f16462 = str;
        this.f16460 = i;
        this.f16461 = z;
        this.f16459 = strArr;
        this.f16464 = strArr2;
        this.f16458 = strArr3;
        this.f16463 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4660 m12850(String str) {
        C13638.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid fixed childrenSyntax target");
        }
        return new C4660(str, -1, false, new String[0], new String[0], new String[0], null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4660 m12849(int i, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
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
            C13638.requireNonNull(str2);
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("childrenSyntax include name is empty");
            }
            if (!hashSet.add(str2)) {
                throw new IllegalArgumentException("Duplicate childrenSyntax include: ".concat(str2));
            }
        }
        return new C4660(null, i, z, (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), (String[]) arrayList3.toArray(new String[0]), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4660 m12851(C17367 c17367) throws IOException {
        String[] strArr;
        byte b = c17367.readByte();
        if (b == 0) {
            return null;
        }
        boolean z = true;
        if (b == 1) {
            return m12850(c17367.m40442());
        }
        if (b != 2 && b != 3 && b != 4 && b != 5) {
            throw new IOException(C8479.m22141(b, "Unknown childrenSyntax mode: "));
        }
        int iM40462 = c17367.m40462();
        boolean zM40461 = c17367.m40461();
        boolean z2 = b == 4 || b == 5;
        if (z2) {
            int iM40463 = c17367.m40462();
            if (iM40463 == 0) {
                throw new IOException("Dynamic childrenSyntax includes are empty");
            }
            String[] strArr2 = new String[iM40463];
            HashSet hashSet = new HashSet(iM40463);
            for (int i = 0; i < iM40463; i++) {
                String strM40442 = c17367.m40442();
                strArr2[i] = strM40442;
                if (strM40442.isEmpty()) {
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
        int iM40464 = c17367.m40462();
        if (b != 3 && b != 5) {
            z = false;
        }
        if (iM40464 == 0 && !z2 && !z) {
            throw new IOException("Dynamic childrenSyntax cases are empty");
        }
        String[] strArr3 = new String[iM40464];
        String[] strArr4 = new String[iM40464];
        HashSet hashSet2 = new HashSet(iM40464);
        for (int i2 = 0; i2 < iM40464; i2++) {
            strArr3[i2] = c17367.m40442();
            String strM40443 = c17367.m40442();
            strArr4[i2] = strM40443;
            if (strM40443.isEmpty()) {
                throw new IOException("childrenSyntax target is empty");
            }
            if (!hashSet2.add(m12848(strArr3[i2], zM40461))) {
                throw new IOException("Duplicate childrenSyntax selector: " + strArr3[i2]);
            }
        }
        String strM40444 = z ? c17367.m40442() : null;
        if (strM40444 == null || !strM40444.isEmpty()) {
            return new C4660(null, iM40462, zM40461, strArr, strArr3, strArr4, strM40444);
        }
        throw new IOException("childrenSyntax default target is empty");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12852(C11018 c11018, C4660 c4660) {
        if (c4660 != null) {
            String[] strArr = c4660.f16464;
            String str = c4660.f16463;
            String[] strArr2 = c4660.f16459;
            if (!c4660.m12859()) {
                c11018.writeByte(1);
                String str2 = c4660.f16462;
                C13638.requireNonNull(str2);
                c11018.m27782((CharSequence) str2);
                return;
            }
            boolean z = strArr2.length != 0;
            c11018.writeByte(z ? str == null ? 4 : 5 : str == null ? 2 : 3);
            c11018.mo24508(c4660.f16460);
            c11018.m27784(c4660.f16461);
            if (z) {
                c11018.mo24508(strArr2.length);
                for (String str3 : strArr2) {
                    c11018.m27782((CharSequence) str3);
                }
            }
            c11018.mo24508(strArr.length);
            for (int i = 0; i < strArr.length; i++) {
                c11018.m27782((CharSequence) strArr[i]);
                c11018.m27782((CharSequence) c4660.f16458[i]);
            }
            if (str != null) {
                c11018.m27782((CharSequence) str);
                return;
            }
            return;
        }
        c11018.writeByte(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12858(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("childrenSyntax: ");
        if (!m12859()) {
            String str2 = this.f16462;
            C13638.requireNonNull(str2);
            m12853(sb, str2);
            sb.append('\n');
            return;
        }
        sb.append("{\n");
        String str3 = str + '\t';
        sb.append(str3);
        sb.append("capture: ");
        sb.append(this.f16460);
        sb.append('\n');
        sb.append(str3);
        sb.append("ignoreCase: ");
        sb.append(this.f16461);
        sb.append('\n');
        int i = 0;
        for (String str4 : this.f16459) {
            sb.append(str3);
            sb.append("include: ");
            m12853(sb, str4);
            sb.append('\n');
        }
        while (true) {
            String[] strArr = this.f16464;
            if (i >= strArr.length) {
                break;
            }
            sb.append(str3);
            m12853(sb, strArr[i]);
            sb.append(" => ");
            m12853(sb, this.f16458[i]);
            sb.append('\n');
            i++;
        }
        String str5 = this.f16463;
        if (str5 != null) {
            sb.append(str3);
            sb.append("default => ");
            m12853(sb, str5);
            sb.append('\n');
        }
        sb.append(str);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m12853(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(C11168.f37849.m35229(str));
        sb.append('\"');
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m12859() {
        return this.f16462 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4660 m12857(C20889 c20889) {
        boolean z;
        if (m12859()) {
            String[] strArr = this.f16459;
            if (strArr.length != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    z = this.f16461;
                    if (i >= length) {
                        break;
                    }
                    String str = strArr[i];
                    c20889.m46954(str).m8707(linkedHashMap, z, str);
                    i++;
                }
                String[] strArr2 = this.f16464;
                HashSet hashSet = new HashSet(strArr2.length);
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    String strM12848 = m12848(strArr2[i2], z);
                    if (!hashSet.add(strM12848)) {
                        throw new IllegalArgumentException("Duplicate childrenSyntax selector: " + strArr2[i2]);
                    }
                    linkedHashMap.put(strM12848, new C9250(strArr2[i2], this.f16458[i2]));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (C9250 c9250 : linkedHashMap.values()) {
                    arrayList.add(c9250.f31462);
                    arrayList2.add(c9250.f31463);
                }
                return new C4660(null, this.f16460, this.f16461, new String[0], (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), this.f16463);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m12854() {
        return this.f16462;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12855() {
        return this.f16460;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m12863() {
        return this.f16461;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m12861() {
        return this.f16464.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12856(int i) {
        return this.f16464[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m12862(int i) {
        return this.f16458[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m12860() {
        return this.f16463;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12848(String str, boolean z) {
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
