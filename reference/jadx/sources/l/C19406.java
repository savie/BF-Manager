package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩳ᩺۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19406 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC7629 f62719;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0761 f62720;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f62723;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3965 f62727;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC18881 f62730;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4424 f62731;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ExecutorService f62732;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f62718 = C21576.m49078();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f62734 = C1402.m5127();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f62722 = new AtomicReference();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f62721 = C1402.m5127();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C12919 f62726 = new C12919(0);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f62724 = new ThreadLocal();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC14864 f62729 = new C18616(false);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f62725 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8219 f62733 = new C8219(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f62728 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44910(InterfaceC14864 interfaceC14864) {
        this.f62729 = interfaceC14864;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m44913() {
        this.f62725 = true;
        this.f62729.mo28702();
    }

    /* JADX WARN: Code duplicated, block: B:171:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44909(AbstractC7629 abstractC7629, AbstractC18881 abstractC18881, String[] strArr, String str, InterfaceC0761 interfaceC0761) {
        Throwable th;
        C24320 c24320;
        Exception e;
        C24320 c24321;
        ExecutorService executorService;
        C24320 c24322;
        C24320 c24323;
        AbstractC7629 abstractC76210;
        AtomicReference atomicReference;
        C24320 c24324;
        C12919 c12919 = this.f62726;
        this.f62719 = abstractC7629;
        this.f62730 = abstractC18881;
        this.f62720 = interfaceC0761;
        if (abstractC7629 instanceof AbstractC18881) {
            this.f62723 = ((AbstractC18881) abstractC7629).f61289.f1127 == abstractC18881.f61289.f1127;
        } else {
            this.f62723 = false;
        }
        AbstractC22044 abstractC22044 = null;
        try {
            this.f62732 = Executors.newFixedThreadPool(abstractC18881.m43792());
            this.f62727 = new C3965(abstractC18881);
            C4424 c4424M14051 = C4424.m14051(str, abstractC18881, this.f62729, new C21644(this, interfaceC0761));
            this.f62731 = c4424M14051;
            if (!abstractC18881.f61289.f1125) {
                c4424M14051.m14082();
            }
            if (abstractC7629.mo20841()) {
                AbstractC22044 abstractC22044M49877 = C6382.f21563.m49877();
                try {
                    C3986 c3986 = new C3986();
                    interfaceC0761.setTitle(R.string.MT_Protector);
                    interfaceC0761.mo3125(true);
                    interfaceC0761.mo3126("...");
                    c3986.m12843(abstractC22044M49877, abstractC7629, strArr, new C18660(interfaceC0761));
                    if (interfaceC0761.mo924()) {
                        ExecutorService executorService2 = this.f62732;
                        if (executorService2 != null && !executorService2.isShutdown()) {
                            this.f62732.shutdownNow();
                        }
                        c12919.m31996();
                        abstractC22044M49877.mo4296();
                        return;
                    }
                    c24324 = new C24320(abstractC22044M49877.mo4294());
                    try {
                        this.f62719 = c24324;
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC2386 interfaceC2386 : c24324.mo20830("/", true)) {
                            if (interfaceC2386.isDirectory()) {
                                arrayList.add(interfaceC2386.getPath() + "/");
                            } else {
                                arrayList.add(interfaceC2386.getPath());
                            }
                        }
                        strArr = (String[]) arrayList.toArray(new String[0]);
                        interfaceC0761.mo3125(false);
                        abstractC22044 = abstractC22044M49877;
                        c24323 = c24324;
                        abstractC76210 = c24324;
                    } catch (Exception e2) {
                        e = e2;
                        abstractC22044 = abstractC22044M49877;
                        c24321 = c24324;
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC22044 = abstractC22044M49877;
                        c24320 = c24324;
                        executorService = this.f62732;
                        if (executorService != null) {
                            this.f62732.shutdownNow();
                        }
                        c12919.m31996();
                        if (abstractC22044 != null) {
                            abstractC22044.mo4296();
                        }
                        if (c24320 != null) {
                            C20244.m46520(c24320);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c24324 = null;
                } catch (Throwable th3) {
                    th = th3;
                    c24324 = null;
                }
                abstractC22044 = abstractC22044M49877;
                c24321 = c24324;
                try {
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c24322 = c24321;
                    c24320 = c24322;
                    executorService = this.f62732;
                    if (executorService != null && !executorService.isShutdown()) {
                        this.f62732.shutdownNow();
                    }
                    c12919.m31996();
                    if (abstractC22044 != null) {
                        abstractC22044.mo4296();
                    }
                    if (c24320 != null) {
                        C20244.m46520(c24320);
                    }
                    throw th;
                }
            }
            c24323 = null;
            abstractC76210 = abstractC7629;
            try {
                if (this.f62725 && this.f62723) {
                    this.f62731.m14075(strArr, abstractC18881, interfaceC0761);
                    Iterator it = this.f62731.m14080().iterator();
                    while (it.hasNext()) {
                        Object objM18620 = ((AbstractC6662) it.next()).m18620();
                        if (objM18620 instanceof String) {
                            this.f62721.add((String) objM18620);
                        }
                    }
                } else {
                    this.f62731.m14073(strArr, abstractC76210, abstractC18881, interfaceC0761);
                }
                interfaceC0761.setTitle(this.f62725 ? R.string.MT_Protector : R.string.MT_Protector);
                interfaceC0761.mo12113(this.f62731);
                interfaceC0761.mo12114();
                c12919.m31997();
                Iterator it2 = this.f62731.m14079().iterator();
                while (it2.hasNext()) {
                    m44899((AbstractC6662) it2.next());
                }
                this.f62732.shutdown();
                while (true) {
                    ExecutorService executorService3 = this.f62732;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    boolean zAwaitTermination = executorService3.awaitTermination(1L, timeUnit);
                    atomicReference = this.f62722;
                    if (zAwaitTermination) {
                        break;
                    }
                    if (interfaceC0761.mo924() || atomicReference.get() != null) {
                        this.f62732.awaitTermination(3L, timeUnit);
                        break;
                    }
                }
                if (interfaceC0761.mo924()) {
                    ExecutorService executorService4 = this.f62732;
                    if (executorService4 != null && !executorService4.isShutdown()) {
                        this.f62732.shutdownNow();
                    }
                    c12919.m31996();
                    if (abstractC22044 != null) {
                        abstractC22044.mo4296();
                    }
                    if (c24323 != null) {
                        C20244.m46520(c24323);
                        return;
                    }
                    return;
                }
                if (atomicReference.get() != null) {
                    Exception exc = (Exception) atomicReference.get();
                    C22327.m50389(exc);
                    throw exc;
                }
                if (this.f62725) {
                    if (abstractC76210 instanceof C11969) {
                        Iterator it3 = this.f62731.m14079().iterator();
                        while (it3.hasNext()) {
                            C19495.m45016((AbstractC6662) it3.next());
                            if (interfaceC0761.mo924()) {
                                ExecutorService executorService5 = this.f62732;
                                if (executorService5 != null && !executorService5.isShutdown()) {
                                    this.f62732.shutdownNow();
                                }
                                c12919.m31996();
                                if (abstractC22044 != null) {
                                    abstractC22044.mo4296();
                                }
                                if (c24323 != null) {
                                    C20244.m46520(c24323);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (abstractC76210 instanceof AbstractC18881) {
                        AbstractC18881 abstractC18882 = (AbstractC18881) abstractC76210;
                        Iterator it4 = this.f62731.m14079().iterator();
                        while (it4.hasNext()) {
                            m44900(abstractC18882, (AbstractC6662) it4.next());
                            if (interfaceC0761.mo924()) {
                                ExecutorService executorService6 = this.f62732;
                                if (executorService6 != null && !executorService6.isShutdown()) {
                                    this.f62732.shutdownNow();
                                }
                                c12919.m31996();
                                if (abstractC22044 != null) {
                                    abstractC22044.mo4296();
                                }
                                if (c24323 != null) {
                                    C20244.m46520(c24323);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Iterator it5 = this.f62734.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC23228) it5.next()).run();
                    if (interfaceC0761.mo924()) {
                        ExecutorService executorService7 = this.f62732;
                        if (executorService7 != null && !executorService7.isShutdown()) {
                            this.f62732.shutdownNow();
                        }
                        c12919.m31996();
                        if (abstractC22044 != null) {
                            abstractC22044.mo4296();
                        }
                        if (c24323 != null) {
                            C20244.m46520(c24323);
                            return;
                        }
                        return;
                    }
                }
                ExecutorService executorService8 = this.f62732;
                if (executorService8 != null && !executorService8.isShutdown()) {
                    this.f62732.shutdownNow();
                }
                c12919.m31996();
                if (abstractC22044 != null) {
                    abstractC22044.mo4296();
                }
                if (c24323 != null) {
                    C20244.m46520(c24323);
                }
            } catch (Exception e4) {
                e = e4;
                c24321 = c24323;
            } catch (Throwable th5) {
                th = th5;
                c24322 = c24323;
                c24320 = c24322;
                executorService = this.f62732;
                if (executorService != null) {
                    this.f62732.shutdownNow();
                }
                c12919.m31996();
                if (abstractC22044 != null) {
                    abstractC22044.mo4296();
                }
                if (c24320 != null) {
                    C20244.m46520(c24320);
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            c24321 = null;
        } catch (Throwable th6) {
            th = th6;
            c24320 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44900(AbstractC18881 abstractC18881, AbstractC6662 abstractC6662) {
        if (abstractC6662.m18625()) {
            String str = abstractC6662.m18604() + "/";
            Iterator it = this.f62728.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return;
                }
            }
            C20832 c20832Mo18607 = abstractC6662.mo18607();
            if (c20832Mo18607.m47636()) {
                Iterator it2 = c20832Mo18607.m47638().iterator();
                while (it2.hasNext()) {
                    m44900(abstractC18881, (AbstractC6662) it2.next());
                }
            } else {
                this.f62720.setTitle(R.string.MT_Protector);
                this.f62720.mo3126(abstractC6662.m18624());
                C21402.m48669(abstractC18881, c20832Mo18607);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m44906(AbstractC6662 abstractC6662) {
        AbstractC7629 abstractC7629 = this.f62719;
        if (abstractC7629 instanceof C11969) {
            abstractC6662.m18615().mo4296();
        } else if (abstractC7629 instanceof AbstractC18881) {
            ((AbstractC18881) abstractC7629).m43791(abstractC6662.m18604(), false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m44912() {
        return this.f62719;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 m44911() {
        return this.f62730;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m44908() {
        return this.f62721;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44899(final AbstractC6662 abstractC6662) {
        this.f62732.submit(new Runnable() { // from class: l.ۘ᩺۫
            @Override // java.lang.Runnable
            public final void run() {
                C19406.m44902(this.f16052, abstractC6662);
            }
        });
        if (abstractC6662.m18625()) {
            Iterator it = abstractC6662.mo18607().m47638().iterator();
            while (it.hasNext()) {
                m44899((AbstractC6662) it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0267 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0279 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0109 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0130 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0170 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0176 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e6 A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ef A[Catch: all -> 0x02b9, Exception -> 0x02bb, TryCatch #0 {Exception -> 0x02bb, blocks: (B:15:0x0048, B:17:0x004c, B:19:0x0050, B:20:0x0058, B:22:0x005e, B:24:0x006a, B:26:0x0070, B:27:0x007f, B:29:0x0085, B:31:0x008b, B:33:0x0093, B:35:0x0097, B:37:0x00a0, B:39:0x00ac, B:40:0x00c6, B:42:0x00d3, B:44:0x00d9, B:46:0x00e8, B:47:0x00eb, B:49:0x00ef, B:51:0x00f7, B:52:0x0103, B:54:0x0109, B:56:0x0111, B:58:0x0115, B:60:0x0121, B:61:0x0130, B:63:0x0147, B:65:0x014d, B:67:0x015c, B:68:0x015f, B:70:0x0163, B:72:0x016b, B:73:0x0170, B:75:0x0176, B:77:0x0184, B:79:0x0188, B:81:0x0194, B:94:0x01e0, B:96:0x01e6, B:82:0x01a2, B:84:0x01b9, B:86:0x01bf, B:88:0x01ce, B:89:0x01d1, B:91:0x01d5, B:93:0x01dd, B:97:0x01ef, B:99:0x01f7, B:101:0x01fb, B:103:0x022e, B:104:0x023d, B:106:0x0249, B:108:0x0251, B:110:0x0259, B:111:0x0267, B:113:0x0279, B:115:0x0281), top: B:142:0x0048, outer: #2 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44902(final C19406 c19406, final AbstractC6662 abstractC6662) {
        int i;
        String strM18626;
        String strMo35577;
        AbstractC18881 abstractC18881;
        int i2;
        String strM18627;
        AbstractC18881 abstractC18882;
        int i3;
        final String strM18628;
        AbstractC18881 abstractC18883;
        int i4;
        ArrayList arrayList = c19406.f62728;
        AtomicReference atomicReference = c19406.f62722;
        if (c19406.f62720.mo924() || atomicReference.get() != null) {
            abstractC6662.m18640();
            return;
        }
        c19406.f62724.set(abstractC6662.m18624());
        c19406.f62720.setName(abstractC6662.m18624());
        abstractC6662.m18606();
        if (c19406.f62719 instanceof C11969) {
            String strM18604 = abstractC6662.m18604();
            if (C14584.m35214(strM18604) || C14584.m35210(strM18604)) {
                i = 292;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        try {
            try {
                if (c19406.f62725 && c19406.f62723) {
                    String strM18605 = abstractC6662.m18604();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (strM18605.startsWith((String) it.next())) {
                                if (!abstractC6662.m18625()) {
                                    long jM18622 = abstractC6662.m18622();
                                    c19406.f62733.mo12170(jM18622, jM18622, jM18622, 0L);
                                }
                            }
                        } else if (abstractC6662.m18625()) {
                            if (!abstractC6662.m18630()) {
                                strM18628 = abstractC6662.m18626();
                                if (c19406.f62725) {
                                    c19406.f62730.mo35582(strM18628);
                                    if (!c19406.f62720.mo924()) {
                                        abstractC18883 = c19406.f62730;
                                        i4 = i | abstractC6662.m18628().f22123;
                                        if (abstractC18883.mo35583()) {
                                            abstractC18883.mo43669(i4, strM18628);
                                        }
                                    }
                                    if (c19406.f62718) {
                                        c19406.f62734.add(new InterfaceC23228() { // from class: l.ܰ᩺۫
                                            @Override // l.InterfaceC23228
                                            public final void run() {
                                                C19406.m44901(this.f48761, strM18628, abstractC6662);
                                            }
                                        });
                                    }
                                } else {
                                    c19406.f62730.mo35582(strM18628);
                                    if (!c19406.f62720.mo924()) {
                                        abstractC18883 = c19406.f62730;
                                        i4 = i | abstractC6662.m18628().f22123;
                                        if (abstractC18883.mo35583()) {
                                            abstractC18883.mo43669(i4, strM18628);
                                        }
                                    }
                                    if (c19406.f62718) {
                                        c19406.f62734.add(new InterfaceC23228() { // from class: l.ܰ᩺۫
                                            @Override // l.InterfaceC23228
                                            public final void run() {
                                                C19406.m44901(this.f48761, strM18628, abstractC6662);
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (!abstractC6662.m18630()) {
                            strM18627 = abstractC6662.m18626();
                            if (!c19406.f62725) {
                                c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18627, false, c19406.f62733);
                                if (!c19406.f62720.mo924()) {
                                    abstractC18882 = c19406.f62730;
                                    i3 = i | abstractC6662.m18628().f22123;
                                    if (abstractC18882.mo35583()) {
                                        abstractC18882.mo43669(i3, strM18627);
                                    }
                                }
                                if (c19406.f62725) {
                                    c19406.m44906(abstractC6662);
                                }
                            } else {
                                c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18627, false, c19406.f62733);
                                if (!c19406.f62720.mo924()) {
                                    abstractC18882 = c19406.f62730;
                                    i3 = i | abstractC6662.m18628().f22123;
                                    if (abstractC18882.mo35583()) {
                                        abstractC18882.mo43669(i3, strM18627);
                                    }
                                }
                                if (c19406.f62725) {
                                    c19406.m44906(abstractC6662);
                                }
                            }
                        } else if (abstractC6662.m18639()) {
                            strMo35577 = c19406.f62730.mo35577(abstractC6662.m18626());
                            if (!c19406.f62725) {
                                c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strMo35577, false, c19406.f62733);
                                if (!c19406.f62720.mo924()) {
                                    abstractC18881 = c19406.f62730;
                                    i2 = i | abstractC6662.m18628().f22123;
                                    if (abstractC18881.mo35583()) {
                                        abstractC18881.mo43669(i2, strMo35577);
                                    }
                                }
                                if (c19406.f62725) {
                                    c19406.m44906(abstractC6662);
                                }
                            } else {
                                c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strMo35577, false, c19406.f62733);
                                if (!c19406.f62720.mo924()) {
                                    abstractC18881 = c19406.f62730;
                                    i2 = i | abstractC6662.m18628().f22123;
                                    if (abstractC18881.mo35583()) {
                                        abstractC18881.mo43669(i2, strMo35577);
                                    }
                                }
                                if (c19406.f62725) {
                                    c19406.m44906(abstractC6662);
                                }
                            }
                            if (abstractC6662.m18620() != null) {
                                abstractC6662.m18638(C11293.m28558(strMo35577));
                            }
                        } else {
                            strM18626 = abstractC6662.m18626();
                            if (c19406.f62725) {
                                c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18626, false, c19406.f62733);
                                if (c19406.f62725) {
                                    c19406.m44906(abstractC6662);
                                }
                            } else {
                                c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18626, false, c19406.f62733);
                                if (c19406.f62725) {
                                    c19406.m44906(abstractC6662);
                                }
                            }
                        }
                    }
                } else if (abstractC6662.m18625()) {
                    if (!abstractC6662.m18630()) {
                        strM18628 = abstractC6662.m18626();
                        if (c19406.f62725 || !c19406.f62723) {
                            c19406.f62730.mo35582(strM18628);
                            if (!c19406.f62720.mo924() && abstractC6662.m18628() != null) {
                                abstractC18883 = c19406.f62730;
                                i4 = i | abstractC6662.m18628().f22123;
                                if (abstractC18883.mo35583()) {
                                    try {
                                        abstractC18883.mo43669(i4, strM18628);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            if (c19406.f62718 && c19406.f62730.mo35574()) {
                                c19406.f62734.add(new InterfaceC23228() { // from class: l.ܰ᩺۫
                                    @Override // l.InterfaceC23228
                                    public final void run() {
                                        C19406.m44901(this.f48761, strM18628, abstractC6662);
                                    }
                                });
                            }
                        } else {
                            AbstractC18881 abstractC18884 = c19406.f62730;
                            abstractC18884.getClass();
                            if ((abstractC18884 instanceof C22302) || !c19406.f62730.mo43670(abstractC6662.m18604(), strM18628)) {
                                c19406.f62730.mo35582(strM18628);
                                if (!c19406.f62720.mo924()) {
                                    abstractC18883 = c19406.f62730;
                                    i4 = i | abstractC6662.m18628().f22123;
                                    if (abstractC18883.mo35583()) {
                                        abstractC18883.mo43669(i4, strM18628);
                                    }
                                }
                                if (c19406.f62718) {
                                    c19406.f62734.add(new InterfaceC23228() { // from class: l.ܰ᩺۫
                                        @Override // l.InterfaceC23228
                                        public final void run() {
                                            C19406.m44901(this.f48761, strM18628, abstractC6662);
                                        }
                                    });
                                }
                            } else {
                                arrayList.add(abstractC6662.m18604() + "/");
                            }
                        }
                    }
                } else if (!abstractC6662.m18630()) {
                    strM18627 = abstractC6662.m18626();
                    if (!c19406.f62725 && c19406.f62723 && c19406.f62730.mo43670(abstractC6662.m18604(), strM18627)) {
                        long jM18623 = abstractC6662.m18622();
                        c19406.f62733.mo12170(jM18623, jM18623, jM18623, 0L);
                    } else {
                        c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18627, false, c19406.f62733);
                        if (!c19406.f62720.mo924() && abstractC6662.m18628() != null) {
                            abstractC18882 = c19406.f62730;
                            i3 = i | abstractC6662.m18628().f22123;
                            if (abstractC18882.mo35583()) {
                                try {
                                    abstractC18882.mo43669(i3, strM18627);
                                } catch (IOException unused2) {
                                }
                            }
                        }
                        if (c19406.f62725 && !c19406.f62720.mo924()) {
                            c19406.m44906(abstractC6662);
                        }
                    }
                } else if (abstractC6662.m18639()) {
                    strMo35577 = c19406.f62730.mo35577(abstractC6662.m18626());
                    if (!c19406.f62725 && c19406.f62723 && c19406.f62730.mo43670(abstractC6662.m18604(), strMo35577)) {
                        long jM18624 = abstractC6662.m18622();
                        c19406.f62733.mo12170(jM18624, jM18624, jM18624, 0L);
                    } else {
                        c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strMo35577, false, c19406.f62733);
                        if (!c19406.f62720.mo924() && abstractC6662.m18628() != null) {
                            abstractC18881 = c19406.f62730;
                            i2 = i | abstractC6662.m18628().f22123;
                            if (abstractC18881.mo35583()) {
                                try {
                                    abstractC18881.mo43669(i2, strMo35577);
                                } catch (IOException unused3) {
                                }
                            }
                        }
                        if (c19406.f62725 && !c19406.f62720.mo924()) {
                            c19406.m44906(abstractC6662);
                        }
                    }
                    if (abstractC6662.m18620() != null) {
                        abstractC6662.m18638(C11293.m28558(strMo35577));
                    }
                } else {
                    strM18626 = abstractC6662.m18626();
                    if (c19406.f62725 || !c19406.f62723) {
                        c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18626, false, c19406.f62733);
                        if (c19406.f62725 && !c19406.f62720.mo924()) {
                            c19406.m44906(abstractC6662);
                        }
                    } else {
                        String strM28556 = C11293.m28556(strM18626);
                        String str = C22313.m50375(System.currentTimeMillis()) + Long.toString(((long) strM18626.hashCode()) & 4294967295L, 16) + ".tmp";
                        if (strM28556 != null) {
                            str = strM28556 + str;
                        }
                        if (c19406.f62730.mo43670(abstractC6662.m18604(), str) && c19406.f62730.m43791(strM18626, false) && c19406.f62730.mo43670(str, strM18626)) {
                            long jM18625 = abstractC6662.m18622();
                            c19406.f62733.mo12170(jM18625, jM18625, jM18625, 0L);
                        } else {
                            c19406.f62727.m12712(c19406.f62719, abstractC6662.m18604(), strM18626, false, c19406.f62733);
                            if (c19406.f62725) {
                                c19406.m44906(abstractC6662);
                            }
                        }
                    }
                }
                abstractC6662.m18640();
                if (c19406.f62720.mo924()) {
                    return;
                }
                c19406.f62731.m6376();
                if (abstractC6662.m18620() != null) {
                    c19406.f62721.add((String) abstractC6662.m18620());
                }
                c19406.f62720.mo12113(c19406.f62731);
                c19406.f62720.setProgress(c19406.f62731.m6380());
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                abstractC6662.m18640();
            }
        } catch (Throwable th) {
            abstractC6662.m18640();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44901(C19406 c19406, String str, AbstractC6662 abstractC6662) {
        try {
            if (c19406.f62730.mo35574()) {
                c19406.f62730.mo43668(abstractC6662.m18627(), str);
            }
        } catch (Exception unused) {
        }
    }
}
