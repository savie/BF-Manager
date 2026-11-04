package l;

/* JADX INFO: renamed from: l.ۤۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10765 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f34172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17478 f34173;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f34174;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13003 f34175;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f34176;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34177;

    public C10765(C17478 c17478, C13003 c13003, Object obj, String str) {
        int i;
        synchronized (this) {
            i = f34172;
            f34172 = i + 1;
        }
        this.f34177 = i;
        this.f34173 = c17478;
        this.f34175 = c13003;
        this.f34176 = obj;
        this.f34174 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C17478 c17478 = this.f34173;
        if (c17478 != null) {
            sb.append(c17478);
            sb.append(':');
        }
        sb.append(this.f34175);
        Object obj = this.f34176;
        if (obj != null && !c17478.equals(obj)) {
            sb.append(":");
            sb.append(obj);
        }
        sb.append(" -> ");
        sb.append(this.f34174);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10765)) {
            return false;
        }
        C10765 c10765 = (C10765) obj;
        return C17359.equals(this.f34173, c10765.f34173) && C17359.equals(this.f34176, c10765.f34176) && this.f34175.equals(c10765.f34175) && this.f34174.equals(c10765.f34174);
    }

    public final int hashCode() {
        return this.f34174.hashCode() + ((this.f34175.hashCode() + ((C17359.hashCode(this.f34176) + (C17359.hashCode(this.f34173) * 31)) * 31)) * 31);
    }
}
