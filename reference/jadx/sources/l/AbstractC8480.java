package l;

/* JADX INFO: renamed from: l.۠᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8480 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10597 f29396;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f29397;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19769 f29398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29399 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean mo22145(InterfaceC1423 interfaceC1423) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo22146() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo22148();

    public AbstractC8480(AbstractC19769 abstractC19769, InterfaceC10597 interfaceC10597) {
        this.f29398 = abstractC19769;
        this.f29396 = interfaceC10597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22147(boolean z) {
        if (z == this.f29397) {
            return;
        }
        this.f29397 = z;
        int i = z ? 1 : -1;
        AbstractC19769 abstractC19769 = this.f29398;
        abstractC19769.m44957(i);
        if (this.f29397) {
            abstractC19769.m44960(this);
        }
    }
}
