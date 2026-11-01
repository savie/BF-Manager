package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OK */
/* JADX INFO: loaded from: classes.dex */
public class C22861 extends IOException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f74362;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f74363;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22861 m50609(String str, IllegalArgumentException illegalArgumentException) {
        return new C22861(str, illegalArgumentException, true, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22861 m50610(String str, Throwable th) {
        return new C22861(str, th, true, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22861 m50608(String str) {
        return new C22861(str, null, true, 4);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C22861 m50611(String str) {
        return new C22861(str, null, false, 1);
    }

    public C22861(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f74362 = z;
        this.f74363 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f74362);
        sb.append(", dataType=");
        return C12441.m30911(this.f74363, l.d, sb);
    }
}
