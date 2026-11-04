package l;

/* JADX INFO: renamed from: l.ۗ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3425 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC24309 f11102;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo6633();

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo6635();

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public AbstractC3425(EnumC24309 enumC24309) {
        this.f11102 = enumC24309;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m11180() {
        String strMo6633 = mo6633();
        int length = strMo6633.length();
        int iCharCount = 0;
        while (true) {
            EnumC24309 enumC24309 = this.f11102;
            if (iCharCount >= length) {
                return C14442.m34865(" { ", enumC24309.m54351(), " } ");
            }
            int iCodePointAt = strMo6633.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return C3188.m10404(" { ", enumC24309.m54351(), " ", strMo6633, " } ");
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public final String toString() {
        return C20196.m46451(this.f11102.m54352().m18169(), "_target ", mo6635());
    }
}
