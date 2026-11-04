package l;

/* JADX INFO: renamed from: l.ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes5.dex */
public final class C16302 extends AbstractC3624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17794[] f52916;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double[] f52917;

    public C16302(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f52917 = dArr;
        this.f52916 = new C17794[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C17794[] c17794Arr = this.f52916;
            if (i >= c17794Arr.length) {
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
            c17794Arr[i] = new C17794(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final void mo11773(double d, double[] dArr) {
        C17794[] c17794Arr = this.f52916;
        double d2 = c17794Arr[0].f58394;
        if (d < d2) {
            d = d2;
        }
        if (d > c17794Arr[c17794Arr.length - 1].f58406) {
            d = c17794Arr[c17794Arr.length - 1].f58406;
        }
        for (int i = 0; i < c17794Arr.length; i++) {
            C17794 c17794 = c17794Arr[i];
            if (d <= c17794.f58406) {
                if (c17794.f58391) {
                    dArr[0] = c17794.m41649(d);
                    dArr[1] = c17794Arr[i].m41651(d);
                    return;
                }
                c17794.m41650(d);
                C17794 c17795 = c17794Arr[i];
                dArr[0] = (c17795.f58404 * c17795.f58400) + c17795.f58397;
                dArr[1] = (c17795.f58401 * c17795.f58399) + c17795.f58396;
                return;
            }
        }
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final void mo11774(double d, float[] fArr) {
        C17794[] c17794Arr = this.f52916;
        double d2 = c17794Arr[0].f58394;
        if (d < d2) {
            d = d2;
        } else if (d > c17794Arr[c17794Arr.length - 1].f58406) {
            d = c17794Arr[c17794Arr.length - 1].f58406;
        }
        for (int i = 0; i < c17794Arr.length; i++) {
            C17794 c17794 = c17794Arr[i];
            if (d <= c17794.f58406) {
                if (c17794.f58391) {
                    fArr[0] = (float) c17794.m41649(d);
                    fArr[1] = (float) c17794Arr[i].m41651(d);
                    return;
                }
                c17794.m41650(d);
                C17794 c17795 = c17794Arr[i];
                fArr[0] = (float) ((c17795.f58404 * c17795.f58400) + c17795.f58397);
                fArr[1] = (float) ((c17795.f58401 * c17795.f58399) + c17795.f58396);
                return;
            }
        }
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11777(double d, double[] dArr) {
        C17794[] c17794Arr = this.f52916;
        double d2 = c17794Arr[0].f58394;
        if (d < d2) {
            d = d2;
        } else if (d > c17794Arr[c17794Arr.length - 1].f58406) {
            d = c17794Arr[c17794Arr.length - 1].f58406;
        }
        for (int i = 0; i < c17794Arr.length; i++) {
            C17794 c17794 = c17794Arr[i];
            if (d <= c17794.f58406) {
                if (c17794.f58391) {
                    dArr[0] = c17794.f58397;
                    dArr[1] = c17794.f58396;
                    return;
                }
                c17794.m41650(d);
                dArr[0] = c17794Arr[i].m41648();
                C17794 c17795 = c17794Arr[i];
                double d3 = c17795.f58404 * c17795.f58399;
                double d4 = (-c17795.f58401) * c17795.f58400;
                double dHypot = c17795.f58393 / Math.hypot(d3, d4);
                dArr[1] = c17795.f58398 ? (-d4) * dHypot : d4 * dHypot;
                return;
            }
        }
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final double mo11772(double d) {
        C17794[] c17794Arr = this.f52916;
        double d2 = c17794Arr[0].f58394;
        if (d < d2) {
            d = d2;
        } else if (d > c17794Arr[c17794Arr.length - 1].f58406) {
            d = c17794Arr[c17794Arr.length - 1].f58406;
        }
        for (int i = 0; i < c17794Arr.length; i++) {
            C17794 c17794 = c17794Arr[i];
            if (d <= c17794.f58406) {
                if (c17794.f58391) {
                    return c17794.m41649(d);
                }
                c17794.m41650(d);
                C17794 c17795 = c17794Arr[i];
                return (c17795.f58404 * c17795.f58400) + c17795.f58397;
            }
        }
        return Double.NaN;
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ᩷ */
    public final double mo11776(double d) {
        C17794[] c17794Arr = this.f52916;
        double d2 = c17794Arr[0].f58394;
        if (d < d2) {
            d = d2;
        }
        if (d > c17794Arr[c17794Arr.length - 1].f58406) {
            d = c17794Arr[c17794Arr.length - 1].f58406;
        }
        for (int i = 0; i < c17794Arr.length; i++) {
            C17794 c17794 = c17794Arr[i];
            if (d <= c17794.f58406) {
                if (!c17794.f58391) {
                    c17794.m41650(d);
                    return c17794Arr[i].m41648();
                }
                return c17794.f58397;
            }
        }
        return Double.NaN;
    }

    @Override // l.AbstractC3624
    /* JADX INFO: renamed from: ۙ */
    public final double[] mo11775() {
        return this.f52917;
    }
}
