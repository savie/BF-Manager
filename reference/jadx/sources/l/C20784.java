package l;

/* JADX INFO: renamed from: l.᩷ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20784 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f67589;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7378[] f67590;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f67591;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10201 f67592;

    public C20784(C15846 c15846, C7378[] c7378Arr, int i) {
        this.f67592 = new C10201(c15846);
        this.f67590 = c7378Arr;
        this.f67589 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46773(int i, int i2) {
        while (i < i2) {
            C10201 c10201 = this.f67592;
            c10201.m25993(i);
            int iM25992 = c10201.m25992();
            i++;
            if (iM25992 != 0 && c10201.m25990() != 0) {
                boolean z = true;
                int i3 = i;
                int i4 = i3;
                int i5 = i4;
                while (true) {
                    if (i3 >= i2) {
                        i3 = i4;
                        break;
                    }
                    c10201.m25993(i3);
                    char cM25990 = c10201.m25990();
                    if (cM25990 != 0) {
                        if (c10201.m25992() > (z ? iM25992 + 1 : iM25992)) {
                            i5 = i3 + 1;
                            i4 = i5;
                        } else {
                            if (cM25990 != 0) {
                                if ((cM25990 != '}' || cM25990 == ']' || cM25990 == ')' || cM25990 == '>') && i5 != i) {
                                    i5 = i3;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                            i4 = i3 + 1;
                        }
                        i3++;
                        z = false;
                    } else {
                        if (cM25990 != 0) {
                            if (cM25990 != '}') {
                                i5 = i3;
                                break;
                            } else {
                                i5 = i3;
                                break;
                            }
                        }
                        i4 = i3 + 1;
                        i3++;
                        z = false;
                    }
                }
                int i6 = i;
                while (i6 < i5) {
                    c10201.m25993(i6);
                    C7378 c7378 = this.f67590[c10201.f34845 - this.f67589];
                    int iMin = Math.min(i5, c10201.f34844);
                    int i7 = iMin - c10201.f34846;
                    if (this.f67591) {
                        for (int i8 = c10201.f34841; i8 < i7; i8++) {
                            char[] cArr = c7378.f24473;
                            int[] iArr = c7378.f24469;
                            int i9 = iArr[i8];
                            iArr[i8] = i9 + 1;
                            cArr[i9] = (char) iM25992;
                        }
                    } else {
                        int i10 = c10201.f34841;
                        int[] iArr2 = c7378.f24472;
                        iArr2[i10] = iArr2[i10] + 1;
                        iArr2[i7] = iArr2[i7] - 1;
                    }
                    i6 = iMin;
                }
                m46773(i, i3);
                i = i3;
            }
        }
    }
}
