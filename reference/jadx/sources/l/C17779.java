package l;

/* JADX INFO: renamed from: l.ᩳۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17779 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18485 f56370;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17261 f56371;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC22013 f56372;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19191 f56373;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f56375;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C18485 f56377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18485 f56378;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f56379;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f56380;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22719 f56381;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f56376 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5972 f56374 = new C5972();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41349(C22719 c22719) {
        this.f56381 = c22719;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41348(EnumC22013 enumC22013) {
        this.f56372 = enumC22013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41341(int i) {
        this.f56376 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41353(String str) {
        this.f56380 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41345(C17261 c17261) {
        this.f56371 = c17261;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41351() {
        C5972 c5972 = this.f56374;
        c5972.getClass();
        C10912.m27343("Proxy-Authenticate");
        C10912.m27341("OkHttp-Preemptive", "Proxy-Authenticate");
        c5972.m16268("Proxy-Authenticate");
        c5972.m16270("Proxy-Authenticate", "OkHttp-Preemptive");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41343(String str) {
        this.f56374.m16267("Warning", str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41344(C10912 c10912) {
        this.f56374 = c10912.m27346();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41347(AbstractC19191 abstractC19191) {
        this.f56373 = abstractC19191;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41354(C18485 c18485) {
        if (c18485 != null) {
            m41339("networkResponse", c18485);
        }
        this.f56370 = c18485;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41346(C18485 c18485) {
        if (c18485 != null) {
            m41339("cacheResponse", c18485);
        }
        this.f56378 = c18485;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41339(String str, C18485 c18485) {
        if (c18485.f58914 != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (c18485.f58911 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (c18485.f58906 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (c18485.f58918 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41350(C18485 c18485) {
        if (c18485.f58914 == null) {
            this.f56377 = c18485;
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41352(long j) {
        this.f56379 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41342(long j) {
        this.f56375 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18485 m41340() {
        if (this.f56381 == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f56372 == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f56376 < 0) {
            throw new IllegalStateException("code < 0: " + this.f56376);
        }
        if (this.f56380 == null) {
            throw new IllegalStateException("message == null");
        }
        return new C18485(this);
    }
}
