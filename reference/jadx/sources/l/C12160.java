package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12160 extends AbstractC14900 {
    public Object[] d;
    public int e;

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC15143 interfaceC15143 = this.a;
        interfaceC15143.c(j);
        if (!this.c) {
            while (i < this.e) {
                interfaceC15143.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !interfaceC15143.f()) {
                interfaceC15143.accept(this.d[i]);
                i++;
            }
        }
        interfaceC15143.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
