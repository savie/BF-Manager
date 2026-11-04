package l;

/* JADX INFO: renamed from: l.۬ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: LIYC */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14000 {
    APP(""),
    CORE("android.jar"),
    ANDROID_CAR("android.car.jar"),
    APACHE_HTTP_LEGACY_CLIENT("org.apache.http.legacy.jar");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44362;

    EnumC14000(String str) {
        this.f44362 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m34097() {
        return this.f44362;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14000 m34095(String str) {
        for (EnumC14000 enumC14000 : values()) {
            if (enumC14000.m34097().equals(str)) {
                return enumC14000;
            }
        }
        return APP;
    }
}
