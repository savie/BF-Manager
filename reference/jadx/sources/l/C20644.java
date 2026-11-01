package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20644 extends AbstractC22727 {
    public C8463 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.۠᩹۠, l.᩸ۢᩴ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.᩸ۢᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.᩸ۢᩴ] */
    @Override // l.AbstractC10330, l.InterfaceC19171
    public final void c(long j) {
        ?? abstractC21502;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC21502 = new AbstractC21502();
        } else {
            abstractC21502 = new C8463((int) j);
        }
        this.c = abstractC21502;
    }

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC19171 interfaceC19171 = this.a;
        interfaceC19171.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC19171.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC19171.f()) {
                    break;
                }
                interfaceC19171.accept(i2);
                i++;
            }
        }
        interfaceC19171.end();
    }

    @Override // l.InterfaceC10974, l.InterfaceC19171
    public final void accept(int i) {
        this.c.accept(i);
    }
}
