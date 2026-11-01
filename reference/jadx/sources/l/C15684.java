package l;

/* JADX INFO: renamed from: l.ܺۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15684 extends AbstractC12156 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4603 f50923;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17094 f50924;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13713 f50925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4603 f50926;

    @Override // l.AbstractC12156
    /* JADX INFO: renamed from: ܰ */
    public final void mo30243() {
        Object obj = this.f50923.f16299;
        C6171.m17176(((C16389) obj).f52735.m43728() % 2 == 0);
        ((C16389) obj).f52735.m43723(Integer.valueOf(this.f50924.f54548.m25383()));
        mo30242();
    }

    @Override // l.AbstractC12156
    /* JADX INFO: renamed from: ۨ */
    public final void mo30242() {
        C21452 c21452 = this.f50925.f45218;
        if (c21452 != null) {
            this.f50924.m39907(c21452, this.f50926, 2);
        }
    }

    @Override // l.AbstractC12156
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo30240() {
        return this.f50925.f45218 != null;
    }

    @Override // l.AbstractC12156
    /* JADX INFO: renamed from: ۙ */
    public final void mo30241() {
        C21452 c21452 = this.f50925.f45218;
        if (c21452 == null || (c21452.f69739 & 131072) == 0) {
            return;
        }
        ((C16389) this.f50923.f16299).f52738 = null;
    }

    public C15684(C17094 c17094, C4603 c4603, C13713 c13713, C4603 c4604) {
        this.f50924 = c17094;
        this.f50923 = c4603;
        this.f50925 = c13713;
        this.f50926 = c4604;
    }
}
