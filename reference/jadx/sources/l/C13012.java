package l;

import java.util.Random;

/* JADX INFO: renamed from: l.۬ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V6KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13012 implements InterfaceC17888, InterfaceC21414, InterfaceC20380, InterfaceC3524 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m32189(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + "…";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32190(InterfaceC2557 interfaceC2557) {
        return interfaceC2557 != null && interfaceC2557.mo7985() && interfaceC2557.mo7967().startsWith("video/") && !C11122.m28043(interfaceC2557.getName());
    }

    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public void mo3144(C15313 c15313) {
        int iM34486 = ((C14277) c15313.m36673()).m34486();
        Random random = new Random();
        StringBuilder sb = new StringBuilder(iM34486);
        sb.append(((random.nextInt() & 255) % 9) + 1);
        for (int i = 1; i < iM34486; i++) {
            sb.append((random.nextInt() & 255) % 10);
        }
        C14277 c14277 = new C14277();
        c14277.m34466(sb.toString());
        c15313.m36672(c14277);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m32191(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return "…" + str.substring((str.length() - i) + 1);
    }

    @Override // l.InterfaceC20380
    /* JADX INFO: renamed from: ۙ */
    public Object mo4824(float f, Float f2, Float f3) {
        float fFloatValue = f2.floatValue();
        return Float.valueOf(((f3.floatValue() - fFloatValue) * f) + fFloatValue);
    }

    @Override // l.InterfaceC3524
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC4314 mo10387(String str) {
        return C12782.f42603;
    }
}
