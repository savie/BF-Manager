package l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.۫᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P50M */
/* JADX INFO: loaded from: classes4.dex */
public final class C13397 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11817 f42694;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11817 f42695;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11817[] f42696;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String[] f42697;

    public C13397() {
    }

    public C13397(C11817 c11817, C11817 c11818, C11817[] c11817Arr, String[] strArr) {
        this.f42695 = c11817;
        this.f42694 = c11818;
        this.f42696 = c11817Arr;
        this.f42697 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13397 m33033(C5194 c5194) {
        int length = this.f42696.length;
        C11817[] c11817Arr = new C11817[length];
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            c11817Arr[i] = this.f42696[i].mo2797(c5194);
            strArr[i] = this.f42697[i];
        }
        return new C13397(this.f42695.mo2797(c5194), this.f42694.mo2797(c5194), c11817Arr, strArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C3188.m10404(".catch ", this.f42695.m29665(), " - ", this.f42694.m29665(), " : "));
        for (int i = 0; i < this.f42696.length; i++) {
            String str = this.f42697[i];
            if (str == null) {
                str = ProviderConfigurationPermission.ALL_STR;
            }
            sb.append(str);
            sb.append(" > ");
            sb.append(this.f42696[i].m29665());
            sb.append(",");
        }
        return sb.toString();
    }
}
