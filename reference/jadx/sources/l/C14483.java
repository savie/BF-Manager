package l;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: renamed from: l.ܰۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6GQ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14483 implements InterfaceC19795, InterfaceC4787, InterfaceC19189, InterfaceC10777 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45593;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m34969(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "count is negative: "));
        }
        int length = str.length();
        if (i == 0 || length == 0) {
            return "";
        }
        if (i == 1) {
            return str;
        }
        if (str.length() <= Integer.MAX_VALUE / i) {
            StringBuilder sb = new StringBuilder(length * i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(str);
            }
            return sb.toString();
        }
        throw new OutOfMemoryError("Repeating " + str.length() + " bytes String " + i + " times will produce a String exceeding maximum size.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34970(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34971(String str, Object obj) {
        return str + obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34972(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34973(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6178 m34975(int i) {
        C6178 c6178 = new C6178();
        c6178.writeInt(i);
        return c6178;
    }

    @Override // l.InterfaceC4787
    public boolean test(Object obj) {
        return false;
    }

    @Override // l.InterfaceC10777
    /* JADX INFO: renamed from: ۙ */
    public Object mo27471(int i, int i2, byte[] bArr) {
        return C21901.m49591(i, i2, bArr);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.f45593) {
            case 2:
                interfaceC19992.getClass();
                break;
            default:
                interfaceC19992.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m34976(String str) {
        AbstractC11810.m29655();
        C20108.m46233(str, true);
        C20081.m46203();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34974(InterfaceC21197 interfaceC21197) {
        StringBuilder sb = new StringBuilder("MD:");
        if (C4123.m13232((Collection) interfaceC21197.mo8554())) {
            sb.append('<');
            sb.append(C4123.m13221(interfaceC21197.mo8554(), ", "));
            sb.append(">:");
        }
        sb.append('(');
        sb.append(C4123.m13221(interfaceC21197.mo8537(), ", "));
        sb.append("):");
        sb.append(interfaceC21197.mo8519());
        if (interfaceC21197.mo8510()) {
            sb.append(" VARARG");
        }
        List listMo8542 = interfaceC21197.mo8542();
        if (C4123.m13232((Collection) listMo8542)) {
            sb.append(" throws ");
            sb.append(C4123.m13221(listMo8542, ", "));
        }
        return sb.toString();
    }

    @Override // l.InterfaceC19189
    /* JADX INFO: renamed from: ۙ */
    public boolean mo30502(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        return "AndroidManifest.xml".equals(str) || "resources.arsc".equals(str);
    }
}
