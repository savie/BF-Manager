package l;

/* JADX INFO: renamed from: l.᩷ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C4FW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20653 extends AbstractC19191 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f67224;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f67225;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f67226;

    public C20653(String str, long j, InterfaceC23683 interfaceC23683) {
        this.f67226 = str;
        this.f67225 = j;
        this.f67224 = interfaceC23683;
    }

    @Override // l.AbstractC19191
    /* JADX INFO: renamed from: ᩹ */
    public final C9501 mo5213() {
        String str = this.f67226;
        if (str == null) {
            return null;
        }
        try {
            return C9501.m24336(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC19191
    /* JADX INFO: renamed from: ۖ */
    public final long mo5212() {
        return this.f67225;
    }

    @Override // l.AbstractC19191
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC23683 mo5211() {
        return this.f67224;
    }
}
