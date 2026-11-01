package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24MP */
/* JADX INFO: loaded from: classes3.dex */
public final class C1493 extends AbstractC22702 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6783 f6028;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2549[] f6029;

    public C1493(AbstractC20745 abstractC20745) {
        this(abstractC20745.m46727());
    }

    public C1493(InputStream inputStream) {
        this(new C12429(C19431.m44470(inputStream, 0)));
    }

    public C1493(byte[] bArr) {
        this(new C12429(bArr));
    }

    public C1493(C12429 c12429) throws Exception {
        int i;
        C23718 c23718M30888 = c12429.m30888(C4356.m12196(c12429.m30888(0)).f15587);
        while (c23718M30888.m52227() >= 8) {
            C4356 c4356M12196 = C4356.m12196(c23718M30888);
            int i2 = c4356M12196.f15585;
            if (c4356M12196.f15584 == 1) {
                c23718M30888.m52226(-8);
                break;
            }
            int i3 = c4356M12196.f15587;
            if (i3 < 8 || i2 < i3 || (i = i2 - 8) > c23718M30888.m52227()) {
                throw new IOException("Invalid chunk size before string pool at offset " + c4356M12196.f15586);
            }
            c23718M30888.m52226(i);
        }
        this.f6028 = new C6783(c23718M30888);
        this.f73941 = C9566.m24422(c12429, c23718M30888.m52234());
        int iM30896 = c12429.m30896(8);
        iM30896 = iM30896 < 0 ? 10 : iM30896;
        ArrayList arrayList = new ArrayList(iM30896);
        for (int i4 = 0; i4 < iM30896; i4++) {
            try {
                arrayList.add(new C2549(this, c23718M30888));
            } catch (Exception e) {
                if (i4 == 0) {
                    throw e;
                }
                if (c23718M30888.m52227() <= 0) {
                    this.f6029 = (C2549[]) arrayList.toArray(new C2549[0]);
                }
            }
        }
        this.f6029 = (C2549[]) arrayList.toArray(new C2549[0]);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m5142() {
        this.f6028.m18389();
        for (C2549 c2549 : this.f6029) {
            c2549.f10090.m18389();
        }
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5727 mo5139() {
        return this.f6028;
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ֨ܰ */
    public final C6783 mo5139() {
        return this.f6028;
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int mo5141() {
        return this.f6029.length;
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17721 mo5140(int i) {
        return this.f6029[i];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m5143() {
        C22785 c22785M50438 = C22785.m50438();
        for (C2549 c2549 : this.f6029) {
            c22785M50438.m50439(c2549.mo19106(), c2549.getPackageName());
        }
    }
}
