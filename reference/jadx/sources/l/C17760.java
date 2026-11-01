package l;

/* JADX INFO: renamed from: l.ᩳۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9630 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17760 extends AbstractC6471 implements InterfaceC0183 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f56335;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f56336;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f56337;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f56338;

    @Override // l.InterfaceC7239
    /* JADX INFO: renamed from: ۨ */
    public final int mo1599() {
        return 6;
    }

    public C17760(String str, int i, String str2, String str3, int i2) {
        super(i);
        this.f56335 = i2;
        this.f56338 = str;
        this.f56336 = str2;
        this.f56337 = str3;
    }

    @Override // l.InterfaceC0183
    /* JADX INFO: renamed from: ۙ */
    public final int mo1385() {
        return this.f56335;
    }

    @Override // l.InterfaceC19940
    public final String getName() {
        return this.f56338;
    }

    @Override // l.InterfaceC19940
    public final String getType() {
        return this.f56336;
    }

    @Override // l.InterfaceC19940
    public final String getSignature() {
        return this.f56337;
    }
}
