package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA04 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23602 extends AbstractC20313 implements InterfaceC2653 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f76614;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f76615;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int[] f76616;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16888[] f76617;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f76618;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) {
        return 0;
    }

    public C23602(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878, 0);
        this.f76618 = new byte[16];
        this.f76615 = i;
        interfaceC5878.getClass();
        this.f76614 |= 1;
        C14826 c14826 = (C14826) interfaceC5878;
        Set setM56402 = EnumC25270.m56402(EnumC25270.m56401(EnumC25270.SMB202, c14826.m35720()), c14826.m35734());
        this.f76616 = new int[setM56402.size()];
        Iterator it = setM56402.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f76616[i2] = ((EnumC25270) it.next()).m56405();
            i2++;
        }
        if (c14826.m35734().m56406(EnumC25270.SMB210)) {
            byte[] bArrM35729 = c14826.m35729();
            byte[] bArr = this.f76618;
            System.arraycopy(bArrM35729, 0, bArr, 0, bArr.length);
        }
        LinkedList linkedList = new LinkedList();
        if (c14826.m35734() != null && c14826.m35734().m56406(EnumC25270.SMB311)) {
            byte[] bArr2 = new byte[32];
            c14826.m35699().nextBytes(bArr2);
            linkedList.add(new C16142(bArr2, new int[]{1}));
        }
        this.f76617 = (InterfaceC16888[]) linkedList.toArray(new InterfaceC16888[linkedList.size()]);
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int m52845() {
        return this.f76615;
    }

    @Override // l.InterfaceC2653
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo8797() {
        return (this.f76615 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m52846() {
        return this.f76614;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int[] m52844() {
        return this.f76616;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m52848() {
        return this.f76618;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16888[] m52847() {
        return this.f76617;
    }

    @Override // l.AbstractC20313
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12108 mo1465(InterfaceC23032 interfaceC23032) {
        return new C3464(interfaceC23032.mo2875());
    }

    @Override // l.InterfaceC21299
    public final int size() {
        int length = this.f76616.length * 2;
        int i = length % 8;
        int i2 = i - 4;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = i + 4;
            }
            length = (length + 8) - i2;
        }
        int iM10300 = length + 100;
        InterfaceC16888[] interfaceC16888Arr = this.f76617;
        if (interfaceC16888Arr != null) {
            for (InterfaceC16888 interfaceC16888 : interfaceC16888Arr) {
                iM10300 += AbstractC3159.m10300(interfaceC16888.size()) + 8;
            }
        }
        return AbstractC3159.m10300(iM10300);
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        C0481.m2319(36L, i, bArr);
        int[] iArr = this.f76616;
        C0481.m2319(iArr.length, i + 2, bArr);
        C0481.m2319(this.f76615, i + 4, bArr);
        C0481.m2319(0L, i + 6, bArr);
        C0481.m2323(this.f76614, i + 8, bArr);
        System.arraycopy(this.f76618, 0, bArr, i + 12, 16);
        int i2 = i + 28;
        InterfaceC16888[] interfaceC16888Arr = this.f76617;
        if (interfaceC16888Arr == null || interfaceC16888Arr.length == 0) {
            C0481.m2321(0L, i2, bArr);
            i2 = 0;
        } else {
            C0481.m2319(interfaceC16888Arr.length, i + 32, bArr);
            C0481.m2319(0L, i + 34, bArr);
        }
        int i3 = i + 36;
        for (int i4 : iArr) {
            C0481.m2319(i4, i3, bArr);
            i3 += 2;
        }
        int iM10324 = i3 + m10324(i3);
        if (interfaceC16888Arr != null && interfaceC16888Arr.length != 0) {
            C0481.m2323(iM10324 - m10327(), i2, bArr);
            for (InterfaceC16888 interfaceC16888 : interfaceC16888Arr) {
                C0481.m2319(interfaceC16888.mo38322(), iM10324, bArr);
                int i5 = iM10324 + 2;
                C0481.m2323(0L, iM10324 + 4, bArr);
                int i6 = iM10324 + 8;
                int iM10300 = AbstractC3159.m10300(interfaceC16888.mo10573(i6, bArr));
                C0481.m2319(iM10300, i5, bArr);
                iM10324 = i6 + iM10300;
            }
        }
        return iM10324 - i;
    }
}
