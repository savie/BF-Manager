package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֡᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B8J7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0746 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2719;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f2720;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f2721;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f2722;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f2723;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2724;

    public C0746(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f2723 = i;
        this.f2724 = i2;
        this.f2719 = i3;
        this.f2722 = i4;
        this.f2721 = i5;
        this.f2720 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0746 m3079(String str) {
        C20782.m47565(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < strArrSplit.length; i6++) {
            String strM21453 = C7914.m21453(strArrSplit[i6].trim());
            strM21453.getClass();
            switch (strM21453) {
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
        return new C0746(i, i2, i3, i4, i5, strArrSplit.length);
    }
}
