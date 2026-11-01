package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩶֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19808 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15575 m45035(AbstractC20745 abstractC20745, boolean z) {
        C15575 c15575 = new C15575(abstractC20745);
        if (z) {
            c15575.f50640 = C11904.f39941.m46728();
        } else {
            c15575.f50640 = c15575.f50638.m46733(".tmp");
        }
        c15575.f50639 = new C22918(c15575.f50640);
        return c15575;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45040(C15575 c15575) {
        c15575.f50640 = c15575.f50638.m46733(".tmp");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45032(Collection collection) {
        Iterator it = collection.iterator();
        long jM30138 = 0;
        while (it.hasNext()) {
            C12107 c12107 = (C12107) it.next();
            if (!c12107.isDirectory()) {
                jM30138 += c12107.m30138();
            }
        }
        return jM30138;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45041(C12107 c12107) {
        return c12107.m30133() && c12107.m30118() && c12107.m30119() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m45034(C2455 c2455, C12107 c12107, InterfaceC5614 interfaceC5614) {
        List<C6148> listM27966 = C11088.m27966();
        if (!m45041(c12107)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String strM7477 = c2455.m7477();
        try {
            for (C6148 c6148 : listM27966) {
                if (interfaceC5614.mo2357()) {
                    break;
                }
                c2455.m7474(c6148.f21002);
                try {
                    InputStream inputStreamM7471 = c2455.m7471(c12107);
                    try {
                        arrayList.add(c6148);
                        inputStreamM7471.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM7471.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C17978 unused) {
                }
            }
            c2455.m7474(strM7477);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C13638.requireNonNull(obj);
                arrayList2.add(obj);
            }
            return C0561.unmodifiableList(arrayList2);
        } catch (Throwable th3) {
            c2455.m7474(strM7477);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009f A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:8:0x001b, B:51:0x0096, B:53:0x009f, B:54:0x00a2, B:56:0x00ac), top: B:136:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0 A[LOOP:0: B:136:0x001b->B:58:0x00b0, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.InputStream, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.OutputStream, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.AutoCloseable] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45038(String str, C2455 c2455, C12107 c12107, AbstractC20745 abstractC20745, boolean z, InterfaceC20513 interfaceC20513) throws Throwable {
        ?? M30133;
        ?? M7471;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ?? Mo33976;
        ?? r16;
        int i = 4096;
        boolean z2 = false;
        if (!m45041(c12107)) {
            if (c12107.m30133() && !interfaceC20513.mo14572()) {
                interfaceC20513.cancel();
                return;
            }
            try {
                M30133 = c12107.m30133();
                try {
                    if (M30133 != 0) {
                        while (true) {
                            boolean zM45042 = true;
                            try {
                                M7471 = new BufferedInputStream(c2455.m7471(c12107));
                                try {
                                    try {
                                        zM45042 = true ^ m45042(c12107, (BufferedInputStream) M7471);
                                        M7471 = M7471;
                                    } catch (Throwable th) {
                                        th = th;
                                        M30133 = 0;
                                        C19431.m44468(M7471);
                                        C19431.m44468(M30133);
                                        throw th;
                                    }
                                } catch (C17978 unused) {
                                    M7471 = M7471;
                                }
                            } catch (C17978 unused2) {
                                M7471 = 0;
                            }
                            if (zM45042) {
                                C19431.m44468(M7471);
                                if (interfaceC20513.mo14573()) {
                                    m45036();
                                }
                                c2455.m7474((String) null);
                                if (!interfaceC20513.mo14572()) {
                                    interfaceC20513.cancel();
                                    return;
                                }
                            } else {
                                M30133 = 0;
                                try {
                                    M7471 = M7471;
                                    if (!interfaceC20513.mo14570()) {
                                        break;
                                    }
                                    m45037(c2455.m7477(), str);
                                    M7471 = M7471;
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    C19431.m44468(M7471);
                                    C19431.m44468(M30133);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        M7471 = c2455.m7471(c12107);
                    }
                    OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
                    try {
                        byte[] bArr = new byte[4096];
                        long size = c12107.getSize();
                        long j = 0;
                        do {
                            int i2 = M7471.read(bArr);
                            if (i2 > 0) {
                                outputStreamMo33976.write(bArr, 0, i2);
                                j += (long) i2;
                                if (size > 0) {
                                    interfaceC20513.mo14571(j, size);
                                }
                            } else {
                                outputStreamMo33976.close();
                                if (!z && C16737.m39280()) {
                                    abstractC20745.mo32855(c12107.getTime());
                                }
                                C19431.m44468(M7471);
                                return;
                            }
                        } while (!interfaceC20513.mo2357());
                        C19431.m44468(outputStreamMo33976);
                        abstractC20745.mo24647();
                        C19431.m44468(M7471);
                    } catch (Throwable th3) {
                        th = th3;
                        M30133 = outputStreamMo33976;
                        C19431.m44468(M7471);
                        C19431.m44468(M30133);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    M7471 = M30133;
                    C19431.m44468(M7471);
                    C19431.m44468(M30133);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                M30133 = 0;
            }
        } else {
            if (!interfaceC20513.mo14572()) {
                interfaceC20513.cancel();
                return;
            }
            while (true) {
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(c2455.m7471(c12107));
                        try {
                            try {
                                if (!m45042(c12107, bufferedInputStream)) {
                                    throw new C17978(c12107.getName());
                                }
                                Mo33976 = abstractC20745.mo33976(z2);
                                try {
                                    byte[] bArr2 = new byte[i];
                                    long size2 = c12107.getSize();
                                    long j2 = 0;
                                    ?? r6 = z2;
                                    while (true) {
                                        int i3 = bufferedInputStream.read(bArr2);
                                        if (i3 > 0) {
                                            Mo33976.write(bArr2, r6, i3);
                                            j2 += (long) i3;
                                            if (size2 > 0) {
                                                interfaceC20513.mo14571(j2, size2);
                                            }
                                            if (interfaceC20513.mo2357()) {
                                                C19431.m44468(Mo33976);
                                                abstractC20745.mo24647();
                                                break;
                                            }
                                            r6 = 0;
                                        } else {
                                            Mo33976.close();
                                            if (z || !C16737.m39280()) {
                                                break;
                                                break;
                                            } else {
                                                abstractC20745.mo32855(c12107.getTime());
                                                break;
                                            }
                                        }
                                    }
                                    C19431.m44468(bufferedInputStream);
                                    return;
                                } catch (C17978 unused3) {
                                    try {
                                        C19431.m44468(bufferedInputStream);
                                        try {
                                            C19431.m44468(Mo33976);
                                            abstractC20745.mo24647();
                                            if (interfaceC20513.mo14573()) {
                                                m45036();
                                            }
                                            c2455.m7474((String) null);
                                            if (!interfaceC20513.mo14572()) {
                                                interfaceC20513.cancel();
                                                return;
                                            } else {
                                                i = 4096;
                                                z2 = false;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r16 = Mo33976;
                                            bufferedInputStream2 = null;
                                            C19431.m44468(bufferedInputStream2);
                                            C19431.m44468(r16);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        bufferedInputStream2 = bufferedInputStream;
                                        r16 = Mo33976;
                                    }
                                    r16 = 0;
                                    C19431.m44468(bufferedInputStream2);
                                    C19431.m44468(r16);
                                    throw th;
                                } catch (IOException e) {
                                    e = e;
                                    C19431.m44468(Mo33976);
                                    abstractC20745.mo24647();
                                    throw e;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                bufferedInputStream2 = bufferedInputStream;
                                r16 = 0;
                                C19431.m44468(bufferedInputStream2);
                                C19431.m44468(r16);
                                throw th;
                            }
                        } catch (C17978 unused4) {
                            Mo33976 = 0;
                            C19431.m44468(bufferedInputStream);
                            C19431.m44468(Mo33976);
                            abstractC20745.mo24647();
                            if (interfaceC20513.mo14573()) {
                                m45036();
                            }
                            c2455.m7474((String) null);
                            if (!interfaceC20513.mo14572()) {
                                interfaceC20513.cancel();
                                return;
                            } else {
                                i = 4096;
                                z2 = false;
                            }
                            r16 = 0;
                            C19431.m44468(bufferedInputStream2);
                            C19431.m44468(r16);
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            Mo33976 = 0;
                            C19431.m44468(Mo33976);
                            abstractC20745.mo24647();
                            throw e;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bufferedInputStream2 = null;
                    }
                } catch (C17978 unused5) {
                    bufferedInputStream = null;
                } catch (IOException e3) {
                    e = e3;
                }
                i = 4096;
                z2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45039(C12107 c12107, C2455 c2455, C22918 c22918, InterfaceC7107 interfaceC7107) {
        C5984 c5984M7469;
        if (c22918.m50731(c12107)) {
            return;
        }
        c22918.m50735(c12107);
        byte[] bArr = new byte[4096];
        try {
            c5984M7469 = c2455.m7469(c12107);
            long j = 0;
            do {
                try {
                    int i = c5984M7469.read(bArr);
                    if (i <= 0) {
                        C19431.m44468(c5984M7469);
                        return;
                    } else {
                        c22918.m50723(i, bArr);
                        j += (long) i;
                        interfaceC7107.mo13817(j, c12107.getSize());
                    }
                } catch (Throwable th) {
                    th = th;
                    C19431.m44468(c5984M7469);
                    throw th;
                }
            } while (!interfaceC7107.mo2357());
            C19431.m44468(c5984M7469);
        } catch (Throwable th2) {
            th = th2;
            c5984M7469 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m45033(C12107 c12107, AbstractC20745 abstractC20745, byte[] bArr, String str, C19805 c19805) throws IOException {
        C2455 c2455M7448;
        if (c19805 == null || (c2455M7448 = (C2455) c19805.m45009()) == null) {
            c2455M7448 = C2455.m7448(abstractC20745, bArr);
        }
        c2455M7448.m7474(str);
        try {
            InputStream inputStreamM7471 = c2455M7448.m7471(c12107);
            return c19805 == null ? inputStreamM7471 : new C9930(inputStreamM7471, c19805, c2455M7448);
        } catch (IOException e) {
            C19431.m44468(c2455M7448);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45042(C12107 c12107, BufferedInputStream bufferedInputStream) throws IOException {
        try {
            bufferedInputStream.mark(1024);
            bufferedInputStream.read(new byte[1024]);
            bufferedInputStream.reset();
            return true;
        } catch (ZipException e) {
            if (c12107.m30118()) {
                return false;
            }
            throw e;
        } catch (C17978 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45036() {
        C16737.m39273(new RunnableC19102());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45037(String str, String str2) {
        ActivityC12499.m31046(str, str2);
        C16737.m39273(new RunnableC8519());
    }
}
