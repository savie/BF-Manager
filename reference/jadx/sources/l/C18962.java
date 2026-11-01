package l;

/* JADX INFO: renamed from: l.ᩴ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A9YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18962 extends AbstractC23196 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f61403;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f61404;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15435[] f61405;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15435 f61406;

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۖ */
    public final int mo8341(int i, byte[] bArr) {
        return 0;
    }

    public C18962(InterfaceC10601 interfaceC10601, C15435 c15435) {
        super(interfaceC10601);
        this.f61406 = c15435;
        this.f75294 = new C11907(interfaceC10601);
        this.f61403 = new byte[6];
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۙ */
    public final int mo8342(int i, byte[] bArr) {
        return m51226(i, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ܰ */
    public final int mo8343(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = i2 * 18;
        ?? r5 = 1;
        int i4 = (this.f75280 - i3) - 1;
        int i5 = i + 1;
        this.f61404 = i2;
        System.arraycopy(bArr, i3 + i5, this.f61403, 0, 6);
        this.f61405 = new C15435[this.f61404];
        C15435 c15435 = this.f61406;
        String str = c15435.f50302.f39947;
        int i6 = 0;
        boolean z = false;
        int i7 = i5;
        while (i6 < this.f61404) {
            int i8 = i7 + 14;
            while (bArr[i8] == 32) {
                i8--;
            }
            InterfaceC10601 interfaceC10601 = this.f75274;
            String strM27416 = C10933.m27416(bArr, i7, (i8 - i7) + r5, interfaceC10601);
            int i9 = bArr[i7 + 15] & 255;
            byte b = bArr[i7 + 16];
            if (!z) {
                C11907 c11907 = c15435.f50302;
                if (c11907.f39951 == i9 && (c11907.m29701() || c15435.f50302.f39950.equals(strM27416))) {
                    if (c15435.f50302.m29701()) {
                        c15435.f50302 = new C11907(interfaceC10601, strM27416, i9, str);
                    }
                    c15435.f50300 = r5;
                    this.f61405[i6] = c15435;
                    z = true;
                } else {
                    this.f61405[i6] = new C15435(new C11907(interfaceC10601, strM27416, i9, str), c15435.f50301, 0);
                }
            } else {
                this.f61405[i6] = new C15435(new C11907(interfaceC10601, strM27416, i9, str), c15435.f50301, 0);
            }
            i7 += 18;
            i6++;
            r5 = 1;
        }
        int i10 = (i7 - i5) + i5;
        System.arraycopy(bArr, i10, new byte[i4], 0, i4);
        return (i10 + i4) - i;
    }

    @Override // l.AbstractC23196
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("NodeStatusResponse["), super.toString(), "]"));
    }
}
