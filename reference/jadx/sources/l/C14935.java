package l;

import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 569Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C14935 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C14690 f48712 = C14690.m35219("xmlns:(\\w+)\\s*=\\s*\"([^\"]*?)\"");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f48713 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35684(CharSequence charSequence) {
        HashMap map = this.f48713;
        map.clear();
        C6222 c6222Matcher = f48712.matcher(charSequence);
        while (c6222Matcher.find()) {
            map.put(c6222Matcher.group(1), c6222Matcher.group(2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35683(String str) {
        String str2 = (String) this.f48713.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m35682() {
        HashMap map = this.f48713;
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getValue()).equals(Chip.NAMESPACE_ANDROID)) {
                return (String) entry.getKey();
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (((String) entry2.getValue()).equals("http://schemas.android.com/apk/res-auto")) {
                return (String) entry2.getKey();
            }
        }
        return "android";
    }
}
