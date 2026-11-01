package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes4.dex */
public final class C15059 implements InterfaceC9663 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f49087;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f49088;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f49089;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20328 f49091;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f49092;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f49093;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20328 f49094;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20328 f49095;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6591 f49096;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f49099;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49100;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49101;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC9663 f49102;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22820[] f49097 = new C22820[8];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49098 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49090 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15059 m36084(int i, int i2, int i3, InterfaceC9663 interfaceC9663, C6591 c6591) {
        C13638.requireNonNull(c6591, "budget");
        if (c6591.m17898()) {
            return new C15059(i, i2, i3, interfaceC9663, c6591);
        }
        return null;
    }

    public C15059(int i, int i2, int i3, InterfaceC9663 interfaceC9663, C6591 c6591) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("End search starts outside the document");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("Non-positive end search stride");
        }
        this.f49093 = i;
        this.f49087 = i2;
        this.f49102 = interfaceC9663;
        this.f49096 = c6591;
        if (!c6591.m17899()) {
            throw new IllegalStateException("End search proof budget exhausted");
        }
        long j = i2;
        long j2 = ((long) i) - j;
        int iMax = (int) Math.max(i3, j2 == 0 ? 1L : (j2 + 1022) / 1023);
        this.f49099 = iMax;
        this.f49091 = new C20328(i);
        this.f49095 = new C20328(i);
        this.f49094 = new C20328(i);
        this.f49097[0] = new C22820(i2, new C20328(i).m45887());
        this.f49089 = j;
        this.f49092 = j + ((long) iMax);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36087(int i) {
        int i2;
        if (this.f49101 || this.f49088) {
            throw new IllegalStateException("End search candidate is already active or finished");
        }
        if (i != this.f49089 || i < this.f49087 || i > (i2 = this.f49093)) {
            throw new IllegalArgumentException("End search candidates are not contiguous");
        }
        C20328 c20328 = this.f49094;
        c20328.m45888(i2);
        c20328.m45882(i);
        this.f49090 = i;
        this.f49088 = true;
        InterfaceC9663 interfaceC9663 = this.f49102;
        if (interfaceC9663 != null) {
            ((C15059) interfaceC9663).m36093(i);
        }
        if (i == i2) {
            c20328.m45881();
            if (interfaceC9663 != null) {
                ((C15059) interfaceC9663).m36086();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36089(boolean z) {
        if (!this.f49088) {
            throw new IllegalStateException("No active end search candidate");
        }
        int i = this.f49090;
        int i2 = this.f49093;
        C20328 c20328 = this.f49094;
        if (!z && i != i2) {
            int i3 = i + 1;
            c20328.m45882(i3);
            InterfaceC9663 interfaceC9663 = this.f49102;
            if (interfaceC9663 != null) {
                ((C15059) interfaceC9663).m36093(i3);
            }
        }
        this.f49095.m45885(c20328);
        C20328 c20329 = this.f49091;
        if (!z) {
            c20329.m45885(c20328);
        }
        this.f49088 = false;
        this.f49090 = -1;
        if (z) {
            this.f49101 = true;
            return;
        }
        if (i == i2) {
            this.f49089 = ((long) i2) + 1;
            this.f49101 = true;
            return;
        }
        int i4 = i + 1;
        long j = i4;
        this.f49089 = j;
        if (j >= this.f49092) {
            if (this.f49098 < 1024) {
                C6591 c6591 = this.f49096;
                if (c6591.m17898()) {
                    C0571 c0571M45887 = c20329.m45887();
                    if (this.f49098 != 1024 && c6591.m17899()) {
                        int i5 = this.f49098;
                        C22820[] c22820Arr = this.f49097;
                        if (i5 == c22820Arr.length) {
                            this.f49097 = (C22820[]) Arrays.copyOf(this.f49097, Math.min(1024, c22820Arr.length << 1));
                        }
                        C22820[] c22820Arr2 = this.f49097;
                        int i6 = this.f49098;
                        this.f49098 = i6 + 1;
                        c22820Arr2[i6] = new C22820(i4, c0571M45887);
                    }
                }
            }
            this.f49092 = j + ((long) this.f49099);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0571 m36092() {
        m36083();
        if (this.f49088) {
            throw new IllegalStateException("End search candidate is still active");
        }
        return this.f49095.m45887();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22820 m36085(int i) {
        m36083();
        if (i < this.f49087 || i > this.f49093) {
            throw new IllegalArgumentException("End search proof offset is outside the trace");
        }
        int i2 = this.f49098 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f49097[i4].f74236 <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return this.f49097[i2];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m36091(int i) {
        m36083();
        return i >= this.f49087 && i <= this.f49093;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36090() {
        if (this.f49100) {
            return;
        }
        Arrays.fill(this.f49097, 0, this.f49098, (Object) null);
        this.f49096.m17897(this.f49098);
        this.f49098 = 0;
        this.f49100 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36086() {
        m36083();
        if (this.f49088) {
            this.f49094.m45881();
            InterfaceC9663 interfaceC9663 = this.f49102;
            if (interfaceC9663 != null) {
                ((C15059) interfaceC9663).m36086();
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36088(int i, int i2) {
        m36083();
        if (this.f49088) {
            this.f49094.m45883(i, i2);
            InterfaceC9663 interfaceC9663 = this.f49102;
            if (interfaceC9663 != null) {
                ((C15059) interfaceC9663).m36088(i, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36093(int i) {
        m36083();
        if (this.f49088) {
            this.f49094.m45882(i);
            InterfaceC9663 interfaceC9663 = this.f49102;
            if (interfaceC9663 != null) {
                ((C15059) interfaceC9663).m36093(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m36083() {
        if (this.f49100) {
            throw new IllegalStateException("End search trace has been released");
        }
    }
}
