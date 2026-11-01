package l;

/* JADX INFO: renamed from: l.᩵ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: RA0U */
/* JADX INFO: loaded from: classes5.dex */
public final class C19543 extends AbstractC23777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7548[] f62818;

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ܰ */
    public final void mo2371(C17426 c17426) {
        c17426.m40631(4);
        c17426.m40622(this.f62817);
        c17426.m40625(this.f62818);
        if (this.f62818 != null) {
            C17426 c17427 = c17426.f55444;
            int i = this.f62817;
            c17427.m40622(i);
            int i2 = c17427.f55443;
            c17427.m40624(i * 4);
            C17426 c17426M40629 = c17427.m40629(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f62818[i3].mo2371(c17426M40629);
            }
        }
    }

    @Override // l.AbstractC23777
    /* JADX INFO: renamed from: ۙ */
    public final void mo2370(C17426 c17426) throws C6137 {
        c17426.m40631(4);
        this.f62817 = c17426.m40623();
        if (c17426.m40623() != 0) {
            C17426 c17427 = c17426.f55444;
            int iM40623 = c17427.m40623();
            int i = c17427.f55443;
            c17427.m40624(iM40623 * 4);
            if (this.f62818 == null) {
                if (iM40623 < 0 || iM40623 > 65535) {
                    throw new C6137("invalid array conformance");
                }
                this.f62818 = new C7548[iM40623];
            }
            C17426 c17426M40629 = c17427.m40629(i);
            for (int i2 = 0; i2 < iM40623; i2++) {
                C7548[] c7548Arr = this.f62818;
                if (c7548Arr[i2] == null) {
                    c7548Arr[i2] = new C7548();
                }
                c7548Arr[i2].mo2370(c17426M40629);
            }
        }
    }
}
