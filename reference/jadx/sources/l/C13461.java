package l;

import android.net.Uri;
import bin.mt.plus.R;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I23M */
/* JADX INFO: loaded from: classes4.dex */
public class C13461 extends C2166 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C13461 f42854 = new C13461();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f42855 = Pattern.compile("/data/user(_de)?/\\d+/");

    @Override // l.C2166
    /* JADX INFO: renamed from: ۙ */
    public final String mo2784(InterfaceC2386 interfaceC2386, int i) {
        AbstractC22044 abstractC22044Mo22441 = mo22441(interfaceC2386);
        abstractC22044Mo22441.getClass();
        if ((abstractC22044Mo22441 instanceof C15593) && !m33107()) {
            return null;
        }
        if (i == 1 && interfaceC2386.getSize() > 268435456) {
            return null;
        }
        String path = interfaceC2386.getPath();
        long size = interfaceC2386.getSize();
        long time = interfaceC2386.getTime();
        int i2 = C0217.f1419;
        return C15022.m36181(path + size + time).toLowerCase();
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C20613 mo3626(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090()) {
            if (C4177.m13358(interfaceC2386.getSize(), interfaceC2386.getPath())) {
                EnumC23569 enumC23569M13354 = C4177.m13354(m33108(interfaceC2386));
                if (enumC23569M13354 == EnumC23569.NOT_MPEG_TS) {
                    interfaceC2386.mo8096((InterfaceC21941) null);
                } else {
                    if (enumC23569M13354 != EnumC23569.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC23569M13354 == EnumC23569.MPEG_TS) {
                            interfaceC2386.mo8096(new C15698());
                        }
                        return C20613.f66065;
                    }
                    interfaceC2386.mo8096(new C15698());
                    return C20613.f66096;
                }
            }
        }
        C20613 c20613M22060 = C8153.m22060(interfaceC2386);
        if (c20613M22060 == C20613.f66060) {
            String lowerCase = interfaceC2386.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C20613.f66102;
            }
            if ((interfaceC2386 instanceof C6004) && interfaceC2386.getParent().endsWith("/keys/") && (lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc") || lowerCase.endsWith(".pk8") || lowerCase.endsWith(".x509.pem"))) {
                return C20613.f66066;
            }
        }
        return c20613M22060;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:148:0x020c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0256 A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2786(InterfaceC2386 interfaceC2386) {
        byte b = 9;
        if (interfaceC2386.mo8090()) {
            if (C4177.m13361(interfaceC2386.getPath())) {
                if (!C4177.m13358(interfaceC2386.getSize(), interfaceC2386.getPath())) {
                    interfaceC2386.mo8109(0);
                    return 0;
                }
                EnumC23569 enumC23569M13354 = C4177.m13354(m33108(interfaceC2386));
                if (enumC23569M13354 == EnumC23569.NOT_MPEG_TS) {
                    interfaceC2386.mo8096((InterfaceC21941) null);
                    interfaceC2386.mo8109(0);
                    return 0;
                }
                if (enumC23569M13354 != EnumC23569.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC23569M13354 == EnumC23569.MPEG_TS) {
                        interfaceC2386.mo8096(new C15698());
                    }
                    return 12;
                }
                interfaceC2386.mo8096(new C15698());
                interfaceC2386.mo8109(0);
                return 0;
            }
            String strMo8114 = interfaceC2386.mo8114();
            if (strMo8114.equals("image/svg+xml")) {
                return 2;
            }
            if (strMo8114.equals("text/xml")) {
                return 3;
            }
            if (strMo8114.startsWith("image/")) {
                return 1;
            }
            if (strMo8114.startsWith("video/")) {
                return 4;
            }
            if (strMo8114.startsWith("audio/")) {
                return 13;
            }
            if (strMo8114.equals("application/vnd.android.package-archive")) {
                return 5;
            }
            if (strMo8114.equals("application/vnd.android.package-archives")) {
                return 11;
            }
            if (strMo8114.equals("application/mt-plugin")) {
                return 6;
            }
            String lowerCase = interfaceC2386.getName().toLowerCase();
            if (lowerCase.endsWith(".bak") && !lowerCase.endsWith(".bak.bak")) {
                return 9;
            }
        }
        if (interfaceC2386.isDirectory() && (interfaceC2386 instanceof C6004)) {
            if (((C6004) interfaceC2386).m17451()) {
                return 10;
            }
            String lowerCase2 = interfaceC2386.getParent().toLowerCase();
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
                        b = cb.f82047l;
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
                    if ((!lowerCase2.startsWith("/data/user") || C24276.m54279(lowerCase2, '/') != 4 || !f42855.matcher(lowerCase2).matches()) && !lowerCase2.endsWith("/android/data/") && !lowerCase2.endsWith("/android/obb/") && !lowerCase2.endsWith("/android/media/")) {
                        if (lowerCase2.startsWith("/data/app/") && "/data/app/".equals(C11293.m28556(lowerCase2))) {
                            return 8;
                        }
                    }
                    return 7;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ */
    public AbstractC22044 mo22441(InterfaceC2386 interfaceC2386) {
        return interfaceC2386.mo8093();
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C11983 mo2785(AbstractC7364 abstractC7364, InterfaceC2386 interfaceC2386, int i) {
        C11983 c11983M30076;
        String path = interfaceC2386.getPath();
        long size = interfaceC2386.getSize();
        long time = interfaceC2386.getTime();
        int i2 = C0217.f1419;
        String lowerCase = C15022.m36181(path + size + time).toLowerCase();
        if (i == 12) {
            lowerCase = C4177.m13348(lowerCase, interfaceC2386, interfaceC2386.getTime());
        }
        AbstractC22044 abstractC22044Mo22441 = mo22441(interfaceC2386);
        int i3 = 3;
        C11983 c11983M30077 = null;
        switch (i) {
            case 1:
                abstractC22044Mo22441.getClass();
                if ((!(abstractC22044Mo22441 instanceof C15593) || m33107()) && interfaceC2386.getSize() <= 268435456) {
                    return C2166.m7448(lowerCase, C20613.f66070, true, new C21029(abstractC22044Mo22441));
                }
                return mo3626(interfaceC2386).f66114;
            case 2:
                abstractC22044Mo22441.getClass();
                return (!(abstractC22044Mo22441 instanceof C15593) || m33107()) ? C2166.m7448(lowerCase, C20613.f66070, true, new C17365(abstractC22044Mo22441)) : mo3626(interfaceC2386).f66114;
            case 3:
                abstractC22044Mo22441.getClass();
                if ((abstractC22044Mo22441 instanceof C15593) && !m33107()) {
                    return mo3626(interfaceC2386).f66114;
                }
                C20613 c20613 = C20613.f66051;
                C11983 c11983M7448 = C2166.m7448(lowerCase, c20613, true, new C7256(i3, abstractC22044Mo22441));
                if (c11983M7448 != c20613.f66114) {
                    interfaceC2386.mo8110(R.id.MT_Protector, Boolean.TRUE);
                }
                return c11983M7448;
            case 4:
                abstractC22044Mo22441.getClass();
                if ((abstractC22044Mo22441 instanceof C15593) && !m33107()) {
                    return mo3626(interfaceC2386).f66114;
                }
                String name = interfaceC2386.getName();
                int i4 = C6833.f22702;
                if (!C22337.m50405(name)) {
                    return C2166.m7448(lowerCase, C20613.f66096, true, new C18136(abstractC22044Mo22441));
                }
                C9069 c9069M19041 = C6833.m19041(abstractC7364 == null ? C11969.f38536 : abstractC7364.mo10174(), interfaceC2386, 5);
                if (c9069M19041.m24206() != EnumC2358.SUCCESS || (c11983M30076 = C11983.m30076(c9069M19041.m24205())) == null) {
                    return c9069M19041.m24206() == EnumC2358.CORRUPT ? C20613.f66096.f66114 : mo3626(interfaceC2386).f66114;
                }
                return c11983M30076;
            case 5:
                abstractC22044Mo22441.getClass();
                return (!(abstractC22044Mo22441 instanceof C15593) || m33107()) ? C2166.m7448(lowerCase, C20613.f66074, false, new C24499(abstractC22044Mo22441)) : mo3626(interfaceC2386).f66114;
            case 6:
                abstractC22044Mo22441.getClass();
                return (!(abstractC22044Mo22441 instanceof C15593) || m33107()) ? C2166.m7448(lowerCase, C20613.f66097, true, new C5087(4, abstractC22044Mo22441)) : mo3626(interfaceC2386).f66114;
            case 7:
                C11983 c11983M30078 = C11983.m30077(RunnableC21479.m48872(interfaceC2386.getName()));
                return c11983M30078 == null ? C20613.f66109.f66114 : c11983M30078;
            case 8:
                C11983 c11983M30079 = C11983.m30077(RunnableC21479.m48877(abstractC22044Mo22441.mo4294()));
                return c11983M30079 == null ? C20613.f66109.f66114 : c11983M30079;
            case 9:
                try {
                    C13961 c13961M49855 = abstractC22044Mo22441.m49855("r");
                    try {
                        int i5 = C1639.f5665;
                        C11983 c11983 = ((c13961M49855.length() > 40 && c13961M49855.readInt() == 1230326093 && c13961M49855.readInt() == 1128350240 && c13961M49855.readInt() == 173036875) ? C20613.f66099 : C20613.f66060).f66114;
                        c13961M49855.close();
                        return c11983;
                    } catch (Throwable th) {
                        try {
                            c13961M49855.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    return C20613.f66060.f66114;
                }
            case 10:
                try {
                    Uri uri = ((C6004) interfaceC2386).m17452().f81685;
                    int i6 = C17085.f55774;
                    if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                        c11983M30077 = C11983.m30077(RunnableC21479.m48872(C17085.m40237(uri)));
                    }
                    break;
                } catch (Exception unused2) {
                }
                return c11983M30077 == null ? C20613.f66109.f66114 : c11983M30077;
            case 11:
                abstractC22044Mo22441.getClass();
                if ((abstractC22044Mo22441 instanceof C15593) && !m33107()) {
                    return mo3626(interfaceC2386).f66114;
                }
                C20613 c20614 = C20613.f66048;
                C11983 c11983M7449 = C2166.m7448(lowerCase, c20614, true, new C19241(abstractC22044Mo22441));
                if (c11983M7449 == c20614.f66114) {
                    return c11983M7449;
                }
                C11983 c11983M300710 = C11983.m30077(RunnableC21479.m48873(c11983M7449, lowerCase));
                C17359.requireNonNull(c11983M300710);
                return c11983M300710;
            case 12:
                C11983 c11983M300711 = C11983.m30076(C0217.m1666(lowerCase));
                if (c11983M300711 != null) {
                    C4177.m13357(m33108(interfaceC2386), EnumC23569.MPEG_TS);
                    interfaceC2386.mo8096(new C15698());
                    return c11983M300711;
                }
                EnumC23569 enumC23569M13354 = C4177.m13354(m33108(interfaceC2386));
                EnumC23569 enumC23569 = EnumC23569.NOT_MPEG_TS;
                if (enumC23569M13354 == enumC23569) {
                    interfaceC2386.mo8096((InterfaceC21941) null);
                    return C8153.m22060(interfaceC2386).f66114;
                }
                EnumC23569 enumC235610 = EnumC23569.MPEG_TS_WITHOUT_THUMBNAIL;
                if (enumC23569M13354 == enumC235610) {
                    interfaceC2386.mo8096(new C15698());
                    return C20613.f66096.f66114;
                }
                if (enumC23569M13354 == null) {
                    try {
                        InputStream inputStreamMo4290 = abstractC22044Mo22441.mo4290();
                        try {
                            EnumC23569 enumC23569M13353 = C4177.m13353(inputStreamMo4290);
                            if (inputStreamMo4290 != null) {
                                inputStreamMo4290.close();
                            }
                            C4177.m13357(m33108(interfaceC2386), enumC23569M13353);
                            if (enumC23569M13353 == enumC23569) {
                                interfaceC2386.mo8096((InterfaceC21941) null);
                                return C8153.m22060(interfaceC2386).f66114;
                            }
                        } catch (Throwable th3) {
                            if (inputStreamMo4290 != null) {
                                try {
                                    inputStreamMo4290.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                break;
                            }
                            throw th3;
                        }
                    } catch (IOException unused3) {
                        return C20613.f66096.f66114;
                    }
                }
                interfaceC2386.mo8096(new C15698());
                AtomicReference atomicReference = new AtomicReference();
                C11983 c11983M74410 = C2166.m7448(lowerCase, C20613.f66096, false, new C16093(abstractC22044Mo22441, atomicReference));
                C3431 c3431 = (C3431) atomicReference.get();
                if (c3431 != null && c3431.m11194()) {
                    C4177.m13357(m33108(interfaceC2386), enumC235610);
                }
                return c11983M74410;
            case 13:
                abstractC22044Mo22441.getClass();
                return (!(abstractC22044Mo22441 instanceof C15593) || m33107()) ? C2166.m7448(lowerCase, C20613.f66089, true, new C6599(i3, abstractC22044Mo22441)) : mo3626(interfaceC2386).f66114;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m33108(InterfaceC2386 interfaceC2386) {
        return C4177.m13348("local:" + interfaceC2386.getPath() + (char) 0 + interfaceC2386.getSize() + (char) 0 + interfaceC2386.getTime(), interfaceC2386, interfaceC2386.getTime());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m33107() {
        return ApplicationC17729.f58262.getBoolean("external_storage_thumb_enable", true);
    }
}
