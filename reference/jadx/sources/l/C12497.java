package l;

import com.alipay.sdk.m.w.a;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62F */
/* JADX INFO: loaded from: classes3.dex */
public final class C12497 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final TreeMap f41788;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f41789;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f41790;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f41791;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41792;

    static {
        TreeMap treeMap = new TreeMap();
        f41788 = treeMap;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static DateFormatSymbols m31037(String str) {
        Object obj = f41788.get(str);
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

    public C12497(C12497 c12497) {
        this.f41792 = true;
        this.f41789 = c12497.f41789;
        this.f41790 = c12497.f41790;
        this.f41792 = c12497.f41792;
        this.f41791 = c12497.f41791;
    }

    public C12497(String str, String str2, String str3) {
        this.f41792 = true;
        this.f41789 = str;
        this.f41790 = str2;
        this.f41791 = str3;
    }

    public C12497(String str, C12497 c12497) {
        this.f41792 = true;
        this.f41789 = str;
        this.f41790 = c12497.f41790;
        this.f41792 = c12497.f41792;
        this.f41791 = c12497.f41791;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m31039() {
        return this.f41790;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m31042() {
        return this.f41791;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m31041() {
        return this.f41789;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m31038() {
        return this.f41792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31040(String str) {
        this.f41790 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31043(String str) {
        this.f41791 = str;
    }
}
