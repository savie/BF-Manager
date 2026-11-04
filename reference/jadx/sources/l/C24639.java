package l;

/* JADX INFO: renamed from: l.᩺᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes.dex */
public final class C24639 extends AbstractC9980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f79766 = "//";

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1779 f79767;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14941 f79768;

    public C24639(C14941 c14941, C1779 c1779) {
        this.f79768 = c14941;
        this.f79767 = c1779;
    }

    @Override // l.AbstractC9980
    public final void onScrolled(C25227 c25227, int i, int i2) {
        String strM35958 = this.f79768.m35958();
        if (C17359.equals(this.f79766, strM35958)) {
            return;
        }
        this.f79766 = strM35958;
        this.f79767.n(strM35958);
    }
}
