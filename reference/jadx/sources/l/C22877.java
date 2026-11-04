package l;

import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 569Z */
/* JADX INFO: loaded from: classes.dex */
public final class C22877 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C18415 f74335 = C18415.m42925("xmlns:(\\w+)\\s*=\\s*\"([^\"]*?)\"");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f74336 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51606(CharSequence charSequence) {
        HashMap map = this.f74336;
        map.clear();
        C4245 c4245Matcher = f74335.matcher(charSequence);
        while (c4245Matcher.find()) {
            map.put(c4245Matcher.group(1), c4245Matcher.group(2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51605(String str) {
        String str2 = (String) this.f74336.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51604() {
        HashMap map = this.f74336;
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
