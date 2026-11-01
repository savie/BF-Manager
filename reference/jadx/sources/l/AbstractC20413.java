package l;

import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AIU */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20413 extends AbstractC17902 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66159 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f66160;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66161;

    public AbstractC20413() {
        new AtomicBoolean();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final DialogInterfaceC19356 mo2981(AbstractActivityC12483 abstractActivityC12483) {
        final C20164 c20164 = new C20164(abstractActivityC12483);
        c20164.m45589((Runnable) new RunnableC7981(5, this));
        c20164.m45590(new ViewOnClickListenerC21509(2, c20164));
        m41568().m44959(c20164.m5834(), new InterfaceC10597() { // from class: l.᩷᩷ۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                AbstractC20413.m46153(this.f68780, c20164);
            }
        });
        c20164.m45600();
        return c20164.m5834();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46153(AbstractC20413 abstractC20413, C20164 c20164) {
        if (abstractC20413.m41582()) {
            c20164.m45592(abstractC20413.m41586());
        }
        if (abstractC20413.m41589()) {
            c20164.m45588(abstractC20413.m41576());
        }
        if (abstractC20413.f66161) {
            c20164.m45598();
            c20164.m45591(abstractC20413.m41564());
        } else {
            c20164.m45597();
            c20164.m45591(abstractC20413.f66160);
            c20164.m45599(abstractC20413.m41564());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46156(long j, long j2) {
        m46157(C8516.m22238(j, j2));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m46157(int i) {
        if (this.f66160 != i) {
            this.f66160 = i;
            m41552();
        }
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final void m46154() {
        if (this.f66161) {
            return;
        }
        this.f66161 = true;
        m41552();
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final void m46155() {
        if (this.f66161) {
            this.f66161 = false;
            m41552();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC17379 mo41577() {
        m41591(R.string.MT_Protector);
        m46157(0);
        mo21455(0);
        return new C16180(this);
    }
}
