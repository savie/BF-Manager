package l;

import android.view.Choreographer;

/* JADX INFO: renamed from: l.۠᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C8892 extends AbstractC9637 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Choreographer.FrameCallback f29053;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Choreographer f29054;

    public C8892(C10383 c10383) {
        super(c10383);
        this.f29054 = Choreographer.getInstance();
        this.f29053 = new ChoreographerFrameCallbackC2926(this);
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23783() {
        this.f29054.postFrameCallback(this.f29053);
    }
}
