package l;

/* JADX INFO: renamed from: l.ܽܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 9A0K */
/* JADX INFO: loaded from: classes4.dex */
public final class C16721 extends AbstractC23777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20249[] f53552;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53553;

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ܰ */
    public final void mo2371(C17426 c17426) {
        c17426.m40631(4);
        c17426.m40622(this.f53553);
        c17426.m40625(this.f53552);
        if (this.f53552 != null) {
            C17426 c17427 = c17426.f55444;
            int i = this.f53553;
            c17427.m40622(i);
            int i2 = c17427.f55443;
            c17427.m40624(i * 4);
            C17426 c17426M40629 = c17427.m40629(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f53552[i3].mo2371(c17426M40629);
            }
        }
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ۙ */
    public final void mo2370(C17426 c17426) throws C6137 {
        c17426.m40631(4);
        this.f53553 = c17426.m40623();
        if (c17426.m40623() != 0) {
            C17426 c17427 = c17426.f55444;
            int iM40623 = c17427.m40623();
            int i = c17427.f55443;
            c17427.m40624(iM40623 * 4);
            if (this.f53552 == null) {
                if (iM40623 < 0 || iM40623 > 65535) {
                    throw new C6137("invalid array conformance");
                }
                this.f53552 = new C20249[iM40623];
            }
            C17426 c17426M40629 = c17427.m40629(i);
            for (int i2 = 0; i2 < iM40623; i2++) {
                C20249[] c20249Arr = this.f53552;
                if (c20249Arr[i2] == null) {
                    c20249Arr[i2] = new C20249();
                }
                c20249Arr[i2].mo2370(c17426M40629);
            }
        }
    }
}
