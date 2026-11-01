package l;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10457 extends AbstractC23157 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f35694;

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo21788() {
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m26418() {
        return this.f35694.toString();
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ */
    public final void mo21782(C11018 c11018, HashMap map) {
        c11018.m27775(this.f75170);
        c11018.m27775(this.f75169);
        c11018.m27775(this.f75168);
        c11018.m27775(this.f75171);
        AbstractC23157.m51154(c11018, map, this.f35694.toString());
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ */
    public final void mo21783(C17367 c17367, SparseArray sparseArray) {
        this.f75170 = c17367.m40454();
        this.f75169 = c17367.m40454();
        this.f75168 = c17367.m40454();
        this.f75171 = c17367.m40454();
        String str = (String) sparseArray.get(c17367.m40454());
        C13638.requireNonNull(str);
        this.f35694 = str;
    }

    public final String toString() {
        return "XmlText{text='" + ((Object) this.f35694) + "', line=" + this.f75170 + ", column=" + this.f75169 + ", startPosition=" + this.f75168 + ", endPosition=" + this.f75171 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10457.class == obj.getClass()) {
            C10457 c10457 = (C10457) obj;
            if (this.f75170 != c10457.f75170 || this.f75169 != c10457.f75169) {
                return false;
            }
            CharSequence charSequence = this.f35694;
            if (charSequence != null) {
                return c10457.f35694 != null && charSequence.toString().equals(c10457.f35694.toString());
            }
            if (c10457.f35694 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f35694;
        return ((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.f75170) * 31) + this.f75169;
    }
}
