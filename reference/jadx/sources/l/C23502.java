package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7KZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23502 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f75980;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f75981;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f75982;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52692(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037) {
        AbstractC22664 abstractC22664;
        if (abstractC8036 == null || abstractC8037 == null) {
            return abstractC8036 == null && abstractC8037 == null;
        }
        AbstractC8036 abstractC8036M28345 = C11239.m28345(abstractC8036);
        AbstractC8036 abstractC8036M28346 = C11239.m28345(abstractC8037);
        AbstractC22664 abstractC22665 = abstractC8036M28345.f26659;
        if (abstractC22665 != null && abstractC22665.mo39105() != null && (abstractC22664 = abstractC8036M28346.f26659) != null && abstractC22664.mo39105() != null) {
            return C17359.equals(abstractC8036M28345.f26659.mo39105(), abstractC8036M28346.f26659.mo39105());
        }
        if (abstractC8036M28345.mo2285() != abstractC8036M28346.mo2285()) {
            return false;
        }
        AbstractC8036 abstractC8038 = this.f75982;
        boolean z = this.f75981;
        try {
            this.f75982 = abstractC8036M28346;
            abstractC8036M28345.mo2284(this);
            return this.f75981;
        } finally {
            this.f75982 = abstractC8038;
            this.f75981 = z;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52691(Iterable iterable, Iterable iterable2) {
        if (iterable == null || iterable2 == null) {
            return iterable == null && iterable2 == null;
        }
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!m52692((AbstractC8036) it.next(), (AbstractC8036) it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        C5887 c5888 = (C5887) this.f75982;
        AbstractC11781 abstractC11781 = c5887.f20170;
        AbstractC11781 abstractC11782 = c5888.f20170;
        if (abstractC11781 != null && abstractC11782 != null && C17359.equals(this.f75980.get(abstractC11781), abstractC11782)) {
            this.f75981 = true;
        } else {
            this.f75981 = c5887.f20170 == c5888.f20170;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        C23041 c23042 = (C23041) this.f75982;
        this.f75981 = m52692(c23041.f74776, c23042.f74776) && c23041.f74775 == c23042.f74775;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        C16875 c16876 = (C16875) this.f75982;
        this.f75981 = m52691(c16875.f55197, c16876.f55197) && m52692(c16875.f55198, c16876.f55198);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
        C17621 c17622 = (C17621) this.f75982;
        this.f75981 = m52692(c17621.f57962, c17622.f57962) && m52691(c17621.f57964, c17622.f57964);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        C24533 c24534 = (C24533) this.f75982;
        this.f75981 = m52691(c24533.f79552, c24534.f79552) && m52692(c24533.f79554, c24534.f79554) && m52691(c24533.f79555, c24534.f79555) && c24533.f24265 == c24534.f24265;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1494(C3451 c3451) {
        C3451 c3452 = (C3451) this.f75982;
        this.f75981 = m52692(c3451.f11254, c3452.f11254) && m52692(c3451.f11255, c3452.f11255);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1523(C20605 c20605) {
        C20605 c20606 = (C20605) this.f75982;
        this.f75981 = m52692(c20605.f66030, c20606.f66030) && m52692(c20605.f66031, c20606.f66031);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        C12400 c12401 = (C12400) this.f75982;
        this.f75981 = m52692(c12400.f39896, c12401.f39896) && m52692(c12400.f39895, c12401.f39895) && c12400.f62402 == c12401.f62402;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        C6435 c6436 = (C6435) this.f75982;
        this.f75981 = m52692(c6435.f21672, c6436.f21672) && m52692(c6435.f21671, c6436.f21671) && c6435.f62402 == c6436.f62402;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
        this.f75981 = m52692(c24335.f78930, ((C24335) this.f75982).f78930);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        C4197 c4198 = (C4197) this.f75982;
        this.f75981 = c4197.f15345 == c4198.f15345 && m52691(c4197.f15344, c4198.f15344);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1515(C14637 c14637) {
        this.f75981 = c14637.f47895 == ((C14637) this.f75982).f47895;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1497(C4307 c4307) {
        this.f75981 = m52692(c4307.f15611, ((C4307) this.f75982).f15611);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2611(C21351 c21351) {
        C21351 c21352 = (C21351) this.f75982;
        this.f75981 = m52691(c21351.f68007, c21352.f68007) && m52691(c21351.f68009, c21352.f68009);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2606(C9416 c9416) {
        this.f75981 = true;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2601(C0468 c0468) {
        C0468 c0469 = (C0468) this.f75982;
        this.f75981 = m52692(c0468.f2080, c0469.f2080) && m52692(c0468.f2079, c0469.f2079);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C7926 c7927 = (C7926) this.f75982;
        this.f75981 = m52692(c7926.f26341, c7927.f26341) && c7926.f26346 == c7927.f26346 && m52691(c7926.f26343, c7927.f26343) && m52692(c7926.f26348, c7927.f26348) && m52691(c7926.f26347, c7927.f26347) && m52691(c7926.f26344, c7927.f26344);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        C10162 c10163 = (C10162) this.f75982;
        this.f75981 = m52692(c10162.f32546, c10163.f32546) && m52692(c10162.f32544, c10163.f32544) && m52692(c10162.f32545, c10163.f32545);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1490(C1214 c1214) {
        this.f75981 = c1214.f4446 == ((C1214) this.f75982).f4446;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        C8671 c8672 = (C8671) this.f75982;
        this.f75981 = m52692(c8671.f28313, c8672.f28313) && m52692(c8671.f28314, c8672.f28314);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1957(C13891 c13891) {
        this.f75981 = m52691(c13891.f44048, ((C13891) this.f75982).f44048);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1952(C11106 c11106) {
        this.f75981 = m52692(c11106.f35018, ((C11106) this.f75982).f35018);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2605(C5141 c5141) {
        C5141 c5142 = (C5141) this.f75982;
        this.f75981 = m52692(c5141.f17908, c5142.f17908) && m52691(c5141.f17909, c5142.f17909);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        C20057 c20058 = (C20057) this.f75982;
        this.f75981 = m52691(c20057.f64457, c20058.f64457) && m52692(c20057.f64458, c20058.f64458) && m52691(c20057.f64455, c20058.f64455) && m52692(c20057.f64456, c20058.f64456);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1504(C7180 c7180) {
        C7180 c7181 = (C7180) this.f75982;
        this.f75981 = m52692(c7180.f23710, c7181.f23710) && m52692(c7180.f23711, c7181.f23711) && m52692(c7180.f23709, c7181.f23709);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        C2158 c2159 = (C2158) this.f75982;
        this.f75981 = m52692(c2158.f7114, c2159.f7114) && m52692(c2158.f7115, c2159.f7115) && m52692(c2158.f7116, c2159.f7116);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1953(C11852 c11852) {
        C11852 c11853 = (C11852) this.f75982;
        this.f75981 = c11852.f38180 == c11853.f38180 && m52692(c11852.f38181, c11853.f38181);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1960(C16129 c16129) {
        C16129 c161210 = (C16129) this.f75982;
        this.f75981 = m52692(c16129.f52413, c161210.f52413) && m52692(c16129.f52412, c161210.f52412);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1520(C17073 c17073) {
        C17073 c17074 = (C17073) this.f75982;
        this.f75981 = c17073.f55743 == c17074.f55743 && m52692(c17073.f55742, c17074.f55742);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        C16327 c16328 = (C16327) this.f75982;
        this.f75981 = m52691(c16327.f52999, c16328.f52999) && m52692(c16327.f53001, c16328.f53001) && c16327.f53000 == c16328.f53000;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2607(C14747 c14747) {
        C14747 c14748 = (C14747) this.f75982;
        this.f75981 = m52691(c14747.f48161, c14748.f48161) && m52692(c14747.f48163, c14748.f48163);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1970(C23787 c23787) {
        C23787 c23788 = (C23787) this.f75982;
        this.f75981 = c23787.f77042 == c23788.f77042 && C17359.equals(c23787.f77043, c23788.f77043);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        C6633 c6634 = (C6633) this.f75982;
        this.f75981 = m52692(c6633.f22144, c6634.f22144) && c6633.f22150 == c6634.f22150 && m52692(c6633.f22147, c6634.f22147) && m52691(c6633.f22154, c6634.f22154) && m52692(c6633.f22149, c6634.f22149) && m52691(c6633.f22145, c6634.f22145) && m52691(c6633.f22146, c6634.f22146) && m52692(c6633.f22148, c6634.f22148) && m52692(c6633.f22151, c6634.f22151);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2603(C4395 c4395) {
        C4395 c4396 = (C4395) this.f75982;
        this.f75981 = c4395.f15825 == c4396.f15825 && m52691(c4395.f15824, c4396.f15824);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
        C14835 c14836 = (C14835) this.f75982;
        this.f75981 = m52692(c14835.f48525, c14836.f48525) && m52692(c14835.f48522, c14836.f48522) && m52691(c14835.f48523, c14836.f48523);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        boolean z;
        C21549 c215410 = (C21549) this.f75982;
        if (m52692(c21549.f68829, c215410.f68829) && m52691(c21549.f68830, c215410.f68830) && m52691(c21549.f68828, c215410.f68828)) {
            C14769 c14769 = c21549.f68831;
            C14769 c147610 = c215410.f68831;
            if (c14769 != null && c147610 != null) {
                Iterator it = c14769.iterator();
                Iterator it2 = c147610.iterator();
                while (true) {
                    if (it.hasNext() && it2.hasNext()) {
                        if (!m52691((Iterable) it.next(), (Iterable) it2.next())) {
                        }
                    } else if (!it.hasNext() && !it2.hasNext()) {
                        if (m52691(c21549.f68827, c215410.f68827)) {
                        }
                    }
                }
            } else if (c14769 == null && c147610 == null) {
                z = m52691(c21549.f68827, c215410.f68827);
            }
        }
        this.f75981 = z;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        C18565 c18566 = (C18565) this.f75982;
        this.f75981 = m52692(c18565.f60321, c18566.f60321) && m52691(c18565.f60320, c18566.f60320) && m52692(c18565.f60323, c18566.f60323) && m52691(c18565.f60325, c18566.f60325) && m52692(c18565.f60319, c18566.f60319) && c18565.f60318 == c18566.f60318;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2602(C0666 c0666) {
        C0666 c0667 = (C0666) this.f75982;
        this.f75981 = m52692(c0666.f2536, c0667.f2536) && m52691(c0666.f2537, c0667.f2537);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1509(C10360 c10360) {
        C10360 c10361 = (C10360) this.f75982;
        this.f75981 = m52691(c10360.f32979, c10361.f32979) && m52692(c10360.f32980, c10361.f32980) && c10360.f32981 == c10361.f32981;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2604(C5053 c5053) {
        C5053 c5054 = (C5053) this.f75982;
        this.f75981 = m52692(c5053.f17632, c5054.f17632) && m52691(c5053.f17631, c5054.f17631);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        C12598 c12599 = (C12598) this.f75982;
        this.f75981 = c12598.f40435 == c12599.f40435 && c12598.f40430 == c12599.f40430 && c12598.f40431 == c12599.f40431 && m52692(c12598.f40436, c12599.f40436) && m52691(c12598.f40437, c12599.f40437);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2612(C22207 c22207) {
        C22207 c22208 = (C22207) this.f75982;
        this.f75981 = c22207.f71542 == c22208.f71542 && c22207.f71543 == c22208.f71543 && m52692(c22207.f71540, c22208.f71540);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        this.f75981 = m52692(c11018.f34795, ((C11018) this.f75982).f34795);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        C15493 c15494 = (C15493) this.f75982;
        this.f75981 = m52692(c15493.f50422, c15494.f50422) && m52691(c15493.f50421, c15494.f50421);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        C13256 c13257 = (C13256) this.f75982;
        this.f75981 = m52692(c13256.f42352, c13257.f42352) && m52691(c13256.f42355, c13257.f42355);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1948(C5799 c5799) {
        C5799 c57910 = (C5799) this.f75982;
        this.f75981 = m52692(c5799.f19919, c57910.f19919) && m52692(c5799.f19918, c57910.f19918);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1491(C2070 c2070) {
        this.f75981 = m52692(c2070.f6892, ((C2070) this.f75982).f6892);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2609(C19113 c19113) {
        C19113 c19114 = (C19113) this.f75982;
        this.f75981 = m52691(c19113.f61857, c19114.f61857) && c19113.f61859 == c19114.f61859 && c19113.f61858 == c19114.f61858;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        C11764 c11765 = (C11764) this.f75982;
        this.f75981 = m52692(c11764.f38022, c11765.f38022) && m52691(c11764.f38025, c11765.f38025) && m52692(c11764.f38024, c11765.f38024) && m52691(c11764.f38023, c11765.f38023);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        C25191 c25192 = (C25191) this.f75982;
        this.f75981 = m52692(c25191.f81425, c25192.f81425) && m52691(c25191.f81424, c25192.f81424);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1968(C23589 c23589) {
        this.f75981 = m52692(c23589.f76594, ((C23589) this.f75982).f76594);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2608(C18477 c18477) {
        this.f75981 = c18477.f60145 == ((C18477) this.f75982).f60145;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1963(C16985 c16985) {
        C16985 c16986 = (C16985) this.f75982;
        this.f75981 = m52692(c16985.f55514, c16986.f55514) && m52692(c16985.f55515, c16986.f55515);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1958(C14089 c14089) {
        this.f75981 = c14089.f44595 == ((C14089) this.f75982).f44595;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1965(C17731 c17731) {
        this.f75981 = m52691(c17731.f58264, ((C17731) this.f75982).f58264);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        C16239 c162310 = (C16239) this.f75982;
        this.f75981 = c16239.f52784 == c162310.f52784 && m52691(c16239.f52785, c162310.f52785) && m52691(c16239.f52783, c162310.f52783);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1974(C25279 c25279) {
        C25279 c252710 = (C25279) this.f75982;
        this.f75981 = m52692(c25279.f81646, c252710.f81646) && m52692(c25279.f81647, c252710.f81647);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1969(C23699 c23699) {
        this.f75981 = m52691(c23699.f76826, ((C23699) this.f75982).f76826);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        C3561 c3562 = (C3561) this.f75982;
        this.f75981 = m52692(c3561.f12203, c3562.f12203) && c3561.f62402 == c3562.f62402;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2610(C20715 c20715) {
        this.f75981 = m52692(c20715.f66388, ((C20715) this.f75982).f66388);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C12510 c12511 = (C12510) this.f75982;
        boolean z = m52692(c12510.f40170, c12511.f40170) && c12510.f40164 == c12511.f40164 && m52692(c12510.f40169, c12511.f40169) && m52692(c12510.f40166, c12511.f40166) && m52692(c12510.f40171, c12511.f40171);
        this.f75981 = z;
        if (z) {
            this.f75980.put(c12510.f40168, c12511.f40168);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        C6545 c6546 = (C6545) this.f75982;
        this.f75981 = m52692(c6545.f21979, c6546.f21979) && m52692(c6545.f21978, c6546.f21978);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1971(C24445 c24445) {
        C24445 c24446 = (C24445) this.f75982;
        this.f75981 = m52692(c24445.f79358, c24446.f79358) && m52692(c24445.f79357, c24446.f79357);
    }

    public C23502(C14769 c14769, C14769 c147610) {
        this.f75980 = new HashMap();
        HashMap map = new HashMap();
        Iterator it = c147610.iterator();
        Iterator it2 = c14769.iterator();
        while (it2.hasNext()) {
            AbstractC11781 abstractC11781 = (AbstractC11781) it2.next();
            if (!it.hasNext()) {
                break;
            } else {
                map.put(abstractC11781, (AbstractC11781) it.next());
            }
        }
        this.f75980 = map;
    }
}
