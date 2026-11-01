package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A9XQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2402 extends AbstractC6240 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22180[] f9660;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final byte f9661;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    public C2402(InterfaceC10601 interfaceC10601, byte b) {
        super(interfaceC10601);
        this.f9661 = b;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22180[] m7328() {
        return this.f9660;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        if (C4850.m13545(i, bArr) != 9) {
            throw new C2796("Expected structureSize = 9");
        }
        int iM31366 = m31366() + C4850.m13545(i + 2, bArr);
        int iM13549 = C4850.m13549(i + 4, bArr);
        int i2 = i + 8;
        ArrayList arrayList = new ArrayList();
        do {
            C10559 c10559 = this.f9661 == 3 ? new C10559(m31354(), true) : null;
            if (c10559 != null) {
                c10559.mo1805(i2, iM13549, bArr);
                arrayList.add(c10559);
                int iM26712 = c10559.m26712();
                if (iM26712 <= 0) {
                    break;
                }
                i2 += iM26712;
            } else {
                break;
            }
        } while (i2 < iM31366 + iM13549);
        this.f9660 = (InterfaceC22180[]) arrayList.toArray(new InterfaceC22180[arrayList.size()]);
        return i2 - i;
    }
}
