package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes.dex */
public class C23739 extends AbstractC13213 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f76944 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16279 m53007(String str, String str2) {
        HashMap map = this.f76944;
        C16279 c16279 = (C16279) map.get(str);
        if (c16279 != null) {
            return c16279;
        }
        C16279 c162710 = new C16279(str);
        c162710.m38615(str, str2);
        map.put(str, c162710);
        return c162710;
    }
}
