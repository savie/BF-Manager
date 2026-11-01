package l;

/* JADX INFO: renamed from: l.᩹ۜ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes.dex */
public final class C22116 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3836 f71607;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10039 f71608;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23800 f71612;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC2982[] f71611 = new AbstractC2982[9];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5805 f71606 = new C5805(this, 8);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11533 f71609 = new C11533(this, false);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11533 f71610 = new C11533(this, true);

    public C22116(C10039 c10039, C3836 c3836, C23800 c23800) {
        this.f71608 = c10039;
        this.f71612 = c23800;
        for (int i = 0; i < 8; i++) {
            this.f71611[i] = new C2359(this, i);
        }
        this.f71611[8] = this.f71606;
        this.f71607 = c3836;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11533 m49074() {
        return this.f71609;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11533 m49072() {
        return this.f71610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2982 m49070(AbstractC16579 abstractC16579) {
        return this.f71611[C10039.m25336(abstractC16579)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4476 m49071(C6263 c6263) {
        return new C4476(this, c6263.mo50006(this.f71612), c6263.f21228);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23445 m49073(int i) {
        return new C23445(this, i, null, null);
    }
}
