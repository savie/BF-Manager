package l;

import bin.mt.plus.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1485 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24628 f5159;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4424 f5161;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC24457 f5162;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12451 f5163;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f5167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8197 f5169;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f5170;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f5172;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f5164 = C1402.m5127();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f5171 = C1402.m5127();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f5160 = new ThreadLocal();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f5165 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f5168 = new AtomicReference();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f5158 = C1402.m5127();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f5166 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5294(AbstractC18881 abstractC18881, AbstractC18881 abstractC18882, String str, String[] strArr, String str2, InterfaceC24628 interfaceC24628) throws Exception {
        this.f5167 = abstractC18881;
        this.f5172 = abstractC18882;
        this.f5159 = interfaceC24628;
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str2, new String[0]);
        this.f5170 = abstractC22044M35193;
        abstractC22044M35193.mo4296();
        this.f5170.m49853();
        C19384 c19384 = new C19384(this, interfaceC24628);
        if (abstractC18882 == null) {
            C4424 c4424M14052 = C4424.m14052(c19384);
            this.f5161 = c4424M14052;
            if (!abstractC18881.f61289.f1125) {
                c4424M14052.m14082();
            }
            this.f5161.m14072(strArr, abstractC18881);
        } else {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            this.f5166 = str.length();
            C4424 c4424M14051 = C4424.m14051(str, abstractC18882, new C18616(false), c19384);
            this.f5161 = c4424M14051;
            if (!abstractC18881.f61289.f1125 || !abstractC18882.f61289.f1125) {
                c4424M14051.m14082();
            }
            this.f5161.m14073(strArr, abstractC18881, abstractC18882, interfaceC24628);
        }
        C12451 c12451 = this.f5163;
        if (c12451 != null) {
            this.f5161.m14070(c12451);
        }
        interfaceC24628.setTitle(R.string.MT_Protector);
        interfaceC24628.mo12113(this.f5161);
        interfaceC24628.mo12114();
        C12919 c12919 = new C12919(0);
        this.f5169 = new C8197(this, interfaceC24628);
        this.f5162 = new C10433(this, interfaceC24628, c12919);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(abstractC18881.m43792());
        c12919.m31997();
        Iterator it = this.f5161.m14079().iterator();
        while (it.hasNext()) {
            m5287(executorServiceNewFixedThreadPool, (AbstractC6662) it.next());
        }
        C5261.m15837(executorServiceNewFixedThreadPool);
        c12919.m31996();
        Iterator it2 = this.f5171.iterator();
        while (it2.hasNext()) {
            C20244.m46520((C25179) it2.next());
        }
        Exception exc = (Exception) this.f5168.get();
        if (exc == null) {
            return;
        }
        C22327.m50389(exc);
        throw exc;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m5289(C1485 c1485, InterfaceC24628 interfaceC24628) {
        return interfaceC24628.mo924() || c1485.f5168.get() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5293(C12451 c12451) {
        this.f5163 = c12451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5287(ExecutorService executorService, AbstractC6662 abstractC6662) {
        executorService.submit(new RunnableC14461(4, this, abstractC6662));
        if (abstractC6662.m18625()) {
            Iterator it = abstractC6662.mo18607().m47638().iterator();
            while (it.hasNext()) {
                m5287(executorService, (AbstractC6662) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5288(C1485 c1485, AbstractC6662 abstractC6662) {
        ThreadLocal threadLocal = c1485.f5165;
        if (c1485.f5169.mo924()) {
            return;
        }
        c1485.f5160.set(abstractC6662.m18624());
        c1485.f5159.setName(abstractC6662.m18624());
        try {
            C25179 c25179 = (C25179) threadLocal.get();
            if (c25179 == null) {
                AbstractC22044 abstractC22044M49857 = c1485.f5170.m49857(".zip");
                C25179 c251710 = new C25179(abstractC22044M49857);
                threadLocal.set(c251710);
                c1485.f5171.add(c251710);
                c1485.f5164.add(abstractC22044M49857);
                c25179 = c251710;
            }
            if (abstractC6662.m18625()) {
                C8002 c8002 = new C8002(abstractC6662.m18626().substring(c1485.f5166) + "/");
                c8002.setTime(abstractC6662.m18627());
                C3986.m12839(c8002, abstractC6662);
                c25179.m56125(c8002);
            } else {
                C8002 c8003 = (abstractC6662.m18630() && abstractC6662.m18639()) ? new C8002(c1485.f5172.mo35577(abstractC6662.m18626()).substring(c1485.f5166)) : new C8002(abstractC6662.m18626().substring(c1485.f5166));
                c8003.setTime(abstractC6662.m18627());
                C3986.m12839(c8003, abstractC6662);
                c25179.m56125(c8003);
                InterfaceC2386 interfaceC2386M20843 = c1485.f5167.m20843(abstractC6662.m18604());
                if (!abstractC6662.m18605()) {
                    AbstractC18881 abstractC18881 = c1485.f5167;
                    abstractC18881.getClass();
                    C13352 c13352 = (C13352) interfaceC2386M20843;
                    InputStream inputStreamMo35570 = abstractC18881.mo35570(0L, c13352.getPath());
                    try {
                        if (inputStreamMo35570 == null) {
                            c1485.f5159.mo12112();
                            if (inputStreamMo35570 != null) {
                                inputStreamMo35570.close();
                                return;
                            }
                            return;
                        }
                        C21298.m48534(inputStreamMo35570, c25179.m56119(), c13352.getSize(), c1485.f5162);
                        inputStreamMo35570.close();
                    } catch (Throwable th) {
                        if (inputStreamMo35570 != null) {
                            try {
                                inputStreamMo35570.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            c1485.f5161.m6376();
            if (abstractC6662.m18620() != null) {
                c1485.f5158.add((String) abstractC6662.m18620());
            }
            c1485.f5159.mo12113(c1485.f5161);
            c1485.f5159.setProgress(c1485.f5161.m6380());
        } catch (Exception e) {
            AtomicReference atomicReference = c1485.f5168;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m5292() {
        return new ArrayList(this.f5164);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m5295() {
        return this.f5158;
    }
}
