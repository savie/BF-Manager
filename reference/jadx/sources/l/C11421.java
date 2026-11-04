package l;

import com.alipay.sdk.m.w.a;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۧۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11421 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final TreeMap f35915;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f35916;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f35917;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f35918;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f35919;

    static {
        TreeMap treeMap = new TreeMap();
        f35915 = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        treeMap.put("de", Locale.GERMAN);
        treeMap.put("it", Locale.ITALIAN);
        treeMap.put("es", new Locale("es", "", ""));
        treeMap.put("pt", new Locale("pt", "", ""));
        treeMap.put("da", new Locale("da", "", ""));
        treeMap.put(a.v, new Locale(a.v, "", ""));
        treeMap.put("no", new Locale("no", "", ""));
        treeMap.put("nl", new Locale("nl", "", ""));
        treeMap.put("ro", new Locale("ro", "", ""));
        treeMap.put("sq", new Locale("sq", "", ""));
        treeMap.put("sh", new Locale("sh", "", ""));
        treeMap.put("sk", new Locale("sk", "", ""));
        treeMap.put("sl", new Locale("sl", "", ""));
        treeMap.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static DateFormatSymbols m28766(String str) {
        Object obj = f35915.get(str);
        if (obj != null) {
            if (obj instanceof Locale) {
                return new DateFormatSymbols((Locale) obj);
            }
            if (obj instanceof String) {
                StringTokenizer stringTokenizer = new StringTokenizer((String) obj, "|");
                if (12 != stringTokenizer.countTokens()) {
                    throw new IllegalArgumentException("expecting a pipe-delimited string containing 12 tokens");
                }
                String[] strArr = new String[13];
                int i = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    strArr[i] = stringTokenizer.nextToken();
                    i++;
                }
                strArr[i] = "";
                DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
                dateFormatSymbols.setShortMonths(strArr);
                return dateFormatSymbols;
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    public C11421(C11421 c11421) {
        this.f35918 = true;
        this.f35919 = c11421.f35919;
        this.f35916 = c11421.f35916;
        this.f35918 = c11421.f35918;
        this.f35917 = c11421.f35917;
    }

    public C11421(String str, String str2, String str3) {
        this.f35918 = true;
        this.f35919 = str;
        this.f35916 = str2;
        this.f35917 = str3;
    }

    public C11421(String str, C11421 c11421) {
        this.f35918 = true;
        this.f35919 = str;
        this.f35916 = c11421.f35916;
        this.f35918 = c11421.f35918;
        this.f35917 = c11421.f35917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28767() {
        return this.f35916;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m28770() {
        return this.f35917;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m28769() {
        return this.f35919;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m28772() {
        return this.f35918;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28768(String str) {
        this.f35916 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28771(String str) {
        this.f35917 = str;
    }
}
