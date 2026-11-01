package l;

/* JADX INFO: renamed from: l.۫ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12246 extends AbstractC17806 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f40982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f40983;

    @Override // l.AbstractC17806
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1687() {
        return 0;
    }

    public C12246(EnumC7306 enumC7306, int i, int[] iArr, int[] iArr2) {
        super(enumC7306, i, 0, 0, 0L);
        if (iArr.length != iArr2.length) {
            throw new IllegalArgumentException("keys/targets length mismatch");
        }
        this.f40982 = iArr;
        this.f40983 = iArr2;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int[] m30452() {
        return this.f40982;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[] m30453() {
        return this.f40983;
    }
}
