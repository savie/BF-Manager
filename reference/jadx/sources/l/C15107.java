package l;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܳۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15107 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f49301;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18415 f49302;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f49303;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f49304;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49305;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f49306;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22567 f49307 = new C22567(this);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f49308;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f49309;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f49310;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4183 f49311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f49312;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49313;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f49314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f49300 = C5261.m15832(16);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f49299 = C5261.m15832(4);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36375(C15107 c15107, InterfaceC2386 interfaceC2386, AbstractC21821 abstractC21821, String str, AtomicInteger atomicInteger, AbstractC7629 abstractC7629, Set set, C19583 c19583) {
        C10632 c10632M50793;
        c15107.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo8112 = interfaceC2386.mo8107() ? interfaceC2386.mo8112() : null;
            if (strMo8112 != null) {
                c10632M50793 = c15107.f49307.m50793(strMo8112);
                if (c15107.f49308) {
                    set.remove(c19583);
                    return;
                }
                Boolean bool = c10632M50793.f33722;
                if (bool != null) {
                    C17359.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC21821.m49472(new C1200(interfaceC2386, str));
                        atomicInteger.incrementAndGet();
                    } else {
                        set.remove(c19583);
                        return;
                    }
                }
            } else {
                c10632M50793 = null;
            }
            try {
                InputStream inputStreamMo20829 = abstractC7629.mo20829((AbstractActivityC17204) null, interfaceC2386);
                if (inputStreamMo20829 != null) {
                    if (inputStreamMo20829 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo20829;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo20829);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c15107.m36380(bufferedInputStream)) {
                            if (c10632M50793 != null) {
                                c10632M50793.f33722 = Boolean.TRUE;
                                c10632M50793.f33720.countDown();
                            }
                            abstractC21821.m49472(new C1200(interfaceC2386, str));
                            atomicInteger.incrementAndGet();
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
            if (c10632M50793 != null) {
                if (!(c10632M50793.f33722 != null)) {
                    c10632M50793.f33722 = Boolean.FALSE;
                    c10632M50793.f33720.countDown();
                }
            }
            set.remove(c19583);
        } catch (Throwable th3) {
            set.remove(c19583);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36376(C15107 c15107, InterfaceC2386 interfaceC2386, AbstractC21821 abstractC21821, C1200 c1200, AbstractC7629 abstractC7629, Set set, C19583 c19583) {
        C10632 c10632M50793;
        c15107.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo8112 = interfaceC2386.mo8107() ? interfaceC2386.mo8112() : null;
            if (strMo8112 != null) {
                c10632M50793 = c15107.f49307.m50793(strMo8112);
                if (c15107.f49308) {
                    set.remove(c19583);
                    return;
                }
                Boolean bool = c10632M50793.f33722;
                if (bool != null) {
                    C17359.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC21821.m49472(c1200);
                    } else {
                        set.remove(c19583);
                        return;
                    }
                }
            } else {
                c10632M50793 = null;
            }
            try {
                InputStream inputStreamMo20829 = abstractC7629.mo20829((AbstractActivityC17204) null, interfaceC2386);
                if (inputStreamMo20829 != null) {
                    if (inputStreamMo20829 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo20829;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo20829);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c15107.m36380(bufferedInputStream)) {
                            if (c10632M50793 != null) {
                                c10632M50793.f33722 = Boolean.TRUE;
                                c10632M50793.f33720.countDown();
                            }
                            abstractC21821.m49472(c1200);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Exception unused) {
            }
            if (c10632M50793 != null) {
                if (!(c10632M50793.f33722 != null)) {
                    c10632M50793.f33722 = Boolean.FALSE;
                    c10632M50793.f33720.countDown();
                }
            }
            set.remove(c19583);
        } catch (Throwable th3) {
            set.remove(c19583);
            throw th3;
        }
    }

    public C15107(final String str, EnumC16861 enumC16861, boolean z, long j, long j2, long j3, long j4, C18415 c18415) {
        InterfaceC4183 interfaceC4183;
        InterfaceC4183 interfaceC4184;
        InterfaceC4183 interfaceC4183M35264;
        if (str.isEmpty()) {
            interfaceC4183M35264 = new C17607();
        } else {
            switch (C24321.f78734[enumC16861.ordinal()]) {
                case 1:
                    interfaceC4183 = new InterfaceC4183() { // from class: l.ܶ۬ܳ
                        @Override // l.InterfaceC4183
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo11206(String str2) {
                            int iCharCount = 0;
                            while (!C6421.m18185(iCharCount, str2, str)) {
                                if (iCharCount == str2.length()) {
                                    return false;
                                }
                                iCharCount += Character.charCount(str2.codePointAt(iCharCount));
                            }
                            return true;
                        }
                    };
                    interfaceC4183M35264 = interfaceC4183;
                    break;
                case 2:
                    interfaceC4183 = new InterfaceC4183() { // from class: l.᩹۬ܳ
                        @Override // l.InterfaceC4183
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo11206(String str2) {
                            return C6421.m18185(0, str2, str);
                        }
                    };
                    interfaceC4183M35264 = interfaceC4183;
                    break;
                case 3:
                    final int iCodePointCount = str.codePointCount(0, str.length());
                    interfaceC4184 = new InterfaceC4183() { // from class: l.ۗ۬ܳ
                        @Override // l.InterfaceC4183
                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final boolean mo11206(String str2) {
                            int iCodePointCount2 = str2.codePointCount(0, str2.length());
                            int i = iCodePointCount;
                            if (iCodePointCount2 < i) {
                                return false;
                            }
                            return C6421.m18185(str2.offsetByCodePoints(0, iCodePointCount2 - i), str2, str);
                        }
                    };
                    interfaceC4183M35264 = interfaceC4184;
                    break;
                case 4:
                    final int iCodePointCount2 = str.codePointCount(0, str.length());
                    interfaceC4184 = new InterfaceC4183() { // from class: l.᩵۬ܳ
                        @Override // l.InterfaceC4183
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo11206(String str2) {
                            return str2.codePointCount(0, str2.length()) == iCodePointCount2 && C6421.m18185(0, str2, str);
                        }
                    };
                    interfaceC4183M35264 = interfaceC4184;
                    break;
                case 5:
                    interfaceC4183M35264 = C14623.m35264(str);
                    break;
                case 6:
                    final C4245 c4245Matcher = C18415.m42924(66, str).matcher((CharSequence) "");
                    interfaceC4183 = new InterfaceC4183() { // from class: l.ۨ۬ܳ
                        @Override // l.InterfaceC4183
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo11206(String str2) {
                            C4245 c4245 = c4245Matcher;
                            c4245.m13568reset((CharSequence) str2);
                            return c4245.matches();
                        }
                    };
                    interfaceC4183M35264 = interfaceC4183;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported filename match mode: " + enumC16861);
            }
        }
        this.f49311 = interfaceC4183M35264;
        this.f49310 = z;
        this.f49301 = j;
        this.f49306 = j2;
        this.f49305 = j3;
        this.f49303 = j4;
        this.f49302 = c18415;
        this.f49312 = (j == -1 && j2 == -1) ? false : true;
        this.f49304 = (j3 == -1 && j4 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36383() {
        this.f49308 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36384(final AbstractC7629 abstractC7629, String str, final AbstractC21821 abstractC21821, List list) {
        List listMo20830;
        this.f49308 = false;
        this.f49313 = false;
        this.f49307.m50794();
        this.f49309 = str;
        String str2 = "/";
        if (str.equals("/")) {
            this.f49314 = "/";
        } else {
            this.f49314 = "./";
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        LinkedList linkedList = new LinkedList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC17249());
        loop0: while (true) {
            if (linkedList.isEmpty()) {
                Set<C19583> set = setNewSetFromMap;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (!linkedHashMap2.isEmpty()) {
                    abstractC7629.mo20834(linkedHashMap2.keySet(), new C4667(this, linkedHashMap2, abstractC21821, atomicInteger));
                }
                for (C19583 c19583 : set) {
                    if (this.f49308) {
                        m36374(set);
                        break;
                    } else if (!c19583.f63147.isDone()) {
                        abstractC21821.mo33471(c19583.f63148, false);
                        try {
                            c19583.f63147.get();
                        } catch (Exception unused) {
                        }
                    }
                }
                break;
            }
            if (this.f49308) {
                m36374(setNewSetFromMap);
                break;
            }
            String strConcat = (String) linkedList.removeFirst();
            if (!strConcat.isEmpty() && !strConcat.endsWith(str2)) {
                strConcat = strConcat.concat(str2);
            }
            String str3 = strConcat;
            String strM23910 = C8947.m23910(new StringBuilder(), this.f49314, str3);
            boolean z = true;
            abstractC21821.mo33471(strM23910, true);
            try {
                listMo20830 = abstractC7629.mo20830(this.f49309 + str3, true);
            } catch (IOException unused2) {
                listMo20830 = Collections.EMPTY_LIST;
            }
            List<InterfaceC2386> list2 = listMo20830;
            for (final InterfaceC2386 interfaceC2386 : list2) {
                if (this.f49308) {
                    m36374(setNewSetFromMap);
                    break loop0;
                }
                if (atomicInteger.get() >= 10000) {
                    this.f49308 = z;
                    this.f49313 = z;
                    m36374(setNewSetFromMap);
                    break loop0;
                }
                if (m36381(interfaceC2386)) {
                    if (this.f49302 == null) {
                        abstractC21821.m49472(new C1200(interfaceC2386, strM23910));
                        atomicInteger.incrementAndGet();
                    } else if (!m36377(interfaceC2386)) {
                        continue;
                    } else if (abstractC7629.mo20841()) {
                        linkedHashMap.put(interfaceC2386, strM23910);
                    } else {
                        while (setNewSetFromMap.size() > 500) {
                            SystemClock.sleep(10L);
                            if (this.f49308) {
                                break loop0;
                            }
                        }
                        StringBuilder sbM27333 = C10732.m27333(strM23910);
                        sbM27333.append(interfaceC2386.getName());
                        final C19583 c19584 = new C19583(sbM27333.toString());
                        setNewSetFromMap.add(c19584);
                        final String str4 = strM23910;
                        c19584.f63147 = (abstractC7629 instanceof AbstractC18881 ? f49299 : f49300).submit(new Runnable() { // from class: l.ۜ۬ܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C15107.m36375(this.f23681, interfaceC2386, abstractC21821, str4, atomicInteger, abstractC7629, setNewSetFromMap, c19584);
                            }
                        });
                        z = true;
                        linkedHashMap = linkedHashMap;
                        str2 = str2;
                        strM23910 = strM23910;
                        str3 = str3;
                    }
                }
            }
            String str5 = str3;
            Set set2 = setNewSetFromMap;
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            String str6 = str2;
            if (this.f49310) {
                for (InterfaceC2386 interfaceC2387 : list2) {
                    if (interfaceC2387.isDirectory() && !interfaceC2387.mo8107() && (!(interfaceC2387 instanceof C6004) || !interfaceC2387.getName().contains(".recycle") || !C19632.m45281() || !interfaceC2387.getPath().equals(C19632.m45282().mo4294()))) {
                        StringBuilder sbM27334 = C10732.m27333(str5);
                        sbM27334.append(interfaceC2387.getName());
                        sbM27334.append('/');
                        linkedList.addLast(sbM27334.toString());
                    }
                }
            }
            linkedHashMap = linkedHashMap3;
            str2 = str6;
            setNewSetFromMap = set2;
        }
        if (this.f49313) {
            C21576.m49068(new RunnableC2691());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36385(final AbstractC7629 abstractC7629, List list, final AbstractC21821 abstractC21821) {
        this.f49308 = false;
        this.f49307.m50794();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set<C19583> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC17249());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C1200 c1200 = (C1200) it.next();
            abstractC21821.mo33471(c1200.m4417(), true);
            final InterfaceC2386 interfaceC2386M4414 = c1200.m4414();
            if (this.f49308) {
                m36374(setNewSetFromMap);
                return;
            }
            if (m36381(interfaceC2386M4414)) {
                if (this.f49302 == null) {
                    abstractC21821.m49472(c1200);
                } else if (!m36377(interfaceC2386M4414)) {
                    continue;
                } else if (abstractC7629.mo20841()) {
                    linkedHashMap.put(interfaceC2386M4414, c1200);
                } else {
                    while (setNewSetFromMap.size() > 500) {
                        SystemClock.sleep(10L);
                        if (this.f49308) {
                            return;
                        }
                    }
                    final C19583 c19583 = new C19583(c1200.m4419());
                    setNewSetFromMap.add(c19583);
                    c19583.f63147 = (abstractC7629 instanceof AbstractC18881 ? f49299 : f49300).submit(new Runnable() { // from class: l.ۡ۬ܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15107.m36376(this.f30518, interfaceC2386M4414, abstractC21821, c1200, abstractC7629, setNewSetFromMap, c19583);
                        }
                    });
                    it = it;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            abstractC7629.mo20834(linkedHashMap.keySet(), new C13877(this, linkedHashMap, abstractC21821));
        }
        for (C19583 c19584 : setNewSetFromMap) {
            if (this.f49308) {
                m36374(setNewSetFromMap);
                return;
            } else if (!c19584.f63147.isDone()) {
                abstractC21821.mo33471(c19584.f63148, false);
                try {
                    c19584.f63147.get();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m36381(InterfaceC2386 interfaceC2386) {
        if (this.f49312) {
            if (interfaceC2386.isDirectory()) {
                return false;
            }
            long size = interfaceC2386.getSize();
            long j = this.f49301;
            if (j != -1 && j > size) {
                return false;
            }
            long j2 = this.f49306;
            if (j2 != -1 && size >= j2) {
                return false;
            }
        }
        if (this.f49304) {
            long time = interfaceC2386.getTime();
            long j3 = this.f49305;
            if (j3 != -1 && j3 > time) {
                return false;
            }
            long j4 = this.f49303;
            if (j4 != -1 && time >= j4) {
                return false;
            }
        }
        return this.f49311.mo11206(interfaceC2386.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36377(InterfaceC2386 interfaceC2386) {
        if (!interfaceC2386.mo8090() || interfaceC2386.getSize() <= 0) {
            return false;
        }
        String path = interfaceC2386.getPath();
        if (path.startsWith("/sys/devices/")) {
            return false;
        }
        if (path.startsWith("/proc/") && path.contains("/fd/")) {
            return false;
        }
        String strMo8112 = interfaceC2386.mo8112();
        if (strMo8112 != null) {
            return (!strMo8112.startsWith("/") || strMo8112.startsWith("/memfd:") || strMo8112.equals("/dmabuf:") || strMo8112.equals("/[aio] (deleted)") || strMo8112.startsWith("/sys/devices/")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36374(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C19583 c19583 = (C19583) it.next();
            if (!c19583.f63147.isDone()) {
                c19583.f63147.cancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BufferedInputStream m36373(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m36380(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        inputStream.mark(65536);
        int i = inputStream.read(bArr);
        if (i == -1) {
            return false;
        }
        Charset charsetM8272 = C2448.m8272(C2448.m8273(i, bArr));
        inputStream.reset();
        C5957 c5957 = new C5957(new InputStreamReader(inputStream, charsetM8272));
        return c5957.m17336(this.f49302.matcher((CharSequence) c5957), new InterfaceC7509() { // from class: l.۠۬ܳ
            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return this.f28262.f49308;
            }
        }, false);
    }
}
