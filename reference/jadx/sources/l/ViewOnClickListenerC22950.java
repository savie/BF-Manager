package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩺ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAJE */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC22950 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩵ۤۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f74604 = {2306, 31058, 31054, 31054, 31050, 31049, 30976, 30997, 30997, 31069, 31059, 31054, 31058, 31055, 31064, 30996, 31065, 31061, 31063, 30997, 31094, 30999, 31088, 31091, 31092, 31096, 31091, 31092, 30997, 31099, 31050, 31057, 31102, 31067, 31054, 31067, 31095, 31055, 31062, 31054, 31059, 31050, 31062, 31071, 31042, 31059, 31060, 31069};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f74605;

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0066  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!C0797.f3386) {
            short[] sArr = f74604;
            if (C0526.f2219) {
                C1977.m6356();
                C0526.m2437();
            } else if (C2124.f7782 > 0) {
                short s = sArr[0];
                if (C3722.f13525 > 0) {
                    int i = s + 16792;
                    if (C0671.f2816 == 0) {
                        int i2 = i * i;
                        int i3 = s * s;
                        if (ThreadFactoryC3888.f14547 > 0) {
                            if (C10634.f36300 >= 0) {
                                C1977.m6356();
                                C0526.m2437();
                            } else {
                                int i4 = i3 + 281971264;
                                int i5 = (i4 + i4) - i2 >= 0 ? 31034 : 7513;
                                Main mainM7591 = C2477.m7591(this.f74605);
                                if (C2871.m8646()) {
                                    short[] sArr2 = f74604;
                                    if (C1875.f7103 >= 0) {
                                        RunnableC1606.m5473();
                                        if (C1148.f5161 <= 0) {
                                            if (C1148.f5161 <= 0) {
                                            }
                                        }
                                    } else if (AbstractC0464.f2088 > 0) {
                                        C2704.m8241(mainM7591, RunnableC1606.m5481(sArr2, 1, 47, i5));
                                        return;
                                    }
                                    C1977.m6356();
                                    C0526.m2437();
                                }
                            }
                        } else if (C1148.f5161 <= 0) {
                            C1977.m6356();
                            C0526.m2437();
                        }
                    } else if (RunnableC1895.m6170() == 0) {
                        RunnableC1606.m5473();
                        if (C1148.f5161 <= 0) {
                            C1977.m6356();
                            C0526.m2437();
                        } else if (C1148.f5161 <= 0) {
                            C1977.m6356();
                            C0526.m2437();
                        }
                    } else if (C1148.f5161 <= 0) {
                        C1977.m6356();
                        C0526.m2437();
                    }
                } else if (C1148.f5161 <= 0) {
                    C1977.m6356();
                    C0526.m2437();
                }
            } else if (C1148.f5161 <= 0) {
                C1977.m6356();
                C0526.m2437();
            }
        } else if (RunnableC1895.m6170() == 0) {
            RunnableC1606.m5473();
            if (C1148.f5161 <= 0) {
                C1977.m6356();
                C0526.m2437();
            } else if (C1148.f5161 <= 0) {
                C1977.m6356();
                C0526.m2437();
            }
        } else if (C1148.f5161 <= 0) {
            C1977.m6356();
            C0526.m2437();
        }
        C0526.m2437();
    }

    public ViewOnClickListenerC22950(C11545 c11545) {
        this.f74605 = c11545;
    }
}
