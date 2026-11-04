package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 46TC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f10905;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20424 f10906;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f10907;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20424 f10908;

    public C3335() {
        this(new C20424(), new C20424(), 1L, false);
    }

    public C3335(C20424 c20424, C20424 c20425, long j, boolean z) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid next history identity");
        }
        this.f10908 = c20424;
        this.f10906 = c20425;
        this.f10907 = j;
        this.f10905 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10990() {
        return !this.f10908.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20489 m10991() {
        if (m10990()) {
            return (C20489) this.f10908.last();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3335 m10987(C10727 c10727, long j) {
        if (!this.f10905 && m10990()) {
            C20424 c20424 = this.f10908;
            C20489 c20489 = (C20489) c20424.last();
            EnumC22662 enumC22662 = EnumC22662.USER;
            C20424 c20425 = c20489.f65630;
            if (c20489.f65631 == enumC22662) {
                long j2 = c20489.f65632;
                long j3 = j >= j2 ? j - j2 : j2 - j;
                if (j3 >= 0 && j3 < 250 && (c20425.m46836() <= 1 || !((C10727) c20425.last()).m27316())) {
                    C20489 c204810 = (C20489) c20424.last();
                    C20424 c20426 = c204810.f65630;
                    C10727 c10728 = (C10727) c20426.last();
                    long j4 = c10728.f34065;
                    C21697 c21697 = c10728.f34064;
                    long jM49259 = j4 + ((long) c21697.m49259());
                    boolean zM27316 = c10727.m27316();
                    C21498 c21498 = c10727.f34067;
                    C10727 c10729 = (!zM27316 && c10728.f34070 == c10727.f34066 && ((long) c10727.f34065) == jM49259 && ((long) c21498.m48908()) == jM49259 && ((long) c21498.m48906()) == jM49259 && c10727.f34068.m49259() == 0) ? new C10727(c10728.f34065, c10728.f34066, c10727.f34070, c10728.f34067, c10728.f34068, c21697.m49257(c10727.f34064)) : null;
                    return new C3335(c20424.m46837(new C20489(c204810.f65634, j, c204810.f65631, c10729 == null ? c20426.m46834(c10727) : c20426.m46837(c10729))), new C20424(), this.f10907, false);
                }
            }
        }
        return m10986(new C20424().m46834(c10727), j, EnumC22662.USER);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3335 m10988(C20424 c20424, long j) {
        return m10986(c20424, j, EnumC22662.BATCH);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3335 m10986(C20424 c20424, long j, EnumC22662 enumC22662) {
        if (c20424.isEmpty()) {
            return this;
        }
        long j2 = this.f10907;
        if (j2 == C25227.FOREVER_NS) {
            throw new IllegalStateException("History identity exhausted");
        }
        return new C3335(this.f10908.m46834(new C20489(j2, j, enumC22662, c20424)), new C20424(), this.f10907 + 1, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3335 m10989(C24900 c24900, long j, boolean z) {
        C20489 c20489;
        long jM10985 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C20424 c20424 = this.f10908;
        C20424 c20425 = this.f10906;
        c24900.m55482(c20424, c20425);
        boolean z2 = z && j > 0;
        if (z2 && c24900.m55481() > j) {
            jM10985 = m10985(c20424) + m10985(c20425);
        }
        C20424 c20424RemoveFirst = c20424;
        C20424 c20424RemoveFirst2 = c20425;
        while (c24900.m55481() > j && (!z2 || (jM10985 != 1 && ((long) c20424RemoveFirst.m46836()) + ((long) c20424RemoveFirst2.m46836()) != 1))) {
            if (!c20424RemoveFirst.isEmpty()) {
                c20489 = (C20489) c20424RemoveFirst.get(0);
                c20424RemoveFirst = c20424RemoveFirst.removeFirst();
            } else if (!c20424RemoveFirst2.isEmpty()) {
                c20489 = (C20489) c20424RemoveFirst2.get(0);
                c20424RemoveFirst2 = c20424RemoveFirst2.removeFirst();
            } else {
                throw new IllegalStateException("Nonempty budget without history roots");
            }
            if (z2) {
                Iterator it = c20489.f65630.iterator();
                while (true) {
                    C15948 c15948 = (C15948) it;
                    if (!c15948.hasNext()) {
                        break;
                    }
                    if (!((C10727) c15948.next()).m27316()) {
                        jM10985--;
                        break;
                    }
                }
            }
            c24900.m55482(c20424RemoveFirst, c20424RemoveFirst2);
        }
        return (c20424RemoveFirst == c20424 && c20424RemoveFirst2 == c20425) ? this : new C3335(c20424RemoveFirst, c20424RemoveFirst2, this.f10907, this.f10905);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m10985(C20424 c20424) {
        Iterator it = c20424.iterator();
        long j = 0;
        while (true) {
            C15948 c15948 = (C15948) it;
            if (!c15948.hasNext()) {
                return j;
            }
            Iterator it2 = ((C20489) c15948.next()).f65630.iterator();
            while (true) {
                C15948 c15949 = (C15948) it2;
                if (!c15949.hasNext()) {
                    break;
                }
                if (!((C10727) c15949.next()).m27316()) {
                    j++;
                    break;
                }
            }
        }
    }
}
