package l;

/* JADX INFO: renamed from: l.֡ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77W6 */
/* JADX INFO: loaded from: classes2.dex */
public class C0581 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f2535;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C15400 f2536;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f2537;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4109 f2538 = new C1287();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7638 f2539;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f2540;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f2541;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f2542;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f2543;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f2544;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f2545;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f2546;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2758() {
        C15400 c15400 = this.f2536;
        int i = c15400.f50180;
        int i2 = this.f2541;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c15400.f50154;
        int length = bArr.length;
        int i3 = c15400.f50192;
        if (length > i3) {
            byte[] bArr2 = this.f2537;
            if (bArr2.length > this.f2540 && bArr.length >= i3 + i) {
                int length2 = bArr2.length;
            }
        }
        System.arraycopy(bArr, i3, this.f2537, this.f2540, i);
        this.f2540 += i;
        C15400 c15401 = this.f2536;
        c15401.f50192 += i;
        this.f2544 += (long) i;
        this.f2541 -= i;
        int i4 = c15401.f50180 - i;
        c15401.f50180 = i4;
        if (i4 == 0) {
            c15401.f50192 = 0;
        }
    }
}
