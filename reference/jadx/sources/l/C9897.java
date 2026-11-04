package l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۢۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9897 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f31822;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f31823;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f31824;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f31825;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31826;

    public C9897() {
        String[] strArr = Build.SUPPORTED_ABIS;
        String str = strArr[0];
        str.getClass();
        String str2 = "x86";
        switch (str) {
            case "x86_64":
                str2 = "x86_64";
                break;
            case "x86":
                break;
            case "armeabi-v7a":
                str2 = "arm";
                break;
            case "arm64-v8a":
                str2 = "arm64";
                break;
            default:
                throw new RuntimeException("Unsupported architecture: " + strArr[0]);
        }
        this.f31822 = str2;
    }
}
