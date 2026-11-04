package l;

/* JADX INFO: renamed from: l.۫֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12775 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f40878;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC6919 f40881;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 f40880 = C14769.m35543();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public EnumC20234 f40879 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f40877 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC16124 f40876 = EnumC16124.SPECULATIVE;

    public C12775(C22010 c22010) {
        this.f40878 = c22010;
        this.f40881 = c22010.f71018;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31662(AbstractC11781 abstractC11781, C17007 c17007) {
        this.f40880 = this.f40880.m35546(new C15012(this.f40878.f71022.f40879, abstractC11781, c17007, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31663(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664) {
        this.f40880 = this.f40880.m35546(new C15012(this.f40878.f71022.f40879, abstractC11781, null, abstractC22664));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4192 m31660(AbstractC11781 abstractC11781, C2596 c2596, C14479 c14479, C1083 c1083) {
        C4192 c4192Mo2277;
        C22010 c22010 = this.f40878;
        if (c14479 == null) {
            c4192Mo2277 = c22010.f71035.f41172;
        } else {
            c4192Mo2277 = c14479.f45571.mo2277();
        }
        C12863 c12863 = c22010.f71035;
        C17359.requireNonNull(c12863);
        return new C4192(c12863, this.f40876, abstractC11781, this.f40879, c2596, c4192Mo2277, c1083);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16124 m31661() {
        return this.f40876;
    }
}
