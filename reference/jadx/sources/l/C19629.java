package l;

/* JADX INFO: renamed from: l.᩵ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19629 implements InterfaceC9380 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f63000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18923 f63001;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8340 f63002;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8387 f63003 = new C8387();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8340 f63004;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10457 f63005;

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ܰ */
    public final void mo24062(String str) {
        C8340 c8340 = new C8340();
        c8340.f28877 = str;
        C8340 c8341 = this.f63004;
        C8387 c8387 = this.f63003;
        if (c8341 == null) {
            this.f63004 = c8340;
        } else {
            ((C8340) c8387.m8302()).f28879.add(c8340);
        }
        c8387.add(c8340);
        this.f63002 = c8340;
        this.f63000 = 1;
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24061(String str, String str2) {
        C18923 c18923 = new C18923();
        c18923.f61220 = str;
        c18923.f61226 = str2;
        C8387 c8387 = this.f63003;
        int i = ((C8340) c8387.m8302()).f75170;
        c18923.f61219 = i;
        c18923.f61218 = i;
        ((C8340) c8387.m8302()).f28878.add(c18923);
        this.f63001 = c18923;
        this.f63000 = 2;
    }

    @Override // l.InterfaceC9380
    public final void text(String str) {
        if (this.f63000 == 3) {
            C10457 c10457 = this.f63005;
            CharSequence charSequence = c10457.f35694;
            if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).append(str);
                return;
            }
            StringBuilder sb = new StringBuilder(charSequence);
            sb.append(str);
            c10457.f35694 = sb;
            return;
        }
        C10457 c10458 = new C10457();
        c10458.f35694 = str;
        ((C8340) this.f63003.m8302()).f28879.add(c10458);
        this.f63005 = c10458;
        this.f63000 = 3;
    }

    @Override // l.InterfaceC9380
    /* JADX INFO: renamed from: ۙ */
    public final void mo24060(String str) {
        if (!((C8340) this.f63003.pop()).f28877.equals(str)) {
            throw new RuntimeException();
        }
        this.f63000 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8340 m44724() {
        if (this.f63004 == null || !this.f63003.isEmpty()) {
            throw new RuntimeException();
        }
        return this.f63004;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44728(int i, int i2, int i3) {
        if (this.f63000 != 1) {
            throw new IllegalStateException();
        }
        C8340 c8340 = this.f63002;
        c8340.f75170 = i;
        c8340.f75169 = i2;
        c8340.f75168 = i3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44727(int i) {
        int i2 = this.f63000;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        this.f63002.f75171 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44726(int i, int i2, int i3) {
        if (this.f63000 != 2) {
            throw new IllegalStateException();
        }
        C18923 c18923 = this.f63001;
        c18923.f61218 = i;
        c18923.f61225 = i2;
        c18923.f61221 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44725(int i) {
        if (this.f63000 != 2) {
            throw new IllegalStateException();
        }
        this.f63001.f61223 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44730(int i, int i2, int i3) {
        if (this.f63000 != 2) {
            throw new IllegalStateException();
        }
        C18923 c18923 = this.f63001;
        c18923.f61219 = i;
        c18923.f61217 = i2;
        c18923.f61222 = i3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44729(int i) {
        if (this.f63000 != 2) {
            throw new IllegalStateException();
        }
        this.f63001.f61224 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44723(int i, int i2, int i3) {
        if (this.f63000 != 3) {
            throw new IllegalStateException();
        }
        C10457 c10457 = this.f63005;
        c10457.f75170 = i;
        c10457.f75169 = i2;
        c10457.f75168 = i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m44722(int i) {
        if (this.f63000 != 3) {
            throw new IllegalStateException();
        }
        this.f63005.f75171 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44731() {
        return this.f63000 == 3;
    }
}
