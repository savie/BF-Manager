package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3460 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11952;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23598[] f11953 = new C23598[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f11954;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20614 f11955;

    public C3460(C20614 c20614) {
        this.f11955 = c20614;
        int i = 0;
        while (true) {
            C23598[] c23598Arr = this.f11953;
            if (i < c23598Arr.length) {
                c23598Arr[i] = new C23598();
                i++;
            } else {
                this.f11952 = 0;
                this.f11954 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23598 m11391(int i) throws C20199, C16138 {
        this.f11952--;
        int i2 = this.f11954;
        int i3 = i2 + 1;
        this.f11954 = i3;
        C23598[] c23598Arr = this.f11953;
        if (i3 == c23598Arr.length) {
            this.f11954 = 0;
        }
        C23598 c23598 = c23598Arr[i2];
        if (c23598.f76609 == i) {
            c23598.f76609 = 0;
            return c23598;
        }
        long j = C25227.FOREVER_NS;
        for (C23598 c23599 : c23598Arr) {
            if (c23599.f76609 != 0) {
                long j2 = c23599.f76610;
                if (j > j2) {
                    j = j2;
                }
            }
        }
        for (C23598 c235910 : c23598Arr) {
            if (c235910.f76609 == i) {
                c235910.f76609 = 0;
                C16138 c16138 = new C16138();
                c16138.f52424 = j;
                throw c16138;
            }
        }
        throw new C20199(4, C13645.m33382(i, "RequestQueue: unknown request id "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11392(C9866 c9866, C16884 c16884) throws IOException {
        int i = this.f11952;
        for (int i2 = 0; i2 < i; i2++) {
            C20614 c20614 = this.f11955;
            c20614.m47199(c9866, c16884);
            int i3 = c16884.f55231;
            int i4 = 0;
            while (true) {
                C23598[] c23598Arr = this.f11953;
                if (i4 >= c23598Arr.length) {
                    break;
                }
                C23598 c23598 = c23598Arr[i4];
                if (c23598.f76609 == c16884.f55233) {
                    c23598.f76609 = 0;
                    break;
                }
                i4++;
            }
            C20614.m47200(c20614, i3);
        }
        this.f11952 = 0;
        this.f11954 = 0;
    }
}
