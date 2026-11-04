package l;

/* JADX INFO: renamed from: l.۬ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13565 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C13565 f43062 = new C13565(-1, -1, -1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f43063;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f43064;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f43065;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f43066;

    public C13565(int i, int i2, int i3) {
        this.f43066 = i;
        this.f43065 = i2;
        this.f43064 = i3;
        this.f43063 = C7116.m19494(i3) ? C7116.m19495(i3) * i2 : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f43066 + ", channelCount=" + this.f43065 + ", encoding=" + this.f43064 + ']';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13565)) {
            return false;
        }
        C13565 c13565 = (C13565) obj;
        return this.f43066 == c13565.f43066 && this.f43065 == c13565.f43065 && this.f43064 == c13565.f43064;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f43066), Integer.valueOf(this.f43065), Integer.valueOf(this.f43064));
    }
}
