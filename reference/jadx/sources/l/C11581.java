package l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ۨ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11581 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Inflater f38938;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f38939 = new C2460();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2460 f38940 = new C2460();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13698 f38941 = new C13698();

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        C2460 c2460 = this.f38939;
        c2460.m7508(i2 + i, bArr);
        c2460.m7510(i);
        if (this.f38938 == null) {
            this.f38938 = new Inflater();
        }
        Inflater inflater = this.f38938;
        String str = C17983.f57504;
        if (c2460.m7503() > 0 && c2460.m7534() == 120) {
            C2460 c2461 = this.f38940;
            if (C17983.m41843(c2460, c2461, inflater)) {
                c2460.m7508(c2461.m7509(), c2461.m7518());
            }
        }
        C13698 c13698 = this.f38941;
        c13698.m33404();
        ArrayList arrayList = new ArrayList();
        while (c2460.m7503() >= 3) {
            int iM7509 = c2460.m7509();
            int iM7516 = c2460.m7516();
            int iM7519 = c2460.m7519();
            int iM7500 = c2460.m7500() + iM7519;
            C0612 c0612 = null;
            if (iM7500 > iM7509) {
                c2460.m7510(iM7509);
            } else {
                if (iM7516 != 128) {
                    switch (iM7516) {
                        case 20:
                            C13698.m33401(c13698, c2460, iM7519);
                            break;
                        case 21:
                            C13698.m33400(c13698, c2460, iM7519);
                            break;
                        case 22:
                            C13698.m33402(c13698, c2460, iM7519);
                            break;
                    }
                } else {
                    C0612 c0612M33403 = c13698.m33403();
                    c13698.m33404();
                    c0612 = c0612M33403;
                }
                c2460.m7510(iM7500);
            }
            if (c0612 != null) {
                arrayList.add(c0612);
            }
        }
        interfaceC1008.accept(new C17513(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
