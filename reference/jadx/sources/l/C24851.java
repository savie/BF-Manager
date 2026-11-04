package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes.dex */
public final class C24851 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f80442 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14763 f80443;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f80444;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14763 f80445;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80446;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f80447;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f80448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f80449;

    public C24851(C14763 c14763, int i, int[] iArr, C14763 c14764, List list, List list2, int[] iArr2) {
        this.f80443 = c14763;
        this.f80446 = i;
        this.f80444 = iArr;
        this.f80445 = c14764;
        this.f80449 = list;
        this.f80447 = list2;
        this.f80448 = iArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55376() {
        m55375(0, this.f80443.size() - 1, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55375(int i, int i2, int i3) {
        int[] iArr = this.f80444;
        int i4 = this.f80446;
        if (i3 != i4) {
            while (i <= i2) {
                iArr[i3] = i;
                i++;
                m55375(i, i2, i3 + 1);
            }
            return;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (((C17391) this.f80449.get(this.f80445.getInt(i6))).equals(this.f80447.get(this.f80443.getInt(iArr[i6])))) {
                i5++;
            }
        }
        if (i5 > this.f80442) {
            this.f80442 = i5;
            System.arraycopy(iArr, 0, this.f80448, 0, iArr.length);
        }
    }
}
