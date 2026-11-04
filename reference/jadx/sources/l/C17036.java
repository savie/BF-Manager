package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ܺᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17036 extends AbstractC7629 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C25242 f55661;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f55662;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f55663;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AtomicLong f55664;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8175 f55665;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Map f55666;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f55667;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public List f55668;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IInArchive f55669;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final synchronized IInArchive m40144() {
        IInArchive iInArchive = this.f55669;
        if (iInArchive != null) {
            this.f55669 = null;
            return iInArchive;
        }
        return m40139();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20842() {
        return "archive";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m40145(IInArchive iInArchive) {
        if (iInArchive == null) {
            return;
        }
        IInArchive iInArchive2 = this.f55669;
        if (iInArchive2 == null) {
            this.f55669 = iInArchive;
        } else if (iInArchive2 != iInArchive) {
            C20244.m46520(iInArchive);
        }
    }

    public C17036(String str, Collection collection) {
        AtomicLong atomicLong = new AtomicLong();
        this.f55664 = atomicLong;
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        this.f55667 = abstractC22044M35193;
        this.f55661 = new C25242(abstractC22044M35193, collection, atomicLong);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17036 m40128(C20348 c20348) {
        C17036 c17036M40131 = m40131(c20348);
        if (c20348.available() == 0) {
            return c17036M40131;
        }
        throw new IllegalArgumentException("Trailing archive source files metadata");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C17036 m40131(C20348 c20348) {
        C17036 c17036 = new C17036(c20348.m46758(), Collections.EMPTY_LIST);
        String strM46758 = c20348.m46758();
        if (!strM46758.isEmpty()) {
            C21054.m48119(c17036.f55667.mo4294(), strM46758);
        }
        if (c20348.available() < 4 || c20348.m46759() != 1397117505) {
            return c17036;
        }
        if (c20348.available() < 8) {
            throw new IllegalArgumentException("Truncated archive source files metadata");
        }
        c20348.readInt();
        int i = c20348.readInt();
        if (i <= 0 || i > 10000) {
            throw new IllegalArgumentException(C13645.m33382(i, "Invalid archive source file count: "));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(C14584.m35193(c20348.m46758(), new String[0]));
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Truncated archive source files metadata", e);
            }
        }
        c17036.f55661 = new C25242(c17036.f55667, arrayList, c17036.f55664);
        return c17036;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40135(AbstractC22044 abstractC22044) {
        this.f55661.m56379(abstractC22044);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        List list = Collections.EMPTY_LIST;
        AtomicLong atomicLong = this.f55664;
        AbstractC22044 abstractC22044 = this.f55667;
        C25242 c25242 = new C25242(abstractC22044, list, atomicLong);
        IInArchive iInArchiveM16647 = C5661.m16647(abstractC22044, new C5104(c25242));
        try {
            m40130(iInArchiveM16647, c25242);
        } catch (Throwable th) {
            C20244.m46520(iInArchiveM16647);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40137(C15722 c15722) {
        List list = Collections.EMPTY_LIST;
        AbstractC22044 abstractC22044 = this.f55667;
        C25242 c25242 = new C25242(abstractC22044, list, this.f55664);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C5661.m16648(null, abstractC22044, new C22258(this, c25242, atomicBoolean, c15722));
        return !atomicBoolean.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40136(IInArchive iInArchive) {
        m40130(iInArchive, (C25242) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m40130(IInArchive iInArchive, C25242 c25242) {
        int numberOfItems = iInArchive.getNumberOfItems();
        ArrayList arrayList = new ArrayList(numberOfItems);
        HashMap map = new HashMap(numberOfItems);
        boolean z = false;
        for (int i = 0; i < numberOfItems; i++) {
            C1997 c1997M6830 = C1997.m6830(iInArchive, i);
            arrayList.add(c1997M6830);
            map.put(c1997M6830.m6840(), c1997M6830);
        }
        List listUnmodifiableList = C4681.unmodifiableList(arrayList);
        Map mapUnmodifiableMap = C4681.unmodifiableMap(map);
        C8175 c8175 = new C8175(arrayList);
        if (numberOfItems > 1) {
            Object archiveProperty = iInArchive.getArchiveProperty(PropID.SOLID);
            if ((archiveProperty instanceof Boolean) && ((Boolean) archiveProperty).booleanValue()) {
                z = true;
            }
        }
        long jMo4286 = this.f55667.mo4286();
        IInArchive iInArchive2 = this.f55669;
        this.f55668 = listUnmodifiableList;
        this.f55666 = mapUnmodifiableMap;
        this.f55665 = c8175;
        this.f55669 = iInArchive;
        this.f55663 = z;
        this.f55662 = jMo4286;
        if (c25242 != null) {
            this.f55661 = c25242;
        }
        if (iInArchive2 != null) {
            C20244.m46520(iInArchive2);
        }
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo20829(final AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386) throws IOException {
        final C1997 c1997M26722 = ((C10411) interfaceC2386).m26722();
        int iMin = (int) Math.min(1048576L, interfaceC2386.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        C0387 c0387 = new C0387(iMin);
        final InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c0387.m2193());
        final C11069 c11069 = new C11069();
        C5261.f18540.submit(new Runnable() { // from class: l.۬᩸۫
            @Override // java.lang.Runnable
            public final void run() {
                C17036 c17036 = this.f44717;
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                C1997 c1997 = c1997M26722;
                C11069 c110610 = c11069;
                InterfaceC11573 interfaceC11573 = interfaceC11573M35106;
                try {
                    try {
                        int iM6835 = c1997.m6835();
                        C22069.m49902(abstractActivityC17205, new int[]{iM6835}, new C20020(c17036, c110610, interfaceC11573));
                        C20244.m46520(interfaceC11573);
                        c110610.f34914 = true;
                    } catch (Throwable th) {
                        C20244.m46520(interfaceC11573);
                        c110610.f34914 = true;
                        throw th;
                    }
                } catch (IOException e) {
                    c110610.f34915 = e;
                    C20244.m46520(interfaceC11573);
                    c110610.f34914 = true;
                } catch (Throwable th2) {
                    c110610.f34915 = new IOException(th2);
                    C20244.m46520(interfaceC11573);
                    c110610.f34914 = true;
                }
            }
        });
        while (!c11069.f34916) {
            IOException iOException = c11069.f34915;
            if (iOException != null) {
                throw iOException;
            }
            if (c11069.f34913) {
                return null;
            }
            if (c11069.f34914) {
                break;
            }
        }
        IOException iOException2 = c11069.f34915;
        if (iOException2 != null) {
            throw iOException2;
        }
        if (c11069.f34913) {
            return null;
        }
        return C14556.m35108(c0387.m2194()).mo4183();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20834(Set set, InterfaceC0171 interfaceC0171) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C22311 c22311 = new C22311(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            C1997 c1997M26722 = ((C10411) interfaceC2386).m26722();
            if (c1997M26722.m6837()) {
                try {
                    interfaceC0171.mo1452(interfaceC2386, null);
                } catch (Throwable th) {
                    if (!interfaceC0171.mo1453(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                }
            } else {
                c22311.mo13466(c1997M26722.m6835(), interfaceC2386);
            }
        }
        new RunnableC5850(this, c22311, executorServiceNewSingleThreadExecutor, interfaceC0171).run();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20836(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386, InterfaceC6116 interfaceC6116) throws Throwable {
        m40134(abstractActivityC17204, interfaceC2386, interfaceC6116, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40134(AbstractActivityC17204 abstractActivityC17204, InterfaceC2386 interfaceC2386, InterfaceC6116 interfaceC6116, boolean z) throws Throwable {
        C22069.m49902(abstractActivityC17204, new int[]{((C10411) interfaceC2386).m26722().m6835()}, new C2121(this, z, interfaceC6116));
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        if (this.f55666 == null) {
            mo20837(false);
        }
        C1997 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C10411(entry);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20833(MessageDigest messageDigest) {
        messageDigest.update("archive".getBytes());
        C15022.m36176(messageDigest, this.f55667.mo4294());
        messageDigest.update(String.valueOf(this.f55662).getBytes());
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        if (this.f55666 == null) {
            mo20837(false);
        }
        if (C17719.f58226) {
            str = C14483.m34972(str, "/7z/");
        }
        List listM18371 = this.f55665.m18371(str.substring(1));
        ArrayList arrayList = new ArrayList(listM18371.size() + 1);
        Iterator it = listM18371.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10411((C1997) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final IInArchive m40139() {
        C25242 c25242 = this.f55661;
        C17359.requireNonNull(c25242);
        return C5661.m16647(this.f55667, new C5104(c25242));
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final List m40142() {
        return this.f55668;
    }

    public final C1997 getEntry(String str) {
        Map map = this.f55666;
        if (map == null) {
            return null;
        }
        C1997 c1997 = (C1997) map.get(str);
        return (c1997 == null && str.endsWith("/")) ? (C1997) this.f55665.m18364(str) : c1997;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m40138() {
        return this.f55667.mo4294();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m40141() {
        return this.f55667;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m40146() {
        return C25242.m56382(this.f55661);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m40132() {
        return C25242.m56381(this.f55661);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20835(C6178 c6178) {
        List listM56378 = C25242.m56378(this.f55661);
        c6178.m17800(this.f55667.mo4294());
        c6178.m17800(C21054.m48109(this.f55667.mo4294()));
        c6178.writeInt(1397117505);
        c6178.writeInt(listM56378.size());
        Iterator it = listM56378.iterator();
        while (it.hasNext()) {
            c6178.m17800(((C11815) it.next()).m29659().mo4294());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m40140() {
        return C25242.m56378(this.f55661);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo20841() {
        if (this.f55666 == null) {
            try {
                mo20837(false);
            } catch (IOException unused) {
            }
        }
        return this.f55663;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m40133() {
        return this.f55662 != this.f55667.mo4286();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m40143() {
        return this.f55667.mo2934();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IInArchive iInArchive = this.f55669;
        if (iInArchive != null) {
            C20244.m46520(iInArchive);
            this.f55669 = null;
        }
    }
}
