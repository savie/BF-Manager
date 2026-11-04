package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M8II */
/* JADX INFO: loaded from: classes.dex */
public final class C24657 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f79812;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC19435[] f79813;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f79814;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f79815;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f79816;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f79817;

    public C24657(String str, int i, int i2, long j, long j2, AbstractC19435[] abstractC19435Arr) {
        super("CHAP");
        this.f79816 = str;
        this.f79814 = i;
        this.f79817 = i2;
        this.f79815 = j;
        this.f79812 = j2;
        this.f79813 = abstractC19435Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24657.class == obj.getClass()) {
            C24657 c24657 = (C24657) obj;
            if (this.f79814 == c24657.f79814 && this.f79817 == c24657.f79817 && this.f79815 == c24657.f79815 && this.f79812 == c24657.f79812 && C17359.equals(this.f79816, c24657.f79816) && Arrays.equals(this.f79813, c24657.f79813)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f79814 + 527) * 31) + this.f79817) * 31) + ((int) this.f79815)) * 31) + ((int) this.f79812)) * 31;
        String str = this.f79816;
        return i + (str != null ? str.hashCode() : 0);
    }
}
