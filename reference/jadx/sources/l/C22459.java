package l;

/* JADX INFO: renamed from: l.᩸֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77W6 */
/* JADX INFO: loaded from: classes.dex */
public class C22459 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f72676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21229 f72677 = new C4075();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f72678;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72679;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f72680;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f72681;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f72682;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f72683;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13769 f72684;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f72685;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7804 f72686;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f72687;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50630() {
        C7804 c7804 = this.f72686;
        int i = c7804.f25993;
        int i2 = this.f72679;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c7804.f25974;
        int length = bArr.length;
        int i3 = c7804.f25972;
        if (length > i3) {
            byte[] bArr2 = this.f72676;
            if (bArr2.length > this.f72680 && bArr.length >= i3 + i) {
                int length2 = bArr2.length;
            }
        }
        System.arraycopy(bArr, i3, this.f72676, this.f72680, i);
        this.f72680 += i;
        C7804 c7805 = this.f72686;
        c7805.f25972 += i;
        this.f72683 += (long) i;
        this.f72679 -= i;
        int i4 = c7805.f25993 - i;
        c7805.f25993 = i4;
        if (i4 == 0) {
            c7805.f25972 = 0;
        }
    }
}
