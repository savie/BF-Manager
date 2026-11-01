package l;

/* JADX INFO: renamed from: l.ۖܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2654 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f10319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC5477 f10320;

    public C2654(int i, EnumC5477 enumC5477) {
        super("Invalid HTTP request headers at line " + i + ": " + enumC5477);
        this.f10319 = i;
        this.f10320 = enumC5477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8177() {
        return this.f10319;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC5477 m8178() {
        return this.f10320;
    }
}
