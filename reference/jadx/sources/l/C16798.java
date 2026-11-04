package l;

/* JADX INFO: renamed from: l.ܺۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16798 extends AbstractC16052 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16798(C10716 c10716) {
        super(new C23512[2], c10716);
        int i = (int) 7000.0f;
        int[] iArr = {i, 10000 - i};
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            i2 += i4;
            this.f52053[i3] = new C23512(this, i4);
        }
        if (i2 != 10000) {
            throw new IllegalArgumentException();
        }
    }
}
