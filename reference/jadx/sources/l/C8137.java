package l;

/* JADX INFO: renamed from: l.۟᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Z2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8137 extends AbstractC10373 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f26846 = C16980.m40037(C8137.class);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C19567 f26847;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15091 f26848;

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9627 mo22016() throws C20728 {
        C1337 c1337 = ((C12523) m26678()).f40200;
        String strM4914 = c1337.m4914();
        String path = c1337.m4922().getPath();
        if (path.lastIndexOf(47) != path.length() - 1) {
            throw new C20728(c1337.m4922() + " directory must end with '/'");
        }
        if (strM4914.lastIndexOf(92) != strM4914.length() - 1) {
            throw new C20728(strM4914.concat(" UNC must end with '\\'"));
        }
        C19457 c19457M26677 = m26677();
        this.f26847 = new C19567(c19457M26677.m44979());
        try {
            c19457M26677.m44971(new C22551(c19457M26677.m44979(), strM4914, "*", 22, ((C14826) c19457M26677.m44979()).m35742(), ((C14826) c19457M26677.m44979()).m35728() - 100), this.f26847, new EnumC13269[0]);
            this.f26848 = new C15091(this.f26847.m45157(), this.f26847.m45158(), ((C14826) c19457M26677.m44979()).m35742(), ((C14826) c19457M26677.m44979()).m35728() - 100, this.f26847.m45159(), c19457M26677.m44979());
            this.f26847.m5380((byte) 2);
            InterfaceC9627 interfaceC9627M26675 = m26675(false);
            if (interfaceC9627M26675 == null) {
                m26676();
            }
            return interfaceC9627M26675;
        } catch (C20728 e) {
            C19567 c19567 = this.f26847;
            if (c19567 != null && c19567.mo12784() && e.m47408() == -1073741809) {
                m26676();
                return null;
            }
            throw e;
        }
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9627[] mo22015() {
        return this.f26847.m5377();
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo22014() throws C20728 {
        this.f26848.m36352(this.f26847.m45158(), this.f26847.m45159());
        this.f26847.reset();
        try {
            m26677().m44971(this.f26848, this.f26847, new EnumC13269[0]);
            return this.f26847.m5375() != -2147483642;
        } catch (C20728 e) {
            if (e.m47408() == -2147483642) {
                f26846.mo13711("No more entries", e);
                return false;
            }
            throw e;
        }
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo22017() {
        return this.f26847.m45160();
    }

    @Override // l.AbstractC10373
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo22018() {
        try {
            C19457 c19457M26677 = m26677();
            if (this.f26847 != null) {
                c19457M26677.m44971(new C0988(c19457M26677.m44979(), this.f26847.m45157()), new C18141(c19457M26677.m44979()), new EnumC13269[0]);
            }
        } catch (C20728 e) {
            f26846.mo13711("SmbComFindClose2 failed", e);
        }
    }
}
