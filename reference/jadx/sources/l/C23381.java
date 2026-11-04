package l;

/* JADX INFO: renamed from: l.᩹ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes.dex */
public class C23381 extends AbstractC6227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3989 f75687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f75688;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f75689;

    @Override // l.AbstractC6227
    /* JADX INFO: renamed from: ۙ */
    public void mo10602(String str) {
        C3989 c3989 = this.f75687;
        if (c3989.m12896()) {
            if (c3989.f13654.f65387) {
                c3989.f13651.drawText(str, this.f75689, this.f75688, c3989.f13654.f65381);
            }
            if (c3989.f13654.f65383) {
                c3989.f13651.drawText(str, this.f75689, this.f75688, c3989.f13654.f65386);
            }
        }
        this.f75689 = c3989.f13654.f65381.measureText(str) + this.f75689;
    }

    public C23381(C3989 c3989, float f, float f2) {
        this.f75687 = c3989;
        this.f75689 = f;
        this.f75688 = f2;
    }
}
