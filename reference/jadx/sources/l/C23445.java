package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻ۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes.dex */
public final class C23445 extends AbstractC2982 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6510 f75916;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f75917;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f75918;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6510 f75919;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f75920;

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۚ */
    public final C23445 mo5376() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23445(C22116 c22116, int i, C6510 c6510, C6510 c6511) {
        super(c22116, 5);
        this.f75918 = c22116;
        this.f75917 = i;
        this.f75916 = c6510;
        this.f75919 = c6511;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC2982 mo5374() {
        C6510 c6510M25361;
        C6510 c6510M51662 = m51662();
        boolean zM51664 = m51664();
        C22116 c22116 = this.f75918;
        if (zM51664) {
            c6510M25361 = null;
        } else {
            c22116.f71608.m25368(this.f75916);
            c22116.f71608.m25378(4);
            c6510M25361 = c22116.f71608.m25361(167);
        }
        if (c6510M51662 != null) {
            c22116.f71608.m25368(c6510M51662);
            c22116.f71608.m25378(3);
        }
        c22116.f71608.m25368(c6510M25361);
        return c22116.f71611[this.f11189];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7179() {
        mo5374().mo7179();
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۙ */
    public final void mo7178() {
        mo5374().mo7178();
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ܰ */
    public final void mo7180(int i) {
        C6171.m17170();
        throw null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6510 m51663() {
        AbstractC8774 abstractC8774 = this.f75920;
        int i = this.f75917;
        C6510 c6510 = this.f75916;
        C22116 c22116 = this.f75918;
        if (abstractC8774 == null) {
            return C10039.m25338(c6510, c22116.f71608.m25361(i));
        }
        int iM25383 = c22116.f71608.m25383();
        C6510 c6510M25338 = C10039.m25338(c6510, c22116.f71608.m25361(i));
        C10039 c10039 = c22116.f71608;
        c10039.f34277.m32992(this.f75920, 128, iM25383, c10039.m25383());
        return c6510M25338;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6510 m51662() {
        AbstractC8774 abstractC8774 = this.f75920;
        int i = this.f75917;
        C6510 c6510 = this.f75919;
        C22116 c22116 = this.f75918;
        if (abstractC8774 == null) {
            return C10039.m25338(c6510, c22116.f71608.m25361(C10039.m25347(i)));
        }
        int iM25383 = c22116.f71608.m25383();
        C6510 c6510M25338 = C10039.m25338(c6510, c22116.f71608.m25361(C10039.m25347(i)));
        C10039 c10039 = c22116.f71608;
        c10039.f34277.m32992(this.f75920, 256, iM25383, c10039.m25383());
        return c6510M25338;
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ֨ */
    public final int mo7177() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m51664() {
        return this.f75916 == null && this.f75917 == 168;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("cond(");
        int i = C10039.f34268;
        return C22697.m50267(sb, C21327.f69414[this.f75917], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
