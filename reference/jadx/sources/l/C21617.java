package l;

/* JADX INFO: renamed from: l.᩶᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21617 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4618 f69043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14069 f69044;

    public /* synthetic */ C21617(C21772 c21772, C4618 c4618, C14069 c14069) {
        this.f69043 = c4618;
        this.f69044 = c14069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24975 m49140(String str) {
        C4618 c4618 = this.f69043;
        if (c4618.f16370 == null || !str.equals(c4618.f16371)) {
            C24975 c24975M34232 = this.f69044.m34232(str);
            c4618.f16370 = c24975M34232;
            c4618.f16371 = str;
            return c24975M34232;
        }
        return c4618.f16370;
    }
}
