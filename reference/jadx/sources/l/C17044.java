package l;

import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes5.dex */
public class C17044 extends AbstractC23941 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54427 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f54431;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f54429 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f54432 = new AtomicInteger();

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f54430 = new AtomicInteger();

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f54428 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public LinkedBlockingQueue f54433 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f54435 = new ArrayList();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54434 = false;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public C5202 mo3077() throws InterruptedException {
        String[] strArrM41566 = m41566("ARG_PATHS");
        boolean zM41573 = m41573("recycle");
        this.f54434 = m41573("speedMode");
        int i = 2;
        C2462.m7543((C4579[]) C20318.stream(strArrM41566).map(new C14554(i)).distinct().map(new C13315(i)).toArray(new C0110()));
        if (zM41573) {
            int length = strArrM41566.length;
            int i2 = 0;
            while (i2 < length) {
                if (mo2357()) {
                    return C5202.m14378();
                }
                AbstractC20745 abstractC20745M15313 = C5553.m15313(strArrM41566[i2], new String[0]);
                String strMo33986 = abstractC20745M15313.mo33986();
                mo41554(abstractC20745M15313.getName());
                i2++;
                m41578(i2, length);
                EnumC11669 enumC11669M29115 = EnumC11669.m29115(abstractC20745M15313.mo33974());
                if (!abstractC20745M15313.mo35233() || !abstractC20745M15313.mo35234(this)) {
                    if (!mo2357()) {
                        if (new C12106(abstractC20745M15313).m20356(new C15475())) {
                            if (abstractC20745M15313.mo24647()) {
                                enumC11669M29115.m29117(strMo33986);
                            }
                        } else {
                            cancel();
                            return C5202.m14378();
                        }
                    } else {
                        return C5202.m14378();
                    }
                } else {
                    enumC11669M29115.m29117(strMo33986);
                }
            }
        } else {
            final int iM41581 = m41581("minTotal");
            Runnable runnable = new Runnable() { // from class: l.ܽ֫᩹
                @Override // java.lang.Runnable
                public final void run() {
                    C17044.m39825(this.f52624, iM41581);
                }
            };
            this.f54431 = true;
            int iMin = Math.min(4, C5464.f18831);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                arrayList.add(C4716.f16635.submit(runnable));
            }
            for (String str : strArrM41566) {
                m39826(C5553.m15313(str, new String[0]), "");
                if (mo2357()) {
                    break;
                }
            }
            C21445 c21445 = new C21445();
            for (C19867 c19867 : this.f54435) {
                ((List) C9735.computeIfAbsent(c21445, Integer.valueOf(C6851.m18452(c19867.f63709, '/')), new C10968(3))).add(c19867);
            }
            ArrayList arrayList2 = new ArrayList(c21445.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f54433.isEmpty() || this.f54430.get() != this.f54428.get()) {
                        if (mo2357()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                Iterator it = ((List) c21445.getOrDefault(arrayList2.get(size), null)).iterator();
                while (it.hasNext()) {
                    this.f54433.put((C19867) it.next());
                }
            }
            this.f54431 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
        }
        return m41583();
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
        m41591(m41573("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo41554("...");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39825(C17044 c17044, int i) {
        AtomicInteger atomicInteger = c17044.f54428;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C19867 c19867M39827 = c17044.m39827();
                if (c19867M39827 != null) {
                    EnumC11669 enumC11669 = c19867M39827.f63710;
                    c17044.mo41554(c19867M39827.f63709);
                    c17044.m41578(c17044.f54432.incrementAndGet(), Math.max(c17044.f54429.get(), i));
                    AbstractC20745 abstractC20745 = c19867M39827.f63708;
                    if (c17044.f54434 && abstractC20745.mo36912()) {
                        if (Features.deleteFile(abstractC20745.mo33986())) {
                            enumC11669.m29117(abstractC20745.mo33986());
                        }
                    } else {
                        boolean zMo24644 = abstractC20745.mo24644();
                        if (!zMo24644) {
                            zMo24644 = abstractC20745.mo33975() ? abstractC20745.mo24647() : true;
                        }
                        if (zMo24644) {
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39826(AbstractC20745 abstractC20745, String str) throws InterruptedException {
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
        LinkedBlockingQueue linkedBlockingQueue = this.f54433;
        AtomicInteger atomicInteger = this.f54429;
        if (!zMo33974 || abstractC20745.m46723()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C19867(abstractC20745, string, EnumC11669.EXACT));
            return;
        }
        if (abstractC20745.mo33985()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C19867(abstractC20745, string, EnumC11669.TREE));
            return;
        }
        if (this.f54434 && abstractC20745.mo36912()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C19867(abstractC20745, string, EnumC11669.TREE));
            return;
        }
        Iterator it = abstractC20745.mo33983(true).iterator();
        while (it.hasNext()) {
            m39826((AbstractC20745) it.next(), string);
        }
        if (mo2357()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f54435.add(new C19867(abstractC20745, string, EnumC11669.NONE));
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    private C19867 m39827() {
        this.f54430.incrementAndGet();
        while (!mo2357()) {
            try {
                try {
                    C19867 c19867 = (C19867) this.f54433.poll(200L, TimeUnit.MILLISECONDS);
                    if (c19867 == null) {
                        if (!this.f54431) {
                            break;
                        }
                    } else {
                        this.f54430.decrementAndGet();
                        return c19867;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f54430.decrementAndGet();
                throw th;
            }
        }
        this.f54430.decrementAndGet();
        return null;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
        C23186.m51173();
    }
}
