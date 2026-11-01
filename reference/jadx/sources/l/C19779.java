package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBD8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19779 extends C18947 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16956 f63532;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f63533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f63534;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16956[] f63535;

    public C19779(C17661 c17661) {
        C5667 c5667M41141 = c17661.m41141();
        int iM36890 = c5667M41141.m36890();
        int iM15555 = c5667M41141.m15555();
        this.f63533 = iM15555;
        C16956 c16956 = new C16956(iM15555);
        this.f63532 = c16956;
        this.f63535 = new C16956[iM36890];
        this.f63534 = new HashMap(c5667M41141.m15554());
        c16956.mo9637();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44994(int i, C16956 c16956) {
        C16956[] c16956Arr = this.f63535;
        try {
            C16956 c16957 = c16956Arr[i];
            if (c16957 == null) {
                m43641();
                try {
                    c16956Arr[i] = c16956;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus label");
                }
            }
            C16956 c16956M39744 = c16957.m39744();
            if (c16957.size() != 0) {
                c16956M39744.m39742(c16956);
            } else {
                c16956M39744 = c16956.m39744();
            }
            if (c16957.equals(c16956M39744)) {
                return false;
            }
            c16956M39744.mo9637();
            m43641();
            try {
                c16956Arr[i] = c16956M39744;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus label");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16956 m44992(C12018 c12018) {
        try {
            C16956 c16956 = this.f63535[c12018.mo29913()];
            return c16956 != null ? c16956 : this.f63532;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44993(AbstractC15546 abstractC15546, C16251 c16251) {
        m43641();
        this.f63534.put(abstractC15546, c16251);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m44990(AbstractC15546 abstractC15546) {
        return (C16251) this.f63534.get(abstractC15546);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m44995() {
        return this.f63534.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16956 m44991(int i) {
        try {
            C16956 c16956 = this.f63535[i];
            return c16956 != null ? c16956.m39744() : new C16956(this.f63533);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }
}
