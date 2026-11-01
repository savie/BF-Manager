package l;

import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֡ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6SD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0589 implements InterfaceC22816, InterfaceC3740 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2789(int i, int i2, String str) {
        return (C13638.hashCode(str) + i) * i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2791(String str, int i, String str2, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    @Override // l.InterfaceC22816
    /* JADX INFO: renamed from: ۙ */
    public String mo1595(String str) {
        try {
            InterfaceC16950[] interfaceC16950ArrM18738 = ((RunnableC6967) C5431.m15009().mo29450()).m18738(str);
            if (interfaceC16950ArrM18738.length > 0) {
                return interfaceC16950ArrM18738[0].mo36921();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new TreeSet();
    }
}
