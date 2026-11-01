package l;

import bin.mt.json.JSONArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 077H */
/* JADX INFO: loaded from: classes2.dex */
public final class C2581 {

    /* JADX INFO: renamed from: ֫ۢ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f10155 = {3232, 10904, 10880, 10924, 10897, 10898, 10909, 10924, 10883, 10904, 10880, 10975, 10901, 10898, 10887, 10898, 10911, 10930, 10915, 10936, 10924, 10940, 10915, 10934, 10941, 10924, 10929, 10943, 10940, 10928, 10936, 10934, 10935, 10919, 10907, 10906, 10880, 10963, 10930, 10915, 10936, 10963, 10883, 10898, 10896, 10904, 10898, 10900, 10902, 10963, 10906, 10880, 10963, 10909, 10908, 10887, 10963, 10880, 10886, 10883, 10883, 10908, 10881, 10887, 10902, 10903, 10963, 10897, 10890, 10963, 10910, 10887, 10924, 10898, 10883, 10904, 10924, 10884, 10908, 10881, 10904, 10880, 10883, 10898, 10896, 10902, 10924, 10908, 10883, 10902, 10909, 10973};

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8038(String str) {
        short[] sArr = f10155;
        if (C1668.f6641 < 0) {
            short s = sArr[0];
            if (C0216.f1393 == 0) {
                int i = 49848 * s;
                int i2 = s + 12462;
                if (C0817.f3443) {
                    int i3 = (i2 * i2) - i < 0 ? 32630 : 10995;
                    C2664 c2664M8195 = C2664.m8195();
                    short[] sArr2 = f10155;
                    if (C1377.f5749) {
                        if (!C19806.f63586) {
                            String strM8206 = c2664M8195.m8206(C3286.m9788(sArr2, 1, 10, i3));
                            short[] sArr3 = f10155;
                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                String strM10056 = RunnableC3388.m10056(sArr3, 11, 1, i3);
                                if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                    if (!Arrays.asList(C1460.m5056(strM8206, strM10056)).contains(str)) {
                                        return;
                                    }
                                    String strM6918 = C2249.m6918(f10155, 12, 5, i3);
                                    if (C1937.f7317 >= 0) {
                                        C0671.m3008();
                                    } else {
                                        JSONArray jSONArrayM5515 = CallableC1627.m5515();
                                        short[] sArr4 = f10155;
                                        if (C2332.f8260) {
                                            String strM6363 = C1977.m6363(sArr4, 17, 16, i3);
                                            short[] sArr5 = f10155;
                                            if (C0216.f1393 == 0) {
                                                throw C12731.m31629(jSONArrayM5515, strM6363, C0962.m3747(sArr5, 33, 59, i3), strM6918);
                                            }
                                        } else if (C2477.f9839 <= 0) {
                                        }
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            C0671.m3008();
                                        }
                                    }
                                } else if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                    C0671.m3008();
                                }
                            } else if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                C0671.m3008();
                            }
                        }
                    } else if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        C0671.m3008();
                    }
                } else if (C2477.f9839 <= 0) {
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        C0671.m3008();
                    }
                }
            }
        } else if (C2477.f9839 <= 0) {
            if (ViewGroupOnHierarchyChangeListenerC1916.f7262 && C1377.f5749) {
                C0671.m3008();
            }
        }
        RunnableC0195.m1431();
        C7105.m18985();
    }
}
