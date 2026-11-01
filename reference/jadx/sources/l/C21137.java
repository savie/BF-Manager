package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 722Z */
/* JADX INFO: loaded from: classes5.dex */
public class C21137 implements InterfaceC8438 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f68846 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f68847 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68849 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f68848 = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68847), Integer.valueOf(this.f68849), Integer.valueOf(this.f68846), Integer.valueOf(this.f68848)});
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof C21137)) {
            return false;
        }
        C21137 c21137 = (C21137) obj;
        if (this.f68847 == c21137.f68847) {
            int i2 = this.f68849;
            int i3 = c21137.f68849;
            int i4 = c21137.f68848;
            if (i4 == -1) {
                int i5 = c21137.f68846;
                int i6 = C18315.f58418;
                if ((i3 & 1) != 1) {
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f68846 == c21137.f68846 && this.f68848 == i4) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String strM22141;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f68848 != -1) {
            sb.append(" stream=");
            sb.append(this.f68848);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f68846;
        int i2 = C18315.f58418;
        switch (i) {
            case 0:
                strM22141 = "USAGE_UNKNOWN";
                break;
            case 1:
                strM22141 = "USAGE_MEDIA";
                break;
            case 2:
                strM22141 = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM22141 = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM22141 = "USAGE_ALARM";
                break;
            case 5:
                strM22141 = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM22141 = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM22141 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM22141 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM22141 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM22141 = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM22141 = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM22141 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM22141 = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM22141 = "USAGE_GAME";
                break;
            case 15:
            default:
                strM22141 = C8479.m22141(i, "unknown usage ");
                break;
            case 16:
                strM22141 = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM22141);
        sb.append(" content=");
        sb.append(this.f68847);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f68849).toUpperCase());
        return sb.toString();
    }
}
