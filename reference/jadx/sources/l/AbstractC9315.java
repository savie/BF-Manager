package l;

/* JADX INFO: renamed from: l.ۢۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9315 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC2300 f31589;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo5332();

    /* JADX INFO: renamed from: ۨ */
    public abstract String mo5333();

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public AbstractC9315(EnumC2300 enumC2300) {
        this.f31589 = enumC2300;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m23891() {
        String strMo5332 = mo5332();
        int length = strMo5332.length();
        int iCharCount = 0;
        while (true) {
            EnumC2300 enumC2300 = this.f31589;
            if (iCharCount >= length) {
                return C16523.m38890(" { ", enumC2300.m7037(), " } ");
            }
            int iCodePointAt = strMo5332.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return C0242.m1617(" { ", enumC2300.m7037(), " ", strMo5332, " } ");
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public final String toString() {
        return C1679.m5594(this.f31589.m7038().m28666(), "_target ", mo5333());
    }
}
