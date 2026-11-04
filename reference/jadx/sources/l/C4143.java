package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4143 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC17567 f14042;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24522 f14043;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6446 f14044;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f14045;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14583 f14046;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f14047;

    public C4143(C14583 c14583, boolean z, boolean z2, C24522 c24522, C6446 c6446) {
        this.f14046 = c14583;
        this.f14047 = z;
        this.f14045 = z2;
        this.f14043 = c24522;
        this.f14044 = c6446;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (this.f14047) {
            c4208.m13445();
            return null;
        }
        AbstractC17567 abstractC17567M54786 = this.f14042;
        if (abstractC17567M54786 == null) {
            abstractC17567M54786 = this.f14043.m54786(this.f14046, this.f14044);
            this.f14042 = abstractC17567M54786;
        }
        return abstractC17567M54786.mo3722(c4208);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        if (this.f14045) {
            c21362.m48598();
            return;
        }
        AbstractC17567 abstractC17567M54786 = this.f14042;
        if (abstractC17567M54786 == null) {
            abstractC17567M54786 = this.f14043.m54786(this.f14046, this.f14044);
            this.f14042 = abstractC17567M54786;
        }
        abstractC17567M54786.mo3723(c21362, obj);
    }
}
