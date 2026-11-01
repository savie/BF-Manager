package l;

/* JADX INFO: renamed from: l.ۛܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6134 extends AbstractC0489 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f20938;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f20939;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14602[] f20940;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f20941;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8626 f20942;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23006[] f20943;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15682[] f20944;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15682 f20945;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14690 f20946;

    public C6134(C8626 c8626, int[] iArr, C15682[] c15682Arr, C23006[] c23006Arr, C14602[] c14602Arr, boolean z, C15682 c15682) {
        C23006 c23006;
        super(c8626.m22407());
        this.f20942 = c8626;
        C14690 c14690M22414 = c8626.m22414();
        this.f20946 = c14690M22414;
        this.f20939 = iArr;
        this.f20944 = c15682Arr;
        this.f20943 = c23006Arr;
        this.f20940 = c14602Arr;
        this.f20938 = z;
        this.f20945 = c15682;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                for (C14602 c14602 : c14602Arr) {
                    if (c14690M22414.m35223(c14602.f47783)) {
                        break;
                    }
                }
                this.f20941 = z2;
            } else if (c14690M22414.m35223(iArr[i]) || ((c23006 = c23006Arr[i]) != null && (c14690M22414.m35223(c23006.m50877()) || c14690M22414.m35223(c23006.m50878())))) {
                break;
            } else {
                i++;
            }
        }
        z2 = true;
        this.f20941 = z2;
    }
}
