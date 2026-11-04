package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 76HC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12152 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39062 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f39063 = C16980.m40037(C12152.class);

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "UsageInfoVisitor";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        C25278 c25278;
        C25160 c25160M8523;
        C4306 c4306M17719 = c1610.m5681().m17719();
        InterfaceC24444 interfaceC24444M13733 = c4306M17719.m13733(c1610);
        if (interfaceC24444M13733 != null) {
            try {
                m30360(interfaceC24444M13733);
                return;
            } catch (Exception e) {
                f39063.mo13724("Failed to apply cached usage data", (Throwable) e);
            }
        }
        final C23341 c23341 = new C23341(c1610);
        for (C24927 c24927 : (ArrayList) c1610.m5680()) {
            c23341.m52510(c24927, c24927.m55553());
            Iterator it = c24927.m55564().iterator();
            while (it.hasNext()) {
                c23341.m52510(c24927, (AbstractC1566) it.next());
            }
            Iterator it2 = c24927.m55566().iterator();
            while (it2.hasNext()) {
                c23341.m52510(c24927, (AbstractC1566) it2.next());
            }
            Iterator it3 = c24927.getFields().iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                c25278 = C25278.f81639;
                if (!zHasNext) {
                    break;
                }
                C17467 c17467 = (C17467) it3.next();
                c23341.m52510(c24927, c17467.getType());
                m30357(c17467, (C3648) c17467.mo17862(c25278), c23341);
            }
            m30357(c24927, (C3648) c24927.mo17862(c25278), c23341);
            for (final C2551 c2551 : c24927.getMethods()) {
                m30357(c2551, (C3648) c2551.mo17862(c25278), c23341);
                C23786 c23786 = (C23786) c2551.mo17862(C25278.f81645);
                if (c23786 != null) {
                    Iterator it4 = ((ArrayList) c23786.m53057()).iterator();
                    while (it4.hasNext()) {
                        m30357(c2551, (C3648) it4.next(), c23341);
                    }
                }
                c23341.m52502(c2551, c2551.mo8519());
                Iterator it5 = c2551.mo8537().iterator();
                while (it5.hasNext()) {
                    c23341.m52502(c2551, (AbstractC1566) it5.next());
                }
                try {
                    if (!c2551.m8524() && (c25160M8523 = c2551.m8523()) != null) {
                        final C1610 c1610Mo8527 = c2551.mo8527();
                        c25160M8523.m56075(new Consumer() { // from class: l.ۗۚ᩵
                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void n(Object obj) {
                                C12152.m30356((InterfaceC7377) obj, c2551, c1610Mo8527, c23341);
                            }

                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C12312.$default$andThen(this, consumer);
                            }
                        });
                    }
                } catch (Exception e2) {
                    C23977.m53506(c2551, "Dependency scan failed", e2);
                }
            }
        }
        c4306M17719.m13734(c1610, c23341);
        m30360(c23341);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30360(InterfaceC24444 interfaceC24444) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((C23341) interfaceC24444).m52501();
        InterfaceC25186 interfaceC25186 = f39063;
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13716(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "Apply usage data in {}ms");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30356(InterfaceC7377 interfaceC7377, C2551 c2551, C1610 c1610, C23341 c23341) {
        try {
            m30361(interfaceC7377, c2551, c1610, c23341);
        } catch (Exception e) {
            throw new C8597("Usage info collection failed with error: " + e.getMessage() + " at insn: " + interfaceC7377, e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30361(InterfaceC7377 interfaceC7377, C2551 c2551, C1610 c1610, C23341 c23341) {
        InterfaceC13890 interfaceC13890Mo20256;
        InterfaceC7925 interfaceC7925Mo20255;
        InterfaceC13890 interfaceC13890Mo5148;
        if (interfaceC7377.mo20254() == EnumC5052.UNKNOWN) {
            return;
        }
        int i = C20357.f65295[interfaceC7377.mo20259().ordinal()];
        if (i == 1) {
            interfaceC7377.mo20260();
            c23341.m52502(c2551, AbstractC1566.m5535(interfaceC7377.mo20257()));
            return;
        }
        if (i == 2) {
            interfaceC7377.mo20260();
            C17467 c17467M5670 = c1610.m5670(C14022.m34143(c1610, interfaceC7377.mo20253()));
            if (c17467M5670 != null) {
                c23341.m52504(c2551, c17467M5670);
                return;
            }
            return;
        }
        if (i == 3) {
            interfaceC7377.mo20260();
            InterfaceC11017 interfaceC11017Mo20263 = interfaceC7377.mo20263();
            if (interfaceC11017Mo20263 != null) {
                interfaceC13890Mo20256 = (InterfaceC13890) interfaceC11017Mo20263;
            } else {
                interfaceC13890Mo20256 = interfaceC7377.mo20256();
            }
            C21965 c21965M49693 = C21965.m49693(c1610, interfaceC13890Mo20256);
            C2551 c2551M5668 = c1610.m5668(c21965M49693);
            if (c2551M5668 != null) {
                c23341.m52503(c2551, c2551M5668);
                return;
            } else {
                c23341.m52505(c2551, c21965M49693);
                return;
            }
        }
        if (i != 4) {
            return;
        }
        interfaceC7377.mo20260();
        InterfaceC8670 interfaceC8670 = null;
        if (interfaceC7377.mo20259() != EnumC14088.CALL_SITE) {
            interfaceC7925Mo20255 = null;
        } else {
            InterfaceC11017 interfaceC11017Mo20264 = interfaceC7377.mo20263();
            if (interfaceC11017Mo20264 != null) {
                interfaceC7925Mo20255 = (InterfaceC7925) interfaceC11017Mo20264;
            } else {
                interfaceC7925Mo20255 = interfaceC7377.mo20255();
            }
        }
        if (interfaceC7925Mo20255 != null) {
            List listMo2889 = interfaceC7925Mo20255.mo2889();
            if (4 < listMo2889.size()) {
                C15580 c15580 = (C15580) listMo2889.get(4);
                if (c15580.m37317() == EnumC23040.ENCODED_METHOD_HANDLE) {
                    interfaceC8670 = (InterfaceC8670) c15580.m37318();
                }
            }
        }
        if (interfaceC8670 == null || (interfaceC13890Mo5148 = interfaceC8670.mo5148()) == null) {
            return;
        }
        C21965 c21965M49694 = C21965.m49693(c1610, interfaceC13890Mo5148);
        C2551 c2551M5669 = c1610.m5668(c21965M49694);
        if (c2551M5669 != null) {
            c23341.m52503(c2551, c2551M5669);
        } else {
            c23341.m52505(c2551, c21965M49694);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30357(InterfaceC20451 interfaceC20451, C3648 c3648, C23341 c23341) {
        if (c3648 == null || c3648.m11821()) {
            return;
        }
        Iterator it = c3648.m11822().iterator();
        while (it.hasNext()) {
            m30358(interfaceC20451, (InterfaceC13343) it.next(), c23341);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30358(InterfaceC20451 interfaceC20451, InterfaceC13343 interfaceC13343, C23341 c23341) {
        c23341.m52507(interfaceC20451, AbstractC1566.m5535(interfaceC13343.mo17110()));
        Iterator it = interfaceC13343.mo17112().values().iterator();
        while (it.hasNext()) {
            m30359(interfaceC20451, (C15580) it.next(), c23341);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30359(InterfaceC20451 interfaceC20451, C15580 c15580, C23341 c23341) {
        Object objM37318 = c15580.m37318();
        int i = C20357.f65294[c15580.m37317().ordinal()];
        if (i == 1) {
            c23341.m52507(interfaceC20451, AbstractC1566.m5535((String) objM37318));
            return;
        }
        if (i == 2 || i == 3) {
            if (objM37318 instanceof InterfaceC1213) {
                c23341.m52508(interfaceC20451, C14022.m34143(interfaceC20451.mo8527(), (InterfaceC1213) objM37318));
                return;
            } else {
                if (!(objM37318 instanceof C14022)) {
                    throw new C8597(C24966.m55772(C15580.class, "Unexpected field type class: "));
                }
                c23341.m52508(interfaceC20451, (C14022) objM37318);
                return;
            }
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            m30358(interfaceC20451, (InterfaceC13343) objM37318, c23341);
        } else {
            Iterator it = ((List) objM37318).iterator();
            while (it.hasNext()) {
                m30359(interfaceC20451, (C15580) it.next(), c23341);
            }
        }
    }
}
