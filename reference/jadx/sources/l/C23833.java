package l;

/* JADX INFO: renamed from: l.᩹᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23833 implements InterfaceC0085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f77181;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1255 f77182;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f77183;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f77184;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20852 f77185;

    public C23833(C1255 c1255, AbstractActivityC17204 abstractActivityC17204, ActivityC20852 activityC20852, DialogInterfaceC8327 dialogInterfaceC8327, boolean[] zArr) {
        this.f77183 = zArr;
        this.f77185 = activityC20852;
        this.f77181 = abstractActivityC17204;
        this.f77184 = dialogInterfaceC8327;
        this.f77182 = c1255;
    }

    @Override // l.InterfaceC0085
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1154() {
        final boolean[] zArr = this.f77183;
        zArr[0] = true;
        ActivityC20852 activityC20852 = this.f77185;
        if (activityC20852 != null) {
            activityC20852.m47678(true);
        }
        final C1255 c1255 = this.f77182;
        final AbstractActivityC17204 abstractActivityC17204 = this.f77181;
        final ActivityC20852 activityC20853 = this.f77185;
        final DialogInterfaceC8327 dialogInterfaceC8327 = this.f77184;
        abstractActivityC17204.m40399(new Runnable() { // from class: l.ܶ᩸ۚ
            @Override // java.lang.Runnable
            public final void run() {
                zArr[0] = false;
                ActivityC20852 activityC20854 = activityC20853;
                if (activityC20854 != null) {
                    activityC20854.m47678(false);
                }
                if (dialogInterfaceC8327.m22434() && C7756.m21107(abstractActivityC17204)) {
                    c1255.setChecked(true);
                }
            }
        });
    }

    @Override // l.InterfaceC0085
    /* JADX INFO: renamed from: ۙ */
    public final void mo1153() {
        boolean[] zArr = this.f77183;
        if (zArr[0]) {
            zArr[0] = false;
            this.f77181.m40399((Runnable) null);
            ActivityC20852 activityC20852 = this.f77185;
            if (activityC20852 != null) {
                activityC20852.m47678(false);
            }
        }
    }
}
