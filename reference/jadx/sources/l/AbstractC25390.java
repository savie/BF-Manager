package l;

/* JADX INFO: renamed from: l.᩻᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25390 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17184 f81964;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f81965;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16438 f81966;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f81967 = -1;

    /* JADX INFO: renamed from: ۙ */
    public void mo29939() {
    }

    /* JADX INFO: renamed from: ۫ */
    public boolean mo29940(InterfaceC11217 interfaceC11217) {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo7700();

    public AbstractC25390(AbstractC17184 abstractC17184, InterfaceC16438 interfaceC16438) {
        this.f81964 = abstractC17184;
        this.f81966 = interfaceC16438;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56748(boolean z) {
        if (z == this.f81965) {
            return;
        }
        this.f81965 = z;
        int i = z ? 1 : -1;
        AbstractC17184 abstractC17184 = this.f81964;
        abstractC17184.m40347(i);
        if (this.f81965) {
            abstractC17184.m40352(this);
        }
    }
}
