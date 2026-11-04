package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7443 extends AbstractC21394 {
    public C20890 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.᩵᩺ۗ, l.᩷ܶۗ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.᩷ܶۗ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.᩷ܶۗ] */
    @Override // l.AbstractC2377, l.InterfaceC15143
    public final void c(long j) {
        ?? abstractC22140;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC22140 = new AbstractC22140();
        } else {
            abstractC22140 = new C20890((int) j);
        }
        this.c = abstractC22140;
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC15143 interfaceC15143 = this.a;
        interfaceC15143.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC15143.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC15143.f()) {
                    break;
                }
                interfaceC15143.accept(d);
                i++;
            }
        }
        interfaceC15143.end();
    }

    @Override // l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }
}
