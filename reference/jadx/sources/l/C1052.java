package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: P413 */
/* JADX INFO: loaded from: classes2.dex */
public class C1052 extends AbstractC19357 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f4871;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 mo3964(AbstractC8774 abstractC8774) {
        if (abstractC8774 == null) {
            return null;
        }
        abstractC8774.mo1802(this);
        AbstractC8774 abstractC8775 = this.f4871;
        this.f4871 = null;
        return abstractC8775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m3913(C21825 c21825) {
        if (c21825 == null) {
            return null;
        }
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            c21826.f70876 = mo3964((AbstractC8774) c21826.f70876);
        }
        return c21825;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m3963(C21825 c21825) {
        while (c21825.m48595()) {
            c21825.f70876 = mo3964((C6656) c21825.f70876);
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3965(C21825 c21825) {
        while (c21825.m48595()) {
            c21825.f70876 = mo3964((C18630) c21825.f70876);
            c21825 = c21825.f70877;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3935(C10164 c10164) {
        c10164.f34727 = m3913(c10164.f34727);
        this.f4871 = c10164;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3930(C7672 c7672) {
        c7672.f25386 = m3913(c7672.f25386);
        c7672.f25385 = (AbstractC5930) mo3964(c7672.f25385);
        this.f4871 = c7672;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3943(C14023 c14023) {
        c14023.f46089 = mo3964(c14023.f46089);
        this.f4871 = c14023;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1065(C8753 c8753) {
        c8753.f30089 = (C21783) mo3964(c8753.f30089);
        C21825 c21825 = c8753.f30088;
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            c21826.f70876 = mo3964((C22179) c21826.f70876);
        }
        c8753.f30088 = c21825;
        c8753.f30092 = (AbstractC5930) mo3964(c8753.f30092);
        c8753.f30087 = m3913(c8753.f30087);
        c8753.f30090 = m3913(c8753.f30090);
        this.f4871 = c8753;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3961(C23195 c23195) {
        c23195.f75267 = (C21783) mo3964(c23195.f75267);
        c23195.f75266 = (AbstractC5930) mo3964(c23195.f75266);
        C21825 c21825 = c23195.f75269;
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            c21826.f70876 = mo3964((C22179) c21826.f70876);
        }
        c23195.f75269 = c21825;
        c23195.f75262 = (C6656) mo3964(c23195.f75262);
        C21825 c21827 = c23195.f75270;
        m3963(c21827);
        c23195.f75270 = c21827;
        c23195.f75264 = m3913(c23195.f75264);
        c23195.f75268 = (C21452) mo3964(c23195.f75268);
        this.f4871 = c23195;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3928(C6656 c6656) {
        c6656.f22476 = (C21783) mo3964(c6656.f22476);
        c6656.f22482 = (AbstractC5930) mo3964(c6656.f22482);
        c6656.f22477 = (AbstractC5930) mo3964(c6656.f22477);
        c6656.f22481 = (AbstractC5930) mo3964(c6656.f22481);
        this.f4871 = c6656;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3962(C23900 c23900) {
        this.f4871 = c23900;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3955(C21452 c21452) {
        c21452.f69737 = m3913(c21452.f69737);
        this.f4871 = c21452;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3914(C0285 c0285) {
        c0285.f1595 = (AbstractC14728) mo3964(c0285.f1595);
        c0285.f1596 = (AbstractC5930) mo3964(c0285.f1596);
        this.f4871 = c0285;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3960(C22885 c22885) {
        c22885.f74426 = (AbstractC5930) mo3964(c22885.f74426);
        c22885.f74425 = (AbstractC14728) mo3964(c22885.f74425);
        this.f4871 = c22885;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3944(C14398 c14398) {
        c14398.f47204 = m3913(c14398.f47204);
        c14398.f47207 = (AbstractC5930) mo3964(c14398.f47207);
        c14398.f47205 = m3913(c14398.f47205);
        c14398.f47206 = (AbstractC14728) mo3964(c14398.f47206);
        this.f4871 = c14398;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3950(C16514 c16514) {
        c16514.f53042 = (C6656) mo3964(c16514.f53042);
        c16514.f53044 = (AbstractC5930) mo3964(c16514.f53044);
        c16514.f53043 = (AbstractC14728) mo3964(c16514.f53043);
        this.f4871 = c16514;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3920(C2732 c2732) {
        c2732.f10508 = (AbstractC14728) mo3964(c2732.f10508);
        this.f4871 = c2732;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3918(C2026 c2026) {
        c2026.f7570 = (AbstractC5930) mo3964(c2026.f7570);
        C21825 c21825 = c2026.f7568;
        m3965(c21825);
        c2026.f7568 = c21825;
        this.f4871 = c2026;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3952(C18630 c18630) {
        c18630.f60400 = m3913(c18630.f60400);
        c18630.f60403 = m3913(c18630.f60403);
        this.f4871 = c18630;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3934(C9789 c9789) {
        c9789.f33504 = (AbstractC5930) mo3964(c9789.f33504);
        C21825 c21825 = c9789.f33505;
        m3965(c21825);
        c9789.f33505 = c21825;
        this.f4871 = c9789;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3921(C3437 c3437) {
        c3437.f12663 = (AbstractC5930) mo3964(c3437.f12663);
        c3437.f12662 = (C21452) mo3964(c3437.f12662);
        this.f4871 = c3437;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3942(C13713 c13713) {
        c13713.f45222 = m3913(c13713.f45222);
        c13713.f45220 = (C21452) mo3964(c13713.f45220);
        C21825 c21825 = c13713.f45221;
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            c21826.f70876 = mo3964((C19336) c21826.f70876);
        }
        c13713.f45221 = c21825;
        c13713.f45218 = (C21452) mo3964(c13713.f45218);
        this.f4871 = c13713;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3954(C19336 c19336) {
        c19336.f62363 = (C6656) mo3964(c19336.f62363);
        c19336.f62362 = (C21452) mo3964(c19336.f62362);
        this.f4871 = c19336;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1263(C7341 c7341) {
        c7341.f24394 = (AbstractC5930) mo3964(c7341.f24394);
        c7341.f24393 = (AbstractC5930) mo3964(c7341.f24393);
        c7341.f24392 = (AbstractC5930) mo3964(c7341.f24392);
        this.f4871 = c7341;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3924(C4849 c4849) {
        c4849.f17076 = (AbstractC5930) mo3964(c4849.f17076);
        c4849.f17075 = (AbstractC14728) mo3964(c4849.f17075);
        c4849.f17077 = (AbstractC14728) mo3964(c4849.f17077);
        this.f4871 = c4849;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3936(C10870 c10870) {
        c10870.f36960 = (AbstractC5930) mo3964(c10870.f36960);
        this.f4871 = c10870;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1066(C17924 c17924) {
        this.f4871 = c17924;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1068(C21473 c21473) {
        c21473.f69790 = (AbstractC5930) mo3964(c21473.f69790);
        this.f4871 = c21473;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        this.f4871 = c20747;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3294(C11200 c11200) {
        c11200.f37914 = (AbstractC5930) mo3964(c11200.f37914);
        this.f4871 = c11200;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3923(C4539 c4539) {
        c4539.f16146 = (AbstractC5930) mo3964(c4539.f16146);
        this.f4871 = c4539;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3941(C12986 c12986) {
        c12986.f43312 = (AbstractC5930) mo3964(c12986.f43312);
        c12986.f43313 = (AbstractC5930) mo3964(c12986.f43313);
        this.f4871 = c12986;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3947(C15434 c15434) {
        c15434.f50296 = (AbstractC5930) mo3964(c15434.f50296);
        c15434.f50298 = m3913(c15434.f50298);
        this.f4871 = c15434;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3932(C8378 c8378) {
        c8378.f29093 = (AbstractC5930) mo3964(c8378.f29093);
        c8378.f29095 = (AbstractC5930) mo3964(c8378.f29095);
        c8378.f29099 = m3913(c8378.f29099);
        c8378.f29098 = (C8753) mo3964(c8378.f29098);
        this.f4871 = c8378;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3959(C22489 c22489) {
        c22489.f73410 = m3913(c22489.f73410);
        c22489.f73408 = mo3964(c22489.f73408);
        this.f4871 = c22489;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3953(C18961 c18961) {
        c18961.f61400 = m3913(c18961.f61400);
        C21825 c21825M48588 = C21825.m48588();
        Iterator it = c18961.f61401.iterator();
        while (it.hasNext()) {
            c21825M48588 = c21825M48588.m48591((Object) m3913((C21825) it.next()));
        }
        c18961.f61401 = c21825M48588;
        c18961.f61402 = (AbstractC5930) mo3964(c18961.f61402);
        c18961.f61398 = m3913(c18961.f61398);
        c18961.f61399 = m3913(c18961.f61399);
        this.f4871 = c18961;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1266(C21077 c21077) {
        c21077.f68656 = (AbstractC5930) mo3964(c21077.f68656);
        this.f4871 = c21077;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3922(C3812 c3812) {
        c3812.f14145 = (AbstractC5930) mo3964(c3812.f14145);
        c3812.f14146 = (AbstractC5930) mo3964(c3812.f14146);
        this.f4871 = c3812;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3927(C6635 c6635) {
        c6635.f22412 = (AbstractC5930) mo3964(c6635.f22412);
        c6635.f22413 = (AbstractC5930) mo3964(c6635.f22413);
        this.f4871 = c6635;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1265(C13007 c13007) {
        c13007.f43378 = (AbstractC5930) mo3964(c13007.f43378);
        this.f4871 = c13007;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1267(C22864 c22864) {
        c22864.f74367 = (AbstractC5930) mo3964(c22864.f74367);
        c22864.f74368 = (AbstractC5930) mo3964(c22864.f74368);
        this.f4871 = c22864;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1261(C2422 c2422) {
        c2422.f9707 = mo3964(c2422.f9707);
        c2422.f9708 = (AbstractC5930) mo3964(c2422.f9708);
        this.f4871 = c2422;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3938(C11906 c11906) {
        c11906.f39945 = (AbstractC5930) mo3964(c11906.f39945);
        c11906.f39946 = mo3964(c11906.f39946);
        this.f4871 = c11906;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3945(C15103 c15103) {
        c15103.f49323 = (C6656) mo3964(c15103.f49323);
        this.f4871 = c15103;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3948(C15809 c15809) {
        this.f4871 = c15809;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3949(C16139 c16139) {
        c16139.f52149 = (AbstractC20372) mo3964(c16139.f52149);
        this.f4871 = c16139;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3933(C9459 c9459) {
        c9459.f32014 = (AbstractC20372) mo3964(c9459.f32014);
        c9459.f32013 = (AbstractC5930) mo3964(c9459.f32013);
        this.f4871 = c9459;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3957(C22158 c22158) {
        c22158.f72477 = (AbstractC5930) mo3964(c22158.f72477);
        c22158.f72476 = (AbstractC5930) mo3964(c22158.f72476);
        this.f4871 = c22158;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1268(C23570 c23570) {
        c23570.f76357 = (AbstractC5930) mo3964(c23570.f76357);
        this.f4871 = c23570;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3929(C6966 c6966) {
        c6966.f23408 = (AbstractC5930) mo3964(c6966.f23408);
        this.f4871 = c6966;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo1262(C3107 c3107) {
        this.f4871 = c3107;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3917(C1321 c1321) {
        this.f4871 = c1321;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3940(C12611 c12611) {
        this.f4871 = c12611;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3915(C0990 c0990) {
        c0990.f4638 = (AbstractC5930) mo3964(c0990.f4638);
        this.f4871 = c0990;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3937(C11596 c11596) {
        c11596.f38963 = (AbstractC5930) mo3964(c11596.f38963);
        c11596.f38962 = m3913(c11596.f38962);
        this.f4871 = c11596;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3916(C1011 c1011) {
        c1011.f4699 = m3913(c1011.f4699);
        this.f4871 = c1011;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3926(C5245 c5245) {
        c5245.f18177 = m3913(c5245.f18177);
        this.f4871 = c5245;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3958(C22179 c22179) {
        c22179.f72546 = m3913(c22179.f72546);
        c22179.f72547 = m3913(c22179.f72547);
        this.f4871 = c22179;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3946(C15124 c15124) {
        c15124.f49399 = (C8068) mo3964(c15124.f49399);
        c15124.f49398 = mo3964(c15124.f49398);
        this.f4871 = c15124;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3931(C8068 c8068) {
        this.f4871 = c8068;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3939(C12281 c12281) {
        this.f4871 = c12281;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3951(C17945 c17945) {
        c17945.f57401 = m3913(c17945.f57401);
        c17945.f57402 = (AbstractC5930) mo3964(c17945.f57402);
        this.f4871 = c17945;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3956(C21783 c21783) {
        C21825 c21825 = c21783.f70566;
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            c21826.f70876 = mo3964((C5224) c21826.f70876);
        }
        c21783.f70566 = c21825;
        this.f4871 = c21783;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3925(C5224 c5224) {
        c5224.f18121 = mo3964(c5224.f18121);
        c5224.f18122 = m3913(c5224.f18122);
        this.f4871 = c5224;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3919(C2401 c2401) {
        c2401.f9658 = m3913(c2401.f9658);
        c2401.f9659 = (AbstractC5930) mo3964(c2401.f9659);
        this.f4871 = c2401;
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
        throw new AssertionError(abstractC8774);
    }
}
