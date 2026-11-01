package l;

/* JADX INFO: renamed from: l.۬ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12824 implements InterfaceC12783 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19133 f42694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15916 f42695;

    public AbstractC12824(AbstractC10708 abstractC10708) {
        this.f42694 = abstractC10708;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC6432 mo31749() {
        return this.f42694.mo1522();
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܰ */
    public InterfaceC17721 mo31754() {
        return this.f42694.mo1537();
    }

    @Override // l.InterfaceC12783
    public InterfaceC19133 getType() {
        return this.f42694;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۗ */
    public final C15916 mo31747() {
        return this.f42695;
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ᩳܰ */
    public final String mo31757() {
        return this.f42695.m37865();
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ܰܰ */
    public final String mo31755() {
        return getType().getTypeName() + this.f42695.m37865();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m31827() {
        return new C0828(this);
    }

    @Override // l.InterfaceC12783
    public final String getPath() {
        return getType().getPath() + this.f42695.m37865();
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC7138
    /* JADX INFO: renamed from: ۙ */
    public final void mo10755(InterfaceC7138 interfaceC7138) {
        InterfaceC12783 interfaceC12783 = (InterfaceC12783) interfaceC7138;
        if (!C13638.equals(this.f42695, interfaceC12783.mo31747())) {
            throw new RuntimeException(getPath() + " " + interfaceC12783.getPath());
        }
        try {
            C11018 c11018 = new C11018();
            this.f42695.m37863(c11018);
            C12429 c12429 = new C12429(c11018.m27788());
            if (!C15916.m37841(c12429.m30888(0), this.f42695.m37862()).equals(this.f42695)) {
                try {
                    C11018 c11019 = new C11018();
                    this.f42695.m37863(c11019);
                    throw new RuntimeException(this.f42695.m37865() + " " + C15916.m37841(new C12429(c11019.m27788()).m30888(0), this.f42695.m37862()).m37865());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (mo31750() != interfaceC12783.mo31750()) {
                throw new RuntimeException(getPath());
            }
            if (mo31748() != interfaceC12783.mo31748()) {
                throw new RuntimeException(getPath());
            }
            for (int i = 0; i <= mo31751(); i++) {
                if (mo31756(i)) {
                    if (!interfaceC12783.mo31756(i)) {
                        throw new RuntimeException(getPath());
                    }
                    mo31753(i).mo10755(interfaceC12783.mo31753(i));
                } else if (interfaceC12783.mo31756(i)) {
                    throw new RuntimeException(getPath());
                }
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l.InterfaceC12783
    /* JADX INFO: renamed from: ۖ */
    public Iterable mo31746() {
        return m31827();
    }
}
