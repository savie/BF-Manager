package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LIWJ */
/* JADX INFO: loaded from: classes.dex */
public final class C25336 extends AbstractC16700 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f81805 = C16980.m40037(C25336.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f81806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashSet f81807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1345 f81808;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        C24927 c24927M5671 = c1610.m5671(C1345.m4955(c1610, AbstractC1566.m5538("kotlin.jvm.internal.Intrinsics")));
        if (c24927M5671 == null) {
            ArrayList arrayList = new ArrayList();
            for (C24927 c24927 : (ArrayList) c1610.m5680()) {
                C1345 c1345M55571 = c24927.m55571();
                if (!c1345M55571.m4965().equals("Intrinsics") || !c1345M55571.m4959().equals("kotlin.jvm.internal.Intrinsics")) {
                    if (c1345M55571.m4957().startsWith("kotlin.jvm.internal.") && c24927.getMethods().size() >= 5) {
                        int i = 0;
                        for (C2551 c2551 : c24927.getMethods()) {
                            if (c2551.mo8547().m26540() && c2551.mo8532().m49701().endsWith("(Ljava/lang/Object;Ljava/lang/String;)V")) {
                                i++;
                            }
                        }
                        if (i > 2) {
                        }
                    }
                }
                arrayList.add(c24927);
            }
            c24927M5671 = (C24927) C4123.m13219((List) arrayList);
        }
        InterfaceC25186 interfaceC25186 = f81805;
        if (c24927M5671 != null) {
            this.f81808 = c24927M5671.m55571();
            HashSet hashSet = new HashSet();
            for (C2551 c2552 : c24927M5671.getMethods()) {
                if (c2552.mo8547().m26540()) {
                    String strM49701 = c2552.mo8532().m49701();
                    if (strM49701.endsWith("(Ljava/lang/Object;Ljava/lang/String;)V") || strM49701.endsWith("(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V")) {
                        hashSet.add(c2552.mo8532());
                    }
                }
            }
            this.f81807 = hashSet;
            interfaceC25186.mo13701("Kotlin Intrinsics class: {}, methods: {}", c24927M5671, Integer.valueOf(hashSet.size()));
        } else {
            this.f81808 = null;
            interfaceC25186.mo13721("Kotlin Intrinsics class not found");
        }
        this.f81806 = c1610.m5681().m17715() == EnumC12094.APPLY_AND_HIDE;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        if (this.f81808 == null) {
            return false;
        }
        for (C2551 c2551 : c24927.getMethods()) {
            if (!c2551.m8524() && !c2551.mo17867(C11457.f36007)) {
                Iterator it = c2551.m8508().iterator();
                while (it.hasNext()) {
                    for (C18959 c18959 : (ArrayList) ((C21943) it.next()).mo1986()) {
                        if (c18959.getType() == EnumC24203.INVOKE) {
                            try {
                                m56618(c2551, c18959);
                            } catch (Exception e) {
                                c2551.m31134("Failed to extract var names", e);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56618(C2551 c2551, C18959 c18959) {
        String strM56617;
        int iM44039 = c18959.m44039();
        if (iM44039 < 2) {
            return;
        }
        if (this.f81807.contains(((C21219) c18959).mo18926())) {
            boolean zM56619 = false;
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
            abstractC16481Mo44035.getClass();
            if (abstractC16481Mo44035 instanceof C6041) {
                C6041 c6041 = (C6041) abstractC16481Mo44035;
                if (iM44039 == 2) {
                    String strM56618 = m56617(c2551, c18959, 1);
                    if (strM56618 != null) {
                        zM56619 = m56619(c6041, strM56618);
                    }
                } else if (iM44039 == 3 && (strM56617 = m56617(c2551, c18959, 2)) != null) {
                    zM56619 = m56619(c6041, strM56617);
                }
                if (zM56619 && this.f81806) {
                    c18959.mo17866(EnumC1763.DONT_GENERATE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m56617(C2551 c2551, C18959 c18959, int i) {
        AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(i);
        abstractC16481Mo44035.getClass();
        if (!(abstractC16481Mo44035 instanceof C17227)) {
            return null;
        }
        C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
        EnumC24203 type = c18959M40461.getType();
        if (type == EnumC24203.CONST_STR) {
            return ((C5557) c18959M40461).getString();
        }
        if (type != EnumC24203.SGET) {
            return null;
        }
        C17467 c17467M5670 = c2551.mo8527().m5670((C14022) ((C3319) c18959M40461).m10937());
        if (c17467M5670 == null) {
            return null;
        }
        String str = (String) ((C15580) c17467M5670.mo17862(C25278.f81643)).m37318();
        c18959.mo14762(abstractC16481Mo44035, AbstractC16481.m39112(new C5557(str)));
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56619(C6041 c6041, String str) {
        if (str.startsWith("$this$")) {
            str = str.substring(6);
        } else if (str.startsWith("$")) {
            str = str.substring(1);
        }
        if (!C13534.m33239(str)) {
            return false;
        }
        c6041.m17530().m41945().m28506(str);
        return true;
    }
}
