package l;

/* JADX INFO: renamed from: l.ܳۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes5.dex */
public final class C15247 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0310 f49731;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16437 f49732;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3168 f49733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11518 f49734;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23892 f49735;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14764 f49736;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22092 f49737;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23892 f49738;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        C3168 c3168 = this.f49733;
        this.f49733 = this.f49732.m38995(c7926.f26345);
        try {
            mo5474(c7926.f26341);
        } finally {
            this.f49733 = c3168;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
        AbstractC8036 abstractC8036 = c17621.f57962;
        AbstractC22664 abstractC22664 = abstractC8036.f26659;
        C14764 c14764 = this.f49736;
        if (abstractC22664 == null) {
            C3168 c3168 = this.f49733;
            C0310 c0310 = this.f49731;
            c0310.getClass();
            AbstractC22664 abstractC22664M1981 = c0310.m1981(abstractC8036, c3168, AbstractC22664.f73590);
            AbstractC8036 abstractC8037 = c17621.f57962;
            abstractC8037.getClass();
            AbstractC22664 abstractC22665 = c14764.f48311;
            C22092 c22092 = this.f49737;
            AbstractC22664 abstractC22664M49970 = c22092.m49970(abstractC8037, abstractC22664M1981, abstractC22665, c22092.f71222);
            abstractC8037.f26659 = abstractC22664M49970;
            abstractC22664 = abstractC22664M49970;
        }
        AbstractC22664 abstractC22666 = c14764.f48252;
        C11518 c11518 = this.f49734;
        if (abstractC22664 == abstractC22666) {
            this.f49735 = c11518.m28994(c17621, abstractC22666, this.f49733);
            return;
        }
        AbstractC22664 abstractC22667 = c14764.f48266;
        if (abstractC22664 == abstractC22667) {
            this.f49738 = c11518.m28994(c17621, abstractC22667, this.f49733);
        }
    }

    public C15247(C11518 c11518, C0310 c0310, C22092 c22092, C14764 c14764, C16437 c16437) {
        this.f49734 = c11518;
        this.f49731 = c0310;
        this.f49737 = c22092;
        this.f49736 = c14764;
        this.f49732 = c16437;
    }
}
