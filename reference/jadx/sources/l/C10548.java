package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۤ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes3.dex */
public class C10548 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HashSet f36115 = new HashSet(Arrays.asList("decode_J", "decode_I", "decode_S", "decode_B"));

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Comparator f36114 = new C8431();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6188 f36117 = new C6188();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4652 f36128 = new C4652();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13120 f36123 = new C13120();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15237 f36118 = new C15237();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16772 f36121 = new C16772();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20176 f36129 = new C20176();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20300 f36124 = new C20300();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4091 f36122 = new C4091();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21711 f36119 = new C21711();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C11004 f36125 = new C11004();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1830 f36126 = new C1830();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14532 f36127 = new C14532();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22292 f36116 = new C22292();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23828 f36120 = new C23828();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m26688(int i) {
        int i2 = i & (-33);
        if ((i & 2) != 0) {
            return i & (-38);
        }
        return (i & 4) != 0 ? i & (-34) : i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m26698(int i) {
        int i2 = i & 7;
        if ((i2 & (i2 - 1)) != 0) {
            i ^= 7;
        }
        return i & (~((i & 256) != 0 ? 512 : 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26691(String str) {
        return C14172.m34263(str).m34266();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26695(List list, AbstractC9812 abstractC9812) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4756 c4756 = (C4756) it.next();
            m26696(abstractC9812, c4756.f16752, c4756.f16753);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26696(AbstractC9812 abstractC9812, String str, Object obj) {
        if (obj instanceof Object[]) {
            AbstractC9812 abstractC9812Mo10175 = abstractC9812.mo10175(str);
            if (abstractC9812Mo10175 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m26696(abstractC9812Mo10175, (String) null, obj2);
                }
                abstractC9812Mo10175.mo10177();
                return;
            }
            return;
        }
        if (obj instanceof C13930) {
            C13930 c13930 = (C13930) obj;
            AbstractC9812 abstractC9812Mo10176 = abstractC9812.mo10176(str, c13930.f45873);
            if (abstractC9812Mo10176 != null) {
                for (C4756 c4756 : c13930.f45871) {
                    m26696(abstractC9812Mo10176, c4756.f16752, c4756.f16753);
                }
                abstractC9812Mo10176.mo10177();
                return;
            }
            return;
        }
        if (obj instanceof C9449) {
            C9449 c9449 = (C9449) obj;
            abstractC9812.mo10180(str, c9449.m24203(), c9449.m24202());
        } else {
            if (obj instanceof C1686) {
                abstractC9812.mo10179(C14172.m34263(((C1686) obj).f6677), str);
                return;
            }
            if (obj instanceof C3097) {
                System.err.println("WARN: ignored method annotation value");
            } else if (obj == null) {
                System.err.println("WARN: ignored null annotation value");
            } else {
                abstractC9812.mo10179(obj, str);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ad  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v46 l.ￛﾠￜﾺ￡ﾩﾸ, still in use, count: 2, list:
          (r9v46 l.ￛﾠￜﾺ￡ﾩﾸ) from 0x0139: IGET (r9v46 l.ￛﾠￜﾺ￡ﾩﾸ) A[WRAPPED] (LINE:82) l.ￛﾠￜﾺ￡ﾩﾸ.ￜﾽ l.ￛﾗￛﾟ￡ﾩﾸ
          (r9v46 l.ￛﾠￜﾺ￡ﾩﾸ) from 0x0149: PHI (r9 I:??) = (r9v37 l.ￛﾠￜﾺ￡ﾩﾸ), (r9v46 l.ￛﾠￜﾺ￡ﾩﾸ) binds: [B:73:0x0148, B:432:0x0149] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26702(l.C18162 r20, l.C11813 r21, l.InterfaceC15487 r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instruction units count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10548.m26702(l.ᩳܺ᩸, l.ۨܺ᩸, l.ܶ᩷᩸, java.util.HashMap):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26703(final C18162 c18162, final InterfaceC15487 interfaceC15487, final C8516 c8516) {
        ArrayList<C11813> arrayList = c18162.f58052;
        if (arrayList != null) {
            final HashMap map = new HashMap();
            for (C11813 c11813 : arrayList) {
                C19720 c19720M26694 = m26694(map, c11813.f39682);
                c19720M26694.f63287 = (c19720M26694.f63287 & (-1537)) | c11813.f39686;
                ArrayList<C13930> arrayList2 = c11813.f39689;
                if (arrayList2 != null) {
                    for (C13930 c13930 : arrayList2) {
                        if (c13930.f45872 == EnumC11959.SYSTEM) {
                            String str = c13930.f45873;
                            str.getClass();
                            switch (str) {
                                case "Ldalvik/annotation/InnerClass;":
                                    for (C4756 c4756 : c13930.f45871) {
                                        String str2 = c4756.f16752;
                                        Object obj = c4756.f16753;
                                        if ("accessFlags".equals(str2)) {
                                            c19720M26694.f63287 |= ((Integer) obj).intValue() & (-1537);
                                        } else if ("name".equals(c4756.f16752)) {
                                            c19720M26694.f63286 = (String) obj;
                                        }
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingClass;":
                                    C19720 c19720M26695 = m26694(map, ((C1686) m26690(c13930, b.d)).f6677);
                                    c19720M26694.f63290 = c19720M26695;
                                    c19720M26695.m44843(c19720M26694);
                                    break;
                                case "Ldalvik/annotation/MemberClasses;":
                                    for (Object obj2 : (Object[]) m26690(c13930, b.d)) {
                                        C19720 c19720M26696 = m26694(map, ((C1686) obj2).f6677);
                                        c19720M26694.m44843(c19720M26696);
                                        c19720M26696.f63290 = c19720M26694;
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingMethod;":
                                    C3097 c3097 = (C3097) m26690(c13930, b.d);
                                    C19720 c19720M26697 = m26694(map, c3097.m9294());
                                    c19720M26694.f63290 = c19720M26697;
                                    c19720M26694.f63289 = c3097;
                                    c19720M26697.m44843(c19720M26694);
                                    break;
                            }
                        }
                    }
                }
            }
            ArrayList<Future> arrayList3 = new ArrayList(arrayList.size());
            final AtomicReference atomicReference = new AtomicReference();
            for (final C11813 c11814 : arrayList) {
                arrayList3.add(C4716.f16633.submit(new Runnable() { // from class: l.᩸᩷᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10548 c10548 = this.f70891;
                        C18162 c18163 = c18162;
                        C11813 c11815 = c11814;
                        InterfaceC15487 interfaceC15488 = interfaceC15487;
                        HashMap map2 = map;
                        C8516 c8517 = c8516;
                        if (c8517.m22244()) {
                            return;
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        if (atomicReference2.get() != null) {
                            return;
                        }
                        c8517.m22242(1);
                        try {
                            c10548.m26702(c18163, c11815, interfaceC15488, map2);
                        } catch (Throwable th) {
                            atomicReference2.set(th);
                            throw th;
                        }
                    }
                }));
            }
            for (Future future : arrayList3) {
                if (c8516.m22244()) {
                    future.cancel(true);
                } else {
                    while (true) {
                        try {
                            try {
                                future.get(500L, TimeUnit.MILLISECONDS);
                                break;
                            } catch (TimeoutException unused) {
                                if (c8516.m22244()) {
                                    future.cancel(true);
                                    break;
                                }
                            }
                        } catch (InterruptedException unused2) {
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            if (cause instanceof RuntimeException) {
                                throw ((RuntimeException) cause);
                            }
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26697(String str, boolean z) {
        if (str == null) {
            return false;
        }
        try {
            C13236 c13236 = new C13236(str);
            C6885 c6885 = new C6885();
            if (z) {
                c13236.m32718(c6885);
                return false;
            }
            c13236.m32717(c6885);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m26689(Object obj) {
        if (obj instanceof C1686) {
            return C14172.m34263(((C1686) obj).f6677);
        }
        if (obj instanceof C4902) {
            return m26693((C4902) obj);
        }
        return obj instanceof C14076 ? C14172.m34258(((C14076) obj).m34049()) : obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19110 m26693(C4902 c4902) {
        switch (c4902.m13626()) {
            case 0:
                return new C19110(4, m26691(c4902.m13625().m24204()), c4902.m13625().m24202(), c4902.m13625().m24203(), false);
            case 1:
                return new C19110(2, m26691(c4902.m13625().m24204()), c4902.m13625().m24202(), c4902.m13625().m24203(), false);
            case 2:
                return new C19110(3, m26691(c4902.m13625().m24204()), c4902.m13625().m24202(), c4902.m13625().m24203(), false);
            case 3:
                return new C19110(1, m26691(c4902.m13625().m24204()), c4902.m13625().m24202(), c4902.m13625().m24203(), false);
            case 4:
                return new C19110(6, m26691(c4902.m13627().m9294()), c4902.m13627().m9295(), c4902.m13627().m9292(), false);
            case 5:
                return new C19110(5, m26691(c4902.m13627().m9294()), c4902.m13627().m9295(), c4902.m13627().m9292(), false);
            case 6:
                return new C19110(8, m26691(c4902.m13627().m9294()), c4902.m13627().m9295(), c4902.m13627().m9292(), false);
            case 7:
                return new C19110(7, m26691(c4902.m13627().m9294()), c4902.m13627().m9295(), c4902.m13627().m9292(), false);
            case 8:
                return new C19110(9, m26691(c4902.m13627().m9294()), c4902.m13627().m9295(), c4902.m13627().m9292(), true);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo26699(C8285 c8285, AbstractC20521 abstractC20521, C9137 c9137) {
        C9116 c9116M11841 = new C4196().m11841((c8285.f28775 & 8) != 0, c8285.f28776, c8285.f28773);
        mo26700(c9116M11841);
        mo26701(c9116M11841, abstractC20521, c9137);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m26690(C13930 c13930, String str) {
        for (C4756 c4756 : c13930.f45871) {
            if (c4756.f16752.equals(str)) {
                return c4756.f16753;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19720 m26694(HashMap map, String str) {
        C19720 c19720 = (C19720) map.get(str);
        if (c19720 != null) {
            return c19720;
        }
        C19720 c19721 = new C19720(str);
        map.put(str, c19721);
        return c19721;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo26701(C9116 c9116, AbstractC20521 abstractC20521, C9137 c9137) {
        C23248 c23248 = new C23248();
        c23248.m51304(c9137);
        c23248.m51303(c9116);
        c23248.m51305(abstractC20521);
        c23248.m51302();
        abstractC20521.mo35170(-1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo26700(C9116 c9116) {
        C16067.m38070(c9116);
        this.f36124.getClass();
        C20300.m45813(c9116);
        C15237 c15237 = this.f36118;
        c15237.m36506(c9116);
        C13120 c13120 = this.f36123;
        c13120.m32477(c9116);
        this.f36126.m5983(c9116);
        if (this.f36116.m49460(c9116)) {
            C20300.m45813(c9116);
            c15237.m36506(c9116);
            c13120.m32477(c9116);
        }
        this.f36128.getClass();
        C4652.m12844(c9116);
        this.f36122.m11631(c9116);
        this.f36119.m48450(c9116);
        this.f36120.m52505(c9116);
        this.f36127.m34969(c9116);
        C20300.m45813(c9116);
        c15237.m36506(c9116);
        c13120.m32477(c9116);
        this.f36129.getClass();
        C20176.m45603(c9116);
        this.f36125.getClass();
        C11004.m27752(c9116);
        this.f36121.getClass();
        C16772.m39332(c9116);
        this.f36117.m17188(c9116);
    }
}
