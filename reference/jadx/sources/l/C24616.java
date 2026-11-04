package l;

/* JADX INFO: renamed from: l.᩺᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24616 extends AbstractC3732 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6716[] f79728;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4478 f79729;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24616(C4478 c4478, int i, int i2) {
        super(i, i2);
        this.f79729 = c4478;
        this.f79728 = new C6716[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            C6716[] c6716Arr = this.f79728;
            if (i3 >= c6716Arr.length) {
                return;
            }
            c6716Arr[i3] = new C6716(this);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54945() {
        int i = 0;
        while (true) {
            C6716[] c6716Arr = this.f79728;
            if (i >= c6716Arr.length) {
                return;
            }
            AbstractC17076.m40213(c6716Arr[i].f77275);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54944() {
        C4478 c4478 = this.f79729;
        C6716 c6716 = this.f79728[m12140(c4478.f16018.m29895(0), c4478.f16018.m29894())];
        short[] sArr = c6716.f77275;
        C4478 c4479 = c6716.f22343.f79729;
        int iM25289 = 1;
        if (c4479.f66848.m5328()) {
            do {
                iM25289 = (iM25289 << 1) | c4479.f16017.m25289(sArr, iM25289);
            } while (iM25289 < 256);
        } else {
            int iM29895 = c4479.f16018.m29895(c4479.f66852[0]);
            int i = 256;
            int i2 = 1;
            do {
                iM29895 <<= 1;
                int i3 = iM29895 & i;
                int iM252810 = c4479.f16017.m25289(sArr, i + i3 + i2);
                i2 = (i2 << 1) | iM252810;
                i &= (~i3) ^ (0 - iM252810);
            } while (i2 < 256);
            iM25289 = i2;
        }
        c4479.f16018.m29897((byte) iM25289);
        c4479.f66848.m5329();
    }
}
