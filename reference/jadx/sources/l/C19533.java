package l;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G73R */
/* JADX INFO: loaded from: classes4.dex */
public final class C19533 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f62805 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44615() {
        this.f62805.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44616(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            str2 = str.substring(0, iLastIndexOf + 1) + str2;
        }
        boolean zEquals = str.equals(str2);
        HashMap map = this.f62805;
        if (zEquals) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m44617(String str, String str2) throws IOException {
        int i = 0;
        String strM15307 = C5553.m15307(str, false);
        String strM15324 = C5553.m15324(strM15307, str2);
        int iLastIndexOf = strM15307.lastIndexOf(47);
        String str3 = (String) this.f62805.get(C5553.m15307(iLastIndexOf == -1 ? strM15324 : strM15307.substring(0, iLastIndexOf + 1) + strM15324, true));
        if (str3 == null) {
            return strM15324;
        }
        String strM15308 = C5553.m15307(str3, true);
        int iLastIndexOf2 = strM15307.lastIndexOf(47);
        String strSubstring = iLastIndexOf2 == -1 ? "" : strM15307.substring(0, iLastIndexOf2);
        String[] strArrSplit = strSubstring.isEmpty() ? new String[0] : strSubstring.split("/");
        String[] strArrSplit2 = strM15308.isEmpty() ? new String[0] : strM15308.split("/");
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
