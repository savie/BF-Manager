package l;

import bin.mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F764 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7735 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0277 f25480 = new C18176();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile boolean f25481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21062(C14087 c14087) {
        synchronized (C7735.class) {
            if (!f25481) {
                f25480 = c14087;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21061() {
        if (f25481) {
            return;
        }
        synchronized (C7735.class) {
            if (f25481) {
                return;
            }
            try {
                try {
                    f25480.mo1814();
                    Radare2Native.nativeVersion();
                    f25481 = true;
                } catch (LinkageError e) {
                    throw new C18922("Failed to load libmt-radare2.so", e);
                }
            } catch (C18922 e2) {
                throw e2;
            }
        }
    }
}
