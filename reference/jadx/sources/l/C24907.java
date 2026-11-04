package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes.dex */
public final class C24907 extends AbstractC23415 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f80593;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC17589 f80594;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f80595;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f80596;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f80597;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f80598;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11480 f80599;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f80600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f80601;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f80602;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f80603;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f80604;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f80605;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f80606;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f80607;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f80608;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f80609;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22362 f80610;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f80611;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f80612;

    @Override // l.AbstractC23415
    /* JADX INFO: renamed from: ۙ */
    public final Object mo38069(List list) {
        return this;
    }

    public C24907(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C22362 c22362, List list2, List list3, C11480 c11480, Map map, List list4) {
        super(str, list, z3);
        this.f80605 = i;
        this.f80611 = j2;
        this.f80603 = z;
        this.f80602 = z2;
        this.f80609 = i2;
        this.f80612 = j3;
        this.f80608 = i3;
        this.f80595 = j4;
        this.f80604 = j5;
        this.f80600 = z4;
        this.f80593 = z5;
        this.f80610 = c22362;
        this.f80607 = AbstractC1928.copyOf((Collection) list2);
        this.f80601 = AbstractC1928.copyOf((Collection) list3);
        this.f80594 = AbstractC17589.copyOf(map);
        this.f80598 = AbstractC1928.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            C15209 c15209 = (C15209) C16625.m39339(list3);
            this.f80606 = c15209.f6095 + c15209.f6093;
        } else if (!list2.isEmpty()) {
            C5515 c5515 = (C5515) C16625.m39339(list2);
            this.f80606 = c5515.f6095 + c5515.f6093;
        } else {
            this.f80606 = 0L;
        }
        long jMax = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                jMax = Math.min(this.f80606, j);
            } else {
                jMax = Math.max(0L, this.f80606 + j);
            }
        }
        this.f80597 = jMax;
        this.f80596 = j >= 0;
        this.f80599 = c11480;
    }
}
