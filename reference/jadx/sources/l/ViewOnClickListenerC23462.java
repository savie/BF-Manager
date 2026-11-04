package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩹ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06A0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܿۛۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f75912 = {9087, -2623, -2595, -2595, -2599, -2598, -2669, -2682, -2682, -2610, -2624, -2595, -2623, -2596, -2613, -2681, -2614, -2618, -2620, -2682, -2587, -2684, -2589, -2592, -2585, -2581, -2592, -2585, -2682, -2584, -2599, -2622, -2566, -2624, -2610, -2617, -2616, -2595, -2596, -2597, -2612, -2590, -2624, -2619, -2619, -2612, -2597, -2580, -2607};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f75913;

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (RunnableC3646.m11813() != 0) {
            C13473.m33144();
            if (C2287.f7432 < 0) {
                C1321.m4852();
                if (C1564.f5401 > 0) {
                    C0619.m2763();
                } else if (!C3690.m11987()) {
                    C0619.m2763();
                }
            } else if (!C3690.m11987()) {
                C0619.m2763();
            }
        } else if (!RunnableC1848.f6235) {
            short[] sArr = f75912;
            if (C11235.f35427 < 0 && C1321.f4751 < 0) {
                short s = sArr[0];
                if (C0269.f1558 <= 0) {
                    C13473.m33144();
                    if (C2287.f7432 < 0) {
                        C1321.m4852();
                        if (C1564.f5401 > 0) {
                            if (!C3690.m11987()) {
                            }
                        }
                    } else if (!C3690.m11987()) {
                    }
                } else {
                    int i = s + 13789;
                    int i2 = i * i;
                    if (C3734.m12152() < 0 && AbstractC3624.f12429 > 0) {
                        int i3 = (s * 55156) - i2 > 0 ? 18196 : 62889;
                        Main mainM9939 = RunnableC3055.m9939(this.f75913);
                        if (C1080.m4050()) {
                            short[] sArr2 = f75912;
                            if (C1783.f6087 > 0 && C1542.m5459() < 0) {
                                C1542.m5468(mainM9939, C2354.m7980(sArr2, 1, 48, i3));
                                return;
                            }
                            C1321.m4852();
                            if (C1564.f5401 > 0) {
                                if (!C3690.m11987()) {
                                }
                            }
                        }
                    } else if (!C3690.m11987()) {
                    }
                }
            }
            C0619.m2763();
        }
        C2287.m7745();
    }

    public ViewOnClickListenerC23462(C8614 c8614) {
        this.f75913 = c8614;
    }
}
