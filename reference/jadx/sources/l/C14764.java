package l;

/* JADX INFO: renamed from: l.ܳ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 38EG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14764 extends C15404 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C10049 f48283;

    @Override // l.C15404
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15712() {
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10049 m35382() {
        return this.f48283;
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ۤܰ */
    public final C11731 mo7971() {
        int i;
        int i2;
        C10049 c10049 = this.f48283;
        int iM25438 = c10049.m25438() & 4095;
        if (!c10049.m25401()) {
            if (c10049.m25430()) {
                i2 = iM25438 | 16384;
            } else {
                i = 32768;
            }
            return new C11731(i2, c10049.m25416(), c10049.m25439());
        }
        i = 40960;
        i2 = iM25438 | i;
        return new C11731(i2, c10049.m25416(), c10049.m25439());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14764(C10049 c10049) {
        String strSubstring;
        String strSubstring2;
        String strM25433 = c10049.m25433();
        if (strM25433.isEmpty()) {
            strSubstring = "";
        } else {
            int length = strM25433.length();
            int i = length - 1;
            i = strM25433.charAt(i) == '/' ? length - 2 : i;
            strSubstring = strM25433.substring(strM25433.lastIndexOf(47, i) + 1, i + 1);
        }
        String strM25434 = c10049.m25433();
        if (strM25434.isEmpty()) {
            strSubstring2 = null;
        } else {
            int length2 = strM25434.length();
            int i2 = length2 - 1;
            int iLastIndexOf = strM25434.lastIndexOf(47, strM25434.charAt(i2) == '/' ? length2 - 2 : i2) + 1;
            strSubstring2 = iLastIndexOf != 0 ? strM25434.substring(0, iLastIndexOf) : "";
        }
        super(strSubstring, strSubstring2, c10049.m25401() ? c10049.m25404() : null, c10049.m25417(), c10049.m25429().getTime(), c10049.m25399());
        this.f48283 = c10049;
    }
}
