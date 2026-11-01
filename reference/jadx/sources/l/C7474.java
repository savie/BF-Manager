package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۟۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5Y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7474 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f24880;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24881;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC10297[] f24882 = new EnumC10297[256];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumMap f24883;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f24884;

    public C7474(int i, int i2) {
        InterfaceC3196 interfaceC3196;
        int i3 = 19;
        int i4 = 39;
        if (i >= 21) {
            this.f24881 = i;
            if (i >= 19) {
                switch (i) {
                    case 19:
                    case 20:
                        i4 = 7;
                        break;
                    case 21:
                        break;
                    case 22:
                        i4 = 45;
                        break;
                    case 23:
                        i4 = 64;
                        break;
                    case 24:
                    case 25:
                        i4 = 79;
                        break;
                    case 26:
                        i4 = 124;
                        break;
                    case 27:
                        i4 = 131;
                        break;
                    case 28:
                        i4 = 138;
                        break;
                    case 29:
                        i4 = 170;
                        break;
                    case 30:
                        i4 = 183;
                        break;
                    case 31:
                    case 32:
                        i4 = 199;
                        break;
                    case 33:
                        i4 = HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS;
                        break;
                    case 34:
                        i4 = 230;
                        break;
                    case 35:
                        i4 = 244;
                        break;
                    default:
                        i4 = Scalar25519.TARGET_LENGTH;
                        break;
                }
            } else {
                i4 = -1;
            }
            this.f24884 = i4;
        } else if (i2 >= 0 && i2 < 39) {
            if (i2 >= 244) {
                i3 = 35;
            } else if (i2 >= 230) {
                i3 = 34;
            } else if (i2 >= 225) {
                i3 = 33;
            } else if (i2 >= 199) {
                i3 = 32;
            } else if (i2 >= 183) {
                i3 = 30;
            } else if (i2 >= 170) {
                i3 = 29;
            } else if (i2 >= 138) {
                i3 = 28;
            } else if (i2 >= 131) {
                i3 = 27;
            } else if (i2 >= 124) {
                i3 = 26;
            } else if (i2 >= 79) {
                i3 = 24;
            } else if (i2 >= 64) {
                i3 = 23;
            } else if (i2 >= 45) {
                i3 = 22;
            } else if (i2 >= 39) {
                i3 = 21;
            }
            this.f24881 = i3;
            this.f24884 = i2;
        } else {
            this.f24881 = i;
            this.f24884 = i2;
        }
        this.f24883 = new EnumMap(EnumC10297.class);
        this.f24880 = new HashMap();
        int i5 = this.f24884;
        i5 = i5 == -1 ? this.f24881 : i5;
        for (EnumC10297 enumC10297 : EnumC10297.values()) {
            if (this.f24884 != -1) {
                interfaceC3196 = enumC10297.f35330;
            } else {
                interfaceC3196 = enumC10297.f35327;
            }
            Short sh = (Short) interfaceC3196.mo2653(Integer.valueOf(i5));
            if (sh != null) {
                if (!enumC10297.f35328.f57757) {
                    this.f24882[sh.shortValue()] = enumC10297;
                }
                this.f24883.put(enumC10297, sh);
                this.f24880.put(enumC10297.f35326.toLowerCase(), enumC10297);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7474 m19963(int i) {
        return new C7474(i, -1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m19962(int i) {
        new C7474(-1, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C7474 m19961(int i) {
        int iM2176 = C0418.m2176(i);
        if (iM2176 != -1) {
            return new C7474(iM2176, -1);
        }
        throw new RuntimeException(C8479.m22141(i, "Unsupported dex version "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10297 m19967(String str) {
        return (EnumC10297) this.f24880.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10297 m19966(int i) {
        if (i == 256) {
            return EnumC10297.f35054;
        }
        if (i == 512) {
            return EnumC10297.f35081;
        }
        if (i == 768) {
            return EnumC10297.f35114;
        }
        if (i < 0) {
            return null;
        }
        EnumC10297[] enumC10297Arr = this.f24882;
        if (i < enumC10297Arr.length) {
            return enumC10297Arr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m19965() {
        return this.f24883.keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Short m19964(EnumC10297 enumC10297) {
        return (Short) this.f24883.get(enumC10297);
    }
}
