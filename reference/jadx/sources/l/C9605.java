package l;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A1V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9605 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f31071;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31073;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f31075;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f31076;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f31078 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f31072 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22045 f31074 = null;

    static {
        HashMap map = new HashMap();
        f31071 = map;
        map.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        map.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        map.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        map.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        map.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        map.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        map.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    public C9605(String str, String str2) {
        this.f31076 = str;
        this.f31075 = str2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m25085() {
        return this.f31075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25080() {
        return this.f31072;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22045 m25083() {
        return this.f31074;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25084() {
        return this.f31077;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25082() {
        return this.f31073;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25081(String str, String str2) throws C7369 {
        if (str.equals("endpoint")) {
            String string = str2.toString();
            this.f31072 = string;
            String lowerCase = string.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\")) {
                String str3 = (String) f31071.get(lowerCase.substring(6));
                if (str3 != null) {
                    int iIndexOf = str3.indexOf(58);
                    int i = iIndexOf + 1;
                    int iIndexOf2 = str3.indexOf(46, i);
                    this.f31074 = new C22045(str3.substring(0, iIndexOf));
                    this.f31077 = Integer.parseInt(str3.substring(i, iIndexOf2));
                    this.f31073 = Integer.parseInt(str3.substring(iIndexOf2 + 1));
                    return;
                }
            }
            throw new C7369("Bad endpoint: " + this.f31072);
        }
        if (this.f31078 == null) {
            this.f31078 = new HashMap();
        }
        this.f31078.put(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m25079(String str) {
        if (str.equals("endpoint")) {
            return this.f31072;
        }
        HashMap map = this.f31078;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final String toString() {
        String string = this.f31076 + ":" + this.f31075 + "[" + this.f31072;
        HashMap map = this.f31078;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbM10405 = C3188.m10405(string, ",");
                sbM10405.append((String) entry.getKey());
                sbM10405.append("=");
                sbM10405.append(entry.getValue());
                string = sbM10405.toString();
            }
        }
        return C14483.m34972(string, "]");
    }
}
