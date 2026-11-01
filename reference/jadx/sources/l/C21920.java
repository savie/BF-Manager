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

/* JADX INFO: renamed from: l.᩸᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21920 extends AbstractC9677 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f71111;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Map f71112;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f71113;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f71114;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f71115;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C15571 f71116;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f71117;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IInArchive f71118;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17313 f71119;

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "archive";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48740(IInArchive iInArchive) {
        if (iInArchive == null) {
            return;
        }
        IInArchive iInArchive2 = this.f71118;
        if (iInArchive2 == null) {
            this.f71118 = iInArchive;
        } else if (iInArchive2 != iInArchive) {
            C19431.m44468(iInArchive);
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final synchronized IInArchive m48745() {
        IInArchive iInArchive = this.f71118;
        if (iInArchive != null) {
            this.f71118 = null;
            return iInArchive;
        }
        return m48741();
    }

    public C21920(String str, Collection collection) {
        AtomicLong atomicLong = new AtomicLong();
        this.f71114 = atomicLong;
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        this.f71111 = abstractC20745M15313;
        this.f71116 = new C15571(abstractC20745M15313, collection, atomicLong);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21920 m48729(C17367 c17367) {
        C21920 c21920M48732 = m48732(c17367);
        if (c17367.available() == 0) {
            return c21920M48732;
        }
        throw new IllegalArgumentException("Trailing archive source files metadata");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21920 m48732(C17367 c17367) {
        C21920 c21920 = new C21920(c17367.m40458(), Collections.EMPTY_LIST);
        String strM40458 = c17367.m40458();
        if (!strM40458.isEmpty()) {
            C11088.m27975(c21920.f71111.mo33986(), strM40458);
        }
        if (c17367.available() < 4 || c17367.m40449() != 1397117505) {
            return c21920;
        }
        if (c17367.available() < 8) {
            throw new IllegalArgumentException("Truncated archive source files metadata");
        }
        c17367.readInt();
        int i = c17367.readInt();
        if (i <= 0 || i > 10000) {
            throw new IllegalArgumentException(C8479.m22141(i, "Invalid archive source file count: "));
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(C5553.m15313(c17367.m40458(), new String[0]));
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Truncated archive source files metadata", e);
            }
        }
        c21920.f71116 = new C15571(c21920.f71111, arrayList, c21920.f71114);
        return c21920;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48735(AbstractC20745 abstractC20745) {
        this.f71116.m37208(abstractC20745);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        List list = Collections.EMPTY_LIST;
        AtomicLong atomicLong = this.f71114;
        AbstractC20745 abstractC20745 = this.f71111;
        C15571 c15571 = new C15571(abstractC20745, list, atomicLong);
        IInArchive iInArchiveM17602 = C6423.m17602(abstractC20745, new C14160(c15571));
        try {
            m48731(iInArchiveM17602, c15571);
        } catch (Throwable th) {
            C19431.m44468(iInArchiveM17602);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48737(C7353 c7353) {
        List list = Collections.EMPTY_LIST;
        AbstractC20745 abstractC20745 = this.f71111;
        C15571 c15571 = new C15571(abstractC20745, list, this.f71114);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C6423.m17603(null, abstractC20745, new C12043(this, c15571, atomicBoolean, c7353));
        return !atomicBoolean.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48736(IInArchive iInArchive) {
        m48731(iInArchive, (C15571) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48731(IInArchive iInArchive, C15571 c15571) {
        int numberOfItems = iInArchive.getNumberOfItems();
        ArrayList arrayList = new ArrayList(numberOfItems);
        HashMap map = new HashMap(numberOfItems);
        boolean z = false;
        for (int i = 0; i < numberOfItems; i++) {
            C18334 c18334M42567 = C18334.m42567(iInArchive, i);
            arrayList.add(c18334M42567);
            map.put(c18334M42567.m42573(), c18334M42567);
        }
        List listUnmodifiableList = C0561.unmodifiableList(arrayList);
        Map mapUnmodifiableMap = C0561.unmodifiableMap(map);
        C17313 c17313 = new C17313(arrayList);
        if (numberOfItems > 1) {
            Object archiveProperty = iInArchive.getArchiveProperty(PropID.SOLID);
            if ((archiveProperty instanceof Boolean) && ((Boolean) archiveProperty).booleanValue()) {
                z = true;
            }
        }
        long jMo33991 = this.f71111.mo33991();
        IInArchive iInArchive2 = this.f71118;
        this.f71117 = listUnmodifiableList;
        this.f71112 = mapUnmodifiableMap;
        this.f71119 = c17313;
        this.f71118 = iInArchive;
        this.f71115 = z;
        this.f71113 = jMo33991;
        if (c15571 != null) {
            this.f71116 = c15571;
        }
        if (iInArchive2 != null) {
            C19431.m44468(iInArchive2);
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(final AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) throws IOException {
        final C18334 c18334M27721 = ((C10964) interfaceC2557).m27721();
        int iMin = (int) Math.min(1048576L, interfaceC2557.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        C6479 c6479 = new C6479(iMin);
        final InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c6479.m17673());
        final C2869 c2869 = new C2869();
        C4716.f16636.submit(new Runnable() { // from class: l.ۙ᩻᩹
            @Override // java.lang.Runnable
            public final void run() {
                C21920 c21920 = this.f17365;
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                C18334 c18334 = c18334M27721;
                C2869 c28610 = c2869;
                InterfaceC10983 interfaceC10983 = interfaceC10983M3436;
                try {
                    try {
                        int iM42575 = c18334.m42575();
                        C2189.m6798(abstractActivityC12484, new int[]{iM42575}, new C22626(c21920, c28610, interfaceC10983));
                        C19431.m44468(interfaceC10983);
                        c28610.f10834 = true;
                    } catch (Throwable th) {
                        C19431.m44468(interfaceC10983);
                        c28610.f10834 = true;
                        throw th;
                    }
                } catch (IOException e) {
                    c28610.f10835 = e;
                    C19431.m44468(interfaceC10983);
                    c28610.f10834 = true;
                } catch (Throwable th2) {
                    c28610.f10835 = new IOException(th2);
                    C19431.m44468(interfaceC10983);
                    c28610.f10834 = true;
                }
            }
        });
        while (!c2869.f10832) {
            IOException iOException = c2869.f10835;
            if (iOException != null) {
                throw iOException;
            }
            if (c2869.f10833) {
                return null;
            }
            if (c2869.f10834) {
                break;
            }
        }
        IOException iOException2 = c2869.f10835;
        if (iOException2 != null) {
            throw iOException2;
        }
        if (c2869.f10833) {
            return null;
        }
        return C0834.m3437(c6479.m17674()).mo16433();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo24617(Set set, InterfaceC1914 interfaceC1914) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C16667 c16667 = new C16667(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            C18334 c18334M27721 = ((C10964) interfaceC2557).m27721();
            if (c18334M27721.m42574()) {
                try {
                    interfaceC1914.mo6226(interfaceC2557, null);
                } catch (Throwable th) {
                    if (!interfaceC1914.mo6227(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                }
            } else {
                c16667.mo8944(c18334M27721.m42575(), interfaceC2557);
            }
        }
        new RunnableC4280(this, c16667, executorServiceNewSingleThreadExecutor, interfaceC1914).run();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo24618(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557, InterfaceC12086 interfaceC12086) {
        m48734(abstractActivityC12483, interfaceC2557, interfaceC12086, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48734(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557, InterfaceC12086 interfaceC12086, boolean z) {
        C2189.m6798(abstractActivityC12483, new int[]{((C10964) interfaceC2557).m27721().m42575()}, new C7103(this, z, interfaceC12086));
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        if (this.f71112 == null) {
            mo10267(false);
        }
        C18334 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C10964(entry);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("archive".getBytes());
        C22253.m49418(messageDigest, this.f71111.mo33986());
        messageDigest.update(String.valueOf(this.f71113).getBytes());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        if (this.f71112 == null) {
            mo10267(false);
        }
        if (C21506.f69876) {
            str = C15489.m37076(str, "/7z/");
        }
        List listM25252 = this.f71119.m25252(str.substring(1));
        ArrayList arrayList = new ArrayList(listM25252.size() + 1);
        Iterator it = listM25252.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10964((C18334) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final IInArchive m48741() {
        C15571 c15571 = this.f71116;
        C13638.requireNonNull(c15571);
        return C6423.m17602(this.f71111, new C14160(c15571));
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final List m48733() {
        return this.f71117;
    }

    public final C18334 getEntry(String str) {
        Map map = this.f71112;
        if (map == null) {
            return null;
        }
        C18334 c18334 = (C18334) map.get(str);
        return (c18334 == null && str.endsWith("/")) ? (C18334) this.f71119.m25250(str) : c18334;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m48739() {
        return this.f71111.mo33986();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m48747() {
        return this.f71111;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m48743() {
        return C15571.m37210(this.f71116);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long m48738() {
        return C15571.m37209(this.f71116);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
        List listM37206 = C15571.m37206(this.f71116);
        c11018.m27786(this.f71111.mo33986());
        c11018.m27786(C11088.m27967(this.f71111.mo33986()));
        c11018.writeInt(1397117505);
        c11018.writeInt(listM37206.size());
        Iterator it = listM37206.iterator();
        while (it.hasNext()) {
            c11018.m27786(((C23332) it.next()).m51411().mo33986());
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m48742() {
        return C15571.m37206(this.f71116);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo24621() {
        if (this.f71112 == null) {
            try {
                mo10267(false);
            } catch (IOException unused) {
            }
        }
        return this.f71115;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m48746() {
        return this.f71113 != this.f71111.mo33991();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m48744() {
        return this.f71111.mo33975();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IInArchive iInArchive = this.f71118;
        if (iInArchive != null) {
            C19431.m44468(iInArchive);
            this.f71118 = null;
        }
    }
}
