package l;

/* JADX INFO: renamed from: l.ۚ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6JU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5326 implements InterfaceC0073 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17258 f18724;

    public C5326(C17258 c17258) {
        this.f18724 = c17258;
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public final void mo1128(String str) {
        C24718 c24718 = this.f18724.f56222;
        this.f18724.f56222 = null;
        if (c24718 == null || this.f18724.f56223 != c24718 || c24718.f80010) {
            return;
        }
        c24718.f80026 = str;
        C21576.f68931.edit().putString("hpdd", str).apply();
        c24718.f80020.mo52335((CharSequence) str);
        C23255 c23255 = c24718.f80020;
        c23255.mo52339(c23255.m54099());
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public final void mo1127() {
        this.f18724.f56222 = null;
    }
}
