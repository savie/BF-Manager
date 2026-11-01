package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R3LO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19378 implements InterfaceC21414 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44399(String str, String str2) {
        Charset charset = StandardCharsets.UTF_8;
        return "Basic ".concat(C14511.m34930(str + ":" + str2).mo34940());
    }

    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public void mo3144(C15313 c15313) {
        ((C14277) c15313.m36673()).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44400(InterfaceC7945 interfaceC7945) {
        int iMo2107;
        if (interfaceC7945 != null) {
            int iMo11507 = interfaceC7945.mo11507();
            int i = 0;
            for (InterfaceC1594 interfaceC1594 : interfaceC7945.mo11508()) {
                if (interfaceC1594.mo5435().f35329 == 3) {
                    InterfaceC8858 interfaceC8858 = (InterfaceC8858) ((InterfaceC13859) interfaceC1594).getReference();
                    EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
                    if (enumC10297Mo5435 != EnumC10297.f35268 && enumC10297Mo5435 != EnumC10297.f35145) {
                        boolean z = enumC10297Mo5435 == EnumC10297.f35162 || enumC10297Mo5435 == EnumC10297.f35129;
                        InterfaceC19010 interfaceC19010 = C5370.f18561;
                        iMo2107 = C5370.m14887(interfaceC8858.mo9699(), z);
                    } else {
                        iMo2107 = ((InterfaceC13153) interfaceC1594).mo2107();
                    }
                    if (iMo2107 > i) {
                        i = iMo2107;
                    }
                }
            }
            if (i > 5 && i > iMo11507) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44398(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return ClassTransform.FLOAT;
        }
        int i = 1;
        if (cCharAt == 'L') {
            int iLastIndexOf = str.lastIndexOf(47);
            return C20630.m46498(1, iLastIndexOf < 0 ? 1 : iLastIndexOf + 1, str);
        }
        if (cCharAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (cCharAt == 'V') {
            return ClassTransform.VOID;
        }
        if (cCharAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (cCharAt == 'J') {
            return ClassTransform.LONG;
        }
        if (cCharAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (cCharAt != '[') {
            switch (cCharAt) {
                case 'B':
                    return ClassTransform.BYTE;
                case 'C':
                    return ClassTransform.CHARACTER;
                case 'D':
                    return ClassTransform.DOUBLE;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        while (i < str.length() && str.charAt(i) == '[') {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m44398(str.substring(i)));
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
