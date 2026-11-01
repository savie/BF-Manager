package l;

import bin.mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.ۘ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F764 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4205 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13379 f15275 = new C3184();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f15276;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11861(C15535 c15535) {
        synchronized (C4205.class) {
            if (!f15276) {
                f15275 = c15535;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11860() {
        if (f15276) {
            return;
        }
        synchronized (C4205.class) {
            if (f15276) {
                return;
            }
            try {
                try {
                    f15275.mo9605();
                    Radare2Native.nativeVersion();
                    f15276 = true;
                } catch (LinkageError e) {
                    throw new C7028("Failed to load libmt-radare2.so", e);
                }
            } catch (C7028 e2) {
                throw e2;
            }
        }
    }
}
