package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܰ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes5.dex */
public final class C14918 extends AbstractC16410 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0749 f48716;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[][] f48717;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f48718;

    public C14918(AbstractC0749 abstractC0749, int i, int i2) {
        this.f48716 = abstractC0749;
        int i3 = 1 << i;
        this.f48718 = new int[i3];
        this.f48717 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max(i2 - 1, 16));
    }

    @Override // l.AbstractC16410
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35895() {
        super.mo35895();
        int i = 0;
        while (true) {
            int[] iArr = this.f48718;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35896(int i, int i2) {
        int i3 = i - 2;
        short[] sArr = this.f53253;
        AbstractC0749 abstractC0749 = this.f48716;
        if (i3 < 8) {
            abstractC0749.f2736.m20489(sArr, 0, 0);
            abstractC0749.f2736.m20488(this.f53254[i2], i3);
        } else {
            abstractC0749.f2736.m20489(sArr, 0, 1);
            int i4 = i - 10;
            if (i4 < 8) {
                abstractC0749.f2736.m20489(sArr, 1, 0);
                abstractC0749.f2736.m20488(this.f53256[i2], i4);
            } else {
                abstractC0749.f2736.m20489(sArr, 1, 1);
                abstractC0749.f2736.m20488(this.f53255, i - 18);
            }
        }
        int[] iArr = this.f48718;
        iArr[i2] = iArr[i2] - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35897(int i, int i2) {
        return this.f48717[i2][i - 2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35898() {
        int[][] iArr;
        int i = 0;
        while (true) {
            int[] iArr2 = this.f48718;
            if (i >= iArr2.length) {
                return;
            }
            if (iArr2[i] <= 0) {
                iArr2[i] = 32;
                short[] sArr = this.f53253;
                int iM20481 = C7461.m20481(sArr[0], 0);
                int i2 = 0;
                while (true) {
                    iArr = this.f48717;
                    if (i2 >= 8) {
                        break;
                    }
                    iArr[i][i2] = C7461.m20482(this.f53254[i], i2) + iM20481;
                    i2++;
                }
                int iM20482 = C7461.m20481(sArr[0], 1);
                int iM20483 = C7461.m20481(sArr[1], 0);
                while (i2 < 16) {
                    iArr[i][i2] = C7461.m20482(this.f53256[i], i2 - 8) + iM20482 + iM20483;
                    i2++;
                }
                int iM20484 = C7461.m20481(sArr[1], 1);
                while (true) {
                    int[] iArr3 = iArr[i];
                    if (i2 < iArr3.length) {
                        iArr3[i2] = C7461.m20482(this.f53255, i2 - 16) + iM20482 + iM20484;
                        i2++;
                    }
                }
            }
            i++;
        }
    }
}
