package l;

import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes.dex */
public final class C22354 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m50422(AbstractC22044 abstractC22044) {
        C22941 c22941 = new C22941(abstractC22044);
        try {
            Iterator it = c22941.m51742().iterator();
            while (it.hasNext()) {
                C8002 c8002 = (C8002) it.next();
                String name = c8002.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    if (c22941.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF") != null) {
                        try {
                            byte[] encoded = new C7349(c22941.m51731(c8002, (C3374) null)).m20170()[0].getEncoded();
                            c22941.close();
                            return encoded;
                        } catch (Exception unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            c22941.close();
            return null;
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50420(AbstractC22044 abstractC22044, C14872 c14872, InterfaceC7509 interfaceC7509) {
        C24570 c24570 = c14872.f48604;
        C24570 c24571 = c14872.f48602;
        C24570 c24572 = c14872.f48601;
        C22941 c22941 = new C22941(abstractC22044);
        try {
            boolean zM20169 = false;
            byte[] bArrM51731 = null;
            for (C8002 c8002 : c22941.m51742()) {
                String name = c8002.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    C8002 entry = c22941.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF");
                    if (entry != null) {
                        try {
                            C7349 c7349 = new C7349(c22941.m51731(c8002, (C3374) null));
                            bArrM51731 = c22941.m51731(entry, (C3374) null);
                            zM20169 = c7349.m20169(bArrM51731);
                        } catch (Exception unused) {
                        }
                        if (zM20169) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C8002 entry2 = c22941.getEntry("META-INF/MANIFEST.MF");
            byte[] bArrM51732 = entry2 != null ? c22941.m51731(entry2, (C3374) null) : null;
            if (zM20169 && bArrM51732 != null) {
                C5200 c5200 = new C5200(bArrM51732);
                C5200 c5201 = new C5200(bArrM51731);
                String strM14888 = c5201.f18139.m14888("X-Android-APK-Signed");
                if (strM14888 != null) {
                    for (String str : strM14888.split(",")) {
                        String strTrim = str.trim();
                        switch (strTrim.hashCode()) {
                            case 50:
                                if (strTrim.equals("2") && c24570.f79639.m14096()) {
                                    c24570.f79639 = EnumC4432.MISSING;
                                }
                                break;
                            case 51:
                                if (strTrim.equals("3") && c24571.f79639.m14096()) {
                                    c24571.f79639 = EnumC4432.MISSING;
                                }
                                break;
                            case 52:
                                if (strTrim.equals("4") && c24572.f79639.m14096()) {
                                    c24572.f79639 = EnumC4432.MISSING;
                                }
                                break;
                        }
                    }
                }
                if (!interfaceC7509.mo924()) {
                    if (m50419(c5201, c5200, bArrM51732)) {
                        try {
                            boolean zM50421 = m50421(c22941, c5200, interfaceC7509);
                            c22941.close();
                            return zM50421;
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    c22941.close();
                    return false;
                }
            }
            c22941.close();
            return false;
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50419(C5200 c5200, C5200 c5201, byte[] bArr) {
        C13797 c13797 = new C13797(new C20503(1));
        C13797 c13798 = new C13797(new C12298(1));
        C13797 c13799 = new C13797(new C6333(1));
        C13797 c137910 = new C13797(new C24233(1));
        C4849 c4849 = c5200.f18139;
        String strM14888 = c4849.m14888("SHA-256-Digest-Manifest");
        if (strM14888 != null) {
            if (Base64.encodeToString(((MessageDigest) c13798.m33706()).digest(bArr), 2).equals(strM14888)) {
                return true;
            }
        } else {
            String strM14889 = c4849.m14888("SHA1-Digest-Manifest");
            if (strM14889 != null) {
                if (Base64.encodeToString(((MessageDigest) c13797.m33706()).digest(bArr), 2).equals(strM14889)) {
                    return true;
                }
            } else {
                String strM148810 = c4849.m14888("SHA-512-Digest-Manifest");
                if (strM148810 != null) {
                    if (Base64.encodeToString(((MessageDigest) c137910.m33706()).digest(bArr), 2).equals(strM148810)) {
                        return true;
                    }
                } else {
                    String strM148811 = c4849.m14888("SHA-384-Digest-Manifest");
                    if (strM148811 != null && Base64.encodeToString(((MessageDigest) c13799.m33706()).digest(bArr), 2).equals(strM148811)) {
                        return true;
                    }
                }
            }
        }
        for (C4849 c48410 : c5200.f18140.values()) {
            C4849 c48411 = (C4849) c5201.f18140.get(c48410.m14891());
            if (c48411 == null) {
                return false;
            }
            String strM148812 = c48410.m14888("SHA256-Digest");
            if (strM148812 != null) {
                ((MessageDigest) c13798.m33706()).update(bArr, c48411.m14892(), c48411.m14890());
                if (!Base64.encodeToString(((MessageDigest) c13798.m33706()).digest(), 2).equals(strM148812)) {
                    return false;
                }
            } else {
                String strM148813 = c48410.m14888("SHA1-Digest");
                if (strM148813 != null) {
                    ((MessageDigest) c13797.m33706()).update(bArr, c48411.m14892(), c48411.m14890());
                    if (!Base64.encodeToString(((MessageDigest) c13797.m33706()).digest(), 2).equals(strM148813)) {
                        return false;
                    }
                } else {
                    String strM148814 = c48410.m14888("SHA512-Digest");
                    if (strM148814 != null) {
                        ((MessageDigest) c137910.m33706()).update(bArr, c48411.m14892(), c48411.m14890());
                        if (!Base64.encodeToString(((MessageDigest) c137910.m33706()).digest(), 2).equals(strM148814)) {
                            return false;
                        }
                    } else {
                        String strM148815 = c48410.m14888("SHA384-Digest");
                        if (strM148815 == null) {
                            return false;
                        }
                        ((MessageDigest) c13799.m33706()).update(bArr, c48411.m14892(), c48411.m14890());
                        if (!Base64.encodeToString(((MessageDigest) c13799.m33706()).digest(), 2).equals(strM148815)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50421(C22941 c22941, C5200 c5200, InterfaceC7509 interfaceC7509) throws IOException {
        long jM21838;
        ThreadLocal threadLocal;
        HashMap map = new HashMap(c22941.m51749());
        C1170.stream(c22941.m51742()).filter(new C7832()).forEach(new C17263(1, map));
        C1120 c1120 = new C1120();
        C2611 c2611 = new C2611();
        C8577 c8577 = new C8577();
        C7086 c7086 = new C7086();
        C15481 c15481M51723 = c22941.m51723();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = null;
        AtomicReference atomicReference = new AtomicReference(null);
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        long j2 = 0;
        for (C4849 c4849 : c5200.f18140.values()) {
            String strM14891 = c4849.m14891();
            C8002 c8002 = (C8002) map.remove(strM14891);
            if (c8002 == null) {
                if (C0374.m2172(strM14891)) {
                    return false;
                }
            } else {
                String strM14888 = c4849.m14888("SHA-256-Digest");
                if (strM14888 != null) {
                    threadLocal = c2611;
                } else {
                    strM14888 = c4849.m14888("SHA1-Digest");
                    if (strM14888 != null) {
                        threadLocal = c1120;
                    } else {
                        strM14888 = c4849.m14888("SHA-512-Digest");
                        if (strM14888 != null) {
                            threadLocal = c7086;
                        } else {
                            strM14888 = c4849.m14888("SHA-384-Digest");
                            if (strM14888 == null) {
                                C17359.toString((List) C1170.stream(c4849.m14889()).map(new C3398(1)).collect(C2025.toList()));
                                return false;
                            }
                            threadLocal = c8577;
                        }
                    }
                }
                long jM21839 = c8002.m21838() + j2;
                C1120 c1121 = c1120;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new RunnableC9322(c8002, threadLocal, strM14888, interfaceC7509, atomicBoolean, c15481M51723, atomicReference));
                arrayList2 = arrayList3;
                j2 = jM21839;
                c1120 = c1121;
                arrayList = arrayList;
            }
        }
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList;
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((String) it.next()).startsWith("META-INF/")) {
                i++;
            }
        }
        if (i != 0) {
            return false;
        }
        Collections.sort(arrayList4, C2661.comparingLong(new C19019()));
        ArrayList<List> arrayList6 = new ArrayList();
        long j3 = j2 / ((long) ((int) ((C11138.f35105 + 1) * 1.5f)));
        int i2 = 0;
        ArrayList arrayList7 = arrayList5;
        while (i2 < arrayList4.size()) {
            RunnableC9322 runnableC9322 = (RunnableC9322) arrayList4.get(i2);
            if (arrayList7 == null) {
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(runnableC9322);
                jM21838 = runnableC9322.f30293.m21838();
                arrayList6.add(arrayList8);
                arrayList7 = arrayList8;
            } else {
                jM21838 = runnableC9322.f30293.m21838() + j;
                if (jM21838 > j3) {
                    i2--;
                    arrayList7 = arrayList5;
                } else {
                    arrayList7.add(runnableC9322);
                }
                i2++;
            }
            j = jM21838;
            i2++;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayList6.size());
        for (final List list : arrayList6) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۢۤ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RunnableC9322) it2.next()).run();
                    }
                }
            });
        }
        C5261.m15837(executorServiceNewFixedThreadPool);
        c22941.m51729();
        if (interfaceC7509.mo924()) {
            return false;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            if (th instanceof IOException) {
                IOException iOException = (IOException) th;
                C22327.m50389(iOException);
                throw iOException;
            }
            throw new IOException(th);
        }
        return !atomicBoolean.get();
    }
}
