package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C3146 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18808 f10203;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19113 f10204;

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5474(AbstractC8036 abstractC8036) {
        super.mo5474(abstractC8036);
        if (abstractC8036 != null) {
            abstractC8036.f26659 = null;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2609(final C19113 c19113) {
        if (c19113.f61858 != null) {
            if (c19113.f61856.mo10886("package-info", EnumC17468.SOURCE)) {
                c19113.f61858.f44617.m54833();
            }
            c19113.f61858.m34260();
        }
        if (c19113.f61856.mo10886("module-info", EnumC17468.SOURCE)) {
            C2920 c2920 = c19113.f61859;
            c2920.f9543 = null;
            c2920.f9551 = null;
            c2920.f9546 = null;
            c2920.f9557 = null;
            c2920.f9560 = null;
            c2920.f9554 = null;
            c2920.f38070 = new InterfaceC14852() { // from class: l.ܶۘۘ
                @Override // l.InterfaceC14852
                /* JADX INFO: renamed from: ۤ */
                public final /* synthetic */ boolean mo11630() {
                    return false;
                }

                @Override // l.InterfaceC14852
                /* JADX INFO: renamed from: ۙ */
                public final void mo11629(AbstractC11781 abstractC11781) {
                    C19881 c19881 = this.f51465.f10203.f61103;
                    C19113 c19114 = c19113;
                    c19881.m45777(c19114.f61859.f9544, C14769.of((Object) c19114));
                }
            };
            c2920.f9544.m54833();
            C24550 c24550 = c19113.f61859.f9544;
            c24550.f79576 = AbstractC17836.m41689(c24550);
        }
        c19113.f61858 = null;
        this.f10204 = c19113;
        try {
            m52092(c19113.f61857);
        } finally {
            this.f10204 = null;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        super.mo1505(c7926);
        C14769 c14769M35543 = C14769.m35543();
        C14769 c14769 = c7926.f26344;
        while (c14769.m35550() && !((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68505)) {
            c14769M35543 = c14769M35543.m35552((AbstractC8036) c14769.f48335);
            c14769 = c14769.f48336;
        }
        if (c14769.m35550() && (((C6633) c14769.f48335).f22144.f15825 & 68719476736L) != 0) {
            C14769 c14769M35552 = c14769.f48336;
            while (c14769M35543.m35550()) {
                c14769M35552 = c14769M35552.m35552((AbstractC8036) c14769M35543.f48335);
                c14769M35543 = c14769M35543.f48336;
            }
            c7926.f26344 = c14769M35552;
        }
        C24550 c24550 = c7926.f26345;
        if (c24550 != null) {
            c24550.f38070 = new C3892(this.f10203, this.f10204);
            Iterator it = c24550.m54835().iterator();
            while (it.hasNext()) {
                C1170.stream(((C22224) it.next()).m50283()).forEach(new Consumer() { // from class: l.᩹ۘۘ
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        this.f75441.mo1964((C17621) obj);
                    }
                });
            }
            c7926.f26345.f79583 = C14769.m35543();
        }
        c7926.f26345 = null;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        C10377 c10377;
        if (C11239.m28348(c6633) && (c10377 = c6633.f22152) != null && c10377.f38069.m29588() && c6633.f22148.f15344.m35550() && C11239.m28343((AbstractC8036) c6633.f22148.f15344.f48335)) {
            C4197 c4197 = c6633.f22148;
            C14769 c14769 = c4197.f15344;
            if (((AbstractC19969) c14769.f48335).f26658 == c4197.f26658) {
                c4197.f15344 = c14769.f48336;
            }
        }
        c6633.f22152 = null;
        super.mo1503(c6633);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        c12510.f40168 = null;
        super.mo1513(c12510);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        c18565.f60318 = null;
        super.mo1521(c18565);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        c12400.f62402 = null;
        super.mo1512(c12400);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        c3561.f62402 = null;
        mo5474(c3561.f12203);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        c6435.f62402 = null;
        super.mo1501(c6435);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        c23041.f74775 = null;
        mo5474(c23041.f74776);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        c5887.f20170 = null;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
        c17621.f57963 = null;
        super.mo1964(c17621);
    }

    public C3146(C18808 c18808) {
        this.f10203 = c18808;
    }
}
