package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11326 extends AbstractC13934 {
    public C7991 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.۟ܺۗ, l.᩷ܶۗ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.᩷ܶۗ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.᩷ܶۗ] */
    @Override // l.AbstractC5864, l.InterfaceC15143
    public final void c(long j) {
        ?? abstractC22140;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC22140 = new AbstractC22140();
        } else {
            abstractC22140 = new C7991((int) j);
        }
        this.c = abstractC22140;
    }

    @Override // l.AbstractC5864, l.InterfaceC15143
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC15143 interfaceC15143 = this.a;
        interfaceC15143.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC15143.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC15143.f()) {
                    break;
                }
                interfaceC15143.accept(i2);
                i++;
            }
        }
        interfaceC15143.end();
    }

    @Override // l.InterfaceC12334, l.InterfaceC15143
    public final void accept(int i) {
        this.c.accept(i);
    }
}
