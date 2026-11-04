package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FATD */
/* JADX INFO: loaded from: classes.dex */
public final class C21669 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20568 f69174 = C20568.m47148(new File(C6382.f21562.m49876("axmls").mo4294()), 26110365, 1, 2097152);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m49207(String str) {
        try {
            C3414 c3414M47161 = f69174.m47161(str);
            if (c3414M47161 != null) {
                return C14556.m35108(c3414M47161.m11164(0)).mo4179();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49206(String str, byte[] bArr) {
        C16092 c16092M47155 = null;
        try {
            c16092M47155 = f69174.m47155(str);
            if (c16092M47155 == null) {
                return;
            }
            InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c16092M47155.m38246(0));
            interfaceC11573M35106.write(bArr);
            interfaceC11573M35106.close();
            c16092M47155.m38249();
        } catch (IOException unused) {
            if (c16092M47155 != null) {
                try {
                    c16092M47155.m38247();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
