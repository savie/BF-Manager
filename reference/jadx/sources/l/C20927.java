package l;

/* JADX INFO: renamed from: l.᩷ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76C */
/* JADX INFO: loaded from: classes4.dex */
public final class C20927 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14795 f67982;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f67983;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47042(C14795 c14795) {
        this.f67982 = c14795;
        this.f67983 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47040(char c) {
        C14795 c14795 = this.f67982;
        if (c14795 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f67983) {
            c14795.append('\n');
            this.f67983 = false;
            if (c == '\n') {
                return;
            }
        }
        if (c == '\r') {
            this.f67983 = true;
        } else {
            this.f67982.append(c);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47041(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        while (i < i2) {
            m47040(charSequence.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47039() {
        C14795 c14795 = this.f67982;
        if (c14795 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f67983) {
            c14795.append('\n');
            this.f67983 = false;
        }
    }
}
