package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FATD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16007 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13598 f51824 = C13598.m33221(new File(C11904.f39937.m46690("axmls").mo33986()), 26101061, 1, 2097152);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37987(String str) {
        try {
            C4424 c4424M33234 = f51824.m33234(str);
            if (c4424M33234 != null) {
                return C0834.m3437(c4424M33234.m12357(0)).mo16422();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37986(String str, byte[] bArr) {
        C9314 c9314M33229 = null;
        try {
            c9314M33229 = f51824.m33229(str);
            if (c9314M33229 == null) {
                return;
            }
            InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c9314M33229.m23887(0));
            interfaceC10983M3436.write(bArr);
            interfaceC10983M3436.close();
            c9314M33229.m23890();
        } catch (IOException unused) {
            if (c9314M33229 != null) {
                try {
                    c9314M33229.m23888();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
