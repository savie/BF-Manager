package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܽۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17510 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C17510 f56924 = new C17510(Collections.EMPTY_MAP, false);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Set f56925;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f56926;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f56927;

    static {
        Object[] objArr = {"range", "accept-encoding", "content-length", "transfer-encoding", "if-none-match", "if-modified-since"};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f56925 = C4681.unmodifiableSet(hashSet);
    }

    public C17510(Map map, boolean z) {
        this.f56927 = C4681.unmodifiableMap(new LinkedHashMap(map));
        this.f56926 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17510 m41127(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 <= str.length()) {
            if (i2 >= str.length() || str.charAt(i2) == '\n') {
                String strM41126 = m41126(str.substring(i3, (i2 <= i3 || str.charAt(i2 + (-1)) != '\r') ? i2 : i2 - 1));
                if (!strM41126.isEmpty()) {
                    int iIndexOf = strM41126.indexOf(58);
                    if (iIndexOf < 0) {
                        throw new C24970(i, EnumC16764.INVALID_FORMAT);
                    }
                    String strM41127 = m41126(strM41126.substring(0, iIndexOf));
                    if (!strM41127.isEmpty()) {
                        for (int i4 = 0; i4 < strM41127.length(); i4++) {
                            char cCharAt = strM41127.charAt(i4);
                            if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || "!#$%&'*+-.^_`|~".indexOf(cCharAt) >= 0))) {
                            }
                        }
                        String strM41128 = m41126(strM41126.substring(iIndexOf + 1));
                        for (int i5 = 0; i5 < strM41128.length(); i5++) {
                            char cCharAt2 = strM41128.charAt(i5);
                            if ((cCharAt2 < ' ' && cCharAt2 != '\t') || cCharAt2 == 127) {
                                throw new C24970(i, EnumC16764.INVALID_VALUE);
                            }
                        }
                        if (f56925.contains(strM41127.toLowerCase(Locale.ROOT))) {
                            throw new C24970(i, EnumC16764.MANAGED_HEADER);
                        }
                        if (!treeSet.add(strM41127)) {
                            throw new C24970(i, EnumC16764.DUPLICATE_NAME);
                        }
                        linkedHashMap.put(strM41127, strM41128);
                    }
                    throw new C24970(i, EnumC16764.INVALID_NAME);
                }
                i3 = i2 + 1;
                i++;
            }
            i2++;
        }
        return (!linkedHashMap.isEmpty() || z) ? new C17510(linkedHashMap, z) : f56924;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41126(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && (str.charAt(i) == ' ' || str.charAt(i) == '\t')) {
            i++;
        }
        while (length > i) {
            int i2 = length - 1;
            if (str.charAt(i2) != ' ' && str.charAt(i2) != '\t') {
                break;
            }
            length--;
        }
        return str.substring(i, length);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Map m41129() {
        return this.f56927;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41128() {
        return this.f56926;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m41130() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f56927.entrySet()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}
