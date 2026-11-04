package l;

/* JADX INFO: renamed from: l.֨ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC4225 f4491;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8699 f4492;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9444 f4493;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f4495;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9444 f4496;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f4497;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f4498;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9444 f4500;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5717 f4501;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7954 f4502;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f4494 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1988 f4499 = new C1988();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4485(C7954 c7954) {
        this.f4502 = c7954;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4483(EnumC4225 enumC4225) {
        this.f4491 = enumC4225;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4480(int i) {
        this.f4494 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4492(String str) {
        this.f4497 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4484(C5717 c5717) {
        this.f4501 = c5717;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4490() {
        C1988 c1988 = this.f4499;
        c1988.getClass();
        C11682.m29359("Proxy-Authenticate");
        C11682.m29357("OkHttp-Preemptive", "Proxy-Authenticate");
        c1988.m6812("Proxy-Authenticate");
        c1988.m6814("Proxy-Authenticate", "OkHttp-Preemptive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4482(String str) {
        this.f4499.m6811("Warning", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4488(C11682 c11682) {
        this.f4499 = c11682.m29362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4486(AbstractC8699 abstractC8699) {
        this.f4492 = abstractC8699;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4493(C9444 c9444) {
        if (c9444 != null) {
            m4478("networkResponse", c9444);
        }
        this.f4496 = c9444;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4487(C9444 c9444) {
        if (c9444 != null) {
            m4478("cacheResponse", c9444);
        }
        this.f4500 = c9444;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4478(String str, C9444 c9444) {
        if (c9444.f30632 != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (c9444.f30624 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (c9444.f30633 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (c9444.f30629 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4489(C9444 c9444) {
        if (c9444.f30632 == null) {
            this.f4493 = c9444;
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4491(long j) {
        this.f4498 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4481(long j) {
        this.f4495 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m4479() {
        if (this.f4502 == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f4491 == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f4494 < 0) {
            throw new IllegalStateException("code < 0: " + this.f4494);
        }
        if (this.f4497 == null) {
            throw new IllegalStateException("message == null");
        }
        return new C9444(this);
    }
}
