package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6369 extends AbstractC21394 {
    public double[] c;
    public int d;

    @Override // l.AbstractC2377, l.InterfaceC15143
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
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

    @Override // l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }
}
