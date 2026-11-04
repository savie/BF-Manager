package l;

import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.۠֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8265 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f27202 = "MIUI BACKUP\n".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m22299(long j, long j2) {
        return j2 > C25227.FOREVER_NS - j ? C25227.FOREVER_NS : j + j2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m22298(AbstractC7629 abstractC7629) {
        return m22297(abstractC7629).mo4294();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9755 m22301(AbstractC7629 abstractC7629) throws C2299, IOException {
        LinkedHashMap linkedHashMapM22302 = m22302(abstractC7629);
        LinkedHashMap linkedHashMap = new LinkedHashMap(linkedHashMapM22302.size());
        for (AbstractC22044 abstractC22044 : linkedHashMapM22302.values()) {
            linkedHashMap.put(abstractC22044.mo4294(), m22300(abstractC22044));
        }
        HashMap map = new HashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C17359.requireNonNull(key);
            Object value = entry.getValue();
            C17359.requireNonNull(value);
            map.put(key, value);
        }
        return new C9755(C4681.unmodifiableMap(map));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[LOOP:1: B:23:0x0079->B:25:0x007f, LOOP_END] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m22302(AbstractC7629 abstractC7629) throws C2299, IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC22044 abstractC22044M22297 = m22297(abstractC7629);
        linkedHashMap.put(abstractC22044M22297.mo4294(), abstractC22044M22297);
        if (abstractC7629 instanceof C24320) {
            C24320 c24320 = (C24320) abstractC7629;
            if (c24320.m54372()) {
                try {
                    C20348 c20348 = new C20348(c24320.m54362());
                    int i = c20348.readInt();
                    if (i <= 0 || i > 10000) {
                        throw new IOException("Invalid ZIP split volume count: " + i);
                    }
                    AbstractC22044 abstractC22044M49856 = abstractC22044M22297.m49856();
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC22044 abstractC22044M49876 = abstractC22044M49856.m49876(c20348.m46758());
                        c20348.readLong();
                        linkedHashMap.put(abstractC22044M49876.mo4294(), abstractC22044M49876);
                    }
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Invalid ZIP split metadata", e);
                }
            } else if (abstractC7629 instanceof C17036) {
                for (AbstractC22044 abstractC22044 : ((C17036) abstractC7629).m40146()) {
                    linkedHashMap.put(abstractC22044.mo4294(), abstractC22044);
                }
            }
        } else if (abstractC7629 instanceof C17036) {
            while (r6.hasNext()) {
                linkedHashMap.put(abstractC22044.mo4294(), abstractC22044);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3790 m22300(AbstractC22044 abstractC22044) throws FileNotFoundException {
        if (!abstractC22044.mo2934() || !abstractC22044.mo4304()) {
            throw new FileNotFoundException(abstractC22044.mo4294());
        }
        return new C3790(abstractC22044.mo4294(), abstractC22044.mo4285(), abstractC22044.mo4286());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20944 m22287(AbstractC7629 abstractC7629, C16269 c16269) {
        try {
            if (abstractC7629 instanceof C24320) {
                m22295((C24320) abstractC7629, c16269);
            } else if (abstractC7629 instanceof C11312) {
                m22291((C11312) abstractC7629, c16269);
            } else if (abstractC7629 instanceof C17036) {
                m22292((C17036) abstractC7629, c16269);
            } else if (abstractC7629 instanceof C9577) {
                m22290((C9577) abstractC7629, c16269);
            } else {
                throw new C2299();
            }
            if (!c16269.m38601()) {
                return new C20944(EnumC0807.VALID, null, null);
            }
            return new C20944(EnumC0807.CANCELED, null, null);
        } catch (C2299 unused) {
            return new C20944(EnumC0807.UNSUPPORTED, null, null);
        } catch (C9010 unused2) {
            return new C20944(EnumC0807.CANCELED, null, null);
        } catch (C14230 e) {
            return new C20944(EnumC0807.INVALID, e.f44960, null);
        } catch (Exception e2) {
            return new C20944(EnumC0807.FAILED, null, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22295(final C24320 c24320, final C16269 c16269) throws Exception {
        int iMax;
        int i;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            ArrayList<C8002> arrayList = new ArrayList(c24320.m54365());
            C1170.removeIf(arrayList, new C18218(2));
            C12884.sort(arrayList, C2661.comparingLong(new C23182()));
            Iterator it = arrayList.iterator();
            long jM22299 = 0;
            while (it.hasNext()) {
                jM22299 = m22299(jM22299, Math.max(1L, ((C8002) it.next()).getSize()));
            }
            final C7519 c7519 = new C7519(Math.max(1L, jM22299), c16269);
            ArrayList<C8002> arrayList2 = new ArrayList();
            ArrayList<C8002> arrayList3 = new ArrayList();
            for (C8002 c8002 : arrayList) {
                if (!c8002.m21856() && (c8002.m21826() == 0 || c8002.m21826() == 8)) {
                    arrayList2.add(c8002);
                } else {
                    arrayList3.add(c8002);
                }
            }
            boolean zMo4295 = c24320.m54371().mo4295();
            boolean zM54372 = c24320.m54372();
            int size = arrayList2.size();
            if (!zMo4295) {
                iMax = 1;
            } else if (size < 2) {
                iMax = 1;
            } else {
                iMax = Math.max(1, Math.min(size, Math.min(zM54372 ? 2 : 4, Math.max(1, iAvailableProcessors))));
            }
            if (iMax <= 1) {
                arrayList3.addAll(arrayList2);
                C12884.sort(arrayList3, C2661.comparingLong(new C23182()));
            } else {
                long jM222910 = 0;
                for (C8002 c8003 : arrayList2) {
                    jM222910 = m22299(jM222910, Math.max(1L, Math.max(c8003.m21838(), c8003.getSize())));
                }
                long jM222911 = 0;
                long j = iMax;
                int i2 = 0;
                long jMax = Math.max(1L, ((long) (jM222910 % j == 0 ? 0 : 1)) + (jM222910 / j));
                ArrayList<List> arrayList4 = new ArrayList(iMax);
                ArrayList arrayList5 = new ArrayList();
                while (i2 < arrayList2.size()) {
                    int size2 = arrayList2.size() - i2;
                    int size3 = iMax - arrayList4.size();
                    if (!arrayList5.isEmpty() && size3 > 1 && size2 >= (i = size3 - 1) && (jM222911 >= jMax || size2 == i)) {
                        arrayList4.add(arrayList5);
                        arrayList5 = new ArrayList();
                        jM222911 = 0;
                    }
                    C8002 c8004 = (C8002) arrayList2.get(i2);
                    arrayList5.add(c8004);
                    jM222911 = m22299(jM222911, Math.max(1L, Math.max(c8004.m21838(), c8004.getSize())));
                    i2++;
                    jMax = jMax;
                }
                if (!arrayList5.isEmpty()) {
                    arrayList4.add(arrayList5);
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(arrayList4.size());
                final AtomicBoolean atomicBoolean = new AtomicBoolean();
                final AtomicReference atomicReference = new AtomicReference();
                ArrayList arrayList6 = new ArrayList(arrayList4.size());
                for (final List list : arrayList4) {
                    arrayList6.add(executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۗ֡ܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8265.m22294(c24320, list, c16269, atomicBoolean, c7519, atomicReference);
                        }
                    }));
                }
                executorServiceNewFixedThreadPool.shutdown();
                while (!executorServiceNewFixedThreadPool.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    try {
                        c7519.m20580();
                        if (c16269.m38601() || atomicReference.get() != null) {
                            atomicBoolean.set(true);
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                ((Future) it2.next()).cancel(true);
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        c16269.cancel();
                        atomicBoolean.set(true);
                        executorServiceNewFixedThreadPool.shutdownNow();
                        throw new C9010();
                    }
                }
                if (c16269.m38601()) {
                    throw new C9010();
                }
                Throwable th = (Throwable) atomicReference.get();
                if (th != null) {
                    Exception exc = th instanceof Exception ? (Exception) th : new Exception(th);
                    C22327.m50389(exc);
                    throw exc;
                }
            }
            if (!arrayList3.isEmpty()) {
                C22941 c22941M51705 = C22941.m51705(c24320.m54371(), c24320.m54362());
                try {
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean();
                    byte[] bArr = new byte[65536];
                    for (C8002 c8005 : arrayList3) {
                        m22289(c16269, atomicBoolean2);
                        m22293(c22941M51705, c24320, c8005, bArr, c7519, true, c16269, atomicBoolean2);
                    }
                    c22941M51705.close();
                } catch (Throwable th2) {
                    try {
                        c22941M51705.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            c7519.m20581();
            c7519.m20580();
        } catch (IOException e) {
            throw new C14230(null, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22294(C24320 c24320, List list, C16269 c16269, AtomicBoolean atomicBoolean, C7519 c7519, AtomicReference atomicReference) {
        byte[] bArr = new byte[65536];
        try {
            C22941 c22941M51705 = C22941.m51705(c24320.m54371(), c24320.m54362());
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C8002 c8002 = (C8002) it.next();
                    m22289(c16269, atomicBoolean);
                    m22293(c22941M51705, c24320, c8002, bArr, c7519, false, c16269, atomicBoolean);
                }
                c22941M51705.close();
            } catch (Throwable th) {
                try {
                    c22941M51705.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (!(th3 instanceof C9010)) {
                while (!atomicReference.compareAndSet(null, th3) && atomicReference.get() == null) {
                }
            }
            atomicBoolean.set(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0180 A[EDGE_INSN: B:190:0x0180->B:92:0x0180 BREAK  A[LOOP:3: B:89:0x016a->B:91:0x0171], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:91:0x0171 A[Catch: all -> 0x01a6, LOOP:3: B:89:0x016a->B:91:0x0171, LOOP_END, TryCatch #4 {all -> 0x01a6, blocks: (B:86:0x0162, B:89:0x016a, B:91:0x0171, B:92:0x0180, B:94:0x018c, B:99:0x019c, B:100:0x01a5), top: B:159:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x018c A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #4 {all -> 0x01a6, blocks: (B:86:0x0162, B:89:0x016a, B:91:0x0171, B:92:0x0180, B:94:0x018c, B:99:0x019c, B:100:0x01a5), top: B:159:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x019c A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #4 {all -> 0x01a6, blocks: (B:86:0x0162, B:89:0x016a, B:91:0x0171, B:92:0x0180, B:94:0x018c, B:99:0x019c, B:100:0x01a5), top: B:159:0x0162 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9, types: [l.ܽ֡֫] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22293(C22941 c22941, C24320 c24320, C8002 c8002, byte[] bArr, C7519 c7519, boolean z, final C16269 c16269, AtomicBoolean atomicBoolean) throws Throwable {
        boolean zM25891;
        String str;
        boolean z2;
        boolean z3;
        BufferedInputStream bufferedInputStream;
        long jM22299;
        int i;
        long jM222910;
        List list;
        boolean z4;
        String str2;
        int i2 = -1;
        if (!c8002.m21856()) {
            try {
                InputStream inputStreamM51733 = c22941.m51733(c8002);
                while (true) {
                    try {
                        int i3 = inputStreamM51733.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        m22289(c16269, atomicBoolean);
                        c7519.m20578(i3);
                        if (z) {
                            c7519.m20580();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamM51733.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    throw e;
                }
                m22289(c16269, atomicBoolean);
                if (c8002.getSize() == 0) {
                    c7519.m20578(1L);
                }
                inputStreamM51733.close();
                return;
            } catch (C9010 e) {
                throw e;
            } catch (IOException e2) {
                if (m22296(e2)) {
                    throw new C2299(e2);
                }
                throw new C14230(c8002.getName(), e2);
            }
        }
        ?? r8 = 0;
        if (C18902.m43879(c8002)) {
            String strM54375 = c24320.m54375();
            List listM43872 = null;
            while (true) {
                m22289(c16269, atomicBoolean);
                if (strM54375 == null || strM54375.isEmpty()) {
                    if (listM43872 == null) {
                        listM43872 = C18902.m43872(c22941, c8002, new InterfaceC7509() { // from class: l.᩵֡ܳ
                            @Override // l.InterfaceC7509
                            /* JADX INFO: renamed from: ۫ */
                            public final boolean mo924() {
                                return c16269.m38601();
                            }
                        });
                    }
                    AtomicReference atomicReference = new AtomicReference();
                    jM222910 = 0;
                    C10039 c10039 = new C10039((AbstractActivityC17204) r8, new C11398(3, atomicReference));
                    c10039.m25890(new C15722(c16269));
                    if (!c10039.m25892(listM43872)) {
                        c16269.cancel();
                        throw new C9010();
                    }
                    strM54375 = (String) atomicReference.get();
                    list = listM43872;
                    z4 = true;
                } else {
                    list = listM43872;
                    jM222910 = 0;
                    z4 = false;
                }
                String str3 = strM54375;
                c22941.m51730(str3);
                try {
                    try {
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(c22941.m51733(c8002));
                            try {
                                try {
                                    if (!C18902.m43880(c8002, bufferedInputStream2)) {
                                        throw new C16227(c8002.getName());
                                    }
                                    while (true) {
                                        int i4 = bufferedInputStream2.read(bArr);
                                        if (i4 == i2) {
                                            break;
                                        }
                                        try {
                                            m22289(c16269, atomicBoolean);
                                            str2 = str3;
                                            long j = i4;
                                            try {
                                                jM222910 = m22299(jM222910, j);
                                                c7519.m20582(j);
                                                c7519.m20580();
                                                str3 = str2;
                                                i2 = -1;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str2 = str3;
                                        }
                                        th = th3;
                                    }
                                    str2 = str3;
                                    m22289(c16269, atomicBoolean);
                                    c7519.m20579(c8002.getSize(), jM222910);
                                    C21054.m48114(c24320.m54361(), str2);
                                    bufferedInputStream2.close();
                                    break;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            Throwable th7 = th;
                            try {
                                bufferedInputStream2.close();
                                throw th7;
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                                throw th7;
                            }
                        } catch (C16227 unused) {
                            r8 = str3;
                            c7519.m20577();
                            c7519.m20580();
                            C21054.m48111(c24320.m54361(), r8);
                            if (z4) {
                                C18902.m43874();
                            }
                            listM43872 = list;
                            strM54375 = null;
                            i2 = -1;
                            r8 = 0;
                        }
                    } catch (C16227 unused2) {
                        c7519.m20577();
                        c7519.m20580();
                        C21054.m48111(c24320.m54361(), r8);
                        if (z4) {
                            C18902.m43874();
                        }
                        listM43872 = list;
                        strM54375 = null;
                        i2 = -1;
                        r8 = 0;
                    }
                } catch (C9010 e3) {
                    throw e3;
                } catch (IOException e4) {
                    if (m22296(e4)) {
                        throw new C2299(e4);
                    }
                    throw new C14230(c8002.getName(), e4);
                }
                listM43872 = list;
                strM54375 = null;
                i2 = -1;
                r8 = 0;
            }
        } else {
            AbstractActivityC17204 abstractActivityC17204 = null;
            Iterator itM48118 = null;
            while (true) {
                m22289(c16269, atomicBoolean);
                String strM54376 = c24320.m54375();
                try {
                    try {
                        if (strM54376 == null || strM54376.isEmpty()) {
                            if (itM48118 == null) {
                                itM48118 = C21054.m48118();
                            }
                            if (itM48118.hasNext()) {
                                str = (String) itM48118.next();
                                c24320.m54374(str);
                                z2 = false;
                                z3 = true;
                            } else {
                                C10039 c100310 = new C10039(abstractActivityC17204, new C24159(c24320));
                                c100310.m25890(new C15722(c16269));
                                zM25891 = c100310.m25891();
                                if (!zM25891) {
                                    c16269.cancel();
                                    throw new C9010();
                                }
                                strM54376 = c24320.m54375();
                            }
                            c22941.m51730(str);
                            bufferedInputStream = new BufferedInputStream(c22941.m51733(c8002));
                            if (C18902.m43880(c8002, bufferedInputStream)) {
                                throw new C16227(c8002.getName());
                            }
                            jM22299 = 0;
                            while (true) {
                                i = bufferedInputStream.read(bArr);
                                if (i != -1) {
                                    break;
                                }
                                m22289(c16269, atomicBoolean);
                                long j2 = i;
                                jM22299 = m22299(jM22299, j2);
                                c7519.m20582(j2);
                                c7519.m20580();
                            }
                            m22289(c16269, atomicBoolean);
                            c7519.m20579(c8002.getSize(), jM22299);
                            if (z3) {
                                C18902.m43875(str, c24320.m54361());
                            }
                            bufferedInputStream.close();
                            break;
                        }
                        zM25891 = false;
                        if (C18902.m43880(c8002, bufferedInputStream)) {
                            throw new C16227(c8002.getName());
                        }
                        jM22299 = 0;
                        while (true) {
                            i = bufferedInputStream.read(bArr);
                            if (i != -1) {
                                break;
                                break;
                            }
                            m22289(c16269, atomicBoolean);
                            long j3 = i;
                            jM22299 = m22299(jM22299, j3);
                            c7519.m20582(j3);
                            c7519.m20580();
                        }
                        m22289(c16269, atomicBoolean);
                        c7519.m20579(c8002.getSize(), jM22299);
                        if (z3) {
                            C18902.m43875(str, c24320.m54361());
                        }
                        bufferedInputStream.close();
                        break;
                    } catch (Throwable th9) {
                        try {
                            bufferedInputStream.close();
                            throw th9;
                        } catch (Throwable th10) {
                            th9.addSuppressed(th10);
                            throw th9;
                        }
                    }
                    bufferedInputStream = new BufferedInputStream(c22941.m51733(c8002));
                } catch (C9010 e5) {
                    throw e5;
                } catch (C16227 unused3) {
                    c7519.m20577();
                    c7519.m20580();
                    abstractActivityC17204 = null;
                    c24320.m54374(null);
                    if (z2) {
                        C18902.m43874();
                    }
                } catch (IOException e6) {
                    if (m22296(e6)) {
                        throw new C2299(e6);
                    }
                    boolean zM21827 = c8002.m21827();
                    if (z3 && zM21827) {
                        c7519.m20577();
                        c7519.m20580();
                        abstractActivityC17204 = null;
                        c24320.m54374(null);
                    } else {
                        throw new C14230(c8002.getName(), e6);
                    }
                }
                z3 = false;
                String str4 = strM54376;
                z2 = zM25891;
                str = str4;
                c22941.m51730(str);
            }
        }
        if (z) {
            c7519.m20580();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22291(C11312 c11312, C16269 c16269) {
        String strM20456;
        C14161 c14161;
        Throwable th;
        C12804 c12804M28598 = c11312.m28598();
        C23928 c23928 = new C23928(c12804M28598.m31764(), c12804M28598.m31766(), c16269);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(c23928, 65536);
            Throwable th2 = null;
            try {
                try {
                    try {
                        InputStream inputStreamM25863 = C10016.m25863(bufferedInputStream, new C17214(bufferedInputStream));
                        if (inputStreamM25863 == null) {
                            inputStreamM25863 = bufferedInputStream;
                        }
                        BufferedInputStream bufferedInputStream2 = inputStreamM25863 instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM25863 : new BufferedInputStream(inputStreamM25863, 65536);
                        m22288(bufferedInputStream2);
                        if (c11312.m28590().isEmpty()) {
                            c14161 = new C14161(bufferedInputStream2, 512, null);
                        } else {
                            c14161 = new C14161(bufferedInputStream2, 512, c11312.m28590());
                        }
                        c14161.m34394(true);
                        while (true) {
                            try {
                                try {
                                    C7450 c7450M34397 = c14161.m34397();
                                    if (c7450M34397 == null) {
                                        byte[] bArr = new byte[65536];
                                        while (true) {
                                            int i = bufferedInputStream2.read(bArr);
                                            if (i != -1) {
                                                m22289(c16269, (AtomicBoolean) null);
                                                for (int i2 = 0; i2 < i; i2++) {
                                                    if (bArr[i2] != 0) {
                                                        throw new IOException(C21576.m49088(R.string.MT_Protector));
                                                    }
                                                }
                                            } else {
                                                m22289(c16269, (AtomicBoolean) null);
                                                c14161.close();
                                                bufferedInputStream.close();
                                                c23928.close();
                                                return;
                                            }
                                        }
                                    } else {
                                        strM20456 = c7450M34397.m20456();
                                        try {
                                            byte[] bArr2 = new byte[65536];
                                            long j = 0;
                                            while (true) {
                                                int i3 = c14161.read(bArr2);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                m22289(c16269, (AtomicBoolean) null);
                                                j += (long) i3;
                                            }
                                            m22289(c16269, (AtomicBoolean) null);
                                            if (c7450M34397.m20449() >= 0 && j != c7450M34397.m20449()) {
                                                throw new C14230(strM20456, new IOException("Unexpected TAR entry size: " + j + " != " + c7450M34397.m20449()));
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                c14161.close();
                                                throw th;
                                            } catch (Throwable th4) {
                                                try {
                                                    th.addSuppressed(th4);
                                                    throw th;
                                                } catch (IOException e) {
                                                    e = e;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    strM20456 = null;
                                }
                            } catch (IOException e2) {
                                C7450 c7450M34398 = c14161.m34398();
                                if (c7450M34398 != null && !c7450M34398.m20441()) {
                                    c7450M34398.m20456();
                                    throw e2;
                                }
                                throw e2;
                            }
                            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                                if (C18706.class.isInstance(cause)) {
                                    th2 = (Throwable) C18706.class.cast(cause);
                                    break;
                                }
                            }
                            C18706 c18706 = (C18706) th2;
                            if (c18706 != null) {
                                throw c18706;
                            }
                            if (m22296(e)) {
                                throw new C2299(e);
                            }
                            throw new C14230(strM20456, e);
                        }
                    } catch (Throwable th6) {
                        try {
                            bufferedInputStream.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    strM20456 = null;
                }
            } catch (RuntimeException e4) {
                if (m22296(e4)) {
                    throw new C2299(e4);
                }
                throw e4;
            } catch (C9010 e5) {
                throw e5;
            } catch (C14230 e6) {
            }
        } catch (Throwable th8) {
            try {
                c23928.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22290(C9577 c9577, C16269 c16269) throws C14230, IOException {
        Throwable th = null;
        try {
            c9577.mo20837(false);
            C19274 c19274M25013 = c9577.m25013();
            AbstractC22044 abstractC22044M25012 = c9577.m25012();
            InputStream inputStreamMo4290 = abstractC22044M25012.mo4290();
            try {
                try {
                    InputStream inputStreamM55978 = c19274M25013.m44620().m55978(new C23928(inputStreamMo4290, abstractC22044M25012.mo4285(), c16269));
                    try {
                        byte[] bArr = new byte[65536];
                        while (inputStreamM55978.read(bArr) != -1) {
                            m22289(c16269, (AtomicBoolean) null);
                        }
                        m22289(c16269, (AtomicBoolean) null);
                        inputStreamM55978.close();
                        if (inputStreamMo4290 != null) {
                            inputStreamMo4290.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamM55978 != null) {
                            try {
                                inputStreamM55978.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (C9010 e) {
                    throw e;
                } catch (IOException e2) {
                    for (Throwable cause = e2; cause != null; cause = cause.getCause()) {
                        if (C18706.class.isInstance(cause)) {
                            th = (Throwable) C18706.class.cast(cause);
                            break;
                        }
                    }
                    C18706 c18706 = (C18706) th;
                    if (c18706 != null) {
                        throw c18706;
                    }
                    if (m22296(e2)) {
                        throw new C2299(e2);
                    }
                    throw new C14230(c19274M25013.getName(), e2);
                } catch (RuntimeException e3) {
                    if (m22296(e3)) {
                        throw new C2299(e3);
                    }
                    throw e3;
                }
            } catch (Throwable th4) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e4) {
            throw new C14230(null, e4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22288(BufferedInputStream bufferedInputStream) throws IOException {
        int i;
        byte[] bArr = f27202;
        bufferedInputStream.mark(bArr.length + 2048);
        for (byte b : bArr) {
            if (bufferedInputStream.read() != (b & 255)) {
                bufferedInputStream.reset();
                return;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 2048 && i2 < 8 && (i = bufferedInputStream.read()) != -1; i3++) {
            if (i == 10) {
                i2++;
            }
        }
        if (i2 != 8) {
            bufferedInputStream.reset();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        r1.get(100, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m22292(l.C17036 r9, l.C16269 r10) throws l.C14230, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8265.m22292(l.ܺᩴ۫, l.ܶᩳܳ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22289(InterfaceC6028 interfaceC6028, AtomicBoolean atomicBoolean) throws C9010 {
        if (((C16269) interfaceC6028).m38601() || Thread.currentThread().isInterrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new C9010();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22296(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            String simpleName = cause.getClass().getSimpleName();
            Locale locale = Locale.ROOT;
            if (simpleName.toLowerCase(locale).contains("unsupported")) {
                return true;
            }
            String message = cause.getMessage();
            if (message != null) {
                String lowerCase = message.toLowerCase(locale);
                if (lowerCase.contains("unsupported compression method") || lowerCase.contains("unsupported encryption method") || lowerCase.contains("unsupported method") || lowerCase.contains("unsupportedmethod") || lowerCase.contains("not implemented") || lowerCase.contains("e_notimpl") || lowerCase.contains("dictionary mismatch") || lowerCase.contains("dictionary required") || lowerCase.contains("requires a dictionary")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m22284(SevenZipException sevenZipException) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.add(sevenZipException);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (hashSet.add(th)) {
                if ((th instanceof IOException) && !(th instanceof SevenZipException)) {
                    return (IOException) th;
                }
                if (th.getCause() != null) {
                    arrayDeque.add(th.getCause());
                }
                if (th instanceof SevenZipException) {
                    SevenZipException sevenZipException2 = (SevenZipException) th;
                    if (sevenZipException2.getCauseLastThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastThrown());
                    }
                    if (sevenZipException2.getCauseFirstPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseFirstPotentialThrown());
                    }
                    if (sevenZipException2.getCauseLastPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastPotentialThrown());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m22297(AbstractC7629 abstractC7629) throws C2299 {
        if (abstractC7629 instanceof C24320) {
            return ((C24320) abstractC7629).m54371();
        }
        if (abstractC7629 instanceof C11312) {
            return ((C11312) abstractC7629).m28593();
        }
        if (abstractC7629 instanceof C17036) {
            return ((C17036) abstractC7629).m40141();
        }
        if (abstractC7629 instanceof C9577) {
            return ((C9577) abstractC7629).m25012();
        }
        throw new C2299();
    }
}
