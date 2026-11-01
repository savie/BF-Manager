package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۜۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6513 extends AbstractC13570 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21330 f21936;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f21937;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[][] f21938;

    public C6513(AbstractC21330 abstractC21330, int i, int i2) {
        this.f21936 = abstractC21330;
        int i3 = 1 << i;
        this.f21937 = new int[i3];
        this.f21938 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max(i2 - 1, 16));
    }

    @Override // l.AbstractC13570
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17716() {
        super.mo17716();
        int i = 0;
        while (true) {
            int[] iArr = this.f21937;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17717(int i, int i2) {
        int i3 = i - 2;
        short[] sArr = this.f44766;
        AbstractC21330 abstractC21330 = this.f21936;
        if (i3 < 8) {
            abstractC21330.f69417.m46492(sArr, 0, 0);
            abstractC21330.f69417.m46491(this.f44767[i2], i3);
        } else {
            abstractC21330.f69417.m46492(sArr, 0, 1);
            int i4 = i - 10;
            if (i4 < 8) {
                abstractC21330.f69417.m46492(sArr, 1, 0);
                abstractC21330.f69417.m46491(this.f44765[i2], i4);
            } else {
                abstractC21330.f69417.m46492(sArr, 1, 1);
                abstractC21330.f69417.m46491(this.f44768, i - 18);
            }
        }
        int[] iArr = this.f21937;
        iArr[i2] = iArr[i2] - 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17718(int i, int i2) {
        return this.f21938[i2][i - 2];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17719() {
        int[][] iArr;
        int i = 0;
        while (true) {
            int[] iArr2 = this.f21937;
            if (i >= iArr2.length) {
                return;
            }
            if (iArr2[i] <= 0) {
                iArr2[i] = 32;
                short[] sArr = this.f44766;
                int iM46486 = C20625.m46486(sArr[0], 0);
                int i2 = 0;
                while (true) {
                    iArr = this.f21938;
                    if (i2 >= 8) {
                        break;
                    }
                    iArr[i][i2] = C20625.m46487(this.f44767[i], i2) + iM46486;
                    i2++;
                }
                int iM46487 = C20625.m46486(sArr[0], 1);
                int iM46488 = C20625.m46486(sArr[1], 0);
                while (i2 < 16) {
                    iArr[i][i2] = C20625.m46487(this.f44765[i], i2 - 8) + iM46487 + iM46488;
                    i2++;
                }
                int iM46489 = C20625.m46486(sArr[1], 1);
                while (true) {
                    int[] iArr3 = iArr[i];
                    if (i2 < iArr3.length) {
                        iArr3[i2] = C20625.m46487(this.f44768, i2 - 16) + iM46487 + iM46489;
                        i2++;
                    }
                }
            }
            i++;
        }
    }
}
