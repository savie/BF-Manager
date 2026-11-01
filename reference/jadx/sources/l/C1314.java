package l;

/* JADX INFO: renamed from: l.֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1314 extends AbstractC4136 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22482[] f5600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double[] f5601;

    public C1314(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f5601 = dArr;
        this.f5600 = new C22482[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C22482[] c22482Arr = this.f5600;
            if (i >= c22482Arr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (i4 == 2) {
                i2 = 2;
                i3 = 2;
            } else if (i4 == 3) {
                i2 = i2 == 1 ? 2 : 1;
                i3 = i2;
            }
            double d = dArr[i];
            int i5 = i + 1;
            double d2 = dArr[i5];
            double[] dArr3 = dArr2[i];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i5];
            c22482Arr[i] = new C22482(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4689(double d, double[] dArr) {
        C22482[] c22482Arr = this.f5600;
        double d2 = c22482Arr[0].f73388;
        if (d < d2) {
            d = d2;
        }
        if (d > c22482Arr[c22482Arr.length - 1].f73400) {
            d = c22482Arr[c22482Arr.length - 1].f73400;
        }
        for (int i = 0; i < c22482Arr.length; i++) {
            C22482 c22482 = c22482Arr[i];
            if (d <= c22482.f73400) {
                if (c22482.f73386) {
                    dArr[0] = c22482.m49985(d);
                    dArr[1] = c22482Arr[i].m49987(d);
                    return;
                }
                c22482.m49986(d);
                C22482 c22483 = c22482Arr[i];
                dArr[0] = (c22483.f73384 * c22483.f73398) + c22483.f73399;
                dArr[1] = (c22483.f73387 * c22483.f73394) + c22483.f73383;
                return;
            }
        }
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4690(double d, float[] fArr) {
        C22482[] c22482Arr = this.f5600;
        double d2 = c22482Arr[0].f73388;
        if (d < d2) {
            d = d2;
        } else if (d > c22482Arr[c22482Arr.length - 1].f73400) {
            d = c22482Arr[c22482Arr.length - 1].f73400;
        }
        for (int i = 0; i < c22482Arr.length; i++) {
            C22482 c22482 = c22482Arr[i];
            if (d <= c22482.f73400) {
                if (c22482.f73386) {
                    fArr[0] = (float) c22482.m49985(d);
                    fArr[1] = (float) c22482Arr[i].m49987(d);
                    return;
                }
                c22482.m49986(d);
                C22482 c22483 = c22482Arr[i];
                fArr[0] = (float) ((c22483.f73384 * c22483.f73398) + c22483.f73399);
                fArr[1] = (float) ((c22483.f73387 * c22483.f73394) + c22483.f73383);
                return;
            }
        }
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4693(double d, double[] dArr) {
        C22482[] c22482Arr = this.f5600;
        double d2 = c22482Arr[0].f73388;
        if (d < d2) {
            d = d2;
        } else if (d > c22482Arr[c22482Arr.length - 1].f73400) {
            d = c22482Arr[c22482Arr.length - 1].f73400;
        }
        for (int i = 0; i < c22482Arr.length; i++) {
            C22482 c22482 = c22482Arr[i];
            if (d <= c22482.f73400) {
                if (c22482.f73386) {
                    dArr[0] = c22482.f73399;
                    dArr[1] = c22482.f73383;
                    return;
                }
                c22482.m49986(d);
                dArr[0] = c22482Arr[i].m49984();
                C22482 c22483 = c22482Arr[i];
                double d3 = c22483.f73384 * c22483.f73394;
                double d4 = (-c22483.f73387) * c22483.f73398;
                double dHypot = c22483.f73391 / Math.hypot(d3, d4);
                dArr[1] = c22483.f73395 ? (-d4) * dHypot : d4 * dHypot;
                return;
            }
        }
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double mo4688(double d) {
        C22482[] c22482Arr = this.f5600;
        double d2 = c22482Arr[0].f73388;
        if (d < d2) {
            d = d2;
        } else if (d > c22482Arr[c22482Arr.length - 1].f73400) {
            d = c22482Arr[c22482Arr.length - 1].f73400;
        }
        for (int i = 0; i < c22482Arr.length; i++) {
            C22482 c22482 = c22482Arr[i];
            if (d <= c22482.f73400) {
                if (c22482.f73386) {
                    return c22482.m49985(d);
                }
                c22482.m49986(d);
                C22482 c22483 = c22482Arr[i];
                return (c22483.f73384 * c22483.f73398) + c22483.f73399;
            }
        }
        return Double.NaN;
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double mo4692(double d) {
        C22482[] c22482Arr = this.f5600;
        double d2 = c22482Arr[0].f73388;
        if (d < d2) {
            d = d2;
        }
        if (d > c22482Arr[c22482Arr.length - 1].f73400) {
            d = c22482Arr[c22482Arr.length - 1].f73400;
        }
        for (int i = 0; i < c22482Arr.length; i++) {
            C22482 c22482 = c22482Arr[i];
            if (d <= c22482.f73400) {
                if (!c22482.f73386) {
                    c22482.m49986(d);
                    return c22482Arr[i].m49984();
                }
                return c22482.f73399;
            }
        }
        return Double.NaN;
    }

    @Override // l.AbstractC4136
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double[] mo4691() {
        return this.f5601;
    }
}
