package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4073 implements InterfaceC24957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f13909 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f13910;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14513 f13911;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13912;

    public C4073(C14513 c14513, C4819 c4819) {
        this.f13911 = c14513;
        this.f13910 = c4819.m14850();
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13155(int i) {
        long j = this.f13909 + ((long) i);
        this.f13909 = j;
        long j2 = this.f13910;
        if (j2 > 0) {
            this.f13911.f45654.m25927(j, j2);
        }
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo13157(int i) {
        boolean z = this.f13912;
        C14513 c14513 = this.f13911;
        if (!z) {
            this.f13912 = true;
            c14513.f45654.m25920(R.string.MT_Protector);
        }
        c14513.f45654.m25925(i);
    }

    @Override // l.InterfaceC24957
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo13156() {
        return this.f13911.f45654.m27399();
    }
}
