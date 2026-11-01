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

/* JADX INFO: renamed from: l.ۨۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes4.dex */
public class C11441 extends AbstractC0656 {

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38488 = 0;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C21026 f38494;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public ExecutorService f38500;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public boolean f38499 = C16737.m39280();

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public List f38497 = C11445.m28558();

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f38502 = new AtomicReference();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public List f38491 = C11445.m28558();

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C16842 f38490 = new C16842();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C20062 f38498 = new C20062();

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f38492 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C16608 f38496 = new C16608(true);

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f38489 = new HashSet();

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f38495 = new ReentrantLock();

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC20267 f38493 = new C4384(this);

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8327 f38501 = new C13558(this);

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public C5202 mo3077() throws Exception {
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41565 = m41565("sourcePath");
        String strM41585 = m41585("targetPath");
        int i = C19001.f61501;
        C23235 c23235M43707 = C19001.m43707(new File(strM41585));
        if (c23235M43707 != null && !c23235M43707.m51272().f58378.isEmpty()) {
            this.f38500 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC0716.f2988.getBoolean("optimize_external_storage_dt", true) && (C14928.m35677(strArrM41566) || C14928.m35677(strM41585))) {
            this.f38500 = Executors.newSingleThreadExecutor();
        } else {
            this.f38500 = Executors.newFixedThreadPool(3);
        }
        boolean z = this instanceof C18851;
        if (z) {
            C2462.m7541(strM41585, EnumC11636.MODIFY_DIRECTORY);
        } else {
            EnumC11636 enumC11636 = EnumC11636.MODIFY_DIRECTORY;
            C2462.m7543(C4579.m12723(strM41565, enumC11636), C4579.m12723(strM41585, enumC11636));
        }
        C5553.m15313(strM41585, new String[0]).m46739();
        C21026 c21026M47357 = C21026.m47357(strM41585, this.f38496, this.f38501);
        this.f38494 = c21026M47357;
        c21026M47357.m47378(strArrM41566);
        for (AbstractC10444 abstractC10444 : this.f38494.m47388()) {
            if (abstractC10444.m26372() != null) {
                this.f38491.add((String) abstractC10444.m26372());
                if (abstractC10444.m26387()) {
                    if (!z) {
                        C22252.m49410(abstractC10444.m26362());
                    }
                    m28554(abstractC10444.m26394());
                } else {
                    if (!z) {
                        C22252.m49404(abstractC10444.m26362());
                    }
                    C22252.m49408(abstractC10444.m26385(), true);
                }
            }
        }
        mo2983(this.f38494);
        m2974(true);
        this.f38498.m45431();
        this.f38490.m39499();
        Iterator it = this.f38494.m47385().iterator();
        while (it.hasNext()) {
            m28553((AbstractC10444) it.next());
        }
        C4716.m13052(this.f38500);
        if (mo2357()) {
            return C5202.m14378();
        }
        AtomicReference atomicReference = this.f38502;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f38494.m47385().iterator();
        while (it2.hasNext()) {
            C2267.m6948((AbstractC10444) it2.next());
        }
        Iterator it3 = this.f38497.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        SystemClock.sleep(100L);
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5716;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41567("targetPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public void mo3075() {
        m41591(R.string.MT_Protector);
        mo2982("...");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m28553(final AbstractC10444 abstractC10444) {
        this.f38500.submit(new Runnable() { // from class: l.ۗۢ᩹
            @Override // java.lang.Runnable
            public final void run() {
                C11441 c11441 = this.f11895;
                AtomicReference atomicReference = c11441.f38502;
                InterfaceC20267 interfaceC20267 = c11441.f38493;
                HashSet hashSet = c11441.f38489;
                C20062 c20062 = c11441.f38498;
                ReentrantLock reentrantLock = c11441.f38495;
                boolean zMo2357 = c11441.mo2357();
                AbstractC10444 abstractC10445 = abstractC10444;
                if (zMo2357 || atomicReference.get() != null) {
                    abstractC10445.m26373();
                    return;
                }
                c11441.f38492.set(abstractC10445.m26393());
                c11441.mo2982(abstractC10445.m26393());
                abstractC10445.m26391();
                try {
                    try {
                        if (abstractC10445.m26374()) {
                            AbstractC20745 abstractC20745M26380 = abstractC10445.m26380();
                            AbstractC20745 abstractC20745M26394 = abstractC10445.m26394();
                            c20062.m45433(abstractC20745M26380.m46711(), EnumC11636.MODIFY_DIRECTORY, abstractC20745M26394, EnumC11636.MODIFY_FILE);
                            if (abstractC10445.m26389()) {
                                abstractC20745M26394.mo24644();
                            }
                            if (!abstractC10445.m26375() || !abstractC20745M26380.mo24646(abstractC20745M26394)) {
                                C0055.m954(abstractC20745M26380.mo33968(), abstractC20745M26394.mo33986());
                                if (c11441.mo2357()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC10445.m26373();
                                    return;
                                }
                                abstractC20745M26380.mo24644();
                            }
                        } else if (abstractC10445.m26387()) {
                            if (!abstractC10445.m26389()) {
                                C5222 c5222 = new C5222();
                                c5222.m14408(abstractC10445.m26380());
                                AbstractC20745 abstractC20745M26395 = abstractC10445.m26394();
                                c20062.m45432(abstractC20745M26395, EnumC11636.MODIFY_FILE);
                                abstractC20745M26395.m46739();
                                c5222.m14402(abstractC20745M26395);
                                if (c11441.f38499 && abstractC20745M26395.mo8448()) {
                                    c11441.f38497.add(new RunnableC5988(2, abstractC20745M26395, abstractC10445));
                                }
                            }
                            c20062.m45432(abstractC10445.m26380().m46711(), EnumC11636.MODIFY_DIRECTORY);
                        } else {
                            AbstractC20745 abstractC20745M26381 = abstractC10445.m26380();
                            AbstractC20745 abstractC20745M26396 = abstractC10445.m26394();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC10445.m26389() && (abstractC20745M26396.mo33975() || hashSet.contains(abstractC20745M26396.mo33986().toLowerCase()))) {
                                abstractC10445.m26379(true);
                                if (c11441.f38496.mo11428()) {
                                    try {
                                        c11441.f38496.mo11424(abstractC10445.m26393(), C20321.m45854(abstractC10445.m26359(), abstractC10445.m26392()), C20321.m45856(abstractC20745M26396), false);
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
                                        abstractC10445.m26373();
                                        return;
                                    }
                                }
                                if (c11441.f38496.mo2357()) {
                                    c11441.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC10445.m26373();
                                    return;
                                }
                                z = c11441.f38496.mo11431() == 1;
                                if (c11441.f38496.mo11431() == 2) {
                                    abstractC10445.m26386();
                                } else {
                                    C5222 c5223 = new C5222();
                                    c5223.m14408(abstractC20745M26396);
                                    abstractC10445.m26366(c5223.m14407());
                                }
                                if (c11441.f38496.mo11431() == 0 && c11441.f38496.mo11432() && abstractC20745M26396.mo35233()) {
                                    abstractC10445.m26384(true);
                                }
                            }
                            if (z) {
                                reentrantLock.unlock();
                            } else if (!abstractC10445.m26389()) {
                                c20062.m45433(abstractC20745M26381.m46711(), EnumC11636.MODIFY_DIRECTORY, abstractC20745M26396, EnumC11636.MODIFY_FILE);
                                hashSet.add(abstractC20745M26396.mo33986().toLowerCase());
                                reentrantLock.unlock();
                                abstractC20745M26381.m46701(abstractC20745M26396, new C5222(), interfaceC20267);
                                if (c11441.mo2357()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC10445.m26373();
                                    return;
                                }
                                abstractC20745M26381.mo24644();
                            } else if (abstractC10445.m26388()) {
                                while (true) {
                                    abstractC20745M26396 = abstractC20745M26396.m46693(true);
                                    if (!abstractC20745M26396.mo33975() && !hashSet.contains(abstractC20745M26396.mo33986().toLowerCase())) {
                                        break;
                                    }
                                }
                                c20062.m45433(abstractC20745M26381.m46711(), EnumC11636.MODIFY_DIRECTORY, abstractC20745M26396, EnumC11636.MODIFY_FILE);
                                hashSet.add(abstractC20745M26396.mo33986().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC10445.m26375() && abstractC20745M26381.mo24646(abstractC20745M26396)) {
                                    c11441.f38494.m10994(abstractC10445.mo23366().m26359());
                                } else {
                                    abstractC20745M26381.m46701(abstractC20745M26396, new C5222(), interfaceC20267);
                                    if (c11441.mo2357()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC10445.m26373();
                                        return;
                                    }
                                    abstractC20745M26381.mo24644();
                                }
                                if (abstractC10445.m26372() != null) {
                                    abstractC10445.m26361(abstractC20745M26396.getName());
                                }
                            } else {
                                c20062.m45433(abstractC20745M26381.m46711(), EnumC11636.MODIFY_DIRECTORY, abstractC20745M26396, EnumC11636.MODIFY_FILE);
                                C5222 c5224 = new C5222();
                                c5224.m14405(abstractC10445.m26370());
                                c5224.m14404();
                                hashSet.add(abstractC20745M26396.mo33986().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC10445.m26376()) {
                                    abstractC20745M26396.mo35234(c11441);
                                } else {
                                    abstractC20745M26396.mo24644();
                                }
                                if (abstractC10445.m26375() && abstractC20745M26381.mo24646(abstractC20745M26396)) {
                                    c11441.f38494.m10994(abstractC10445.mo23366().m26359());
                                    c5224.m14402(abstractC20745M26396);
                                } else {
                                    abstractC20745M26381.m46701(abstractC20745M26396, c5224, interfaceC20267);
                                    if (c11441.mo2357()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC10445.m26373();
                                        return;
                                    }
                                    abstractC20745M26381.mo24644();
                                }
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC10445.m26373();
                        c11441.f38494.m10992();
                        if (!abstractC10445.m26387()) {
                            if (!(c11441 instanceof C18851)) {
                                C22252.m49404(abstractC10445.m26362());
                            }
                            C22252.m49408(abstractC10445.m26385(), true);
                        }
                        if (abstractC10445.m26372() != null) {
                            c11441.f38491.add((String) abstractC10445.m26372());
                        }
                        c11441.mo2983(c11441.f38494);
                        c11441.mo21455(c11441.f38494.m10996());
                    } catch (Throwable th) {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC10445.m26373();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        });
        if (abstractC10444.m26387()) {
            Iterator it = abstractC10444.mo23365().m44704().iterator();
            while (it.hasNext()) {
                m28553((AbstractC10444) it.next());
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
        List list = this.f38491;
        if (list.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) list);
        c11546.m28830();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28554(AbstractC20745 abstractC20745) {
        for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
            if (abstractC20746.mo33974()) {
                m28554(abstractC20746);
            } else {
                C22252.m49408(abstractC20746.mo33986(), true);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public void mo3079(C5202 c5202) {
        if (!this.f38500.isShutdown()) {
            this.f38500.shutdownNow();
        }
        this.f38490.m39498();
        C21094.m47530();
        C23186.m51173();
    }
}
