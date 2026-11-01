package l;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ᩴᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1QX */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18917 implements InterfaceC7359, InterfaceC3232 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m43575(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11018 m43576(int i) {
        C11018 c11018 = new C11018();
        c11018.writeInt(i);
        return c11018;
    }

    @Override // l.InterfaceC3232
    /* JADX INFO: renamed from: ۙ */
    public String mo9687(EnumC15934 enumC15934, String str, String str2) {
        return EnumC14523.m34964(enumC15934, str, str2);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43578(int i, int i2, CharSequence charSequence) {
        if (i != 0 && charSequence.charAt(i - 1) != '\n') {
            throw new RuntimeException();
        }
        if (i2 != charSequence.length() && charSequence.charAt(i2) != '\n') {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m43579(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m43580(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i2 - 1);
            if (cCharAt != ' ' && cCharAt != '\t') {
                break;
            }
            i2--;
        }
        return i2;
    }
}
