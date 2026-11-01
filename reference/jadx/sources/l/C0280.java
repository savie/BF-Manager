package l;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.֡۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0280 implements InterfaceC7359, InterfaceC20892 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m1792(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1793(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m1794(C5928 c5928, C2800 c2800, String str, String str2, String str3) {
        EnumC12279 enumC12279M16196 = c5928.m16196();
        c2800.getClass();
        return C2800.m8499(str, str2, str3, enumC12279M16196);
    }

    @Override // l.InterfaceC20892
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo1795(Object obj, Throwable th) {
        return th;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }
}
