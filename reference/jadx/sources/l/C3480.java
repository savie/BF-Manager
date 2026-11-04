package l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G73R */
/* JADX INFO: loaded from: classes2.dex */
public final class C3480 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f12027 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11431() {
        this.f12027.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11432(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            str2 = str.substring(0, iLastIndexOf + 1) + str2;
        }
        boolean zEquals = str.equals(str2);
        HashMap map = this.f12027;
        if (zEquals) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m11433(String str, String str2) throws IOException {
        int i = 0;
        String strM35187 = C14584.m35187(str, false);
        String strM35202 = C14584.m35202(strM35187, str2);
        int iLastIndexOf = strM35187.lastIndexOf(47);
        String str3 = (String) this.f12027.get(C14584.m35187(iLastIndexOf == -1 ? strM35202 : strM35187.substring(0, iLastIndexOf + 1) + strM35202, true));
        if (str3 == null) {
            return strM35202;
        }
        String strM35188 = C14584.m35187(str3, true);
        int iLastIndexOf2 = strM35187.lastIndexOf(47);
        String strSubstring = iLastIndexOf2 == -1 ? "" : strM35187.substring(0, iLastIndexOf2);
        String[] strArrSplit = strSubstring.isEmpty() ? new String[0] : strSubstring.split("/");
        String[] strArrSplit2 = strM35188.isEmpty() ? new String[0] : strM35188.split("/");
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = i; i2 < strArrSplit.length; i2++) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append("..");
        }
        while (i < strArrSplit2.length) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append(strArrSplit2[i]);
            i++;
        }
        return sb.length() == 0 ? "." : sb.toString();
    }
}
