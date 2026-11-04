package l;

/* JADX INFO: renamed from: l.ۧۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11577 extends AbstractC16052 {
    public C11577(int i, InterfaceC17544 interfaceC17544) {
        super(new C23512[i], interfaceC17544);
        if (i == 0 || i >= 10000) {
            throw new IllegalArgumentException(C13645.m33382(i, "count="));
        }
        int i2 = 10000 / i;
        int i3 = i - 1;
        int i4 = 10000 - (i2 * i3);
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 == i3) {
                this.f52053[i5] = new C23512(this, i4);
            } else {
                this.f52053[i5] = new C23512(this, i2);
            }
        }
    }
}
