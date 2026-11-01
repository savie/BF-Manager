package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8588 extends AbstractC15672 {
    public long[] c;
    public int d;

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
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

    @Override // l.InterfaceC21993, l.InterfaceC19171
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }
}
