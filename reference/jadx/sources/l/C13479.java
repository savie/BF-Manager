package l;

import bin.mt.plus.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܰ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13479 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C0196 f44550;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f44551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10594 f44553;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC20267 f44555;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21026 f44556;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9867 f44558;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f44562;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f44564;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f44563 = C11445.m28558();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f44561 = C11445.m28558();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f44557 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f44560 = new ThreadLocal();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f44554 = new AtomicReference();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f44552 = C11445.m28558();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f44559 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32986(AbstractC12233 abstractC12233, AbstractC12233 abstractC12234, String str, String[] strArr, String str2, InterfaceC10594 interfaceC10594) throws Exception {
        this.f44562 = abstractC12233;
        this.f44564 = abstractC12234;
        this.f44553 = interfaceC10594;
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str2, new String[0]);
        this.f44551 = abstractC20745M15313;
        abstractC20745M15313.mo24647();
        this.f44551.m46739();
        C3515 c3515 = new C3515(this, interfaceC10594);
        if (abstractC12234 == null) {
            C21026 c21026M47358 = C21026.m47358(c3515);
            this.f44556 = c21026M47358;
            if (!abstractC12233.f40874.f40387) {
                c21026M47358.m47389();
            }
            this.f44556.m47379(strArr, abstractC12233);
        } else {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            this.f44559 = str.length();
            C21026 c21026M47355 = C21026.m47355(str, abstractC12234, new C16608(false), c3515);
            this.f44556 = c21026M47355;
            if (!abstractC12233.f40874.f40387 || !abstractC12234.f40874.f40387) {
                c21026M47355.m47389();
            }
            this.f44556.m47380(strArr, abstractC12233, abstractC12234, interfaceC10594);
        }
        C0196 c0196 = this.f44550;
        if (c0196 != null) {
            this.f44556.m47377(c0196);
        }
        interfaceC10594.setTitle(R.string.MT_Protector);
        interfaceC10594.mo24047(this.f44556);
        interfaceC10594.mo24050();
        C16842 c16842 = new C16842(0);
        this.f44558 = new C9867(this, interfaceC10594);
        this.f44555 = new C4305(this, interfaceC10594, c16842);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(abstractC12233.m30349());
        c16842.m39499();
        Iterator it = this.f44556.m47385().iterator();
        while (it.hasNext()) {
            m32979(executorServiceNewFixedThreadPool, (AbstractC10444) it.next());
        }
        C4716.m13052(executorServiceNewFixedThreadPool);
        c16842.m39498();
        Iterator it2 = this.f44561.iterator();
        while (it2.hasNext()) {
            C19431.m44468((C22918) it2.next());
        }
        Exception exc = (Exception) this.f44554.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m32981(C13479 c13479, InterfaceC10594 interfaceC10594) {
        return interfaceC10594.mo2357() || c13479.f44554.get() != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32985(C0196 c0196) {
        this.f44550 = c0196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32979(ExecutorService executorService, AbstractC10444 abstractC10444) {
        executorService.submit(new RunnableC20717(1, this, abstractC10444));
        if (abstractC10444.m26387()) {
            Iterator it = abstractC10444.mo23365().m44704().iterator();
            while (it.hasNext()) {
                m32979(executorService, (AbstractC10444) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32980(C13479 c13479, AbstractC10444 abstractC10444) {
        ThreadLocal threadLocal = c13479.f44560;
        if (c13479.f44558.mo2357()) {
            return;
        }
        c13479.f44557.set(abstractC10444.m26393());
        c13479.f44553.setName(abstractC10444.m26393());
        try {
            C22918 c22918 = (C22918) threadLocal.get();
            if (c22918 == null) {
                AbstractC20745 abstractC20745M46688 = c13479.f44551.m46688(".zip");
                C22918 c22919 = new C22918(abstractC20745M46688);
                threadLocal.set(c22919);
                c13479.f44561.add(c22919);
                c13479.f44563.add(abstractC20745M46688);
                c22918 = c22919;
            }
            if (abstractC10444.m26387()) {
                C12107 c12107 = new C12107(abstractC10444.m26385().substring(c13479.f44559) + "/");
                c12107.setTime(abstractC10444.m26392());
                C18396.m42671(c12107, abstractC10444);
                c22918.m50727(c12107);
            } else {
                C12107 c12108 = (abstractC10444.m26389() && abstractC10444.m26388()) ? new C12107(c13479.f44564.mo10260(abstractC10444.m26385()).substring(c13479.f44559)) : new C12107(abstractC10444.m26385().substring(c13479.f44559));
                c12108.setTime(abstractC10444.m26392());
                C18396.m42671(c12108, abstractC10444);
                c22918.m50727(c12108);
                InterfaceC2557 interfaceC2557M24620 = c13479.f44562.m24620(abstractC10444.m26362());
                if (!abstractC10444.m26374()) {
                    AbstractC12233 abstractC12233 = c13479.f44562;
                    abstractC12233.getClass();
                    C15404 c15404 = (C15404) interfaceC2557M24620;
                    InputStream inputStreamMo10262 = abstractC12233.mo10262(0L, c15404.getPath());
                    try {
                        if (inputStreamMo10262 == null) {
                            c13479.f44553.mo24046();
                            if (inputStreamMo10262 != null) {
                                inputStreamMo10262.close();
                                return;
                            }
                            return;
                        }
                        C22487.m49992(inputStreamMo10262, c22918.m50720(), c15404.getSize(), c13479.f44555);
                        inputStreamMo10262.close();
                    } catch (Throwable th) {
                        if (inputStreamMo10262 != null) {
                            try {
                                inputStreamMo10262.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            c13479.f44556.m10992();
            if (abstractC10444.m26372() != null) {
                c13479.f44552.add((String) abstractC10444.m26372());
            }
            c13479.f44553.mo24047(c13479.f44556);
            c13479.f44553.setProgress(c13479.f44556.m10996());
        } catch (Exception e) {
            AtomicReference atomicReference = c13479.f44554;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m32984() {
        return new ArrayList(this.f44563);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List m32987() {
        return this.f44552;
    }
}
