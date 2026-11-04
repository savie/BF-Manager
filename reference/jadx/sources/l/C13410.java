package l;

/* JADX INFO: renamed from: l.۫᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13410 implements InterfaceC14940 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3715 f42723;

    public C13410(C3715 c3715) {
        this.f42723 = c3715;
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18301(C3754 c3754) {
        C3715 c3715 = this.f42723;
        C15559 c15559 = c3715.f12764;
        C9002 c9002 = c3715.f12754;
        AbstractC22664 abstractC22664 = c3754.f69124;
        Object obj = c3754.f12872;
        if (abstractC22664.mo9097() == EnumC21172.CLASS) {
            C11972.m30026(obj instanceof String);
            c9002.m24017(115);
            c9002.m24022(C20035.m46076(c15559.f50605, c3715.f12767.f49864.m51194((String) obj)));
            return;
        }
        switch (C15647.f50810[abstractC22664.mo9097().ordinal()]) {
            case 1:
                c9002.m24017(66);
                break;
            case 2:
                c9002.m24017(67);
                break;
            case 3:
                c9002.m24017(83);
                break;
            case 4:
                c9002.m24017(73);
                break;
            case 5:
                c9002.m24017(74);
                break;
            case 6:
                c9002.m24017(70);
                break;
            case 7:
                c9002.m24017(68);
                break;
            case 8:
                c9002.m24017(90);
                break;
            default:
                throw new AssertionError(abstractC22664);
        }
        c9002.m24022(c15559.m37269(obj));
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18307(C20908 c20908) {
        C3715 c3715 = this.f42723;
        C9002 c9002 = c3715.f12754;
        c9002.m24017(101);
        C15559 c15559 = c3715.f12764;
        C5816 c5816 = c20908.f66917;
        c9002.m24022(c15559.m37276(c5816.f38067));
        c9002.m24022(C20035.m46076(c15559.f50605, c5816.f38072));
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18304(C16432 c16432) {
        C3715 c3715 = this.f42723;
        C9002 c9002 = c3715.f12754;
        c9002.m24017(99);
        c9002.m24022(c3715.f12764.m37276(c16432.f53314));
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18309(C23892 c23892) {
        C3715 c3715 = this.f42723;
        c3715.f12754.m24017(64);
        c3715.m12092(c23892);
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18303(C12703 c12703) {
        throw new AssertionError(c12703);
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18305(C17924 c17924) {
        C9002 c9002 = this.f42723.f12754;
        c9002.m24017(91);
        AbstractC21654[] abstractC21654Arr = c17924.f58709;
        c9002.m24022(abstractC21654Arr.length);
        for (AbstractC21654 abstractC21654 : abstractC21654Arr) {
            abstractC21654.mo12192(this);
        }
    }
}
