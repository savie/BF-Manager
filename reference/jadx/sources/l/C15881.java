package l;

import com.umeng.analytics.pro.am;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܺۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15881 extends AbstractC23910 implements InterfaceC8825 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0357 f51452;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14470 f51453;

    public C15881(InterfaceC0357 interfaceC0357) {
        this.f51452 = interfaceC0357;
        this.f51453 = ((C10942) interfaceC0357).mo2067();
    }

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ܰ */
    public final Set mo5501() {
        Class[] clsArr = {C2432.class, C13017.class, C15840.class, C2036.class, C9799.class, C22189.class, C3843.class, C5961.class, C15134.class, C21483.class, C8078.class, C20778.class, C22895.class, C5255.class, C12312.class, C17250.class, C3447.class, C6666.class, C20073.class, C1021.class};
        HashSet hashSet = new HashSet(20);
        for (int i = 0; i < 20; i++) {
            Class cls = clsArr[i];
            C13638.requireNonNull(cls);
            if (!hashSet.add(cls)) {
                throw new IllegalArgumentException("duplicate element: " + cls);
            }
        }
        return C0561.unmodifiableSet(hashSet);
    }

    @Override // l.InterfaceC8825
    /* JADX INFO: renamed from: ۙ */
    public final void mo5500(AbstractC19367 abstractC19367) {
        abstractC19367.mo3851(this);
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27307(C2432 c2432) {
        mo37759(c2432);
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27317(C13017 c13017) {
        String str = am.aG + c13017.m32196();
        C14470 c14470 = this.f51453;
        c14470.m34872();
        c14470.m34874(str, m37756(c13017, str, Collections.EMPTY_MAP), false);
        mo37759(c13017);
        c14470.m34875("/" + str);
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27306(C2036 c2036) {
        C14470 c14470 = this.f51453;
        c14470.m34872();
        c14470.m34874("blockquote", m37756(c2036, "blockquote", Collections.EMPTY_MAP), false);
        c14470.m34872();
        mo37759(c2036);
        c14470.m34872();
        c14470.m34875("/blockquote");
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27326(C22189 c22189) {
        String strM49229 = c22189.m49229();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM49225 = c22189.m49225();
        if (strM49225 != null && !strM49225.isEmpty()) {
            int iIndexOf = strM49225.indexOf(" ");
            if (iIndexOf != -1) {
                strM49225 = strM49225.substring(0, iIndexOf);
            }
            linkedHashMap.put(Name.LABEL, "language-" + strM49225);
        }
        m37757(strM49229, c22189, linkedHashMap);
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27309(C3843 c3843) {
        C14470 c14470 = this.f51453;
        c14470.m34872();
        c14470.m34873(c3843.m11169());
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27312(C5961 c5961) {
        C14470 c14470 = this.f51453;
        c14470.m34872();
        c14470.m34874("hr", m37756(c5961, "hr", Collections.EMPTY_MAP), true);
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27319(C15134 c15134) {
        m37757(c15134.m36290(), c15134, Collections.EMPTY_MAP);
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27325(C21483 c21483) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM48100 = c21483.m48100();
        C23642 c23642 = ((C10942) this.f51452).f37208;
        if (c23642.f76565) {
            strM48100 = c23642.f76563.m45476(strM48100);
            linkedHashMap.put("rel", "nofollow");
        }
        linkedHashMap.put("href", strM48100);
        if (c21483.m48101() != null) {
            linkedHashMap.put("title", c21483.m48101());
        }
        LinkedHashMap linkedHashMapM37756 = m37756(c21483, am.av, linkedHashMap);
        C14470 c14470 = this.f51453;
        c14470.m34874(am.av, linkedHashMapM37756, false);
        mo37759(c21483);
        c14470.m34875("/a");
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27324(C20778 c20778) {
        int iIntValue = c20778.m46770() != null ? c20778.m46770().intValue() : 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iIntValue != 1) {
            linkedHashMap.put("start", String.valueOf(iIntValue));
        }
        m37758((AbstractC18661) c20778, "ol", m37756((AbstractC19367) c20778, "ol", (Map) linkedHashMap));
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27327(C22895 c22895) {
        String strM50651 = c22895.m50651();
        C20819 c20819 = new C20819();
        c20819.mo27327(c22895);
        String strM46817 = c20819.m46817();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C23642 c23642 = ((C10942) this.f51452).f37208;
        if (c23642.f76565) {
            strM50651 = c23642.f76563.m45476(strM50651);
        }
        linkedHashMap.put("src", strM50651);
        linkedHashMap.put("alt", strM46817);
        if (c22895.m50652() != null) {
            linkedHashMap.put("title", c22895.m50652());
        }
        this.f51453.m34874("img", m37756(c22895, "img", linkedHashMap), true);
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27321(C17250 c17250) {
        this.f51453.m34871(c17250.m40214());
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27313(C6666 c6666) {
        this.f51453.m34873(c6666.m18050());
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27323(C20073 c20073) {
        this.f51453.m34873("\n");
    }

    @Override // l.AbstractC23910
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo37759(AbstractC19367 abstractC19367) {
        AbstractC19367 abstractC19367M44383 = abstractC19367.m44383();
        while (abstractC19367M44383 != null) {
            AbstractC19367 abstractC19367M44390 = abstractC19367M44383.m44390();
            ((C10942) this.f51452).mo2068(abstractC19367M44383);
            abstractC19367M44383 = abstractC19367M44390;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37757(String str, AbstractC14738 abstractC14738, Map map) {
        C14470 c14470 = this.f51453;
        c14470.m34872();
        c14470.m34874("pre", m37756(abstractC14738, "pre", Collections.EMPTY_MAP), false);
        c14470.m34874("code", m37756(abstractC14738, "code", map), false);
        c14470.m34871(str);
        c14470.m34875("/code");
        c14470.m34875("/pre");
        c14470.m34872();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37758(AbstractC18661 abstractC18661, String str, LinkedHashMap linkedHashMap) {
        C14470 c14470 = this.f51453;
        c14470.m34872();
        c14470.m34874(str, linkedHashMap, false);
        c14470.m34872();
        mo37759(abstractC18661);
        c14470.m34872();
        c14470.m34875("/".concat(str));
        c14470.m34872();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27320(C15840 c15840) {
        boolean zM43148;
        AbstractC14738 abstractC14738Mo35319 = c15840.mo35319();
        if (abstractC14738Mo35319 != null) {
            AbstractC19367 abstractC19367Mo35319 = abstractC14738Mo35319.mo35319();
            if (abstractC19367Mo35319 instanceof AbstractC18661) {
                zM43148 = ((AbstractC18661) abstractC19367Mo35319).m43148();
            } else {
                zM43148 = false;
            }
        } else {
            zM43148 = false;
        }
        C14470 c14470 = this.f51453;
        if (!zM43148) {
            c14470.m34872();
            c14470.m34874(am.ax, m37756(c15840, am.ax, Collections.EMPTY_MAP), false);
        }
        mo37759(c15840);
        if (zM43148) {
            return;
        }
        c14470.m34875("/p");
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27305(C1021 c1021) {
        LinkedHashMap linkedHashMapM37756 = m37756(c1021, "br", Collections.EMPTY_MAP);
        C14470 c14470 = this.f51453;
        c14470.m34874("br", linkedHashMapM37756, true);
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27308(C3447 c3447) {
        LinkedHashMap linkedHashMapM37756 = m37756(c3447, "code", Collections.EMPTY_MAP);
        C14470 c14470 = this.f51453;
        c14470.m34874("code", linkedHashMapM37756, false);
        c14470.m34871(c3447.m10156());
        c14470.m34875("/code");
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27311(C5255 c5255) {
        LinkedHashMap linkedHashMapM37756 = m37756(c5255, "em", Collections.EMPTY_MAP);
        C14470 c14470 = this.f51453;
        c14470.m34874("em", linkedHashMapM37756, false);
        mo37759(c5255);
        c14470.m34875("/em");
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27314(C8078 c8078) {
        LinkedHashMap linkedHashMapM37756 = m37756(c8078, "li", Collections.EMPTY_MAP);
        C14470 c14470 = this.f51453;
        c14470.m34874("li", linkedHashMapM37756, false);
        mo37759(c8078);
        c14470.m34875("/li");
        c14470.m34872();
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27315(C9799 c9799) {
        m37758((AbstractC18661) c9799, "ul", m37756(c9799, "ul", Collections.EMPTY_MAP));
    }

    @Override // l.AbstractC23910, l.InterfaceC10901
    /* JADX INFO: renamed from: ۙ */
    public final void mo27316(C12312 c12312) {
        LinkedHashMap linkedHashMapM37756 = m37756(c12312, "strong", Collections.EMPTY_MAP);
        C14470 c14470 = this.f51453;
        c14470.m34874("strong", linkedHashMapM37756, false);
        mo37759(c12312);
        c14470.m34875("/strong");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m37756(AbstractC19367 abstractC19367, String str, Map map) {
        return ((C10942) this.f51452).mo2066(abstractC19367, str, map);
    }
}
