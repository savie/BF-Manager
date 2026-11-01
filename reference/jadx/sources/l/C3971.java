package l;

import android.graphics.Bitmap;
import android.net.Uri;
import bin.mt.plus.R;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۘܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I23M */
/* JADX INFO: loaded from: classes3.dex */
public class C3971 extends C18225 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C3971 f14739 = new C3971();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14738 = Pattern.compile("/data/user(_de)?/\\d+/");

    @Override // l.C18225
    /* JADX INFO: renamed from: ۙ */
    public final String mo7923(InterfaceC2557 interfaceC2557, int i) {
        AbstractC20745 abstractC20745Mo11463 = mo11463(interfaceC2557);
        abstractC20745Mo11463.getClass();
        if ((abstractC20745Mo11463 instanceof C13357) && !m11462()) {
            return null;
        }
        if (i == 1 && interfaceC2557.getSize() > 268435456) {
            return null;
        }
        String path = interfaceC2557.getPath();
        long size = interfaceC2557.getSize();
        long time = interfaceC2557.getTime();
        int i2 = C17169.f54735;
        return C22253.m49423(path + size + time).toLowerCase();
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C0690 mo7924(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985()) {
            if (C18862.m43511(interfaceC2557.getSize(), interfaceC2557.getPath())) {
                EnumC4044 enumC4044M43504 = C18862.m43504(m11461(interfaceC2557));
                if (enumC4044M43504 == EnumC4044.NOT_MPEG_TS) {
                    interfaceC2557.mo7965((InterfaceC4968) null);
                } else {
                    if (enumC4044M43504 != EnumC4044.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC4044M43504 == EnumC4044.MPEG_TS) {
                            interfaceC2557.mo7965(new C23548(1));
                        }
                        return C0690.f2919;
                    }
                    interfaceC2557.mo7965(new C23548(1));
                    return C0690.f2907;
                }
            }
        }
        C0690 c0690M31247 = C12560.m31247(interfaceC2557);
        if (c0690M31247 == C0690.f2896) {
            String lowerCase = interfaceC2557.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C0690.f2917;
            }
            if ((interfaceC2557 instanceof C6794) && interfaceC2557.getParent().endsWith("/keys/") && (lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc") || lowerCase.endsWith(".pk8") || lowerCase.endsWith(".x509.pem"))) {
                return C0690.f2912;
            }
        }
        return c0690M31247;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x0201  */
    /* JADX WARN: Code duplicated, block: B:165:0x024b A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ */
    public final int mo7926(InterfaceC2557 interfaceC2557) {
        byte b = 9;
        if (interfaceC2557.mo7985()) {
            if (C18862.m43514(interfaceC2557.getPath())) {
                if (!C18862.m43511(interfaceC2557.getSize(), interfaceC2557.getPath())) {
                    interfaceC2557.mo7975(0);
                    return 0;
                }
                EnumC4044 enumC4044M43504 = C18862.m43504(m11461(interfaceC2557));
                if (enumC4044M43504 == EnumC4044.NOT_MPEG_TS) {
                    interfaceC2557.mo7965((InterfaceC4968) null);
                    interfaceC2557.mo7975(0);
                    return 0;
                }
                if (enumC4044M43504 != EnumC4044.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC4044M43504 == EnumC4044.MPEG_TS) {
                        interfaceC2557.mo7965(new C23548(1));
                    }
                    return 12;
                }
                interfaceC2557.mo7965(new C23548(1));
                interfaceC2557.mo7975(0);
                return 0;
            }
            String strMo7967 = interfaceC2557.mo7967();
            if (strMo7967.equals("image/svg+xml")) {
                return 2;
            }
            if (strMo7967.equals("text/xml")) {
                return 3;
            }
            if (strMo7967.startsWith("image/")) {
                return 1;
            }
            if (strMo7967.startsWith("video/")) {
                return 4;
            }
            if (strMo7967.equals("application/vnd.android.package-archive")) {
                return 5;
            }
            if (strMo7967.equals("application/vnd.android.package-archives")) {
                return 11;
            }
            if (strMo7967.equals("application/mt-plugin")) {
                return 6;
            }
            String lowerCase = interfaceC2557.getName().toLowerCase();
            if (lowerCase.endsWith(".bak") && !lowerCase.endsWith(".bak.bak")) {
                return 9;
            }
        }
        if (interfaceC2557.isDirectory() && (interfaceC2557 instanceof C6794)) {
            if (((C6794) interfaceC2557).m18395()) {
                return 10;
            }
            String lowerCase2 = interfaceC2557.getParent().toLowerCase();
            lowerCase2.getClass();
            switch (lowerCase2.hashCode()) {
                case -2115682979:
                    if (!lowerCase2.equals("/system_ext/app/")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -2023245916:
                    if (!lowerCase2.equals("/cust/data-app/")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1829200709:
                    if (!lowerCase2.equals("/system/product/priv-app/")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1088636626:
                    if (!lowerCase2.equals("/product/overlay/")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1054463452:
                    if (!lowerCase2.equals("/data/app/")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1049563482:
                    if (!lowerCase2.equals("/odm/priv-app/")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -606776186:
                    if (!lowerCase2.equals("/data/user_de/999/")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case -606194528:
                    if (!lowerCase2.equals("/system/product/data-app/")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case -559290289:
                    if (!lowerCase2.equals("/data/user_de/0/")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -394958177:
                    if (!lowerCase2.equals("/system/product/app/")) {
                        b = -1;
                    }
                    break;
                case -340788284:
                    if (!lowerCase2.equals("/data/user/999/")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -265382627:
                    if (!lowerCase2.equals("/product/priv-app/")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 64634109:
                    if (!lowerCase2.equals("/product/app/")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                case 191892095:
                    if (!lowerCase2.equals("/system/app/")) {
                        b = -1;
                    } else {
                        b = cb.k;
                    }
                    break;
                case 218556635:
                    if (!lowerCase2.equals("/system/priv-app/")) {
                        b = -1;
                    } else {
                        b = cb.f77931l;
                    }
                    break;
                case 518080269:
                    if (!lowerCase2.equals("/data/user/0/")) {
                        b = -1;
                    } else {
                        b = 15;
                    }
                    break;
                case 617926845:
                    if (!lowerCase2.equals("/system_ext/priv-app/")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 957623554:
                    if (!lowerCase2.equals("/product/data-app/")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 1441562816:
                    if (!lowerCase2.equals("/system/data-app/")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 1569378259:
                    if (!lowerCase2.equals("/cust/app/customized/")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case 1631864272:
                    if (!lowerCase2.equals("/system/product/overlay/")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 1673700495:
                    if (!lowerCase2.equals("/data/data/")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    return 8;
                case 6:
                case 8:
                case 10:
                case 15:
                case 21:
                    return 7;
                default:
                    if ((!lowerCase2.startsWith("/data/user") || C6851.m18452(lowerCase2, '/') != 4 || !f14738.matcher(lowerCase2).matches()) && !lowerCase2.endsWith("/android/data/") && !lowerCase2.endsWith("/android/obb/") && !lowerCase2.endsWith("/android/media/")) {
                        if (lowerCase2.startsWith("/data/app/") && "/data/app/".equals(C6730.m18172(lowerCase2))) {
                            return 8;
                        }
                    }
                    return 7;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 mo11463(InterfaceC2557 interfaceC2557) {
        return interfaceC2557.mo7989();
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ */
    public final C14600 mo7925(AbstractC11462 abstractC11462, InterfaceC2557 interfaceC2557, int i) {
        C14600 c14600M35070;
        String path = interfaceC2557.getPath();
        long size = interfaceC2557.getSize();
        long time = interfaceC2557.getTime();
        int i2 = C17169.f54735;
        String lowerCase = C22253.m49423(path + size + time).toLowerCase();
        if (i == 12) {
            lowerCase = C18862.m43501(lowerCase, interfaceC2557, interfaceC2557.getTime());
        }
        final AbstractC20745 abstractC20745Mo11463 = mo11463(interfaceC2557);
        C14600 c14600M35071 = null;
        switch (i) {
            case 1:
                abstractC20745Mo11463.getClass();
                if ((!(abstractC20745Mo11463 instanceof C13357) || m11462()) && interfaceC2557.getSize() <= 268435456) {
                    return C18225.m42373(lowerCase, C0690.f2920, true, new C9372(abstractC20745Mo11463));
                }
                return mo7924(interfaceC2557).f2943;
            case 2:
                abstractC20745Mo11463.getClass();
                return (!(abstractC20745Mo11463 instanceof C13357) || m11462()) ? C18225.m42373(lowerCase, C0690.f2920, true, new C14415(abstractC20745Mo11463)) : mo7924(interfaceC2557).f2943;
            case 3:
                abstractC20745Mo11463.getClass();
                if ((abstractC20745Mo11463 instanceof C13357) && !m11462()) {
                    return mo7924(interfaceC2557).f2943;
                }
                C0690 c0690 = C0690.f2939;
                C14600 c14600M42373 = C18225.m42373(lowerCase, c0690, true, new C2544(abstractC20745Mo11463));
                if (c14600M42373 != c0690.f2943) {
                    interfaceC2557.mo7976(R.id.MT_Protector, Boolean.TRUE);
                }
                return c14600M42373;
            case 4:
                abstractC20745Mo11463.getClass();
                if ((abstractC20745Mo11463 instanceof C13357) && !m11462()) {
                    return mo7924(interfaceC2557).f2943;
                }
                String name = interfaceC2557.getName();
                int i3 = C6619.f22317;
                if (!C11122.m28043(name)) {
                    return C18225.m42373(lowerCase, C0690.f2907, true, new C22317(abstractC20745Mo11463, 0));
                }
                C0974 c0974M17955 = C6619.m17955(abstractC11462 == null ? C21611.f70098 : abstractC11462.mo13029(), interfaceC2557, 5);
                if (c0974M17955.m3766() != EnumC12970.SUCCESS || (c14600M35070 = C14600.m35070(c0974M17955.m3765())) == null) {
                    return c0974M17955.m3766() == EnumC12970.CORRUPT ? C0690.f2907.f2943 : mo7924(interfaceC2557).f2943;
                }
                return c14600M35070;
            case 5:
                abstractC20745Mo11463.getClass();
                return (!(abstractC20745Mo11463 instanceof C13357) || m11462()) ? C18225.m42373(lowerCase, C0690.f2890, false, new C16380(abstractC20745Mo11463)) : mo7924(interfaceC2557).f2943;
            case 6:
                abstractC20745Mo11463.getClass();
                return (!(abstractC20745Mo11463 instanceof C13357) || m11462()) ? C18225.m42373(lowerCase, C0690.f2878, true, new C3078(3, abstractC20745Mo11463)) : mo7924(interfaceC2557).f2943;
            case 7:
                C14600 c14600M35072 = C14600.m35071(RunnableC23541.m51898(interfaceC2557.getName()));
                return c14600M35072 == null ? C0690.f2900.f2943 : c14600M35072;
            case 8:
                C14600 c14600M35073 = C14600.m35071(RunnableC23541.m51903(abstractC20745Mo11463.mo33986()));
                return c14600M35073 == null ? C0690.f2900.f2943 : c14600M35073;
            case 9:
                try {
                    C1388 c1388M46710 = abstractC20745Mo11463.m46710("r");
                    try {
                        int i4 = C23455.f75961;
                        C14600 c14600 = ((c1388M46710.length() > 40 && c1388M46710.readInt() == 1230326093 && c1388M46710.readInt() == 1128350240 && c1388M46710.readInt() == 173036875) ? C0690.f2894 : C0690.f2896).f2943;
                        c1388M46710.close();
                        return c14600;
                    } catch (Throwable th) {
                        try {
                            c1388M46710.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    return C0690.f2896.f2943;
                }
            case 10:
                try {
                    Uri uri = ((C6794) interfaceC2557).m18396().f58380;
                    int i5 = C19001.f61501;
                    if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                        c14600M35071 = C14600.m35071(RunnableC23541.m51898(C19001.m43717(uri)));
                    }
                    break;
                } catch (Exception unused2) {
                }
                return c14600M35071 == null ? C0690.f2900.f2943 : c14600M35071;
            case 11:
                abstractC20745Mo11463.getClass();
                if ((abstractC20745Mo11463 instanceof C13357) && !m11462()) {
                    return mo7924(interfaceC2557).f2943;
                }
                C0690 c0691 = C0690.f2882;
                C14600 c14600M42374 = C18225.m42373(lowerCase, c0691, true, new InterfaceC16464() { // from class: l.֨ܰ֨
                    @Override // l.InterfaceC16464
                    /* JADX INFO: renamed from: ۙ */
                    public final Bitmap mo947() {
                        return C5443.m15058(abstractC20745Mo11463);
                    }
                });
                if (c14600M42374 == c0691.f2943) {
                    return c14600M42374;
                }
                C14600 c14600M35074 = C14600.m35071(RunnableC23541.m51899(c14600M42374, lowerCase));
                C13638.requireNonNull(c14600M35074);
                return c14600M35074;
            case 12:
                C14600 c14600M35075 = C14600.m35070(C17169.m40091(lowerCase));
                if (c14600M35075 != null) {
                    C18862.m43510(m11461(interfaceC2557), EnumC4044.MPEG_TS);
                    interfaceC2557.mo7965(new C23548(1));
                    return c14600M35075;
                }
                EnumC4044 enumC4044M43504 = C18862.m43504(m11461(interfaceC2557));
                EnumC4044 enumC4044 = EnumC4044.NOT_MPEG_TS;
                if (enumC4044M43504 == enumC4044) {
                    interfaceC2557.mo7965((InterfaceC4968) null);
                    return C12560.m31247(interfaceC2557).f2943;
                }
                EnumC4044 enumC4045 = EnumC4044.MPEG_TS_WITHOUT_THUMBNAIL;
                if (enumC4044M43504 == enumC4045) {
                    interfaceC2557.mo7965(new C23548(1));
                    return C0690.f2907.f2943;
                }
                if (enumC4044M43504 == null) {
                    try {
                        InputStream inputStreamMo33970 = abstractC20745Mo11463.mo33970();
                        try {
                            EnumC4044 enumC4044M43503 = C18862.m43503(inputStreamMo33970);
                            if (inputStreamMo33970 != null) {
                                inputStreamMo33970.close();
                            }
                            C18862.m43510(m11461(interfaceC2557), enumC4044M43503);
                            if (enumC4044M43503 == enumC4044) {
                                interfaceC2557.mo7965((InterfaceC4968) null);
                                return C12560.m31247(interfaceC2557).f2943;
                            }
                        } catch (Throwable th3) {
                            if (inputStreamMo33970 != null) {
                                try {
                                    inputStreamMo33970.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                break;
                            }
                            throw th3;
                        }
                    } catch (IOException unused3) {
                        return C0690.f2907.f2943;
                    }
                }
                interfaceC2557.mo7965(new C23548(1));
                final AtomicReference atomicReference = new AtomicReference();
                C14600 c14600M42375 = C18225.m42373(lowerCase, C0690.f2907, false, new InterfaceC16464() { // from class: l.۬ܰ֨
                    @Override // l.InterfaceC16464
                    /* JADX INFO: renamed from: ۙ */
                    public final Bitmap mo947() {
                        C6867 c6867M15053 = C5443.m15053(abstractC20745Mo11463);
                        atomicReference.set(c6867M15053);
                        return c6867M15053.m18487();
                    }
                });
                C6867 c6867 = (C6867) atomicReference.get();
                if (c6867 != null && c6867.m18488()) {
                    C18862.m43510(m11461(interfaceC2557), enumC4045);
                }
                return c14600M42375;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m11461(InterfaceC2557 interfaceC2557) {
        return C18862.m43501("local:" + interfaceC2557.getPath() + (char) 0 + interfaceC2557.getSize() + (char) 0 + interfaceC2557.getTime(), interfaceC2557, interfaceC2557.getTime());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m11462() {
        return ApplicationC0716.f2988.getBoolean("external_storage_thumb_enable", true);
    }
}
