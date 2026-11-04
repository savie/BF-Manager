package l;

/* JADX INFO: renamed from: l.ۡܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01EH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30617;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30618;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f30619;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C25042[] f30620;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f30621;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f30622;

    public C9442(int i, int i2, String str, C25042[] c25042Arr, int i3, int i4) {
        this.f30619 = i;
        this.f30621 = i2;
        this.f30622 = str;
        this.f30620 = c25042Arr;
        this.f30618 = i3;
        this.f30617 = i4;
    }

    public C9442(C3609 c3609, int i, int i2) {
        if (c3609.mo16636()) {
            this.f30619 = 1;
            this.f30621 = -1;
            this.f30622 = c3609.mo11710().getValue();
            this.f30620 = c3609.mo11710().mo8824();
        } else if (c3609.mo16632()) {
            this.f30619 = 2;
            this.f30621 = c3609.getValue();
            this.f30622 = null;
            this.f30620 = null;
        } else if (c3609.mo16634()) {
            this.f30619 = 3;
            this.f30621 = c3609.getValue();
            this.f30622 = null;
            this.f30620 = null;
        } else {
            throw new RuntimeException();
        }
        this.f30618 = i;
        this.f30617 = i2;
    }

    public C9442(int i, int i2, int i3) {
        this.f30619 = 0;
        this.f30621 = i;
        this.f30622 = null;
        this.f30620 = null;
        this.f30618 = i2;
        this.f30617 = i3;
    }
}
