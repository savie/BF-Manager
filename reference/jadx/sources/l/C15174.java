package l;

/* JADX INFO: renamed from: l.ܳۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8A6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f49482;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f49483;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f49484;

    public C15174(String str, int i, String str2) {
        this.f49482 = str;
        this.f49483 = i;
        this.f49484 = str2;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f49483), this.f49484) + (m36486() * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36484() {
        return this.f49482;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36487() {
        return this.f49483;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m36488(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15174) {
            return m36485(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36486() {
        return C17359.hash(this.f49482);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36485(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15174)) {
            return false;
        }
        return C17359.equals(this.f49482, ((C15174) obj).f49482);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15174)) {
            return false;
        }
        C15174 c15174 = (C15174) obj;
        return m36488(obj) && this.f49483 == c15174.f49483 && C17359.equals(this.f49484, c15174.f49484);
    }

    public final String toString() {
        String strM36484 = m36484();
        String strM34865 = strM36484 == null ? "null" : C14442.m34865("\"", strM36484, "\"");
        Integer numValueOf = Integer.valueOf(this.f49483);
        String str = this.f49484;
        return String.format("NetShareInfo1{netName: %s, type: %08x, remark: %s}", strM34865, numValueOf, str != null ? C14442.m34865("\"", str, "\"") : "null");
    }
}
