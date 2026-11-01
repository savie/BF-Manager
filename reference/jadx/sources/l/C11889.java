package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۨᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11889 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f39886;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39887;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f39888;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet f39885 = new BitSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39884 = new ArrayList();

    public C11889(StringBuilder sb, String str) {
        this.f39886 = str;
        this.f39888 = sb;
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
                this.f39884.add(new int[]{i, i3, iIndexOf < 0 ? length : iIndexOf, length});
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29648(int i, int i2) {
        StringBuilder sb;
        String str;
        int[] iArr;
        int i3;
        BitSet bitSet = this.f39885;
        int iNextSetBit = bitSet.nextSetBit(i);
        while (true) {
            int i4 = this.f39887;
            ArrayList arrayList = this.f39884;
            int size = arrayList.size();
            sb = this.f39888;
            str = this.f39886;
            if (i4 >= size || (i3 = (iArr = (int[]) arrayList.get(this.f39887))[0]) >= i2) {
                break;
            }
            this.f39887++;
            if (i3 >= i && iArr[3] <= i2) {
                while (iNextSetBit >= 0 && iNextSetBit < iArr[0]) {
                    iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                }
                if (iNextSetBit < 0 || iNextSetBit >= iArr[3]) {
                    C4126.m11725(i, iArr[0], str, sb);
                    C4126.m11726(str, iArr[1], iArr[2], sb, true);
                    i = iArr[3];
                }
            }
        }
        C4126.m11725(i, i2, str, sb);
    }
}
