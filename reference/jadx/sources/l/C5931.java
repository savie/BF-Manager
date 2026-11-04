package l;

/* JADX INFO: renamed from: l.ۚ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5931 extends AbstractC10048 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public StringBuilder f20278;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f20279;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18609 f20280;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5931(C18609 c18609, boolean z) {
        super(c18609.f60504);
        this.f20280 = c18609;
        this.f20278 = new StringBuilder();
        this.f20279 = z;
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo17248(AbstractC22664 abstractC22664) {
        if (this.f20279) {
            return;
        }
        super.mo17248(abstractC22664);
        throw null;
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17245(char c) {
        this.f20278.append(c);
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17247(byte[] bArr) {
        this.f20278.append(this.f20280.f60496.m36600(bArr).toString());
    }

    @Override // l.AbstractC10048
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17246(AbstractC19728 abstractC19728) {
        this.f20278.append(abstractC19728.toString());
    }

    public final String toString() {
        return this.f20278.toString();
    }
}
