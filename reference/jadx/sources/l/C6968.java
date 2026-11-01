package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۜ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes2.dex */
public final class C6968 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f23441;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f23442;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15436 f23443;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f23439 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", AnnotationHandler.REQUIRED, "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f23437 = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f23436 = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f23440 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f23438 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    public C6968(String str, String str2, C15436 c15436) {
        C5557.m15341((Object) str);
        String strTrim = str.trim();
        C5557.m15342(strTrim);
        this.f23442 = strTrim;
        this.f23441 = str2;
        this.f23443 = c15436;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f23442;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f23442;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f23441;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String setValue(String str) {
        String str2;
        int iM36939;
        String str3 = this.f23441;
        C15436 c15436 = this.f23443;
        if (c15436 != null && (iM36939 = c15436.m36939((str2 = this.f23442))) != -1) {
            str3 = this.f23443.get(str2);
            this.f23443.f50304[iM36939] = str;
        }
        this.f23441 = str;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder sbM11782 = C4145.m11782();
        try {
            C19669 c19669M26641 = new C10497("").m26641();
            String str = this.f23442;
            String str2 = this.f23441;
            String strM18739 = m18739(str, c19669M26641.m44793());
            if (strM18739 != null) {
                m18740(strM18739, str2, sbM11782, c19669M26641);
            }
            return C4145.m11780(sbM11782);
        } catch (IOException e) {
            throw new C4851(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18740(String str, String str2, Appendable appendable, C19669 c19669) throws IOException {
        appendable.append(str);
        if (c19669.m44793() == EnumC8380.html) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f23439, C1323.m4722(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        C17551.m40822(appendable, str2, c19669, true, false, false, false);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18739(String str, EnumC8380 enumC8380) {
        if (enumC8380 == EnumC8380.xml) {
            Pattern pattern = f23437;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f23436.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (enumC8380 == EnumC8380.html) {
            Pattern pattern2 = f23440;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f23438.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6968.class == obj.getClass()) {
            C6968 c6968 = (C6968) obj;
            String str = c6968.f23442;
            String str2 = this.f23442;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f23441;
            String str4 = c6968.f23441;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f23442;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23441;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C6968) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
