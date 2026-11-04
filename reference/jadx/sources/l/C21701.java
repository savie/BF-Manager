package l;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: l.᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V543 */
/* JADX INFO: loaded from: classes.dex */
public final class C21701 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f69253;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f69254;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f69255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f69256;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f69257;

    public C21701(String str, String str2, String str3, List list) {
        str.getClass();
        this.f69254 = str;
        str2.getClass();
        this.f69257 = str2;
        this.f69255 = str3;
        list.getClass();
        this.f69253 = list;
        this.f69256 = str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m49262() {
        return this.f69254;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m49265() {
        return this.f69257;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m49263() {
        return this.f69255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m49261() {
        return this.f69253;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m49264() {
        return this.f69256;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f69254 + ", mProviderPackage: " + this.f69257 + ", mQuery: " + this.f69255 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f69253;
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
