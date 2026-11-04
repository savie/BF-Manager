package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FIQP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8396 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f27510;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13616 f27511;

    public C8396(C13616 c13616) {
        this.f27511 = c13616;
        C4933 c4933 = c13616.f43256;
        this.f27510 = c4933 == null ? 0 : c4933.f17198;
    }

    public final C9141 get(int i) {
        C4933 c4933 = this.f27511.f43256;
        if (i < 0) {
            c4933.getClass();
        } else if (i < c4933.f17198) {
            int i2 = 0;
            int i3 = 0;
            long j = 0;
            while (true) {
                C4933 c4934 = c4933.f17200;
                if (c4934 != null) {
                    int i4 = c4934.f17198;
                    if (i < i4) {
                        c4933 = c4934;
                    } else {
                        i -= i4;
                        i2 += c4934.f17199;
                        i3 += c4934.f17204;
                        j += c4934.f17208;
                        c4933 = c4933.f17202;
                    }
                } else {
                    return new C9141(c4933.f17195, i2, i3, c4933.f17199, c4933.f17204, j, c4933.f17201);
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2430(this);
    }
}
