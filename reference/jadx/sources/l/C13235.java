package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 722Z */
/* JADX INFO: loaded from: classes4.dex */
public class C13235 implements InterfaceC22186 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42304 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42301 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42303 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f42302 = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f42301), Integer.valueOf(this.f42303), Integer.valueOf(this.f42304), Integer.valueOf(this.f42302)});
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof C13235)) {
            return false;
        }
        C13235 c13235 = (C13235) obj;
        if (this.f42301 == c13235.f42301) {
            int i2 = this.f42303;
            int i3 = c13235.f42303;
            int i4 = c13235.f42302;
            if (i4 == -1) {
                int i5 = c13235.f42304;
                int i6 = C13958.f44259;
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
            if (i2 == (i3 & 273) && this.f42304 == c13235.f42304 && this.f42302 == i4) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String strM33382;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f42302 != -1) {
            sb.append(" stream=");
            sb.append(this.f42302);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f42304;
        int i2 = C13958.f44259;
        switch (i) {
            case 0:
                strM33382 = "USAGE_UNKNOWN";
                break;
            case 1:
                strM33382 = "USAGE_MEDIA";
                break;
            case 2:
                strM33382 = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM33382 = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM33382 = "USAGE_ALARM";
                break;
            case 5:
                strM33382 = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM33382 = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM33382 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM33382 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM33382 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM33382 = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM33382 = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM33382 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM33382 = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM33382 = "USAGE_GAME";
                break;
            case 15:
            default:
                strM33382 = C13645.m33382(i, "unknown usage ");
                break;
            case 16:
                strM33382 = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM33382);
        sb.append(" content=");
        sb.append(this.f42301);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f42303).toUpperCase());
        return sb.toString();
    }
}
