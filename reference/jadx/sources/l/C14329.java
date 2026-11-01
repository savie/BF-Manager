package l;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: V543 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14329 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f46944;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f46945;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f46946;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f46947;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f46948;

    public C14329(String str, String str2, String str3, List list) {
        str.getClass();
        this.f46947 = str;
        str2.getClass();
        this.f46944 = str2;
        this.f46946 = str3;
        list.getClass();
        this.f46945 = list;
        this.f46948 = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m34585() {
        return this.f46947;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m34582() {
        return this.f46944;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m34584() {
        return this.f46946;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m34583() {
        return this.f46945;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34586() {
        return this.f46948;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f46947 + ", mProviderPackage: " + this.f46944 + ", mQuery: " + this.f46946 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f46945;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
