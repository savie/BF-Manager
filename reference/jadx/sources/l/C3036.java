package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P413 */
/* JADX INFO: loaded from: classes3.dex */
public class C3036 extends AbstractC0578 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8036 f9840;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC8036 mo8479(AbstractC8036 abstractC8036) {
        if (abstractC8036 == null) {
            return null;
        }
        abstractC8036.mo2284(this);
        AbstractC8036 abstractC8037 = this.f9840;
        this.f9840 = null;
        return abstractC8037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m9867(C14769 c14769) {
        if (c14769 == null) {
            return null;
        }
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c147610.f48335 = mo8479((AbstractC8036) c147610.f48335);
        }
        return c14769;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9868(C14769 c14769) {
        while (c14769.m35550()) {
            c14769.f48335 = mo8479((C12510) c14769.f48335);
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9869(C14769 c14769) {
        while (c14769.m35550()) {
            c14769.f48335 = mo8479((C21351) c14769.f48335);
            c14769 = c14769.f48336;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2609(C19113 c19113) {
        c19113.f61857 = m9867(c19113.f61857);
        this.f9840 = c19113;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1509(C10360 c10360) {
        c10360.f32979 = m9867(c10360.f32979);
        c10360.f32980 = (AbstractC22295) mo8479(c10360.f32980);
        this.f9840 = c10360;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1953(C11852 c11852) {
        c11852.f38181 = mo8479(c11852.f38181);
        this.f9840 = c11852;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1505(C7926 c7926) {
        c7926.f26341 = (C4395) mo8479(c7926.f26341);
        C14769 c14769 = c7926.f26343;
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c147610.f48335 = mo8479((C16239) c147610.f48335);
        }
        c7926.f26343 = c14769;
        c7926.f26348 = (AbstractC22295) mo8479(c7926.f26348);
        c7926.f26347 = m9867(c7926.f26347);
        c7926.f26344 = m9867(c7926.f26344);
        this.f9840 = c7926;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1503(C6633 c6633) {
        c6633.f22144 = (C4395) mo8479(c6633.f22144);
        c6633.f22147 = (AbstractC22295) mo8479(c6633.f22147);
        C14769 c14769 = c6633.f22154;
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c147610.f48335 = mo8479((C16239) c147610.f48335);
        }
        c6633.f22154 = c14769;
        c6633.f22149 = (C12510) mo8479(c6633.f22149);
        C14769 c147611 = c6633.f22145;
        m9868(c147611);
        c6633.f22145 = c147611;
        c6633.f22146 = m9867(c6633.f22146);
        c6633.f22148 = (C4197) mo8479(c6633.f22148);
        this.f9840 = c6633;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1513(C12510 c12510) {
        c12510.f40170 = (C4395) mo8479(c12510.f40170);
        c12510.f40169 = (AbstractC22295) mo8479(c12510.f40169);
        c12510.f40166 = (AbstractC22295) mo8479(c12510.f40166);
        c12510.f40171 = (AbstractC22295) mo8479(c12510.f40171);
        this.f9840 = c12510;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1967(C22953 c22953) {
        this.f9840 = c22953;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1496(C4197 c4197) {
        c4197.f15344 = m9867(c4197.f15344);
        this.f9840 = c4197;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1507(C8671 c8671) {
        c8671.f28313 = (AbstractC19969) mo8479(c8671.f28313);
        c8671.f28314 = (AbstractC22295) mo8479(c8671.f28314);
        this.f9840 = c8671;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1502(C6545 c6545) {
        c6545.f21979 = (AbstractC22295) mo8479(c6545.f21979);
        c6545.f21978 = (AbstractC19969) mo8479(c6545.f21978);
        this.f9840 = c6545;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1522(C20057 c20057) {
        c20057.f64457 = m9867(c20057.f64457);
        c20057.f64458 = (AbstractC22295) mo8479(c20057.f64458);
        c20057.f64455 = m9867(c20057.f64455);
        c20057.f64456 = (AbstractC19969) mo8479(c20057.f64456);
        this.f9840 = c20057;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1504(C7180 c7180) {
        c7180.f23710 = (C12510) mo8479(c7180.f23710);
        c7180.f23711 = (AbstractC22295) mo8479(c7180.f23711);
        c7180.f23709 = (AbstractC19969) mo8479(c7180.f23709);
        this.f9840 = c7180;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1520(C17073 c17073) {
        c17073.f55742 = (AbstractC19969) mo8479(c17073.f55742);
        this.f9840 = c17073;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1517(C15493 c15493) {
        c15493.f50422 = (AbstractC22295) mo8479(c15493.f50422);
        C14769 c14769 = c15493.f50421;
        m9869(c14769);
        c15493.f50421 = c14769;
        this.f9840 = c15493;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo2611(C21351 c21351) {
        c21351.f68007 = m9867(c21351.f68007);
        c21351.f68009 = m9867(c21351.f68009);
        this.f9840 = c21351;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1514(C13256 c13256) {
        c13256.f42352 = (AbstractC22295) mo8479(c13256.f42352);
        C14769 c14769 = c13256.f42355;
        m9869(c14769);
        c13256.f42355 = c14769;
        this.f9840 = c13256;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1948(C5799 c5799) {
        c5799.f19919 = (AbstractC22295) mo8479(c5799.f19919);
        c5799.f19918 = (C4197) mo8479(c5799.f19918);
        this.f9840 = c5799;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1511(C11764 c11764) {
        c11764.f38023 = m9867(c11764.f38023);
        c11764.f38022 = (C4197) mo8479(c11764.f38022);
        C14769 c14769 = c11764.f38025;
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c147610.f48335 = mo8479((C0468) c147610.f48335);
        }
        c11764.f38025 = c14769;
        c11764.f38024 = (C4197) mo8479(c11764.f38024);
        this.f9840 = c11764;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2601(C0468 c0468) {
        c0468.f2080 = (C12510) mo8479(c0468.f2080);
        c0468.f2079 = (C4197) mo8479(c0468.f2079);
        this.f9840 = c0468;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1508(C10162 c10162) {
        c10162.f32546 = (AbstractC22295) mo8479(c10162.f32546);
        c10162.f32544 = (AbstractC22295) mo8479(c10162.f32544);
        c10162.f32545 = (AbstractC22295) mo8479(c10162.f32545);
        this.f9840 = c10162;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1492(C2158 c2158) {
        c2158.f7114 = (AbstractC22295) mo8479(c2158.f7114);
        c2158.f7115 = (AbstractC19969) mo8479(c2158.f7115);
        c2158.f7116 = (AbstractC19969) mo8479(c2158.f7116);
        this.f9840 = c2158;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1952(C11106 c11106) {
        c11106.f35018 = (AbstractC22295) mo8479(c11106.f35018);
        this.f9840 = c11106;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1515(C14637 c14637) {
        this.f9840 = c14637;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1497(C4307 c4307) {
        c4307.f15611 = (AbstractC22295) mo8479(c4307.f15611);
        this.f9840 = c4307;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1490(C1214 c1214) {
        this.f9840 = c1214;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1510(C11018 c11018) {
        c11018.f34795 = (AbstractC22295) mo8479(c11018.f34795);
        this.f9840 = c11018;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1491(C2070 c2070) {
        c2070.f6892 = (AbstractC22295) mo8479(c2070.f6892);
        this.f9840 = c2070;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1494(C3451 c3451) {
        c3451.f11254 = (AbstractC22295) mo8479(c3451.f11254);
        c3451.f11255 = (AbstractC22295) mo8479(c3451.f11255);
        this.f9840 = c3451;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1527(C24533 c24533) {
        c24533.f79554 = (AbstractC22295) mo8479(c24533.f79554);
        c24533.f79555 = m9867(c24533.f79555);
        this.f9840 = c24533;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1521(C18565 c18565) {
        c18565.f60321 = (AbstractC22295) mo8479(c18565.f60321);
        c18565.f60323 = (AbstractC22295) mo8479(c18565.f60323);
        c18565.f60325 = m9867(c18565.f60325);
        c18565.f60319 = (C7926) mo8479(c18565.f60319);
        this.f9840 = c18565;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1518(C16327 c16327) {
        c16327.f52999 = m9867(c16327.f52999);
        c16327.f53001 = mo8479(c16327.f53001);
        this.f9840 = c16327;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1524(C21549 c21549) {
        c21549.f68828 = m9867(c21549.f68828);
        C14769 c14769M35543 = C14769.m35543();
        Iterator it = c21549.f68831.iterator();
        while (it.hasNext()) {
            c14769M35543 = c14769M35543.m35546((Object) m9867((C14769) it.next()));
        }
        c21549.f68831 = c14769M35543;
        c21549.f68829 = (AbstractC22295) mo8479(c21549.f68829);
        c21549.f68830 = m9867(c21549.f68830);
        c21549.f68827 = m9867(c21549.f68827);
        this.f9840 = c21549;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1945(C1412 c1412) {
        c1412.f4986 = (AbstractC22295) mo8479(c1412.f4986);
        this.f9840 = c1412;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1523(C20605 c20605) {
        c20605.f66030 = (AbstractC22295) mo8479(c20605.f66030);
        c20605.f66031 = (AbstractC22295) mo8479(c20605.f66031);
        this.f9840 = c20605;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1512(C12400 c12400) {
        c12400.f39896 = (AbstractC22295) mo8479(c12400.f39896);
        c12400.f39895 = (AbstractC22295) mo8479(c12400.f39895);
        this.f9840 = c12400;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1495(C3561 c3561) {
        c3561.f12203 = (AbstractC22295) mo8479(c3561.f12203);
        this.f9840 = c3561;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1501(C6435 c6435) {
        c6435.f21672 = (AbstractC22295) mo8479(c6435.f21672);
        c6435.f21671 = (AbstractC22295) mo8479(c6435.f21671);
        this.f9840 = c6435;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1963(C16985 c16985) {
        c16985.f55514 = mo8479(c16985.f55514);
        c16985.f55515 = (AbstractC22295) mo8479(c16985.f55515);
        this.f9840 = c16985;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1974(C25279 c25279) {
        c25279.f81646 = (AbstractC22295) mo8479(c25279.f81646);
        c25279.f81647 = mo8479(c25279.f81647);
        this.f9840 = c25279;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1526(C24335 c24335) {
        c24335.f78930 = (C12510) mo8479(c24335.f78930);
        this.f9840 = c24335;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2606(C9416 c9416) {
        this.f9840 = c9416;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1951(C9614 c9614) {
        c9614.f31095 = (AbstractC2903) mo8479(c9614.f31095);
        this.f9840 = c9614;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1956(C13344 c13344) {
        c13344.f42553 = (AbstractC2903) mo8479(c13344.f42553);
        c13344.f42552 = (AbstractC22295) mo8479(c13344.f42552);
        this.f9840 = c13344;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1960(C16129 c16129) {
        c16129.f52413 = (AbstractC22295) mo8479(c16129.f52413);
        c16129.f52412 = (AbstractC22295) mo8479(c16129.f52412);
        this.f9840 = c16129;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1525(C23041 c23041) {
        c23041.f74776 = (AbstractC22295) mo8479(c23041.f74776);
        this.f9840 = c23041;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1954(C12598 c12598) {
        c12598.f40436 = (AbstractC22295) mo8479(c12598.f40436);
        this.f9840 = c12598;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1500(C5887 c5887) {
        this.f9840 = c5887;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1970(C23787 c23787) {
        this.f9840 = c23787;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1958(C14089 c14089) {
        this.f9840 = c14089;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1968(C23589 c23589) {
        c23589.f76594 = (AbstractC22295) mo8479(c23589.f76594);
        this.f9840 = c23589;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1973(C25191 c25191) {
        c25191.f81425 = (AbstractC22295) mo8479(c25191.f81425);
        c25191.f81424 = m9867(c25191.f81424);
        this.f9840 = c25191;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1969(C23699 c23699) {
        c23699.f76826 = m9867(c23699.f76826);
        this.f9840 = c23699;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1965(C17731 c17731) {
        c17731.f58264 = m9867(c17731.f58264);
        this.f9840 = c17731;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        c16239.f52783 = m9867(c16239.f52783);
        c16239.f52785 = m9867(c16239.f52785);
        this.f9840 = c16239;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1971(C24445 c24445) {
        c24445.f79358 = (C18477) mo8479(c24445.f79358);
        c24445.f79357 = mo8479(c24445.f79357);
        this.f9840 = c24445;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2608(C18477 c18477) {
        this.f9840 = c18477;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1957(C13891 c13891) {
        this.f9840 = c13891;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo2607(C14747 c14747) {
        c14747.f48161 = m9867(c14747.f48161);
        c14747.f48163 = (AbstractC22295) mo8479(c14747.f48163);
        this.f9840 = c14747;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2603(C4395 c4395) {
        C14769 c14769 = c4395.f15824;
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            c147610.f48335 = mo8479((C17621) c147610.f48335);
        }
        c4395.f15824 = c14769;
        this.f9840 = c4395;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1964(C17621 c17621) {
        c17621.f57962 = mo8479(c17621.f57962);
        c17621.f57964 = m9867(c17621.f57964);
        this.f9840 = c17621;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1519(C16875 c16875) {
        c16875.f55197 = m9867(c16875.f55197);
        c16875.f55198 = (AbstractC22295) mo8479(c16875.f55198);
        this.f9840 = c16875;
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
        throw new AssertionError(abstractC8036);
    }
}
