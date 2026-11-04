package l;

/* JADX INFO: renamed from: l.۟֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C7514 extends AbstractC18701 {
    public C7514() {
        this.f2843 = EnumC9750.StartTag;
    }

    @Override // l.AbstractC18701, l.AbstractC0802
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC18701 mo3216() {
        super.mo3216();
        this.f60782 = null;
        return this;
    }

    public final String toString() {
        if (!m43492() || this.f60782.size() <= 0) {
            String str = this.f60786;
            return C14442.m34865("<", str != null ? str : "[unset]", ">");
        }
        String str2 = this.f60786;
        return C3188.m10404("<", str2 != null ? str2 : "[unset]", " ", this.f60782.m26655(), ">");
    }
}
