package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3392 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9744[] f12529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C3392 f12527 = new C3392(new C9744[0]);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C9744 f12526 = new C9744().m24725();

    static {
        C17983.m41806(1);
        C17983.m41806(2);
        C17983.m41806(3);
        C17983.m41806(4);
    }

    public C3392(C9744[] c9744Arr) {
        this.f12528 = c9744Arr.length;
        this.f12529 = c9744Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9744 m10067(int i) {
        if (i < 0) {
            return f12526;
        }
        return this.f12529[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3392.class != obj.getClass()) {
            return false;
        }
        C3392 c3392 = (C3392) obj;
        return this.f12528 == c3392.f12528 && Arrays.equals(this.f12529, c3392.f12529);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12529) + (((((this.f12528 * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C9744[] c9744Arr = this.f12529;
            if (i < c9744Arr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c9744Arr[i].getClass();
                for (int i2 = 0; i2 < c9744Arr[i].f32790.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = c9744Arr[i].f32790[i2];
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
                    sb.append(c9744Arr[i].f32789[i2]);
                    sb.append(')');
                    if (i2 < c9744Arr[i].f32790.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < c9744Arr.length - 1) {
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
