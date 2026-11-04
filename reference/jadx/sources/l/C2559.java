package l;

/* JADX INFO: renamed from: l.ۖۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38EG */
/* JADX INFO: loaded from: classes3.dex */
public final class C2559 extends C13352 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C7450 f8227;

    @Override // l.C13352
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8381() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7450 m8594() {
        return this.f8227;
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۛ᩷ */
    public final C9097 mo5155() {
        int i;
        int i2;
        C7450 c7450 = this.f8227;
        int iM20443 = c7450.m20443() & 4095;
        if (!c7450.m20431()) {
            if (c7450.m20450()) {
                i2 = iM20443 | 16384;
            } else {
                i = 32768;
            }
            return new C9097(i2, c7450.m20420(), c7450.m20442());
        }
        i = 40960;
        i2 = iM20443 | i;
        return new C9097(i2, c7450.m20420(), c7450.m20442());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2559(C7450 c7450) {
        String strSubstring;
        String strSubstring2;
        String strM20456 = c7450.m20456();
        if (strM20456.isEmpty()) {
            strSubstring = "";
        } else {
            int length = strM20456.length();
            int i = length - 1;
            i = strM20456.charAt(i) == '/' ? length - 2 : i;
            strSubstring = strM20456.substring(strM20456.lastIndexOf(47, i) + 1, i + 1);
        }
        String strM20457 = c7450.m20456();
        if (strM20457.isEmpty()) {
            strSubstring2 = null;
        } else {
            int length2 = strM20457.length();
            int i2 = length2 - 1;
            int iLastIndexOf = strM20457.lastIndexOf(47, strM20457.charAt(i2) == '/' ? length2 - 2 : i2) + 1;
            strSubstring2 = iLastIndexOf != 0 ? strM20457.substring(0, iLastIndexOf) : "";
        }
        super(strSubstring, strSubstring2, c7450.m20431() ? c7450.m20438() : null, c7450.m20449(), c7450.m20445().getTime(), c7450.m20415());
        this.f8227 = c7450;
    }
}
