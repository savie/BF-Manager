package l;

/* JADX INFO: renamed from: l.᩷᩸ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22343 implements InterfaceC2731 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15344 f72321;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20500 f72322;

    public AbstractC22343(AbstractC14883 abstractC14883) {
        this.f72321 = abstractC14883;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7206 mo9068() {
        return this.f72321.mo4329();
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۤ */
    public InterfaceC10869 mo9071() {
        return this.f72321.mo4332();
    }

    @Override // l.InterfaceC2731
    public InterfaceC15344 getType() {
        return this.f72321;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ۬ */
    public final C20500 mo9073() {
        return this.f72322;
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ܶ᩷ */
    public final String mo9074() {
        return this.f72322.m47027();
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ᩷᩷ */
    public final String mo9077() {
        return getType().getTypeName() + this.f72322.m47027();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m50412() {
        return new C5189(this);
    }

    @Override // l.InterfaceC2731
    public final String getPath() {
        return getType().getPath() + this.f72322.m47027();
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC1921
    /* JADX INFO: renamed from: ۙ */
    public final void mo6599(InterfaceC1921 interfaceC1921) {
        InterfaceC2731 interfaceC2731 = (InterfaceC2731) interfaceC1921;
        if (!C17359.equals(this.f72322, interfaceC2731.mo9073())) {
            throw new RuntimeException(getPath() + " " + interfaceC2731.getPath());
        }
        try {
            C6178 c6178 = new C6178();
            this.f72322.m47022(c6178);
            C3194 c3194 = new C3194(c6178.m17808());
            if (!C20500.m47001(c3194.m48157(0), this.f72322.m47021()).equals(this.f72322)) {
                try {
                    C6178 c6179 = new C6178();
                    this.f72322.m47022(c6179);
                    throw new RuntimeException(this.f72322.m47027() + " " + C20500.m47001(new C3194(c6179.m17808()).m48157(0), this.f72322.m47021()).m47027());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (mo9072() != interfaceC2731.mo9072()) {
                throw new RuntimeException(getPath());
            }
            if (mo9067() != interfaceC2731.mo9067()) {
                throw new RuntimeException(getPath());
            }
            for (int i = 0; i <= mo9069(); i++) {
                if (mo9075(i)) {
                    if (!interfaceC2731.mo9075(i)) {
                        throw new RuntimeException(getPath());
                    }
                    mo9076(i).mo6599(interfaceC2731.mo9076(i));
                } else if (interfaceC2731.mo9075(i)) {
                    throw new RuntimeException(getPath());
                }
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l.InterfaceC2731
    /* JADX INFO: renamed from: ᩸ */
    public Iterable mo9078() {
        return m50412();
    }
}
