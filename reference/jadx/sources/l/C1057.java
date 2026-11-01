package l;

import android.net.Uri;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.֨ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1057 implements InterfaceC20723 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Uri f4899 = Uri.parse("memory://hls-playlist");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC1118 f4900;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f4901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1263 f4902;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LongSupplier f4903;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC11642 f4904;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20814 f4905;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14424 f4906;

    public C1057(C1263 c1263, InterfaceC20723 interfaceC20723, InterfaceC1118 interfaceC1118, C14424 c14424, EnumC11642 enumC11642, LongSupplier longSupplier, C20814 c20814) {
        this.f4902 = c1263;
        this.f4901 = interfaceC20723;
        this.f4900 = interfaceC1118;
        this.f4906 = c14424;
        this.f4904 = enumC11642;
        this.f4903 = longSupplier;
        if (c20814 == null && enumC11642 == EnumC11642.f39119) {
            c20814 = new C20814();
        }
        this.f4905 = c20814;
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 mo4000() {
        return new C22225(this);
    }
}
