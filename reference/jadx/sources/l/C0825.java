package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֨ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0825 extends AbstractC22727 {
    public int[] c;
    public int d;

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC19171 interfaceC19171 = this.a;
        interfaceC19171.c(j);
        if (!this.b) {
            while (i < this.d) {
                interfaceC19171.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC19171.f()) {
                interfaceC19171.accept(this.c[i]);
                i++;
            }
        }
        interfaceC19171.end();
        this.c = null;
    }

    @Override // l.InterfaceC10974, l.InterfaceC19171
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
