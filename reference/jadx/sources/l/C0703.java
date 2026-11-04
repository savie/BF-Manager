package l;

import bin.mt.plus.R;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.֡᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0703 implements InterfaceC19795, InterfaceC5417 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3016(String str, int i, String str2, String str3, int i2) {
        return str + i + str2 + i2 + str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3018(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3019(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        return C14684.m35308((InterfaceC8304) obj, true);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3017(boolean z, boolean z2) {
        if (z && z2) {
            return C21576.m49059(R.string.MT_Protector, "V2 + V3");
        }
        if (z) {
            return C21576.m49059(R.string.MT_Protector, "V2");
        }
        if (z2) {
            return C21576.m49059(R.string.MT_Protector, "V3");
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7370 m3020() {
        return new C7370(2, 1, InterfaceC1272.f4579, new C1150(C25227.FOREVER_NS), new C9103(24));
    }
}
