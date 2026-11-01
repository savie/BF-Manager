package l;

/* JADX INFO: renamed from: l.ۤ۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10164 extends AbstractC8774 implements InterfaceC15542 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7675 f34721;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1699 f34722;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9462 f34723;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC6323 f34724;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f34725;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC9831 f34726;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21825 f34727;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20045 f34728;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23153 f34729;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19670 f34730;

    public C10164() {
        throw null;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3935(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.COMPILATION_UNIT;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C18255 m25899() {
        for (AbstractC8774 abstractC8774 : this.f34727) {
            if (abstractC8774.m22847(EnumC18651.f60488)) {
                return (C18255) abstractC8774;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C7672 m25894() {
        if (this.f34727.isEmpty() || !((AbstractC8774) this.f34727.f70876).m22847(EnumC18651.f60503)) {
            return null;
        }
        return (C7672) this.f34727.f70876;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 m25898() {
        C7672 c7672M25894 = m25894();
        if (c7672M25894 != null) {
            return c7672M25894.f25385;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m25896() {
        C19003 c19003 = new C19003();
        for (AbstractC8774 abstractC8774 : this.f34727) {
            if (abstractC8774.m22847(EnumC18651.f60517)) {
                c19003.m43723((C14023) abstractC8774);
            } else if (!abstractC8774.m22847(EnumC18651.f60503) && !abstractC8774.m22847(EnumC18651.f60506)) {
                break;
            }
        }
        return c19003.m43726();
    }

    @Override // l.InterfaceC15542
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 mo25897() {
        return this.f34725;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m25895() {
        C21825 c21825 = this.f34727;
        while (!c21825.isEmpty() && (((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60488) || ((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60503) || ((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60517))) {
            c21825 = c21825.f70877;
        }
        return c21825;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1882(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60521;
    }
}
