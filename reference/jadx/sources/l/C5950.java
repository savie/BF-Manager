package l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20238;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String[] f20239;

    public C5950(String str, String[] strArr) {
        if (str.isEmpty() && strArr.length == 0) {
            strArr = new String[]{""};
        }
        this.f20239 = strArr;
        this.f20238 = str;
    }

    public C5950(IOException iOException) {
        this.f20239 = new String[0];
        this.f20238 = iOException.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m16221() {
        return this.f20238.length() > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{lines=");
        sb.append(Arrays.toString(this.f20239));
        sb.append(", error='");
        return C22697.m50267(sb, this.f20238, "'}");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16220() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f20239) {
            sb.append(str);
        }
        if (m16221()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(this.f20238);
        }
        return sb.toString();
    }
}
