package l;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A1V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1197 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final HashMap f5302;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f5306;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f5307;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5308;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f5309;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f5304 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f5305 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21659 f5303 = null;

    static {
        HashMap map = new HashMap();
        f5302 = map;
        map.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        map.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        map.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        map.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        map.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        map.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        map.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    public C1197(String str, String str2) {
        this.f5306 = str;
        this.f5309 = str2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m4378() {
        return this.f5309;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m4380() {
        return this.f5305;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21659 m4382() {
        return this.f5303;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m4384() {
        return this.f5308;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m4383() {
        return this.f5307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4381(String str, String str2) throws C6842 {
        if (str.equals("endpoint")) {
            String string = str2.toString();
            this.f5305 = string;
            String lowerCase = string.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\")) {
                String str3 = (String) f5302.get(lowerCase.substring(6));
                if (str3 != null) {
                    int iIndexOf = str3.indexOf(58);
                    int i = iIndexOf + 1;
                    int iIndexOf2 = str3.indexOf(46, i);
                    this.f5303 = new C21659(str3.substring(0, iIndexOf));
                    this.f5308 = Integer.parseInt(str3.substring(i, iIndexOf2));
                    this.f5307 = Integer.parseInt(str3.substring(iIndexOf2 + 1));
                    return;
                }
            }
            throw new C6842("Bad endpoint: " + this.f5305);
        }
        if (this.f5304 == null) {
            this.f5304 = new HashMap();
        }
        this.f5304.put(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m4379(String str) {
        if (str.equals("endpoint")) {
            return this.f5305;
        }
        HashMap map = this.f5304;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final String toString() {
        String string = this.f5306 + ":" + this.f5309 + "[" + this.f5305;
        HashMap map = this.f5304;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbM8976 = C3012.m8976(string, ",");
                sbM8976.append((String) entry.getKey());
                sbM8976.append("=");
                sbM8976.append(entry.getValue());
                string = sbM8976.toString();
            }
        }
        return C15489.m37076(string, "]");
    }
}
