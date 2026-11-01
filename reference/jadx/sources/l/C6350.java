package l;

/* JADX INFO: renamed from: l.ۛ᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes2.dex */
public final class C6350 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f21409;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11290 f21410;

    public C6350(C11290 c11290) {
        this.f21410 = c11290;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17458(final C13314 c13314) {
        C10471 c10471 = new C10471();
        c10471.m26525(c13314.f44194);
        c10471.m26534(c13314.f44193);
        c10471.m26533("video/raw");
        this.f21409 = c10471.m26497();
        this.f21410.f38124.execute(new Runnable() { // from class: l.ܿ᩹ܰ
            @Override // java.lang.Runnable
            public final void run() {
                this.f56073.f21410.f38126.mo7956(c13314);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17457(long j, long j2, boolean z) {
        C11290 c11290 = this.f21410;
        if (z && c11290.f38120 != null) {
            c11290.f38124.execute(new Runnable() { // from class: l.ܽ᩹ܰ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54133.f21410.f38126.mo7957();
                }
            });
        }
        C7648 c7648M26497 = this.f21409;
        if (c7648M26497 == null) {
            c7648M26497 = new C10471().m26497();
        }
        c11290.f38119.mo2526(j2, j, c7648M26497, null);
        ((InterfaceC22308) c11290.f38127.remove()).mo10388(j);
    }
}
