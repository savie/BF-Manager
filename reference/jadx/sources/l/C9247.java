package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9247 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1045 f30099;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1045 f30100;

    public C9247() {
        C1045 c1045 = new C1045(this, 0, 0);
        this.f30099 = c1045;
        C1045 c1046 = new C1045(this, 0, 0);
        this.f30100 = c1046;
        c1045.f3771 = c1046;
        c1046.f3769 = c1045;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18198 m24431() {
        C1045 c1045 = this.f30099;
        C1045 c1046 = c1045.f3771;
        C1045 c1047 = this.f30100;
        if (c1046 == c1047) {
            return new C18198(null, null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (C1045 c1048 = c1045.f3771; c1048 != c1047; c1048 = c1048.f3771) {
            C2558[] c2558Arr = new C2558[c1048.f3766.size()];
            int i = 0;
            for (C9993 c9993 : c1048.f3766) {
                c2558Arr[i] = new C2558(c9993.f32104, c9993.f32103);
                i++;
            }
            C9269 c9269 = new C9269(c2558Arr, c1048.f3765);
            C9269 c92610 = (C9269) map.get(c9269);
            if (c92610 == null) {
                map.put(c9269, c9269);
                arrayList2.add(c9269);
            } else {
                c9269 = c92610;
            }
            int i2 = c1048.f3768;
            arrayList.add(new C8524(i2, c1048.f3770 - i2, c9269));
        }
        return new C18198(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24433(int i, int i2, int i3) {
        C18198 c18198M24432 = m24432(i, i2);
        C1045 c1045 = (C1045) c18198M24432.f59440;
        C1045 c1046 = (C1045) c18198M24432.f59441;
        do {
            int i4 = c1045.f3768;
            if (i4 > i) {
                C1045 c1047 = new C1045(this, i, i4);
                c1045.m3947(c1047);
                c1045 = c1047;
            }
            if (c1045.f3765 == -1) {
                c1045.f3765 = i3;
            }
            i = c1045.f3770;
            c1045 = c1045.f3771;
        } while (c1045.f3769 != c1046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18198 m24432(int i, int i2) {
        C1045 c1045;
        C1045 c1046;
        C1045 c1045M3946 = this.f30099.f3771;
        while (true) {
            c1045 = this.f30100;
            c1046 = null;
            if (c1045M3946 == c1045) {
                c1045M3946 = null;
                break;
            }
            int i3 = c1045M3946.f3768;
            if (i == i3) {
                break;
            }
            if (i > i3 && i < c1045M3946.f3770) {
                c1045M3946 = c1045M3946.m3946(i);
                break;
            }
            if (i < i3) {
                if (i2 <= i3) {
                    C1045 c1047 = new C1045(this, i, i2);
                    c1045M3946.m3947(c1047);
                    return new C18198(c1047, c1047);
                }
                C1045 c1048 = new C1045(this, i, i3);
                c1045M3946.m3947(c1048);
                c1045M3946 = c1048;
                break;
            }
            c1045M3946 = c1045M3946.f3771;
        }
        if (c1045M3946 == null) {
            C1045 c1049 = new C1045(this, i, i2);
            c1045.m3947(c1049);
            return new C18198(c1049, c1049);
        }
        for (C1045 c10410 = c1045M3946; c10410 != c1045; c10410 = c10410.f3771) {
            int i4 = c10410.f3770;
            if (i4 != i2) {
                int i5 = c10410.f3768;
                if (i5 < i2 && i4 > i2) {
                    c10410.m3946(i2);
                } else {
                    if (i5 >= i2) {
                        c1046 = new C1045(this, c10410.f3769.f3770, i2);
                        c10410.m3947(c1046);
                        break;
                    }
                }
            }
            c1046 = c10410;
            break;
        }
        if (c1046 == null) {
            c1046 = new C1045(this, c1045.f3769.f3770, i2);
            c1045.m3947(c1046);
        }
        return new C18198(c1045M3946, c1046);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24434(C20436 c20436, int i, int i2, int i3) {
        C18198 c18198M24432 = m24432(i, i2);
        C1045 c1045 = (C1045) c18198M24432.f59440;
        C1045 c1046 = (C1045) c18198M24432.f59441;
        C9993 c9993 = new C9993(c20436, i3);
        do {
            int i4 = c1045.f3768;
            if (i4 > i) {
                C1045 c1047 = new C1045(this, i, i4);
                c1045.m3947(c1047);
                c1045 = c1047;
            }
            c1045.f3766.addLast(c9993);
            i = c1045.f3770;
            c1045 = c1045.f3771;
        } while (c1045.f3769 != c1046);
    }
}
