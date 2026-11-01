package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes.dex */
public final class C22997 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6768 f74737;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6768 f74738;

    public C22997() {
        C6768 c6768 = new C6768(this, 0, 0);
        this.f74737 = c6768;
        C6768 c6769 = new C6768(this, 0, 0);
        this.f74738 = c6769;
        c6768.f22855 = c6769;
        c6769.f22857 = c6768;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5357 m50859() {
        C6768 c6768 = this.f74737;
        C6768 c6769 = c6768.f22855;
        C6768 c67610 = this.f74738;
        if (c6769 == c67610) {
            return new C5357(null, null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (C6768 c67611 = c6768.f22855; c67611 != c67610; c67611 = c67611.f22855) {
            C14885[] c14885Arr = new C14885[c67611.f22858.size()];
            int i = 0;
            for (C3945 c3945 : c67611.f22858) {
                c14885Arr[i] = new C14885(c3945.f14670, c3945.f14669);
                i++;
            }
            C22646 c22646 = new C22646(c14885Arr, c67611.f22856);
            C22646 c22647 = (C22646) map.get(c22646);
            if (c22647 == null) {
                map.put(c22646, c22646);
                arrayList2.add(c22646);
            } else {
                c22646 = c22647;
            }
            int i2 = c67611.f22860;
            arrayList.add(new C21234(i2, c67611.f22859 - i2, c22646));
        }
        return new C5357(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50861(int i, int i2, int i3) {
        C5357 c5357M50860 = m50860(i, i2);
        C6768 c6768 = (C6768) c5357M50860.f18504;
        C6768 c6769 = (C6768) c5357M50860.f18505;
        do {
            int i4 = c6768.f22860;
            if (i4 > i) {
                C6768 c67610 = new C6768(this, i, i4);
                c6768.m18349(c67610);
                c6768 = c67610;
            }
            if (c6768.f22856 == -1) {
                c6768.f22856 = i3;
            }
            i = c6768.f22859;
            c6768 = c6768.f22855;
        } while (c6768.f22857 != c6769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5357 m50860(int i, int i2) {
        C6768 c6768;
        C6768 c6769;
        C6768 c6768M18348 = this.f74737.f22855;
        while (true) {
            c6768 = this.f74738;
            c6769 = null;
            if (c6768M18348 == c6768) {
                c6768M18348 = null;
                break;
            }
            int i3 = c6768M18348.f22860;
            if (i == i3) {
                break;
            }
            if (i > i3 && i < c6768M18348.f22859) {
                c6768M18348 = c6768M18348.m18348(i);
                break;
            }
            if (i < i3) {
                if (i2 <= i3) {
                    C6768 c67610 = new C6768(this, i, i2);
                    c6768M18348.m18349(c67610);
                    return new C5357(c67610, c67610);
                }
                C6768 c67611 = new C6768(this, i, i3);
                c6768M18348.m18349(c67611);
                c6768M18348 = c67611;
                break;
            }
            c6768M18348 = c6768M18348.f22855;
        }
        if (c6768M18348 == null) {
            C6768 c67612 = new C6768(this, i, i2);
            c6768.m18349(c67612);
            return new C5357(c67612, c67612);
        }
        for (C6768 c67613 = c6768M18348; c67613 != c6768; c67613 = c67613.f22855) {
            int i4 = c67613.f22859;
            if (i4 != i2) {
                int i5 = c67613.f22860;
                if (i5 < i2 && i4 > i2) {
                    c67613.m18348(i2);
                } else {
                    if (i5 >= i2) {
                        c6769 = new C6768(this, c67613.f22857.f22859, i2);
                        c67613.m18349(c6769);
                        break;
                    }
                }
            }
            c6769 = c67613;
            break;
        }
        if (c6769 == null) {
            c6769 = new C6768(this, c6768.f22857.f22859, i2);
            c6768.m18349(c6769);
        }
        return new C5357(c6768M18348, c6769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50862(C1953 c1953, int i, int i2, int i3) {
        C5357 c5357M50860 = m50860(i, i2);
        C6768 c6768 = (C6768) c5357M50860.f18504;
        C6768 c6769 = (C6768) c5357M50860.f18505;
        C3945 c3945 = new C3945(c1953, i3);
        do {
            int i4 = c6768.f22860;
            if (i4 > i) {
                C6768 c67610 = new C6768(this, i, i4);
                c6768.m18349(c67610);
                c6768 = c67610;
            }
            c6768.f22858.addLast(c3945);
            i = c6768.f22859;
            c6768 = c6768.f22855;
        } while (c6768.f22857 != c6769);
    }
}
