package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16802 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16576 f53795 = new C16576();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C20330 f53796 = new C20330(EnumC0573.f2434, 0, 0, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f53797 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23942 f53798;

    public C16802(C12343 c12343) {
        c12343.m30659(f53795, this);
        this.f53798 = C23942.m52776(c12343);
        for (EnumC0573 enumC0573 : EnumC0573.values()) {
            String str = enumC0573.f2497;
            if (str != null) {
                this.f53798.f77631.m17389(str);
                this.f53797.put(enumC0573.f2497, enumC0573);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC0573 m39452(AbstractC11242 abstractC11242) {
        EnumC0573 enumC0573 = (EnumC0573) this.f53797.get(abstractC11242.toString());
        return enumC0573 != null ? enumC0573 : EnumC0573.f2416;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC0573 m39451(String str) {
        EnumC0573 enumC0573 = (EnumC0573) this.f53797.get(str);
        return enumC0573 != null ? enumC0573 : EnumC0573.f2416;
    }
}
