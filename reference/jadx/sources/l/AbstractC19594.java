package l;

import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩴۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AIU */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19594 extends AbstractC18900 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63171 = 0;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f63172;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f63173;

    public AbstractC19594() {
        new AtomicBoolean();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final DialogInterfaceC8327 mo4862(AbstractActivityC17204 abstractActivityC17204) {
        final C10043 c10043 = new C10043(abstractActivityC17204);
        c10043.m25917((Runnable) new RunnableC9168(2, this));
        c10043.m25918(new ViewOnClickListenerC6407(3, c10043));
        m43851().m40350(c10043.m27401(), new InterfaceC16438() { // from class: l.ۤۙ᩻
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                AbstractC19594.m45190(this.f33747, c10043);
            }
        });
        c10043.m25932();
        return c10043.m27401();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45190(AbstractC19594 abstractC19594, C10043 c10043) {
        if (abstractC19594.m43852()) {
            c10043.m25926(abstractC19594.m43866());
        }
        if (abstractC19594.m43832()) {
            c10043.m25929(abstractC19594.m43839());
        }
        if (abstractC19594.f63173) {
            c10043.m25924();
            c10043.m25925(abstractC19594.m43849());
        } else {
            c10043.m25930();
            c10043.m25925(abstractC19594.f63172);
            c10043.m25921(abstractC19594.m43849());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m45193(long j, long j2) {
        m45194(C3374.m11075(j, j2));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m45194(int i) {
        if (this.f63172 != i) {
            this.f63172 = i;
            m43856();
        }
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final void m45192() {
        if (this.f63173) {
            return;
        }
        this.f63173 = true;
        m43856();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final void m45191() {
        if (this.f63173) {
            this.f63173 = false;
            m43856();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8161 mo43864() {
        m43868(R.string.MT_Protector);
        m45194(0);
        mo16839(0);
        return new C22578(this);
    }
}
