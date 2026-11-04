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

/* JADX INFO: renamed from: l.ᩳۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18902 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7715 m43873(AbstractC22044 abstractC22044, boolean z) {
        C7715 c7715 = new C7715(abstractC22044);
        if (z) {
            c7715.f25424 = C6382.f21563.m49877();
        } else {
            c7715.f25424 = c7715.f25422.m49862(".tmp");
        }
        c7715.f25423 = new C25179(c7715.f25424);
        return c7715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43877(C7715 c7715) {
        c7715.f25424 = c7715.f25422.m49862(".tmp");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m43870(Collection collection) {
        Iterator it = collection.iterator();
        long jM21838 = 0;
        while (it.hasNext()) {
            C8002 c8002 = (C8002) it.next();
            if (!c8002.isDirectory()) {
                jM21838 += c8002.m21838();
            }
        }
        return jM21838;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43879(C8002 c8002) {
        return c8002.m21856() && c8002.m21827() && c8002.m21826() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m43872(C22941 c22941, C8002 c8002, InterfaceC7509 interfaceC7509) {
        List<C14340> listM48121 = C21054.m48121();
        if (!m43879(c8002)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String strM51725 = c22941.m51725();
        try {
            for (C14340 c14340 : listM48121) {
                if (interfaceC7509.mo924()) {
                    break;
                }
                c22941.m51730(c14340.f45235);
                try {
                    InputStream inputStreamM51727 = c22941.m51727(c8002);
                    try {
                        arrayList.add(c14340);
                        inputStreamM51727.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM51727.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C16227 unused) {
                }
            }
            c22941.m51730(strM51725);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C17359.requireNonNull(obj);
                arrayList2.add(obj);
            }
            return C4681.unmodifiableList(arrayList2);
        } catch (Throwable th3) {
            c22941.m51730(strM51725);
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
    public static void m43876(String str, C22941 c22941, C8002 c8002, AbstractC22044 abstractC22044, boolean z, InterfaceC0257 interfaceC0257) throws Throwable {
        ?? M21856;
        ?? M51727;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ?? Mo4289;
        ?? r16;
        int i = 4096;
        boolean z2 = false;
        if (!m43879(c8002)) {
            if (c8002.m21856() && !interfaceC0257.mo1756()) {
                interfaceC0257.cancel();
                return;
            }
            try {
                M21856 = c8002.m21856();
                try {
                    if (M21856 != 0) {
                        while (true) {
                            boolean zM43880 = true;
                            try {
                                M51727 = new BufferedInputStream(c22941.m51727(c8002));
                                try {
                                    try {
                                        zM43880 = true ^ m43880(c8002, (BufferedInputStream) M51727);
                                        M51727 = M51727;
                                    } catch (C16227 unused) {
                                        M51727 = M51727;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    M21856 = 0;
                                    C20244.m46520(M51727);
                                    C20244.m46520(M21856);
                                    throw th;
                                }
                            } catch (C16227 unused2) {
                                M51727 = 0;
                            }
                            if (zM43880) {
                                C20244.m46520(M51727);
                                if (interfaceC0257.mo1755()) {
                                    m43874();
                                }
                                c22941.m51730((String) null);
                                if (!interfaceC0257.mo1756()) {
                                    interfaceC0257.cancel();
                                    return;
                                }
                            } else {
                                M21856 = 0;
                                try {
                                    M51727 = M51727;
                                    if (!interfaceC0257.mo1754()) {
                                        break;
                                    }
                                    m43875(c22941.m51725(), str);
                                    M51727 = M51727;
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    C20244.m46520(M51727);
                                    C20244.m46520(M21856);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        M51727 = c22941.m51727(c8002);
                    }
                    OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
                    try {
                        byte[] bArr = new byte[4096];
                        long size = c8002.getSize();
                        long j = 0;
                        do {
                            int i2 = M51727.read(bArr);
                            if (i2 > 0) {
                                outputStreamMo4289.write(bArr, 0, i2);
                                j += (long) i2;
                                if (size > 0) {
                                    interfaceC0257.mo1753(j, size);
                                }
                            } else {
                                outputStreamMo4289.close();
                                if (!z && C21576.m49078()) {
                                    abstractC22044.mo2942(c8002.getTime());
                                }
                                C20244.m46520(M51727);
                                return;
                            }
                        } while (!interfaceC0257.mo924());
                        C20244.m46520(outputStreamMo4289);
                        abstractC22044.mo4296();
                        C20244.m46520(M51727);
                    } catch (Throwable th3) {
                        th = th3;
                        M21856 = outputStreamMo4289;
                        C20244.m46520(M51727);
                        C20244.m46520(M21856);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    M51727 = M21856;
                    C20244.m46520(M51727);
                    C20244.m46520(M21856);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                M21856 = 0;
            }
        } else {
            if (!interfaceC0257.mo1756()) {
                interfaceC0257.cancel();
                return;
            }
            while (true) {
                try {
                    try {
                        bufferedInputStream = new BufferedInputStream(c22941.m51727(c8002));
                        try {
                            try {
                                if (!m43880(c8002, bufferedInputStream)) {
                                    throw new C16227(c8002.getName());
                                }
                                Mo4289 = abstractC22044.mo4289(z2);
                                try {
                                    byte[] bArr2 = new byte[i];
                                    long size2 = c8002.getSize();
                                    long j2 = 0;
                                    ?? r6 = z2;
                                    while (true) {
                                        int i3 = bufferedInputStream.read(bArr2);
                                        if (i3 > 0) {
                                            Mo4289.write(bArr2, r6, i3);
                                            j2 += (long) i3;
                                            if (size2 > 0) {
                                                interfaceC0257.mo1753(j2, size2);
                                            }
                                            if (interfaceC0257.mo924()) {
                                                C20244.m46520(Mo4289);
                                                abstractC22044.mo4296();
                                                break;
                                            }
                                            r6 = 0;
                                        } else {
                                            Mo4289.close();
                                            if (z || !C21576.m49078()) {
                                                break;
                                                break;
                                            } else {
                                                abstractC22044.mo2942(c8002.getTime());
                                                break;
                                            }
                                        }
                                    }
                                    C20244.m46520(bufferedInputStream);
                                    return;
                                } catch (C16227 unused3) {
                                    try {
                                        C20244.m46520(bufferedInputStream);
                                        try {
                                            C20244.m46520(Mo4289);
                                            abstractC22044.mo4296();
                                            if (interfaceC0257.mo1755()) {
                                                m43874();
                                            }
                                            c22941.m51730((String) null);
                                            if (!interfaceC0257.mo1756()) {
                                                interfaceC0257.cancel();
                                                return;
                                            } else {
                                                i = 4096;
                                                z2 = false;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r16 = Mo4289;
                                            bufferedInputStream2 = null;
                                            C20244.m46520(bufferedInputStream2);
                                            C20244.m46520(r16);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        bufferedInputStream2 = bufferedInputStream;
                                        r16 = Mo4289;
                                    }
                                    r16 = 0;
                                    C20244.m46520(bufferedInputStream2);
                                    C20244.m46520(r16);
                                    throw th;
                                } catch (IOException e) {
                                    e = e;
                                    C20244.m46520(Mo4289);
                                    abstractC22044.mo4296();
                                    throw e;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                bufferedInputStream2 = bufferedInputStream;
                                r16 = 0;
                                C20244.m46520(bufferedInputStream2);
                                C20244.m46520(r16);
                                throw th;
                            }
                        } catch (C16227 unused4) {
                            Mo4289 = 0;
                            C20244.m46520(bufferedInputStream);
                            C20244.m46520(Mo4289);
                            abstractC22044.mo4296();
                            if (interfaceC0257.mo1755()) {
                                m43874();
                            }
                            c22941.m51730((String) null);
                            if (!interfaceC0257.mo1756()) {
                                interfaceC0257.cancel();
                                return;
                            } else {
                                i = 4096;
                                z2 = false;
                            }
                            r16 = 0;
                            C20244.m46520(bufferedInputStream2);
                            C20244.m46520(r16);
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            Mo4289 = 0;
                            C20244.m46520(Mo4289);
                            abstractC22044.mo4296();
                            throw e;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bufferedInputStream2 = null;
                    }
                } catch (C16227 unused5) {
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
    public static void m43878(C8002 c8002, C22941 c22941, C25179 c25179, InterfaceC18156 interfaceC18156) throws Throwable {
        C10260 c10260M51748;
        if (c25179.m56131(c8002)) {
            return;
        }
        c25179.m56137(c8002);
        byte[] bArr = new byte[4096];
        try {
            c10260M51748 = c22941.m51748(c8002);
            long j = 0;
            do {
                try {
                    int i = c10260M51748.read(bArr);
                    if (i <= 0) {
                        C20244.m46520(c10260M51748);
                        return;
                    } else {
                        c25179.m56122(i, bArr);
                        j += (long) i;
                        interfaceC18156.mo25848(j, c8002.getSize());
                    }
                } catch (Throwable th) {
                    th = th;
                    C20244.m46520(c10260M51748);
                    throw th;
                }
            } while (!interfaceC18156.mo924());
            C20244.m46520(c10260M51748);
        } catch (Throwable th2) {
            th = th2;
            c10260M51748 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m43871(C8002 c8002, AbstractC22044 abstractC22044, byte[] bArr, String str, C20528 c20528) throws IOException {
        C22941 c22941M51705;
        if (c20528 == null || (c22941M51705 = (C22941) c20528.m47061()) == null) {
            c22941M51705 = C22941.m51705(abstractC22044, bArr);
        }
        c22941M51705.m51730(str);
        try {
            InputStream inputStreamM51727 = c22941M51705.m51727(c8002);
            return c20528 == null ? inputStreamM51727 : new C21140(inputStreamM51727, c20528, c22941M51705);
        } catch (IOException e) {
            C20244.m46520(c22941M51705);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43880(C8002 c8002, BufferedInputStream bufferedInputStream) throws IOException {
        try {
            bufferedInputStream.mark(1024);
            bufferedInputStream.read(new byte[1024]);
            bufferedInputStream.reset();
            return true;
        } catch (ZipException e) {
            if (c8002.m21827()) {
                return false;
            }
            throw e;
        } catch (C16227 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43874() {
        C21576.m49068(new RunnableC15491(2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43875(String str, String str2) {
        ActivityC6138.m17739(str, str2);
        C21576.m49068(new RunnableC13254(2));
    }
}
