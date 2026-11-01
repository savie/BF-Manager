package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ܺۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15750 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܽ᩹ۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f51053 = {262, 16339, 16335, 16335, 16331, 16328, 16257, 16276, 16276, 16348, 16338, 16335, 16339, 16334, 16345, 16277, 16344, 16340, 16342, 16276, 16375, 16278, 16369, 16370, 16373, 16377, 16370, 16373, 16276, 16378, 16331, 16336, 16360, 16338, 16348, 16341, 16346, 16335, 16334, 16329, 16350, 16368, 16338, 16343, 16343, 16350, 16329, 16382, 16323};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f51054;

    /* JADX WARN: Code duplicated, block: B:35:0x0051  */
    /* JADX WARN: Code duplicated, block: B:38:0x0058  */
    /* JADX WARN: Code duplicated, block: B:41:0x005d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0065  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!RunnableC1564.f6300 && C1189.f5284 > 0) {
            short[] sArr = f51053;
            if (C3577.f13150 < 0) {
                if (C10634.f36300 < 0) {
                    short s = sArr[0];
                    int i = s * s;
                    if (!C0526.f2219) {
                        int i2 = i + 92448225;
                        if (C3535.f13026 > 0) {
                            if (C3577.f13150 < 0) {
                                int i3 = i2 - (s * 19230) >= 0 ? 16315 : 4081;
                                Main mainM7591 = C2477.m7591(this.f51054);
                                if (!C0797.m3359()) {
                                    if (C3660.f13403 < 0) {
                                        C2788.m8472();
                                        if (C2249.f8050 < 0) {
                                            C3286.m9798();
                                            C2704.m8255();
                                        }
                                    }
                                } else {
                                    short[] sArr2 = f51053;
                                    if (!C2704.f10408) {
                                        C3286.m9798();
                                        C2704.m8255();
                                    } else {
                                        if (C0817.f3443) {
                                            C2704.m8241(mainM7591, C0797.m3361(sArr2, 1, 48, i3));
                                            return;
                                        }
                                        if (RunnableC1895.m6170() == 0) {
                                            if (C3660.f13403 < 0) {
                                                C2788.m8472();
                                                if (C2249.f8050 < 0) {
                                                    C3286.m9798();
                                                    C2704.m8255();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (RunnableC1895.m6170() == 0) {
                            if (C3660.f13403 < 0) {
                                C2788.m8472();
                                if (C2249.f8050 < 0) {
                                    C3286.m9798();
                                    C2704.m8255();
                                }
                            }
                        }
                    } else if (RunnableC1895.m6170() == 0) {
                        if (C3660.f13403 < 0) {
                            C2788.m8472();
                            if (C2249.f8050 < 0) {
                                C3286.m9798();
                                C2704.m8255();
                            }
                        }
                    }
                }
            } else if (RunnableC1895.m6170() == 0) {
                if (C3660.f13403 < 0) {
                    C2788.m8472();
                    if (C2249.f8050 < 0) {
                        C3286.m9798();
                        C2704.m8255();
                    }
                }
            }
        } else {
            C2788.m8472();
            if (C2249.f8050 < 0) {
                C3286.m9798();
                C2704.m8255();
            }
        }
        C2642.m8171();
        C3535.m10431();
    }

    public ViewOnClickListenerC15750(C11545 c11545) {
        this.f51054 = c11545;
    }
}
