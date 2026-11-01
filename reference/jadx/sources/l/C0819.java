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
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0819 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m3416(AbstractC20745 abstractC20745) {
        C2455 c2455 = new C2455(abstractC20745);
        try {
            Iterator it = c2455.m7466().iterator();
            while (it.hasNext()) {
                C12107 c12107 = (C12107) it.next();
                String name = c12107.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    if (c2455.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF") != null) {
                        try {
                            byte[] encoded = new C2811(c2455.m7475(c12107, (C8516) null)).m8548()[0].getEncoded();
                            c2455.close();
                            return encoded;
                        } catch (Exception unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            c2455.close();
            return null;
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3414(AbstractC20745 abstractC20745, C20202 c20202, InterfaceC5614 interfaceC5614) {
        C20907 c20907 = c20202.f65552;
        C20907 c20908 = c20202.f65554;
        C20907 c20909 = c20202.f65557;
        C2455 c2455 = new C2455(abstractC20745);
        try {
            boolean zM8547 = false;
            byte[] bArrM7475 = null;
            for (C12107 c12107 : c2455.m7466()) {
                String name = c12107.getName();
                if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                    C12107 entry = c2455.getEntry(name.substring(0, name.lastIndexOf(46)) + ".SF");
                    if (entry != null) {
                        try {
                            C2811 c2811 = new C2811(c2455.m7475(c12107, (C8516) null));
                            bArrM7475 = c2455.m7475(entry, (C8516) null);
                            zM8547 = c2811.m8547(bArrM7475);
                        } catch (Exception unused) {
                        }
                        if (zM8547) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            C12107 entry2 = c2455.getEntry("META-INF/MANIFEST.MF");
            byte[] bArrM7476 = entry2 != null ? c2455.m7475(entry2, (C8516) null) : null;
            if (zM8547 && bArrM7476 != null) {
                C21987 c21987 = new C21987(bArrM7476);
                C21987 c21988 = new C21987(bArrM7475);
                String strM33544 = c21988.f71309.m33544("X-Android-APK-Signed");
                if (strM33544 != null) {
                    for (String str : strM33544.split(",")) {
                        String strTrim = str.trim();
                        switch (strTrim.hashCode()) {
                            case 50:
                                if (strTrim.equals("2") && c20907.f67938.m37950()) {
                                    c20907.f67938 = EnumC15969.MISSING;
                                }
                                break;
                            case 51:
                                if (strTrim.equals("3") && c20908.f67938.m37950()) {
                                    c20908.f67938 = EnumC15969.MISSING;
                                }
                                break;
                            case 52:
                                if (strTrim.equals("4") && c20909.f67938.m37950()) {
                                    c20909.f67938 = EnumC15969.MISSING;
                                }
                                break;
                        }
                    }
                }
                if (!interfaceC5614.mo2357()) {
                    if (m3415(c21988, c21987, bArrM7476)) {
                        try {
                            boolean zM3413 = m3413(c2455, c21987, interfaceC5614);
                            c2455.close();
                            return zM3413;
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    c2455.close();
                    return false;
                }
            }
            c2455.close();
            return false;
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3415(C21987 c21987, C21987 c21988, byte[] bArr) {
        C5053 c5053 = new C5053(new C1794());
        C5053 c5054 = new C5053(new C9557());
        C5053 c5055 = new C5053(new C21903(1));
        C5053 c5056 = new C5053(new C18375(1));
        C13790 c13790 = c21987.f71309;
        String strM33544 = c13790.m33544("SHA-256-Digest-Manifest");
        if (strM33544 != null) {
            if (Base64.encodeToString(((MessageDigest) c5054.m14070()).digest(bArr), 2).equals(strM33544)) {
                return true;
            }
        } else {
            String strM33545 = c13790.m33544("SHA1-Digest-Manifest");
            if (strM33545 != null) {
                if (Base64.encodeToString(((MessageDigest) c5053.m14070()).digest(bArr), 2).equals(strM33545)) {
                    return true;
                }
            } else {
                String strM33546 = c13790.m33544("SHA-512-Digest-Manifest");
                if (strM33546 != null) {
                    if (Base64.encodeToString(((MessageDigest) c5056.m14070()).digest(bArr), 2).equals(strM33546)) {
                        return true;
                    }
                } else {
                    String strM33547 = c13790.m33544("SHA-384-Digest-Manifest");
                    if (strM33547 != null && Base64.encodeToString(((MessageDigest) c5055.m14070()).digest(bArr), 2).equals(strM33547)) {
                        return true;
                    }
                }
            }
        }
        for (C13790 c13791 : c21987.f71310.values()) {
            C13790 c13792 = (C13790) c21988.f71310.get(c13791.m33547());
            if (c13792 == null) {
                return false;
            }
            String strM33548 = c13791.m33544("SHA256-Digest");
            if (strM33548 != null) {
                ((MessageDigest) c5054.m14070()).update(bArr, c13792.m33543(), c13792.m33546());
                if (!Base64.encodeToString(((MessageDigest) c5054.m14070()).digest(), 2).equals(strM33548)) {
                    return false;
                }
            } else {
                String strM33549 = c13791.m33544("SHA1-Digest");
                if (strM33549 != null) {
                    ((MessageDigest) c5053.m14070()).update(bArr, c13792.m33543(), c13792.m33546());
                    if (!Base64.encodeToString(((MessageDigest) c5053.m14070()).digest(), 2).equals(strM33549)) {
                        return false;
                    }
                } else {
                    String strM335410 = c13791.m33544("SHA512-Digest");
                    if (strM335410 != null) {
                        ((MessageDigest) c5056.m14070()).update(bArr, c13792.m33543(), c13792.m33546());
                        if (!Base64.encodeToString(((MessageDigest) c5056.m14070()).digest(), 2).equals(strM335410)) {
                            return false;
                        }
                    } else {
                        String strM335411 = c13791.m33544("SHA384-Digest");
                        if (strM335411 == null) {
                            return false;
                        }
                        ((MessageDigest) c5055.m14070()).update(bArr, c13792.m33543(), c13792.m33546());
                        if (!Base64.encodeToString(((MessageDigest) c5055.m14070()).digest(), 2).equals(strM335411)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3413(C2455 c2455, C21987 c21987, InterfaceC5614 interfaceC5614) throws IOException {
        long jM30138;
        ThreadLocal threadLocal;
        final HashMap map = new HashMap(c2455.m7485());
        C9030.stream(c2455.m7466()).filter(new C17317()).forEach(new Consumer() { // from class: l.ۛۨۖ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C12107 c12107 = (C12107) obj;
                map.put(c12107.m30135(), c12107);
            }
        });
        C3205 c3205 = new C3205();
        C13521 c13521 = new C13521();
        C11404 c11404 = new C11404();
        C2230 c2230 = new C2230();
        C22212 c22212M7483 = c2455.m7483();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = null;
        AtomicReference atomicReference = new AtomicReference(null);
        ArrayList arrayList2 = new ArrayList();
        long j = 0;
        long j2 = 0;
        for (C13790 c13790 : c21987.f71310.values()) {
            String strM33547 = c13790.m33547();
            C12107 c12107 = (C12107) map.remove(strM33547);
            if (c12107 == null) {
                if (C12379.m30796(strM33547)) {
                    return false;
                }
            } else {
                String strM33544 = c13790.m33544("SHA-256-Digest");
                if (strM33544 != null) {
                    threadLocal = c13521;
                } else {
                    strM33544 = c13790.m33544("SHA1-Digest");
                    if (strM33544 != null) {
                        threadLocal = c3205;
                    } else {
                        strM33544 = c13790.m33544("SHA-512-Digest");
                        if (strM33544 != null) {
                            threadLocal = c2230;
                        } else {
                            strM33544 = c13790.m33544("SHA-384-Digest");
                            if (strM33544 == null) {
                                C13638.toString((List) C9030.stream(c13790.m33545()).map(new C10968(0)).collect(C1890.toList()));
                                return false;
                            }
                            threadLocal = c11404;
                        }
                    }
                }
                long jM30139 = c12107.m30138() + j2;
                C3205 c3206 = c3205;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new RunnableC4347(c12107, threadLocal, strM33544, interfaceC5614, atomicBoolean, c22212M7483, atomicReference));
                arrayList2 = arrayList3;
                j2 = jM30139;
                c3205 = c3206;
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
        Collections.sort(arrayList4, C7618.comparingLong(new C23668()));
        ArrayList<List> arrayList6 = new ArrayList();
        long j3 = j2 / ((long) ((int) ((C5464.f18831 + 1) * 1.5f)));
        int i2 = 0;
        ArrayList arrayList7 = arrayList5;
        while (i2 < arrayList4.size()) {
            RunnableC4347 runnableC4347 = (RunnableC4347) arrayList4.get(i2);
            if (arrayList7 == null) {
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(runnableC4347);
                jM30138 = runnableC4347.f15553.m30138();
                arrayList6.add(arrayList8);
                arrayList7 = arrayList8;
            } else {
                jM30138 = runnableC4347.f15553.m30138() + j;
                if (jM30138 > j3) {
                    i2--;
                    arrayList7 = arrayList5;
                } else {
                    arrayList7.add(runnableC4347);
                }
                i2++;
            }
            j = jM30138;
            i2++;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayList6.size());
        for (final List list : arrayList6) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ܳۨۖ
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RunnableC4347) it2.next()).run();
                    }
                }
            });
        }
        C4716.m13052(executorServiceNewFixedThreadPool);
        c2455.m7473();
        if (interfaceC5614.mo2357()) {
            return false;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            throw new IOException(th);
        }
        return !atomicBoolean.get();
    }
}
