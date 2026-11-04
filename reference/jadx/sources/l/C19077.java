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

/* JADX INFO: renamed from: l.ᩳ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q28R */
/* JADX INFO: loaded from: classes5.dex */
public class C19077 extends AbstractC16610 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61782 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f61787;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f61785 = new AtomicInteger();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f61786 = new AtomicInteger();

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f61784 = new AtomicInteger();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f61783 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public LinkedBlockingQueue f61790 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f61788 = new ArrayList();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f61789 = false;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public C12187 mo2531() throws InterruptedException {
        String[] strArrM43831 = m43831("ARG_PATHS");
        boolean zM43847 = m43847("recycle");
        this.f61789 = m43847("speedMode");
        C6265.m17914((C3281[]) C13847.stream(strArrM43831).map(new C6361(1)).distinct().map(new C23173(1)).toArray(new C21315()));
        if (zM43847) {
            int length = strArrM43831.length;
            int i = 0;
            while (i < length) {
                if (mo924()) {
                    return C12187.m30469();
                }
                AbstractC22044 abstractC22044M35193 = C14584.m35193(strArrM43831[i], new String[0]);
                String strMo4294 = abstractC22044M35193.mo4294();
                mo29447(abstractC22044M35193.getName());
                i++;
                m43862(i, length);
                EnumC22346 enumC22346M50415 = EnumC22346.m50415(abstractC22044M35193.mo4281());
                if (!abstractC22044M35193.mo4292() || !abstractC22044M35193.mo4300(this)) {
                    if (!mo924()) {
                        if (new C7890(abstractC22044M35193).m49500(new C10145())) {
                            if (abstractC22044M35193.mo4296()) {
                                enumC22346M50415.m50417(strMo4294);
                            }
                        } else {
                            cancel();
                            return C12187.m30469();
                        }
                    } else {
                        return C12187.m30469();
                    }
                } else {
                    enumC22346M50415.m50417(strMo4294);
                }
            }
        } else {
            final int iM43854 = m43854("minTotal");
            Runnable runnable = new Runnable() { // from class: l.ܿ۫۫
                @Override // java.lang.Runnable
                public final void run() {
                    C19077.m44188(this.f59791, iM43854);
                }
            };
            this.f61787 = true;
            int iMin = Math.min(4, C11138.f35105);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(C5261.f18538.submit(runnable));
            }
            for (String str : strArrM43831) {
                m44189(C14584.m35193(str, new String[0]), "");
                if (mo924()) {
                    break;
                }
            }
            C14307 c14307 = new C14307();
            for (C14601 c14601 : this.f61788) {
                ((List) C11392.computeIfAbsent(c14307, Integer.valueOf(C24276.m54279(c14601.f46003, '/')), new C15431(3))).add(c14601);
            }
            ArrayList arrayList2 = new ArrayList(c14307.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f61790.isEmpty() || this.f61784.get() != this.f61783.get()) {
                        if (mo924()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                Iterator it = ((List) c14307.get(arrayList2.get(size))).iterator();
                while (it.hasNext()) {
                    this.f61790.put((C14601) it.next());
                }
            }
            this.f61787 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
        }
        return m43857();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46050;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43850("deleteFrom"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(m43847("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo29447("...");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44188(C19077 c19077, int i) {
        AtomicInteger atomicInteger = c19077.f61783;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C14601 c14601M44190 = c19077.m44190();
                if (c14601M44190 != null) {
                    EnumC22346 enumC22346 = c14601M44190.f46004;
                    c19077.mo29447(c14601M44190.f46003);
                    c19077.m43862(c19077.f61786.incrementAndGet(), Math.max(c19077.f61785.get(), i));
                    AbstractC22044 abstractC22044 = c14601M44190.f46002;
                    if (c19077.f61789 && abstractC22044.mo4295()) {
                        if (Features.deleteFile(abstractC22044.mo4294())) {
                            enumC22346.m50417(abstractC22044.mo4294());
                        }
                    } else {
                        boolean zMo4287 = abstractC22044.mo4287();
                        if (!zMo4287) {
                            zMo4287 = abstractC22044.mo2934() ? abstractC22044.mo4296() : true;
                        }
                        if (zMo4287) {
                            enumC22346.m50417(abstractC22044.mo4294());
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
    private void m44189(AbstractC22044 abstractC22044, String str) throws InterruptedException {
        String string;
        if (mo924()) {
            return;
        }
        if (str.isEmpty()) {
            string = abstractC22044.getName();
        } else {
            StringBuilder sbM10405 = C3188.m10405(str, "/");
            sbM10405.append(abstractC22044.getName());
            string = sbM10405.toString();
        }
        boolean zMo4281 = abstractC22044.mo4281();
        LinkedBlockingQueue linkedBlockingQueue = this.f61790;
        AtomicInteger atomicInteger = this.f61785;
        if (!zMo4281 || abstractC22044.m49860()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C14601(abstractC22044, string, EnumC22346.EXACT));
            return;
        }
        if (abstractC22044.mo4293()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C14601(abstractC22044, string, EnumC22346.TREE));
            return;
        }
        if (this.f61789 && abstractC22044.mo4295()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C14601(abstractC22044, string, EnumC22346.TREE));
            return;
        }
        Iterator it = abstractC22044.mo4299(true).iterator();
        while (it.hasNext()) {
            m44189((AbstractC22044) it.next(), string);
        }
        if (mo924()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f61788.add(new C14601(abstractC22044, string, EnumC22346.NONE));
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    private C14601 m44190() {
        this.f61784.incrementAndGet();
        while (!mo924()) {
            try {
                try {
                    C14601 c14601 = (C14601) this.f61790.poll(200L, TimeUnit.MILLISECONDS);
                    if (c14601 == null) {
                        if (!this.f61787) {
                            break;
                        }
                    } else {
                        this.f61784.decrementAndGet();
                        return c14601;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f61784.decrementAndGet();
                throw th;
            }
        }
        this.f61784.decrementAndGet();
        return null;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
        C22961.m51805();
    }
}
