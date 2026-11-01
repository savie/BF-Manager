package l;

/* JADX INFO: renamed from: l.֡᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0740 extends C9209 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f3032;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16969 f3033;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0740(C4943 c4943, C16969 c16969) {
        super(c4943);
        this.f3033 = c16969;
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3204(C23289 c23289, int i, int i2) {
        this.f3033.m39762();
        int i3 = this.f3032 + 1;
        this.f3032 = i3;
        if (i3 > 256) {
            throw C6385.m17523(EnumC8129.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo3204(c23289, i, i2);
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3205(C23289 c23289, int i, int i2, int i3) {
        this.f3033.m39762();
        int i4 = this.f3032 + 1;
        this.f3032 = i4;
        if (i4 > 256) {
            throw C6385.m17523(EnumC8129.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo3205(c23289, 24, 12, i3);
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo3207() {
        super.mo3207();
        this.f3032--;
    }

    @Override // l.AbstractC7060
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3206(C23289 c23289) {
        super.mo3206(c23289);
        this.f3032--;
    }
}
