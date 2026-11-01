package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2908 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4670 f10955;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10956;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9260[] f10957 = new C9260[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10958;

    public C2908(C4670 c4670) {
        this.f10955 = c4670;
        int i = 0;
        while (true) {
            C9260[] c9260Arr = this.f10957;
            if (i < c9260Arr.length) {
                c9260Arr[i] = new C9260();
                i++;
            } else {
                this.f10956 = 0;
                this.f10958 = 0;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9260 m8714(int i) throws C1497, C12019 {
        this.f10956--;
        int i2 = this.f10958;
        int i3 = i2 + 1;
        this.f10958 = i3;
        C9260[] c9260Arr = this.f10957;
        if (i3 == c9260Arr.length) {
            this.f10958 = 0;
        }
        C9260 c9260 = c9260Arr[i2];
        if (c9260.f31481 == i) {
            c9260.f31481 = 0;
            return c9260;
        }
        long j = C17492.FOREVER_NS;
        for (C9260 c9261 : c9260Arr) {
            if (c9261.f31481 != 0) {
                long j2 = c9261.f31482;
                if (j > j2) {
                    j = j2;
                }
            }
        }
        for (C9260 c9262 : c9260Arr) {
            if (c9262.f31481 == i) {
                c9262.f31481 = 0;
                C1497 c1497 = new C1497();
                c1497.f6051 = j;
                throw c1497;
            }
        }
        throw new C12019(4, C8479.m22141(i, "RequestQueue: unknown request id "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8715(C14904 c14904, C23371 c23371) throws IOException {
        int i = this.f10956;
        for (int i2 = 0; i2 < i; i2++) {
            C4670 c4670 = this.f10955;
            c4670.m12908(c14904, c23371);
            int i3 = c23371.f75717;
            int i4 = 0;
            while (true) {
                C9260[] c9260Arr = this.f10957;
                if (i4 >= c9260Arr.length) {
                    break;
                }
                C9260 c9260 = c9260Arr[i4];
                if (c9260.f31481 == c23371.f75719) {
                    c9260.f31481 = 0;
                    break;
                }
                i4++;
            }
            C4670.m12900(c4670, i3);
        }
        this.f10956 = 0;
        this.f10958 = 0;
    }
}
