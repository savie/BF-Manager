package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13296 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10474 f44155;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10164 f44156;

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public final void mo7248(AbstractC8774 abstractC8774) {
        super.mo7248(abstractC8774);
        if (abstractC8774 != null) {
            abstractC8774.f30190 = null;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3935(final C10164 c10164) {
        if (c10164.f34721 != null) {
            if (c10164.f34725.mo6761("package-info", EnumC11347.SOURCE)) {
                c10164.f34721.f25394.m49996();
            }
            c10164.f34721.m20274();
        }
        if (c10164.f34725.mo6761("module-info", EnumC11347.SOURCE)) {
            C19670 c19670 = c10164.f34730;
            c19670.f63146 = null;
            c19670.f63134 = null;
            c19670.f63142 = null;
            c19670.f63140 = null;
            c19670.f63151 = null;
            c19670.f63148 = null;
            c19670.f77451 = new InterfaceC13320() { // from class: l.᩹ᩴ۟
                @Override // l.InterfaceC13320
                /* JADX INFO: renamed from: ۨ */
                public final /* synthetic */ boolean mo1180() {
                    return false;
                }

                @Override // l.InterfaceC13320
                /* JADX INFO: renamed from: ۙ */
                public final void mo1179(AbstractC23903 abstractC23903) {
                    C12325 c12325 = this.f73350.f44155.f35845;
                    C10164 c10165 = c10164;
                    c12325.m30634(c10165.f34730.f63139, C21825.of((Object) c10165));
                }
            };
            c19670.f63139.m49996();
            C22492 c22492 = c10164.f34730.f63139;
            c22492.f73417 = AbstractC9462.m24222(c22492);
        }
        c10164.f34721 = null;
        this.f44156 = c10164;
        try {
            m49334(c10164.f34727);
        } finally {
            this.f44156 = null;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        super.mo1065(c8753);
        C21825 c21825M48588 = C21825.m48588();
        C21825 c21825 = c8753.f30090;
        while (c21825.m48595() && !((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60478)) {
            c21825M48588 = c21825M48588.m48597((AbstractC8774) c21825.f70876);
            c21825 = c21825.f70877;
        }
        if (c21825.m48595() && (((C23195) c21825.f70876).f75267.f70567 & 68719476736L) != 0) {
            C21825 c21825M48597 = c21825.f70877;
            while (c21825M48588.m48595()) {
                c21825M48597 = c21825M48597.m48597((AbstractC8774) c21825M48588.f70876);
                c21825M48588 = c21825M48588.f70877;
            }
            c8753.f30090 = c21825M48597;
        }
        C22492 c22492 = c8753.f30086;
        if (c22492 != null) {
            c22492.f77451 = new C21762(this.f44155, this.f44156);
            Iterator it = c22492.m50004().iterator();
            while (it.hasNext()) {
                C9030.stream(((C16142) it.next()).m38213()).forEach(new Consumer() { // from class: l.֨ᩴ۟
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C1455.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        this.f5567.mo3925((C5224) obj);
                    }
                });
            }
            c8753.f30086.f73421 = C21825.m48588();
        }
        c8753.f30086 = null;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        C18258 c18258;
        if (C3128.m9466(c23195) && (c18258 = c23195.f75263) != null && c18258.f77448.m52717() && c23195.f75268.f69737.m48595() && C3128.m9456((AbstractC8774) c23195.f75268.f69737.f70876)) {
            C21452 c21452 = c23195.f75268;
            C21825 c21825 = c21452.f69737;
            if (((AbstractC14728) c21825.f70876).f30189 == c21452.f30189) {
                c21452.f69737 = c21825.f70877;
            }
        }
        c23195.f75263 = null;
        super.mo3961(c23195);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        c6656.f22475 = null;
        super.mo3928(c6656);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        c8378.f29097 = null;
        super.mo3932(c8378);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        c6635.f35957 = null;
        super.mo3927(c6635);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        c13007.f35957 = null;
        mo7248(c13007.f43378);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        c22864.f35957 = null;
        super.mo1267(c22864);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        c23570.f76355 = null;
        mo7248(c23570.f76357);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        c3107.f11716 = null;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
        c5224.f18119 = null;
        super.mo3925(c5224);
    }

    public C13296(C10474 c10474) {
        this.f44155 = c10474;
    }
}
