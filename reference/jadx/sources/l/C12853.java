package l;

import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۫ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6G1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12853 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f41155;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f41156;

    public C12853(String str, String str2) {
        this.f41155 = str;
        this.f41156 = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12853 m31892(String str, String str2, String str3) {
        String strConcat = "";
        if ("built-in".equals(str3)) {
            return new C12853("", "");
        }
        String lowerCase = str == null ? "" : str.toLowerCase(Locale.ROOT);
        String lowerCase2 = str2 == null ? "" : str2.trim().toLowerCase(Locale.ROOT);
        int iIndexOf = lowerCase2.indexOf(59);
        if (iIndexOf >= 0) {
            lowerCase2 = lowerCase2.substring(0, iIndexOf).trim();
        }
        int iIndexOf2 = lowerCase2.indexOf(47);
        if (iIndexOf2 <= 0 || iIndexOf2 == lowerCase2.length() - 1 || lowerCase2.indexOf(47, iIndexOf2 + 1) >= 0 || lowerCase2.indexOf(32) >= 0 || lowerCase2.equals("*/*") || lowerCase2.equals("application/octet-stream") || lowerCase2.equals("binary/octet-stream") || lowerCase2.equals("application/unknown") || lowerCase2.equals("application/x-unknown") || lowerCase2.equals("unknown/unknown")) {
            lowerCase2 = "";
        }
        String str4 = TextBundle.TEXT_ENTRY;
        String[] strArr = {TextBundle.TEXT_ENTRY, "image", "video", "audio"};
        String str5 = "";
        for (int i = 0; i < 4; i++) {
            String str6 = strArr[i];
            if (lowerCase2.startsWith(str6 + '/')) {
                str5 = str6;
            }
        }
        if (str5.isEmpty() && lowerCase2.indexOf(42) < 0) {
            str5 = lowerCase2;
        }
        if (lowerCase2.indexOf(42) >= 0) {
            lowerCase2 = "";
        }
        str3.getClass();
        switch (str3) {
            case "text/*":
                break;
            case "audio/*":
                str4 = "audio";
                break;
            case "video/*":
                str4 = "video";
                break;
            case "image/*":
                str4 = "image";
                break;
            default:
                str4 = str5;
                break;
        }
        if (!lowerCase.isEmpty()) {
            strConcat = "ext:".concat(lowerCase);
        } else if (!lowerCase2.isEmpty()) {
            strConcat = "mime:".concat(lowerCase2);
        }
        return new C12853(strConcat, str4);
    }
}
