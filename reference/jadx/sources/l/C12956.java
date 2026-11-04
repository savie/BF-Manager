package l;

import com.umeng.analytics.pro.am;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.۫۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12956 extends AbstractC16245 implements InterfaceC10718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1770 f41524;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3261 f41525;

    public C12956(InterfaceC1770 interfaceC1770) {
        this.f41524 = interfaceC1770;
        this.f41525 = ((C15939) interfaceC1770).mo6222();
    }

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo19443() {
        Class[] clsArr = {C14753.class, C8042.class, C14974.class, C3567.class, C20721.class, C18483.class, C19229.class, C16466.class, C9532.class, C2821.class, C14007.class, C19450.class, C1330.class, C21467.class, C11245.class, C24672.class, C12516.class, C10278.class, C12737.class, C0584.class};
        HashSet hashSet = new HashSet(20);
        for (int i = 0; i < 20; i++) {
            Class cls = clsArr[i];
            C17359.requireNonNull(cls);
            if (!hashSet.add(cls)) {
                throw new IllegalArgumentException(C24966.m55772(cls, "duplicate element: "));
            }
        }
        return C4681.unmodifiableSet(hashSet);
    }

    @Override // l.InterfaceC10718
    /* JADX INFO: renamed from: ۙ */
    public final void mo19442(AbstractC4534 abstractC4534) {
        abstractC4534.mo2667(this);
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7350(C14753 c14753) {
        mo32343(c14753);
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7342(C8042 c8042) {
        String str = am.aG + c8042.m21914();
        C3261 c3261 = this.f41525;
        c3261.m10647();
        c3261.m10649(str, m32340(c8042, str, Collections.EMPTY_MAP), false);
        mo32343(c8042);
        c3261.m10650("/" + str);
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7339(C3567 c3567) {
        C3261 c3261 = this.f41525;
        c3261.m10647();
        c3261.m10649("blockquote", m32340(c3567, "blockquote", Collections.EMPTY_MAP), false);
        c3261.m10647();
        mo32343(c3567);
        c3261.m10647();
        c3261.m10650("/blockquote");
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7353(C18483 c18483) {
        String strM43077 = c18483.m43077();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM43073 = c18483.m43073();
        if (strM43073 != null && !strM43073.isEmpty()) {
            int iIndexOf = strM43073.indexOf(" ");
            if (iIndexOf != -1) {
                strM43073 = strM43073.substring(0, iIndexOf);
            }
            linkedHashMap.put(Name.LABEL, "language-" + strM43073);
        }
        m32341(strM43077, c18483, linkedHashMap);
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7354(C19229 c19229) {
        C3261 c3261 = this.f41525;
        c3261.m10647();
        c3261.m10648(c19229.m44559());
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7352(C16466 c16466) {
        C3261 c3261 = this.f41525;
        c3261.m10647();
        c3261.m10649("hr", m32340(c16466, "hr", Collections.EMPTY_MAP), true);
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7344(C9532 c9532) {
        m32341(c9532.m24945(), c9532, Collections.EMPTY_MAP);
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7338(C2821 c2821) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM9291 = c2821.m9291();
        C23399 c23399 = ((C15939) this.f41524).f51760;
        if (c23399.f75748) {
            strM9291 = c23399.f75750.m16326(strM9291);
            linkedHashMap.put("rel", "nofollow");
        }
        linkedHashMap.put("href", strM9291);
        if (c2821.m9292() != null) {
            linkedHashMap.put("title", c2821.m9292());
        }
        LinkedHashMap linkedHashMapM32340 = m32340(c2821, am.av, linkedHashMap);
        C3261 c3261 = this.f41525;
        c3261.m10649(am.av, linkedHashMapM32340, false);
        mo32343(c2821);
        c3261.m10650("/a");
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7355(C19450 c19450) {
        int iIntValue = c19450.m44937() != null ? c19450.m44937().intValue() : 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iIntValue != 1) {
            linkedHashMap.put("start", String.valueOf(iIntValue));
        }
        m32342((AbstractC7296) c19450, "ol", m32340((AbstractC4534) c19450, "ol", (Map) linkedHashMap));
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7337(C1330 c1330) {
        String strM4898 = c1330.m4898();
        C15193 c15193 = new C15193();
        c15193.mo7337(c1330);
        String strM36543 = c15193.m36543();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C23399 c23399 = ((C15939) this.f41524).f51760;
        if (c23399.f75748) {
            strM4898 = c23399.f75750.m16326(strM4898);
        }
        linkedHashMap.put("src", strM4898);
        linkedHashMap.put("alt", strM36543);
        if (c1330.m4899() != null) {
            linkedHashMap.put("title", c1330.m4899());
        }
        this.f41525.m10649("img", m32340(c1330, "img", linkedHashMap), true);
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7359(C24672 c24672) {
        this.f41525.m10652(c24672.m55016());
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7345(C10278 c10278) {
        this.f41525.m10648(c10278.m26490());
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7348(C12737 c12737) {
        this.f41525.m10648("\n");
    }

    @Override // l.AbstractC16245
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo32343(AbstractC4534 abstractC4534) {
        AbstractC4534 abstractC4534M14254 = abstractC4534.m14254();
        while (abstractC4534M14254 != null) {
            AbstractC4534 abstractC4534M14261 = abstractC4534M14254.m14261();
            ((C15939) this.f41524).mo6223(abstractC4534M14254);
            abstractC4534M14254 = abstractC4534M14261;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32341(String str, AbstractC23705 abstractC23705, Map map) {
        C3261 c3261 = this.f41525;
        c3261.m10647();
        c3261.m10649("pre", m32340(abstractC23705, "pre", Collections.EMPTY_MAP), false);
        c3261.m10649("code", m32340(abstractC23705, "code", map), false);
        c3261.m10652(str);
        c3261.m10650("/code");
        c3261.m10650("/pre");
        c3261.m10647();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32342(AbstractC7296 abstractC7296, String str, LinkedHashMap linkedHashMap) {
        C3261 c3261 = this.f41525;
        c3261.m10647();
        c3261.m10649(str, linkedHashMap, false);
        c3261.m10647();
        mo32343(abstractC7296);
        c3261.m10647();
        c3261.m10650("/".concat(str));
        c3261.m10647();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7351(C14974 c14974) {
        boolean zM19963;
        AbstractC23705 abstractC23705Mo14267 = c14974.mo14267();
        if (abstractC23705Mo14267 != null) {
            AbstractC4534 abstractC4534Mo14267 = abstractC23705Mo14267.mo14267();
            if (abstractC4534Mo14267 instanceof AbstractC7296) {
                zM19963 = ((AbstractC7296) abstractC4534Mo14267).m19963();
            } else {
                zM19963 = false;
            }
        } else {
            zM19963 = false;
        }
        C3261 c3261 = this.f41525;
        if (!zM19963) {
            c3261.m10647();
            c3261.m10649(am.ax, m32340(c14974, am.ax, Collections.EMPTY_MAP), false);
        }
        mo32343(c14974);
        if (zM19963) {
            return;
        }
        c3261.m10650("/p");
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7336(C0584 c0584) {
        LinkedHashMap linkedHashMapM32340 = m32340(c0584, "br", Collections.EMPTY_MAP);
        C3261 c3261 = this.f41525;
        c3261.m10649("br", linkedHashMapM32340, true);
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7346(C11245 c11245) {
        LinkedHashMap linkedHashMapM32340 = m32340(c11245, "strong", Collections.EMPTY_MAP);
        C3261 c3261 = this.f41525;
        c3261.m10649("strong", linkedHashMapM32340, false);
        mo32343(c11245);
        c3261.m10650("/strong");
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7347(C12516 c12516) {
        LinkedHashMap linkedHashMapM32340 = m32340(c12516, "code", Collections.EMPTY_MAP);
        C3261 c3261 = this.f41525;
        c3261.m10649("code", linkedHashMapM32340, false);
        c3261.m10652(c12516.m31069());
        c3261.m10650("/code");
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7349(C14007 c14007) {
        LinkedHashMap linkedHashMapM32340 = m32340(c14007, "li", Collections.EMPTY_MAP);
        C3261 c3261 = this.f41525;
        c3261.m10649("li", linkedHashMapM32340, false);
        mo32343(c14007);
        c3261.m10650("/li");
        c3261.m10647();
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7356(C20721 c20721) {
        m32342((AbstractC7296) c20721, "ul", m32340(c20721, "ul", Collections.EMPTY_MAP));
    }

    @Override // l.AbstractC16245, l.InterfaceC17212
    /* JADX INFO: renamed from: ۙ */
    public final void mo7357(C21467 c21467) {
        LinkedHashMap linkedHashMapM32340 = m32340(c21467, "em", Collections.EMPTY_MAP);
        C3261 c3261 = this.f41525;
        c3261.m10649("em", linkedHashMapM32340, false);
        mo32343(c21467);
        c3261.m10650("/em");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m32340(AbstractC4534 abstractC4534, String str, Map map) {
        return ((C15939) this.f41524).mo6221(abstractC4534, str, map);
    }
}
