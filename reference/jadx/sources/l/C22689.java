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

/* JADX INFO: renamed from: l.᩺֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes2.dex */
public class C22689 extends AbstractC0656 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73869 = 0;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C21026 f73875;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public String f73878;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public ExecutorService f73881;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public boolean f73880 = C16737.m39280();

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public List f73871 = C11445.m28558();

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f73884 = new AtomicReference();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public List f73872 = C11445.m28558();

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C16842 f73874 = new C16842();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C20062 f73879 = new C20062();

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f73873 = new ThreadLocal();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C16608 f73877 = new C16608(false);

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f73870 = new HashSet();

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f73876 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC20267 f73883 = new C3637(this);

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8327 f73882 = new C6460(this);

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public C5202 mo3077() throws Exception {
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        int i = C19001.f61501;
        C23235 c23235M43707 = C19001.m43707(new File(strM41585));
        this.f73878 = m41565("replacedName");
        if (c23235M43707 != null && !c23235M43707.m51272().f58378.isEmpty()) {
            this.f73881 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC0716.f2988.getBoolean("optimize_external_storage_dt", true) && (C14928.m35677(strArrM41566) || C14928.m35677(strM41585))) {
            this.f73881 = Executors.newSingleThreadExecutor();
        } else {
            this.f73881 = Executors.newFixedThreadPool(3);
        }
        C2462.m7541(strM41585, EnumC11636.MODIFY_DIRECTORY);
        C5553.m15313(strM41585, new String[0]).m46739();
        C21026 c21026M47357 = C21026.m47357(strM41585, this.f73877, this.f73882);
        this.f73875 = c21026M47357;
        c21026M47357.m47376(this.f73878);
        this.f73875.m47381(strArrM41566, (AbstractC9677) C21611.f70098, false, true);
        if (!this.f73875.m47383(true)) {
            cancel();
            return C5202.m14378();
        }
        m41591(R.string.MT_Protector);
        mo2983(this.f73875);
        m2974(true);
        this.f73879.m45431();
        this.f73874.m39499();
        Iterator it = this.f73875.m47385().iterator();
        while (it.hasNext()) {
            m50250((AbstractC10444) it.next());
        }
        C4716.m13052(this.f73881);
        if (mo2357()) {
            return C5202.m14378();
        }
        AtomicReference atomicReference = this.f73884;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f73871.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        SystemClock.sleep(100L);
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5713;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        String str = this.f73878;
        return str != null ? C16737.m39264(R.string.MT_Protector, str) : C16737.m39264(R.string.MT_Protector, m41567("targetPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public void mo3075() {
        m41591(R.string.MT_Protector);
        mo2982("...");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m50250(final AbstractC10444 abstractC10444) {
        this.f73881.submit(new Runnable() { // from class: l.۬֫᩹
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                C22689 c22689 = this.f42657;
                AtomicReference atomicReference = c22689.f73884;
                InterfaceC20267 interfaceC20267 = c22689.f73883;
                HashSet hashSet = c22689.f73870;
                C20062 c20062 = c22689.f73879;
                ReentrantLock reentrantLock = c22689.f73876;
                boolean zMo2357 = c22689.mo2357();
                AbstractC10444 abstractC10445 = abstractC10444;
                if (zMo2357 || atomicReference.get() != null) {
                    abstractC10445.m26373();
                    return;
                }
                String strM26393 = abstractC10445.m26393();
                String str = c22689.f73878;
                if (str != null && strM26393.startsWith(str.concat("/"))) {
                    strM26393 = strM26393.substring(str.length() + 1);
                }
                c22689.f73873.set(strM26393);
                c22689.mo2982(strM26393);
                abstractC10445.m26391();
                try {
                    try {
                        if (abstractC10445.m26374()) {
                            AbstractC20745 abstractC20745M26380 = abstractC10445.m26380();
                            AbstractC20745 abstractC20745M26394 = abstractC10445.m26394();
                            c20062.m45432(abstractC20745M26394, EnumC11636.MODIFY_FILE);
                            C0055.m954(abstractC20745M26380.mo33968(), abstractC20745M26394.mo33986());
                        } else if (!abstractC10445.m26387()) {
                            AbstractC20745 abstractC20745M26381 = abstractC10445.m26380();
                            AbstractC20745 abstractC20745M26395 = abstractC10445.m26394();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC10445.m26389() && (abstractC20745M26395.mo33975() || hashSet.contains(abstractC20745M26395.mo33986()))) {
                                abstractC10445.m26379(true);
                                if (c22689.f73877.mo11428()) {
                                    try {
                                        c22689.f73877.mo11424(abstractC10445.m26393(), C20321.m45854(abstractC10445.m26359(), abstractC10445.m26392()), C20321.m45856(abstractC20745M26395), abstractC20745M26395.mo35233());
                                    } catch (Exception e) {
                                        e = e;
                                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC10445.m26373();
                                        return;
                                    }
                                }
                                if (c22689.f73877.mo2357()) {
                                    c22689.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC10445.m26373();
                                    return;
                                }
                                z = c22689.f73877.mo11431() == 1;
                                if (c22689.f73877.mo11431() == 2) {
                                    abstractC10445.m26386();
                                } else {
                                    C5222 c5222 = new C5222();
                                    c5222.m14408(abstractC20745M26395);
                                    abstractC10445.m26366(c5222.m14407());
                                }
                                if (c22689.f73877.mo11431() == 0 && c22689.f73877.mo11432() && abstractC20745M26395.mo35233()) {
                                    abstractC10445.m26384(true);
                                }
                            }
                            if (z || (!abstractC10445.m26388() && C5553.m15330(abstractC20745M26381.mo33986(), abstractC20745M26395.mo33986()))) {
                                reentrantLock.unlock();
                            } else if (!abstractC10445.m26389()) {
                                c20062.m45432(abstractC20745M26395, EnumC11636.MODIFY_FILE);
                                hashSet.add(abstractC20745M26395.mo33986());
                                reentrantLock.unlock();
                                abstractC20745M26381.m46701(abstractC20745M26395, abstractC10445.m26377(), interfaceC20267);
                            } else if (abstractC10445.m26388()) {
                                while (true) {
                                    abstractC20745M26395 = abstractC20745M26395.m46693(true);
                                    if (!abstractC20745M26395.mo33975() && !hashSet.contains(abstractC20745M26395.mo33986())) {
                                        break;
                                    }
                                }
                                c20062.m45432(abstractC20745M26395, EnumC11636.MODIFY_FILE);
                                hashSet.add(abstractC20745M26395.mo33986());
                                reentrantLock.unlock();
                                abstractC20745M26381.m46701(abstractC20745M26395, abstractC10445.m26377(), interfaceC20267);
                                if (abstractC10445.m26372() != null) {
                                    abstractC10445.m26361(abstractC20745M26395.getName());
                                }
                            } else {
                                c20062.m45432(abstractC20745M26395, EnumC11636.MODIFY_FILE);
                                if (abstractC10445.m26376()) {
                                    abstractC20745M26395.mo35234(c22689);
                                }
                                hashSet.add(abstractC20745M26395.mo33986());
                                reentrantLock.unlock();
                                abstractC20745M26381.m46701(abstractC20745M26395, (C5222) null, interfaceC20267);
                                C5222 c5222M26377 = abstractC10445.m26377();
                                if (c5222M26377 != null) {
                                    c5222M26377.m14402(abstractC20745M26395);
                                }
                            }
                        } else if (!abstractC10445.m26389()) {
                            AbstractC20745 abstractC20745M26396 = abstractC10445.m26394();
                            c20062.m45432(abstractC20745M26396, EnumC11636.MODIFY_FILE);
                            abstractC20745M26396.m46739();
                            C5222 c5222M26378 = abstractC10445.m26377();
                            if (c5222M26378 != null) {
                                c5222M26378.m14402(abstractC20745M26396);
                            }
                            if (c22689.f73880 && abstractC20745M26396.mo8448()) {
                                c22689.f73871.add(new RunnableC15343(2, abstractC20745M26396, abstractC10445));
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC10445.m26373();
                        c22689.f73875.m10992();
                        if (!abstractC10445.m26387()) {
                            C22252.m49408(abstractC10445.m26385(), true);
                        }
                        if (abstractC10445.m26372() != null) {
                            c22689.f73872.add((String) abstractC10445.m26372());
                        }
                        c22689.mo2983(c22689.f73875);
                        c22689.mo21455(c22689.f73875.m10996());
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    if (reentrantLock.isHeldByCurrentThread()) {
                        reentrantLock.unlock();
                    }
                    abstractC10445.m26373();
                    throw th;
                }
            }
        });
        if (abstractC10444.m26387()) {
            Iterator it = abstractC10444.mo23365().m44704().iterator();
            while (it.hasNext()) {
                m50250((AbstractC10444) it.next());
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
        List list = this.f73872;
        if (list.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) list);
        c11546.m28830();
        if (this.f73878 != null) {
            c11545.m28777((Collection) list);
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public void mo3079(C5202 c5202) {
        if (!this.f73881.isShutdown()) {
            this.f73881.shutdownNow();
        }
        this.f73874.m39498();
        C21094.m47530();
    }
}
