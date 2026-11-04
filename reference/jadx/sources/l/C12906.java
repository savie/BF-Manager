package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12906 extends AbstractC25344 {
    public long[] c;
    public int d;

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void end() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC15143 interfaceC15143 = this.a;
        interfaceC15143.c(j);
        if (!this.b) {
            while (i < this.d) {
                interfaceC15143.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC15143.f()) {
                interfaceC15143.accept(this.c[i]);
                i++;
            }
        }
        interfaceC15143.end();
        this.c = null;
    }

    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }
}
