package l;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final class C23807 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Object f77114 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0686 f77115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77116;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16347 f77118;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14902 f77119;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f77120;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f77121;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f77122;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f77123;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11369 f77124;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f77125;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f77126;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f77117 = C3669.f12622.incrementAndGet();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f77127 = -1;

    public C23807(AbstractC7629 abstractC7629, List list, int i, boolean z) {
        InterfaceC0686 c1569;
        this.f77123 = abstractC7629;
        this.f77126 = z;
        C11369 c11369 = new C11369(this, list, i);
        this.f77124 = c11369;
        C17839 c17839 = new C17839(this);
        if (Build.VERSION.SDK_INT >= 23) {
            c1569 = new C4552(abstractC7629, c11369, c17839);
        } else {
            C9771 c9771 = new C9771(null, abstractC7629, c11369, EnumC18722.NORMAL, null);
            c9771.m25473(new C22452(c17839));
            c1569 = new C1569(abstractC7629, c9771, c17839);
        }
        this.f77115 = c1569;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53111(C23807 c23807, C16347 c16347, C14902 c14902) {
        InterfaceC0686 interfaceC0686 = c23807.f77115;
        if (c23807.f77118 == c16347 && C3669.f12617 == c23807 && !interfaceC0686.mo2982() && c23807.f77124.mo3301() == c14902) {
            c23807.f77118 = null;
            if (!c23807.f77121 || interfaceC0686.isPlaying() || c23807.m53107()) {
                return;
            }
            interfaceC0686.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m53107() {
        C16347 c16347 = this.f77118;
        return c16347 != null && c16347.m38844() == this.f77124.mo3301();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53110(C23807 c23807, int i, C14902 c14902, C7906 c7906) {
        if (i == c23807.f77116 && C3669.f12617 == c23807 && !c23807.f77115.mo2982() && c23807.f77124.mo3301() == c14902) {
            m53121(c7906.m21445());
            m53120(c7906.m21444());
            long jM21444 = c7906.m21444();
            int i2 = c23807.f77127;
            if (i2 <= 0) {
                i2 = 0;
            } else if (jM21444 > 0 && i2 >= jM21444) {
                c23807.f77127 = 0;
                if (c23807.f77126) {
                    C19331.m44716(c23807.f77123);
                }
                i2 = 0;
            }
            m53118(i2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m53121(C19093 c19093) {
        C3669.f12619.mo40353(c19093.f61810);
        C17930 c17930 = C3669.f12620;
        String str = c19093.f61812;
        c17930.mo40353(str);
        C3669.f12629.mo40353(str);
        C3669.f12623.mo40353(c19093.f61813);
        C3669.f12615.mo40353(c19093.f61808);
        C3669.f12627.mo40353(c19093.f61811);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m53120(long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        C3669.f12616.mo40353(Integer.valueOf((int) (j / 50)));
        C3669.f12628.mo40353(Integer.valueOf(C3669.m11925(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m53116() {
        InterfaceC0686 interfaceC0686 = this.f77115;
        if (interfaceC0686.mo2983()) {
            return;
        }
        this.f77116++;
        if (!this.f77120) {
            Application applicationM49084 = C21576.m49084();
            int i = ServiceC4415.f15847;
            C7508.m20562(applicationM49084, new Intent(applicationM49084, (Class<?>) ServiceC4415.class).putExtra("playbackSessionId", this.f77117));
            this.f77120 = true;
        }
        final C14902 c14902Mo3301 = this.f77124.mo3301();
        C16347 c16347 = this.f77118;
        if (c16347 != null && c16347.m38844() != c14902Mo3301) {
            this.f77118 = null;
        }
        if (!interfaceC0686.mo2981() || this.f77119 != c14902Mo3301) {
            this.f77119 = null;
            Handler handlerM49077 = C21576.m49077();
            Object obj = f77114;
            handlerM49077.removeCallbacksAndMessages(obj);
            C21576.m49077().postAtTime(new Runnable() { // from class: l.֫᩷֫
                @Override // java.lang.Runnable
                public final void run() {
                    C3669.m11957(c14902Mo3301.f48685);
                }
            }, obj, SystemClock.uptimeMillis() + 400);
            interfaceC0686.mo2980(c14902Mo3301);
            return;
        }
        if (m53107()) {
            return;
        }
        interfaceC0686.start();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m53115(C23807 c23807) {
        if (c23807.m53107()) {
            return;
        }
        c23807.f77115.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53125(int i) {
        this.f77122 = false;
        int iM53119 = m53119(i);
        InterfaceC0686 interfaceC0686 = this.f77115;
        boolean zMo2981 = interfaceC0686.mo2981();
        AbstractC7629 abstractC7629 = this.f77123;
        boolean z = this.f77126;
        C11369 c11369 = this.f77124;
        if (!zMo2981) {
            if (interfaceC0686.mo2983() || this.f77127 < 0) {
                return;
            }
            this.f77127 = iM53119;
            m53118(iM53119);
            if (this.f77125 && z) {
                C19331.m44718(abstractC7629, c11369.mo3299(), iM53119);
                return;
            }
            return;
        }
        C14902 c14902Mo3301 = c11369.mo3301();
        C16347 c16347 = new C16347(c14902Mo3301, iM53119);
        this.f77118 = c16347;
        interfaceC0686.mo2979(iM53119, new RunnableC11872(this, c16347, c14902Mo3301));
        m53118(iM53119);
        if (this.f77125) {
            this.f77127 = iM53119;
            if (z) {
                C19331.m44718(abstractC7629, c11369.mo3299(), iM53119);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m53118(int i) {
        int i2 = i / 50;
        C17930 c17930 = C3669.f12624;
        Integer num = (Integer) c17930.m40346();
        C17359.requireNonNull(num);
        if (i2 != num.intValue()) {
            c17930.mo40353(Integer.valueOf(i2));
        }
        int iM11925 = C3669.m11925(i);
        C17930 c17931 = C3669.f12625;
        Integer num2 = (Integer) c17931.m40346();
        C17359.requireNonNull(num2);
        if (iM11925 != num2.intValue()) {
            c17931.mo40353(Integer.valueOf(iM11925));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m53119(int i) {
        int iMax = Math.max(i, 0);
        Integer num = (Integer) C3669.f12616.m40346();
        return (num == null || num.intValue() <= 0) ? iMax : Math.min(iMax, num.intValue() * 50);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53126(boolean z) {
        InterfaceC0686 interfaceC0686 = this.f77115;
        if (interfaceC0686.mo2982()) {
            return;
        }
        C21576.m49077().removeCallbacksAndMessages(f77114);
        this.f77116++;
        this.f77118 = null;
        interfaceC0686.mo2977();
        C3669.m11941(this);
        if (z) {
            C7247.m19877(C21576.m49084()).m19881(new Intent("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m53113() {
        InterfaceC0686 interfaceC0686 = this.f77115;
        return interfaceC0686.isPlaying() || interfaceC0686.mo2983() || m53107();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m53132() {
        this.f77121 = true;
        InterfaceC0686 interfaceC0686 = this.f77115;
        if (interfaceC0686.mo2983() || interfaceC0686.isPlaying()) {
            return;
        }
        m53116();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53124() {
        if (this.f77121 && m53113()) {
            this.f77121 = false;
            this.f77115.pause();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53127() {
        if (this.f77121 && m53113()) {
            m53130();
        } else {
            m53132();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53130() {
        int currentPosition;
        if (this.f77121 && m53113()) {
            this.f77121 = false;
            InterfaceC0686 interfaceC0686 = this.f77115;
            interfaceC0686.pause();
            this.f77125 = true;
            if (m53107()) {
                currentPosition = this.f77118.position();
            } else {
                currentPosition = interfaceC0686.mo2981() ? interfaceC0686.getCurrentPosition() : Math.max(this.f77127, 0);
            }
            this.f77127 = currentPosition;
            if (this.f77126) {
                C19331.m44718(this.f77123, this.f77124.mo3299(), currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53131(int i) {
        C11369 c11369 = this.f77124;
        if (c11369.mo3299() == i || this.f77115.mo2983()) {
            return false;
        }
        this.f77121 = true;
        c11369.m3297(i);
        m53116();
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m53129() {
        if (this.f77115.mo2983()) {
            return;
        }
        this.f77121 = true;
        this.f77124.mo3298();
        m53116();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m53128() {
        if (this.f77115.mo2983()) {
            return;
        }
        this.f77121 = true;
        this.f77124.mo3295();
        m53116();
    }
}
