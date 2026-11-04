package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩳ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19391 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f62656;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f62657;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f62658;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f62659;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f62660;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f62661;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f62662;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f62663;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f62664;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f62665;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f62666;

    public C19391(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f62661 = i;
        this.f62657 = i2;
        this.f62656 = i3;
        this.f62658 = i4;
        this.f62665 = i5;
        this.f62664 = i6;
        this.f62663 = i7;
        this.f62666 = i8;
        this.f62660 = i9;
        this.f62659 = i10;
        this.f62662 = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19391 m44848(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String strM21453 = C7914.m21453(strArrSplit[i11].trim());
            strM21453.getClass();
            switch (strM21453) {
                case "italic":
                    i7 = i11;
                    break;
                case "underline":
                    i8 = i11;
                    break;
                case "strikeout":
                    i9 = i11;
                    break;
                case "primarycolour":
                    i3 = i11;
                    break;
                case "bold":
                    i6 = i11;
                    break;
                case "name":
                    i = i11;
                    break;
                case "fontsize":
                    i5 = i11;
                    break;
                case "borderstyle":
                    i10 = i11;
                    break;
                case "alignment":
                    i2 = i11;
                    break;
                case "outlinecolour":
                    i4 = i11;
                    break;
            }
        }
        if (i != -1) {
            return new C19391(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
        }
        return null;
    }
}
