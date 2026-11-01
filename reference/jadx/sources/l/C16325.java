package l;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16325 extends AbstractC10681 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f52572;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f52573;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f52574;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f52575;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f52576;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f52577;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC6910 f52578;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0096 f52579;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f52580;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f52581;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f52582;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f52583;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f52584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8354 f52585;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f52586;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52587;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f52588;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52589;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f52590;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f52591;

    @Override // l.AbstractC10681
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15798(List list) {
        return this;
    }

    public C16325(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, C8354 c8354, List list2, List list3, C0096 c0096, Map map, List list4) {
        super(str, list, z3);
        this.f52589 = i;
        this.f52577 = j2;
        this.f52584 = z;
        this.f52590 = z2;
        this.f52573 = i2;
        this.f52591 = j3;
        this.f52587 = i3;
        this.f52588 = j4;
        this.f52582 = j5;
        this.f52572 = z4;
        this.f52574 = z5;
        this.f52585 = c8354;
        this.f52586 = AbstractC22433.copyOf((Collection) list2);
        this.f52583 = AbstractC22433.copyOf((Collection) list3);
        this.f52578 = AbstractC6910.copyOf(map);
        this.f52576 = AbstractC22433.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            C7152 c7152 = (C7152) C22808.m50475(list3);
            this.f52575 = c7152.f63678 + c7152.f63680;
        } else if (!list2.isEmpty()) {
            C15620 c15620 = (C15620) C22808.m50475(list2);
            this.f52575 = c15620.f63678 + c15620.f63680;
        } else {
            this.f52575 = 0L;
        }
        long jMax = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                jMax = Math.min(this.f52575, j);
            } else {
                jMax = Math.max(0L, this.f52575 + j);
            }
        }
        this.f52580 = jMax;
        this.f52581 = j >= 0;
        this.f52579 = c0096;
    }
}
