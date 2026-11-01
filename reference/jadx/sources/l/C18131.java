package l;

/* JADX INFO: renamed from: l.ᩳܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18131 extends AbstractC23071 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f57974;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f57975;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C11077 f57976;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10371 f57977;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f57978;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f57979;

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ۙ */
    public final int mo37991() {
        return 21;
    }

    public C18131(String str) {
        C10371 c10371 = new C10371();
        C11077 c11077 = new C11077();
        c11077.f37603 = 0;
        this.f57975 = str;
        this.f57979 = 200;
        this.f57978 = 65535;
        this.f57977 = c10371;
        this.f57976 = c11077;
        c10371.f35542 = 200;
        c10371.f35541 = new C8960();
        this.f74953 = 0;
        this.f74952 = 3;
    }

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ᩹ */
    public final void mo37992(C17426 c17426) {
        C11077 c11077 = this.f57976;
        c17426.m40626(this.f57975);
        c17426.m40622(this.f57979);
        c17426.m40622(this.f57978);
        c17426.m40625(this.f57977);
        C10371 c10371 = this.f57977;
        if (c10371 != null) {
            c10371.mo2371(c17426);
        }
        c17426.m40625(c11077);
        if (c11077 != null) {
            c17426.m40622(c11077.f37603);
        }
    }

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ۖ */
    public final void mo37990(C17426 c17426) {
        if (c17426.m40623() != 0) {
            if (this.f57977 == null) {
                this.f57977 = new C10371();
            }
            this.f57977.mo2370(c17426);
        }
        if (c17426.m40623() != 0) {
            C11077 c11077 = this.f57976;
            c11077.getClass();
            c11077.f37603 = c17426.m40623();
        }
        this.f57974 = c17426.m40623();
    }
}
