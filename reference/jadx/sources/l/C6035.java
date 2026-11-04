package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6035 implements AutoCloseable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12547 f20642;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10046 f20643;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f20645;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C21697 f20646;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f20647;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f20648;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6781 f20650;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f20652;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Thread f20644 = Thread.currentThread();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C12219 f20641 = new C12219();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20649 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22465 f20651 = InterfaceC22465.f72702;

    public C6035(C10046 c10046, InterfaceC24329 interfaceC24329) {
        this.f20643 = c10046;
        this.f20652 = interfaceC24329;
        this.f20642 = C12547.m31220(c10046.f32208, new byte[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17513(C3051 c3051, C18426 c18426, int i, int i2, C0527 c0527, byte[] bArr) throws Throwable {
        m17506();
        if (this.f20646 != null || this.f20650 != null) {
            throw new IllegalStateException("Legacy editor state already supplied");
        }
        try {
            if (i < 1 || i > 1024 || i2 < 0 || i2 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C23189 c23189M9915 = c3051.m9915();
            C3051.m9914(c23189M9915.f75152);
            m17512(new C15729(c23189M9915), c3051.m9915().m52116(), c18426, c3051.m9919());
            int iM49259 = this.f20646.m49259();
            m17514(c3051.m9925(), c3051.m9924(), c3051.m9920());
            int iM17510 = m17510(i, i2, new C19403(2, c0527));
            C7305 c7305 = new C7305(this.f20646, 0L);
            try {
                C14237 c14237 = new C14237(c7305, iM17510, iM49259);
                try {
                    C23189 c23189M9917 = c3051.m9917(7);
                    if (c23189M9917 != null) {
                        C3051.m9914(c23189M9917.f75152);
                        C16475 c16475 = new C16475(c23189M9917.m52116(), new C15729(c23189M9917));
                        try {
                            c14237.m34559(c16475.readInt());
                            c14237.m34559(c16475.readInt());
                            c16475.m39099();
                            c16475.close();
                        } catch (Throwable th) {
                            try {
                                c16475.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    C23189[] c23189Arr = {c3051.m9916(), c3051.m9921()};
                    for (int i3 = 0; i3 < 2; i3++) {
                        C23189 c23189 = c23189Arr[i3];
                        if (c23189 != null) {
                            C3051.m9914(c23189.f75152);
                            c14237.m34560(new C15729(c23189), c23189.m52116(), new C24579());
                        }
                    }
                    c14237.close();
                    c7305.close();
                    C11254 c11254M28486 = C11254.m28486(c3051, iM17510, iM49259, bArr, this.f20643.f32208);
                    try {
                        m17511(c11254M28486.length(), c11254M28486.m28492());
                        c11254M28486.close();
                    } catch (Throwable th3) {
                        try {
                            c11254M28486.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c14237.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    c7305.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (IOException e) {
            e = e;
            this.f20647 = true;
            throw e;
        } catch (Error e2) {
            e = e2;
            this.f20647 = true;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            this.f20647 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17512(InputStream inputStream, long j, C18426 c18426, int i) {
        Integer numValueOf = Integer.valueOf(i);
        try {
            C16475 c16475 = new C16475(j, inputStream);
            m17506();
            if (this.f20646 != null) {
                throw new IllegalStateException("Legacy text already supplied");
            }
            try {
                C21697 c21697M39095 = c16475.m39095(this.f20643, new C11398(2, c18426), numValueOf);
                c16475.m39099();
                this.f20646 = c21697M39095;
                ((C15729) inputStream).f51166 = true;
            } catch (C9017 e) {
                this.f20647 = true;
                throw e;
            }
        } catch (Throwable th) {
            try {
                ((C15729) inputStream).f51166 = true;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17514(C21498 c21498, int i, int i2) {
        m17506();
        if (this.f20646 != null) {
            if (this.f20645 || this.f20648) {
                throw new IllegalStateException("Legacy history already supplied or pages joined");
            }
            if (c21498.m48908() > this.f20646.m49259() || c21498.m48906() > this.f20646.m49259()) {
                throw new IllegalArgumentException("Legacy selection exceeds text");
            }
            this.f20641 = new C12219(new C3335(), c21498, ((long) i) & 4294967295L, ((long) i2) & 4294967295L, 16777216L);
            this.f20645 = true;
            return;
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17510(int i, int i2, C19403 c19403) throws Throwable {
        String str;
        int i3;
        C21697 c21697M3281;
        int i4 = i2;
        m17506();
        C21697 c21697 = this.f20646;
        if (c21697 != null) {
            if (this.f20648) {
                throw new IllegalStateException("Legacy pages already joined");
            }
            C12219 c12219 = this.f20641;
            if (i < 1 || i > 1024 || i4 < 0 || i4 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C10046 c10046 = c21697.f69247;
            if (c10046 == null) {
                throw new IllegalArgumentException("Legacy page migration requires a page store");
            }
            C21697 c21697M49247 = C21697.m49247(c10046.f32213, c10046.f32209, c10046);
            int i5 = 0;
            int iM49259 = 0;
            while (i5 < i) {
                if (i5 == i4) {
                    iM49259 = c21697M49247.m49259();
                    c21697M3281 = c21697;
                } else {
                    C17967 c17967M41924 = C17967.m41924(((C0527) c19403.f62703).m2496(i5), c10046.f32208);
                    try {
                        c21697M3281 = C0814.m3281(c17967M41924, c10046, Integer.MAX_VALUE - c21697M49247.m49259(), null);
                        c17967M41924.close();
                    } catch (Throwable th) {
                        try {
                            c17967M41924.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                C21697 c21698 = c21697;
                if (((long) c21697M49247.m49259()) + ((long) c21697M3281.m49259()) > Integer.MAX_VALUE) {
                    throw new IOException("Legacy pages exceed migration coordinate limit");
                }
                c21697M49247 = c21697M49247.m49257(c21697M3281);
                i5++;
                i4 = i2;
                c21697 = c21698;
            }
            C3335 c3335 = new C3335();
            C21498 c21498 = c12219.f39260;
            int iM48908 = c21498.m48908();
            int i6 = -1;
            if (iM48908 == -1) {
                i3 = -1;
                str = "Legacy page coordinate exceeds limit";
            } else {
                str = "Legacy page coordinate exceeds limit";
                if (((long) iM48908) + ((long) iM49259) > 2147483647L) {
                    throw new IOException(str);
                }
                i3 = iM48908 + iM49259;
            }
            int iM48906 = c21498.m48906();
            if (iM48906 != -1) {
                if (((long) iM48906) + ((long) iM49259) > 2147483647L) {
                    throw new IOException(str);
                }
                i6 = iM48906 + iM49259;
            }
            C20951 c20951 = new C20951(c21697M49247, new C12219(c3335, new C21498(i3, i6), c12219.f39258, c12219.f39262, c12219.f39259), iM49259);
            this.f20646 = c20951.m47906();
            this.f20641 = c20951.m47907();
            this.f20648 = true;
            return c20951.m47905();
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17511(long j, InputStream inputStream) throws IOException {
        try {
            m17506();
            if (this.f20650 != null) {
                throw new IllegalStateException("Migration state already supplied");
            }
            this.f20647 = true;
            InterfaceC24329 interfaceC24329 = this.f20652;
            C10046 c10046 = this.f20643;
            this.f20650 = C4762.m14686(interfaceC24329, c10046.f32223, inputStream, j, c10046.f32208, this.f20651);
            inputStream.close();
            this.f20647 = false;
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
    private void m17506() {
        if (!this.f20649 || this.f20647 || this.f20644 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer is outside its converter callback or failed");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m17509(C6035 c6035) {
        C6781 c6781;
        C10046 c10046 = c6035.f20643;
        c6035.m17506();
        C21697 c21697 = c6035.f20646;
        if (c21697 == null) {
            throw new IllegalStateException("Legacy text has not been supplied");
        }
        C25228.m56290(c6035.f20641.f39261, c21697.m49259());
        C6781 c6782 = c6035.f20650;
        if (c6782 == null) {
            c6781 = new C6781(c10046.f32223, 0L, null, c6035.f20642.m31222());
        } else {
            c6781 = new C6781(c10046.f32223, c6782.f22605, c6782.f22606, c6035.f20642.m31222());
        }
        C12547 c12547M31220 = C12547.m31220(c10046.f32208, c6781.m18904());
        c6035.f20642.close();
        c6035.f20642 = c12547M31220;
        c6035.f20649 = false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f20644 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer belongs to its converter thread");
        }
        this.f20649 = false;
        this.f20646 = null;
        this.f20641 = null;
        C12547 c12547 = this.f20642;
        if (c12547 != null) {
            c12547.close();
            this.f20642 = null;
        }
    }
}
