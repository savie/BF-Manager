package l;

/* JADX INFO: renamed from: l.֨ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: P61M */
/* JADX INFO: loaded from: classes3.dex */
public final class C0868 extends AbstractC9816 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3248;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f3249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f3250;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f3251;

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3546() {
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3547() {
        return this;
    }

    public C0868() {
        this(new StringBuilder());
    }

    public C0868(StringBuilder sb) {
        this.f3248 = 1;
        this.f3251 = sb;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo3549(String str) {
        boolean z = this.f3250;
        StringBuilder sb = this.f3251;
        if (!z) {
            this.f3250 = true;
            sb.append('<');
        }
        sb.append(str);
        sb.append(':');
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3545() {
        this.f3251.append(':');
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3550() {
        this.f3251.append('^');
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3538(char c) {
        this.f3251.append(c);
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo3551(String str) {
        StringBuilder sb = this.f3251;
        sb.append('T');
        sb.append(str);
        sb.append(';');
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3537() {
        this.f3251.append('[');
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3539(String str) {
        StringBuilder sb = this.f3251;
        sb.append('L');
        sb.append(str);
        this.f3248 <<= 1;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3543() {
        int i = this.f3248;
        int i2 = i & 1;
        StringBuilder sb = this.f3251;
        if (i2 == 0) {
            this.f3248 = i | 1;
            sb.append('<');
        }
        sb.append('*');
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3548(char c) {
        int i = this.f3248;
        int i2 = i & 1;
        StringBuilder sb = this.f3251;
        if (i2 == 0) {
            this.f3248 = i | 1;
            sb.append('<');
        }
        if (c != '=') {
            sb.append(c);
        }
        return (this.f3248 & Integer.MIN_VALUE) == 0 ? this : new C0868(sb);
    }

    public final String toString() {
        return this.f3251.toString();
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3536() {
        if (this.f3250) {
            this.f3250 = false;
            this.f3251.append('>');
        }
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3540() {
        boolean z = this.f3250;
        StringBuilder sb = this.f3251;
        if (z) {
            this.f3250 = false;
            sb.append('>');
        }
        if (!this.f3249) {
            sb.append('(');
        }
        sb.append(')');
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC9816 mo3544() {
        boolean z = this.f3250;
        StringBuilder sb = this.f3251;
        if (z) {
            this.f3250 = false;
            sb.append('>');
        }
        if (!this.f3249) {
            this.f3249 = true;
            sb.append('(');
        }
        return this;
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo3541() {
        int i = this.f3248 & 1;
        StringBuilder sb = this.f3251;
        if (i == 1) {
            sb.append('>');
        }
        this.f3248 >>>= 1;
        sb.append(';');
    }

    @Override // l.AbstractC9816
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo3542(String str) {
        int i = this.f3248 & 1;
        StringBuilder sb = this.f3251;
        if (i == 1) {
            sb.append('>');
        }
        this.f3248 >>>= 1;
        sb.append('.');
        sb.append(str);
        this.f3248 <<= 1;
    }
}
