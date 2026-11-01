package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۖ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8J7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2407 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f9674;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f9675;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f9676;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f9677;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f9678;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f9679;

    public C2407(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f9678 = i;
        this.f9674 = i2;
        this.f9675 = i3;
        this.f9676 = i4;
        this.f9679 = i5;
        this.f9677 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2407 m7333(String str) {
        C2023.m6507(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strM46672 = C20733.m46672(strArrSplit[i6].trim());
            strM46672.getClass();
            switch (strM46672) {
                case "end":
                    i3 = i6;
                    break;
                case "text":
                    i5 = i6;
                    break;
                case "layer":
                    i = i6;
                    break;
                case "start":
                    i2 = i6;
                    break;
                case "style":
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new C2407(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
