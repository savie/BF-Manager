package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1ISQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16208 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52690;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f52691;

    public C16208(int i, int i2) {
        this.f52691 = i;
        this.f52690 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m38521(byte[] bArr, C16208 c16208) {
        int iM38539 = c16208.f52691;
        int iMin = Math.min(c16208.f52690, bArr.length);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            arrayList.add(Integer.valueOf(i));
            if (iM38539 >= iMin) {
                return arrayList;
            }
            i = iM38539;
            iM38539 = C16237.m38539(iM38539 + 32, bArr) + iM38539;
        }
    }
}
