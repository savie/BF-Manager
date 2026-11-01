package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩹ܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes.dex */
public final class C22411 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Set f73136;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C22411 f73137 = new C22411(Collections.EMPTY_MAP, false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f73138;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f73139;

    static {
        Object[] objArr = {"range", "accept-encoding", "content-length", "transfer-encoding", "if-none-match", "if-modified-since"};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f73136 = C0561.unmodifiableSet(hashSet);
    }

    public C22411(Map map, boolean z) {
        this.f73139 = C0561.unmodifiableMap(new LinkedHashMap(map));
        this.f73138 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22411 m49694(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 <= str.length()) {
            if (i2 >= str.length() || str.charAt(i2) == '\n') {
                String strM49693 = m49693(str.substring(i3, (i2 <= i3 || str.charAt(i2 + (-1)) != '\r') ? i2 : i2 - 1));
                if (!strM49693.isEmpty()) {
                    int iIndexOf = strM49693.indexOf(58);
                    if (iIndexOf < 0) {
                        throw new C2654(i, EnumC5477.INVALID_FORMAT);
                    }
                    String strM49694 = m49693(strM49693.substring(0, iIndexOf));
                    if (!strM49694.isEmpty()) {
                        for (int i4 = 0; i4 < strM49694.length(); i4++) {
                            char cCharAt = strM49694.charAt(i4);
                            if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || "!#$%&'*+-.^_`|~".indexOf(cCharAt) >= 0))) {
                            }
                        }
                        String strM49695 = m49693(strM49693.substring(iIndexOf + 1));
                        for (int i5 = 0; i5 < strM49695.length(); i5++) {
                            char cCharAt2 = strM49695.charAt(i5);
                            if ((cCharAt2 < ' ' && cCharAt2 != '\t') || cCharAt2 == 127) {
                                throw new C2654(i, EnumC5477.INVALID_VALUE);
                            }
                        }
                        if (f73136.contains(strM49694.toLowerCase(Locale.ROOT))) {
                            throw new C2654(i, EnumC5477.MANAGED_HEADER);
                        }
                        if (!treeSet.add(strM49694)) {
                            throw new C2654(i, EnumC5477.DUPLICATE_NAME);
                        }
                        linkedHashMap.put(strM49694, strM49695);
                    }
                    throw new C2654(i, EnumC5477.INVALID_NAME);
                }
                i3 = i2 + 1;
                i++;
            }
            i2++;
        }
        return (!linkedHashMap.isEmpty() || z) ? new C22411(linkedHashMap, z) : f73137;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49693(String str) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Map m49696() {
        return this.f73139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49695() {
        return this.f73138;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m49697() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f73139.entrySet()) {
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
