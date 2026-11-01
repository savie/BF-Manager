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

/* JADX INFO: renamed from: l.ܽ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 88AQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16943 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ExecutorService f54148;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20471 f54150;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f54152;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC9677 f54153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21026 f54156;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7293 f54157;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f54160;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f54149 = C16737.m39280();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final List f54163 = C11445.m28558();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f54154 = new AtomicReference();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f54155 = C11445.m28558();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16842 f54158 = new C16842(0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f54147 = new ThreadLocal();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC16088 f54151 = new C16608(false);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f54162 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0714 f54159 = new C0714(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f54161 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39671(InterfaceC16088 interfaceC16088) {
        this.f54151 = interfaceC16088;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m39668() {
        this.f54162 = true;
        this.f54151.mo11427();
    }

    /* JADX WARN: Code duplicated, block: B:171:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:178:0x02bf  */
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
    public final void m39670(AbstractC9677 abstractC9677, AbstractC12233 abstractC12233, String[] strArr, String str, InterfaceC20471 interfaceC20471) {
        Throwable th;
        C8289 c8289;
        Exception e;
        C8289 c82810;
        ExecutorService executorService;
        C8289 c82811;
        C8289 c82812;
        AbstractC9677 abstractC9678;
        AtomicReference atomicReference;
        C8289 c82813;
        C16842 c16842 = this.f54158;
        this.f54153 = abstractC9677;
        this.f54160 = abstractC12233;
        this.f54150 = interfaceC20471;
        if (abstractC9677 instanceof AbstractC12233) {
            this.f54152 = ((AbstractC12233) abstractC9677).f40874.f40385 == abstractC12233.f40874.f40385;
        } else {
            this.f54152 = false;
        }
        AbstractC20745 abstractC20745 = null;
        try {
            this.f54148 = Executors.newFixedThreadPool(abstractC12233.m30349());
            this.f54157 = new C7293(abstractC12233);
            C21026 c21026M47355 = C21026.m47355(str, abstractC12233, this.f54151, new C21176(this, interfaceC20471));
            this.f54156 = c21026M47355;
            if (!abstractC12233.f40874.f40387) {
                c21026M47355.m47389();
            }
            if (abstractC9677.mo24621()) {
                AbstractC20745 abstractC20745M46728 = C11904.f39941.m46728();
                try {
                    C18396 c18396 = new C18396();
                    interfaceC20471.setTitle(R.string.MT_Protector);
                    interfaceC20471.mo24049(true);
                    interfaceC20471.mo24051("...");
                    c18396.m42675(abstractC20745M46728, abstractC9677, strArr, new C16238(interfaceC20471));
                    if (interfaceC20471.mo2357()) {
                        ExecutorService executorService2 = this.f54148;
                        if (executorService2 != null && !executorService2.isShutdown()) {
                            this.f54148.shutdownNow();
                        }
                        c16842.m39498();
                        abstractC20745M46728.mo24647();
                        return;
                    }
                    c82813 = new C8289(abstractC20745M46728.mo33986());
                    try {
                        this.f54153 = c82813;
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC2557 interfaceC2557 : c82813.mo10263("/", true)) {
                            if (interfaceC2557.isDirectory()) {
                                arrayList.add(interfaceC2557.getPath() + "/");
                            } else {
                                arrayList.add(interfaceC2557.getPath());
                            }
                        }
                        strArr = (String[]) arrayList.toArray(new String[0]);
                        interfaceC20471.mo24049(false);
                        abstractC20745 = abstractC20745M46728;
                        c82812 = c82813;
                        abstractC9678 = c82813;
                    } catch (Exception e2) {
                        e = e2;
                        abstractC20745 = abstractC20745M46728;
                        c82810 = c82813;
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC20745 = abstractC20745M46728;
                        c8289 = c82813;
                        executorService = this.f54148;
                        if (executorService != null) {
                            this.f54148.shutdownNow();
                        }
                        c16842.m39498();
                        if (abstractC20745 != null) {
                            abstractC20745.mo24647();
                        }
                        if (c8289 != null) {
                            C19431.m44468(c8289);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c82813 = null;
                } catch (Throwable th3) {
                    th = th3;
                    c82813 = null;
                }
                abstractC20745 = abstractC20745M46728;
                c82810 = c82813;
                try {
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    c82811 = c82810;
                    c8289 = c82811;
                    executorService = this.f54148;
                    if (executorService != null && !executorService.isShutdown()) {
                        this.f54148.shutdownNow();
                    }
                    c16842.m39498();
                    if (abstractC20745 != null) {
                        abstractC20745.mo24647();
                    }
                    if (c8289 != null) {
                        C19431.m44468(c8289);
                    }
                    throw th;
                }
            }
            c82812 = null;
            abstractC9678 = abstractC9677;
            try {
                if (this.f54162 && this.f54152) {
                    this.f54156.m47382(strArr, abstractC12233, interfaceC20471);
                    Iterator it = this.f54156.m47388().iterator();
                    while (it.hasNext()) {
                        Object objM26372 = ((AbstractC10444) it.next()).m26372();
                        if (objM26372 instanceof String) {
                            this.f54155.add((String) objM26372);
                        }
                    }
                } else {
                    this.f54156.m47380(strArr, abstractC9678, abstractC12233, interfaceC20471);
                }
                interfaceC20471.setTitle(this.f54162 ? R.string.MT_Protector : R.string.MT_Protector);
                interfaceC20471.mo24047(this.f54156);
                interfaceC20471.mo24050();
                c16842.m39499();
                Iterator it2 = this.f54156.m47385().iterator();
                while (it2.hasNext()) {
                    m39660((AbstractC10444) it2.next());
                }
                this.f54148.shutdown();
                while (true) {
                    ExecutorService executorService3 = this.f54148;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    boolean zAwaitTermination = executorService3.awaitTermination(1L, timeUnit);
                    atomicReference = this.f54154;
                    if (zAwaitTermination) {
                        break;
                    }
                    if (interfaceC20471.mo2357() || atomicReference.get() != null) {
                        this.f54148.awaitTermination(3L, timeUnit);
                        break;
                    }
                }
                if (interfaceC20471.mo2357()) {
                    ExecutorService executorService4 = this.f54148;
                    if (executorService4 != null && !executorService4.isShutdown()) {
                        this.f54148.shutdownNow();
                    }
                    c16842.m39498();
                    if (abstractC20745 != null) {
                        abstractC20745.mo24647();
                    }
                    if (c82812 != null) {
                        C19431.m44468(c82812);
                        return;
                    }
                    return;
                }
                if (atomicReference.get() != null) {
                    throw ((Exception) atomicReference.get());
                }
                if (this.f54162) {
                    if (abstractC9678 instanceof C21611) {
                        Iterator it3 = this.f54156.m47385().iterator();
                        while (it3.hasNext()) {
                            C2267.m6948((AbstractC10444) it3.next());
                            if (interfaceC20471.mo2357()) {
                                ExecutorService executorService5 = this.f54148;
                                if (executorService5 != null && !executorService5.isShutdown()) {
                                    this.f54148.shutdownNow();
                                }
                                c16842.m39498();
                                if (abstractC20745 != null) {
                                    abstractC20745.mo24647();
                                }
                                if (c82812 != null) {
                                    C19431.m44468(c82812);
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (abstractC9678 instanceof AbstractC12233) {
                        AbstractC12233 abstractC12234 = (AbstractC12233) abstractC9678;
                        Iterator it4 = this.f54156.m47385().iterator();
                        while (it4.hasNext()) {
                            m39661(abstractC12234, (AbstractC10444) it4.next());
                            if (interfaceC20471.mo2357()) {
                                ExecutorService executorService6 = this.f54148;
                                if (executorService6 != null && !executorService6.isShutdown()) {
                                    this.f54148.shutdownNow();
                                }
                                c16842.m39498();
                                if (abstractC20745 != null) {
                                    abstractC20745.mo24647();
                                }
                                if (c82812 != null) {
                                    C19431.m44468(c82812);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                Iterator it5 = this.f54163.iterator();
                while (it5.hasNext()) {
                    ((InterfaceC18725) it5.next()).run();
                    if (interfaceC20471.mo2357()) {
                        ExecutorService executorService7 = this.f54148;
                        if (executorService7 != null && !executorService7.isShutdown()) {
                            this.f54148.shutdownNow();
                        }
                        c16842.m39498();
                        if (abstractC20745 != null) {
                            abstractC20745.mo24647();
                        }
                        if (c82812 != null) {
                            C19431.m44468(c82812);
                            return;
                        }
                        return;
                    }
                }
                ExecutorService executorService8 = this.f54148;
                if (executorService8 != null && !executorService8.isShutdown()) {
                    this.f54148.shutdownNow();
                }
                c16842.m39498();
                if (abstractC20745 != null) {
                    abstractC20745.mo24647();
                }
                if (c82812 != null) {
                    C19431.m44468(c82812);
                }
            } catch (Exception e4) {
                e = e4;
                c82810 = c82812;
            } catch (Throwable th5) {
                th = th5;
                c82811 = c82812;
                c8289 = c82811;
                executorService = this.f54148;
                if (executorService != null) {
                    this.f54148.shutdownNow();
                }
                c16842.m39498();
                if (abstractC20745 != null) {
                    abstractC20745.mo24647();
                }
                if (c8289 != null) {
                    C19431.m44468(c8289);
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            c82810 = null;
        } catch (Throwable th6) {
            th = th6;
            c8289 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39661(AbstractC12233 abstractC12233, AbstractC10444 abstractC10444) {
        if (abstractC10444.m26387()) {
            String str = abstractC10444.m26362() + "/";
            Iterator it = this.f54161.iterator();
            while (it.hasNext()) {
                if (str.startsWith((String) it.next())) {
                    return;
                }
            }
            C19616 c19616Mo23365 = abstractC10444.mo23365();
            if (c19616Mo23365.m44706()) {
                Iterator it2 = c19616Mo23365.m44704().iterator();
                while (it2.hasNext()) {
                    m39661(abstractC12233, (AbstractC10444) it2.next());
                }
            } else {
                this.f54150.setTitle(R.string.MT_Protector);
                this.f54150.mo24051(abstractC10444.m26393());
                C10781.m27079(abstractC12233, c19616Mo23365);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m39667(AbstractC10444 abstractC10444) {
        AbstractC9677 abstractC9677 = this.f54153;
        if (abstractC9677 instanceof C21611) {
            abstractC10444.m26380().mo24647();
        } else if (abstractC9677 instanceof AbstractC12233) {
            ((AbstractC12233) abstractC9677).m30348(abstractC10444.m26362(), false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m39673() {
        return this.f54153;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 m39672() {
        return this.f54160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m39669() {
        return this.f54155;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39660(AbstractC10444 abstractC10444) {
        this.f54148.submit(new RunnableC2503(2, this, abstractC10444));
        if (abstractC10444.m26387()) {
            Iterator it = abstractC10444.mo23365().m44704().iterator();
            while (it.hasNext()) {
                m39660((AbstractC10444) it.next());
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
    public static void m39663(final C16943 c16943, final AbstractC10444 abstractC10444) {
        int i;
        String strM26385;
        String strMo10260;
        AbstractC12233 abstractC12233;
        int i2;
        String strM26386;
        AbstractC12233 abstractC12234;
        int i3;
        final String strM26387;
        AbstractC12233 abstractC12235;
        int i4;
        ArrayList arrayList = c16943.f54161;
        AtomicReference atomicReference = c16943.f54154;
        if (c16943.f54150.mo2357() || atomicReference.get() != null) {
            abstractC10444.m26373();
            return;
        }
        c16943.f54147.set(abstractC10444.m26393());
        c16943.f54150.setName(abstractC10444.m26393());
        abstractC10444.m26391();
        if (c16943.f54153 instanceof C21611) {
            String strM26362 = abstractC10444.m26362();
            if (C5553.m15304(strM26362) || C5553.m15329(strM26362)) {
                i = 292;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        try {
            try {
                if (c16943.f54162 && c16943.f54152) {
                    String strM26363 = abstractC10444.m26362();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (strM26363.startsWith((String) it.next())) {
                                if (!abstractC10444.m26387()) {
                                    long jM26359 = abstractC10444.m26359();
                                    c16943.f54159.mo3130(jM26359, jM26359, jM26359, 0L);
                                }
                            }
                        } else if (abstractC10444.m26387()) {
                            if (!abstractC10444.m26389()) {
                                strM26387 = abstractC10444.m26385();
                                if (c16943.f54162) {
                                    c16943.f54160.mo10268(strM26387);
                                    if (!c16943.f54150.mo2357()) {
                                        abstractC12235 = c16943.f54160;
                                        i4 = i | abstractC10444.m26370().f9657;
                                        if (abstractC12235.mo10277()) {
                                            abstractC12235.mo30346(i4, strM26387);
                                        }
                                    }
                                    if (c16943.f54149) {
                                        c16943.f54163.add(new InterfaceC18725() { // from class: l.۟᩺֨
                                            @Override // l.InterfaceC18725
                                            public final void run() {
                                                C16943.m39662(this.f25630, strM26387, abstractC10444);
                                            }
                                        });
                                    }
                                } else {
                                    c16943.f54160.mo10268(strM26387);
                                    if (!c16943.f54150.mo2357()) {
                                        abstractC12235 = c16943.f54160;
                                        i4 = i | abstractC10444.m26370().f9657;
                                        if (abstractC12235.mo10277()) {
                                            abstractC12235.mo30346(i4, strM26387);
                                        }
                                    }
                                    if (c16943.f54149) {
                                        c16943.f54163.add(new InterfaceC18725() { // from class: l.۟᩺֨
                                            @Override // l.InterfaceC18725
                                            public final void run() {
                                                C16943.m39662(this.f25630, strM26387, abstractC10444);
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (!abstractC10444.m26389()) {
                            strM26386 = abstractC10444.m26385();
                            if (!c16943.f54162) {
                                c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26386, false, c16943.f54159);
                                if (!c16943.f54150.mo2357()) {
                                    abstractC12234 = c16943.f54160;
                                    i3 = i | abstractC10444.m26370().f9657;
                                    if (abstractC12234.mo10277()) {
                                        abstractC12234.mo30346(i3, strM26386);
                                    }
                                }
                                if (c16943.f54162) {
                                    c16943.m39667(abstractC10444);
                                }
                            } else {
                                c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26386, false, c16943.f54159);
                                if (!c16943.f54150.mo2357()) {
                                    abstractC12234 = c16943.f54160;
                                    i3 = i | abstractC10444.m26370().f9657;
                                    if (abstractC12234.mo10277()) {
                                        abstractC12234.mo30346(i3, strM26386);
                                    }
                                }
                                if (c16943.f54162) {
                                    c16943.m39667(abstractC10444);
                                }
                            }
                        } else if (abstractC10444.m26388()) {
                            strMo10260 = c16943.f54160.mo10260(abstractC10444.m26385());
                            if (!c16943.f54162) {
                                c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strMo10260, false, c16943.f54159);
                                if (!c16943.f54150.mo2357()) {
                                    abstractC12233 = c16943.f54160;
                                    i2 = i | abstractC10444.m26370().f9657;
                                    if (abstractC12233.mo10277()) {
                                        abstractC12233.mo30346(i2, strMo10260);
                                    }
                                }
                                if (c16943.f54162) {
                                    c16943.m39667(abstractC10444);
                                }
                            } else {
                                c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strMo10260, false, c16943.f54159);
                                if (!c16943.f54150.mo2357()) {
                                    abstractC12233 = c16943.f54160;
                                    i2 = i | abstractC10444.m26370().f9657;
                                    if (abstractC12233.mo10277()) {
                                        abstractC12233.mo30346(i2, strMo10260);
                                    }
                                }
                                if (c16943.f54162) {
                                    c16943.m39667(abstractC10444);
                                }
                            }
                            if (abstractC10444.m26372() != null) {
                                abstractC10444.m26361(C6730.m18175(strMo10260));
                            }
                        } else {
                            strM26385 = abstractC10444.m26385();
                            if (c16943.f54162) {
                                c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26385, false, c16943.f54159);
                                if (c16943.f54162) {
                                    c16943.m39667(abstractC10444);
                                }
                            } else {
                                c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26385, false, c16943.f54159);
                                if (c16943.f54162) {
                                    c16943.m39667(abstractC10444);
                                }
                            }
                        }
                    }
                } else if (abstractC10444.m26387()) {
                    if (!abstractC10444.m26389()) {
                        strM26387 = abstractC10444.m26385();
                        if (c16943.f54162 || !c16943.f54152) {
                            c16943.f54160.mo10268(strM26387);
                            if (!c16943.f54150.mo2357() && abstractC10444.m26370() != null) {
                                abstractC12235 = c16943.f54160;
                                i4 = i | abstractC10444.m26370().f9657;
                                if (abstractC12235.mo10277()) {
                                    try {
                                        abstractC12235.mo30346(i4, strM26387);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            if (c16943.f54149 && c16943.f54160.mo10271()) {
                                c16943.f54163.add(new InterfaceC18725() { // from class: l.۟᩺֨
                                    @Override // l.InterfaceC18725
                                    public final void run() {
                                        C16943.m39662(this.f25630, strM26387, abstractC10444);
                                    }
                                });
                            }
                        } else {
                            AbstractC12233 abstractC12236 = c16943.f54160;
                            abstractC12236.getClass();
                            if ((abstractC12236 instanceof C3494) || !c16943.f54160.mo30347(abstractC10444.m26362(), strM26387)) {
                                c16943.f54160.mo10268(strM26387);
                                if (!c16943.f54150.mo2357()) {
                                    abstractC12235 = c16943.f54160;
                                    i4 = i | abstractC10444.m26370().f9657;
                                    if (abstractC12235.mo10277()) {
                                        abstractC12235.mo30346(i4, strM26387);
                                    }
                                }
                                if (c16943.f54149) {
                                    c16943.f54163.add(new InterfaceC18725() { // from class: l.۟᩺֨
                                        @Override // l.InterfaceC18725
                                        public final void run() {
                                            C16943.m39662(this.f25630, strM26387, abstractC10444);
                                        }
                                    });
                                }
                            } else {
                                arrayList.add(abstractC10444.m26362() + "/");
                            }
                        }
                    }
                } else if (!abstractC10444.m26389()) {
                    strM26386 = abstractC10444.m26385();
                    if (!c16943.f54162 && c16943.f54152 && c16943.f54160.mo30347(abstractC10444.m26362(), strM26386)) {
                        long jM263510 = abstractC10444.m26359();
                        c16943.f54159.mo3130(jM263510, jM263510, jM263510, 0L);
                    } else {
                        c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26386, false, c16943.f54159);
                        if (!c16943.f54150.mo2357() && abstractC10444.m26370() != null) {
                            abstractC12234 = c16943.f54160;
                            i3 = i | abstractC10444.m26370().f9657;
                            if (abstractC12234.mo10277()) {
                                try {
                                    abstractC12234.mo30346(i3, strM26386);
                                } catch (IOException unused2) {
                                }
                            }
                        }
                        if (c16943.f54162 && !c16943.f54150.mo2357()) {
                            c16943.m39667(abstractC10444);
                        }
                    }
                } else if (abstractC10444.m26388()) {
                    strMo10260 = c16943.f54160.mo10260(abstractC10444.m26385());
                    if (!c16943.f54162 && c16943.f54152 && c16943.f54160.mo30347(abstractC10444.m26362(), strMo10260)) {
                        long jM263511 = abstractC10444.m26359();
                        c16943.f54159.mo3130(jM263511, jM263511, jM263511, 0L);
                    } else {
                        c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strMo10260, false, c16943.f54159);
                        if (!c16943.f54150.mo2357() && abstractC10444.m26370() != null) {
                            abstractC12233 = c16943.f54160;
                            i2 = i | abstractC10444.m26370().f9657;
                            if (abstractC12233.mo10277()) {
                                try {
                                    abstractC12233.mo30346(i2, strMo10260);
                                } catch (IOException unused3) {
                                }
                            }
                        }
                        if (c16943.f54162 && !c16943.f54150.mo2357()) {
                            c16943.m39667(abstractC10444);
                        }
                    }
                    if (abstractC10444.m26372() != null) {
                        abstractC10444.m26361(C6730.m18175(strMo10260));
                    }
                } else {
                    strM26385 = abstractC10444.m26385();
                    if (c16943.f54162 || !c16943.f54152) {
                        c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26385, false, c16943.f54159);
                        if (c16943.f54162 && !c16943.f54150.mo2357()) {
                            c16943.m39667(abstractC10444);
                        }
                    } else {
                        String strM18172 = C6730.m18172(strM26385);
                        String str = C5038.m14058(System.currentTimeMillis()) + Long.toString(((long) strM26385.hashCode()) & 4294967295L, 16) + ".tmp";
                        if (strM18172 != null) {
                            str = strM18172 + str;
                        }
                        if (c16943.f54160.mo30347(abstractC10444.m26362(), str) && c16943.f54160.m30348(strM26385, false) && c16943.f54160.mo30347(str, strM26385)) {
                            long jM263512 = abstractC10444.m26359();
                            c16943.f54159.mo3130(jM263512, jM263512, jM263512, 0L);
                        } else {
                            c16943.f54157.m19444(c16943.f54153, abstractC10444.m26362(), strM26385, false, c16943.f54159);
                            if (c16943.f54162) {
                                c16943.m39667(abstractC10444);
                            }
                        }
                    }
                }
                abstractC10444.m26373();
                if (c16943.f54150.mo2357()) {
                    return;
                }
                c16943.f54156.m10992();
                if (abstractC10444.m26372() != null) {
                    c16943.f54155.add((String) abstractC10444.m26372());
                }
                c16943.f54150.mo24047(c16943.f54156);
                c16943.f54150.setProgress(c16943.f54156.m10996());
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                abstractC10444.m26373();
            }
        } catch (Throwable th) {
            abstractC10444.m26373();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39662(C16943 c16943, String str, AbstractC10444 abstractC10444) {
        try {
            if (c16943.f54160.mo10271()) {
                c16943.f54160.mo30344(abstractC10444.m26392(), str);
            }
        } catch (Exception unused) {
        }
    }
}
