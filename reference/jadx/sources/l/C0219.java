package l;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: renamed from: l.֡ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0219 implements InterfaceC7359, InterfaceC23609, InterfaceC22816, InterfaceC15954, InterfaceC17591 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1593(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1594(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        int i = ActivityC5677.f19358;
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC22816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo1595(String str) {
        try {
            InterfaceC16950[] interfaceC16950ArrM18738 = ((RunnableC6967) C5431.m15009().mo29450()).m18738(str);
            return interfaceC16950ArrM18738.length > 0 ? interfaceC16950ArrM18738[0].mo36921() : str;
        } catch (IOException unused) {
            return str;
        }
    }

    @Override // l.InterfaceC17591
    /* JADX INFO: renamed from: ۙ */
    public Object mo1012(int i, int i2, byte[] bArr) {
        byte[] bArrM6808 = C2194.m6808(i, i2, bArr);
        return C17281.m40240(0, bArrM6808.length, bArrM6808);
    }
}
