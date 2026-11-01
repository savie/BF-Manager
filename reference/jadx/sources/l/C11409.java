package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7KZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11409 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f38416;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f38417;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f38418;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28512(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775) {
        AbstractC16579 abstractC16579;
        if (abstractC8774 == null || abstractC8775 == null) {
            return abstractC8774 == null && abstractC8775 == null;
        }
        AbstractC8774 abstractC8774M9467 = C3128.m9467(abstractC8774);
        AbstractC8774 abstractC8774M9468 = C3128.m9467(abstractC8775);
        AbstractC16579 abstractC165710 = abstractC8774M9467.f30190;
        if (abstractC165710 != null && abstractC165710.mo24292() != null && (abstractC16579 = abstractC8774M9468.f30190) != null && abstractC16579.mo24292() != null) {
            return C13638.equals(abstractC8774M9467.f30190.mo24292(), abstractC8774M9468.f30190.mo24292());
        }
        if (abstractC8774M9467.mo1803() != abstractC8774M9468.mo1803()) {
            return false;
        }
        AbstractC8774 abstractC8776 = this.f38418;
        boolean z = this.f38417;
        try {
            this.f38418 = abstractC8774M9468;
            abstractC8774M9467.mo1802(this);
            return this.f38417;
        } finally {
            this.f38418 = abstractC8776;
            this.f38417 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28511(Iterable iterable, Iterable iterable2) {
        if (iterable == null || iterable2 == null) {
            return iterable == null && iterable2 == null;
        }
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!m28512((AbstractC8774) it.next(), (AbstractC8774) it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        C3107 c3108 = (C3107) this.f38418;
        AbstractC23903 abstractC23903 = c3107.f11716;
        AbstractC23903 abstractC23904 = c3108.f11716;
        if (abstractC23903 != null && abstractC23904 != null && C13638.equals(this.f38416.get(abstractC23903), abstractC23904)) {
            this.f38417 = true;
        } else {
            this.f38417 = c3107.f11716 == c3108.f11716;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        C23570 c23571 = (C23570) this.f38418;
        this.f38417 = m28512(c23570.f76357, c23571.f76357) && c23570.f76355 == c23571.f76355;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        C2401 c2402 = (C2401) this.f38418;
        this.f38417 = m28511(c2401.f9658, c2402.f9658) && m28512(c2401.f9659, c2402.f9659);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
        C5224 c5225 = (C5224) this.f38418;
        this.f38417 = m28512(c5224.f18121, c5225.f18121) && m28511(c5224.f18122, c5225.f18122);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        C15434 c15435 = (C15434) this.f38418;
        this.f38417 = m28511(c15434.f50297, c15435.f50297) && m28512(c15434.f50296, c15435.f50296) && m28511(c15434.f50298, c15435.f50298) && c15434.f53897 == c15435.f53897;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3941(C12986 c12986) {
        C12986 c12987 = (C12986) this.f38418;
        this.f38417 = m28512(c12986.f43312, c12987.f43312) && m28512(c12986.f43313, c12987.f43313);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(C3812 c3812) {
        C3812 c3813 = (C3812) this.f38418;
        this.f38417 = m28512(c3812.f14145, c3813.f14145) && m28512(c3812.f14146, c3813.f14146);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        C6635 c6636 = (C6635) this.f38418;
        this.f38417 = m28512(c6635.f22412, c6636.f22412) && m28512(c6635.f22413, c6636.f22413) && c6635.f35957 == c6636.f35957;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        C22864 c22865 = (C22864) this.f38418;
        this.f38417 = m28512(c22864.f74367, c22865.f74367) && m28512(c22864.f74368, c22865.f74368) && c22864.f35957 == c22865.f35957;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
        this.f38417 = m28512(c15103.f49323, ((C15103) this.f38418).f49323);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        C21452 c21453 = (C21452) this.f38418;
        this.f38417 = c21452.f69739 == c21453.f69739 && m28511(c21452.f69737, c21453.f69737);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1066(C17924 c17924) {
        this.f38417 = c17924.f56926 == ((C17924) this.f38418).f56926;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        this.f38417 = m28512(c21473.f69790, ((C21473) this.f38418).f69790);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3952(C18630 c18630) {
        C18630 c18631 = (C18630) this.f38418;
        this.f38417 = m28511(c18630.f60400, c18631.f60400) && m28511(c18630.f60403, c18631.f60403);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3948(C15809 c15809) {
        this.f38417 = true;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3954(C19336 c19336) {
        C19336 c19337 = (C19336) this.f38418;
        this.f38417 = m28512(c19336.f62363, c19337.f62363) && m28512(c19336.f62362, c19337.f62362);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        C8753 c8754 = (C8753) this.f38418;
        this.f38417 = m28512(c8753.f30089, c8754.f30089) && c8753.f30093 == c8754.f30093 && m28511(c8753.f30088, c8754.f30088) && m28512(c8753.f30092, c8754.f30092) && m28511(c8753.f30087, c8754.f30087) && m28511(c8753.f30090, c8754.f30090);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        C7341 c7342 = (C7341) this.f38418;
        this.f38417 = m28512(c7341.f24394, c7342.f24394) && m28512(c7341.f24393, c7342.f24393) && m28512(c7341.f24392, c7342.f24392);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        this.f38417 = c20747.f67504 == ((C20747) this.f38418).f67504;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        C0285 c0286 = (C0285) this.f38418;
        this.f38417 = m28512(c0285.f1595, c0286.f1595) && m28512(c0285.f1596, c0286.f1596);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3939(C12281 c12281) {
        this.f38417 = m28511(c12281.f41061, ((C12281) this.f38418).f41061);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3936(C10870 c10870) {
        this.f38417 = m28512(c10870.f36960, ((C10870) this.f38418).f36960);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1979(C17219 c17219) {
        C17219 c172110 = (C17219) this.f38418;
        this.f38417 = m28512(c17219.f54878, c172110.f54878) && m28511(c17219.f54880, c172110.f54880);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        C14398 c14399 = (C14398) this.f38418;
        this.f38417 = m28511(c14398.f47204, c14399.f47204) && m28512(c14398.f47207, c14399.f47207) && m28511(c14398.f47205, c14399.f47205) && m28512(c14398.f47206, c14399.f47206);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        C16514 c16515 = (C16514) this.f38418;
        this.f38417 = m28512(c16514.f53042, c16515.f53042) && m28512(c16514.f53044, c16515.f53044) && m28512(c16514.f53043, c16515.f53043);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        C4849 c48410 = (C4849) this.f38418;
        this.f38417 = m28512(c4849.f17076, c48410.f17076) && m28512(c4849.f17075, c48410.f17075) && m28512(c4849.f17077, c48410.f17077);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3943(C14023 c14023) {
        C14023 c14024 = (C14023) this.f38418;
        this.f38417 = c14023.f46087 == c14024.f46087 && m28512(c14023.f46089, c14024.f46089);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3957(C22158 c22158) {
        C22158 c22159 = (C22158) this.f38418;
        this.f38417 = m28512(c22158.f72477, c22159.f72477) && m28512(c22158.f72476, c22159.f72476);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3920(C2732 c2732) {
        C2732 c2733 = (C2732) this.f38418;
        this.f38417 = c2732.f10509 == c2733.f10509 && m28512(c2732.f10508, c2733.f10508);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        C22489 c224810 = (C22489) this.f38418;
        this.f38417 = m28511(c22489.f73410, c224810.f73410) && m28512(c22489.f73408, c224810.f73408) && c22489.f73411 == c224810.f73411;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3951(C17945 c17945) {
        C17945 c17946 = (C17945) this.f38418;
        this.f38417 = m28511(c17945.f57401, c17946.f57401) && m28512(c17945.f57402, c17946.f57402);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3917(C1321 c1321) {
        C1321 c1322 = (C1321) this.f38418;
        this.f38417 = c1321.f5611 == c1322.f5611 && C13638.equals(c1321.f5612, c1322.f5612);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        C23195 c23196 = (C23195) this.f38418;
        this.f38417 = m28512(c23195.f75267, c23196.f75267) && c23195.f75272 == c23196.f75272 && m28512(c23195.f75266, c23196.f75266) && m28511(c23195.f75269, c23196.f75269) && m28512(c23195.f75262, c23196.f75262) && m28511(c23195.f75270, c23196.f75270) && m28511(c23195.f75264, c23196.f75264) && m28512(c23195.f75268, c23196.f75268) && m28512(c23195.f75265, c23196.f75265);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3956(C21783 c21783) {
        C21783 c21784 = (C21783) this.f38418;
        this.f38417 = c21783.f70567 == c21784.f70567 && m28511(c21783.f70566, c21784.f70566);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
        C18255 c18256 = (C18255) this.f38418;
        this.f38417 = m28512(c18255.f58252, c18256.f58252) && m28512(c18255.f58253, c18256.f58253) && m28511(c18255.f58254, c18256.f58254);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        boolean z;
        C18961 c18962 = (C18961) this.f38418;
        if (m28512(c18961.f61402, c18962.f61402) && m28511(c18961.f61398, c18962.f61398) && m28511(c18961.f61400, c18962.f61400)) {
            C21825 c21825 = c18961.f61401;
            C21825 c21826 = c18962.f61401;
            if (c21825 != null && c21826 != null) {
                Iterator it = c21825.iterator();
                Iterator it2 = c21826.iterator();
                while (true) {
                    if (it.hasNext() && it2.hasNext()) {
                        if (!m28511((Iterable) it.next(), (Iterable) it2.next())) {
                        }
                    } else if (!it.hasNext() && !it2.hasNext()) {
                        if (m28511(c18961.f61399, c18962.f61399)) {
                        }
                    }
                }
            } else if (c21825 == null && c21826 == null) {
                z = m28511(c18961.f61399, c18962.f61399);
            }
        }
        this.f38417 = z;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        C8378 c8379 = (C8378) this.f38418;
        this.f38417 = m28512(c8378.f29093, c8379.f29093) && m28511(c8378.f29096, c8379.f29096) && m28512(c8378.f29095, c8379.f29095) && m28511(c8378.f29099, c8379.f29099) && m28512(c8378.f29098, c8379.f29098) && c8378.f29097 == c8379.f29097;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1982(C19667 c19667) {
        C19667 c19668 = (C19667) this.f38418;
        this.f38417 = m28512(c19667.f63121, c19668.f63121) && m28511(c19667.f63123, c19668.f63123);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3930(C7672 c7672) {
        C7672 c7673 = (C7672) this.f38418;
        this.f38417 = m28511(c7672.f25386, c7673.f25386) && m28512(c7672.f25385, c7673.f25385) && c7672.f25387 == c7673.f25387;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1980(C17549 c17549) {
        C17549 c175410 = (C17549) this.f38418;
        this.f38417 = m28512(c17549.f55774, c175410.f55774) && m28511(c17549.f55773, c175410.f55773);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        C6966 c6967 = (C6966) this.f38418;
        this.f38417 = c6966.f23414 == c6967.f23414 && c6966.f23410 == c6967.f23410 && c6966.f23413 == c6967.f23413 && m28512(c6966.f23408, c6967.f23408) && m28511(c6966.f23411, c6967.f23411);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1978(C6260 c6260) {
        C6260 c6261 = (C6260) this.f38418;
        this.f38417 = c6260.f21221 == c6261.f21221 && c6260.f21224 == c6261.f21224 && m28512(c6260.f21222, c6261.f21222);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        this.f38417 = m28512(c11200.f37914, ((C11200) this.f38418).f37914);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        C2026 c2027 = (C2026) this.f38418;
        this.f38417 = m28512(c2026.f7570, c2027.f7570) && m28511(c2026.f7568, c2027.f7568);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        C9789 c97810 = (C9789) this.f38418;
        this.f38417 = m28512(c9789.f33504, c97810.f33504) && m28511(c9789.f33505, c97810.f33505);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3921(C3437 c3437) {
        C3437 c3438 = (C3437) this.f38418;
        this.f38417 = m28512(c3437.f12663, c3438.f12663) && m28512(c3437.f12662, c3438.f12662);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(C4539 c4539) {
        this.f38417 = m28512(c4539.f16146, ((C4539) this.f38418).f16146);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3935(C10164 c10164) {
        C10164 c10165 = (C10164) this.f38418;
        this.f38417 = m28511(c10164.f34727, c10165.f34727) && c10164.f34730 == c10165.f34730 && c10164.f34721 == c10165.f34721;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        C13713 c13714 = (C13713) this.f38418;
        this.f38417 = m28512(c13713.f45220, c13714.f45220) && m28511(c13713.f45221, c13714.f45221) && m28512(c13713.f45218, c13714.f45218) && m28511(c13713.f45222, c13714.f45222);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        C11596 c11597 = (C11596) this.f38418;
        this.f38417 = m28512(c11596.f38963, c11597.f38963) && m28511(c11596.f38962, c11597.f38962);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3915(C0990 c0990) {
        this.f38417 = m28512(c0990.f4638, ((C0990) this.f38418).f4638);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3931(C8068 c8068) {
        this.f38417 = c8068.f28284 == ((C8068) this.f38418).f28284;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1261(C2422 c2422) {
        C2422 c2423 = (C2422) this.f38418;
        this.f38417 = m28512(c2422.f9707, c2423.f9707) && m28512(c2422.f9708, c2423.f9708);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3940(C12611 c12611) {
        this.f38417 = c12611.f42127 == ((C12611) this.f38418).f42127;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3926(C5245 c5245) {
        this.f38417 = m28511(c5245.f18177, ((C5245) this.f38418).f18177);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        C22179 c221710 = (C22179) this.f38418;
        this.f38417 = c22179.f72545 == c221710.f72545 && m28511(c22179.f72547, c221710.f72547) && m28511(c22179.f72546, c221710.f72546);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3938(C11906 c11906) {
        C11906 c11907 = (C11906) this.f38418;
        this.f38417 = m28512(c11906.f39945, c11907.f39945) && m28512(c11906.f39946, c11907.f39946);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3916(C1011 c1011) {
        this.f38417 = m28511(c1011.f4699, ((C1011) this.f38418).f4699);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        C13007 c13008 = (C13007) this.f38418;
        this.f38417 = m28512(c13007.f43378, c13008.f43378) && c13007.f35957 == c13008.f35957;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1977(C3833 c3833) {
        this.f38417 = m28512(c3833.f14206, ((C3833) this.f38418).f14206);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C6656 c6657 = (C6656) this.f38418;
        boolean z = m28512(c6656.f22476, c6657.f22476) && c6656.f22478 == c6657.f22478 && m28512(c6656.f22482, c6657.f22482) && m28512(c6656.f22477, c6657.f22477) && m28512(c6656.f22481, c6657.f22481);
        this.f38417 = z;
        if (z) {
            this.f38416.put(c6656.f22475, c6657.f22475);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        C22885 c22886 = (C22885) this.f38418;
        this.f38417 = m28512(c22885.f74426, c22886.f74426) && m28512(c22885.f74425, c22886.f74425);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3946(C15124 c15124) {
        C15124 c15125 = (C15124) this.f38418;
        this.f38417 = m28512(c15124.f49399, c15125.f49399) && m28512(c15124.f49398, c15125.f49398);
    }

    public C11409(C21825 c21825, C21825 c21826) {
        this.f38416 = new HashMap();
        HashMap map = new HashMap();
        Iterator it = c21826.iterator();
        Iterator it2 = c21825.iterator();
        while (it2.hasNext()) {
            AbstractC23903 abstractC23903 = (AbstractC23903) it2.next();
            if (!it.hasNext()) {
                break;
            } else {
                map.put(abstractC23903, (AbstractC23903) it.next());
            }
        }
        this.f38416 = map;
    }
}
