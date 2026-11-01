package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46TC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6899 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15346 f23225;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f23226;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15346 f23227;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f23228;

    public C6899() {
        this(new C15346(), new C15346(), 1L, false);
    }

    public C6899(C15346 c15346, C15346 c15347, long j, boolean z) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid next history identity");
        }
        this.f23225 = c15346;
        this.f23227 = c15347;
        this.f23228 = j;
        this.f23226 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18518() {
        return !this.f23225.isEmpty();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23128 m18519() {
        if (m18518()) {
            return (C23128) this.f23225.last();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6899 m18515(C1463 c1463, long j) {
        if (!this.f23226 && m18518()) {
            C15346 c15346 = this.f23225;
            C23128 c23128 = (C23128) c15346.last();
            EnumC9226 enumC9226 = EnumC9226.USER;
            C15346 c15347 = c23128.f75113;
            if (c23128.f75115 == enumC9226) {
                long j2 = c23128.f75117;
                long j3 = j >= j2 ? j - j2 : j2 - j;
                if (j3 >= 0 && j3 < 250 && (c15347.m36740() <= 1 || !((C1463) c15347.last()).m5088())) {
                    C23128 c23129 = (C23128) c15346.last();
                    C15346 c15348 = c23129.f75113;
                    C1463 c1464 = (C1463) c15348.last();
                    long j4 = c1464.f5964;
                    C14744 c14744 = c1464.f5961;
                    long jM35339 = j4 + ((long) c14744.m35339());
                    boolean zM5088 = c1463.m5088();
                    C8872 c8872 = c1463.f5959;
                    C1463 c1465 = (!zM5088 && c1464.f5965 == c1463.f5963 && ((long) c1463.f5964) == jM35339 && ((long) c8872.m23016()) == jM35339 && ((long) c8872.m23014()) == jM35339 && c1463.f5966.m35339() == 0) ? new C1463(c1464.f5964, c1464.f5963, c1463.f5965, c1464.f5959, c1464.f5966, c14744.m35337(c1463.f5961)) : null;
                    return new C6899(c15346.m36741(new C23128(c23129.f75116, j, c23129.f75115, c1465 == null ? c15348.m36738(c1463) : c15348.m36741(c1465))), new C15346(), this.f23228, false);
                }
            }
        }
        return m18514(new C15346().m36738(c1463), j, EnumC9226.USER);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6899 m18516(C15346 c15346, long j) {
        return m18514(c15346, j, EnumC9226.BATCH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6899 m18514(C15346 c15346, long j, EnumC9226 enumC9226) {
        if (c15346.isEmpty()) {
            return this;
        }
        long j2 = this.f23228;
        if (j2 == C17492.FOREVER_NS) {
            throw new IllegalStateException("History identity exhausted");
        }
        return new C6899(this.f23225.m36738(new C23128(j2, j, enumC9226, c15346)), new C15346(), this.f23228 + 1, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6899 m18517(C22401 c22401, long j, boolean z) {
        C23128 c23128;
        long jM18513 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C15346 c15346 = this.f23225;
        C15346 c15347 = this.f23227;
        c22401.m49682(c15346, c15347);
        boolean z2 = z && j > 0;
        if (z2 && c22401.m49681() > j) {
            jM18513 = m18513(c15346) + m18513(c15347);
        }
        C15346 c15346RemoveFirst = c15346;
        C15346 c15346RemoveFirst2 = c15347;
        while (c22401.m49681() > j && (!z2 || (jM18513 != 1 && ((long) c15346RemoveFirst.m36740()) + ((long) c15346RemoveFirst2.m36740()) != 1))) {
            if (!c15346RemoveFirst.isEmpty()) {
                c23128 = (C23128) c15346RemoveFirst.get(0);
                c15346RemoveFirst = c15346RemoveFirst.removeFirst();
            } else if (!c15346RemoveFirst2.isEmpty()) {
                c23128 = (C23128) c15346RemoveFirst2.get(0);
                c15346RemoveFirst2 = c15346RemoveFirst2.removeFirst();
            } else {
                throw new IllegalStateException("Nonempty budget without history roots");
            }
            if (z2) {
                Iterator it = c23128.f75113.iterator();
                while (true) {
                    C4055 c4055 = (C4055) it;
                    if (!c4055.hasNext()) {
                        break;
                    }
                    if (!((C1463) c4055.next()).m5088()) {
                        jM18513--;
                        break;
                    }
                }
            }
            c22401.m49682(c15346RemoveFirst, c15346RemoveFirst2);
        }
        return (c15346RemoveFirst == c15346 && c15346RemoveFirst2 == c15347) ? this : new C6899(c15346RemoveFirst, c15346RemoveFirst2, this.f23228, this.f23226);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m18513(C15346 c15346) {
        Iterator it = c15346.iterator();
        long j = 0;
        while (true) {
            C4055 c4055 = (C4055) it;
            if (!c4055.hasNext()) {
                return j;
            }
            Iterator it2 = ((C23128) c4055.next()).f75113.iterator();
            while (true) {
                C4055 c4056 = (C4055) it2;
                if (!c4056.hasNext()) {
                    break;
                }
                if (!((C1463) c4056.next()).m5088()) {
                    j++;
                    break;
                }
            }
        }
    }
}
