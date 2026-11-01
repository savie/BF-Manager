package l;

/* JADX INFO: renamed from: l.ܶۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15038 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C15038 f49026 = new C22799().m50456();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f49027;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f49028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f49029;

    public C15038(C22799 c22799) {
        this.f49027 = c22799.f74189;
        this.f49029 = c22799.f74191;
        this.f49028 = c22799.f74190;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15038.class == obj.getClass()) {
            C15038 c15038 = (C15038) obj;
            if (this.f49027 == c15038.f49027 && this.f49029 == c15038.f49029 && this.f49028 == c15038.f49028) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49027 ? 1 : 0) << 2) + ((this.f49029 ? 1 : 0) << 1) + (this.f49028 ? 1 : 0);
    }
}
