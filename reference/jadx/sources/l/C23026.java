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

/* JADX INFO: renamed from: l.᩸᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D9TI */
/* JADX INFO: loaded from: classes.dex */
public final class C23026 extends C2166 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long f74718;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f74720;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f74722;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f74723;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f74724;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3965 f74725;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f74726;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC0148 f74727;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ConnectivityManager f74719 = (ConnectivityManager) C21576.m49087("connectivity");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f74721 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static synchronized void m51923() {
        if (f74721) {
            f74721 = false;
            f74720 = ApplicationC17729.f58262.getBoolean("network_thumb_enable", true);
            f74722 = ApplicationC17729.f58262.getBoolean("network_thumb_only_load_on_wifi", true);
            f74723 = ApplicationC17729.f58262.getInt("network_thumb_time_limit", 10);
            f74718 = AbstractC0148.m1314(ApplicationC17729.f58262.getString("network_thumb_image_file_size_limit", "10MB"));
        }
    }

    public C23026(AbstractC18881 abstractC18881) {
        this.f74724 = abstractC18881;
        this.f74725 = new C3965(abstractC18881);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m51926() {
        f74721 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m51922() {
        AbstractC0148 abstractC0148 = this.f74724.f61289;
        if (abstractC0148.f1126) {
            return f74720;
        }
        return abstractC0148.f1124;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m51924() {
        AbstractC0148 abstractC0148 = this.f74724.f61289;
        if (abstractC0148.f1126) {
            return f74723;
        }
        return abstractC0148.f1118;
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C20613 mo3626(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090()) {
            if (C4177.m13358(interfaceC2386.getSize(), interfaceC2386.getPath())) {
                EnumC23569 enumC23569M13354 = C4177.m13354(C4177.m13348("network:" + m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()));
                if (enumC23569M13354 == EnumC23569.NOT_MPEG_TS) {
                    interfaceC2386.mo8096((InterfaceC21941) null);
                } else {
                    if (enumC23569M13354 != EnumC23569.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (enumC23569M13354 == EnumC23569.MPEG_TS) {
                            interfaceC2386.mo8096(new C25064(1));
                        }
                        return C20613.f66065;
                    }
                    interfaceC2386.mo8096(new C25064(1));
                    return C20613.f66096;
                }
            }
        }
        return C8153.m22060(interfaceC2386);
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2786(InterfaceC2386 interfaceC2386) {
        long j;
        long j2;
        m51923();
        if (m51922() && interfaceC2386.mo8090()) {
            if (C4177.m13361(interfaceC2386.getPath())) {
                if (!C4177.m13358(interfaceC2386.getSize(), interfaceC2386.getPath()) || Build.VERSION.SDK_INT < 23) {
                    interfaceC2386.mo8109(0);
                    return 0;
                }
                EnumC23569 enumC23569M13354 = C4177.m13354(C4177.m13348("network:" + m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()));
                if (enumC23569M13354 == EnumC23569.NOT_MPEG_TS) {
                    interfaceC2386.mo8096((InterfaceC21941) null);
                    interfaceC2386.mo8109(0);
                    return 0;
                }
                if (enumC23569M13354 != EnumC23569.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (enumC23569M13354 != EnumC23569.MPEG_TS) {
                        return 12;
                    }
                    interfaceC2386.mo8096(new C25064(1));
                    return 12;
                }
                interfaceC2386.mo8096(new C25064(1));
                interfaceC2386.mo8109(0);
                return 0;
            }
            String strMo8114 = interfaceC2386.mo8114();
            boolean zEquals = strMo8114.equals("image/svg+xml");
            AbstractC18881 abstractC18881 = this.f74724;
            if (zEquals) {
                long size = interfaceC2386.getSize();
                AbstractC0148 abstractC0148 = abstractC18881.f61289;
                if (abstractC0148.f1126) {
                    j2 = f74718;
                } else {
                    j2 = abstractC0148.f1121;
                }
                if (size < j2) {
                    return 2;
                }
            }
            if (strMo8114.startsWith("image/")) {
                long size2 = interfaceC2386.getSize();
                AbstractC0148 abstractC0149 = abstractC18881.f61289;
                if (abstractC0149.f1126) {
                    j = f74718;
                } else {
                    j = abstractC0149.f1121;
                }
                if (size2 < j) {
                    return 1;
                }
            }
            String name = interfaceC2386.getName();
            int i = C6833.f22702;
            if (C22337.m50405(name)) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (strMo8114.startsWith("video/")) {
                    return 4;
                }
                if (strMo8114.startsWith("audio/") && interfaceC2386.getSize() > 0) {
                    return 13;
                }
            }
        }
        return 0;
    }

    @Override // l.C2166
    /* JADX INFO: renamed from: ۙ */
    public final String mo2784(InterfaceC2386 interfaceC2386, int i) {
        m51923();
        if (m51922()) {
            return m51921(interfaceC2386);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11983 m51920(String str, C20613 c20613, C20613 c20614, InterfaceC21100 interfaceC21100) {
        boolean z;
        m51923();
        if (!m51922()) {
            return c20614.f66114;
        }
        if (C2166.m7453(str)) {
            return c20613.f66114;
        }
        if (C2166.m7451(str)) {
            return c20614.f66114;
        }
        ConnectivityManager connectivityManager = f74719;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            AbstractC0148 abstractC0148 = this.f74724.f61289;
            if (abstractC0148.f1126) {
                z = f74722;
            } else {
                z = abstractC0148.f1119;
            }
            if (!z || (activeNetworkInfo.getType() & 9) != 0) {
                try {
                    C11983 c11983M30076 = C11983.m30076(C0217.m1667(str, interfaceC21100, m51924()));
                    if (c11983M30076 != null) {
                        return c11983M30076;
                    }
                    C11983 c11983 = c20613.f66114;
                    C2166.m7454(str);
                    return c11983;
                } catch (TimeoutException unused) {
                    C2166.m7452(str);
                    return c20614.f66114;
                }
            }
        }
        Bitmap bitmapM1666 = C0217.m1666(str);
        if (bitmapM1666 != null) {
            return C11983.m30076(bitmapM1666);
        }
        return c20614.f66114;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51917(C23026 c23026, InterfaceC2386 interfaceC2386) {
        return C8275.m22349(new C0894(new C8351(new C9842(c23026.f74724, interfaceC2386), interfaceC2386.getName(), interfaceC2386.getSize())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m51918(C23026 c23026, InterfaceC2386 interfaceC2386, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C0894 c0894 = new C0894(new C8351(new C9842(c23026.f74724, interfaceC2386), interfaceC2386.getName(), interfaceC2386.getSize()));
        boolean z = false;
        try {
            try {
                if (((EnumC23569) atomicReference.get()) == null) {
                    EnumC23569 enumC23569M13352 = C4177.m13352(c0894);
                    atomicReference.set(enumC23569M13352);
                    C4177.m13357(C4177.m13348("network:" + c23026.m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()), enumC23569M13352);
                    if (enumC23569M13352 == EnumC23569.NOT_MPEG_TS) {
                        C20244.m46520(c0894);
                        return null;
                    }
                }
                interfaceC2386.mo8096(new C25064(1));
                z = true;
                try {
                    C3431 c3431M22344 = C8275.m22344(c0894);
                    atomicReference2.set(c3431M22344);
                    return c3431M22344.m11193();
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (!z) {
                    C20244.m46520(c0894);
                }
                throw th;
            }
        } catch (IOException unused2) {
            C20244.m46520(c0894);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private String m51921(InterfaceC2386 interfaceC2386) {
        return C15022.m36181(this.f74724.mo35579() + interfaceC2386.getPath() + interfaceC2386.getSize() + interfaceC2386.getTime()).toLowerCase();
    }

    @Override // l.C2166, l.InterfaceC0895
    /* JADX INFO: renamed from: ۙ */
    public final C11983 mo2785(AbstractC7364 abstractC7364, final InterfaceC2386 interfaceC2386, int i) {
        String strM51921;
        C11983 c11983M30076;
        C20613 c20613M22060;
        if (i == 12) {
            MessageDigest messageDigestM36179 = C15022.m36179();
            C15022.m36176(messageDigestM36179, m51925(interfaceC2386));
            strM51921 = C15022.m36182(messageDigestM36179.digest());
        } else {
            strM51921 = m51921(interfaceC2386);
        }
        if (i == 12) {
            strM51921 = C4177.m13348(strM51921, interfaceC2386, interfaceC2386.getTime());
        }
        if (i == 1 || i == 2) {
            C20613 c20613 = C20613.f66095;
            return m51920(strM51921, c20613, c20613, new InterfaceC21100() { // from class: l.ۜۗ۫
                @Override // l.InterfaceC21100
                /* JADX INFO: renamed from: ᩷ */
                public final Bitmap mo6272() {
                    C23026 c23026 = this.f22781;
                    InterfaceC2386 interfaceC2387 = interfaceC2386;
                    AbstractC22044 abstractC22044M49877 = C6382.f21563.m49877();
                    ArrayList arrayList = new ArrayList();
                    try {
                        return C8275.m22342(new C11091(c23026, arrayList, interfaceC2387, abstractC22044M49877));
                    } finally {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C20244.m46520((InputStream) it.next());
                        }
                        abstractC22044M49877.mo4296();
                    }
                }
            });
        }
        ConnectivityManager connectivityManager = f74719;
        AbstractC18881 abstractC18881 = this.f74724;
        if (i == 4) {
            String name = interfaceC2386.getName();
            int i2 = C6833.f22702;
            if (C22337.m50405(name)) {
                m51923();
                C20613 c20613Mo3626 = mo3626(interfaceC2386);
                if (!m51922() || C2166.m7451(strM51921)) {
                    return c20613Mo3626.f66114;
                }
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    AbstractC0148 abstractC0148 = abstractC18881.f61289;
                    if (!(abstractC0148.f1126 ? f74722 : abstractC0148.f1119) || (activeNetworkInfo.getType() & 9) != 0) {
                        C9069 c9069M19041 = C6833.m19041(abstractC18881, interfaceC2386, m51924());
                        if (c9069M19041.m24206() == EnumC2358.SUCCESS && (c11983M30076 = C11983.m30076(c9069M19041.m24205())) != null) {
                            return c11983M30076;
                        }
                        if (c9069M19041.m24206() == EnumC2358.TIMEOUT) {
                            C2166.m7452(strM51921);
                        } else if (c9069M19041.m24206() == EnumC2358.CORRUPT) {
                            return C20613.f66096.f66114;
                        }
                        return c20613Mo3626.f66114;
                    }
                }
                return c20613Mo3626.f66114;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C20613 c20614 = C20613.f66065;
                return m51920(strM51921, c20614, c20614, new C19802(this, interfaceC2386));
            }
        } else if (i != 12) {
            if (i == 13 && Build.VERSION.SDK_INT >= 23 && interfaceC2386.getSize() > 0) {
                m51923();
                try {
                    final C1640 c1640 = new C1640(abstractC18881, interfaceC2386, m51924());
                    try {
                        C20613 c20615 = C20613.f66089;
                        C11983 c11983M51920 = m51920(strM51921, c20615, c20615, new InterfaceC21100() { // from class: l.۬ۗ۫
                            @Override // l.InterfaceC21100
                            /* JADX INFO: renamed from: ᩷ */
                            public final Bitmap mo6272() {
                                return C8542.m22857(c1640, interfaceC2386.getName()).m24499();
                            }
                        });
                        c1640.close();
                        return c11983M51920;
                    } catch (Throwable th) {
                        try {
                            c1640.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                }
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            C11983 c11983M30077 = C11983.m30076(C0217.m1666(strM51921));
            if (c11983M30077 != null) {
                C4177.m13357(C4177.m13348("network:" + m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()), EnumC23569.MPEG_TS);
                interfaceC2386.mo8096(new C25064(1));
                return c11983M30077;
            }
            EnumC23569 enumC23569M13354 = C4177.m13354(C4177.m13348("network:" + m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()));
            EnumC23569 enumC23569 = EnumC23569.NOT_MPEG_TS;
            if (enumC23569M13354 == enumC23569) {
                interfaceC2386.mo8096((InterfaceC21941) null);
                return C8153.m22060(interfaceC2386).f66114;
            }
            EnumC23569 enumC235610 = EnumC23569.MPEG_TS_WITHOUT_THUMBNAIL;
            if (enumC23569M13354 == enumC235610) {
                interfaceC2386.mo8096(new C25064(1));
                return C20613.f66096.f66114;
            }
            if (C2166.m7451(strM51921)) {
                return C20613.f66096.f66114;
            }
            NetworkInfo activeNetworkInfo2 = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (m51922() && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                AbstractC0148 abstractC0149 = abstractC18881.f61289;
                if (!(abstractC0149.f1126 ? f74722 : abstractC0149.f1119) || (activeNetworkInfo2.getType() & 9) != 0) {
                    final AtomicReference atomicReference = new AtomicReference(enumC23569M13354);
                    final AtomicReference atomicReference2 = new AtomicReference();
                    try {
                        Bitmap bitmapM1667 = C0217.m1667(strM51921, new InterfaceC21100() { // from class: l.ۙ᩵۫
                            @Override // l.InterfaceC21100
                            /* JADX INFO: renamed from: ᩷ */
                            public final Bitmap mo6272() {
                                return C23026.m51918(this.f17848, interfaceC2386, atomicReference, atomicReference2);
                            }
                        }, m51924());
                        EnumC23569 enumC235611 = (EnumC23569) atomicReference.get();
                        if (bitmapM1667 != null) {
                            C4177.m13357(C4177.m13348("network:" + m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()), EnumC23569.MPEG_TS);
                            interfaceC2386.mo8096(new C25064(1));
                            C11983 c11983M30078 = C11983.m30076(bitmapM1667);
                            return c11983M30078 != null ? c11983M30078 : C20613.f66096.f66114;
                        }
                        if (enumC235611 == enumC23569) {
                            interfaceC2386.mo8096((InterfaceC21941) null);
                            return C8153.m22060(interfaceC2386).f66114;
                        }
                        if (enumC235611 == EnumC23569.MPEG_TS) {
                            interfaceC2386.mo8096(new C25064(1));
                        }
                        C3431 c3431 = (C3431) atomicReference2.get();
                        if (c3431 != null && c3431.m11194()) {
                            C4177.m13357(C4177.m13348("network:" + m51925(interfaceC2386), interfaceC2386, interfaceC2386.getTime()), enumC235610);
                        }
                        return C20613.f66096.f66114;
                    } catch (TimeoutException unused2) {
                        EnumC23569 enumC235612 = (EnumC23569) atomicReference.get();
                        if (enumC235612 == EnumC23569.NOT_MPEG_TS) {
                            interfaceC2386.mo8096((InterfaceC21941) null);
                            c20613M22060 = C8153.m22060(interfaceC2386);
                        } else {
                            if (enumC235612 == EnumC23569.MPEG_TS) {
                                interfaceC2386.mo8096(new C25064(1));
                            }
                            C2166.m7452(strM51921);
                            c20613M22060 = C20613.f66096;
                        }
                        return c20613M22060.f66114;
                    }
                }
            }
            return C20613.f66096.f66114;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m51925(InterfaceC2386 interfaceC2386) {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            AbstractC0148 abstractC0148 = this.f74724.f61289;
            if (this.f74726 == null || !abstractC0148.equals(this.f74727)) {
                AbstractC0148 abstractC0148Clone = abstractC0148.clone();
                MessageDigest messageDigestM36179 = C15022.m36179();
                messageDigestM36179.update(b.k.getBytes());
                C15022.m36176(messageDigestM36179, abstractC0148Clone.mo1331().toString());
                String strM36182 = C15022.m36182(messageDigestM36179.digest());
                this.f74726 = strM36182;
                this.f74727 = abstractC0148Clone;
                str = strM36182;
            } else {
                str = this.f74726;
            }
        }
        sb.append(str);
        sb.append((char) 0);
        sb.append(interfaceC2386.getPath());
        sb.append((char) 0);
        sb.append(interfaceC2386.getSize());
        sb.append((char) 0);
        sb.append(interfaceC2386.getTime());
        return sb.toString();
    }
}
