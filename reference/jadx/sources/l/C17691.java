package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17691 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5697 f56175;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14744 f56176;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f56177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21571 f56179;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f56180;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16072 f56181;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f56185;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f56186;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Thread f56178 = Thread.currentThread();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21695 f56183 = new C21695();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56182 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1959 f56184 = InterfaceC1959.f7372;

    public C17691(C16072 c16072, InterfaceC3800 interfaceC3800) {
        this.f56181 = c16072;
        this.f56185 = interfaceC3800;
        this.f56179 = C21571.m48288(c16072.f51982, new byte[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41222(C22631 c22631, C0568 c0568, int i, int i2, C16797 c16797, byte[] bArr) throws Throwable {
        m41215();
        if (this.f56176 != null || this.f56175 != null) {
            throw new IllegalStateException("Legacy editor state already supplied");
        }
        try {
            if (i < 1 || i > 1024 || i2 < 0 || i2 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C6402 c6402M50169 = c22631.m50169();
            C22631.m50163(c6402M50169.f21716);
            m41220(new C3579(c6402M50169), c22631.m50169().m17551(), c0568, c22631.m50166());
            int iM35339 = this.f56176.m35339();
            m41221(c22631.m50173(), c22631.m50170(), c22631.m50165());
            int iM41218 = m41218(i, i2, new C4895(c16797));
            C6276 c6276 = new C6276(this.f56176, 0L);
            try {
                C19103 c19103 = new C19103(c6276, iM41218, iM35339);
                try {
                    C6402 c6402M50168 = c22631.m50168(7);
                    if (c6402M50168 != null) {
                        C22631.m50163(c6402M50168.f21716);
                        C0757 c0757 = new C0757(c6402M50168.m17551(), new C3579(c6402M50168));
                        try {
                            c19103.m43867(c0757.readInt());
                            c19103.m43867(c0757.readInt());
                            c0757.m3263();
                            c0757.close();
                        } catch (Throwable th) {
                            try {
                                c0757.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    C6402[] c6402Arr = {c22631.m50167(), c22631.m50175()};
                    for (int i3 = 0; i3 < 2; i3++) {
                        C6402 c6402 = c6402Arr[i3];
                        if (c6402 != null) {
                            C22631.m50163(c6402.f21716);
                            c19103.m43868(new C3579(c6402), c6402.m17551(), new C22979());
                        }
                    }
                    c19103.close();
                    c6276.close();
                    C4991 c4991M13819 = C4991.m13819(c22631, iM41218, iM35339, bArr, this.f56181.f51982);
                    try {
                        m41219(c4991M13819.length(), c4991M13819.m13824());
                        c4991M13819.close();
                    } catch (Throwable th3) {
                        try {
                            c4991M13819.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c19103.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    c6276.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (IOException e) {
            e = e;
            this.f56186 = true;
            throw e;
        } catch (Error e2) {
            e = e2;
            this.f56186 = true;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            this.f56186 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41220(InputStream inputStream, long j, C0568 c0568, int i) {
        Integer numValueOf = Integer.valueOf(i);
        try {
            C0757 c0757 = new C0757(j, inputStream);
            m41215();
            if (this.f56176 != null) {
                throw new IllegalStateException("Legacy text already supplied");
            }
            try {
                C14744 c14744M3266 = c0757.m3266(this.f56181, new C18280(2, c0568), numValueOf);
                c0757.m3263();
                this.f56176 = c14744M3266;
                ((C3579) inputStream).f13171 = true;
            } catch (C16281 e) {
                this.f56186 = true;
                throw e;
            }
        } catch (Throwable th) {
            try {
                ((C3579) inputStream).f13171 = true;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41221(C8872 c8872, int i, int i2) {
        m41215();
        if (this.f56176 != null) {
            if (this.f56180 || this.f56177) {
                throw new IllegalStateException("Legacy history already supplied or pages joined");
            }
            if (c8872.m23016() > this.f56176.m35339() || c8872.m23014() > this.f56176.m35339()) {
                throw new IllegalArgumentException("Legacy selection exceeds text");
            }
            this.f56183 = new C21695(new C6899(), c8872, ((long) i) & 4294967295L, ((long) i2) & 4294967295L, 16777216L);
            this.f56180 = true;
            return;
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41218(int i, int i2, C4895 c4895) throws Throwable {
        String str;
        int i3;
        C14744 c14744M949;
        int i4 = i2;
        m41215();
        C14744 c14744 = this.f56176;
        if (c14744 != null) {
            if (this.f56177) {
                throw new IllegalStateException("Legacy pages already joined");
            }
            C21695 c21695 = this.f56183;
            if (i < 1 || i > 1024 || i4 < 0 || i4 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C16072 c16072 = c14744.f48220;
            if (c16072 == null) {
                throw new IllegalArgumentException("Legacy page migration requires a page store");
            }
            C14744 c14744M35326 = C14744.m35326(c16072.f51978, c16072.f51976, c16072);
            int i5 = 0;
            int iM35339 = 0;
            while (i5 < i) {
                if (i5 == i4) {
                    iM35339 = c14744M35326.m35339();
                    c14744M949 = c14744;
                } else {
                    C9931 c9931M25135 = C9931.m25135(((C16797) c4895.f17178).m39445(i5), c16072.f51982);
                    try {
                        c14744M949 = C0052.m949(c9931M25135, c16072, Integer.MAX_VALUE - c14744M35326.m35339(), null);
                        c9931M25135.close();
                    } catch (Throwable th) {
                        try {
                            c9931M25135.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                C14744 c14745 = c14744;
                if (((long) c14744M35326.m35339()) + ((long) c14744M949.m35339()) > Integer.MAX_VALUE) {
                    throw new IOException("Legacy pages exceed migration coordinate limit");
                }
                c14744M35326 = c14744M35326.m35337(c14744M949);
                i5++;
                i4 = i2;
                c14744 = c14745;
            }
            C6899 c6899 = new C6899();
            C8872 c8872 = c21695.f70377;
            int iM23016 = c8872.m23016();
            int i6 = -1;
            if (iM23016 == -1) {
                i3 = -1;
                str = "Legacy page coordinate exceeds limit";
            } else {
                str = "Legacy page coordinate exceeds limit";
                if (((long) iM23016) + ((long) iM35339) > 2147483647L) {
                    throw new IOException(str);
                }
                i3 = iM23016 + iM35339;
            }
            int iM23014 = c8872.m23014();
            if (iM23014 != -1) {
                if (((long) iM23014) + ((long) iM35339) > 2147483647L) {
                    throw new IOException(str);
                }
                i6 = iM23014 + iM35339;
            }
            C8520 c8520 = new C8520(c14744M35326, new C21695(c6899, new C8872(i3, i6), c21695.f70376, c21695.f70375, c21695.f70378), iM35339);
            this.f56176 = c8520.m22249();
            this.f56183 = c8520.m22251();
            this.f56177 = true;
            return c8520.m22250();
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41219(long j, InputStream inputStream) throws IOException {
        try {
            m41215();
            if (this.f56175 != null) {
                throw new IllegalStateException("Migration state already supplied");
            }
            this.f56186 = true;
            InterfaceC3800 interfaceC3800 = this.f56185;
            C16072 c16072 = this.f56181;
            this.f56175 = C23337.m51431(interfaceC3800, c16072.f51979, inputStream, j, c16072.f51982, this.f56184);
            inputStream.close();
            this.f56186 = false;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41215() {
        if (!this.f56182 || this.f56186 || this.f56178 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer is outside its converter callback or failed");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m41213(C17691 c17691) {
        C5697 c5697;
        C16072 c16072 = c17691.f56181;
        c17691.m41215();
        C14744 c14744 = c17691.f56176;
        if (c14744 == null) {
            throw new IllegalStateException("Legacy text has not been supplied");
        }
        C22277.m49447(c17691.f56183.f70379, c14744.m35339());
        C5697 c5698 = c17691.f56175;
        if (c5698 == null) {
            c5697 = new C5697(c16072.f51979, 0L, null, c17691.f56179.m48291());
        } else {
            c5697 = new C5697(c16072.f51979, c5698.f19435, c5698.f19436, c17691.f56179.m48291());
        }
        C21571 c21571M48288 = C21571.m48288(c16072.f51982, c5697.m15718());
        c17691.f56179.close();
        c17691.f56179 = c21571M48288;
        c17691.f56182 = false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f56178 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer belongs to its converter thread");
        }
        this.f56182 = false;
        this.f56176 = null;
        this.f56183 = null;
        C21571 c21571 = this.f56179;
        if (c21571 != null) {
            c21571.close();
            this.f56179 = null;
        }
    }
}
