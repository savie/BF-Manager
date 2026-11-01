package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9761 extends AbstractC4511 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13685 f32820;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f32821 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1998 f32822;

    public C9761(C13685 c13685) {
        this.f32820 = c13685;
    }

    @Override // l.AbstractC4511
    /* JADX INFO: renamed from: ۙ */
    public final void mo10109(C1998 c1998) {
        C1998 c1999 = this.f32822;
        if (c1998 == c1999) {
            C1998 c19910 = c1999.f7457;
            this.f32822 = c19910;
            this.f32821 = c19910 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32821) {
            return this.f32820.f45148 != null;
        }
        C1998 c1998 = this.f32822;
        return (c1998 == null || c1998.f7460 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f32821) {
            this.f32821 = false;
            this.f32822 = this.f32820.f45148;
        } else {
            C1998 c1998 = this.f32822;
            this.f32822 = c1998 != null ? c1998.f7460 : null;
        }
        return this.f32822;
    }
}
