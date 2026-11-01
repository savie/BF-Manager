package l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ܽ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P50M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16876 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String[] f53974;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17002 f53975;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C17002 f53976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17002[] f53977;

    public C16876() {
    }

    public C16876(C17002 c17002, C17002 c17003, C17002[] c17002Arr, String[] strArr) {
        this.f53976 = c17002;
        this.f53975 = c17003;
        this.f53977 = c17002Arr;
        this.f53974 = strArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16876 m39538(C10527 c10527) {
        int length = this.f53977.length;
        C17002[] c17002Arr = new C17002[length];
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            c17002Arr[i] = this.f53977[i].mo985(c10527);
            strArr[i] = this.f53974[i];
        }
        return new C16876(this.f53976.mo985(c10527), this.f53975.mo985(c10527), c17002Arr, strArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0242.m1617(".catch ", this.f53976.m39782(), " - ", this.f53975.m39782(), " : "));
        for (int i = 0; i < this.f53977.length; i++) {
            String str = this.f53974[i];
            if (str == null) {
                str = ProviderConfigurationPermission.ALL_STR;
            }
            sb.append(str);
            sb.append(" > ");
            sb.append(this.f53977[i].m39782());
            sb.append(",");
        }
        return sb.toString();
    }
}
