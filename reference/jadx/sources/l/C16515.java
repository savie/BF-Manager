package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: FA04 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16515 extends AbstractC17529 implements InterfaceC13381 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f53045;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int[] f53046;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f53047;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15810[] f53048;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f53049;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C16515(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601, 0);
        this.f53049 = new byte[16];
        this.f53047 = i;
        interfaceC10601.getClass();
        this.f53045 |= 1;
        C9895 c9895 = (C9895) interfaceC10601;
        Set setM38363 = EnumC16245.m38363(EnumC16245.m38361(EnumC16245.SMB202, c9895.m25058()), c9895.m25076());
        this.f53046 = new int[setM38363.size()];
        Iterator it = setM38363.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f53046[i2] = ((EnumC16245) it.next()).m38365();
            i2++;
        }
        if (c9895.m25076().m38366(EnumC16245.SMB210)) {
            byte[] bArrM25079 = c9895.m25079();
            byte[] bArr = this.f53049;
            System.arraycopy(bArrM25079, 0, bArr, 0, bArr.length);
        }
        LinkedList linkedList = new LinkedList();
        if (c9895.m25076() != null && c9895.m25076().m38366(EnumC16245.SMB311)) {
            byte[] bArr2 = new byte[32];
            c9895.m25061().nextBytes(bArr2);
            linkedList.add(new C0286(bArr2, new int[]{1}));
        }
        this.f53048 = (InterfaceC15810[]) linkedList.toArray(new InterfaceC15810[linkedList.size()]);
    }

    @Override // l.InterfaceC13381
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo18580() {
        return (this.f53047 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final int m38831() {
        return this.f53047;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m38832() {
        return this.f53045;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m38830() {
        return this.f53046;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m38833() {
        return this.f53049;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15810[] m38834() {
        return this.f53048;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C12282(interfaceC19067.mo29449());
    }

    @Override // l.InterfaceC3314
    public final int size() {
        int length = this.f53046.length * 2;
        int i = length % 8;
        int i2 = i - 4;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = i + 4;
            }
            length = (length + 8) - i2;
        }
        int iM31337 = length + 100;
        InterfaceC15810[] interfaceC15810Arr = this.f53048;
        if (interfaceC15810Arr != null) {
            for (InterfaceC15810 interfaceC15810 : interfaceC15810Arr) {
                iM31337 += AbstractC12591.m31337(interfaceC15810.size()) + 8;
            }
        }
        return AbstractC12591.m31337(iM31337);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(36L, i, bArr);
        int[] iArr = this.f53046;
        C4850.m13546(iArr.length, i + 2, bArr);
        C4850.m13546(this.f53047, i + 4, bArr);
        C4850.m13546(0L, i + 6, bArr);
        C4850.m13550(this.f53045, i + 8, bArr);
        System.arraycopy(this.f53049, 0, bArr, i + 12, 16);
        int i2 = i + 28;
        InterfaceC15810[] interfaceC15810Arr = this.f53048;
        if (interfaceC15810Arr == null || interfaceC15810Arr.length == 0) {
            C4850.m13548(0L, i2, bArr);
            i2 = 0;
        } else {
            C4850.m13546(interfaceC15810Arr.length, i + 32, bArr);
            C4850.m13546(0L, i + 34, bArr);
        }
        int i3 = i + 36;
        for (int i4 : iArr) {
            C4850.m13546(i4, i3, bArr);
            i3 += 2;
        }
        int iM31338 = i3 + m31338(i3);
        if (interfaceC15810Arr != null && interfaceC15810Arr.length != 0) {
            C4850.m13550(iM31338 - m31366(), i2, bArr);
            for (InterfaceC15810 interfaceC15810 : interfaceC15810Arr) {
                C4850.m13546(interfaceC15810.mo1804(), iM31338, bArr);
                int i5 = iM31338 + 2;
                C4850.m13550(0L, iM31338 + 4, bArr);
                int i6 = iM31338 + 8;
                int iM31337 = AbstractC12591.m31337(interfaceC15810.mo1806(i6, bArr));
                C4850.m13546(iM31337, i5, bArr);
                iM31338 = i6 + iM31337;
            }
        }
        return iM31338 - i;
    }
}
