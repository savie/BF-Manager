package l;

/* JADX INFO: renamed from: l.ۤۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBDP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10853 implements InterfaceC22239 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34374;

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22239 mo8407() {
        return this;
    }

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8409() {
        return false;
    }

    public C10853(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f34374 = i;
    }

    public final String toString() {
        return "<addr:" + C5306.m15934(this.f34374) + ">";
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return toString();
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17759;
    }

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ᩴ */
    public final int mo8408() {
        return C5085.f17759.mo8408();
    }

    @Override // l.InterfaceC22239
    /* JADX INFO: renamed from: ֫ */
    public final int mo8406() {
        return C5085.f17759.mo8406();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10853) {
            return this.f34374 == ((C10853) obj).f34374;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34374;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27591() {
        return this.f34374;
    }
}
