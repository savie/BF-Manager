package l;

/* JADX INFO: renamed from: l.۫֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12752 {
    EXTENDS(1, "? extends "),
    UNBOUND(0, "?"),
    SUPER(-1, "? super ");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f40822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f40823;

    EnumC12752(int i, String str) {
        this.f40822 = i;
        this.f40823 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m31589() {
        return this.f40822;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String m31590() {
        return this.f40823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12752 m31587(int i) {
        if (i == 0) {
            return UNBOUND;
        }
        return i == 1 ? EXTENDS : SUPER;
    }
}
