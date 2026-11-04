package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes.dex */
public final class C25228 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f81483;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17000 f81484;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10046 f81485;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56290(C3335 c3335, int i) {
        C2107.m7282(c3335.f10908, i, false, (Runnable) new RunnableC10858(1));
        C2107.m7282(c3335.f10906, i, true, (Runnable) new RunnableC10858(1));
    }

    public C25228(C10046 c10046, C17000 c17000, Runnable runnable) {
        this.f81485 = c10046;
        this.f81484 = c17000;
        this.f81483 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m56293(C12219 c12219) throws IOException {
        long jM25974;
        long jM56287 = m56287(c12219.f39261.f10908.f65428, true);
        long jM56288 = m56287(c12219.f39261.f10906.f65428, true);
        synchronized (this.f81485.f32208.f1856) {
            C6178 c6178 = new C6178(72);
            c6178.writeInt(1);
            c6178.writeInt(1);
            c6178.m17803(jM56287);
            c6178.m17803(jM56288);
            c6178.m17803(c12219.f39261.f10907);
            c6178.m17803(c12219.f39258);
            c6178.m17803(c12219.f39262);
            c6178.m17803(c12219.f39259);
            c6178.writeInt(c12219.f39260.m48908());
            c6178.writeInt(c12219.f39260.m48906());
            c6178.writeInt(c12219.f39261.f10905 ? 1 : 0);
            c6178.writeInt(0);
            C10046 c10046 = this.f81485;
            jM25974 = c10046.m25974(c10046.m25973(), c6178.m17808(), 5, c6178.size());
        }
        return jM25974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m56287(C23408 c23408, boolean z) throws IOException {
        long jM25974;
        long jM25975;
        this.f81483.run();
        if (c23408 == null) {
            return 0L;
        }
        long j = c23408.f75776;
        m56289(j, c23408.f75774);
        if (j >= 0) {
            return j;
        }
        Object obj = c23408.f75775;
        if (obj != null) {
            long jM56286 = z ? m56286((C20489) obj) : m56285((C10727) obj);
            synchronized (this.f81485.f32208.f1856) {
                C6178 c6178 = new C6178(12);
                c6178.writeInt(z ? 2 : 4);
                c6178.m17803(jM56286);
                C10046 c10046 = this.f81485;
                jM25975 = c10046.m25974(c10046.m25973(), c6178.m17808(), 5, c6178.size());
                c23408.f75774 = this.f81485;
                c23408.f75776 = jM25975;
            }
            return jM25975;
        }
        long jM56287 = m56287(c23408.f75771, z);
        long jM56288 = m56287(c23408.f75773, z);
        synchronized (this.f81485.f32208.f1856) {
            C6178 c6179 = new C6178(28);
            c6179.writeInt(z ? 3 : 5);
            c6179.writeInt(c23408.f75770);
            c6179.writeInt(c23408.f75772);
            c6179.m17803(jM56287);
            c6179.m17803(jM56288);
            C10046 c10047 = this.f81485;
            jM25974 = c10047.m25974(c10047.m25973(), c6179.m17808(), 5, c6179.size());
            c23408.f75774 = this.f81485;
            c23408.f75776 = jM25974;
        }
        return jM25974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m56286(C20489 c20489) throws IOException {
        long jM25974;
        long j = c20489.f65635;
        m56289(j, c20489.f65633);
        if (j >= 0) {
            return j;
        }
        int i = 0;
        long jM56287 = m56287(c20489.f65630.f65428, false);
        synchronized (this.f81485.f32208.f1856) {
            C6178 c6178 = new C6178(36);
            c6178.writeInt(6);
            c6178.m17803(c20489.f65634);
            c6178.m17803(c20489.f65632);
            if (c20489.f65631 != EnumC22662.USER) {
                i = 1;
            }
            c6178.writeInt(i);
            c6178.m17803(jM56287);
            c6178.writeInt(c20489.f65630.m46836());
            C10046 c10046 = this.f81485;
            jM25974 = c10046.m25974(c10046.m25973(), c6178.m17808(), 5, c6178.size());
            c20489.f65633 = this.f81485;
            c20489.f65635 = jM25974;
        }
        return jM25974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m56285(C10727 c10727) throws IOException {
        long jM25974;
        long j = c10727.f34071;
        m56289(j, c10727.f34069);
        if (j >= 0) {
            return j;
        }
        C21697 c21697 = c10727.f34068;
        C10046 c10046 = c21697.f69247;
        C10046 c10047 = this.f81485;
        if (c10046 != c10047 || c10727.f34064.f69247 != c10047) {
            throw new IOException("History belongs to another store");
        }
        long jM40060 = this.f81484.m40060(c21697);
        long jM40061 = this.f81484.m40060(c10727.f34064);
        synchronized (this.f81485.f32208.f1856) {
            C6178 c6178 = new C6178(72);
            c6178.writeInt(7);
            c6178.writeInt(c10727.f34065);
            c6178.m17803(c10727.f34066);
            c6178.m17803(c10727.f34070);
            c6178.writeInt(c10727.f34067.m48908());
            c6178.writeInt(c10727.f34067.m48906());
            C21697 c21698 = c10727.f34068;
            c6178.m17803(jM40060);
            c6178.writeInt(c21698.m49259());
            c6178.writeInt(c21698.m49258());
            c6178.writeInt(c21698.m49252());
            C21697 c21699 = c10727.f34064;
            c6178.m17803(jM40061);
            c6178.writeInt(c21699.m49259());
            c6178.writeInt(c21699.m49258());
            c6178.writeInt(c21699.m49252());
            C10046 c10048 = this.f81485;
            jM25974 = c10048.m25974(c10048.m25973(), c6178.m17808(), 5, c6178.size());
            c10727.f34069 = this.f81485;
            c10727.f34071 = jM25974;
        }
        return jM25974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m56289(long j, C10046 c10046) throws IOException {
        if (j >= 0 && c10046 != this.f81485) {
            throw new IOException("History offset belongs to another store");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12219 m56294(long j, long j2, int i, C25206 c25206) throws C19481 {
        Runnable runnable = this.f81483;
        C2107 c2107 = new C2107(this, c25206);
        c25206.m56187();
        C13293 c13293M7289 = c2107.m7289(j, j2);
        try {
            C20348 c20348 = c13293M7289.f42446;
            if (c13293M7289.f42447 != 72 || c20348.readInt() != 1 || c20348.readInt() != 1) {
                throw new IOException("Invalid history state shape");
            }
            long j3 = c20348.readLong();
            long j4 = c20348.readLong();
            long j5 = c20348.readLong();
            long j6 = c20348.readLong();
            long j7 = c20348.readLong();
            long j8 = c20348.readLong();
            C21498 c21498M7285 = c2107.m7285(c20348);
            int i2 = c20348.readInt();
            if (j5 <= 0 || j6 < 0 || j7 < j6 || j8 < 0 || i2 < 0 || i2 > 1 || c21498M7285.m48908() > i || c21498M7285.m48906() > i || c20348.readInt() != 0 || c20348.available() != 0) {
                throw new IOException("Invalid history state metadata");
            }
            C20424 c20424 = new C20424(c2107.m7286(0, j3, j, true));
            C20424 c20425 = new C20424(c2107.m7286(0, j4, j, true));
            c2107.m7287(c20424, c20425, j5, j7);
            C2107.m7282(c20424, i, false, runnable);
            C2107.m7282(c20425, i, true, runnable);
            C12219 c12219 = new C12219(new C3335(c20424, c20425, j5, i2 == 1), c21498M7285, j6, j7, j8);
            c13293M7289.close();
            return c12219;
        } catch (Throwable th) {
            try {
                c13293M7289.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
