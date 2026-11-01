package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۘ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9SO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4272 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۤܶۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f15407 = {6143, -26650, -26630, -26630, -26626, -26627, -26700, -26719, -26719, -26647, -26649, -26630, -26650, -26629, -26644, -26720, -26643, -26655, -26653, -26719, -26686, -26717, -26684, -26681, -26688, -26676, -26681, -26688, -26719, -26685, -26662, -26678, -26641, -26630, -26641, -26680, -26649, -26654, -26645, -26627, -26658, -26628, -26655, -26632, -26649, -26646, -26645, -26628};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f15408;

    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0064  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C1460.m5050() != 0) {
            C1460.m5050();
            if (C1025.f4800 >= 0) {
                if (!C19806.f63586) {
                    C0278.m1789();
                }
            }
        } else {
            short[] sArr = f15407;
            if (C19806.f63586) {
                C1460.m5050();
                if (C1025.f4800 >= 0) {
                    if (!C19806.f63586) {
                        C0278.m1789();
                    }
                }
            } else if (C1977.f7413 <= 0) {
                C0278.m1789();
            } else {
                short s = sArr[0];
                if (C1977.f7413 <= 0) {
                    C1460.m5050();
                    if (C1025.f4800 >= 0) {
                        if (!C19806.f63586) {
                            C0278.m1789();
                        }
                    }
                } else {
                    int i = s + 1;
                    if (C1461.f5957 > 0) {
                        int i2 = i * i;
                        if (C1025.f4800 < 0) {
                            int i3 = s * 2;
                            if (C3535.m10431() > 0) {
                                int i4 = i2 - (i3 + 1) >= 0 ? 38798 : 41042;
                                Main mainM7591 = C2477.m7591(this.f15408);
                                if (C3577.f13150 < 0) {
                                    short[] sArr2 = f15407;
                                    if (RunnableC1606.f6488 < 0) {
                                        if (C0050.f912 > 0) {
                                            C2704.m8241(mainM7591, C0216.m1588(sArr2, 1, 47, i4));
                                            return;
                                        }
                                    }
                                }
                            } else if (!C19806.f63586) {
                                C0278.m1789();
                            }
                        }
                    }
                    C1377.m4833();
                    if (C2871.f10837 < 0) {
                        C0278.m1789();
                    } else {
                        C1460.m5050();
                        if (C1025.f4800 >= 0) {
                            if (!C19806.f63586) {
                                C0278.m1789();
                            }
                        }
                    }
                }
            }
        }
        C3660.m10791();
    }

    public ViewOnClickListenerC4272(C11545 c11545) {
        this.f15408 = c11545;
    }
}
