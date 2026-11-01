package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes.dex */
public final class C22277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f72805;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22505 f72806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16072 f72807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49447(C6899 c6899, int i) {
        C2520.m7869(c6899.f23225, i, false, (Runnable) new RunnableC19683());
        C2520.m7869(c6899.f23227, i, true, (Runnable) new RunnableC19683());
    }

    public C22277(C16072 c16072, C22505 c22505, Runnable runnable) {
        this.f72807 = c16072;
        this.f72806 = c22505;
        this.f72805 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49450(C21695 c21695) throws IOException {
        long jM38099;
        long jM49443 = m49443(c21695.f70379.f23225.f49958, true);
        long jM49444 = m49443(c21695.f70379.f23227.f49958, true);
        synchronized (this.f72807.f51982.f35622) {
            C11018 c11018 = new C11018(72);
            c11018.writeInt(1);
            c11018.writeInt(1);
            c11018.m27791(jM49443);
            c11018.m27791(jM49444);
            c11018.m27791(c21695.f70379.f23228);
            c11018.m27791(c21695.f70376);
            c11018.m27791(c21695.f70375);
            c11018.m27791(c21695.f70378);
            c11018.writeInt(c21695.f70377.m23016());
            c11018.writeInt(c21695.f70377.m23014());
            c11018.writeInt(c21695.f70379.f23226 ? 1 : 0);
            c11018.writeInt(0);
            C16072 c16072 = this.f72807;
            jM38099 = c16072.m38099(c16072.m38090(), c11018.m27788(), 5, c11018.size());
        }
        return jM38099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m49443(C6878 c6878, boolean z) throws IOException {
        long jM38099;
        long jM380910;
        this.f72805.run();
        if (c6878 == null) {
            return 0L;
        }
        long j = c6878.f23170;
        m49446(j, c6878.f23172);
        if (j >= 0) {
            return j;
        }
        Object obj = c6878.f23174;
        if (obj != null) {
            long jM49444 = z ? m49444((C23128) obj) : m49442((C1463) obj);
            synchronized (this.f72807.f51982.f35622) {
                C11018 c11018 = new C11018(12);
                c11018.writeInt(z ? 2 : 4);
                c11018.m27791(jM49444);
                C16072 c16072 = this.f72807;
                jM380910 = c16072.m38099(c16072.m38090(), c11018.m27788(), 5, c11018.size());
                c6878.f23172 = this.f72807;
                c6878.f23170 = jM380910;
            }
            return jM380910;
        }
        long jM49443 = m49443(c6878.f23173, z);
        long jM49445 = m49443(c6878.f23175, z);
        synchronized (this.f72807.f51982.f35622) {
            C11018 c11019 = new C11018(28);
            c11019.writeInt(z ? 3 : 5);
            c11019.writeInt(c6878.f23171);
            c11019.writeInt(c6878.f23169);
            c11019.m27791(jM49443);
            c11019.m27791(jM49445);
            C16072 c16073 = this.f72807;
            jM38099 = c16073.m38099(c16073.m38090(), c11019.m27788(), 5, c11019.size());
            c6878.f23172 = this.f72807;
            c6878.f23170 = jM38099;
        }
        return jM38099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m49444(C23128 c23128) throws IOException {
        long jM38099;
        long j = c23128.f75112;
        m49446(j, c23128.f75114);
        if (j >= 0) {
            return j;
        }
        int i = 0;
        long jM49443 = m49443(c23128.f75113.f49958, false);
        synchronized (this.f72807.f51982.f35622) {
            C11018 c11018 = new C11018(36);
            c11018.writeInt(6);
            c11018.m27791(c23128.f75116);
            c11018.m27791(c23128.f75117);
            if (c23128.f75115 != EnumC9226.USER) {
                i = 1;
            }
            c11018.writeInt(i);
            c11018.m27791(jM49443);
            c11018.writeInt(c23128.f75113.m36740());
            C16072 c16072 = this.f72807;
            jM38099 = c16072.m38099(c16072.m38090(), c11018.m27788(), 5, c11018.size());
            c23128.f75114 = this.f72807;
            c23128.f75112 = jM38099;
        }
        return jM38099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m49442(C1463 c1463) throws IOException {
        long jM38099;
        long j = c1463.f5960;
        m49446(j, c1463.f5962);
        if (j >= 0) {
            return j;
        }
        C14744 c14744 = c1463.f5966;
        C16072 c16072 = c14744.f48220;
        C16072 c16073 = this.f72807;
        if (c16072 != c16073 || c1463.f5961.f48220 != c16073) {
            throw new IOException("History belongs to another store");
        }
        long jM50029 = this.f72806.m50029(c14744);
        long jM500210 = this.f72806.m50029(c1463.f5961);
        synchronized (this.f72807.f51982.f35622) {
            C11018 c11018 = new C11018(72);
            c11018.writeInt(7);
            c11018.writeInt(c1463.f5964);
            c11018.m27791(c1463.f5963);
            c11018.m27791(c1463.f5965);
            c11018.writeInt(c1463.f5959.m23016());
            c11018.writeInt(c1463.f5959.m23014());
            C14744 c14745 = c1463.f5966;
            c11018.m27791(jM50029);
            c11018.writeInt(c14745.m35339());
            c11018.writeInt(c14745.m35338());
            c11018.writeInt(c14745.m35332());
            C14744 c14746 = c1463.f5961;
            c11018.m27791(jM500210);
            c11018.writeInt(c14746.m35339());
            c11018.writeInt(c14746.m35338());
            c11018.writeInt(c14746.m35332());
            C16072 c16074 = this.f72807;
            jM38099 = c16074.m38099(c16074.m38090(), c11018.m27788(), 5, c11018.size());
            c1463.f5962 = this.f72807;
            c1463.f5960 = jM38099;
        }
        return jM38099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49446(long j, C16072 c16072) throws IOException {
        if (j >= 0 && c16072 != this.f72807) {
            throw new IOException("History offset belongs to another store");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21695 m49451(long j, long j2, int i, C5571 c5571) throws C9722 {
        Runnable runnable = this.f72805;
        C2520 c2520 = new C2520(this, c5571);
        c5571.m15387();
        C13811 c13811M7876 = c2520.m7876(j, j2);
        try {
            C17367 c17367 = c13811M7876.f45591;
            if (c13811M7876.f45590 != 72 || c17367.readInt() != 1 || c17367.readInt() != 1) {
                throw new IOException("Invalid history state shape");
            }
            long j3 = c17367.readLong();
            long j4 = c17367.readLong();
            long j5 = c17367.readLong();
            long j6 = c17367.readLong();
            long j7 = c17367.readLong();
            long j8 = c17367.readLong();
            C8872 c8872M7873 = c2520.m7873(c17367);
            int i2 = c17367.readInt();
            if (j5 <= 0 || j6 < 0 || j7 < j6 || j8 < 0 || i2 < 0 || i2 > 1 || c8872M7873.m23016() > i || c8872M7873.m23014() > i || c17367.readInt() != 0 || c17367.available() != 0) {
                throw new IOException("Invalid history state metadata");
            }
            C15346 c15346 = new C15346(c2520.m7872(0, j3, j, true));
            C15346 c15347 = new C15346(c2520.m7872(0, j4, j, true));
            c2520.m7874(c15346, c15347, j5, j7);
            C2520.m7869(c15346, i, false, runnable);
            C2520.m7869(c15347, i, true, runnable);
            C21695 c21695 = new C21695(new C6899(c15346, c15347, j5, i2 == 1), c8872M7873, j6, j7, j8);
            c13811M7876.close();
            return c21695;
        } catch (Throwable th) {
            try {
                c13811M7876.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
