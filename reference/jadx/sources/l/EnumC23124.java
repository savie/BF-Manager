package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P735 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23124 {
    CONTAINS(1, R.string.MT_Protector, R.string.MT_Protector),
    PREFIX(2, R.string.MT_Protector, R.string.MT_Protector),
    SUFFIX(3, R.string.MT_Protector, R.string.MT_Protector),
    EXACT(4, R.string.MT_Protector, R.string.MT_Protector),
    WILDCARD(0, R.string.MT_Protector, R.string.MT_Protector),
    REGEX(5, R.string.MT_Protector, R.string.MT_Protector);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f75099;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f75100;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f75101;

    EnumC23124(int i, int i2, int i3) {
        this.f75099 = i;
        this.f75100 = i2;
        this.f75101 = i3;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int m51125() {
        return this.f75099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m51124() {
        return this.f75100;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m51126() {
        return this.f75101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23124 m51123(int i) {
        for (EnumC23124 enumC23124 : values()) {
            if (enumC23124.f75099 == i) {
                return enumC23124;
            }
        }
        return WILDCARD;
    }
}
