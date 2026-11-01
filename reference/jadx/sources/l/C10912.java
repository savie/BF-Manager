package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 44FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10912 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f37113;

    public C10912(C5972 c5972) {
        ArrayList arrayList = c5972.f20334;
        this.f37113 = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public C10912(String[] strArr) {
        this.f37113 = strArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m27347() {
        return this.f37113.length / 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27344(int i) {
        return this.f37113[i * 2];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m27348(int i) {
        return this.f37113[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m27349(String str) {
        int iM27347 = m27347();
        ArrayList arrayList = null;
        for (int i = 0; i < iM27347; i++) {
            if (str.equalsIgnoreCase(m27344(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m27348(i));
            }
        }
        if (arrayList != null) {
            return C0561.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5972 m27346() {
        C5972 c5972 = new C5972();
        Collections.addAll(c5972.f20334, this.f37113);
        return c5972;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10912) && Arrays.equals(((C10912) obj).f37113, this.f37113);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37113);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM27347 = m27347();
        for (int i = 0; i < iM27347; i++) {
            sb.append(m27344(i));
            sb.append(": ");
            sb.append(m27348(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m27345(String str) {
        String[] strArr = this.f37113;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10912 m27340(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            m27343(str2);
            m27341(str3, str2);
        }
        return new C10912(strArr2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C10912 m27342() {
        Map map = Collections.EMPTY_MAP;
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String strTrim = ((String) entry.getKey()).trim();
            String strTrim2 = ((String) entry.getValue()).trim();
            m27343(strTrim);
            m27341(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new C10912(strArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m27343(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = C0140.f1168;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27341(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(C16523.m38890("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str};
                byte[] bArr = C0140.f1168;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }
}
