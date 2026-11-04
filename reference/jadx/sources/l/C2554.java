package l;

import android.net.Uri;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۖۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2554 implements InterfaceC15670 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Uri f8198 = Uri.parse("memory://hls-playlist");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC18962 f8199;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C16281 f8200;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f8201;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LongSupplier f8202;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16369 f8203;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C24734 f8204;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4046 f8205;

    public C2554(C16281 c16281, InterfaceC15670 interfaceC15670, InterfaceC16369 interfaceC16369, C4046 c4046, EnumC18962 enumC18962, LongSupplier longSupplier, C24734 c24734) {
        this.f8200 = c16281;
        this.f8201 = interfaceC15670;
        this.f8203 = interfaceC16369;
        this.f8205 = c4046;
        this.f8199 = enumC18962;
        this.f8202 = longSupplier;
        if (c24734 == null && enumC18962 == EnumC18962.f61480) {
            c24734 = new C24734();
        }
        this.f8204 = c24734;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13433 mo3996() {
        return new C9265(this);
    }
}
