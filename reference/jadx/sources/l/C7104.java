package l;

/* JADX INFO: renamed from: l.ۜ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7104 extends AbstractC18393 {
    public C7104(int i, InterfaceC21921 interfaceC21921) {
        super(new C19099[i], interfaceC21921);
        if (i == 0 || i >= 10000) {
            throw new IllegalArgumentException(C8479.m22141(i, "count="));
        }
        int i2 = 10000 / i;
        int i3 = i - 1;
        int i4 = 10000 - (i2 * i3);
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 == i3) {
                this.f58639[i5] = new C19099(this, i4);
            } else {
                this.f58639[i5] = new C19099(this, i2);
            }
        }
    }
}
