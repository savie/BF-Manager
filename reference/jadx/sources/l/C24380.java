package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes.dex */
public final class C24380 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C24380 f79095 = new C24380(new C6480[0]);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C6480 f79096 = new C6480().m18313();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f79097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6480[] f79098;

    static {
        C7116.m19499(1);
        C7116.m19499(2);
        C7116.m19499(3);
        C7116.m19499(4);
    }

    public C24380(C6480[] c6480Arr) {
        this.f79097 = c6480Arr.length;
        this.f79098 = c6480Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6480 m54497(int i) {
        if (i < 0) {
            return f79096;
        }
        return this.f79098[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24380.class != obj.getClass()) {
            return false;
        }
        C24380 c24380 = (C24380) obj;
        return this.f79097 == c24380.f79097 && Arrays.equals(this.f79098, c24380.f79098);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f79098) + (((((this.f79097 * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C6480[] c6480Arr = this.f79098;
            if (i < c6480Arr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c6480Arr[i].getClass();
                for (int i2 = 0; i2 < c6480Arr[i].f21785.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = c6480Arr[i].f21785[i2];
                    if (i3 == 0) {
                        sb.append('_');
                    } else if (i3 == 1) {
                        sb.append('R');
                    } else if (i3 == 2) {
                        sb.append('S');
                    } else if (i3 == 3) {
                        sb.append('P');
                    } else if (i3 == 4) {
                        sb.append('!');
                    } else {
                        sb.append('?');
                    }
                    sb.append(", durationUs=");
                    sb.append(c6480Arr[i].f21787[i2]);
                    sb.append(')');
                    if (i2 < c6480Arr[i].f21785.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < c6480Arr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
