package l;

/* JADX INFO: renamed from: l.᩻ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes.dex */
public final class C24970 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f80861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC16764 f80862;

    public C24970(int i, EnumC16764 enumC16764) {
        super("Invalid HTTP request headers at line " + i + ": " + enumC16764);
        this.f80861 = i;
        this.f80862 = enumC16764;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55776() {
        return this.f80861;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC16764 m55777() {
        return this.f80862;
    }
}
