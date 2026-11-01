package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩹۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8PP */
/* JADX INFO: loaded from: classes.dex */
public final class C22164 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f72491;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f72492;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f72493;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72494;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f72495;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f72496;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f72497;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f72498;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f72499;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f72500;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f72501;

    public C22164(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f72491 = i;
        this.f72494 = i2;
        this.f72493 = i3;
        this.f72498 = i4;
        this.f72492 = i5;
        this.f72499 = i6;
        this.f72495 = i7;
        this.f72501 = i8;
        this.f72496 = i9;
        this.f72497 = i10;
        this.f72500 = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22164 m49175(String str) {
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
            String strM46672 = C20733.m46672(strArrSplit[i11].trim());
            strM46672.getClass();
            switch (strM46672) {
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
            return new C22164(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
        }
        return null;
    }
}
