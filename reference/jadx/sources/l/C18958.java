package l;

/* JADX INFO: renamed from: l.ᩴ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18958 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C18958 f61388 = new C18958(-1, -1, -1);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f61389;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f61390;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f61391;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f61392;

    public C18958(int i, int i2, int i3) {
        this.f61389 = i;
        this.f61392 = i2;
        this.f61391 = i3;
        this.f61390 = C17983.m41853(i3) ? C17983.m41849(i3) * i2 : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f61389 + ", channelCount=" + this.f61392 + ", encoding=" + this.f61391 + ']';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18958)) {
            return false;
        }
        C18958 c18958 = (C18958) obj;
        return this.f61389 == c18958.f61389 && this.f61392 == c18958.f61392 && this.f61391 == c18958.f61391;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f61389), Integer.valueOf(this.f61392), Integer.valueOf(this.f61391));
    }
}
