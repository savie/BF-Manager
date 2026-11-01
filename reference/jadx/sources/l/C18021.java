package l;

import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩳۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7BL */
/* JADX INFO: loaded from: classes5.dex */
public class C18021 extends AbstractC0656 {

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57621 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f57623;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public boolean f57626;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f57631;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f57624 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f57627 = new AtomicInteger();

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f57629 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f57622 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f57632 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f57625 = new ArrayList();

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f57630 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f57628 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized void m41971(C5202 c5202) {
        if (this.f57623) {
            return;
        }
        this.f57623 = true;
        C7340 c7340M19608 = C7340.m19608();
        String strM41585 = m41585("remoteTaskId");
        ArrayList arrayListM41975 = m41975();
        ArrayList arrayListM41977 = m41977();
        List list = Collections.EMPTY_LIST;
        c7340M19608.m19615(strM41585, this, c5202, arrayListM41975, arrayListM41977, list, list);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private synchronized void m41976(String str) {
        String strM43078 = C18629.m43078(str);
        this.f57630.add(strM43078);
        this.f57628.add(C18629.m43076(strM43078));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
    }

    @Override // l.AbstractC0656
    /* JADX INFO: renamed from: ۛۙ */
    public final String mo2978() {
        return "";
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܶ */
    public final AbstractActivityC12483 mo21456() {
        return null;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo18332() {
        return false;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5712;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41567("deleteFrom"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        String strM41585 = m41585("remoteTaskId");
        C7340 c7340M19608 = C7340.m19608();
        c7340M19608.m19616(strM41585, this, (C18727) null);
        m41591(m41573("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo41554("...");
        c7340M19608.m19614(strM41585, this);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws InterruptedException {
        C5202 c5202M41583;
        if (m41573("recycle")) {
            String[] strArrM41566 = m41566("ARG_PATHS");
            C2462.m7543(m41974(strArrM41566));
            int i = 0;
            while (i < strArrM41566.length) {
                if (mo2357()) {
                    c5202M41583 = C5202.m14378();
                } else {
                    String strM43078 = C18629.m43078(strArrM41566[i]);
                    AbstractC20745 abstractC20745M15313 = C5553.m15313(strArrM41566[i], new String[0]);
                    String strMo33986 = abstractC20745M15313.mo33986();
                    mo41554(abstractC20745M15313.getName());
                    i++;
                    m41578(i, strArrM41566.length);
                    EnumC11669 enumC11669M29115 = EnumC11669.m29115(abstractC20745M15313.mo33974());
                    if (!C18629.m43077(abstractC20745M15313)) {
                        c5202M41583 = C5202.m14376(C16737.m39264(R.string.MT_Protector, abstractC20745M15313.getName()));
                    } else if (!abstractC20745M15313.mo35234(this)) {
                        c5202M41583 = mo2357() ? C5202.m14378() : C5202.m14376(C16737.m39264(R.string.MT_Protector, abstractC20745M15313.getName()));
                    } else {
                        m41976(strM43078);
                        enumC11669M29115.m29117(strMo33986);
                    }
                }
            }
            c5202M41583 = m41583();
        } else {
            String[] strArrM41567 = m41566("ARG_PATHS");
            this.f57626 = m41573("speedMode");
            final int iM41581 = m41581("minTotal");
            C2462.m7543(m41974(strArrM41567));
            Runnable runnable = new Runnable() { // from class: l.ܶۨ֨
                @Override // java.lang.Runnable
                public final void run() {
                    C18021.m41972(this.f49596, iM41581);
                }
            };
            this.f57631 = true;
            int iMin = Math.min(4, C5464.f18831);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(C4716.f16635.submit(runnable));
            }
            for (String str : strArrM41567) {
                m41973(C5553.m15313(str, new String[0]), "");
                if (mo2357()) {
                    break;
                }
            }
            C21445 c21445 = new C21445();
            for (C21549 c21549 : this.f57625) {
                ((List) C9735.computeIfAbsent(c21445, Integer.valueOf(C6851.m18452(c21549.f69987, '/')), new C12964(1))).add(c21549);
            }
            ArrayList arrayList2 = new ArrayList(c21445.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f57632.isEmpty() || this.f57629.get() != this.f57622.get()) {
                        if (mo2357()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                List list = (List) c21445.getOrDefault(arrayList2.get(size), null);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f57632.put((C21549) it.next());
                    }
                }
            }
            this.f57631 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
            c5202M41583 = m41583();
        }
        m41971(c5202M41583);
        return c5202M41583;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41972(C18021 c18021, int i) {
        AtomicInteger atomicInteger = c18021.f57622;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C21549 c21549M41970 = c18021.m41970();
                if (c21549M41970 != null) {
                    EnumC11669 enumC11669 = c21549M41970.f69988;
                    c18021.mo41554(c21549M41970.f69987);
                    c18021.m41578(c18021.f57627.incrementAndGet(), Math.max(c18021.f57624.get(), i));
                    AbstractC20745 abstractC20745 = c21549M41970.f69986;
                    String strM43078 = C18629.m43078(abstractC20745.mo33986());
                    if (c18021.f57626 && abstractC20745.mo36912()) {
                        boolean zDeleteFile = Features.deleteFile(abstractC20745.mo33986());
                        if (!abstractC20745.mo33975()) {
                            c18021.m41976(strM43078);
                        }
                        if (zDeleteFile) {
                            enumC11669.m29117(abstractC20745.mo33986());
                        }
                    } else {
                        if (!abstractC20745.mo24644() && abstractC20745.mo33975()) {
                            abstractC20745.mo24647();
                        }
                        if (!abstractC20745.mo33975()) {
                            c18021.m41976(strM43078);
                            enumC11669.m29117(abstractC20745.mo33986());
                        }
                    }
                } else {
                    atomicInteger.decrementAndGet();
                    return;
                }
            } catch (Throwable th) {
                atomicInteger.decrementAndGet();
                throw th;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩷ */
    public final void mo21457(String str) {
        super.mo21457(str);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo41554(CharSequence charSequence) {
        super.mo41554(charSequence);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final void mo21455(int i) {
        super.mo21455(i);
        C7340.m19608().m19614(m41585("remoteTaskId"), this);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
        C23186.m51173();
        m41971(c5202);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m41975() {
        LinkedHashSet<String> linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f57628);
        }
        for (String str : linkedHashSet) {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            if (abstractC20745M15313.mo33975() && abstractC20745M15313.mo33974()) {
                linkedHashSet2.add(str);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m41977() {
        LinkedHashSet linkedHashSet;
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f57630);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4579[] m41974(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (String str : strArr) {
            linkedHashSet.add(C18629.m43076(C18629.m43078(str)));
        }
        C4579[] c4579Arr = new C4579[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c4579Arr[i] = C4579.m12723((String) it.next(), EnumC11636.MODIFY_DIRECTORY);
            i++;
        }
        return c4579Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41973(AbstractC20745 abstractC20745, String str) throws InterruptedException {
        String string;
        if (mo2357()) {
            return;
        }
        if (str.isEmpty()) {
            string = abstractC20745.getName();
        } else {
            StringBuilder sbM8976 = C3012.m8976(str, "/");
            sbM8976.append(abstractC20745.getName());
            string = sbM8976.toString();
        }
        boolean zMo33974 = abstractC20745.mo33974();
        LinkedBlockingQueue linkedBlockingQueue = this.f57632;
        AtomicInteger atomicInteger = this.f57624;
        if (!zMo33974 || abstractC20745.m46723()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C21549(abstractC20745, string, EnumC11669.EXACT));
            return;
        }
        if (abstractC20745.mo33985()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C21549(abstractC20745, string, EnumC11669.TREE));
            return;
        }
        if (this.f57626 && abstractC20745.mo36912()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C21549(abstractC20745, string, EnumC11669.TREE));
            return;
        }
        Iterator it = abstractC20745.mo33983(true).iterator();
        while (it.hasNext()) {
            m41973((AbstractC20745) it.next(), string);
        }
        if (mo2357()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f57625.add(new C21549(abstractC20745, string, EnumC11669.NONE));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final C5202 mo6160(Exception exc) {
        C5202 c5202M14375 = C5202.m14375(exc);
        m41971(c5202M14375);
        return c5202M14375;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    private C21549 m41970() {
        this.f57629.incrementAndGet();
        while (!mo2357()) {
            try {
                try {
                    C21549 c21549 = (C21549) this.f57632.poll(200L, TimeUnit.MILLISECONDS);
                    if (c21549 == null) {
                        if (!this.f57631) {
                            break;
                        }
                    } else {
                        this.f57629.decrementAndGet();
                        return c21549;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f57629.decrementAndGet();
                throw th;
            }
        }
        this.f57629.decrementAndGet();
        return null;
    }
}
