package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BM7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7748 extends AbstractC8956 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f25595 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10571 m20397(String str, String str2) {
        HashMap map = this.f25595;
        C10571 c10571 = (C10571) map.get(str);
        if (c10571 != null) {
            return c10571;
        }
        C10571 c10572 = new C10571(str);
        c10572.m26734(str, str2);
        map.put(str, c10572);
        return c10572;
    }
}
