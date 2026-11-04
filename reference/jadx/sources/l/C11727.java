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

/* JADX INFO: renamed from: l.ۧܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7BL */
/* JADX INFO: loaded from: classes4.dex */
public class C11727 extends AbstractC15118 {

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37935 = 0;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f37939;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37944;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37945;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37938 = new AtomicInteger();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37936 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37946 = new AtomicInteger();

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37941 = new AtomicInteger();

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f37942 = new LinkedBlockingQueue(OpenAuthTask.Duplex);

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37943 = new ArrayList();

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f37937 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f37940 = new LinkedHashSet();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private synchronized void m29444(String str) {
        String strM22373 = C8284.m22373(str);
        this.f37937.add(strM22373);
        this.f37940.add(C8284.m22371(strM22373));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private synchronized void m29446(C12187 c12187) {
        if (this.f37944) {
            return;
        }
        this.f37944 = true;
        C21949 c21949M49661 = C21949.m49661();
        String strM43865 = m43865("remoteTaskId");
        ArrayList arrayListM29439 = m29439();
        ArrayList arrayListM29443 = m29443();
        List list = Collections.EMPTY_LIST;
        c21949M49661.m49668(strM43865, this, c12187, arrayListM29439, arrayListM29443, list, list);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
    }

    @Override // l.AbstractC15118
    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final String mo29448() {
        return "";
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܺ */
    public final AbstractActivityC17204 mo16840() {
        return null;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo29449() {
        return false;
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
        String strM43865 = m43865("remoteTaskId");
        C21949 c21949M49661 = C21949.m49661();
        c21949M49661.m49669(strM43865, this, (C25154) null);
        m43868(m43847("recycle") ? R.string.MT_Protector : R.string.MT_Protector);
        mo29447("...");
        c21949M49661.m49667(strM43865, this);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws InterruptedException {
        C12187 c12187M43857;
        int i = 1;
        if (m43847("recycle")) {
            String[] strArrM43831 = m43831("ARG_PATHS");
            C6265.m17914(m29445(strArrM43831));
            int i2 = 0;
            while (i2 < strArrM43831.length) {
                if (mo924()) {
                    c12187M43857 = C12187.m30469();
                } else {
                    String strM22373 = C8284.m22373(strArrM43831[i2]);
                    AbstractC22044 abstractC22044M35193 = C14584.m35193(strArrM43831[i2], new String[0]);
                    String strMo4294 = abstractC22044M35193.mo4294();
                    mo29447(abstractC22044M35193.getName());
                    i2++;
                    m43862(i2, strArrM43831.length);
                    EnumC22346 enumC22346M50415 = EnumC22346.m50415(abstractC22044M35193.mo4281());
                    if (!C8284.m22372(abstractC22044M35193)) {
                        c12187M43857 = C12187.m30466(C21576.m49059(R.string.MT_Protector, abstractC22044M35193.getName()));
                    } else if (!abstractC22044M35193.mo4300(this)) {
                        c12187M43857 = mo924() ? C12187.m30469() : C12187.m30466(C21576.m49059(R.string.MT_Protector, abstractC22044M35193.getName()));
                    } else {
                        m29444(strM22373);
                        enumC22346M50415.m50417(strMo4294);
                    }
                }
            }
            c12187M43857 = m43857();
        } else {
            String[] strArrM43832 = m43831("ARG_PATHS");
            this.f37939 = m43847("speedMode");
            int iM43854 = m43854("minTotal");
            C6265.m17914(m29445(strArrM43832));
            RunnableC12625 runnableC12625 = new RunnableC12625(iM43854, i, this);
            this.f37945 = true;
            int iMin = Math.min(4, C11138.f35105);
            ArrayList arrayList = new ArrayList(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                arrayList.add(C5261.f18538.submit(runnableC12625));
            }
            for (String str : strArrM43832) {
                m29441(C14584.m35193(str, new String[0]), "");
                if (mo924()) {
                    break;
                }
            }
            C14307 c14307 = new C14307();
            for (C2033 c2033 : this.f37943) {
                ((List) C11392.computeIfAbsent(c14307, Integer.valueOf(C24276.m54279(c2033.f6761, '/')), new C7620(3))).add(c2033);
            }
            ArrayList arrayList2 = new ArrayList(c14307.keySet());
            Collections.sort(arrayList2);
            loop4: for (int size = arrayList2.size() - 1; size >= 0; size--) {
                while (true) {
                    if (!this.f37942.isEmpty() || this.f37946.get() != this.f37941.get()) {
                        if (mo924()) {
                            break loop4;
                        }
                        Thread.sleep(10L);
                    }
                }
                List list = (List) c14307.get(arrayList2.get(size));
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f37942.put((C2033) it.next());
                    }
                }
            }
            this.f37945 = false;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ((Future) it2.next()).get();
                } catch (Exception unused) {
                }
            }
            c12187M43857 = m43857();
        }
        m29446(c12187M43857);
        return c12187M43857;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29440(C11727 c11727, int i) {
        AtomicInteger atomicInteger = c11727.f37941;
        atomicInteger.incrementAndGet();
        while (true) {
            try {
                C2033 c2033M29442 = c11727.m29442();
                if (c2033M29442 != null) {
                    EnumC22346 enumC22346 = c2033M29442.f6762;
                    c11727.mo29447(c2033M29442.f6761);
                    c11727.m43862(c11727.f37936.incrementAndGet(), Math.max(c11727.f37938.get(), i));
                    AbstractC22044 abstractC22044 = c2033M29442.f6760;
                    String strM22373 = C8284.m22373(abstractC22044.mo4294());
                    if (c11727.f37939 && abstractC22044.mo4295()) {
                        boolean zDeleteFile = Features.deleteFile(abstractC22044.mo4294());
                        if (!abstractC22044.mo2934()) {
                            c11727.m29444(strM22373);
                        }
                        if (zDeleteFile) {
                            enumC22346.m50417(abstractC22044.mo4294());
                        }
                    } else {
                        if (!abstractC22044.mo4287() && abstractC22044.mo2934()) {
                            abstractC22044.mo4296();
                        }
                        if (!abstractC22044.mo2934()) {
                            c11727.m29444(strM22373);
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

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۘ */
    public final void mo16837(String str) {
        super.mo16837(str);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo29447(CharSequence charSequence) {
        super.mo29447(charSequence);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final void mo16839(int i) {
        super.mo16839(i);
        C21949.m49661().m49667(m43865("remoteTaskId"), this);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
        C22961.m51805();
        m29446(c12187);
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m29439() {
        LinkedHashSet<String> linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f37940);
        }
        for (String str : linkedHashSet) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            if (abstractC22044M35193.mo2934() && abstractC22044M35193.mo4281()) {
                linkedHashSet2.add(str);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m29443() {
        LinkedHashSet linkedHashSet;
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f37937);
        }
        return new ArrayList(linkedHashSet);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3281[] m29445(String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (String str : strArr) {
            linkedHashSet.add(C8284.m22371(C8284.m22373(str)));
        }
        C3281[] c3281Arr = new C3281[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c3281Arr[i] = C3281.m10818((String) it.next(), EnumC12230.MODIFY_DIRECTORY);
            i++;
        }
        return c3281Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29441(AbstractC22044 abstractC22044, String str) throws InterruptedException {
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
        LinkedBlockingQueue linkedBlockingQueue = this.f37942;
        AtomicInteger atomicInteger = this.f37938;
        if (!zMo4281 || abstractC22044.m49860()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2033(abstractC22044, string, EnumC22346.EXACT));
            return;
        }
        if (abstractC22044.mo4293()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2033(abstractC22044, string, EnumC22346.TREE));
            return;
        }
        if (this.f37939 && abstractC22044.mo4295()) {
            atomicInteger.incrementAndGet();
            linkedBlockingQueue.put(new C2033(abstractC22044, string, EnumC22346.TREE));
            return;
        }
        Iterator it = abstractC22044.mo4299(true).iterator();
        while (it.hasNext()) {
            m29441((AbstractC22044) it.next(), string);
        }
        if (mo924()) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f37943.add(new C2033(abstractC22044, string, EnumC22346.NONE));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final C12187 mo4494(Exception exc) {
        C12187 c12187M30465 = C12187.m30465(exc);
        m29446(c12187M30465);
        return c12187M30465;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    private C2033 m29442() {
        this.f37946.incrementAndGet();
        while (!mo924()) {
            try {
                try {
                    C2033 c2033 = (C2033) this.f37942.poll(200L, TimeUnit.MILLISECONDS);
                    if (c2033 == null) {
                        if (!this.f37945) {
                            break;
                        }
                    } else {
                        this.f37946.decrementAndGet();
                        return c2033;
                    }
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                this.f37946.decrementAndGet();
                throw th;
            }
        }
        this.f37946.decrementAndGet();
        return null;
    }
}
