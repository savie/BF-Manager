package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0685 extends C18947 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16956 f2863;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f2864;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f2865;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16956[] f2866;

    public C0685(C4108 c4108) {
        ArrayList arrayListM11687 = c4108.m11687();
        int iM11685 = c4108.m11685();
        this.f2864 = iM11685;
        C16956 c16956 = new C16956(iM11685);
        this.f2863 = c16956;
        this.f2866 = new C16956[arrayListM11687.size()];
        this.f2865 = new HashMap();
        c16956.mo9637();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3063(int i, C16956 c16956) {
        C16956[] c16956Arr = this.f2866;
        try {
            C16956 c16957 = c16956Arr[i];
            if (c16957 == null) {
                m43641();
                try {
                    c16956Arr[i] = c16956;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus index");
                }
            }
            C16956 c16956M39744 = c16957.m39744();
            c16956M39744.m39742(c16956);
            if (c16957.equals(c16956M39744)) {
                return false;
            }
            c16956M39744.mo9637();
            m43641();
            try {
                c16956Arr[i] = c16956M39744;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus index");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3062(AbstractC22454 abstractC22454, C16251 c16251) {
        m43641();
        this.f2865.put(abstractC22454, c16251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16956 m3061(int i) {
        try {
            C16956 c16956 = this.f2866[i];
            return c16956 != null ? c16956 : this.f2863;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16956 m3064(int i) {
        try {
            C16956 c16956 = this.f2866[i];
            return c16956 != null ? c16956.m39744() : new C16956(this.f2864);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }
}
