package l;

/* JADX INFO: renamed from: l.ܰ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes5.dex */
public final class C14225 extends AbstractC0802 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f44947;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f44948 = new StringBuilder();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44949 = false;

    @Override // l.AbstractC0802
    /* JADX INFO: renamed from: ۫ */
    public final void mo3216() {
        super.mo3216();
        AbstractC0802.m3211(this.f44948);
        this.f44947 = null;
        this.f44949 = false;
    }

    public C14225() {
        this.f2843 = EnumC9750.Comment;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34533() {
        String str = this.f44947;
        return str != null ? str : this.f44948.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34534(char c) {
        String str = this.f44947;
        StringBuilder sb = this.f44948;
        if (str != null) {
            sb.append(str);
            this.f44947 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34535(String str) {
        String str2 = this.f44947;
        StringBuilder sb = this.f44948;
        if (str2 != null) {
            sb.append(str2);
            this.f44947 = null;
        }
        if (sb.length() == 0) {
            this.f44947 = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        return C14442.m34865("<!--", m34533(), "-->");
    }
}
