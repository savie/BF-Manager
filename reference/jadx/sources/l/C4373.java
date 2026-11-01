package l;

/* JADX INFO: renamed from: l.ۙۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N3OT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4373 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21307 f15615;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10912 f15616;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4373 m12226(String str, String str2, AbstractC21307 abstractC21307) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        C13547.m33134(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            C13547.m33134(sb, str2);
        }
        C5972 c5972 = new C5972();
        String string = sb.toString();
        C10912.m27343("Content-Disposition");
        c5972.m16270("Content-Disposition", string);
        C10912 c10912 = new C10912(c5972);
        if (c10912.m27345("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c10912.m27345("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        return new C4373(c10912, abstractC21307);
    }

    public C4373(C10912 c10912, AbstractC21307 abstractC21307) {
        this.f15616 = c10912;
        this.f15615 = abstractC21307;
    }
}
