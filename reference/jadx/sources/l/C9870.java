package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A9XQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9870 extends AbstractC12108 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC9627[] f31764;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final byte f31765;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C9870(InterfaceC5878 interfaceC5878, byte b) {
        super(interfaceC5878);
        this.f31765 = b;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9627[] m25686() {
        return this.f31764;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        if (C0481.m2318(i, bArr) != 9) {
            throw new C19061("Expected structureSize = 9");
        }
        int iM10327 = m10327() + C0481.m2318(i + 2, bArr);
        int iM2322 = C0481.m2322(i + 4, bArr);
        int i2 = i + 8;
        ArrayList arrayList = new ArrayList();
        do {
            C1734 c1734 = this.f31765 == 3 ? new C1734(m10321(), true) : null;
            if (c1734 != null) {
                c1734.mo6138(i2, iM2322, bArr);
                arrayList.add(c1734);
                int iM6141 = c1734.m6141();
                if (iM6141 <= 0) {
                    break;
                }
                i2 += iM6141;
            } else {
                break;
            }
        } while (i2 < iM10327 + iM2322);
        this.f31764 = (InterfaceC9627[]) arrayList.toArray(new InterfaceC9627[arrayList.size()]);
        return i2 - i;
    }
}
