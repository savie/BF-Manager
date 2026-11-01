package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10686 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f36480;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0618 f36481;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1512 f36482;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6263 f36484;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f36483 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f36485 = new LinkedHashMap();

    public C10686(C1512 c1512, AbstractC8774 abstractC8774, AbstractC0618 abstractC0618) {
        this.f36482 = c1512;
        this.f36480 = null;
        this.f36481 = abstractC0618;
        this.f36480 = abstractC8774;
        AbstractC11242 abstractC11242M17389 = c1512.f6207.f77631.m17389(c1512.f6166.m34166() + "SwitchMap" + c1512.f6166.m34166() + c1512.f6207.m52777(C2194.m6809(abstractC0618.f77449.f53222.mo50003())).toString().replace('/', '.').replace('.', c1512.f6166.m34166()));
        C22492 c22492M5219 = C1512.m5219(c1512);
        C6263 c6263 = new C6263(4120L, abstractC11242M17389, new C8777(c1512.f6175.f14232, c1512.f6175.f14258), c22492M5219);
        this.f36484 = c6263;
        c22492M5219.mo49994();
        c22492M5219.f73417.mo24224(c6263);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26895() {
        C1512 c1512 = this.f36482;
        C5286 c5286 = c1512.f6176;
        AbstractC8774 abstractC8774 = this.f36480;
        abstractC8774.getClass();
        c5286.f18294 = C3128.m9453(abstractC8774);
        C6263 c6263 = this.f36484;
        C8753 c8753M5266 = c1512.m5266((C22492) c6263.f77448);
        AbstractC11242 abstractC11242 = c1512.f6207.f77639;
        AbstractC0618 abstractC0618 = this.f36481;
        C18961 c18961M14647 = c1512.f6176.m14647(c1512.f6176.m14634(c1512.f6175.f14232), C21825.of((Object) c1512.f6176.m14626(c1512.f6176.m14609(c1512.f6176.m14641(c1512.m5235(abstractC8774, abstractC11242, abstractC0618.f77449, C21825.m48588()))), c1512.f6175.f14219)), null);
        c18961M14647.f30190 = new C8777(c1512.f6175.f14232, c1512.f6175.f14258);
        C19003 c19003 = new C19003();
        C18258 c18258M5235 = c1512.m5235(abstractC8774, c1512.f6207.f77593, abstractC0618.f77449, C21825.m48588());
        C21825 c21825M48597 = C21825.m48588().m48597(c1512.f6176.m14616(c1512.f6176.m14594(new C6263(8589934592L, c1512.f6207.f77539, c1512.f6175.f14254, c1512.f6175.f14243), (AbstractC5930) null), c1512.f6176.m14617(0L, C21825.m48588())));
        for (Map.Entry entry : this.f36485.entrySet()) {
            C3812 c3812M14587 = c1512.f6176.m14587((AbstractC5930) c1512.f6176.m14621(c6263, c1512.f6176.m14609((AbstractC5930) c1512.f6176.m14626(c1512.f6176.m14641((C6263) entry.getKey()), c18258M5235))), (AbstractC5930) c1512.f6176.m14580((Integer) entry.getValue()));
            c3812M14587.f30190 = c1512.f6175.f14232;
            C10870 c10870M14642 = c1512.f6176.m14642(c3812M14587);
            C5286 c5287 = c1512.f6176;
            C21452 c21452M14617 = c1512.f6176.m14617(0L, C21825.of((Object) c10870M14642));
            c5287.getClass();
            c19003.m43723(c5287.m14606(C21825.m48588(), c21452M14617, c21825M48597, (C21452) null));
        }
        c8753M5266.f30090 = c8753M5266.f30090.m48597(c1512.f6176.m14617(8L, c19003.m43726())).m48597(c1512.f6176.m14594(c6263, c18961M14647));
    }
}
