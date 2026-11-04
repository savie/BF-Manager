package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.BaseBundle;
import android.os.Parcelable;
import android.view.View;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N22M */
/* JADX INFO: loaded from: classes.dex */
public class C2834 {

    /* JADX INFO: renamed from: ᩹ۧܳ, reason: not valid java name and contains not printable characters */
    public static int f9334;

    /* JADX INFO: renamed from: ֨۟ܳ, reason: not valid java name and contains not printable characters */
    public static void m9332(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ֨۬᩺, reason: not valid java name and contains not printable characters */
    public static View m9333(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* JADX INFO: renamed from: ֨ܰ᩶, reason: not valid java name and contains not printable characters */
    public static C24975 m9334(Object obj) {
        return C24975.m55779((byte[]) obj);
    }

    /* JADX INFO: renamed from: ֫᩷ܳ, reason: not valid java name and contains not printable characters */
    public static void m9335(Object obj) {
        C15243.m36592((String) obj);
    }

    /* JADX INFO: renamed from: ۗ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m9336(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ۗۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9337(Object obj, Object obj2) {
        return ((C1679) obj).mo6022((C1679) obj2);
    }

    /* JADX INFO: renamed from: ۘۖ᩸, reason: not valid java name and contains not printable characters */
    public static void m9338(Object obj, boolean z) {
        ((C1255) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۘۜ᩶, reason: not valid java name and contains not printable characters */
    public static void m9339(Object obj) {
        ((AbstractC2432) obj).m8197();
    }

    /* JADX INFO: renamed from: ܶܰ۫, reason: not valid java name and contains not printable characters */
    public static long m9342() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ܺ᩵᩻, reason: not valid java name and contains not printable characters */
    public static String m9343(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽ᩷ۚ, reason: not valid java name and contains not printable characters */
    public static int m9344() {
        return -1538814842;
    }

    /* JADX INFO: renamed from: ܽ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m9345(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܿܰᩳ, reason: not valid java name and contains not printable characters */
    public static C15856 m9346(Object obj, Object obj2) {
        return C23316.m52465((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ܿ᩺ܽ, reason: not valid java name and contains not printable characters */
    public static C5408 m9347(Object obj, Object obj2) {
        return ((C5408) obj).m16112((C5408) obj2);
    }

    /* JADX INFO: renamed from: ᩳۘ᩻, reason: not valid java name and contains not printable characters */
    public static void m9348(Object obj) {
        C20653.m47271((String) obj);
    }

    /* JADX INFO: renamed from: ᩶۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m9349(Object obj, Object obj2, Object obj3) {
        ((BaseBundle) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9545 m9340(AbstractC3290 abstractC3290) {
        C9545 c9545 = new C9545();
        c9545.f30901 = abstractC3290.m10838(c9545.f30901, 1);
        c9545.f30898 = abstractC3290.m10850(c9545.f30898);
        c9545.f30904 = abstractC3290.m10839(c9545.f30904, 3);
        c9545.f30905 = abstractC3290.m10838(c9545.f30905, 4);
        c9545.f30900 = abstractC3290.m10838(c9545.f30900, 5);
        c9545.f30902 = (ColorStateList) abstractC3290.m10839(c9545.f30902, 6);
        c9545.f30897 = abstractC3290.m10841(7, c9545.f30897);
        c9545.f30903 = abstractC3290.m10841(8, c9545.f30903);
        c9545.f30899 = PorterDuff.Mode.valueOf(c9545.f30897);
        switch (c9545.f30901) {
            case -1:
                Parcelable parcelable = c9545.f30904;
                if (parcelable != null) {
                    c9545.f30906 = parcelable;
                    return c9545;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return c9545;
            case 1:
            case 5:
                Parcelable parcelable2 = c9545.f30904;
                if (parcelable2 != null) {
                    c9545.f30906 = parcelable2;
                    return c9545;
                }
                byte[] bArr = c9545.f30898;
                c9545.f30906 = bArr;
                c9545.f30901 = 3;
                c9545.f30905 = 0;
                c9545.f30900 = bArr.length;
                return c9545;
            case 2:
            case 4:
            case 6:
                String str = new String(c9545.f30898, Charset.forName("UTF-16"));
                c9545.f30906 = str;
                if (c9545.f30901 == 2 && c9545.f30903 == null) {
                    c9545.f30903 = str.split(":", -1)[0];
                }
                return c9545;
            case 3:
                c9545.f30906 = c9545.f30898;
                return c9545;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9341(C9545 c9545, AbstractC3290 abstractC3290) {
        abstractC3290.getClass();
        c9545.f30897 = c9545.f30899.name();
        switch (c9545.f30901) {
            case -1:
                c9545.f30904 = (Parcelable) c9545.f30906;
                break;
            case 1:
            case 5:
                c9545.f30904 = (Parcelable) c9545.f30906;
                break;
            case 2:
                c9545.f30898 = ((String) c9545.f30906).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                c9545.f30898 = (byte[]) c9545.f30906;
                break;
            case 4:
            case 6:
                c9545.f30898 = c9545.f30906.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = c9545.f30901;
        if (-1 != i) {
            abstractC3290.m10861(i, 1);
        }
        byte[] bArr = c9545.f30898;
        if (bArr != null) {
            abstractC3290.m10854(bArr);
        }
        Parcelable parcelable = c9545.f30904;
        if (parcelable != null) {
            abstractC3290.m10865(parcelable, 3);
        }
        int i2 = c9545.f30905;
        if (i2 != 0) {
            abstractC3290.m10861(i2, 4);
        }
        int i3 = c9545.f30900;
        if (i3 != 0) {
            abstractC3290.m10861(i3, 5);
        }
        ColorStateList colorStateList = c9545.f30902;
        if (colorStateList != null) {
            abstractC3290.m10865(colorStateList, 6);
        }
        String str = c9545.f30897;
        if (str != null) {
            abstractC3290.m10863(7, str);
        }
        String str2 = c9545.f30903;
        if (str2 != null) {
            abstractC3290.m10863(8, str2);
        }
    }
}
