package l;

/* JADX INFO: renamed from: l.ܿۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6OY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18298 extends RuntimeException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC21282 f59661;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59662;

    public C18298(int i, int i2, String str) {
        this(i, i2, str, EnumC21282.SYNTAX);
    }

    public C18298(int i, int i2, String str, EnumC21282 enumC21282) {
        super(str);
        this.f59661 = enumC21282;
        this.f59662 = i;
        this.f59660 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m42631() {
        return this.f59661 == EnumC21282.LIMIT;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m42633() {
        return this.f59661 == EnumC21282.UNCLOSED;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42632() {
        return this.f59662;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42630() {
        return this.f59660;
    }
}
