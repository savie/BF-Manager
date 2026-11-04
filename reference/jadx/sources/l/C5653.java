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

/* JADX INFO: renamed from: l.ۚ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes3.dex */
public class C5653 extends AbstractC15118 {

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19521 = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public ExecutorService f19523;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C4424 f19529;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public String f19530;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public boolean f19535 = C21576.m49078();

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public List f19536 = C1402.m5127();

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public AtomicReference f19528 = new AtomicReference();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public List f19531 = C1402.m5127();

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C12919 f19534 = new C12919();

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C19689 f19526 = new C19689();

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public ThreadLocal f19524 = new ThreadLocal();

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C18616 f19522 = new C18616(false);

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f19527 = new HashSet();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f19525 = new ReentrantLock();

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24457 f19532 = new C15347(this);

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3678 f19533 = new C13110(this);

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public C12187 mo2531() throws Exception {
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        int i = C17085.f55774;
        C2170 c2170M40225 = C17085.m40225(new File(strM43865));
        this.f19530 = m43867("replacedName");
        if (c2170M40225 != null && !c2170M40225.m7465().f81683.isEmpty()) {
            this.f19523 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC17729.f58262.getBoolean("optimize_external_storage_dt", true) && (C1924.m6601(strArrM43831) || C1924.m6601(strM43865))) {
            this.f19523 = Executors.newSingleThreadExecutor();
        } else {
            this.f19523 = Executors.newFixedThreadPool(3);
        }
        C6265.m17912(strM43865, EnumC12230.MODIFY_DIRECTORY);
        C14584.m35193(strM43865, new String[0]).m49853();
        C4424 c4424M14050 = C4424.m14050(strM43865, this.f19522, this.f19533);
        this.f19529 = c4424M14050;
        c4424M14050.m14069(this.f19530);
        this.f19529.m14074(strArrM43831, (AbstractC7629) C11969.f38536, false, true);
        if (!this.f19529.m14076(true)) {
            cancel();
            return C12187.m30469();
        }
        m43868(R.string.MT_Protector);
        mo16842(this.f19529);
        m36394(true);
        this.f19526.m45389();
        this.f19534.m31997();
        Iterator it = this.f19529.m14079().iterator();
        while (it.hasNext()) {
            m16640((AbstractC6662) it.next());
        }
        C5261.m15837(this.f19523);
        if (mo924()) {
            return C12187.m30469();
        }
        AtomicReference atomicReference = this.f19528;
        if (atomicReference.get() != null) {
            Exception exc = (Exception) atomicReference.get();
            C22327.m50389(exc);
            throw exc;
        }
        Iterator it2 = this.f19536.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        SystemClock.sleep(100L);
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46058;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        String str = this.f19530;
        return str != null ? C21576.m49059(R.string.MT_Protector, str) : C21576.m49059(R.string.MT_Protector, m43850("targetPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public void mo2528() {
        m43868(R.string.MT_Protector);
        mo16841("...");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m16640(final AbstractC6662 abstractC6662) {
        this.f19523.submit(new Runnable() { // from class: l.ᩴ۫۫
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
                C5653 c5653 = this.f63731;
                AtomicReference atomicReference = c5653.f19528;
                InterfaceC24457 interfaceC24457 = c5653.f19532;
                HashSet hashSet = c5653.f19527;
                C19689 c19689 = c5653.f19526;
                ReentrantLock reentrantLock = c5653.f19525;
                boolean zMo924 = c5653.mo924();
                AbstractC6662 abstractC6663 = abstractC6662;
                if (zMo924 || atomicReference.get() != null) {
                    abstractC6663.m18640();
                    return;
                }
                String strM18624 = abstractC6663.m18624();
                String str = c5653.f19530;
                if (str != null && strM18624.startsWith(str.concat("/"))) {
                    strM18624 = strM18624.substring(str.length() + 1);
                }
                c5653.f19524.set(strM18624);
                c5653.mo16841(strM18624);
                abstractC6663.m18606();
                try {
                    try {
                        if (abstractC6663.m18605()) {
                            AbstractC22044 abstractC22044M18615 = abstractC6663.m18615();
                            AbstractC22044 abstractC22044M18641 = abstractC6663.m18641();
                            c19689.m45390(abstractC22044M18641, EnumC12230.MODIFY_FILE);
                            C14453.m34909(abstractC22044M18615.mo2954(), abstractC22044M18641.mo4294());
                        } else if (!abstractC6663.m18625()) {
                            AbstractC22044 abstractC22044M18616 = abstractC6663.m18615();
                            AbstractC22044 abstractC22044M18642 = abstractC6663.m18641();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC6663.m18630() && (abstractC22044M18642.mo2934() || hashSet.contains(abstractC22044M18642.mo4294()))) {
                                abstractC6663.m18619(true);
                                if (c5653.f19522.mo28694()) {
                                    try {
                                        c5653.f19522.mo28697(abstractC6663.m18624(), C21578.m49094(abstractC6663.m18622(), abstractC6663.m18627()), C21578.m49096(abstractC22044M18642), abstractC22044M18642.mo4292());
                                    } catch (Exception e) {
                                        e = e;
                                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC6663.m18640();
                                        return;
                                    }
                                }
                                if (c5653.f19522.mo924()) {
                                    c5653.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC6663.m18640();
                                    return;
                                }
                                z = c5653.f19522.mo28700() == 1;
                                if (c5653.f19522.mo28700() == 2) {
                                    abstractC6663.m18623();
                                } else {
                                    C24523 c24523 = new C24523();
                                    c24523.m54796(abstractC22044M18642);
                                    abstractC6663.m18611(c24523.m54795());
                                }
                                if (c5653.f19522.mo28700() == 0 && c5653.f19522.mo28695() && abstractC22044M18642.mo4292()) {
                                    abstractC6663.m18636(true);
                                }
                            }
                            if (z || (!abstractC6663.m18639() && C14584.m35211(abstractC22044M18616.mo4294(), abstractC22044M18642.mo4294()))) {
                                reentrantLock.unlock();
                            } else if (!abstractC6663.m18630()) {
                                c19689.m45390(abstractC22044M18642, EnumC12230.MODIFY_FILE);
                                hashSet.add(abstractC22044M18642.mo4294());
                                reentrantLock.unlock();
                                abstractC22044M18616.m49847(abstractC22044M18642, abstractC6663.m18617(), interfaceC24457);
                            } else if (abstractC6663.m18639()) {
                                while (true) {
                                    abstractC22044M18642 = abstractC22044M18642.m49839(true);
                                    if (!abstractC22044M18642.mo2934() && !hashSet.contains(abstractC22044M18642.mo4294())) {
                                        break;
                                    }
                                }
                                c19689.m45390(abstractC22044M18642, EnumC12230.MODIFY_FILE);
                                hashSet.add(abstractC22044M18642.mo4294());
                                reentrantLock.unlock();
                                abstractC22044M18616.m49847(abstractC22044M18642, abstractC6663.m18617(), interfaceC24457);
                                if (abstractC6663.m18620() != null) {
                                    abstractC6663.m18638(abstractC22044M18642.getName());
                                }
                            } else {
                                c19689.m45390(abstractC22044M18642, EnumC12230.MODIFY_FILE);
                                if (abstractC6663.m18616()) {
                                    abstractC22044M18642.mo4300(c5653);
                                }
                                hashSet.add(abstractC22044M18642.mo4294());
                                reentrantLock.unlock();
                                abstractC22044M18616.m49847(abstractC22044M18642, (C24523) null, interfaceC24457);
                                C24523 c24523M18617 = abstractC6663.m18617();
                                if (c24523M18617 != null) {
                                    c24523M18617.m54797(abstractC22044M18642);
                                }
                            }
                        } else if (!abstractC6663.m18630()) {
                            AbstractC22044 abstractC22044M18643 = abstractC6663.m18641();
                            c19689.m45390(abstractC22044M18643, EnumC12230.MODIFY_FILE);
                            abstractC22044M18643.m49853();
                            C24523 c24523M18618 = abstractC6663.m18617();
                            if (c24523M18618 != null) {
                                c24523M18618.m54797(abstractC22044M18643);
                            }
                            if (c5653.f19535 && abstractC22044M18643.mo2945()) {
                                c5653.f19536.add(new RunnableC9840(2, abstractC22044M18643, abstractC6663));
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC6663.m18640();
                        c5653.f19529.m6376();
                        if (!abstractC6663.m18625()) {
                            C20108.m46233(abstractC6663.m18626(), true);
                        }
                        if (abstractC6663.m18620() != null) {
                            c5653.f19531.add((String) abstractC6663.m18620());
                        }
                        c5653.mo16842(c5653.f19529);
                        c5653.mo16839(c5653.f19529.m6380());
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    if (reentrantLock.isHeldByCurrentThread()) {
                        reentrantLock.unlock();
                    }
                    abstractC6663.m18640();
                    throw th;
                }
            }
        });
        if (abstractC6662.m18625()) {
            Iterator it = abstractC6662.mo18607().m47638().iterator();
            while (it.hasNext()) {
                m16640((AbstractC6662) it.next());
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
        }
        List list = this.f19531;
        if (list.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) list);
        c8615.m23216();
        if (this.f19530 != null) {
            c8614.m23176((Collection) list);
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public void mo2533(C12187 c12187) {
        if (!this.f19523.isShutdown()) {
            this.f19523.shutdownNow();
        }
        this.f19534.m31996();
        C6331.m18055();
    }
}
