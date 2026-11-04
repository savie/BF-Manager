package l;

/* JADX INFO: renamed from: l.ۡ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76C */
/* JADX INFO: loaded from: classes3.dex */
public final class C9375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18459 f30450;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30451;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24691(C18459 c18459) {
        this.f30450 = c18459;
        this.f30451 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24689(char c) {
        C18459 c18459 = this.f30450;
        if (c18459 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f30451) {
            c18459.append('\n');
            this.f30451 = false;
            if (c == '\n') {
                return;
            }
        }
        if (c == '\r') {
            this.f30451 = true;
        } else {
            this.f30450.append(c);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24690(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        while (i < i2) {
            m24689(charSequence.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24688() {
        C18459 c18459 = this.f30450;
        if (c18459 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f30451) {
            c18459.append('\n');
            this.f30451 = false;
        }
    }
}
