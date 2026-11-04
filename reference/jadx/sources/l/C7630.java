package l;

import android.text.TextUtils;
import com.umeng.analytics.pro.o;
import java.io.EOFException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.۟ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAHB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7630 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f25173;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2375 f25174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21055 f25175;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7630 m20844(InputStream inputStream) throws EOFException {
        String strM48124;
        C7630 c7630 = new C7630();
        C2375 c2375 = new C2375();
        c7630.f25174 = c2375;
        C21055 c21055 = new C21055(inputStream);
        c7630.f25175 = c21055;
        c21055.m48126();
        c21055.m48126();
        c21055.m48126();
        c21055.m48126();
        int iM48127 = c7630.f25175.m48127();
        c7630.f25175.m48130(6L);
        c7630.f25173 = new HashMap();
        C18071[] c18071Arr = new C18071[iM48127];
        for (int i = 0; i < iM48127; i++) {
            C18071 c18071 = new C18071();
            c18071Arr[i] = c18071;
            c7630.f25173.put(C18817.m43671(c18071.m42104(c7630.f25175)), c18071Arr[i]);
        }
        HashMap map = c7630.f25173;
        c7630.f25175.getClass();
        map.put(C18817.f61150, new C18071(0));
        C21055 c21056 = c7630.f25175;
        C18071 c18072 = (C18071) c7630.f25173.get(C18817.f61148);
        if (c18072 != null) {
            c21056.m48125(c18072.m42103());
            c7630.f25175.m48127();
            c7630.f25175.m48130(2L);
            c7630.f25175.m48127();
        }
        C21055 c21057 = c7630.f25175;
        C18071 c18073 = (C18071) c7630.f25173.get(C18817.f61149);
        if (c18073 == null) {
            return c7630;
        }
        c21057.m48125(c18073.m42103() + 2);
        int iM48123 = c7630.f25175.m48123();
        int iM48128 = c7630.f25175.m48127();
        int iM48129 = (c7630.f25175.m48127() + iM48123) - 2;
        int i2 = iM48123 + 4;
        while (true) {
            int i3 = iM48128 - 1;
            if (iM48128 <= 0) {
                return c7630;
            }
            c7630.f25175.m48125(i2);
            int iM481210 = c7630.f25175.m48127();
            int iM481211 = c7630.f25175.m48127();
            int iM481212 = c7630.f25175.m48127();
            int iM481213 = c7630.f25175.m48127();
            int iM481214 = c7630.f25175.m48127();
            if ((iM481210 == 1 || iM481210 == 3) && (iM481211 == 0 || iM481211 == 1)) {
                C21055 c21058 = c7630.f25175;
                c21058.m48125(c21058.m48127() + iM48129);
                if (iM481210 == 3) {
                    strM48124 = c7630.f25175.m48129(iM481214);
                } else {
                    strM48124 = c7630.f25175.m48124(iM481214);
                }
                C0172 c0172 = (C0172) C8341.m22446(c2375, iM481213);
                if (c0172 == null) {
                    c0172 = new C0172(0);
                    c2375.m8077(iM481213, c0172);
                }
                if (iM481210 != 1) {
                    switch (iM481212) {
                        case 1028:
                        case 3076:
                        case 5124:
                            c0172.f1243 = strM48124;
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
                            c0172.f1236 = strM48124;
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
                            c0172.f1242 = strM48124;
                            break;
                        case 1049:
                            c0172.f1238 = strM48124;
                            break;
                        case 1055:
                            c0172.f1235 = strM48124;
                            break;
                        case 1057:
                            c0172.f1240 = strM48124;
                            break;
                        case 1058:
                            c0172.f1233 = strM48124;
                            break;
                        case 1059:
                            c0172.f1241 = strM48124;
                            break;
                        case 1068:
                        case 2092:
                            c0172.f1234 = strM48124;
                            break;
                        case 2052:
                        case o.a.d /* 4100 */:
                            c0172.f1237 = strM48124;
                            break;
                        default:
                            if (TextUtils.isEmpty(c0172.f1239)) {
                                c0172.f1239 = strM48124;
                            }
                            break;
                    }
                } else if (iM481212 == 0) {
                    c0172.f1236 = strM48124;
                } else if (iM481212 == 6) {
                    c0172.f1242 = strM48124;
                } else if (iM481212 == 17) {
                    c0172.f1235 = strM48124;
                } else if (iM481212 == 19) {
                    c0172.f1243 = strM48124;
                } else if (iM481212 == 45) {
                    c0172.f1233 = strM48124;
                } else if (iM481212 != 81) {
                    if (iM481212 != 150) {
                        if (iM481212 == 32) {
                            c0172.f1238 = strM48124;
                        } else if (iM481212 == 33) {
                            c0172.f1237 = strM48124;
                        } else if (iM481212 != 49 && iM481212 != 50) {
                            if (TextUtils.isEmpty(c0172.f1239)) {
                                c0172.f1239 = strM48124;
                            }
                        }
                    }
                    c0172.f1234 = strM48124;
                    c0172.f1242 = strM48124;
                } else {
                    c0172.f1240 = strM48124;
                }
            }
            i2 += 12;
            iM48128 = i3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20845(int i, Locale locale) {
        C2375 c2375 = this.f25174;
        c2375.getClass();
        C0172 c0172 = (C0172) C8341.m22446(c2375, i);
        if (c0172 == null) {
            return null;
        }
        String language = locale.getLanguage();
        language.getClass();
        switch (language) {
            case "az":
                if (!TextUtils.isEmpty(c0172.f1234)) {
                    return c0172.f1234;
                }
                break;
            case "be":
                if (!TextUtils.isEmpty(c0172.f1241)) {
                    return c0172.f1241;
                }
                break;
            case "en":
                if (!TextUtils.isEmpty(c0172.f1236)) {
                    return c0172.f1236;
                }
                break;
            case "es":
                if (!TextUtils.isEmpty(c0172.f1242)) {
                    return c0172.f1242;
                }
                break;
            case "in":
                if (!TextUtils.isEmpty(c0172.f1240)) {
                    return c0172.f1240;
                }
                break;
            case "ru":
                if (!TextUtils.isEmpty(c0172.f1238)) {
                    return c0172.f1238;
                }
                break;
            case "tr":
                if (!TextUtils.isEmpty(c0172.f1235)) {
                    return c0172.f1235;
                }
                break;
            case "uk":
                if (!TextUtils.isEmpty(c0172.f1233)) {
                    return c0172.f1233;
                }
                break;
            case "zh":
                if (locale.getCountry().equals("CN")) {
                    if (!TextUtils.isEmpty(c0172.f1237)) {
                        return c0172.f1237;
                    }
                } else if (!TextUtils.isEmpty(c0172.f1243)) {
                    return c0172.f1243;
                }
                break;
        }
        if (!TextUtils.isEmpty(c0172.f1236)) {
            return c0172.f1236;
        }
        return c0172.f1239;
    }
}
