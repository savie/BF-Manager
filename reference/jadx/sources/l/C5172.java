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

/* JADX INFO: renamed from: l.ۙ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes2.dex */
public class C5172 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final HashSet f18055 = new HashSet(Arrays.asList("decode_J", "decode_I", "decode_S", "decode_B"));

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Comparator f18054 = new C8397();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25112 f18068 = new C25112();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12431 f18062 = new C12431();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C0499 f18058 = new C0499();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1245 f18056 = new C1245();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5720 f18060 = new C5720();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15349 f18069 = new C15349();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15414 f18067 = new C15414();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7892 f18059 = new C7892(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9579 f18057 = new C9579(2);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16841 f18064 = new C16841();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23555 f18063 = new C23555(2);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16095 f18065 = new C16095(2);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21382 f18061 = new C21382(2);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17652 f18066 = new C17652(2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15591(int i) {
        int i2 = i & (-33);
        if ((i & 2) != 0) {
            return i & (-38);
        }
        return (i & 4) != 0 ? i & (-34) : i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m15601(int i) {
        int i2 = i & 7;
        if ((i2 & (i2 - 1)) != 0) {
            i ^= 7;
        }
        return i & (~((i & 256) != 0 ? 512 : 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15594(String str) {
        return C3105.m10130(str).m10142();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15598(List list, AbstractC3301 abstractC3301) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20834 c20834 = (C20834) it.next();
            m15599(abstractC3301, c20834.f66712, c20834.f66713);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15599(AbstractC3301 abstractC3301, String str, Object obj) {
        if (obj instanceof Object[]) {
            AbstractC3301 abstractC3301Mo7993 = abstractC3301.mo7993(str);
            if (abstractC3301Mo7993 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m15599(abstractC3301Mo7993, (String) null, obj2);
                }
                abstractC3301Mo7993.mo7995();
                return;
            }
            return;
        }
        if (obj instanceof C12629) {
            C12629 c12629 = (C12629) obj;
            AbstractC3301 abstractC3301Mo7994 = abstractC3301.mo7994(str, c12629.f40537);
            if (abstractC3301Mo7994 != null) {
                for (C20834 c20834 : c12629.f40535) {
                    m15599(abstractC3301Mo7994, c20834.f66712, c20834.f66713);
                }
                abstractC3301Mo7994.mo7995();
                return;
            }
            return;
        }
        if (obj instanceof C23315) {
            C23315 c23315 = (C23315) obj;
            abstractC3301.mo7997(str, c23315.m52461(), c23315.m52460());
        } else {
            if (obj instanceof C15855) {
                abstractC3301.mo7996(C3105.m10130(((C15855) obj).f51558), str);
                return;
            }
            if (obj instanceof C3177) {
                System.err.println("WARN: ignored method annotation value");
            } else if (obj == null) {
                System.err.println("WARN: ignored null annotation value");
            } else {
                abstractC3301.mo7996(obj, str);
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v46 l.ￛﾠ￡ﾩﾷￜﾶ, still in use, count: 2, list:
          (r9v46 l.ￛﾠ￡ﾩﾷￜﾶ) from 0x0139: IGET (r9v46 l.ￛﾠ￡ﾩﾷￜﾶ) A[WRAPPED] (LINE:82) l.ￛﾠ￡ﾩﾷￜﾶ.￡ﾩﾸ l.ￛﾗￛﾙￜﾶ
          (r9v46 l.ￛﾠ￡ﾩﾷￜﾶ) from 0x0149: PHI (r9 I:??) = (r9v37 l.ￛﾠ￡ﾩﾷￜﾶ), (r9v46 l.ￛﾠ￡ﾩﾷￜﾶ) binds: [B:73:0x0148, B:432:0x0149] A[DONT_GENERATE, DONT_INLINE]
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
    public final void m15603(l.C9645 r20, l.C6664 r21, l.InterfaceC9888 r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instruction units count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5172.m15603(l.ۡ᩷ܶ, l.ۛ᩷ܶ, l.ۢۙܶ, java.util.HashMap):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15604(final C9645 c9645, final InterfaceC9888 interfaceC9888, final C3374 c3374) {
        ArrayList<C6664> arrayList = c9645.f31177;
        if (arrayList != null) {
            final HashMap map = new HashMap();
            for (C6664 c6664 : arrayList) {
                C6906 c6906M15597 = m15597(map, c6664.f22223);
                c6906M15597.f22894 = (c6906M15597.f22894 & (-1537)) | c6664.f22221;
                ArrayList<C12629> arrayList2 = c6664.f22227;
                if (arrayList2 != null) {
                    for (C12629 c12629 : arrayList2) {
                        if (c12629.f40536 == EnumC6161.SYSTEM) {
                            String str = c12629.f40537;
                            str.getClass();
                            switch (str) {
                                case "Ldalvik/annotation/InnerClass;":
                                    for (C20834 c20834 : c12629.f40535) {
                                        String str2 = c20834.f66712;
                                        Object obj = c20834.f66713;
                                        if ("accessFlags".equals(str2)) {
                                            c6906M15597.f22894 |= ((Integer) obj).intValue() & (-1537);
                                        } else if ("name".equals(c20834.f66712)) {
                                            c6906M15597.f22899 = (String) obj;
                                        }
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingClass;":
                                    C6906 c6906M15598 = m15597(map, ((C15855) m15593(c12629, b.d)).f51558);
                                    c6906M15597.f22898 = c6906M15598;
                                    c6906M15598.m19159(c6906M15597);
                                    break;
                                case "Ldalvik/annotation/MemberClasses;":
                                    for (Object obj2 : (Object[]) m15593(c12629, b.d)) {
                                        C6906 c6906M15599 = m15597(map, ((C15855) obj2).f51558);
                                        c6906M15597.m19159(c6906M15599);
                                        c6906M15599.f22898 = c6906M15597;
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingMethod;":
                                    C3177 c3177 = (C3177) m15593(c12629, b.d);
                                    C6906 c6906M155910 = m15597(map, c3177.m10371());
                                    c6906M15597.f22898 = c6906M155910;
                                    c6906M15597.f22895 = c3177;
                                    c6906M155910.m19159(c6906M15597);
                                    break;
                            }
                        }
                    }
                }
            }
            ArrayList<Future> arrayList3 = new ArrayList(arrayList.size());
            final AtomicReference atomicReference = new AtomicReference();
            for (final C6664 c6665 : arrayList) {
                arrayList3.add(C5261.f18537.submit(new Runnable() { // from class: l.֨ۙܶ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5172 c5172 = this.f3471;
                        C9645 c9646 = c9645;
                        C6664 c6666 = c6665;
                        InterfaceC9888 interfaceC9889 = interfaceC9888;
                        HashMap map2 = map;
                        C3374 c3375 = c3374;
                        if (c3375.m11081()) {
                            return;
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        if (atomicReference2.get() != null) {
                            return;
                        }
                        c3375.m11079(1);
                        try {
                            c5172.m15603(c9646, c6666, interfaceC9889, map2);
                        } catch (Throwable th) {
                            atomicReference2.set(th);
                            throw th;
                        }
                    }
                }));
            }
            for (Future future : arrayList3) {
                if (c3374.m11081()) {
                    future.cancel(true);
                } else {
                    while (true) {
                        try {
                            try {
                                future.get(500L, TimeUnit.MILLISECONDS);
                                break;
                            } catch (TimeoutException unused) {
                                if (c3374.m11081()) {
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
    public static boolean m15600(String str, boolean z) {
        if (str == null) {
            return false;
        }
        try {
            C18767 c18767 = new C18767(str);
            C0868 c0868 = new C0868();
            if (z) {
                c18767.m43563(c0868);
                return false;
            }
            c18767.m43562(c0868);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m15592(Object obj) {
        if (obj instanceof C15855) {
            return C3105.m10130(((C15855) obj).f51558);
        }
        if (obj instanceof C20331) {
            return m15596((C20331) obj);
        }
        return obj instanceof C12126 ? C3105.m10136(((C12126) obj).m30290()) : obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4597 m15596(C20331 c20331) {
        switch (c20331.m46708()) {
            case 0:
                return new C4597(4, m15594(c20331.m46707().m52462()), c20331.m46707().m52460(), c20331.m46707().m52461(), false);
            case 1:
                return new C4597(2, m15594(c20331.m46707().m52462()), c20331.m46707().m52460(), c20331.m46707().m52461(), false);
            case 2:
                return new C4597(3, m15594(c20331.m46707().m52462()), c20331.m46707().m52460(), c20331.m46707().m52461(), false);
            case 3:
                return new C4597(1, m15594(c20331.m46707().m52462()), c20331.m46707().m52460(), c20331.m46707().m52461(), false);
            case 4:
                return new C4597(6, m15594(c20331.m46709().m10371()), c20331.m46709().m10374(), c20331.m46709().m10370(), false);
            case 5:
                return new C4597(5, m15594(c20331.m46709().m10371()), c20331.m46709().m10374(), c20331.m46709().m10370(), false);
            case 6:
                return new C4597(8, m15594(c20331.m46709().m10371()), c20331.m46709().m10374(), c20331.m46709().m10370(), false);
            case 7:
                return new C4597(7, m15594(c20331.m46709().m10371()), c20331.m46709().m10374(), c20331.m46709().m10370(), false);
            case 8:
                return new C4597(9, m15594(c20331.m46709().m10371()), c20331.m46709().m10374(), c20331.m46709().m10370(), true);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo15602(C8900 c8900, AbstractC15037 abstractC15037, C13617 c13617) {
        C13791 c13791M1560 = new C0194().m1560((c8900.f29080 & 8) != 0, c8900.f29084, c8900.f29081);
        mo15605(c13791M1560);
        mo15606(c13791M1560, abstractC15037, c13617);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m15593(C12629 c12629, String str) {
        for (C20834 c20834 : c12629.f40535) {
            if (c20834.f66712.equals(str)) {
                return c20834.f66713;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6906 m15597(HashMap map, String str) {
        C6906 c6906 = (C6906) map.get(str);
        if (c6906 != null) {
            return c6906;
        }
        C6906 c6907 = new C6906(str);
        map.put(str, c6907);
        return c6907;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo15606(C13791 c13791, AbstractC15037 abstractC15037, C13617 c13617) {
        C18839 c18839 = new C18839();
        c18839.m43702(c13617);
        c18839.m43703(c13791);
        c18839.m43704(abstractC15037);
        c18839.m43701();
        abstractC15037.mo10807(-1, -1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo15605(C13791 c13791) {
        C19890.m45788(c13791);
        this.f18067.getClass();
        C15414.m36893(c13791);
        C1245 c1245 = this.f18056;
        c1245.m4499(c13791);
        C0499 c0499 = this.f18058;
        c0499.m2459(c13791);
        this.f18063.m52756(c13791);
        if (this.f18061.m48620(c13791)) {
            C15414.m36893(c13791);
            c1245.m4499(c13791);
            c0499.m2459(c13791);
        }
        this.f18062.getClass();
        C12431.m30909(c13791);
        this.f18059.m21432(c13791);
        this.f18057.m25022(c13791);
        this.f18066.m41310(c13791);
        this.f18065.m38250(c13791);
        C15414.m36893(c13791);
        c1245.m4499(c13791);
        c0499.m2459(c13791);
        this.f18069.getClass();
        C15349.m36789(c13791);
        this.f18064.getClass();
        C16841.m39751(c13791);
        this.f18060.getClass();
        C5720.m16759(c13791);
        this.f18068.m55983(c13791);
    }
}
