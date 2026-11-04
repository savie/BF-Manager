package l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ܶۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15999 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f51932;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17491 f51933;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f51934;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f51935;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f51936;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f51937;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f51938;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23459 f51939;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f51940;

    public C15999(AudioTrack audioTrack, InterfaceC23459 interfaceC23459) {
        this.f51933 = new C17491(audioTrack);
        this.f51934 = audioTrack.getSampleRate();
        this.f51939 = interfaceC23459;
        m38128(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38131(float f, long j, long j2) {
        if (j - this.f51937 < this.f51936) {
            return;
        }
        this.f51937 = j;
        C17491 c17491 = this.f51933;
        boolean zM40998 = c17491.m40998();
        int i = this.f51934;
        if (zM40998) {
            long jM40996 = c17491.m40996();
            long jM40997 = c17491.m40997();
            long jM40998 = c17491.m40996();
            long jM19475 = C7116.m19475(j - jM40998, f) + C7116.m19473(i, jM40997);
            long jAbs = Math.abs(jM40996 - j);
            InterfaceC23459 interfaceC23459 = this.f51939;
            if (jAbs > 5000000) {
                long jM40999 = c17491.m40997();
                C10516 c10516 = (C10516) interfaceC23459;
                c10516.getClass();
                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                sb.append(jM40999);
                sb.append(", ");
                sb.append(jM40996);
                sb.append(", ");
                sb.append(j);
                sb.append(", ");
                sb.append(j2);
                sb.append(", ");
                C14991 c14991 = c10516.f33451;
                sb.append(C14991.m36059(c14991));
                sb.append(", ");
                sb.append(c14991.m36061());
                C1896.m6517(sb.toString());
                m38128(4);
            } else if (Math.abs(jM19475 - j2) > 5000000) {
                long jM409910 = c17491.m40997();
                C10516 c10517 = (C10516) interfaceC23459;
                c10517.getClass();
                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(jM409910);
                sb2.append(", ");
                sb2.append(jM40996);
                sb2.append(", ");
                sb2.append(j);
                sb2.append(", ");
                sb2.append(j2);
                sb2.append(", ");
                C14991 c14992 = c10517.f33451;
                sb2.append(C14991.m36059(c14992));
                sb2.append(", ");
                sb2.append(c14992.m36061());
                C1896.m6517(sb2.toString());
                m38128(4);
            } else if (this.f51932 == 4) {
                m38128(0);
            }
        }
        int i2 = this.f51932;
        if (i2 == 0) {
            if (!zM40998) {
                if (j - this.f51938 > 500000) {
                    m38128(3);
                    return;
                }
                return;
            } else {
                if (c17491.m40996() >= this.f51938) {
                    this.f51935 = c17491.m40997();
                    this.f51940 = c17491.m40996();
                    m38128(1);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (zM40998) {
                    return;
                }
                m38128(0);
                return;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (zM40998) {
                    m38128(0);
                    return;
                }
                return;
            }
        }
        if (!zM40998) {
            m38128(0);
            return;
        }
        long jM409911 = c17491.m40997();
        long j3 = this.f51935;
        if (jM409911 > j3) {
            long j4 = this.f51940;
            long jM19476 = C7116.m19475(j - j4, f) + C7116.m19473(i, j3);
            long jM409912 = c17491.m40997();
            long jM409913 = c17491.m40996();
            if (Math.abs((C7116.m19475(j - jM409913, f) + C7116.m19473(i, jM409912)) - jM19476) < 1000) {
                m38128(2);
                return;
            }
        }
        if (j - this.f51938 > 2000000) {
            m38128(3);
        } else {
            this.f51935 = c17491.m40997();
            this.f51940 = c17491.m40996();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m38133() {
        return this.f51932 == 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38132() {
        int i = this.f51932;
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m38134() {
        m38128(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38130() {
        this.f51933.m40995();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38128(int i) {
        this.f51932 = i;
        if (i == 0) {
            this.f51937 = 0L;
            this.f51935 = -1L;
            this.f51940 = -9223372036854775807L;
            this.f51938 = System.nanoTime() / 1000;
            this.f51936 = 10000L;
            return;
        }
        if (i == 1) {
            this.f51936 = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f51936 = 10000000L;
        } else {
            if (i == 4) {
                this.f51936 = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38129(long j, float f) {
        C17491 c17491 = this.f51933;
        long jM40997 = c17491.m40997();
        long jM40996 = c17491.m40996();
        return C7116.m19475(j - jM40996, f) + C7116.m19473(this.f51934, jM40997);
    }
}
