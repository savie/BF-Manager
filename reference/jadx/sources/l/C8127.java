package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.۟᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8127 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f26818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f26819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10363 f26820;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String[] f26813 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", AnnotationHandler.REQUIRED, "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f26814 = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f26816 = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f26817 = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f26815 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    public C8127(String str, String str2, C10363 c10363) {
        C14838.m35754((Object) str);
        String strTrim = str.trim();
        C14838.m35755(strTrim);
        this.f26818 = strTrim;
        this.f26819 = str2;
        this.f26820 = c10363;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26818;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f26818;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.f26819;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String setValue(String str) {
        String str2;
        int iM26658;
        String str3 = this.f26819;
        C10363 c10363 = this.f26820;
        if (c10363 != null && (iM26658 = c10363.m26658((str2 = this.f26818))) != -1) {
            str3 = this.f26820.get(str2);
            this.f26820.f32984[iM26658] = str;
        }
        this.f26819 = str;
        return str3 == null ? "" : str3;
    }

    public final String toString() {
        StringBuilder sbM2898 = C0669.m2898();
        try {
            C7381 c7381M15300 = new C5056("").m15300();
            String str = this.f26818;
            String str2 = this.f26819;
            String strM22010 = m22010(str, c7381M15300.m20275());
            if (strM22010 != null) {
                m22011(strM22010, str2, sbM2898, c7381M15300);
            }
            return C0669.m2896(sbM2898);
        } catch (IOException e) {
            throw new C12601(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22011(String str, String str2, Appendable appendable, C7381 c7381) throws IOException {
        appendable.append(str);
        if (c7381.m20275() == EnumC8872.html) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f26813, C15300.m36731(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        C2073.m7147(appendable, str2, c7381, true, false, false, false);
        appendable.append('\"');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22010(String str, EnumC8872 enumC8872) {
        if (enumC8872 == EnumC8872.xml) {
            Pattern pattern = f26814;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = f26816.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (enumC8872 == EnumC8872.html) {
            Pattern pattern2 = f26817;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = f26815.matcher(str).replaceAll("");
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
        if (obj != null && C8127.class == obj.getClass()) {
            C8127 c8127 = (C8127) obj;
            String str = c8127.f26818;
            String str2 = this.f26818;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f26819;
            String str4 = c8127.f26819;
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
        String str = this.f26818;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26819;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C8127) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
