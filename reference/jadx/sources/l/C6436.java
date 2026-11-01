package l;

import android.text.TextUtils;
import com.umeng.analytics.pro.o;
import java.io.EOFException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAHB */
/* JADX INFO: loaded from: classes2.dex */
public final class C6436 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f21783;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C17212 f21784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0791 f21785;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6436 m17619(InputStream inputStream) throws EOFException {
        String strM3336;
        C6436 c6436 = new C6436();
        C17212 c17212 = new C17212();
        c6436.f21784 = c17212;
        C0791 c0791 = new C0791(inputStream);
        c6436.f21785 = c0791;
        c0791.m3339();
        c0791.m3339();
        c0791.m3339();
        c0791.m3339();
        int iM3338 = c6436.f21785.m3338();
        c6436.f21785.m3342(6L);
        c6436.f21783 = new HashMap();
        C12787[] c12787Arr = new C12787[iM3338];
        for (int i = 0; i < iM3338; i++) {
            C12787 c12787 = new C12787();
            c12787Arr[i] = c12787;
            c6436.f21783.put(C22665.m50198(c12787.m31772(c6436.f21785)), c12787Arr[i]);
        }
        HashMap map = c6436.f21783;
        c6436.f21785.getClass();
        map.put(C22665.f73817, new C12787(0));
        C0791 c0792 = c6436.f21785;
        C12787 c12788 = (C12787) c6436.f21783.get(C22665.f73818);
        if (c12788 != null) {
            c0792.m3337(c12788.m31771());
            c6436.f21785.m3338();
            c6436.f21785.m3342(2L);
            c6436.f21785.m3338();
        }
        C0791 c0793 = c6436.f21785;
        C12787 c12789 = (C12787) c6436.f21783.get(C22665.f73819);
        if (c12789 == null) {
            return c6436;
        }
        c0793.m3337(c12789.m31771() + 2);
        int iM3335 = c6436.f21785.m3335();
        int iM3339 = c6436.f21785.m3338();
        int iM33310 = (c6436.f21785.m3338() + iM3335) - 2;
        int i2 = iM3335 + 4;
        while (true) {
            int i3 = iM3339 - 1;
            if (iM3339 <= 0) {
                return c6436;
            }
            c6436.f21785.m3337(i2);
            int iM33311 = c6436.f21785.m3338();
            int iM33312 = c6436.f21785.m3338();
            int iM33313 = c6436.f21785.m3338();
            int iM33314 = c6436.f21785.m3338();
            int iM33315 = c6436.f21785.m3338();
            if ((iM33311 == 1 || iM33311 == 3) && (iM33312 == 0 || iM33312 == 1)) {
                C0791 c0794 = c6436.f21785;
                c0794.m3337(c0794.m3338() + iM33310);
                if (iM33311 == 3) {
                    strM3336 = c6436.f21785.m3341(iM33315);
                } else {
                    strM3336 = c6436.f21785.m3336(iM33315);
                }
                C3613 c3613 = (C3613) c17212.m40144(iM33314, (Integer) null);
                if (c3613 == null) {
                    c3613 = new C3613(0);
                    c17212.m40149(iM33314, c3613);
                }
                if (iM33311 != 1) {
                    switch (iM33313) {
                        case 1028:
                        case 3076:
                        case 5124:
                            c3613.f13283 = strM3336;
                            break;
                        case 1033:
                        case 2057:
                        case o.a.i /* 4105 */:
                        case 5129:
                        case 6153:
                        case 7177:
                        case o.a.x /* 8201 */:
                        case 9225:
                        case 10249:
                        case 11273:
                        case 12297:
                        case 13321:
                        case 16393:
                        case 17417:
                        case 18441:
                            c3613.f13279 = strM3336;
                            break;
                        case 1034:
                        case 2058:
                        case 3082:
                        case o.a.j /* 4106 */:
                        case 5130:
                        case 6154:
                        case 7178:
                        case 8202:
                        case 9226:
                        case 10250:
                        case 11274:
                        case 12298:
                        case 13322:
                        case 14346:
                        case 15370:
                        case 16394:
                        case 17418:
                        case 18442:
                        case 19466:
                        case 20490:
                        case 21514:
                            c3613.f13274 = strM3336;
                            break;
                        case 1049:
                            c3613.f13273 = strM3336;
                            break;
                        case 1055:
                            c3613.f13280 = strM3336;
                            break;
                        case 1057:
                            c3613.f13277 = strM3336;
                            break;
                        case 1058:
                            c3613.f13275 = strM3336;
                            break;
                        case 1059:
                            c3613.f13281 = strM3336;
                            break;
                        case 1068:
                        case 2092:
                            c3613.f13276 = strM3336;
                            break;
                        case 2052:
                        case o.a.d /* 4100 */:
                            c3613.f13278 = strM3336;
                            break;
                        default:
                            if (TextUtils.isEmpty(c3613.f13282)) {
                                c3613.f13282 = strM3336;
                            }
                            break;
                    }
                } else if (iM33313 == 0) {
                    c3613.f13279 = strM3336;
                } else if (iM33313 == 6) {
                    c3613.f13274 = strM3336;
                } else if (iM33313 == 17) {
                    c3613.f13280 = strM3336;
                } else if (iM33313 == 19) {
                    c3613.f13283 = strM3336;
                } else if (iM33313 == 45) {
                    c3613.f13275 = strM3336;
                } else if (iM33313 != 81) {
                    if (iM33313 != 150) {
                        if (iM33313 == 32) {
                            c3613.f13273 = strM3336;
                        } else if (iM33313 == 33) {
                            c3613.f13278 = strM3336;
                        } else if (iM33313 != 49 && iM33313 != 50) {
                            if (TextUtils.isEmpty(c3613.f13282)) {
                                c3613.f13282 = strM3336;
                            }
                        }
                    }
                    c3613.f13276 = strM3336;
                    c3613.f13274 = strM3336;
                } else {
                    c3613.f13277 = strM3336;
                }
            }
            i2 += 12;
            iM3339 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17620(int i, Locale locale) {
        C3613 c3613 = (C3613) this.f21784.m40144(i, (Integer) null);
        if (c3613 == null) {
            return null;
        }
        String language = locale.getLanguage();
        language.getClass();
        switch (language) {
            case "az":
                if (!TextUtils.isEmpty(c3613.f13276)) {
                    return c3613.f13276;
                }
                break;
            case "be":
                if (!TextUtils.isEmpty(c3613.f13281)) {
                    return c3613.f13281;
                }
                break;
            case "en":
                if (!TextUtils.isEmpty(c3613.f13279)) {
                    return c3613.f13279;
                }
                break;
            case "es":
                if (!TextUtils.isEmpty(c3613.f13274)) {
                    return c3613.f13274;
                }
                break;
            case "in":
                if (!TextUtils.isEmpty(c3613.f13277)) {
                    return c3613.f13277;
                }
                break;
            case "ru":
                if (!TextUtils.isEmpty(c3613.f13273)) {
                    return c3613.f13273;
                }
                break;
            case "tr":
                if (!TextUtils.isEmpty(c3613.f13280)) {
                    return c3613.f13280;
                }
                break;
            case "uk":
                if (!TextUtils.isEmpty(c3613.f13275)) {
                    return c3613.f13275;
                }
                break;
            case "zh":
                if (locale.getCountry().equals("CN")) {
                    if (!TextUtils.isEmpty(c3613.f13278)) {
                        return c3613.f13278;
                    }
                } else if (!TextUtils.isEmpty(c3613.f13283)) {
                    return c3613.f13283;
                }
                break;
        }
        if (!TextUtils.isEmpty(c3613.f13279)) {
            return c3613.f13279;
        }
        return c3613.f13282;
    }
}
