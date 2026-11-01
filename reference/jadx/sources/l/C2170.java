package l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2170 extends C15100 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f7876;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f7877;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f7878;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7648 f7879;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15274 f7880;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f7881;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f7882;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2170 m6756(IOException iOException, int i) {
        return new C2170(0, iOException, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2170 m6758(Throwable th, String str, int i, C7648 c7648, int i2, C15274 c15274, boolean z, int i3) {
        return new C2170(1, th, i3, str, i, c7648, c7648 == null ? 4 : i2, c15274, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2170 m6757(RuntimeException runtimeException, int i) {
        return new C2170(2, runtimeException, i);
    }

    public C2170(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170(String str, Throwable th, int i, int i2, String str2, int i3, C7648 c7648, int i4, C15274 c15274, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        C2023.m6507(!z || i2 == 1);
        C2023.m6507(th != null || i2 == 3);
        this.f7882 = i2;
        this.f7878 = str2;
        this.f7877 = i3;
        this.f7879 = c7648;
        this.f7881 = i4;
        this.f7880 = c15274;
        this.f7876 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2170 m6759(C15274 c15274) {
        String message = getMessage();
        String str = C17983.f57504;
        return new C2170(message, getCause(), this.f49319, this.f7882, this.f7878, this.f7877, this.f7879, this.f7881, c15274, this.f49320, this.f7876);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2170(int i, Throwable th, int i2, String str, int i3, C7648 c7648, int i4, C15274 c15274, boolean z) {
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
            sb.append(c7648);
            sb.append(", format_supported=");
            String str3 = C17983.f57504;
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
        this(TextUtils.isEmpty(null) ? string : C15489.m37076(string, ": null"), th, i2, i, str, i3, c7648, i4, c15274, SystemClock.elapsedRealtime(), z);
    }
}
