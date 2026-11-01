package l;

import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: WW6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17605 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40925() {
        C4800 c4800M13323 = C4800.m13323();
        try {
            Field declaredField = C4800.class.getDeclaredField("᩹");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(c4800M13323);
            if (map != null) {
                map.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
