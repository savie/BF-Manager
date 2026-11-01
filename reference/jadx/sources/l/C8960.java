package l;

/* JADX INFO: renamed from: l.ۡܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: RA0U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8960 extends AbstractC23777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30697;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20954[] f30698;

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ܰ */
    public final void mo2371(C17426 c17426) {
        c17426.m40631(4);
        c17426.m40622(this.f30697);
        c17426.m40625(this.f30698);
        if (this.f30698 != null) {
            C17426 c17427 = c17426.f55444;
            int i = this.f30697;
            c17427.m40622(i);
            int i2 = c17427.f55443;
            c17427.m40624(i * 4);
            C17426 c17426M40629 = c17427.m40629(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f30698[i3].mo2371(c17426M40629);
            }
        }
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ۙ */
    public final void mo2370(C17426 c17426) throws C6137 {
        c17426.m40631(4);
        this.f30697 = c17426.m40623();
        if (c17426.m40623() != 0) {
            C17426 c17427 = c17426.f55444;
            int iM40623 = c17427.m40623();
            int i = c17427.f55443;
            c17427.m40624(iM40623 * 4);
            if (this.f30698 == null) {
                if (iM40623 < 0 || iM40623 > 65535) {
                    throw new C6137("invalid array conformance");
                }
                this.f30698 = new C20954[iM40623];
            }
            C17426 c17426M40629 = c17427.m40629(i);
            for (int i2 = 0; i2 < iM40623; i2++) {
                C20954[] c20954Arr = this.f30698;
                if (c20954Arr[i2] == null) {
                    c20954Arr[i2] = new C20954();
                }
                c20954Arr[i2].mo2370(c17426M40629);
            }
        }
    }
}
