package l;

/* JADX INFO: renamed from: l.۠ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8557 extends AbstractC14239 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14769 f27943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14769 f27944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f27945;

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4102(C5291 c5291, Object obj) {
        return m22965(c5291);
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1771(C17969 c17969, Object obj) {
        C14769 c14769 = this.f27943;
        C14769 c147610 = this.f27944;
        while (c14769.m35550()) {
            if (!c17969.m51074((AbstractC22664) c14769.f48335)) {
                c14769 = c14769.f48336;
                c147610 = c147610.f48336;
            } else {
                return ((AbstractC22664) c147610.f48335).mo27318(c17969);
            }
        }
        return c17969;
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC22664 mo4102(C5291 c5291, Object obj) {
        return m22965(c5291);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo1768(C10510 c10510, Void r5) {
        if (!c10510.mo18914()) {
            return super.mo1768(c10510, (Object) r5);
        }
        C24705 c24705 = this.f27945;
        AbstractC22664 abstractC22664M52682 = m52682(c24705.m55137(c10510));
        C14769 c14769M33663 = m33663(r5, c24705.m55144(c10510));
        return (abstractC22664M52682 == c24705.m55137(c10510) && c14769M33663 == c24705.m55144(c10510)) ? c10510 : c24705.m55138(c14769M33663.m35552(abstractC22664M52682));
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo1769(C10729 c10729, Void r3) {
        C10729 c107210 = (C10729) super.mo1769(c10729, (Object) r3);
        if (c107210 != c10729 && c10729.mo27317() && c107210.f34074.mo27317()) {
            c107210.f34074 = this.f27945.m55123(c107210.f34074);
        }
        return c107210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5291 m22965(C5291 c5291) {
        C14769 c14769 = c5291.f18620;
        C14769 c147610 = this.f27944;
        boolean zM51060 = AbstractC22664.m51060(c147610, c14769);
        C24705 c24705 = this.f27945;
        if (zM51060) {
            C14769 c14769M55134 = c24705.m55134(c14769);
            c5291 = new C5291(c24705.m55103(c5291.f72657, c14769, c14769M55134), c14769M55134);
        }
        AbstractC22664 abstractC22664 = c5291.f72657;
        C14769 c147611 = c5291.f18620;
        C14769 c14769M55155 = c24705.m55155(c147611, this.f27943, c147610);
        AbstractC22664 abstractC22664M52682 = m52682(abstractC22664);
        if (c14769M55155 == c147611 && abstractC22664M52682 == abstractC22664) {
            return c5291;
        }
        if (c14769M55155 == c147611) {
            return new C9302(abstractC22664M52682, c14769M55155);
        }
        return new C2591(c24705.m55103(abstractC22664M52682, c147611, c14769M55155), c14769M55155);
    }

    public C8557(C24705 c24705, C14769 c14769, C14769 c147610) {
        this.f27945 = c24705;
        int iM35551 = c14769.m35551();
        int iM35552 = c147610.m35551();
        while (iM35551 > iM35552) {
            iM35551--;
            c14769 = c14769.f48336;
        }
        while (iM35551 < iM35552) {
            iM35552--;
            c147610 = c147610.f48336;
        }
        this.f27943 = c14769;
        this.f27944 = c147610;
    }
}
