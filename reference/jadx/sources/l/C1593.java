package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1593 extends AbstractC15672 {
    public C16336 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܽ֫ᩴ, l.᩸ۢᩴ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.᩸ۢᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.᩸ۢᩴ] */
    @Override // l.AbstractC23736, l.InterfaceC19171
    public final void c(long j) {
        ?? abstractC21502;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            abstractC21502 = new AbstractC21502();
        } else {
            abstractC21502 = new C16336((int) j);
        }
        this.c = abstractC21502;
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC19171 interfaceC19171 = this.a;
        interfaceC19171.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC19171.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC19171.f()) {
                    break;
                }
                interfaceC19171.accept(j);
                i++;
            }
        }
        interfaceC19171.end();
    }

    @Override // l.InterfaceC21993, l.InterfaceC19171
    public final void accept(long j) {
        this.c.accept(j);
    }
}
