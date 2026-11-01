package l;

/* JADX INFO: renamed from: l.ۙ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N5DL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4301 extends AbstractC17581 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10860 f15469;

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return "InvokeCustomExpr(....)";
    }

    public C4301(EnumC9947 enumC9947, AbstractC7124[] abstractC7124Arr, C10860 c10860) {
        super(enumC9947, abstractC7124Arr);
        this.f15469 = c10860;
    }

    @Override // l.AbstractC17581
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14076 mo12099() {
        return this.f15469.m27212();
    }

    @Override // l.AbstractC8536, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C4301(this.f23823, m22290(), this.f15469);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C4301(this.f23823, m22291(c10527), this.f15469);
    }
}
