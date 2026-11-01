package l;

/* JADX INFO: renamed from: l.ۛۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes3.dex */
public class C5951 extends C22220 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f20240 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 f20241;

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ */
    public final void mo7248(AbstractC8774 abstractC8774) {
        if (abstractC8774 == null || this.f20240 != null) {
            return;
        }
        abstractC8774.mo1802(this);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3935(C10164 c10164) {
        if (c10164.f34721 == this.f20241) {
            this.f20240 = c10164;
        } else {
            m49334(c10164.f34727);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
        if (c18255.f58256 == this.f20241) {
            this.f20240 = c18255;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3930(C7672 c7672) {
        if (c7672.f25387 == this.f20241) {
            this.f20240 = c7672;
        } else {
            super.mo3930(c7672);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        if (c8753.f30086 == this.f20241) {
            this.f20240 = c8753;
        } else {
            super.mo1065(c8753);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        if (c23195.f75263 == this.f20241) {
            this.f20240 = c23195;
        } else {
            super.mo3961(c23195);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        if (c6656.f22475 == this.f20241) {
            this.f20240 = c6656;
        } else {
            super.mo3928(c6656);
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        AbstractC16579 abstractC16579 = c22179.f30190;
        if (abstractC16579 == null || abstractC16579.f53222 != this.f20241) {
            super.mo3958(c22179);
        } else {
            this.f20240 = c22179;
        }
    }

    public C5951(AbstractC23903 abstractC23903) {
        this.f20241 = abstractC23903;
    }
}
