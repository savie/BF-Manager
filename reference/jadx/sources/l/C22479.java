package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩸֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes2.dex */
public class C22479 extends AbstractC15118 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72748 = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public ExecutorService f72750;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C4424 f72756;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public boolean f72761 = C21576.m49078();

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public List f72757 = C1402.m5127();

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f72755 = new AtomicReference();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public List f72758 = C1402.m5127();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C12919 f72762 = new C12919();

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C19689 f72753 = new C19689();

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public ThreadLocal f72751 = new ThreadLocal();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C18616 f72749 = new C18616(true);

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f72754 = new HashSet();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f72752 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24457 f72760 = new C21733(this);

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3678 f72759 = new C10544(this);

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public C12187 mo2531() throws Exception {
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43867 = m43867("sourcePath");
        String strM43865 = m43865("targetPath");
        int i = C17085.f55774;
        C2170 c2170M40225 = C17085.m40225(new File(strM43865));
        if (c2170M40225 != null && !c2170M40225.m7465().f81683.isEmpty()) {
            this.f72750 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC17729.f58262.getBoolean("optimize_external_storage_dt", true) && (C1924.m6601(strArrM43831) || C1924.m6601(strM43865))) {
            this.f72750 = Executors.newSingleThreadExecutor();
        } else {
            this.f72750 = Executors.newFixedThreadPool(3);
        }
        boolean z = this instanceof C23993;
        if (z) {
            C6265.m17912(strM43865, EnumC12230.MODIFY_DIRECTORY);
        } else {
            EnumC12230 enumC12230 = EnumC12230.MODIFY_DIRECTORY;
            C6265.m17914(C3281.m10818(strM43867, enumC12230), C3281.m10818(strM43865, enumC12230));
        }
        C14584.m35193(strM43865, new String[0]).m49853();
        C4424 c4424M14050 = C4424.m14050(strM43865, this.f72749, this.f72759);
        this.f72756 = c4424M14050;
        c4424M14050.m14071(strArrM43831);
        for (AbstractC6662 abstractC6662 : this.f72756.m14080()) {
            if (abstractC6662.m18620() != null) {
                this.f72758.add((String) abstractC6662.m18620());
                if (abstractC6662.m18625()) {
                    if (!z) {
                        C20108.m46237(abstractC6662.m18604());
                    }
                    m50709(abstractC6662.m18641());
                } else {
                    if (!z) {
                        C20108.m46239(abstractC6662.m18604());
                    }
                    C20108.m46233(abstractC6662.m18626(), true);
                }
            }
        }
        mo16842(this.f72756);
        m36394(true);
        this.f72753.m45389();
        this.f72762.m31997();
        Iterator it = this.f72756.m14079().iterator();
        while (it.hasNext()) {
            m50708((AbstractC6662) it.next());
        }
        C5261.m15837(this.f72750);
        if (mo924()) {
            return C12187.m30469();
        }
        AtomicReference atomicReference = this.f72755;
        if (atomicReference.get() != null) {
            Exception exc = (Exception) atomicReference.get();
            C22327.m50389(exc);
            throw exc;
        }
        Iterator it2 = this.f72756.m14079().iterator();
        while (it2.hasNext()) {
            C19495.m45016((AbstractC6662) it2.next());
        }
        Iterator it3 = this.f72757.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        SystemClock.sleep(100L);
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46055;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43850("targetPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public void mo2528() {
        m43868(R.string.MT_Protector);
        mo16841("...");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50708(final AbstractC6662 abstractC6662) {
        this.f72750.submit(new Runnable() { // from class: l.ۙ֫۫
            @Override // java.lang.Runnable
            public final void run() {
                C22479 c22479 = this.f16289;
                AtomicReference atomicReference = c22479.f72755;
                InterfaceC24457 interfaceC24457 = c22479.f72760;
                HashSet hashSet = c22479.f72754;
                C19689 c19689 = c22479.f72753;
                ReentrantLock reentrantLock = c22479.f72752;
                boolean zMo924 = c22479.mo924();
                AbstractC6662 abstractC6663 = abstractC6662;
                if (zMo924 || atomicReference.get() != null) {
                    abstractC6663.m18640();
                    return;
                }
                c22479.f72751.set(abstractC6663.m18624());
                c22479.mo16841(abstractC6663.m18624());
                abstractC6663.m18606();
                try {
                    try {
                        if (abstractC6663.m18605()) {
                            AbstractC22044 abstractC22044M18615 = abstractC6663.m18615();
                            AbstractC22044 abstractC22044M18641 = abstractC6663.m18641();
                            c19689.m45391(abstractC22044M18615.m49856(), EnumC12230.MODIFY_DIRECTORY, abstractC22044M18641, EnumC12230.MODIFY_FILE);
                            if (abstractC6663.m18630()) {
                                abstractC22044M18641.mo4287();
                            }
                            if (!abstractC6663.m18621() || !abstractC22044M18615.mo4301(abstractC22044M18641)) {
                                C14453.m34909(abstractC22044M18615.mo2954(), abstractC22044M18641.mo4294());
                                if (c22479.mo924()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC6663.m18640();
                                    return;
                                }
                                abstractC22044M18615.mo4287();
                            }
                        } else if (abstractC6663.m18625()) {
                            if (!abstractC6663.m18630()) {
                                C24523 c24523 = new C24523();
                                c24523.m54796(abstractC6663.m18615());
                                AbstractC22044 abstractC22044M18642 = abstractC6663.m18641();
                                c19689.m45390(abstractC22044M18642, EnumC12230.MODIFY_FILE);
                                abstractC22044M18642.m49853();
                                c24523.m54797(abstractC22044M18642);
                                if (c22479.f72761 && abstractC22044M18642.mo2945()) {
                                    c22479.f72757.add(new RunnableC25028(2, abstractC22044M18642, abstractC6663));
                                }
                            }
                            c19689.m45390(abstractC6663.m18615().m49856(), EnumC12230.MODIFY_DIRECTORY);
                        } else {
                            AbstractC22044 abstractC22044M18616 = abstractC6663.m18615();
                            AbstractC22044 abstractC22044M18643 = abstractC6663.m18641();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC6663.m18630() && (abstractC22044M18643.mo2934() || hashSet.contains(abstractC22044M18643.mo4294().toLowerCase()))) {
                                abstractC6663.m18619(true);
                                if (c22479.f72749.mo28694()) {
                                    try {
                                        c22479.f72749.mo28697(abstractC6663.m18624(), C21578.m49094(abstractC6663.m18622(), abstractC6663.m18627()), C21578.m49096(abstractC22044M18643), false);
                                    } catch (Exception e) {
                                        e = e;
                                        while (true) {
                                            AtomicReference atomicReference2 = atomicReference;
                                            if (atomicReference2.compareAndSet(null, e) || atomicReference2.get() != null) {
                                                break;
                                                break;
                                            }
                                            atomicReference = atomicReference2;
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC6663.m18640();
                                        return;
                                    }
                                }
                                if (c22479.f72749.mo924()) {
                                    c22479.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC6663.m18640();
                                    return;
                                }
                                z = c22479.f72749.mo28700() == 1;
                                if (c22479.f72749.mo28700() == 2) {
                                    abstractC6663.m18623();
                                } else {
                                    C24523 c24524 = new C24523();
                                    c24524.m54796(abstractC22044M18643);
                                    abstractC6663.m18611(c24524.m54795());
                                }
                                if (c22479.f72749.mo28700() == 0 && c22479.f72749.mo28695() && abstractC22044M18643.mo4292()) {
                                    abstractC6663.m18636(true);
                                }
                            }
                            if (z) {
                                reentrantLock.unlock();
                            } else if (!abstractC6663.m18630()) {
                                c19689.m45391(abstractC22044M18616.m49856(), EnumC12230.MODIFY_DIRECTORY, abstractC22044M18643, EnumC12230.MODIFY_FILE);
                                hashSet.add(abstractC22044M18643.mo4294().toLowerCase());
                                reentrantLock.unlock();
                                abstractC22044M18616.m49847(abstractC22044M18643, new C24523(), interfaceC24457);
                                if (c22479.mo924()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC6663.m18640();
                                    return;
                                }
                                abstractC22044M18616.mo4287();
                            } else if (abstractC6663.m18639()) {
                                while (true) {
                                    abstractC22044M18643 = abstractC22044M18643.m49839(true);
                                    if (!abstractC22044M18643.mo2934() && !hashSet.contains(abstractC22044M18643.mo4294().toLowerCase())) {
                                        break;
                                    }
                                }
                                c19689.m45391(abstractC22044M18616.m49856(), EnumC12230.MODIFY_DIRECTORY, abstractC22044M18643, EnumC12230.MODIFY_FILE);
                                hashSet.add(abstractC22044M18643.mo4294().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC6663.m18621() && abstractC22044M18616.mo4301(abstractC22044M18643)) {
                                    c22479.f72756.m6378(abstractC6663.mo18632().m18622());
                                } else {
                                    abstractC22044M18616.m49847(abstractC22044M18643, new C24523(), interfaceC24457);
                                    if (c22479.mo924()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC6663.m18640();
                                        return;
                                    }
                                    abstractC22044M18616.mo4287();
                                }
                                if (abstractC6663.m18620() != null) {
                                    abstractC6663.m18638(abstractC22044M18643.getName());
                                }
                            } else {
                                c19689.m45391(abstractC22044M18616.m49856(), EnumC12230.MODIFY_DIRECTORY, abstractC22044M18643, EnumC12230.MODIFY_FILE);
                                C24523 c24525 = new C24523();
                                c24525.m54793(abstractC6663.m18628());
                                c24525.m54792();
                                hashSet.add(abstractC22044M18643.mo4294().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC6663.m18616()) {
                                    abstractC22044M18643.mo4300(c22479);
                                } else {
                                    abstractC22044M18643.mo4287();
                                }
                                if (abstractC6663.m18621() && abstractC22044M18616.mo4301(abstractC22044M18643)) {
                                    c22479.f72756.m6378(abstractC6663.mo18632().m18622());
                                    c24525.m54797(abstractC22044M18643);
                                } else {
                                    abstractC22044M18616.m49847(abstractC22044M18643, c24525, interfaceC24457);
                                    if (c22479.mo924()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC6663.m18640();
                                        return;
                                    }
                                    abstractC22044M18616.mo4287();
                                }
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC6663.m18640();
                        c22479.f72756.m6376();
                        if (!abstractC6663.m18625()) {
                            if (!(c22479 instanceof C23993)) {
                                C20108.m46239(abstractC6663.m18604());
                            }
                            C20108.m46233(abstractC6663.m18626(), true);
                        }
                        if (abstractC6663.m18620() != null) {
                            c22479.f72758.add((String) abstractC6663.m18620());
                        }
                        c22479.mo16842(c22479.f72756);
                        c22479.mo16839(c22479.f72756.m6380());
                    } catch (Throwable th) {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC6663.m18640();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        });
        if (abstractC6662.m18625()) {
            Iterator it = abstractC6662.mo18607().m47638().iterator();
            while (it.hasNext()) {
                m50708((AbstractC6662) it.next());
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
        }
        List list = this.f72758;
        if (list.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) list);
        c8615.m23216();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m50709(AbstractC22044 abstractC22044) {
        for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
            if (abstractC22045.mo4281()) {
                m50709(abstractC22045);
            } else {
                C20108.m46233(abstractC22045.mo4294(), true);
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public void mo2533(C12187 c12187) {
        if (!this.f72750.isShutdown()) {
            this.f72750.shutdownNow();
        }
        this.f72762.m31996();
        C6331.m18055();
        C22961.m51805();
    }
}
