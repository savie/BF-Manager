package l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78M9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18566 extends C8936 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8402 f60326;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f60327;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15648 f60328;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f60329;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f60330;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f60331;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f60332;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18566 m43143(IOException iOException, int i) {
        return new C18566(0, iOException, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18566 m43145(Throwable th, String str, int i, C15648 c15648, int i2, C8402 c8402, boolean z, int i3) {
        return new C18566(1, th, i3, str, i, c15648, c15648 == null ? 4 : i2, c8402, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18566 m43144(RuntimeException runtimeException, int i) {
        return new C18566(2, runtimeException, i);
    }

    public C18566(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18566(String str, Throwable th, int i, int i2, String str2, int i3, C15648 c15648, int i4, C8402 c8402, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        C20782.m47565(!z || i2 == 1);
        C20782.m47565(th != null || i2 == 3);
        this.f60329 = i2;
        this.f60327 = str2;
        this.f60330 = i3;
        this.f60328 = c15648;
        this.f60332 = i4;
        this.f60326 = c8402;
        this.f60331 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18566 m43146(C8402 c8402) {
        String message = getMessage();
        String str = C7116.f23455;
        return new C18566(message, getCause(), this.f29167, this.f60329, this.f60327, this.f60330, this.f60328, this.f60332, c8402, this.f29168, this.f60331);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18566(int i, Throwable th, int i2, String str, int i3, C15648 c15648, int i4, C8402 c8402, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(c15648);
            sb.append(", format_supported=");
            String str3 = C7116.f23455;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            sb.append(str2);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : C14483.m34972(string, ": null"), th, i2, i, str, i3, c15648, i4, c8402, SystemClock.elapsedRealtime(), z);
    }
}
