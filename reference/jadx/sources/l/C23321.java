package l;

/* JADX INFO: renamed from: l.᩹ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23321 extends AbstractDialogInterfaceOnClickListenerC2437 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f75541;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f75542;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12132[] f75543;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23321(AbstractActivityC17204 abstractActivityC17204, C12132[] c12132Arr, boolean[] zArr) {
        super(abstractActivityC17204);
        this.f75543 = c12132Arr;
        this.f75542 = zArr;
        this.f75541 = 0;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC2437
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8227() {
        int i = this.f75541;
        C12132[] c12132Arr = this.f75543;
        C12132 c12132 = c12132Arr[i];
        String str = c12132.f39017;
        String str2 = c12132.f39017;
        C17359.requireNonNull(str);
        C17359.requireNonNull(c12132.f39018);
        if (!this.f75542[0]) {
            m8226(str2, c12132.f39018);
        } else {
            m8226(c12132.f39018, str2);
        }
        int i2 = this.f75541 + 1;
        this.f75541 = i2;
        return i2 < c12132Arr.length;
    }
}
