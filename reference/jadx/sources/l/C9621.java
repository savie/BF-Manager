package l;

import android.view.Choreographer;

/* JADX INFO: renamed from: l.ۢܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C9621 extends AbstractC14560 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Choreographer.FrameCallback f32408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Choreographer f32409;

    public C9621(C11032 c11032) {
        super(c11032);
        this.f32409 = Choreographer.getInstance();
        this.f32408 = new ChoreographerFrameCallbackC1858(this);
    }

    @Override // l.AbstractC14560
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo24530() {
        this.f32409.postFrameCallback(this.f32408);
    }
}
