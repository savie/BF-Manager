package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ܳۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9SO */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15234 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۛܽۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f49706 = {5322, -6345, -6357, -6357, -6353, -6356, -6299, -6288, -6288, -6344, -6346, -6357, -6345, -6358, -6339, -6287, -6340, -6352, -6350, -6288, -6381, -6286, -6379, -6378, -6383, -6371, -6378, -6383, -6288, -6382, -6389, -6373, -6338, -6357, -6338, -6375, -6346, -6349, -6342, -6356, -6385, -6355, -6352, -6359, -6346, -6341, -6342, -6355};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f49707;

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x003e  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C0269.f1558 > 0) {
            if (C1343.f4799 == 0) {
                short[] sArr = f49706;
                if (C2354.f7599 < 0 && C1542.f5343 > 0) {
                    short s = sArr[0];
                    if (RunnableC3055.f9898 >= 0) {
                        C1564.m5509();
                        if (C0269.f1558 <= 0) {
                            C23916.m53419();
                            if (C0773.f2792 <= 0) {
                                if (!RunnableC0334.m2063()) {
                                }
                            }
                        } else if (!RunnableC0334.m2063()) {
                        }
                    } else {
                        int i = s + 16443;
                        int i2 = i * i;
                        if (C4282.f15546 > 0) {
                            if (AbstractC0641.f2496 >= 0) {
                                C23916.m53419();
                                if (C0773.f2792 <= 0) {
                                    if (!RunnableC0334.m2063()) {
                                    }
                                }
                            } else {
                                int i3 = (s * 65772) - i2 <= 0 ? 59231 : 19553;
                                Main mainM9939 = RunnableC3055.m9939(this.f49707);
                                if (C1519.m5403()) {
                                    short[] sArr2 = f49706;
                                    if (AbstractC0116.f1064 > 0 && C0950.m3785() == 0) {
                                        C1542.m5468(mainM9939, C13473.m33137(sArr2, 1, 47, i3));
                                        return;
                                    }
                                }
                            }
                        } else if (!RunnableC0334.m2063()) {
                        }
                    }
                } else {
                    C1564.m5509();
                    if (C0269.f1558 <= 0) {
                        C23916.m53419();
                        if (C0773.f2792 <= 0) {
                            if (!RunnableC0334.m2063()) {
                            }
                        }
                    } else if (!RunnableC0334.m2063()) {
                    }
                }
            }
            C3077.m10041();
            C0269.m1775();
        } else {
            C23916.m53419();
            if (C0773.f2792 <= 0) {
                if (!RunnableC0334.m2063()) {
                    C3077.m10041();
                    C0269.m1775();
                }
            }
        }
        C2354.m7983();
        C2702.m8876();
    }

    public ViewOnClickListenerC15234(C8614 c8614) {
        this.f49707 = c8614;
    }
}
