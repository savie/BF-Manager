package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OK */
/* JADX INFO: loaded from: classes2.dex */
public class C2970 extends IOException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f9662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f9663;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2970 m9687(String str, IllegalArgumentException illegalArgumentException) {
        return new C2970(str, illegalArgumentException, true, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2970 m9688(String str, Throwable th) {
        return new C2970(str, th, true, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2970 m9686(String str) {
        return new C2970(str, null, true, 4);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2970 m9689(String str) {
        return new C2970(str, null, false, 1);
    }

    public C2970(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f9662 = z;
        this.f9663 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f9662);
        sb.append(", dataType=");
        return C12669.m31437(this.f9663, l.d, sb);
    }
}
