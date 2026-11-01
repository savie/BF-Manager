package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N22M */
/* JADX INFO: loaded from: classes3.dex */
public class C12542 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16775 m31174(AbstractC5749 abstractC5749) {
        C16775 c16775 = new C16775();
        c16775.f53695 = abstractC5749.m15817(c16775.f53695, 1);
        c16775.f53693 = abstractC5749.m15829(c16775.f53693);
        c16775.f53694 = abstractC5749.m15818(c16775.f53694, 3);
        c16775.f53698 = abstractC5749.m15817(c16775.f53698, 4);
        c16775.f53696 = abstractC5749.m15817(c16775.f53696, 5);
        c16775.f53690 = (ColorStateList) abstractC5749.m15818(c16775.f53690, 6);
        c16775.f53692 = abstractC5749.m15820(7, c16775.f53692);
        c16775.f53699 = abstractC5749.m15820(8, c16775.f53699);
        c16775.f53697 = PorterDuff.Mode.valueOf(c16775.f53692);
        switch (c16775.f53695) {
            case -1:
                Parcelable parcelable = c16775.f53694;
                if (parcelable != null) {
                    c16775.f53691 = parcelable;
                    return c16775;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return c16775;
            case 1:
            case 5:
                Parcelable parcelable2 = c16775.f53694;
                if (parcelable2 != null) {
                    c16775.f53691 = parcelable2;
                    return c16775;
                }
                byte[] bArr = c16775.f53693;
                c16775.f53691 = bArr;
                c16775.f53695 = 3;
                c16775.f53698 = 0;
                c16775.f53696 = bArr.length;
                return c16775;
            case 2:
            case 4:
            case 6:
                String str = new String(c16775.f53693, Charset.forName("UTF-16"));
                c16775.f53691 = str;
                if (c16775.f53695 == 2 && c16775.f53699 == null) {
                    c16775.f53699 = str.split(":", -1)[0];
                }
                return c16775;
            case 3:
                c16775.f53691 = c16775.f53693;
                return c16775;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31175(C16775 c16775, AbstractC5749 abstractC5749) {
        abstractC5749.getClass();
        c16775.f53692 = c16775.f53697.name();
        switch (c16775.f53695) {
            case -1:
                c16775.f53694 = (Parcelable) c16775.f53691;
                break;
            case 1:
            case 5:
                c16775.f53694 = (Parcelable) c16775.f53691;
                break;
            case 2:
                c16775.f53693 = ((String) c16775.f53691).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                c16775.f53693 = (byte[]) c16775.f53691;
                break;
            case 4:
            case 6:
                c16775.f53693 = c16775.f53691.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = c16775.f53695;
        if (-1 != i) {
            abstractC5749.m15838(i, 1);
        }
        byte[] bArr = c16775.f53693;
        if (bArr != null) {
            abstractC5749.m15833(bArr);
        }
        Parcelable parcelable = c16775.f53694;
        if (parcelable != null) {
            abstractC5749.m15842(parcelable, 3);
        }
        int i2 = c16775.f53698;
        if (i2 != 0) {
            abstractC5749.m15838(i2, 4);
        }
        int i3 = c16775.f53696;
        if (i3 != 0) {
            abstractC5749.m15838(i3, 5);
        }
        ColorStateList colorStateList = c16775.f53690;
        if (colorStateList != null) {
            abstractC5749.m15842(colorStateList, 6);
        }
        String str = c16775.f53692;
        if (str != null) {
            abstractC5749.m15840(7, str);
        }
        String str2 = c16775.f53699;
        if (str2 != null) {
            abstractC5749.m15840(8, str2);
        }
    }
}
