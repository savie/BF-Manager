package l;

import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: WW6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9501 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24882() {
        C22884 c22884M51609 = C22884.m51609();
        try {
            Field declaredField = C22884.class.getDeclaredField("ܳ");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(c22884M51609);
            if (map != null) {
                map.clear();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
