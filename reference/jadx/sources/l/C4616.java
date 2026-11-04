package l;

/* JADX INFO: renamed from: l.ۙۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N44J */
/* JADX INFO: loaded from: classes3.dex */
public final class C4616 extends AbstractC19532 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15056 f16360;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11764 f16361;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3168 f16362;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3168 f16363;

    @Override // l.AbstractC19532
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14420() {
        Object obj = this.f16363.f10272;
        C11972.m30026(((C22516) obj).f72833.m43094() % 2 == 0);
        ((C22516) obj).f72833.m43089(Integer.valueOf(this.f16360.f49150.m23892()));
        mo14419();
    }

    @Override // l.AbstractC19532
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo14419() {
        C4197 c4197 = this.f16361.f38024;
        if (c4197 != null) {
            this.f16360.m36241(c4197, this.f16362, 2);
        }
    }

    @Override // l.AbstractC19532
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo14421() {
        return this.f16361.f38024 != null;
    }

    @Override // l.AbstractC19532
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14418() {
        C4197 c4197 = this.f16361.f38024;
        if (c4197 == null || (c4197.f15345 & 131072) == 0) {
            return;
        }
        ((C22516) this.f16363.f10272).f72830 = null;
    }

    public C4616(C15056 c15056, C3168 c3168, C11764 c11764, C3168 c3169) {
        this.f16360 = c15056;
        this.f16363 = c3168;
        this.f16361 = c11764;
        this.f16362 = c3169;
    }
}
