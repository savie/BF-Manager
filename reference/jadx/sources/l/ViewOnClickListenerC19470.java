package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩴ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAJE */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19470 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۟ۘ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f62899 = {3867, -13721, -13701, -13701, -13697, -13700, -13771, -13792, -13792, -13720, -13722, -13701, -13721, -13702, -13715, -13791, -13716, -13728, -13726, -13792, -13757, -13790, -13755, -13754, -13759, -13747, -13754, -13759, -13792, -13746, -13697, -13724, -13749, -13714, -13701, -13714, -13758, -13702, -13725, -13701, -13722, -13697, -13725, -13718, -13705, -13722, -13727, -13720};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f62900;

    /* JADX WARN: Code duplicated, block: B:19:0x0026  */
    /* JADX WARN: Code duplicated, block: B:24:0x0031  */
    /* JADX WARN: Code duplicated, block: B:27:0x0036  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!C2878.f9462 && C1564.f5401 > 0) {
            short[] sArr = f62899;
            if (AbstractC0641.f2496 < 0) {
                if (C0269.f1558 <= 0) {
                    C3492.m11488();
                    if (C3448.f11240 >= 0) {
                        C2375.m8065();
                        C2702.m8876();
                    }
                } else {
                    short s = sArr[0];
                    if (C3690.f12684 > 0) {
                        int i = s + 1022;
                        int i2 = i * i;
                        if (AbstractC0116.f1064 <= 0) {
                            if (C2878.m9491() <= 0) {
                                if (C2375.f7641 <= 0) {
                                    C3492.m11488();
                                    if (C3448.f11240 >= 0) {
                                        C2375.m8065();
                                        C2702.m8876();
                                    }
                                }
                            }
                        } else if (!C2878.f9462) {
                            int i3 = i2 - (s * 4088) >= 0 ? 51727 : 4907;
                            Main mainM2816 = AbstractC0641.m2816(this.f62900);
                            if (RunnableC3646.f12471) {
                                C2375.m8065();
                                C2702.m8876();
                            } else {
                                short[] sArr2 = f62899;
                                if (AbstractC0116.m1243() != 0) {
                                    C2375.m8065();
                                    C2702.m8876();
                                } else if (C4238.f15451 < 0) {
                                    C1542.m5468(mainM2816, C3033.m9847(sArr2, 1, 47, i3));
                                    return;
                                }
                            }
                        } else if (C2375.f7641 <= 0) {
                            C3492.m11488();
                            if (C3448.f11240 >= 0) {
                                C2375.m8065();
                                C2702.m8876();
                            }
                        }
                    } else if (C2878.m9491() <= 0) {
                        if (C2375.f7641 <= 0) {
                            C3492.m11488();
                            if (C3448.f11240 >= 0) {
                                C2375.m8065();
                                C2702.m8876();
                            }
                        }
                    }
                }
            } else if (C2878.m9491() <= 0) {
                if (C2375.f7641 <= 0) {
                    C3492.m11488();
                    if (C3448.f11240 >= 0) {
                        C2375.m8065();
                        C2702.m8876();
                    }
                }
            }
        } else if (C2878.m9491() <= 0) {
            if (C2375.f7641 <= 0) {
                C3492.m11488();
                if (C3448.f11240 >= 0) {
                    C2375.m8065();
                    C2702.m8876();
                }
            }
        }
        C1826.m6301();
    }

    public ViewOnClickListenerC19470(C8614 c8614) {
        this.f62900 = c8614;
    }
}
