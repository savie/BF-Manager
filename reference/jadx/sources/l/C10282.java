package l;

/* JADX INFO: renamed from: l.ۢܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10282 extends AbstractC3659 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f32835;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f32836;

    @Override // l.AbstractC3659
    /* JADX INFO: renamed from: ᩹ */
    public final int mo2678() {
        return 0;
    }

    public C10282(EnumC14757 enumC14757, int i, int[] iArr, int[] iArr2) {
        super(enumC14757, i, 0, 0, 0L);
        if (iArr.length != iArr2.length) {
            throw new IllegalArgumentException("keys/targets length mismatch");
        }
        this.f32836 = iArr;
        this.f32835 = iArr2;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] m26496() {
        return this.f32836;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[] m26497() {
        return this.f32835;
    }
}
