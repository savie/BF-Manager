package l;

import java.io.PrintStream;

/* JADX INFO: renamed from: l.᩵ܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: WAV3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20677 extends C25153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20677 f66293 = new C20677();

    @Override // l.InterfaceC2032
    /* JADX INFO: renamed from: ۙ */
    public final void mo2202(AbstractC9488 abstractC9488, Object obj, int i, int i2, String str, C10234 c10234) {
        PrintStream printStream = System.err;
        StringBuilder sbM5126 = C1402.m5126("line ", i, ":", " ", i2);
        sbM5126.append(str);
        printStream.println(sbM5126.toString());
    }
}
