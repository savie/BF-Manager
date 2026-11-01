package l;

/* JADX INFO: renamed from: l.᩸᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C21828 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18258 f70879;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18300 f70880;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f70881;

    public C21828(C18300 c18300, AbstractC16579 abstractC16579, C18258 c18258) {
        this.f70880 = c18300;
        this.f70881 = abstractC16579;
        this.f70879 = c18258;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21828)) {
            return false;
        }
        C21828 c21828 = (C21828) obj;
        return c21828.f70879 == this.f70879 && this.f70880.f58388.m52399(this.f70881, c21828.f70881);
    }

    public final int hashCode() {
        C23800 c23800 = this.f70880.f58388;
        return C23800.m52345(this.f70881) & (~this.f70879.hashCode());
    }
}
