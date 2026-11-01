package l;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۖ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D9TI */
/* JADX INFO: loaded from: classes3.dex */
public final class C2539 extends C18225 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static long f10046;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean f10047;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ConnectivityManager f10048 = (ConnectivityManager) C16737.m39287("connectivity");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f10049 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f10050;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static int f10051;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f10052;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC12068 f10053;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f10054;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7293 f10055;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static synchronized void m7915() {
        if (f10049) {
            f10049 = false;
            f10047 = ApplicationC0716.f2988.getBoolean("network_thumb_enable", true);
            f10050 = ApplicationC0716.f2988.getBoolean("network_thumb_only_load_on_wifi", true);
            f10051 = ApplicationC0716.f2988.getInt("network_thumb_time_limit", 10);
            f10046 = AbstractC12068.m29987(ApplicationC0716.f2988.getString("network_thumb_image_file_size_limit", "10MB"));
        }
    }

    public C2539(AbstractC12233 abstractC12233) {
        this.f10052 = abstractC12233;
        this.f10055 = new C7293(abstractC12233);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m7921() {
        f10049 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m7922() {
        AbstractC12068 abstractC12068 = this.f10052.f40874;
        if (abstractC12068.f40393) {
            return f10047;
        }
        return abstractC12068.f40388;
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0690 mo7924(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985()) {
            if (C18862.m43511(interfaceC2557.getSize(), interfaceC2557.getPath())) {
                EnumC4044 enumC4044M43504 = C18862.m43504(C18862.m43501("network:" + m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()));
                if (enumC4044M43504 == EnumC4044.NOT_MPEG_TS) {
                    interfaceC2557.mo7965((InterfaceC4968) null);
                } else {
                    if (enumC4044M43504 != EnumC4044.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC4044M43504 == EnumC4044.MPEG_TS) {
                            interfaceC2557.mo7965(new C2894());
                        }
                        return C0690.f2919;
                    }
                    interfaceC2557.mo7965(new C2894());
                    return C0690.f2907;
                }
            }
        }
        return C12560.m31247(interfaceC2557);
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo7926(InterfaceC2557 interfaceC2557) {
        long j;
        long j2;
        m7915();
        if (m7922() && interfaceC2557.mo7985()) {
            if (C18862.m43514(interfaceC2557.getPath())) {
                if (!C18862.m43511(interfaceC2557.getSize(), interfaceC2557.getPath()) || Build.VERSION.SDK_INT < 23) {
                    interfaceC2557.mo7975(0);
                    return 0;
                }
                EnumC4044 enumC4044M43504 = C18862.m43504(C18862.m43501("network:" + m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()));
                if (enumC4044M43504 == EnumC4044.NOT_MPEG_TS) {
                    interfaceC2557.mo7965((InterfaceC4968) null);
                    interfaceC2557.mo7975(0);
                    return 0;
                }
                if (enumC4044M43504 != EnumC4044.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC4044M43504 != EnumC4044.MPEG_TS) {
                        return 12;
                    }
                    interfaceC2557.mo7965(new C2894());
                    return 12;
                }
                interfaceC2557.mo7965(new C2894());
                interfaceC2557.mo7975(0);
                return 0;
            }
            String strMo7967 = interfaceC2557.mo7967();
            boolean zEquals = strMo7967.equals("image/svg+xml");
            AbstractC12233 abstractC12233 = this.f10052;
            if (zEquals) {
                long size = interfaceC2557.getSize();
                AbstractC12068 abstractC12068 = abstractC12233.f40874;
                if (abstractC12068.f40393) {
                    j2 = f10046;
                } else {
                    j2 = abstractC12068.f40391;
                }
                if (size < j2) {
                    return 2;
                }
            }
            if (strMo7967.startsWith("image/")) {
                long size2 = interfaceC2557.getSize();
                AbstractC12068 abstractC12069 = abstractC12233.f40874;
                if (abstractC12069.f40393) {
                    j = f10046;
                } else {
                    j = abstractC12069.f40391;
                }
                if (size2 < j) {
                    return 1;
                }
            }
            String name = interfaceC2557.getName();
            int i = C6619.f22317;
            if (C11122.m28043(name)) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 23 && strMo7967.startsWith("video/")) {
                return 4;
            }
        }
        return 0;
    }

    @Override // l.C18225
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo7923(InterfaceC2557 interfaceC2557, int i) {
        m7915();
        if (m7922()) {
            return m7920(interfaceC2557);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14600 m7919(String str, C0690 c0690, C0690 c0691, InterfaceC16464 interfaceC16464) {
        boolean z;
        int i;
        m7915();
        if (!m7922()) {
            return c0691.f2943;
        }
        if (C18225.m42378(str)) {
            return c0690.f2943;
        }
        if (C18225.m42377(str)) {
            return c0691.f2943;
        }
        ConnectivityManager connectivityManager = f10048;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            AbstractC12233 abstractC12233 = this.f10052;
            AbstractC12068 abstractC12068 = abstractC12233.f40874;
            if (abstractC12068.f40393) {
                z = f10050;
            } else {
                z = abstractC12068.f40392;
            }
            if (!z || (activeNetworkInfo.getType() & 9) != 0) {
                try {
                    AbstractC12068 abstractC12069 = abstractC12233.f40874;
                    if (abstractC12069.f40393) {
                        i = f10051;
                    } else {
                        i = abstractC12069.f40390;
                    }
                    C14600 c14600M35070 = C14600.m35070(C17169.m40092(str, interfaceC16464, i));
                    if (c14600M35070 != null) {
                        return c14600M35070;
                    }
                    C14600 c14600 = c0690.f2943;
                    C18225.m42372(str);
                    return c14600;
                } catch (TimeoutException unused) {
                    C18225.m42376(str);
                    return c0691.f2943;
                }
            }
        }
        Bitmap bitmapM40091 = C17169.m40091(str);
        if (bitmapM40091 != null) {
            return C14600.m35070(bitmapM40091);
        }
        return c0691.f2943;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m7916(C2539 c2539, InterfaceC2557 interfaceC2557) {
        return C5443.m15055(new C23357(new C9246(new C8398(c2539.f10052, interfaceC2557), interfaceC2557.getName(), interfaceC2557.getSize())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m7917(C2539 c2539, InterfaceC2557 interfaceC2557, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C23357 c23357 = new C23357(new C9246(new C8398(c2539.f10052, interfaceC2557), interfaceC2557.getName(), interfaceC2557.getSize()));
        boolean z = false;
        try {
            try {
                if (((EnumC4044) atomicReference.get()) == null) {
                    EnumC4044 enumC4044M43502 = C18862.m43502(c23357);
                    atomicReference.set(enumC4044M43502);
                    C18862.m43510(C18862.m43501("network:" + c2539.m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()), enumC4044M43502);
                    if (enumC4044M43502 == EnumC4044.NOT_MPEG_TS) {
                        C19431.m44468(c23357);
                        return null;
                    }
                }
                interfaceC2557.mo7965(new C2894());
                z = true;
                try {
                    C6867 c6867M15050 = C5443.m15050(c23357);
                    atomicReference2.set(c6867M15050);
                    return c6867M15050.m18487();
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (!z) {
                    C19431.m44468(c23357);
                }
                throw th;
            }
        } catch (IOException unused2) {
            C19431.m44468(c23357);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private String m7920(InterfaceC2557 interfaceC2557) {
        return C22253.m49423(this.f10052.mo10276() + interfaceC2557.getPath() + interfaceC2557.getSize() + interfaceC2557.getTime()).toLowerCase();
    }

    @Override // l.C18225, l.InterfaceC13848
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14600 mo7925(AbstractC11462 abstractC11462, final InterfaceC2557 interfaceC2557, int i) {
        String strM7920;
        C14600 c14600M35070;
        C0690 c0690M31247;
        if (i == 12) {
            MessageDigest messageDigestM49421 = C22253.m49421();
            C22253.m49418(messageDigestM49421, m7914(interfaceC2557));
            strM7920 = C22253.m49424(messageDigestM49421.digest());
        } else {
            strM7920 = m7920(interfaceC2557);
        }
        if (i == 12) {
            strM7920 = C18862.m43501(strM7920, interfaceC2557, interfaceC2557.getTime());
        }
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                AbstractC12233 abstractC12233 = this.f10052;
                ConnectivityManager connectivityManager = f10048;
                if (i == 4) {
                    String name = interfaceC2557.getName();
                    int i3 = C6619.f22317;
                    if (C11122.m28043(name)) {
                        m7915();
                        C0690 c0690Mo7924 = mo7924(interfaceC2557);
                        if (!m7922() || C18225.m42377(strM7920)) {
                            return c0690Mo7924.f2943;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            AbstractC12068 abstractC12068 = abstractC12233.f40874;
                            if (!(abstractC12068.f40393 ? f10050 : abstractC12068.f40392) || (activeNetworkInfo.getType() & 9) != 0) {
                                AbstractC12068 abstractC12069 = abstractC12233.f40874;
                                C0974 c0974M17955 = C6619.m17955(abstractC12233, interfaceC2557, abstractC12069.f40393 ? f10051 : abstractC12069.f40390);
                                if (c0974M17955.m3766() == EnumC12970.SUCCESS && (c14600M35070 = C14600.m35070(c0974M17955.m3765())) != null) {
                                    return c14600M35070;
                                }
                                if (c0974M17955.m3766() == EnumC12970.TIMEOUT) {
                                    C18225.m42376(strM7920);
                                } else if (c0974M17955.m3766() == EnumC12970.CORRUPT) {
                                    return C0690.f2907.f2943;
                                }
                                return c0690Mo7924.f2943;
                            }
                        }
                        return c0690Mo7924.f2943;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        C0690 c0690 = C0690.f2919;
                        return m7919(strM7920, c0690, c0690, new C23312(i2, this, interfaceC2557));
                    }
                } else if (i == 12 && Build.VERSION.SDK_INT >= 23) {
                    C14600 c14600M35071 = C14600.m35070(C17169.m40091(strM7920));
                    if (c14600M35071 != null) {
                        C18862.m43510(C18862.m43501("network:" + m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()), EnumC4044.MPEG_TS);
                        interfaceC2557.mo7965(new C2894());
                        return c14600M35071;
                    }
                    EnumC4044 enumC4044M43504 = C18862.m43504(C18862.m43501("network:" + m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()));
                    EnumC4044 enumC4044 = EnumC4044.NOT_MPEG_TS;
                    if (enumC4044M43504 == enumC4044) {
                        interfaceC2557.mo7965((InterfaceC4968) null);
                        return C12560.m31247(interfaceC2557).f2943;
                    }
                    EnumC4044 enumC4045 = EnumC4044.MPEG_TS_WITHOUT_THUMBNAIL;
                    if (enumC4044M43504 == enumC4045) {
                        interfaceC2557.mo7965(new C2894());
                        return C0690.f2907.f2943;
                    }
                    if (C18225.m42377(strM7920)) {
                        return C0690.f2907.f2943;
                    }
                    NetworkInfo activeNetworkInfo2 = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (m7922() && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                        AbstractC12068 abstractC120610 = abstractC12233.f40874;
                        if (!(abstractC120610.f40393 ? f10050 : abstractC120610.f40392) || (activeNetworkInfo2.getType() & 9) != 0) {
                            AtomicReference atomicReference = new AtomicReference(enumC4044M43504);
                            AtomicReference atomicReference2 = new AtomicReference();
                            try {
                                C2038 c2038 = new C2038(this, interfaceC2557, atomicReference, atomicReference2);
                                AbstractC12068 abstractC120611 = abstractC12233.f40874;
                                Bitmap bitmapM40092 = C17169.m40092(strM7920, c2038, abstractC120611.f40393 ? f10051 : abstractC120611.f40390);
                                EnumC4044 enumC4046 = (EnumC4044) atomicReference.get();
                                if (bitmapM40092 != null) {
                                    C18862.m43510(C18862.m43501("network:" + m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()), EnumC4044.MPEG_TS);
                                    interfaceC2557.mo7965(new C2894());
                                    C14600 c14600M35072 = C14600.m35070(bitmapM40092);
                                    return c14600M35072 != null ? c14600M35072 : C0690.f2907.f2943;
                                }
                                if (enumC4046 == enumC4044) {
                                    interfaceC2557.mo7965((InterfaceC4968) null);
                                    return C12560.m31247(interfaceC2557).f2943;
                                }
                                if (enumC4046 == EnumC4044.MPEG_TS) {
                                    interfaceC2557.mo7965(new C2894());
                                }
                                C6867 c6867 = (C6867) atomicReference2.get();
                                if (c6867 != null && c6867.m18488()) {
                                    C18862.m43510(C18862.m43501("network:" + m7914(interfaceC2557), interfaceC2557, interfaceC2557.getTime()), enumC4045);
                                }
                                return C0690.f2907.f2943;
                            } catch (TimeoutException unused) {
                                EnumC4044 enumC4047 = (EnumC4044) atomicReference.get();
                                if (enumC4047 == EnumC4044.NOT_MPEG_TS) {
                                    interfaceC2557.mo7965((InterfaceC4968) null);
                                    c0690M31247 = C12560.m31247(interfaceC2557);
                                } else {
                                    if (enumC4047 == EnumC4044.MPEG_TS) {
                                        interfaceC2557.mo7965(new C2894());
                                    }
                                    C18225.m42376(strM7920);
                                    c0690M31247 = C0690.f2907;
                                }
                                return c0690M31247.f2943;
                            }
                        }
                    }
                    return C0690.f2907.f2943;
                }
                throw new RuntimeException();
            }
        }
        C0690 c0691 = C0690.f2906;
        return m7919(strM7920, c0691, c0691, new InterfaceC16464() { // from class: l.ۙ۬֨
            @Override // l.InterfaceC16464
            /* JADX INFO: renamed from: ۙ */
            public final Bitmap mo947() {
                C2539 c2539 = this.f16451;
                InterfaceC2557 interfaceC2558 = interfaceC2557;
                AbstractC20745 abstractC20745M46728 = C11904.f39941.m46728();
                ArrayList arrayList = new ArrayList();
                try {
                    return C5443.m15048(new C11713(c2539, arrayList, interfaceC2558, abstractC20745M46728));
                } finally {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C19431.m44468((InputStream) it.next());
                    }
                    abstractC20745M46728.mo24647();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m7914(InterfaceC2557 interfaceC2557) {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            AbstractC12068 abstractC12068 = this.f10052.f40874;
            if (this.f10054 == null || !abstractC12068.equals(this.f10053)) {
                AbstractC12068 abstractC12068Clone = abstractC12068.clone();
                MessageDigest messageDigestM49421 = C22253.m49421();
                messageDigestM49421.update(b.k.getBytes());
                C22253.m49418(messageDigestM49421, abstractC12068Clone.mo4706().toString());
                String strM49424 = C22253.m49424(messageDigestM49421.digest());
                this.f10054 = strM49424;
                this.f10053 = abstractC12068Clone;
                str = strM49424;
            } else {
                str = this.f10054;
            }
        }
        sb.append(str);
        sb.append((char) 0);
        sb.append(interfaceC2557.getPath());
        sb.append((char) 0);
        sb.append(interfaceC2557.getSize());
        sb.append((char) 0);
        sb.append(interfaceC2557.getTime());
        return sb.toString();
    }
}
