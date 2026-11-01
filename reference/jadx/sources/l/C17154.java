package l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ܿۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17154 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f54709;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f54710;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f54711;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12216 f54712;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f54713;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f54714;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f54715;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5865 f54716;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f54717;

    public C17154(AudioTrack audioTrack, InterfaceC5865 interfaceC5865) {
        this.f54712 = new C12216(audioTrack);
        this.f54715 = audioTrack.getSampleRate();
        this.f54716 = interfaceC5865;
        m40078(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40082(float f, long j, long j2) {
        if (j - this.f54717 < this.f54709) {
            return;
        }
        this.f54717 = j;
        C12216 c12216 = this.f54712;
        boolean zM30322 = c12216.m30322();
        int i = this.f54715;
        if (zM30322) {
            long jM30324 = c12216.m30324();
            long jM30325 = c12216.m30325();
            long jM30326 = c12216.m30324();
            long jM41828 = C17983.m41828(j - jM30326, f) + C17983.m41826(i, jM30325);
            long jAbs = Math.abs(jM30324 - j);
            InterfaceC5865 interfaceC5865 = this.f54716;
            if (jAbs > 5000000) {
                long jM30327 = c12216.m30325();
                C8127 c8127 = (C8127) interfaceC5865;
                c8127.getClass();
                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                sb.append(jM30327);
                sb.append(", ");
                sb.append(jM30324);
                sb.append(", ");
                sb.append(j);
                sb.append(", ");
                sb.append(j2);
                sb.append(", ");
                C7421 c7421 = c8127.f28449;
                sb.append(C7421.m19850(c7421));
                sb.append(", ");
                sb.append(c7421.m19870());
                C0303.m1848(sb.toString());
                m40078(4);
            } else if (Math.abs(jM41828 - j2) > 5000000) {
                long jM30328 = c12216.m30325();
                C8127 c8128 = (C8127) interfaceC5865;
                c8128.getClass();
                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(jM30328);
                sb2.append(", ");
                sb2.append(jM30324);
                sb2.append(", ");
                sb2.append(j);
                sb2.append(", ");
                sb2.append(j2);
                sb2.append(", ");
                C7421 c7422 = c8128.f28449;
                sb2.append(C7421.m19850(c7422));
                sb2.append(", ");
                sb2.append(c7422.m19870());
                C0303.m1848(sb2.toString());
                m40078(4);
            } else if (this.f54711 == 4) {
                m40078(0);
            }
        }
        int i2 = this.f54711;
        if (i2 == 0) {
            if (!zM30322) {
                if (j - this.f54713 > 500000) {
                    m40078(3);
                    return;
                }
                return;
            } else {
                if (c12216.m30324() >= this.f54713) {
                    this.f54714 = c12216.m30325();
                    this.f54710 = c12216.m30324();
                    m40078(1);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (zM30322) {
                    return;
                }
                m40078(0);
                return;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (zM30322) {
                    m40078(0);
                    return;
                }
                return;
            }
        }
        if (!zM30322) {
            m40078(0);
            return;
        }
        long jM30329 = c12216.m30325();
        long j3 = this.f54714;
        if (jM30329 > j3) {
            long j4 = this.f54710;
            long jM41829 = C17983.m41828(j - j4, f) + C17983.m41826(i, j3);
            long jM303210 = c12216.m30325();
            long jM303211 = c12216.m30324();
            if (Math.abs((C17983.m41828(j - jM303211, f) + C17983.m41826(i, jM303210)) - jM41829) < 1000) {
                m40078(2);
                return;
            }
        }
        if (j - this.f54713 > 2000000) {
            m40078(3);
        } else {
            this.f54714 = c12216.m30325();
            this.f54710 = c12216.m30324();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40084() {
        return this.f54711 == 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m40083() {
        int i = this.f54711;
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40079() {
        m40078(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40081() {
        this.f54712.m30323();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40078(int i) {
        this.f54711 = i;
        if (i == 0) {
            this.f54717 = 0L;
            this.f54714 = -1L;
            this.f54710 = -9223372036854775807L;
            this.f54713 = System.nanoTime() / 1000;
            this.f54709 = 10000L;
            return;
        }
        if (i == 1) {
            this.f54709 = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f54709 = 10000000L;
        } else {
            if (i == 4) {
                this.f54709 = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40080(long j, float f) {
        C12216 c12216 = this.f54712;
        long jM30325 = c12216.m30325();
        long jM30324 = c12216.m30324();
        return C17983.m41828(j - jM30324, f) + C17983.m41826(this.f54715, jM30325);
    }
}
