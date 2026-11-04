package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23014 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74679 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f74681 = new HashMap(301);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f74680 = new HashMap(301);

    static {
        for (EnumC22268 enumC22268 : EnumC22268.values()) {
            f74681.put(enumC22268.f72115, enumC22268);
            HashMap map = f74680;
            map.put(enumC22268.f72117, enumC22268);
            if (enumC22268.f72116 != null) {
                map.put(enumC22268.f72116, enumC22268);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC22268 m51907(String str) {
        return (EnumC22268) f74680.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC22268 m51906(Integer num) {
        return (EnumC22268) f74681.get(num);
    }
}
