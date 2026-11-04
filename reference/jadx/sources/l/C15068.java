package l;

/* JADX INFO: renamed from: l.ܳۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15068 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49199;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC19544 f49200;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f49201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f49202;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f49203;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f49204;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49205;

    public C15068(int i) {
        m36328(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36328(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f49201 = i;
        this.f49199 = -1;
        this.f49204 = -1;
        this.f49203 = -1;
        this.f49202 = -1;
        this.f49205 = false;
        this.f49200 = EnumC19544.COMPLETE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36323(int i, int i2) {
        if (i == i2) {
            m36322(i);
            return;
        }
        if (i < 0 || i > i2 || i2 > this.f49201) {
            throw new IndexOutOfBoundsException("Invalid dependency read range");
        }
        int i3 = this.f49202;
        if (i3 == -1 || i < i3) {
            this.f49202 = i;
        }
        if (i2 > this.f49203) {
            this.f49203 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36322(int i) {
        if (i < 0 || i > this.f49201) {
            throw new IndexOutOfBoundsException("Invalid dependency boundary");
        }
        int i2 = this.f49204;
        if (i2 == -1 || i < i2) {
            this.f49204 = i;
        }
        if (i > this.f49199) {
            this.f49199 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36321() {
        this.f49205 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m36326() {
        this.f49200 = EnumC19544.UNKNOWN;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36324(C12831 c12831) {
        C17359.requireNonNull(c12831);
        if (this.f49201 != c12831.f41104) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c12831.f41105;
        if (i != -1) {
            int i2 = this.f49202;
            if (i2 == -1 || i < i2) {
                this.f49202 = i;
            }
            int i3 = c12831.f41106;
            if (i3 > this.f49203) {
                this.f49203 = i3;
            }
        }
        int i4 = c12831.f41107;
        if (i4 != -1) {
            int i5 = this.f49204;
            if (i5 == -1 || i4 < i5) {
                this.f49204 = i4;
            }
            int i6 = c12831.f41102;
            if (i6 > this.f49199) {
                this.f49199 = i6;
            }
        }
        this.f49205 |= c12831.f41108;
        EnumC19544 enumC19544 = c12831.f41103;
        EnumC19544 enumC19545 = EnumC19544.UNKNOWN;
        if (enumC19544 == enumC19545) {
            this.f49200 = enumC19545;
            return;
        }
        EnumC19544 enumC19546 = EnumC19544.INCOMPLETE;
        if (enumC19544 == enumC19546 && this.f49200 == EnumC19544.COMPLETE) {
            this.f49200 = enumC19546;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36325(C15068 c15068) {
        C17359.requireNonNull(c15068);
        if (c15068 == this) {
            return;
        }
        if (this.f49201 != c15068.f49201) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c15068.f49202;
        if (i != -1) {
            int i2 = this.f49202;
            if (i2 == -1 || i < i2) {
                this.f49202 = i;
            }
            int i3 = c15068.f49203;
            if (i3 > this.f49203) {
                this.f49203 = i3;
            }
        }
        int i4 = c15068.f49204;
        if (i4 != -1) {
            int i5 = this.f49204;
            if (i5 == -1 || i4 < i5) {
                this.f49204 = i4;
            }
            int i6 = c15068.f49199;
            if (i6 > this.f49199) {
                this.f49199 = i6;
            }
        }
        this.f49205 |= c15068.f49205;
        EnumC19544 enumC19544 = c15068.f49200;
        EnumC19544 enumC19545 = EnumC19544.UNKNOWN;
        if (enumC19544 == enumC19545) {
            this.f49200 = enumC19545;
            return;
        }
        EnumC19544 enumC19546 = EnumC19544.INCOMPLETE;
        if (enumC19544 == enumC19546 && this.f49200 == EnumC19544.COMPLETE) {
            this.f49200 = enumC19546;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12831 m36327() {
        return new C12831(this, this.f49200);
    }
}
