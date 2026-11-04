package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۖܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2753 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f9113;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f9114;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f9115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f9112 = new BitSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f9116 = new ArrayList();

    public C2753(StringBuilder sb, String str) {
        this.f9114 = str;
        this.f9115 = sb;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return;
            }
            if (str.charAt(i) != '\\') {
                i = i2;
            } else if (str.charAt(i2) != 'Q') {
                i += 2;
            } else {
                int i3 = i + 2;
                int iIndexOf = str.indexOf("\\E", i3);
                int length = iIndexOf < 0 ? str.length() : iIndexOf + 2;
                this.f9116.add(new int[]{i, i3, iIndexOf < 0 ? length : iIndexOf, length});
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9102(int i, int i2) {
        StringBuilder sb;
        String str;
        int[] iArr;
        int i3;
        BitSet bitSet = this.f9112;
        int iNextSetBit = bitSet.nextSetBit(i);
        while (true) {
            int i4 = this.f9113;
            ArrayList arrayList = this.f9116;
            int size = arrayList.size();
            sb = this.f9115;
            str = this.f9114;
            if (i4 >= size || (i3 = (iArr = (int[]) arrayList.get(this.f9113))[0]) >= i2) {
                break;
            }
            this.f9113++;
            if (i3 >= i && iArr[3] <= i2) {
                while (iNextSetBit >= 0 && iNextSetBit < iArr[0]) {
                    iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                }
                if (iNextSetBit < 0 || iNextSetBit >= iArr[3]) {
                    C11176.m28157(i, iArr[0], str, sb);
                    C11176.m28158(str, iArr[1], iArr[2], sb, true);
                    i = iArr[3];
                }
            }
        }
        C11176.m28157(i, i2, str, sb);
    }
}
