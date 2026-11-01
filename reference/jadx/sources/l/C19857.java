package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63686 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f63688 = new HashMap(301);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f63687 = new HashMap(301);

    static {
        for (EnumC20562 enumC20562 : EnumC20562.values()) {
            f63688.put(enumC20562.f66964, enumC20562);
            HashMap map = f63687;
            map.put(enumC20562.f66963, enumC20562);
            if (enumC20562.f66965 != null) {
                map.put(enumC20562.f66965, enumC20562);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20562 m45103(String str) {
        return (EnumC20562) f63687.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20562 m45102(Integer num) {
        return (EnumC20562) f63688.get(num);
    }
}
