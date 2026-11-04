package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ᩴۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5Y4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19647 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f63286;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumMap f63287;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC22631[] f63288 = new EnumC22631[256];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f63289;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f63290;

    public C19647(int i, int i2) {
        InterfaceC8312 interfaceC8312;
        int i3 = 19;
        int i4 = 39;
        if (i >= 21) {
            this.f63286 = i;
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
            this.f63289 = i4;
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
            this.f63286 = i3;
            this.f63289 = i2;
        } else {
            this.f63286 = i;
            this.f63289 = i2;
        }
        this.f63287 = new EnumMap(EnumC22631.class);
        this.f63290 = new HashMap();
        int i5 = this.f63289;
        i5 = i5 == -1 ? this.f63286 : i5;
        for (EnumC22631 enumC22631 : EnumC22631.values()) {
            if (this.f63289 != -1) {
                interfaceC8312 = enumC22631.f73514;
            } else {
                interfaceC8312 = enumC22631.f73511;
            }
            Short sh = (Short) interfaceC8312.mo21436(Integer.valueOf(i5));
            if (sh != null) {
                if (!enumC22631.f73508.f23141) {
                    this.f63288[sh.shortValue()] = enumC22631;
                }
                this.f63287.put(enumC22631, sh);
                this.f63290.put(enumC22631.f73509.toLowerCase(), enumC22631);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C19647 m45292(int i) {
        return new C19647(i, -1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m45291(int i) {
        new C19647(-1, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C19647 m45293(int i) {
        int iM43755 = C18856.m43755(i);
        if (iM43755 != -1) {
            return new C19647(iM43755, -1);
        }
        throw new RuntimeException(C13645.m33382(i, "Unsupported dex version "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC22631 m45297(String str) {
        return (EnumC22631) this.f63290.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC22631 m45296(int i) {
        if (i == 256) {
            return EnumC22631.f73432;
        }
        if (i == 512) {
            return EnumC22631.f73383;
        }
        if (i == 768) {
            return EnumC22631.f73340;
        }
        if (i < 0) {
            return null;
        }
        EnumC22631[] enumC22631Arr = this.f63288;
        if (i < enumC22631Arr.length) {
            return enumC22631Arr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m45295() {
        return this.f63287.keySet();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Short m45294(EnumC22631 enumC22631) {
        return (Short) this.f63287.get(enumC22631);
    }
}
