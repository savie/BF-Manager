package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6532 extends AbstractC3157 {
    public C5848 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۛۚ۠, l.᩸ۢᩴ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.᩸ۢᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.᩸ۢᩴ] */
    @Override // l.AbstractC13152, l.InterfaceC19171
    public final void c(long j) {
        ?? abstractC21502;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC21502 = new AbstractC21502();
        } else {
            abstractC21502 = new C5848((int) j);
        }
        this.c = abstractC21502;
    }

    @Override // l.AbstractC13152, l.InterfaceC19171
    public final void end() {
        double[] dArr = (double[]) this.c.b();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC19171 interfaceC19171 = this.a;
        interfaceC19171.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC19171.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC19171.f()) {
                    break;
                }
                interfaceC19171.accept(d);
                i++;
            }
        }
        interfaceC19171.end();
    }

    @Override // l.InterfaceC8857, l.InterfaceC19171
    public final void accept(double d) {
        this.c.accept(d);
    }
}
