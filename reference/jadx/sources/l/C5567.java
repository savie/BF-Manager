package l;

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

/* JADX INFO: renamed from: l.ۚ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f19088 = "MIUI BACKUP\n".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m15375(long j, long j2) {
        return j2 > C17492.FOREVER_NS - j ? C17492.FOREVER_NS : j + j2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m15373(AbstractC9677 abstractC9677) {
        return m15374(abstractC9677).mo33986();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4861 m15376(AbstractC9677 abstractC9677) throws IOException, C2744 {
        LinkedHashMap linkedHashMapM15358 = m15358(abstractC9677);
        LinkedHashMap linkedHashMap = new LinkedHashMap(linkedHashMapM15358.size());
        for (AbstractC20745 abstractC20745 : linkedHashMapM15358.values()) {
            linkedHashMap.put(abstractC20745.mo33986(), m15377(abstractC20745));
        }
        HashMap map = new HashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C13638.requireNonNull(key);
            Object value = entry.getValue();
            C13638.requireNonNull(value);
            map.put(key, value);
        }
        return new C4861(C0561.unmodifiableMap(map));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[LOOP:1: B:23:0x0079->B:25:0x007f, LOOP_END] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m15358(AbstractC9677 abstractC9677) throws IOException, C2744 {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC20745 abstractC20745M15374 = m15374(abstractC9677);
        linkedHashMap.put(abstractC20745M15374.mo33986(), abstractC20745M15374);
        if (abstractC9677 instanceof C8289) {
            C8289 c8289 = (C8289) abstractC9677;
            if (c8289.m21724()) {
                try {
                    C17367 c17367 = new C17367(c8289.m21725());
                    int i = c17367.readInt();
                    if (i <= 0 || i > 10000) {
                        throw new IOException("Invalid ZIP split volume count: " + i);
                    }
                    AbstractC20745 abstractC20745M46711 = abstractC20745M15374.m46711();
                    for (int i2 = 0; i2 < i; i2++) {
                        AbstractC20745 abstractC20745M46690 = abstractC20745M46711.m46690(c17367.m40458());
                        c17367.readLong();
                        linkedHashMap.put(abstractC20745M46690.mo33986(), abstractC20745M46690);
                    }
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Invalid ZIP split metadata", e);
                }
            } else if (abstractC9677 instanceof C21920) {
                for (AbstractC20745 abstractC20745 : ((C21920) abstractC9677).m48743()) {
                    linkedHashMap.put(abstractC20745.mo33986(), abstractC20745);
                }
            }
        } else if (abstractC9677 instanceof C21920) {
            while (r6.hasNext()) {
                linkedHashMap.put(abstractC20745.mo33986(), abstractC20745);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5942 m15377(AbstractC20745 abstractC20745) throws FileNotFoundException {
        if (!abstractC20745.mo33975() || !abstractC20745.mo33971()) {
            throw new FileNotFoundException(abstractC20745.mo33986());
        }
        return new C5942(abstractC20745.mo33986(), abstractC20745.mo33964(), abstractC20745.mo33991());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23582 m15363(AbstractC9677 abstractC9677, C10197 c10197) {
        try {
            if (abstractC9677 instanceof C8289) {
                m15368((C8289) abstractC9677, c10197);
            } else if (abstractC9677 instanceof C5445) {
                m15366((C5445) abstractC9677, c10197);
            } else if (abstractC9677 instanceof C21920) {
                m15371((C21920) abstractC9677, c10197);
            } else if (abstractC9677 instanceof C14865) {
                m15370((C14865) abstractC9677, c10197);
            } else {
                throw new C2744();
            }
            if (!c10197.m25972()) {
                return new C23582(EnumC14035.VALID, null, null);
            }
            return new C23582(EnumC14035.CANCELED, null, null);
        } catch (C2744 unused) {
            return new C23582(EnumC14035.UNSUPPORTED, null, null);
        } catch (C10882 e) {
            return new C23582(EnumC14035.INVALID, e.f36994, null);
        } catch (C11918 unused2) {
            return new C23582(EnumC14035.CANCELED, null, null);
        } catch (Exception e2) {
            return new C23582(EnumC14035.FAILED, null, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15368(final C8289 c8289, final C10197 c10197) throws Exception {
        int iMax;
        int i;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            ArrayList<C12107> arrayList = new ArrayList(c8289.m21716());
            C9030.removeIf(arrayList, new C12252(1));
            C23846.sort(arrayList, C7618.comparingLong(new C20759()));
            Iterator it = arrayList.iterator();
            long jM15375 = 0;
            while (it.hasNext()) {
                jM15375 = m15375(jM15375, Math.max(1L, ((C12107) it.next()).getSize()));
            }
            final C9471 c9471 = new C9471(Math.max(1L, jM15375), c10197);
            ArrayList<C12107> arrayList2 = new ArrayList();
            ArrayList<C12107> arrayList3 = new ArrayList();
            for (C12107 c12107 : arrayList) {
                if (!c12107.m30133() && (c12107.m30119() == 0 || c12107.m30119() == 8)) {
                    arrayList2.add(c12107);
                } else {
                    arrayList3.add(c12107);
                }
            }
            boolean zMo36912 = c8289.m21723().mo36912();
            boolean zM21724 = c8289.m21724();
            int size = arrayList2.size();
            if (!zMo36912) {
                iMax = 1;
            } else if (size < 2) {
                iMax = 1;
            } else {
                iMax = Math.max(1, Math.min(size, Math.min(zM21724 ? 2 : 4, Math.max(1, iAvailableProcessors))));
            }
            if (iMax <= 1) {
                arrayList3.addAll(arrayList2);
                C23846.sort(arrayList3, C7618.comparingLong(new C20759()));
            } else {
                long jM15376 = 0;
                for (C12107 c12108 : arrayList2) {
                    jM15376 = m15375(jM15376, Math.max(1L, Math.max(c12108.m30138(), c12108.getSize())));
                }
                long jM15377 = 0;
                long j = iMax;
                int i2 = 0;
                long jMax = Math.max(1L, ((long) (jM15376 % j == 0 ? 0 : 1)) + (jM15376 / j));
                ArrayList<List> arrayList4 = new ArrayList(iMax);
                ArrayList arrayList5 = new ArrayList();
                while (i2 < arrayList2.size()) {
                    int size2 = arrayList2.size() - i2;
                    int size3 = iMax - arrayList4.size();
                    if (!arrayList5.isEmpty() && size3 > 1 && size2 >= (i = size3 - 1) && (jM15377 >= jMax || size2 == i)) {
                        arrayList4.add(arrayList5);
                        arrayList5 = new ArrayList();
                        jM15377 = 0;
                    }
                    C12107 c12109 = (C12107) arrayList2.get(i2);
                    arrayList5.add(c12109);
                    jM15377 = m15375(jM15377, Math.max(1L, Math.max(c12109.m30138(), c12109.getSize())));
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
                    arrayList6.add(executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ܺ۠᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5567.m15367(c8289, list, c10197, atomicBoolean, c9471, atomicReference);
                        }
                    }));
                }
                executorServiceNewFixedThreadPool.shutdown();
                while (!executorServiceNewFixedThreadPool.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    try {
                        c9471.m24252();
                        if (c10197.m25972() || atomicReference.get() != null) {
                            atomicBoolean.set(true);
                            Iterator it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                ((Future) it2.next()).cancel(true);
                            }
                            executorServiceNewFixedThreadPool.shutdownNow();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        c10197.cancel();
                        atomicBoolean.set(true);
                        executorServiceNewFixedThreadPool.shutdownNow();
                        throw new C11918();
                    }
                }
                if (c10197.m25972()) {
                    throw new C11918();
                }
                Throwable th = (Throwable) atomicReference.get();
                if (th != null) {
                    if (th instanceof Exception) {
                        throw ((Exception) th);
                    }
                    throw new Exception(th);
                }
            }
            if (!arrayList3.isEmpty()) {
                C2455 c2455M7448 = C2455.m7448(c8289.m21723(), c8289.m21725());
                try {
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean();
                    byte[] bArr = new byte[65536];
                    for (C12107 c121010 : arrayList3) {
                        m15369(c10197, atomicBoolean2);
                        m15365(c2455M7448, c8289, c121010, bArr, c9471, true, c10197, atomicBoolean2);
                    }
                    c2455M7448.close();
                } catch (Throwable th2) {
                    try {
                        c2455M7448.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            c9471.m24253();
            c9471.m24252();
        } catch (IOException e) {
            throw new C10882(null, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15367(C8289 c8289, List list, C10197 c10197, AtomicBoolean atomicBoolean, C9471 c9471, AtomicReference atomicReference) {
        byte[] bArr = new byte[65536];
        try {
            C2455 c2455M7448 = C2455.m7448(c8289.m21723(), c8289.m21725());
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C12107 c12107 = (C12107) it.next();
                    m15369(c10197, atomicBoolean);
                    m15365(c2455M7448, c8289, c12107, bArr, c9471, false, c10197, atomicBoolean);
                }
                c2455M7448.close();
            } catch (Throwable th) {
                try {
                    c2455M7448.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (!(th3 instanceof C11918)) {
                while (!atomicReference.compareAndSet(null, th3) && atomicReference.get() == null) {
                }
            }
            atomicBoolean.set(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x017a A[EDGE_INSN: B:185:0x017a->B:89:0x017a BREAK  A[LOOP:3: B:86:0x0164->B:88:0x016b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b A[Catch: all -> 0x01a0, LOOP:3: B:86:0x0164->B:88:0x016b, LOOP_END, TryCatch #0 {all -> 0x01a0, blocks: (B:83:0x015c, B:86:0x0164, B:88:0x016b, B:89:0x017a, B:91:0x0186, B:96:0x0196, B:97:0x019f), top: B:154:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0186 A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:83:0x015c, B:86:0x0164, B:88:0x016b, B:89:0x017a, B:91:0x0186, B:96:0x0196, B:97:0x019f), top: B:154:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0196 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:83:0x015c, B:86:0x0164, B:88:0x016b, B:89:0x017a, B:91:0x0186, B:96:0x0196, B:97:0x019f), top: B:154:0x015c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9, types: [l.۫ܶۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15365(C2455 c2455, C8289 c8289, C12107 c12107, byte[] bArr, C9471 c9471, boolean z, final C10197 c10197, AtomicBoolean atomicBoolean) throws Throwable {
        boolean zM16304;
        String str;
        boolean z2;
        boolean z3;
        BufferedInputStream bufferedInputStream;
        long jM15375;
        int i;
        List list;
        boolean z4;
        String str2;
        int i2 = -1;
        if (!c12107.m30133()) {
            try {
                InputStream inputStreamM7478 = c2455.m7478(c12107);
                while (true) {
                    try {
                        int i3 = inputStreamM7478.read(bArr);
                        if (i3 == -1) {
                            break;
                        }
                        m15369(c10197, atomicBoolean);
                        c9471.m24250(i3);
                        if (z) {
                            c9471.m24252();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamM7478.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                m15369(c10197, atomicBoolean);
                if (c12107.getSize() == 0) {
                    c9471.m24250(1L);
                }
                inputStreamM7478.close();
                return;
            } catch (C11918 e) {
                throw e;
            } catch (IOException e2) {
                if (m15372(e2)) {
                    throw new C2744(e2);
                }
                throw new C10882(c12107.getName(), e2);
            }
        }
        ?? r8 = 0;
        if (C19808.m45041(c12107)) {
            String strM21722 = c8289.m21722();
            List listM45034 = null;
            while (true) {
                m15369(c10197, atomicBoolean);
                if (strM21722 == null || strM21722.isEmpty()) {
                    if (listM45034 == null) {
                        listM45034 = C19808.m45034(c2455, c12107, new InterfaceC5614() { // from class: l.᩶۠᩹
                            @Override // l.InterfaceC5614
                            /* JADX INFO: renamed from: ֨ */
                            public final boolean mo2357() {
                                return c10197.m25972();
                            }
                        });
                    }
                    AtomicReference atomicReference = new AtomicReference();
                    C6004 c6004 = new C6004((AbstractActivityC12483) r8, new C0297(atomicReference));
                    c6004.m16303(new C7353(c10197));
                    if (!c6004.m16305(listM45034)) {
                        c10197.cancel();
                        throw new C11918();
                    }
                    strM21722 = (String) atomicReference.get();
                    list = listM45034;
                    z4 = true;
                } else {
                    list = listM45034;
                    z4 = false;
                }
                String str3 = strM21722;
                c2455.m7474(str3);
                long jM15376 = 0;
                try {
                    try {
                        try {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(c2455.m7478(c12107));
                            try {
                                try {
                                    if (!C19808.m45042(c12107, bufferedInputStream2)) {
                                        throw new C17978(c12107.getName());
                                    }
                                    while (true) {
                                        int i4 = bufferedInputStream2.read(bArr);
                                        if (i4 == i2) {
                                            break;
                                        }
                                        m15369(c10197, atomicBoolean);
                                        str2 = str3;
                                        long j = i4;
                                        try {
                                            jM15376 = m15375(jM15376, j);
                                            c9471.m24254(j);
                                            c9471.m24252();
                                            str3 = str2;
                                            i2 = -1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        th = th3;
                                    }
                                    str2 = str3;
                                    m15369(c10197, atomicBoolean);
                                    c9471.m24251(c12107.getSize(), jM15376);
                                    C11088.m27973(c8289.m21715(), str2);
                                    bufferedInputStream2.close();
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            Throwable th6 = th;
                            try {
                                bufferedInputStream2.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        } catch (C17978 unused) {
                            c9471.m24249();
                            c9471.m24252();
                            C11088.m27969(c8289.m21715(), r8);
                            if (z4) {
                                C19808.m45036();
                            }
                            listM45034 = list;
                            strM21722 = null;
                            i2 = -1;
                            r8 = 0;
                        }
                    } catch (C17978 unused2) {
                        r8 = str3;
                        c9471.m24249();
                        c9471.m24252();
                        C11088.m27969(c8289.m21715(), r8);
                        if (z4) {
                            C19808.m45036();
                        }
                        listM45034 = list;
                        strM21722 = null;
                        i2 = -1;
                        r8 = 0;
                    }
                } catch (C11918 e3) {
                    throw e3;
                } catch (IOException e4) {
                    if (m15372(e4)) {
                        throw new C2744(e4);
                    }
                    throw new C10882(c12107.getName(), e4);
                }
                listM45034 = list;
                strM21722 = null;
                i2 = -1;
                r8 = 0;
            }
        } else {
            AbstractActivityC12483 abstractActivityC12483 = null;
            Iterator itM27974 = null;
            while (true) {
                m15369(c10197, atomicBoolean);
                String strM21723 = c8289.m21722();
                try {
                    try {
                        if (strM21723 == null || strM21723.isEmpty()) {
                            if (itM27974 == null) {
                                itM27974 = C11088.m27974();
                            }
                            if (itM27974.hasNext()) {
                                str = (String) itM27974.next();
                                c8289.m21713(str);
                                z2 = false;
                                z3 = true;
                            } else {
                                C6004 c6005 = new C6004(abstractActivityC12483, new C3078(1, c8289));
                                c6005.m16303(new C7353(c10197));
                                zM16304 = c6005.m16304();
                                if (!zM16304) {
                                    c10197.cancel();
                                    throw new C11918();
                                }
                                strM21723 = c8289.m21722();
                            }
                            c2455.m7474(str);
                            bufferedInputStream = new BufferedInputStream(c2455.m7478(c12107));
                            if (C19808.m45042(c12107, bufferedInputStream)) {
                                throw new C17978(c12107.getName());
                            }
                            jM15375 = 0;
                            while (true) {
                                i = bufferedInputStream.read(bArr);
                                if (i != -1) {
                                    break;
                                }
                                m15369(c10197, atomicBoolean);
                                long j2 = i;
                                jM15375 = m15375(jM15375, j2);
                                c9471.m24254(j2);
                                c9471.m24252();
                            }
                            m15369(c10197, atomicBoolean);
                            c9471.m24251(c12107.getSize(), jM15375);
                            if (z3) {
                                C19808.m45037(str, c8289.m21715());
                            }
                            bufferedInputStream.close();
                            break;
                        }
                        zM16304 = false;
                        if (C19808.m45042(c12107, bufferedInputStream)) {
                            throw new C17978(c12107.getName());
                        }
                        jM15375 = 0;
                        while (true) {
                            i = bufferedInputStream.read(bArr);
                            if (i != -1) {
                                break;
                                break;
                            }
                            m15369(c10197, atomicBoolean);
                            long j3 = i;
                            jM15375 = m15375(jM15375, j3);
                            c9471.m24254(j3);
                            c9471.m24252();
                        }
                        m15369(c10197, atomicBoolean);
                        c9471.m24251(c12107.getSize(), jM15375);
                        if (z3) {
                            C19808.m45037(str, c8289.m21715());
                        }
                        bufferedInputStream.close();
                        break;
                    } catch (Throwable th8) {
                        try {
                            bufferedInputStream.close();
                            throw th8;
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                            throw th8;
                        }
                    }
                    bufferedInputStream = new BufferedInputStream(c2455.m7478(c12107));
                } catch (C11918 e5) {
                    throw e5;
                } catch (C17978 unused3) {
                    c9471.m24249();
                    c9471.m24252();
                    abstractActivityC12483 = null;
                    c8289.m21713(null);
                    if (z2) {
                        C19808.m45036();
                    }
                } catch (IOException e6) {
                    if (m15372(e6)) {
                        throw new C2744(e6);
                    }
                    boolean zM30118 = c12107.m30118();
                    if (z3 && zM30118) {
                        c9471.m24249();
                        c9471.m24252();
                        abstractActivityC12483 = null;
                        c8289.m21713(null);
                    } else {
                        throw new C10882(c12107.getName(), e6);
                    }
                }
                z3 = false;
                String str4 = strM21723;
                z2 = zM16304;
                str = str4;
                c2455.m7474(str);
            }
        }
        if (z) {
            c9471.m24252();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15366(C5445 c5445, C10197 c10197) {
        String strM25433;
        C7226 c7226;
        Throwable th;
        AbstractC20745 abstractC20745M15083 = c5445.m15083();
        C17231 c17231 = new C17231(abstractC20745M15083.mo33970(), abstractC20745M15083.mo33964(), c10197);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(c17231, 65536);
            Throwable th2 = null;
            try {
                try {
                    try {
                        InputStream inputStreamM17377 = C6296.m17377(bufferedInputStream, new C10176(bufferedInputStream));
                        if (inputStreamM17377 == null) {
                            inputStreamM17377 = bufferedInputStream;
                        }
                        BufferedInputStream bufferedInputStream2 = inputStreamM17377 instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM17377 : new BufferedInputStream(inputStreamM17377, 65536);
                        m15364(bufferedInputStream2);
                        if (c5445.m15078().isEmpty()) {
                            c7226 = new C7226(bufferedInputStream2, 512, null);
                        } else {
                            c7226 = new C7226(bufferedInputStream2, 512, c5445.m15078());
                        }
                        c7226.m19247();
                        while (true) {
                            try {
                                try {
                                    C10049 c10049M19248 = c7226.m19248();
                                    if (c10049M19248 == null) {
                                        byte[] bArr = new byte[65536];
                                        while (true) {
                                            int i = bufferedInputStream2.read(bArr);
                                            if (i != -1) {
                                                m15369(c10197, (AtomicBoolean) null);
                                                for (int i2 = 0; i2 < i; i2++) {
                                                    if (bArr[i2] != 0) {
                                                        throw new IOException("Non-zero data after TAR end marker");
                                                    }
                                                }
                                            } else {
                                                m15369(c10197, (AtomicBoolean) null);
                                                c7226.close();
                                                bufferedInputStream.close();
                                                c17231.close();
                                                return;
                                            }
                                        }
                                    } else {
                                        strM25433 = c10049M19248.m25433();
                                        try {
                                            byte[] bArr2 = new byte[65536];
                                            long j = 0;
                                            while (true) {
                                                int i3 = c7226.read(bArr2);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                m15369(c10197, (AtomicBoolean) null);
                                                j += (long) i3;
                                            }
                                            m15369(c10197, (AtomicBoolean) null);
                                            if (c10049M19248.m25417() >= 0 && j != c10049M19248.m25417()) {
                                                throw new C10882(strM25433, new IOException("Unexpected TAR entry size: " + j + " != " + c10049M19248.m25417()));
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                c7226.close();
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
                                    strM25433 = null;
                                    c7226.close();
                                    throw th;
                                }
                            } catch (IOException e2) {
                                C10049 c10049M19246 = c7226.m19246();
                                if (c10049M19246 != null && !c10049M19246.m25437()) {
                                    c10049M19246.m25433();
                                    throw e2;
                                }
                                throw e2;
                            }
                            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                                if (C3119.class.isInstance(cause)) {
                                    th2 = (Throwable) C3119.class.cast(cause);
                                    break;
                                }
                            }
                            C3119 c3119 = (C3119) th2;
                            if (c3119 != null) {
                                throw c3119;
                            }
                            if (m15372(e)) {
                                throw new C2744(e);
                            }
                            throw new C10882(strM25433, e);
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
                    strM25433 = null;
                }
            } catch (RuntimeException e4) {
                if (m15372(e4)) {
                    throw new C2744(e4);
                }
                throw e4;
            } catch (C10882 e5) {
            } catch (C11918 e6) {
                throw e6;
            }
        } catch (Throwable th8) {
            try {
                c17231.close();
                throw th8;
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
                throw th8;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15370(C14865 c14865, C10197 c10197) throws IOException, C10882 {
        Throwable th = null;
        try {
            c14865.mo10267(false);
            C6397 c6397M35543 = c14865.m35543();
            AbstractC20745 abstractC20745M35542 = c14865.m35542();
            InputStream inputStreamMo33970 = abstractC20745M35542.mo33970();
            try {
                try {
                    try {
                        InputStream inputStreamM36617 = c6397M35543.m17543().m36617(new C17231(inputStreamMo33970, abstractC20745M35542.mo33964(), c10197));
                        try {
                            byte[] bArr = new byte[65536];
                            while (inputStreamM36617.read(bArr) != -1) {
                                m15369(c10197, (AtomicBoolean) null);
                            }
                            m15369(c10197, (AtomicBoolean) null);
                            inputStreamM36617.close();
                            if (inputStreamMo33970 != null) {
                                inputStreamMo33970.close();
                            }
                        } catch (Throwable th2) {
                            if (inputStreamM36617 != null) {
                                try {
                                    inputStreamM36617.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (C11918 e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    for (Throwable cause = e2; cause != null; cause = cause.getCause()) {
                        if (C3119.class.isInstance(cause)) {
                            th = (Throwable) C3119.class.cast(cause);
                            break;
                        }
                    }
                    C3119 c3119 = (C3119) th;
                    if (c3119 != null) {
                        throw c3119;
                    }
                    if (m15372(e2)) {
                        throw new C2744(e2);
                    }
                    throw new C10882(c6397M35543.getName(), e2);
                } catch (RuntimeException e3) {
                    if (m15372(e3)) {
                        throw new C2744(e3);
                    }
                    throw e3;
                }
            } catch (Throwable th4) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IOException e4) {
            throw new C10882(null, e4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15364(BufferedInputStream bufferedInputStream) throws IOException {
        int i;
        byte[] bArr = f19088;
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
    public static void m15371(l.C21920 r9, l.C10197 r10) throws java.io.IOException, l.C10882 {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5567.m15371(l.᩸᩻᩹, l.ۤۡ᩹):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15369(InterfaceC12293 interfaceC12293, AtomicBoolean atomicBoolean) throws C11918 {
        if (((C10197) interfaceC12293).m25972() || Thread.currentThread().isInterrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new C11918();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15372(Exception exc) {
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
    public static IOException m15360(SevenZipException sevenZipException) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m15374(AbstractC9677 abstractC9677) throws C2744 {
        if (abstractC9677 instanceof C8289) {
            return ((C8289) abstractC9677).m21723();
        }
        if (abstractC9677 instanceof C5445) {
            return ((C5445) abstractC9677).m15083();
        }
        if (abstractC9677 instanceof C21920) {
            return ((C21920) abstractC9677).m48747();
        }
        if (abstractC9677 instanceof C14865) {
            return ((C14865) abstractC9677).m35542();
        }
        throw new C2744();
    }
}
