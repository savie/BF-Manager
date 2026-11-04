package l;

/* JADX INFO: renamed from: l.ܺۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16604 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24810[] f53706;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53707;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11383 f53708;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53709;

    public C16604(C17350 c17350, C24810[] c24810Arr, int i) {
        this.f53708 = new C11383(c17350);
        this.f53706 = c24810Arr;
        this.f53709 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39288(int i, int i2) {
        while (i < i2) {
            C11383 c11383 = this.f53708;
            c11383.m28730(i);
            int iM28729 = c11383.m28729();
            i++;
            if (iM28729 != 0 && c11383.m28727() != 0) {
                boolean z = true;
                int i3 = i;
                int i4 = i3;
                int i5 = i4;
                while (true) {
                    if (i3 >= i2) {
                        i3 = i4;
                        break;
                    }
                    c11383.m28730(i3);
                    char cM28727 = c11383.m28727();
                    if (cM28727 != 0) {
                        if (c11383.m28729() > (z ? iM28729 + 1 : iM28729)) {
                            i5 = i3 + 1;
                            i4 = i5;
                        } else {
                            if (cM28727 != 0) {
                                if ((cM28727 != '}' || cM28727 == ']' || cM28727 == ')' || cM28727 == '>') && i5 != i) {
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
                        if (cM28727 != 0) {
                            if (cM28727 != '}') {
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
                    c11383.m28730(i6);
                    C24810 c24810 = this.f53706[c11383.f35836 - this.f53709];
                    int iMin = Math.min(i5, c11383.f35832);
                    int i7 = iMin - c11383.f35834;
                    if (this.f53707) {
                        for (int i8 = c11383.f35837; i8 < i7; i8++) {
                            char[] cArr = c24810.f80281;
                            int[] iArr = c24810.f80282;
                            int i9 = iArr[i8];
                            iArr[i8] = i9 + 1;
                            cArr[i9] = (char) iM28729;
                        }
                    } else {
                        int i10 = c11383.f35837;
                        int[] iArr2 = c24810.f80278;
                        iArr2[i10] = iArr2[i10] + 1;
                        iArr2[i7] = iArr2[i7] - 1;
                    }
                    i6 = iMin;
                }
                m39288(i, i3);
                i = i3;
            }
        }
    }
}
