package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0163 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14769 f1187;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1995 f1188;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14769 f1189;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f1190;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18808 f1191;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f1192;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14769 f1193;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Set f1194;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f1195;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11444 f1196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10294 f1197;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14769 f1198;

    public C0163(C18808 c18808, int i, Set set, C10294 c10294) {
        this.f1191 = c18808;
        this.f1196 = new C11444(2);
        this.f1188 = new C1995(1);
        this.f1192 = i;
        if (i != 1) {
            C10294 c10295 = new C10294(c18808.f61095, null);
            this.f1197 = c10295;
            c18808.f61113.m14948(c10295);
        } else {
            C11972.m30021(c10294);
            this.f1197 = c10294;
        }
        this.f1198 = C14769.m35543();
        this.f1189 = C14769.m35543();
        this.f1193 = C14769.m35543();
        this.f1194 = set;
    }

    public C0163(C18808 c18808, C14769 c14769, C14769 c147610, Set set, C10294 c10294) {
        this(c18808, 1, set, c10294);
        this.f1187 = c14769;
        this.f1195 = new HashMap();
        this.f1198 = C18808.m43634(c18808, c14769).m35549(c147610.m35554());
        this.f1189 = C18808.m43615(c18808, c14769);
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C19113 c19113 = (C19113) it.next();
            if (c19113.f61856.mo10886("module-info", EnumC17468.SOURCE) && c19113.f61857.m35550()) {
                for (AbstractC8036 abstractC8036 : c19113.f61857) {
                    if (!abstractC8036.m21911(EnumC21461.f68480)) {
                        if (!abstractC8036.m21911(EnumC21461.f68532)) {
                            break;
                        }
                        c14769M35543 = c14769M35543.m35552(c19113.f61859);
                        break;
                    }
                }
            }
        }
        this.f1193 = c14769M35543.m35554();
        m1379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0163 m1374(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        int i = this.f1192 + 1;
        Set set = this.f1194;
        C18808 c18808 = this.f1191;
        C0163 c0163 = new C0163(c18808, i, set, null);
        m1373();
        HashMap map = this.f1195;
        c0163.f1195 = map;
        C14769 c14769M14940 = c18808.f61113.m14940((Set) linkedHashSet, true);
        C14769 c14769 = this.f1187;
        c14769.getClass();
        C14769 c14769M35549 = c14769M14940.m35549(c14769);
        c0163.f1187 = c14769M35549;
        if (c0163.m1378()) {
            c18808.f61113.m14957(C14769.m35543());
            return c0163;
        }
        c18808.f61113.m14957(c14769M35549);
        c0163.f1187 = c14769M35549;
        c0163.m1372(map);
        C14769<C24550> c14769M1372 = c0163.m1372(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Map) C11392.computeIfAbsent(c0163.f1195, (C2920) entry.getKey(), new C4527(8))).putAll((Map) entry.getValue());
        }
        c0163.f1191.f61113.m14949(c0163.f1187);
        if (c0163.m1378()) {
            return c0163;
        }
        C14769 c14769M43634 = C18808.m43634(c18808, c14769M14940);
        C14769 c14769M35543 = C14769.m35543();
        for (C24550 c24550 : c14769M1372) {
            if (!c24550.f79575.mo10886("package-info", EnumC17468.CLASS) || c24550.m29564().f44617 != c24550) {
                c14769M35543 = c14769M35543.m35552(c24550);
            }
        }
        C14769 c14769M35554 = c14769M35543.m35554();
        c14769M43634.getClass();
        c0163.f1198 = c14769M35554.m35549(c14769M43634);
        C14769 c14769M43615 = C18808.m43615(c18808, c14769M14940);
        C14769 c14769M35544 = C14769.m35543();
        for (C24550 c24551 : c14769M1372) {
            if (c24551.f79575.mo10886("package-info", EnumC17468.CLASS) && c24551.m29564().f44617 == c24551) {
                c14769M35544 = c14769M35544.m35552((C14106) c24551.f38069);
            }
        }
        C14769 c14769M35555 = c14769M35544.m35554();
        c14769M43615.getClass();
        c0163.f1189 = c14769M35555.m35549(c14769M43615);
        c0163.f1193 = C14769.m35543();
        c0163.m1379();
        return c0163;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1375() {
        m1373();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m1378() {
        C18808 c18808 = this.f1191;
        if (c18808.f61118.f56401 > 0) {
            return true;
        }
        for (C17007 c17007 : (C18499) this.f1197.m26550()) {
            int i = C20300.f65160[c17007.mo32404().ordinal()];
            if (i == 1) {
                if (c18808.f61094) {
                    return true;
                }
            } else if (i == 2 && (c18808.f61101 || !c17007.m40083(EnumC6984.RECOVERABLE))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1379() {
        C12095 c12095 = new C12095(this.f1191.f61102);
        this.f1190 = new LinkedHashSet();
        Iterator it = this.f1198.iterator();
        while (it.hasNext()) {
            c12095.m30271((InterfaceC12753) it.next(), (Set) this.f1190);
        }
        Iterator it2 = this.f1189.iterator();
        while (it2.hasNext()) {
            c12095.m30271((InterfaceC12753) it2.next(), (Set) this.f1190);
        }
        Iterator it3 = this.f1193.iterator();
        while (it3.hasNext()) {
            c12095.m30271((InterfaceC12753) it3.next(), (Set) this.f1190);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14769 m1372(HashMap map) {
        C24550 c24550M35517;
        C14769 c14769M35543 = C14769.m35543();
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                C18808 c18808 = this.f1191;
                C15252 c15252 = c18808.f61119;
                AbstractC19728 abstractC19728M51194 = c15252.f49864.m51194((String) entry2.getKey());
                InterfaceC15976 interfaceC15976 = (InterfaceC15976) entry2.getValue();
                EnumC17468 enumC17468Mo10885 = interfaceC15976.mo10885();
                EnumC17468 enumC17468 = EnumC17468.CLASS;
                if (enumC17468Mo10885 != enumC17468) {
                    throw new AssertionError(interfaceC15976);
                }
                if (interfaceC15976.mo10886("package-info", enumC17468)) {
                    C14106 c14106M35529 = c18808.f61120.m35529((C2920) entry.getKey(), abstractC19728M51194.m45429(0, abstractC19728M51194.m45427((byte) 46)));
                    if (c14106M35529.f44617 == null) {
                        c14106M35529.f44617 = c18808.f61120.m35518((C2920) entry.getKey(), C21901.m49594(abstractC19728M51194), c14106M35529);
                    }
                    c24550M35517 = c14106M35529.f44617;
                    c24550M35517.m54833();
                    if (c24550M35517.f79575 == null) {
                        c24550M35517.f79575 = interfaceC15976;
                    }
                    c24550M35517.f38070 = c18808.f61098;
                } else {
                    c24550M35517 = c18808.f61120.m35517((C2920) entry.getKey(), abstractC19728M51194);
                    c24550M35517.m54833();
                    c24550M35517.f79575 = interfaceC15976;
                    c24550M35517.f38070 = c18808.f61098;
                    AbstractC11781 abstractC11781 = c24550M35517.f38069;
                    if (abstractC11781.f38066 == EnumC13603.f43219) {
                        abstractC11781.mo29571().mo7481(c24550M35517);
                    }
                }
                c14769M35543 = c14769M35543.m35552(c24550M35517);
            }
        }
        return c14769M35543.m35554();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1377(boolean z, boolean z2) {
        C10294 c10294 = this.f1197;
        C14769 c14769 = this.f1198;
        C18808 c18808 = this.f1191;
        boolean z3 = c18808.f61096;
        C7312 c7312 = c18808.f61095;
        if (z3 || c18808.f61121) {
            C14769 c14769M35543 = z ? C14769.m35543() : c14769;
            Object obj = z ? Collections.EMPTY_SET : this.f1190;
            c7312.m20047("x.print.rounds", Integer.valueOf(this.f1192), "{" + c14769M35543.m35545(", ") + l.d, obj, Boolean.valueOf(z));
        }
        if (!c18808.f61093.m29927()) {
            c18808.f61093.m29928(new C3975(EnumC24113.ANNOTATION_PROCESSING_ROUND));
        }
        try {
            if (z) {
                c18808.f61100.getClass();
                C9857 c9857 = new C9857(true, z2, Collections.EMPTY_SET, c18808);
                C24030 c24030 = c18808.f61114;
                c24030.getClass();
                for (C18062 c18062 : c24030.f77746) {
                    if (c18062.f59132) {
                        C18808.m43619(c24030.f77747, c18062.f59135, c9857);
                    }
                }
            } else {
                C18808.m43618(c18808, this.f1190, c14769, this.f1189, this.f1193);
            }
            if (c18808.f61093.m29927()) {
                return;
            }
            c18808.f61093.m29926(new C3975(EnumC24113.ANNOTATION_PROCESSING_ROUND));
        } catch (Throwable th) {
            try {
                c10294.m26551(new C1995(1));
                c7312.m20036(c10294);
                c18808.f61113.m14948((C10294) null);
                throw th;
            } catch (Throwable th2) {
                if (!c18808.f61093.m29927()) {
                    c18808.f61093.m29926(new C3975(EnumC24113.ANNOTATION_PROCESSING_ROUND));
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1376(boolean z) {
        Predicate predicate;
        if (z) {
            predicate = this.f1188;
        } else {
            predicate = this.f1196;
        }
        C10294 c10294 = this.f1197;
        c10294.m26551(predicate);
        C18808 c18808 = this.f1191;
        c18808.f61095.m20036(c10294);
        c18808.f61113.m14948((C10294) null);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m1373() {
        Set set;
        C18808 c18808 = this.f1191;
        Iterator it = c18808.f61090.m37799().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            set = this.f1194;
            if (!zHasNext) {
                break;
            } else {
                set.add(((C3168) it.next()).f10275);
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            c18808.f61116.mo5474((C19113) it2.next());
        }
        c18808.f61117.m49974();
        c18808.f61090.m37797();
        c18808.f61100.m55303();
        c18808.f61118.f56401 = 0;
        c18808.f61113.m14959();
        c18808.f61103.m45778();
        c18808.f61105.m55109();
        c18808.f61108.m29006();
        c18808.f61102.m8323();
        C14764 c14764 = c18808.f61120;
        c14764.getClass();
        Iterator itM22793 = C8475.m22793(c14764.f48246.values(), new C8195(9));
        while (itM22793.hasNext()) {
            if (((C24550) itM22793.next()).f38066 == EnumC13603.f43208) {
                C14764 c14765 = c18808.f61120;
                c14765.getClass();
                Iterator itM22794 = C8475.m22793(c14765.f48246.values(), new C8195(9));
                while (itM22794.hasNext()) {
                    C24550 c24550 = (C24550) itM22794.next();
                    if (c24550.f79575 != null || c24550.f38066 == EnumC13603.f43208) {
                        EnumC13603 enumC13603 = c24550.f38066;
                        c24550.m54833();
                        if (enumC13603 == EnumC13603.f43208) {
                            c24550.f38067 = new C10510(c24550, c24550.f38067.mo23449(), null);
                        }
                        if (c24550.f38070.mo11630()) {
                            c24550.f38070 = c18808.f61098;
                        }
                    }
                }
                return;
            }
        }
    }
}
