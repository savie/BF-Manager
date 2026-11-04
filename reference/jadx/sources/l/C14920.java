package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14920 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48719;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f48720;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48721;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10445 f48722;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10445 f48723;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10445 f48724;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f48725;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48726;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f48727 = 0.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10445 f48728;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48729;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f48730;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f48731;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10445 f48732;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10445 f48733;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f48734;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10445 f48735;

    public C14920(C10445 c10445, int i, boolean z) {
        this.f48732 = c10445;
        this.f48729 = i;
        this.f48719 = z;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35899() {
        C10445 c10445;
        int i;
        if (!this.f48721) {
            int i2 = this.f48729;
            int i3 = i2 * 2;
            C10445 c10446 = this.f48732;
            boolean z = false;
            C10445 c10447 = c10446;
            C10445 c10448 = c10447;
            while (!z) {
                this.f48720++;
                C10445[] c10445Arr = c10447.f33217;
                int[] iArr = c10447.f33228;
                C0751[] c0751Arr = c10447.f33190;
                c10445Arr[i2] = null;
                c10447.f33194[i2] = null;
                if (c10447.m26870() != 8) {
                    c10447.m26857(i2);
                    EnumC19396 enumC19396 = EnumC19396.MATCH_CONSTRAINT;
                    c0751Arr[i3].m3108();
                    int i4 = i3 + 1;
                    c0751Arr[i4].m3108();
                    c0751Arr[i3].m3108();
                    c0751Arr[i4].m3108();
                    if (this.f48733 == null) {
                        this.f48733 = c10447;
                    }
                    this.f48728 = c10447;
                    if (c10447.f33210[i2] == enumC19396) {
                        int i5 = iArr[i2];
                        if (i5 == 0 || i5 == 3 || i5 == 2) {
                            this.f48731++;
                            float f = c10447.f33224[i2];
                            if (f > 0.0f) {
                                this.f48727 += f;
                            }
                            if (c10447.m26870() != 8 && c10447.f33210[i2] == enumC19396 && ((i = iArr[i2]) == 0 || i == 3)) {
                                if (f < 0.0f) {
                                    this.f48725 = true;
                                } else {
                                    this.f48726 = true;
                                }
                                if (this.f48734 == null) {
                                    this.f48734 = new ArrayList();
                                }
                                this.f48734.add(c10447);
                            }
                            if (this.f48723 == null) {
                                this.f48723 = c10447;
                            }
                            C10445 c10449 = this.f48735;
                            if (c10449 != null) {
                                c10449.f33194[i2] = c10447;
                            }
                            this.f48735 = c10447;
                        }
                        if (i2 == 0) {
                            if (c10447.f33206 == 0 && c10447.f33215 == 0) {
                                int i6 = c10447.f33201;
                            }
                        } else if (c10447.f33209 == 0 && c10447.f33244 == 0) {
                            int i7 = c10447.f33222;
                        }
                    }
                }
                if (c10448 != c10447) {
                    c10448.f33217[i2] = c10447;
                }
                C0751 c0751 = c0751Arr[i3 + 1].f2744;
                if (c0751 != null) {
                    c10445 = c0751.f2747;
                    C0751 c0752 = c10445.f33190[i3].f2744;
                    if (c0752 == null || c0752.f2747 != c10447) {
                        c10445 = null;
                    }
                } else {
                    c10445 = null;
                }
                if (c10445 == null) {
                    z = true;
                    c10445 = c10447;
                }
                C10445 c104410 = c10445;
                c10448 = c10447;
                c10447 = c104410;
            }
            C10445 c104411 = this.f48733;
            if (c104411 != null) {
                c104411.f33190[i3].m3108();
            }
            C10445 c104412 = this.f48728;
            if (c104412 != null) {
                c104412.f33190[i3 + 1].m3108();
            }
            this.f48724 = c10447;
            if (i2 == 0 && this.f48719) {
                this.f48722 = c10447;
            } else {
                this.f48722 = c10446;
            }
            this.f48730 = this.f48726 && this.f48725;
        }
        this.f48721 = true;
    }
}
