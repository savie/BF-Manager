package l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1FO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16923 extends AbstractC22891 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f55314;

    @Override // l.AbstractC22891
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo6861() {
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m39906() {
        return this.f55314.toString();
    }

    @Override // l.AbstractC22891
    /* JADX INFO: renamed from: ۙ */
    public final void mo6856(C6178 c6178, HashMap map) {
        c6178.m17809(this.f74367);
        c6178.m17809(this.f74366);
        c6178.m17809(this.f74369);
        c6178.m17809(this.f74368);
        AbstractC22891.m51621(c6178, map, this.f55314.toString());
    }

    @Override // l.AbstractC22891
    /* JADX INFO: renamed from: ۙ */
    public final void mo6857(C20348 c20348, SparseArray sparseArray) {
        this.f74367 = c20348.m46741();
        this.f74366 = c20348.m46741();
        this.f74369 = c20348.m46741();
        this.f74368 = c20348.m46741();
        String str = (String) sparseArray.get(c20348.m46741());
        C17359.requireNonNull(str);
        this.f55314 = str;
    }

    public final String toString() {
        return "XmlText{text='" + ((Object) this.f55314) + "', line=" + this.f74367 + ", column=" + this.f74366 + ", startPosition=" + this.f74369 + ", endPosition=" + this.f74368 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16923.class == obj.getClass()) {
            C16923 c16923 = (C16923) obj;
            if (this.f74367 != c16923.f74367 || this.f74366 != c16923.f74366) {
                return false;
            }
            CharSequence charSequence = this.f55314;
            if (charSequence != null) {
                return c16923.f55314 != null && charSequence.toString().equals(c16923.f55314.toString());
            }
            if (c16923.f55314 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f55314;
        return ((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.f74367) * 31) + this.f74366;
    }
}
