package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P735 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16861 {
    CONTAINS(1, R.string.MT_Protector, R.string.MT_Protector),
    PREFIX(2, R.string.MT_Protector, R.string.MT_Protector),
    SUFFIX(3, R.string.MT_Protector, R.string.MT_Protector),
    EXACT(4, R.string.MT_Protector, R.string.MT_Protector),
    WILDCARD(0, R.string.MT_Protector, R.string.MT_Protector),
    REGEX(5, R.string.MT_Protector, R.string.MT_Protector);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f54403;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f54404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54405;

    EnumC16861(int i, int i2, int i3) {
        this.f54404 = i;
        this.f54403 = i2;
        this.f54405 = i3;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int m39821() {
        return this.f54404;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m39820() {
        return this.f54403;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int m39822() {
        return this.f54405;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16861 m39818(int i) {
        for (EnumC16861 enumC16861 : values()) {
            if (enumC16861.f54404 == i) {
                return enumC16861;
            }
        }
        return WILDCARD;
    }
}
