package l;

/* JADX INFO: renamed from: l.ۜܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P61M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6885 extends AbstractC4062 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f23190;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f23191;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f23192;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f23193;

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC4062 mo4450() {
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC4062 mo4455() {
        return this;
    }

    public C6885() {
        this(new StringBuilder());
    }

    public C6885(StringBuilder sb) {
        this.f23191 = 1;
        this.f23190 = sb;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ܰ */
    public final void mo4457(String str) {
        boolean z = this.f23193;
        StringBuilder sb = this.f23190;
        if (!z) {
            this.f23193 = true;
            sb.append('<');
        }
        sb.append(str);
        sb.append(':');
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC4062 mo4458() {
        this.f23190.append(':');
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC4062 mo4444() {
        this.f23190.append('^');
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۙ */
    public final void mo4448(char c) {
        this.f23190.append(c);
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۖ */
    public final void mo4445(String str) {
        StringBuilder sb = this.f23190;
        sb.append('T');
        sb.append(str);
        sb.append(';');
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4062 mo4447() {
        this.f23190.append('[');
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۙ */
    public final void mo4449(String str) {
        StringBuilder sb = this.f23190;
        sb.append('L');
        sb.append(str);
        this.f23191 <<= 1;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۜ */
    public final void mo4451() {
        int i = this.f23191;
        int i2 = i & 1;
        StringBuilder sb = this.f23190;
        if (i2 == 0) {
            this.f23191 = i | 1;
            sb.append('<');
        }
        sb.append('*');
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC4062 mo4456(char c) {
        int i = this.f23191;
        int i2 = i & 1;
        StringBuilder sb = this.f23190;
        if (i2 == 0) {
            this.f23191 = i | 1;
            sb.append('<');
        }
        if (c != '=') {
            sb.append(c);
        }
        return (this.f23191 & Integer.MIN_VALUE) == 0 ? this : new C6885(sb);
    }

    public final String toString() {
        return this.f23190.toString();
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ֨ */
    public final AbstractC4062 mo4443() {
        boolean z = this.f23193;
        StringBuilder sb = this.f23190;
        if (z) {
            this.f23193 = false;
            sb.append('>');
        }
        if (!this.f23192) {
            this.f23192 = true;
            sb.append('(');
        }
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC4062 mo4446() {
        if (this.f23193) {
            this.f23193 = false;
            this.f23190.append('>');
        }
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۬ */
    public final AbstractC4062 mo4454() {
        boolean z = this.f23193;
        StringBuilder sb = this.f23190;
        if (z) {
            this.f23193 = false;
            sb.append('>');
        }
        if (!this.f23192) {
            sb.append('(');
        }
        sb.append(')');
        return this;
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۨ */
    public final void mo4452() {
        int i = this.f23191 & 1;
        StringBuilder sb = this.f23190;
        if (i == 1) {
            sb.append('>');
        }
        this.f23191 >>>= 1;
        sb.append(';');
    }

    @Override // l.AbstractC4062
    /* JADX INFO: renamed from: ۨ */
    public final void mo4453(String str) {
        int i = this.f23191 & 1;
        StringBuilder sb = this.f23190;
        if (i == 1) {
            sb.append('>');
        }
        this.f23191 >>>= 1;
        sb.append('.');
        sb.append(str);
        this.f23191 <<= 1;
    }
}
