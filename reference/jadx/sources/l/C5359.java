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

/* JADX INFO: renamed from: l.ۚ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5359 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f18508;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18509;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f18510;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14690 f18511;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7601 f18512;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f18513;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f18514;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f18515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18516;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f18517;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f18518;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f18519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11710 f18520 = new C11710(this);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f18521;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f18507 = C4716.m13048(16);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f18506 = C4716.m13048(4);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14856(C5359 c5359, InterfaceC2557 interfaceC2557, AbstractC4653 abstractC4653, String str, AtomicInteger atomicInteger, AbstractC9677 abstractC9677, Set set, C2536 c2536) {
        C13827 c13827M29249;
        c5359.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo7978 = interfaceC2557.mo7986() ? interfaceC2557.mo7978() : null;
            if (strMo7978 != null) {
                c13827M29249 = c5359.f18520.m29249(strMo7978);
                if (c5359.f18518) {
                    set.remove(c2536);
                    return;
                }
                Boolean bool = c13827M29249.f45637;
                if (bool != null) {
                    C13638.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC4653.m12846(new C6189(interfaceC2557, str));
                        atomicInteger.incrementAndGet();
                    } else {
                        set.remove(c2536);
                        return;
                    }
                }
            } else {
                c13827M29249 = null;
            }
            try {
                InputStream inputStreamMo15073 = abstractC9677.mo15073((AbstractActivityC12483) null, interfaceC2557);
                if (inputStreamMo15073 != null) {
                    if (inputStreamMo15073 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo15073;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo15073);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c5359.m14861(bufferedInputStream)) {
                            if (c13827M29249 != null) {
                                c13827M29249.f45637 = Boolean.TRUE;
                                c13827M29249.f45635.countDown();
                            }
                            abstractC4653.m12846(new C6189(interfaceC2557, str));
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
            if (c13827M29249 != null) {
                if (!(c13827M29249.f45637 != null)) {
                    c13827M29249.f45637 = Boolean.FALSE;
                    c13827M29249.f45635.countDown();
                }
            }
            set.remove(c2536);
        } catch (Throwable th3) {
            set.remove(c2536);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14857(C5359 c5359, InterfaceC2557 interfaceC2557, AbstractC4653 abstractC4653, C6189 c6189, AbstractC9677 abstractC9677, Set set, C2536 c2536) {
        C13827 c13827M29249;
        c5359.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String strMo7978 = interfaceC2557.mo7986() ? interfaceC2557.mo7978() : null;
            if (strMo7978 != null) {
                c13827M29249 = c5359.f18520.m29249(strMo7978);
                if (c5359.f18518) {
                    set.remove(c2536);
                    return;
                }
                Boolean bool = c13827M29249.f45637;
                if (bool != null) {
                    C13638.requireNonNull(bool);
                    if (bool.booleanValue()) {
                        abstractC4653.m12846(c6189);
                    } else {
                        set.remove(c2536);
                        return;
                    }
                }
            } else {
                c13827M29249 = null;
            }
            try {
                InputStream inputStreamMo15073 = abstractC9677.mo15073((AbstractActivityC12483) null, interfaceC2557);
                if (inputStreamMo15073 != null) {
                    if (inputStreamMo15073 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) inputStreamMo15073;
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStreamMo15073);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c5359.m14861(bufferedInputStream)) {
                            if (c13827M29249 != null) {
                                c13827M29249.f45637 = Boolean.TRUE;
                                c13827M29249.f45635.countDown();
                            }
                            abstractC4653.m12846(c6189);
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
            if (c13827M29249 != null) {
                if (!(c13827M29249.f45637 != null)) {
                    c13827M29249.f45637 = Boolean.FALSE;
                    c13827M29249.f45635.countDown();
                }
            }
            set.remove(c2536);
        } catch (Throwable th3) {
            set.remove(c2536);
            throw th3;
        }
    }

    public C5359(final String str, EnumC23124 enumC23124, boolean z, long j, long j2, long j3, long j4, C14690 c14690) {
        InterfaceC7601 interfaceC7601;
        InterfaceC7601 interfaceC7602;
        InterfaceC7601 interfaceC7601M47176;
        if (str.isEmpty()) {
            interfaceC7601M47176 = new C15363();
        } else {
            switch (C10424.f35614[enumC23124.ordinal()]) {
                case 1:
                    interfaceC7601 = new InterfaceC7601() { // from class: l.᩸ܽ᩹
                        @Override // l.InterfaceC7601
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo20124(String str2) {
                            int iCharCount = 0;
                            while (!C9013.m23330(iCharCount, str2, str)) {
                                if (iCharCount == str2.length()) {
                                    return false;
                                }
                                iCharCount += Character.charCount(str2.codePointAt(iCharCount));
                            }
                            return true;
                        }
                    };
                    interfaceC7601M47176 = interfaceC7601;
                    break;
                case 2:
                    interfaceC7601 = new InterfaceC7601() { // from class: l.ᩳܽ᩹
                        @Override // l.InterfaceC7601
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo20124(String str2) {
                            return C9013.m23330(0, str2, str);
                        }
                    };
                    interfaceC7601M47176 = interfaceC7601;
                    break;
                case 3:
                    final int iCodePointCount = str.codePointCount(0, str.length());
                    interfaceC7602 = new InterfaceC7601() { // from class: l.ᩴܽ᩹
                        @Override // l.InterfaceC7601
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo20124(String str2) {
                            int iCodePointCount2 = str2.codePointCount(0, str2.length());
                            int i = iCodePointCount;
                            if (iCodePointCount2 < i) {
                                return false;
                            }
                            return C9013.m23330(str2.offsetByCodePoints(0, iCodePointCount2 - i), str2, str);
                        }
                    };
                    interfaceC7601M47176 = interfaceC7602;
                    break;
                case 4:
                    final int iCodePointCount2 = str.codePointCount(0, str.length());
                    interfaceC7602 = new InterfaceC7601() { // from class: l.۠ܽ᩹
                        @Override // l.InterfaceC7601
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo20124(String str2) {
                            return str2.codePointCount(0, str2.length()) == iCodePointCount2 && C9013.m23330(0, str2, str);
                        }
                    };
                    interfaceC7601M47176 = interfaceC7602;
                    break;
                case 5:
                    interfaceC7601M47176 = C21006.m47176(str);
                    break;
                case 6:
                    final C6222 c6222Matcher = C14690.m35218(66, str).matcher((CharSequence) "");
                    interfaceC7601 = new InterfaceC7601() { // from class: l.᩵ܽ᩹
                        @Override // l.InterfaceC7601
                        /* JADX INFO: renamed from: ۙ */
                        public final boolean mo20124(String str2) {
                            C6222 c6222 = c6222Matcher;
                            c6222.m17276reset((CharSequence) str2);
                            return c6222.matches();
                        }
                    };
                    interfaceC7601M47176 = interfaceC7601;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported filename match mode: " + enumC23124);
            }
        }
        this.f18512 = interfaceC7601M47176;
        this.f18519 = z;
        this.f18510 = j;
        this.f18508 = j2;
        this.f18513 = j3;
        this.f18515 = j4;
        this.f18511 = c14690;
        this.f18516 = (j == -1 && j2 == -1) ? false : true;
        this.f18514 = (j3 == -1 && j4 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14864() {
        this.f18518 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14865(final AbstractC9677 abstractC9677, String str, final AbstractC4653 abstractC4653, List list) {
        List listMo10263;
        this.f18518 = false;
        this.f18509 = false;
        this.f18520.m29250();
        this.f18517 = str;
        String str2 = "/";
        if (str.equals("/")) {
            this.f18521 = "/";
        } else {
            this.f18521 = "./";
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        LinkedList linkedList = new LinkedList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC13783());
        loop0: while (true) {
            if (linkedList.isEmpty()) {
                Set<C2536> set = setNewSetFromMap;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (!linkedHashMap2.isEmpty()) {
                    abstractC9677.mo24617(linkedHashMap2.keySet(), new C3366(this, linkedHashMap2, abstractC4653, atomicInteger));
                }
                for (C2536 c2536 : set) {
                    if (this.f18518) {
                        m14855(set);
                        break;
                    } else if (!c2536.f10043.isDone()) {
                        abstractC4653.mo12845(c2536.f10044, false);
                        try {
                            c2536.f10043.get();
                        } catch (Exception unused) {
                        }
                    }
                }
                break;
            }
            if (this.f18518) {
                m14855(setNewSetFromMap);
                break;
            }
            String strConcat = (String) linkedList.removeFirst();
            if (!strConcat.isEmpty() && !strConcat.endsWith(str2)) {
                strConcat = strConcat.concat(str2);
            }
            String str3 = strConcat;
            String strM50267 = C22697.m50267(new StringBuilder(), this.f18521, str3);
            boolean z = true;
            abstractC4653.mo12845(strM50267, true);
            try {
                listMo10263 = abstractC9677.mo10263(this.f18517 + str3, true);
            } catch (IOException unused2) {
                listMo10263 = Collections.EMPTY_LIST;
            }
            List<InterfaceC2557> list2 = listMo10263;
            for (final InterfaceC2557 interfaceC2557 : list2) {
                if (this.f18518) {
                    m14855(setNewSetFromMap);
                    break loop0;
                }
                if (atomicInteger.get() >= 10000) {
                    this.f18518 = z;
                    this.f18509 = z;
                    m14855(setNewSetFromMap);
                    break loop0;
                }
                if (m14862(interfaceC2557)) {
                    if (this.f18511 == null) {
                        abstractC4653.m12846(new C6189(interfaceC2557, strM50267));
                        atomicInteger.incrementAndGet();
                    } else if (!m14858(interfaceC2557)) {
                        continue;
                    } else if (abstractC9677.mo24621()) {
                        linkedHashMap.put(interfaceC2557, strM50267);
                    } else {
                        while (setNewSetFromMap.size() > 500) {
                            SystemClock.sleep(10L);
                            if (this.f18518) {
                                break loop0;
                            }
                        }
                        StringBuilder sbM23356 = C9023.m23356(strM50267);
                        sbM23356.append(interfaceC2557.getName());
                        final C2536 c2537 = new C2536(sbM23356.toString());
                        setNewSetFromMap.add(c2537);
                        final String str4 = strM50267;
                        c2537.f10043 = (abstractC9677 instanceof AbstractC12233 ? f18506 : f18507).submit(new Runnable() { // from class: l.֫ܽ᩹
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5359.m14856(this.f7361, interfaceC2557, abstractC4653, str4, atomicInteger, abstractC9677, setNewSetFromMap, c2537);
                            }
                        });
                        z = true;
                        linkedHashMap = linkedHashMap;
                        str2 = str2;
                        strM50267 = strM50267;
                        str3 = str3;
                    }
                }
            }
            String str5 = str3;
            Set set2 = setNewSetFromMap;
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            String str6 = str2;
            if (this.f18519) {
                for (InterfaceC2557 interfaceC2558 : list2) {
                    if (interfaceC2558.isDirectory() && !interfaceC2558.mo7986() && (!(interfaceC2558 instanceof C6794) || !interfaceC2558.getName().contains(".recycle") || !C20370.m46024() || !interfaceC2558.getPath().equals(C20370.m46020().mo33986()))) {
                        StringBuilder sbM23357 = C9023.m23356(str5);
                        sbM23357.append(interfaceC2558.getName());
                        sbM23357.append('/');
                        linkedList.addLast(sbM23357.toString());
                    }
                }
            }
            linkedHashMap = linkedHashMap3;
            str2 = str6;
            setNewSetFromMap = set2;
        }
        if (this.f18509) {
            C16737.m39273(new RunnableC23829());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14866(final AbstractC9677 abstractC9677, List list, final AbstractC4653 abstractC4653) {
        this.f18518 = false;
        this.f18520.m29250();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set<C2536> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC13783());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C6189 c6189 = (C6189) it.next();
            abstractC4653.mo12845(c6189.m17197(), true);
            final InterfaceC2557 interfaceC2557M17194 = c6189.m17194();
            if (this.f18518) {
                m14855(setNewSetFromMap);
                return;
            }
            if (m14862(interfaceC2557M17194)) {
                if (this.f18511 == null) {
                    abstractC4653.m12846(c6189);
                } else if (!m14858(interfaceC2557M17194)) {
                    continue;
                } else if (abstractC9677.mo24621()) {
                    linkedHashMap.put(interfaceC2557M17194, c6189);
                } else {
                    while (setNewSetFromMap.size() > 500) {
                        SystemClock.sleep(10L);
                        if (this.f18518) {
                            return;
                        }
                    }
                    final C2536 c2536 = new C2536(c6189.m17193());
                    setNewSetFromMap.add(c2536);
                    c2536.f10043 = (abstractC9677 instanceof AbstractC12233 ? f18506 : f18507).submit(new Runnable() { // from class: l.ۧܽ᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5359.m14857(this.f37767, interfaceC2557M17194, abstractC4653, c6189, abstractC9677, setNewSetFromMap, c2536);
                        }
                    });
                    it = it;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            abstractC9677.mo24617(linkedHashMap.keySet(), new C9718(this, linkedHashMap, abstractC4653));
        }
        for (C2536 c2537 : setNewSetFromMap) {
            if (this.f18518) {
                m14855(setNewSetFromMap);
                return;
            } else if (!c2537.f10043.isDone()) {
                abstractC4653.mo12845(c2537.f10044, false);
                try {
                    c2537.f10043.get();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m14862(InterfaceC2557 interfaceC2557) {
        if (this.f18516) {
            if (interfaceC2557.isDirectory()) {
                return false;
            }
            long size = interfaceC2557.getSize();
            long j = this.f18510;
            if (j != -1 && j > size) {
                return false;
            }
            long j2 = this.f18508;
            if (j2 != -1 && size >= j2) {
                return false;
            }
        }
        if (this.f18514) {
            long time = interfaceC2557.getTime();
            long j3 = this.f18513;
            if (j3 != -1 && j3 > time) {
                return false;
            }
            long j4 = this.f18515;
            if (j4 != -1 && time >= j4) {
                return false;
            }
        }
        return this.f18512.mo20124(interfaceC2557.getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14858(InterfaceC2557 interfaceC2557) {
        if (!interfaceC2557.mo7985() || interfaceC2557.getSize() <= 0) {
            return false;
        }
        String path = interfaceC2557.getPath();
        if (path.startsWith("/sys/devices/")) {
            return false;
        }
        if (path.startsWith("/proc/") && path.contains("/fd/")) {
            return false;
        }
        String strMo7978 = interfaceC2557.mo7978();
        if (strMo7978 != null) {
            return (!strMo7978.startsWith("/") || strMo7978.startsWith("/memfd:") || strMo7978.equals("/dmabuf:") || strMo7978.equals("/[aio] (deleted)") || strMo7978.startsWith("/sys/devices/")) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14855(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2536 c2536 = (C2536) it.next();
            if (!c2536.f10043.isDone()) {
                c2536.f10043.cancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BufferedInputStream m14854(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m14861(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        inputStream.mark(65536);
        int i = inputStream.read(bArr);
        if (i == -1) {
            return false;
        }
        Charset charsetM48953 = C22037.m48953(C22037.m48954(i, bArr));
        inputStream.reset();
        return new C18238(new InputStreamReader(inputStream, charsetM48953)).m42385(this.f18511, new InterfaceC5614() { // from class: l.ܳܽ᩹
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return this.f47918.f18518;
            }
        }, false);
    }
}
