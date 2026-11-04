package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۟֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5XA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7565 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f24937;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f24938;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f24939;

    /* JADX INFO: renamed from: ᩷ۙܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f24940 = {8454, 28237, 28235, 28253, 28234, 28182, 28244, 28249, 28246, 28255, 28237, 28249, 28255, 28253, 28253, 28246, 28226, 28240, 28283, 28278, 28237, 28235, 28253, 28234, 28182, 28234, 28253, 28255, 28241, 28247, 28246, 28237, 28235, 28253, 28234, 28182, 28251, 28247, 28237, 28246, 28236, 28234, 28225};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f24941;

    static {
        m20657();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20657() {
        short s = f24940[0];
        if (RunnableC0334.f1808 > 0) {
            int i = s * s;
            if (C2354.f7599 >= 0) {
                C4238.m13540();
                if (RunnableC3055.m9933() == 0) {
                    C2375.m8065();
                }
            } else {
                int i2 = i + 195748081;
                if (C3492.f12043 <= 0) {
                    C4238.m13540();
                    if (RunnableC3055.m9933() == 0) {
                        C2375.m8065();
                    }
                } else {
                    int i3 = s + 13991;
                    int i4 = (i2 + i2) - (i3 * i3) >= 0 ? 28216 : 63331;
                    String strM6233 = C1783.m6233(f24940, 1, 13, i4);
                    if (C2375.m8065() <= 0) {
                        C4238.m13540();
                        if (RunnableC3055.m9933() == 0) {
                            C2375.m8065();
                        }
                    } else {
                        short[] sArr = f24940;
                        if (C2485.m8357() > 0) {
                            String property = System.getProperty(strM6233, C3077.m10047(sArr, 14, 2, i4));
                            if (C2354.m7983()) {
                                short[] sArr2 = f24940;
                                if (C23916.f77426 > 0) {
                                    String strM28300 = C11235.m28300(sArr2, 16, 2, i4);
                                    boolean zM11490 = C3492.m11490(strM28300, property);
                                    if (C2375.f7641 > 0) {
                                        f24938 = zM11490;
                                        short[] sArr3 = f24940;
                                        if (!C0619.m2763()) {
                                            String strM11809 = RunnableC3646.m11809(sArr3, 18, 2, i4);
                                            if (!zM11490) {
                                                Locale locale = Locale.getDefault();
                                                if (C3492.m11490(strM28300, locale.getLanguage())) {
                                                    f24938 = true;
                                                    f24941 = C3492.m11490(strM11809, locale.getCountry());
                                                }
                                                f24937 = false;
                                                f24939 = false;
                                                return;
                                            }
                                            String property2 = System.getProperty(C1519.m5399(f24940, 20, 11, i4));
                                            if (property2 != null) {
                                                int iM28315 = C11235.m28315(property2, 95);
                                                if (iM28315 >= 0) {
                                                    property2 = AbstractC0116.m1237(property2, 0, iM28315);
                                                }
                                            } else {
                                                short[] sArr4 = f24940;
                                                if (C1080.f3865 < 0) {
                                                    property2 = System.getProperty(C1321.m4861(sArr4, 31, 12, i4), "");
                                                }
                                            }
                                            f24937 = true;
                                            boolean zM8175 = C2419.m8175(strM11809, property2);
                                            f24941 = zM8175;
                                            f24939 = zM8175;
                                            return;
                                        }
                                    }
                                } else if (C0487.f2131 > 0) {
                                    C4238.m13540();
                                    if (RunnableC3055.m9933() == 0) {
                                        C2375.m8065();
                                    }
                                }
                                if (!C0619.m2763()) {
                                    C4238.m13540();
                                    if (RunnableC3055.m9933() == 0) {
                                        C2375.m8065();
                                    }
                                }
                            } else if (C0487.f2131 > 0) {
                                C4238.m13540();
                                if (RunnableC3055.m9933() == 0) {
                                    C2375.m8065();
                                }
                            } else if (!C0619.m2763()) {
                                C4238.m13540();
                                if (RunnableC3055.m9933() == 0) {
                                    C2375.m8065();
                                }
                            }
                        }
                    }
                }
            }
        } else if (C0487.f2131 > 0) {
            C4238.m13540();
            if (RunnableC3055.m9933() == 0) {
                C2375.m8065();
            }
        } else if (!C0619.m2763()) {
            C4238.m13540();
            if (RunnableC3055.m9933() == 0) {
                C2375.m8065();
            }
        }
        C3448.m11248();
        C1519.m5403();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m20661() {
        return f24938;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m20659() {
        return f24941;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m20660() {
        return f24937;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m20658() {
        return f24939;
    }
}
