package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩺ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAK8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24018 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m53570(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53571(InterfaceC16617 interfaceC16617) {
        StringBuilder sb = new StringBuilder("{");
        int iMo1655 = interfaceC16617.mo1655();
        if (iMo1655 == 1) {
            sb.append(am.aE);
            sb.append(interfaceC16617.mo7063());
        } else if (iMo1655 == 2) {
            sb.append(am.aE);
            sb.append(interfaceC16617.mo7063());
            sb.append(", v");
            sb.append(interfaceC16617.mo7065());
        } else if (iMo1655 == 3) {
            sb.append(am.aE);
            sb.append(interfaceC16617.mo7063());
            sb.append(", v");
            sb.append(interfaceC16617.mo7065());
            sb.append(", v");
            sb.append(interfaceC16617.mo7061());
        } else if (iMo1655 == 4) {
            sb.append(am.aE);
            sb.append(interfaceC16617.mo7063());
            sb.append(", v");
            sb.append(interfaceC16617.mo7065());
            sb.append(", v");
            sb.append(interfaceC16617.mo7061());
            sb.append(", v");
            sb.append(interfaceC16617.mo7062());
        } else if (iMo1655 == 5) {
            sb.append(am.aE);
            sb.append(interfaceC16617.mo7063());
            sb.append(", v");
            sb.append(interfaceC16617.mo7065());
            sb.append(", v");
            sb.append(interfaceC16617.mo7061());
            sb.append(", v");
            sb.append(interfaceC16617.mo7062());
            sb.append(", v");
            sb.append(interfaceC16617.mo7064());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m53572(InterfaceC24077 interfaceC24077) {
        int iMo1655 = interfaceC24077.mo1655();
        if (iMo1655 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{v");
        int iMo2772 = interfaceC24077.mo2772();
        sb.append(iMo2772);
        sb.append(" .. v");
        sb.append((iMo2772 + iMo1655) - 1);
        sb.append('}');
        return sb.toString();
    }
}
