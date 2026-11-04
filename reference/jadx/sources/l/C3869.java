package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3869 extends AbstractC25344 {
    public C16216 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܶܽۗ, l.᩷ܶۗ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.᩷ܶۗ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.᩷ܶۗ] */
    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void c(long j) {
        ?? abstractC22140;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC22140 = new AbstractC22140();
        } else {
            abstractC22140 = new C16216((int) j);
        }
        this.c = abstractC22140;
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC15143 interfaceC15143 = this.a;
        interfaceC15143.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC15143.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC15143.f()) {
                    break;
                }
                interfaceC15143.accept(j);
                i++;
            }
        }
        interfaceC15143.end();
    }

    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        this.c.accept(j);
    }
}
