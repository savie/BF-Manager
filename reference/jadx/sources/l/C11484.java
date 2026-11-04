package l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11484 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f36124;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String[] f36125;

    public C11484(String str, String[] strArr) {
        if (str.isEmpty() && strArr.length == 0) {
            strArr = new String[]{""};
        }
        this.f36125 = strArr;
        this.f36124 = str;
    }

    public C11484(IOException iOException) {
        this.f36125 = new String[0];
        this.f36124 = iOException.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m28855() {
        return this.f36124.length() > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{lines=");
        sb.append(Arrays.toString(this.f36125));
        sb.append(", error='");
        return C8947.m23910(sb, this.f36124, "'}");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28854() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f36125) {
            sb.append(str);
        }
        if (m28855()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(this.f36124);
        }
        return sb.toString();
    }
}
