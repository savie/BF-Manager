package l;

import bin.mt.plus.Features;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۛۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5809 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f19728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f19729;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short f19730;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f19731;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f19732;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String[] f19733;

    public C5809(C12160 c12160, int i) {
        C15688 c15688;
        int i2 = c12160.f40698;
        c12160.f40698 = i;
        int iM30246 = c12160.m30246() - 2;
        this.f19730 = c12160.m30248();
        if (C16393.f52749 != null) {
            Object[] objArrAnalyze = Features.analyze(c12160.m30247(iM30246));
            int i3 = 0;
            byte[] bArr = (byte[]) objArrAnalyze[0];
            byte[] bArr2 = (byte[]) objArrAnalyze[1];
            byte[] bArr3 = (byte[]) objArrAnalyze[2];
            byte[] bArr4 = (byte[]) objArrAnalyze[3];
            int length = bArr3.length / 10;
            int[] iArr = new int[length];
            int[] iArr2 = new int[length];
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr4);
            int i4 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
            String[] strArr = new String[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
                byte[] bArr5 = new byte[i6];
                byteArrayInputStream.read(bArr5, i3, i6);
                strArr[i5] = new String(bArr5, StandardCharsets.UTF_8);
                i5++;
                i3 = 0;
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr3);
            for (int i7 = 0; i7 < length; i7++) {
                byteArrayInputStream2.skip(2L);
                iArr[i7] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
                iArr2[i7] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
            }
            c15688 = new C15688(bArr2, bArr, iArr, iArr2, strArr);
        } else {
            c15688 = new C15688(new C19921(c12160.m30247(iM30246)));
        }
        this.f19732 = c15688.f50933;
        this.f19729 = c15688.f50930;
        this.f19731 = c15688.f50932;
        this.f19728 = c15688.f50929;
        this.f19733 = c15688.f50931;
        c12160.f40698 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15990(C0164 c0164, boolean z) {
        C17098 c17098 = new C17098(this, c0164, z);
        while (true) {
            int i = c17098.f54559;
            c17098.f54559 = i + 1;
            byte b = this.f19732[i];
            byte[] bArr = this.f19729;
            int[] iArr = this.f19728;
            int[] iArr2 = this.f19731;
            C5809 c5809 = c17098.f54561;
            C14277[] c14277Arr = c17098.f54556;
            C14277[] c14277Arr2 = c17098.f54560;
            C15313 c15313 = c17098.f54558;
            switch (b) {
                case 0:
                    short sM39918 = c17098.m39918();
                    C14277 c14277 = (C14277) c15313.m36671();
                    c14277Arr[sM39918] = c14277;
                    c14277.f46795 = false;
                    break;
                case 1:
                    C14277 c14278 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34479(c14278);
                    if (c14278.f46795) {
                        c14278.m34499();
                        c17098.f54555 = c14278;
                    }
                    break;
                case 2:
                    int iM39917 = c17098.m39917();
                    if (!((C14277) c15313.m36671()).m34485()) {
                        c17098.f54557 = iArr2[iM39917];
                        c17098.f54559 = iArr[iM39917];
                    } else if (c17098.f54555 == null) {
                        C14277 c14279 = (C14277) c15313.m36673();
                        if (c14279.f46795) {
                            c14279.m34499();
                            c17098.f54555 = c14279;
                        }
                    } else {
                        c15313.m36673();
                    }
                    break;
                case 3:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142710 = (C14277) c15313.m36671();
                        c142710.m34453(c142710);
                    } else {
                        C14277 c142711 = (C14277) c15313.m36673();
                        C14277 c142712 = c17098.f54555;
                        if (c142712 == null) {
                            c142712 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142711.m34453(c142712);
                        c15313.m36672(c142712);
                    }
                    break;
                case 4:
                    C14277 c142713 = c17098.f54555;
                    if (c142713 == null) {
                        c142713 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142714 = (C14277) c15313.m36673();
                    C14277 c142715 = (C14277) c15313.m36673();
                    c142715.m34510(c142714, c142713);
                    c15313.m36672(c142713);
                    if (c142715.f46795) {
                        c142715.m34499();
                        c17098.f54555 = c142715;
                    } else if (c142714.f46795) {
                        c142714.m34499();
                        c17098.f54555 = c142714;
                    }
                    break;
                case 5:
                    int iM34486 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142716 = c17098.f54555;
                    if (c142716 == null) {
                        c142716 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142716.m34465(new long[iM34486]);
                    c15313.m36672(c142716);
                    break;
                case 6:
                    int i2 = c17098.f54557;
                    int i3 = i2 + 1;
                    c17098.f54557 = i3;
                    if (bArr[i2] == 0) {
                        int iM1310 = c0164.m1310(new String(bArr, i3, 32));
                        int i4 = c17098.f54557;
                        bArr[i4 - 1] = 1;
                        bArr[i4] = (byte) (iM1310 & 255);
                        bArr[i4 + 1] = (byte) ((iM1310 >>> 8) & 255);
                        bArr[i4 + 2] = (byte) ((iM1310 >>> 16) & 255);
                        bArr[i4 + 3] = (byte) ((iM1310 >>> 24) & 255);
                    }
                    c0164.m1311(c17098.m39917());
                    c17098.f54557 += 28;
                    break;
                case 7:
                    int iM34487 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142717 = c17098.f54555;
                    if (c142717 == null) {
                        c142717 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142717.m34465(new int[iM34487]);
                    c15313.m36672(c142717);
                    break;
                case 8:
                    C14277 c142718 = c17098.f54555;
                    if (c142718 == null) {
                        c142718 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    byte[] bArr2 = c5809.f19729;
                    int i5 = c17098.f54557;
                    c17098.f54557 = i5 + 1;
                    c142718.m34471(bArr2[i5] != 0);
                    c15313.m36672(c142718);
                    break;
                case 9:
                    int iM34488 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142719 = c17098.f54555;
                    if (c142719 == null) {
                        c142719 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142719.m34465(new String[iM34488]);
                    c15313.m36672(c142719);
                    break;
                case 10:
                    C14277 c142720 = c17098.f54555;
                    if (c142720 == null) {
                        c142720 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    int i6 = (c5809.f19729[c17098.f54557 + 1] & 255) << 8;
                    byte[] bArr3 = c5809.f19729;
                    int i7 = c17098.f54557;
                    char c = (char) (i6 | (bArr3[i7] & 255));
                    c17098.f54557 = i7 + 2;
                    c142720.m34460(c);
                    c15313.m36672(c142720);
                    break;
                case 11:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142721 = (C14277) c15313.m36671();
                        c142721.m34476(c142721);
                    } else {
                        C14277 c142722 = (C14277) c15313.m36673();
                        C14277 c142723 = c17098.f54555;
                        if (c142723 == null) {
                            c142723 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142722.m34476(c142723);
                        c15313.m36672(c142723);
                    }
                    break;
                case 12:
                    C14277 c142724 = c17098.f54555;
                    if (c142724 == null) {
                        c142724 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142725 = (C14277) c15313.m36673();
                    C14277 c142726 = (C14277) c15313.m36673();
                    c142726.m34477(c142725, c142724);
                    c15313.m36672(c142724);
                    if (c142726.f46795) {
                        c142726.m34499();
                        c17098.f54555 = c142726;
                    } else if (c142725.f46795) {
                        c142725.m34499();
                        c17098.f54555 = c142725;
                    }
                    break;
                case 13:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142727 = (C14277) c15313.m36671();
                        c142727.m34473(c142727);
                    } else {
                        C14277 c142728 = (C14277) c15313.m36673();
                        C14277 c142729 = c17098.f54555;
                        if (c142729 == null) {
                            c142729 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142728.m34473(c142729);
                        c15313.m36672(c142729);
                    }
                    break;
                case 14:
                    C14277 c142730 = c17098.f54555;
                    if (c142730 == null) {
                        c142730 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142730.m34463(c17098.m39917());
                    c15313.m36672(c142730);
                    break;
                case 15:
                    int iM34489 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142731 = c17098.f54555;
                    if (c142731 == null) {
                        c142731 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142731.m34465(new boolean[iM34489]);
                    c15313.m36672(c142731);
                    break;
                case 16:
                    C14277 c142732 = c17098.f54555;
                    if (c142732 == null) {
                        c142732 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142733 = (C14277) c15313.m36673();
                    c142733.m34496(c142732);
                    c15313.m36672(c142732);
                    if (c142733.f46795) {
                        c142733.m34499();
                        c17098.f54555 = c142733;
                    }
                    break;
                case 17:
                    c15313.m36672(c14277Arr2[c17098.m39918()]);
                    break;
                case 18:
                    int iM39918 = c17098.m39917();
                    c17098.f54557 = iArr2[iM39918];
                    c17098.f54559 = iArr[iM39918];
                    break;
                case 19:
                    int iM344810 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142734 = c17098.f54555;
                    if (c142734 == null) {
                        c142734 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142734.m34465(new float[iM344810]);
                    c15313.m36672(c142734);
                    break;
                case 20:
                    C14277 c142735 = c17098.f54555;
                    if (c142735 == null) {
                        c142735 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142736 = (C14277) c15313.m36673();
                    C14277 c142737 = (C14277) c15313.m36673();
                    c142737.m34480(c142736, c142735);
                    c15313.m36672(c142735);
                    if (c142737.f46795) {
                        c142737.m34499();
                        c17098.f54555 = c142737;
                    } else if (c142736.f46795) {
                        c142736.m34499();
                        c17098.f54555 = c142736;
                    }
                    break;
                case 21:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142738 = (C14277) c15313.m36671();
                        c142738.m34483(c142738);
                    } else {
                        C14277 c142739 = (C14277) c15313.m36673();
                        C14277 c142740 = c17098.f54555;
                        if (c142740 == null) {
                            c142740 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142739.m34483(c142740);
                        c15313.m36672(c142740);
                    }
                    break;
                case 22:
                    C14277 c142741 = c17098.f54555;
                    if (c142741 == null) {
                        c142741 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c14277Arr[c17098.m39918()].m34468(c142741, ((C14277) c15313.m36673()).m34486());
                    c15313.m36672(c142741);
                    break;
                case 23:
                    C14277 c142742 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34502(c142742);
                    if (c142742.f46795) {
                        c142742.m34499();
                        c17098.f54555 = c142742;
                    }
                    break;
                case 24:
                    int i8 = c17098.f54557;
                    int i9 = i8 + 1;
                    c17098.f54557 = i9;
                    if (bArr[i8] == 0) {
                        int iM1312 = c0164.m1312(new String(bArr, i9, 32));
                        int i10 = c17098.f54557;
                        bArr[i10 - 1] = 1;
                        bArr[i10] = (byte) (iM1312 & 255);
                        bArr[i10 + 1] = (byte) ((iM1312 >>> 8) & 255);
                        bArr[i10 + 2] = (byte) ((iM1312 >>> 16) & 255);
                        bArr[i10 + 3] = (byte) ((iM1312 >>> 24) & 255);
                    }
                    c0164.m1313(c17098.m39917());
                    c17098.f54557 += 28;
                    break;
                case 25:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142743 = (C14277) c15313.m36671();
                        c142743.m34509(c142743);
                    } else {
                        C14277 c142744 = (C14277) c15313.m36673();
                        C14277 c142745 = c17098.f54555;
                        if (c142745 == null) {
                            c142745 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142744.m34509(c142745);
                        c15313.m36672(c142745);
                    }
                    break;
                case 26:
                    c15313.m36673();
                    break;
                case 27:
                    int iM344811 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142746 = c17098.f54555;
                    if (c142746 == null) {
                        c142746 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142746.m34465(new char[iM344811]);
                    c15313.m36672(c142746);
                    break;
                case 28:
                    C14277 c142747 = c17098.f54555;
                    if (c142747 == null) {
                        c142747 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142748 = (C14277) c15313.m36673();
                    C14277 c142749 = (C14277) c15313.m36673();
                    c142749.m34454(c142748, c142747);
                    c15313.m36672(c142747);
                    if (c142749.f46795) {
                        c142749.m34499();
                        c17098.f54555 = c142749;
                    } else if (c142748.f46795) {
                        c142748.m34499();
                        c17098.f54555 = c142748;
                    }
                    break;
                case 29:
                    c14277Arr2[c17098.m39918()].m34505();
                    break;
                case 30:
                    C14277 c142750 = c17098.f54555;
                    if (c142750 == null) {
                        c142750 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142751 = (C14277) c15313.m36673();
                    C14277 c142752 = (C14277) c15313.m36673();
                    c142752.m34513(c142751, c142750);
                    c15313.m36672(c142750);
                    if (c142752.f46795) {
                        c142752.m34499();
                        c17098.f54555 = c142752;
                    } else if (c142751.f46795) {
                        c142751.m34499();
                        c17098.f54555 = c142751;
                    }
                    break;
                case 31:
                    C14277 c142753 = c17098.f54555;
                    if (c142753 == null) {
                        c142753 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142753.m34462(Float.intBitsToFloat(c17098.m39917()));
                    c15313.m36672(c142753);
                    break;
                case 32:
                    int iM39919 = c17098.m39917();
                    if (((C14277) c15313.m36671()).m34485()) {
                        c17098.f54557 = iArr2[iM39919];
                        c17098.f54559 = iArr[iM39919];
                    } else if (c17098.f54555 == null) {
                        C14277 c142754 = (C14277) c15313.m36673();
                        if (c142754.f46795) {
                            c142754.m34499();
                            c17098.f54555 = c142754;
                        }
                    } else {
                        c15313.m36673();
                    }
                    break;
                case 33:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142755 = (C14277) c15313.m36671();
                        c142755.m34487(c142755);
                    } else {
                        C14277 c142756 = (C14277) c15313.m36673();
                        C14277 c142757 = c17098.f54555;
                        if (c142757 == null) {
                            c142757 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142756.m34487(c142757);
                        c15313.m36672(c142757);
                    }
                    break;
                case 34:
                    C14277 c142758 = c17098.f54555;
                    if (c142758 == null) {
                        c142758 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142759 = (C14277) c15313.m36673();
                    c142759.m34506(c142758);
                    c15313.m36672(c142758);
                    if (c142759.f46795) {
                        c142759.m34499();
                        c17098.f54555 = c142759;
                    }
                    break;
                case 35:
                    int iM344812 = ((C14277) c15313.m36673()).m34486();
                    C14277 c142760 = c17098.f54555;
                    if (c142760 == null) {
                        c142760 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142760.m34465(new double[iM344812]);
                    c15313.m36672(c142760);
                    break;
                case 36:
                    C14277 c142761 = c17098.f54555;
                    if (c142761 == null) {
                        c142761 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142761.m34463(c14277Arr[c17098.m39918()].m34489());
                    c15313.m36672(c142761);
                    break;
                case 37:
                    c14277Arr2[c17098.m39918()].m34458();
                    break;
                case 38:
                    C14277 c142762 = c17098.f54555;
                    if (c142762 == null) {
                        c142762 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142763 = (C14277) c15313.m36673();
                    C14277 c142764 = (C14277) c15313.m36673();
                    c142764.m34492(c142763, c142762);
                    c15313.m36672(c142762);
                    if (c142764.f46795) {
                        c142764.m34499();
                        c17098.f54555 = c142764;
                    } else if (c142763.f46795) {
                        c142763.m34499();
                        c17098.f54555 = c142763;
                    }
                    break;
                case 39:
                    C14277 c142765 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34512(c142765);
                    if (c142765.f46795) {
                        c142765.m34499();
                        c17098.f54555 = c142765;
                    }
                    break;
                case 40:
                    c14277Arr[c17098.m39918()].m34505();
                    break;
                case 41:
                    C14277 c142766 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34500(c142766);
                    if (c142766.f46795) {
                        c142766.m34499();
                        c17098.f54555 = c142766;
                    }
                    break;
                case 42:
                    C14277 c142767 = c17098.f54555;
                    if (c142767 == null) {
                        c142767 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142768 = (C14277) c15313.m36673();
                    C14277 c142769 = (C14277) c15313.m36673();
                    c142769.m34469(c142768, c142767);
                    c15313.m36672(c142767);
                    if (c142769.f46795) {
                        c142769.m34499();
                        c17098.f54555 = c142769;
                    } else if (c142768.f46795) {
                        c142768.m34499();
                        c17098.f54555 = c142768;
                    }
                    break;
                case 43:
                    C14277 c142770 = c17098.f54555;
                    if (c142770 == null) {
                        c142770 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142770.m34466(this.f19733[c17098.m39917()]);
                    c15313.m36672(c142770);
                    break;
                case 44:
                    C14277 c142771 = c17098.f54555;
                    if (c142771 == null) {
                        c142771 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142772 = (C14277) c15313.m36673();
                    C14277 c142773 = (C14277) c15313.m36673();
                    c142773.m34495(c142772, c142771);
                    c15313.m36672(c142771);
                    if (c142773.f46795) {
                        c142773.m34499();
                        c17098.f54555 = c142773;
                    } else if (c142772.f46795) {
                        c142772.m34499();
                        c17098.f54555 = c142772;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C14277 c142774 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34481(c142774);
                    if (c142774.f46795) {
                        c142774.m34499();
                        c17098.f54555 = c142774;
                    }
                    break;
                case 46:
                    return;
                case 47:
                    short sM39919 = c17098.m39918();
                    C14277 c142775 = (C14277) c15313.m36671();
                    c14277Arr2[sM39919] = c142775;
                    c142775.f46795 = false;
                    break;
                case 48:
                    C14277 c142776 = c17098.f54555;
                    if (c142776 == null) {
                        c142776 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142777 = (C14277) c15313.m36673();
                    C14277 c142778 = (C14277) c15313.m36673();
                    c142778.m34474(c142777, c142776);
                    c15313.m36672(c142776);
                    if (c142778.f46795) {
                        c142778.m34499();
                        c17098.f54555 = c142778;
                    } else if (c142777.f46795) {
                        c142777.m34499();
                        c17098.f54555 = c142777;
                    }
                    break;
                case 49:
                    short sM399110 = c17098.m39918();
                    C14277 c142779 = (C14277) c15313.m36673();
                    c14277Arr2[sM399110] = c142779;
                    c142779.f46795 = false;
                    break;
                case 50:
                    if (((C14277) c15313.m36673()).m34485()) {
                        int iM399110 = c17098.m39917();
                        c17098.f54557 = iArr2[iM399110];
                        c17098.f54559 = iArr[iM399110];
                    } else {
                        c17098.f54557 += 4;
                    }
                    break;
                case 51:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c142780 = (C14277) c15313.m36671();
                        c142780.m34450(c142780);
                    } else {
                        C14277 c142781 = (C14277) c15313.m36673();
                        C14277 c142782 = c17098.f54555;
                        if (c142782 == null) {
                            c142782 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c142781.m34450(c142782);
                        c15313.m36672(c142782);
                    }
                    break;
                case 52:
                    if (!((C14277) c15313.m36673()).m34485()) {
                        int iM399111 = c17098.m39917();
                        c17098.f54557 = iArr2[iM399111];
                        c17098.f54559 = iArr[iM399111];
                    } else {
                        c17098.f54557 += 4;
                    }
                    break;
                case 53:
                    C14277 c142783 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34494(c142783);
                    if (c142783.f46795) {
                        c142783.m34499();
                        c17098.f54555 = c142783;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    C14277 c142784 = c17098.f54555;
                    if (c142784 == null) {
                        c142784 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142785 = (C14277) c15313.m36673();
                    C14277 c142786 = (C14277) c15313.m36673();
                    c142786.m34451(c142785, c142784);
                    c15313.m36672(c142784);
                    if (c142786.f46795) {
                        c142786.m34499();
                        c17098.f54555 = c142786;
                    } else if (c142785.f46795) {
                        c142785.m34499();
                        c17098.f54555 = c142785;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    C14277 c142787 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34467(c142787);
                    if (c142787.f46795) {
                        c142787.m34499();
                        c17098.f54555 = c142787;
                    }
                    break;
                case 56:
                    C14277 c142788 = c17098.f54555;
                    if (c142788 == null) {
                        c142788 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142789 = (C14277) c15313.m36673();
                    C14277 c142790 = (C14277) c15313.m36673();
                    c142790.m34501(c142789, c142788);
                    c15313.m36672(c142788);
                    if (c142790.f46795) {
                        c142790.m34499();
                        c17098.f54555 = c142790;
                    } else if (c142789.f46795) {
                        c142789.m34499();
                        c17098.f54555 = c142789;
                    }
                    break;
                case 57:
                    C14277 c142791 = c17098.f54555;
                    if (c142791 == null) {
                        c142791 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c14277Arr2[c17098.m39918()].m34468(c142791, ((C14277) c15313.m36673()).m34486());
                    c15313.m36672(c142791);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    C14277 c142792 = c17098.f54555;
                    if (c142792 == null) {
                        c142792 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142793 = (C14277) c15313.m36673();
                    C14277 c142794 = (C14277) c15313.m36673();
                    c142794.m34484(c142793, c142792);
                    c15313.m36672(c142792);
                    if (c142794.f46795) {
                        c142794.m34499();
                        c17098.f54555 = c142794;
                    } else if (c142793.f46795) {
                        c142793.m34499();
                        c17098.f54555 = c142793;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    C14277 c142795 = c17098.f54555;
                    if (c142795 == null) {
                        c142795 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c142795.m34461(Double.longBitsToDouble(c17098.m39919()));
                    c15313.m36672(c142795);
                    break;
                case 60:
                    C14277 c142796 = c17098.f54555;
                    if (c142796 == null) {
                        c142796 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c142797 = (C14277) c15313.m36673();
                    C14277 c142798 = (C14277) c15313.m36673();
                    c142798.m34497(c142797, c142796);
                    c15313.m36672(c142796);
                    if (c142798.f46795) {
                        c142798.m34499();
                        c17098.f54555 = c142798;
                    } else if (c142797.f46795) {
                        c142797.m34499();
                        c17098.f54555 = c142797;
                    }
                    break;
                case 61:
                    C14277 c142799 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34482(c142799);
                    if (c142799.f46795) {
                        c142799.m34499();
                        c17098.f54555 = c142799;
                    }
                    break;
                case 62:
                    C14277 c1427100 = c17098.f54555;
                    if (c1427100 == null) {
                        c1427100 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c1427100.m34464(c17098.m39919());
                    c15313.m36672(c1427100);
                    break;
                case 63:
                    C14277 c1427101 = c17098.f54555;
                    if (c1427101 == null) {
                        c1427101 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c1427101.m34470(c17098.m39918());
                    c15313.m36672(c1427101);
                    break;
                case 64:
                    c15313.m36672(c14277Arr[c17098.m39918()]);
                    break;
                case 65:
                    int iM344813 = ((C14277) c15313.m36673()).m34486();
                    C14277 c1427102 = c17098.f54555;
                    if (c1427102 == null) {
                        c1427102 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c1427102.m34465(new Object[iM344813]);
                    c15313.m36672(c1427102);
                    break;
                case 66:
                    C14277 c1427103 = c17098.f54555;
                    if (c1427103 == null) {
                        c1427103 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c1427104 = (C14277) c15313.m36673();
                    C14277 c1427105 = (C14277) c15313.m36673();
                    c1427105.m34457(c1427104, c1427103);
                    c15313.m36672(c1427103);
                    if (c1427105.f46795) {
                        c1427105.m34499();
                        c17098.f54555 = c1427105;
                    } else if (c1427104.f46795) {
                        c1427104.m34499();
                        c17098.f54555 = c1427104;
                    }
                    break;
                case 67:
                    if (((C14277) c15313.m36671()).f46795) {
                        C14277 c1427106 = (C14277) c15313.m36671();
                        c1427106.m34456(c1427106);
                    } else {
                        C14277 c1427107 = (C14277) c15313.m36673();
                        C14277 c1427108 = c17098.f54555;
                        if (c1427108 == null) {
                            c1427108 = new C14277();
                        } else {
                            c17098.f54555 = null;
                        }
                        c1427107.m34456(c1427108);
                        c15313.m36672(c1427108);
                    }
                    break;
                case 68:
                    C14277 c1427109 = c17098.f54555;
                    if (c1427109 == null) {
                        c1427109 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c1427110 = (C14277) c15313.m36673();
                    C14277 c1427111 = (C14277) c15313.m36673();
                    c1427111.m34488(c1427110, c1427109);
                    c15313.m36672(c1427109);
                    if (c1427111.f46795) {
                        c1427111.m34499();
                        c17098.f54555 = c1427111;
                    } else if (c1427110.f46795) {
                        c1427110.m34499();
                        c17098.f54555 = c1427110;
                    }
                    break;
                case 69:
                    c14277Arr2[c17098.m39918()].m34491((C14277) c15313.m36673(), ((C14277) c15313.m36673()).m34486());
                    break;
                case 70:
                    c14277Arr[c17098.m39918()].m34458();
                    break;
                case 71:
                    int iM344814 = ((C14277) c15313.m36673()).m34486();
                    C14277 c1427112 = c17098.f54555;
                    if (c1427112 == null) {
                        c1427112 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c1427112.m34465(new byte[iM344814]);
                    c15313.m36672(c1427112);
                    break;
                case 72:
                    c14277Arr[c17098.m39918()].m34491((C14277) c15313.m36673(), ((C14277) c15313.m36673()).m34486());
                    break;
                case 73:
                    C14277 c1427113 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34504(c1427113);
                    if (c1427113.f46795) {
                        c1427113.m34499();
                        c17098.f54555 = c1427113;
                    }
                    break;
                case 74:
                    C14277 c1427114 = c17098.f54555;
                    if (c1427114 == null) {
                        c1427114 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c1427115 = (C14277) c15313.m36673();
                    C14277 c1427116 = (C14277) c15313.m36673();
                    c1427116.m34503(c1427115, c1427114);
                    c15313.m36672(c1427114);
                    if (c1427116.f46795) {
                        c1427116.m34499();
                        c17098.f54555 = c1427116;
                    } else if (c1427115.f46795) {
                        c1427115.m34499();
                        c17098.f54555 = c1427115;
                    }
                    break;
                case 75:
                    C14277 c1427117 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34490(c1427117);
                    if (c1427117.f46795) {
                        c1427117.m34499();
                        c17098.f54555 = c1427117;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    C14277 c1427118 = c17098.f54555;
                    if (c1427118 == null) {
                        c1427118 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    byte[] bArr4 = c5809.f19729;
                    int i11 = c17098.f54557;
                    c17098.f54557 = i11 + 1;
                    c1427118.m34459(bArr4[i11]);
                    c15313.m36672(c1427118);
                    break;
                case 77:
                    C14277 c1427119 = (C14277) c15313.m36673();
                    ((C14277) c15313.m36673()).m34478(c1427119);
                    if (c1427119.f46795) {
                        c1427119.m34499();
                        c17098.f54555 = c1427119;
                    }
                    break;
                case 78:
                    short sM399111 = c17098.m39918();
                    C14277 c1427120 = (C14277) c15313.m36673();
                    c14277Arr[sM399111] = c1427120;
                    c1427120.f46795 = false;
                    break;
                case 79:
                    int iM344815 = ((C14277) c15313.m36673()).m34486();
                    C14277 c1427121 = c17098.f54555;
                    if (c1427121 == null) {
                        c1427121 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c1427121.m34465(new short[iM344815]);
                    c15313.m36672(c1427121);
                    break;
                case 80:
                    C14277 c1427122 = c17098.f54555;
                    if (c1427122 == null) {
                        c1427122 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    C14277 c1427123 = (C14277) c15313.m36673();
                    C14277 c1427124 = (C14277) c15313.m36673();
                    c1427124.m34507(c1427123, c1427122);
                    c15313.m36672(c1427122);
                    if (c1427124.f46795) {
                        c1427124.m34499();
                        c17098.f54555 = c1427124;
                    } else if (c1427123.f46795) {
                        c1427123.m34499();
                        c17098.f54555 = c1427123;
                    }
                    break;
                case 81:
                    C14277 c1427125 = c17098.f54555;
                    if (c1427125 == null) {
                        c1427125 = new C14277();
                    } else {
                        c17098.f54555 = null;
                    }
                    c1427125.m34463(c14277Arr2[c17098.m39918()].m34489());
                    c15313.m36672(c1427125);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }
}
