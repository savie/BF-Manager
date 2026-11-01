package l;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: l.۬֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12763 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f42562 = new Object();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f42563;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f42564;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8530 f42565;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42566;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2758 f42567;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C13689 f42568;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0767 f42569;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42571;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f42572;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f42573;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f42574;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f42570 = C3589.f13221.incrementAndGet();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f42575 = -1;

    public C12763(AbstractC9677 abstractC9677, List list, int i, boolean z) {
        InterfaceC8530 c7677;
        this.f42573 = abstractC9677;
        this.f42564 = z;
        C2758 c2758 = new C2758(this, list, i);
        this.f42567 = c2758;
        C21935 c21935 = new C21935(this);
        if (Build.VERSION.SDK_INT >= 23) {
            c7677 = new C15439(abstractC9677, c2758, c21935);
        } else {
            C11601 c11601 = new C11601(null, abstractC9677, c2758, EnumC13718.NORMAL, null);
            c11601.m28926(new C18966(c21935));
            c7677 = new C7677(abstractC9677, c11601, c21935);
        }
        this.f42565 = c7677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31721(C12763 c12763, C0767 c0767, C13689 c13689) {
        InterfaceC8530 interfaceC8530 = c12763.f42565;
        if (c12763.f42569 == c0767 && C3589.f13211 == c12763 && !interfaceC8530.mo20296() && c12763.f42567.mo7413() == c13689) {
            c12763.f42569 = null;
            if (!c12763.f42574 || interfaceC8530.isPlaying() || c12763.m31718()) {
                return;
            }
            interfaceC8530.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean m31718() {
        C0767 c0767 = this.f42569;
        return c0767 != null && c0767.m3297() == this.f42567.mo7413();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31720(C12763 c12763, int i, C13689 c13689, C7573 c7573) {
        if (i == c12763.f42566 && C3589.f13211 == c12763 && !c12763.f42565.mo20296() && c12763.f42567.mo7413() == c13689) {
            m31731(c7573.m20099());
            m31729(c7573.m20098());
            long jM20098 = c7573.m20098();
            int i2 = c12763.f42575;
            if (i2 <= 0) {
                i2 = 0;
            } else if (jM20098 > 0 && i2 >= jM20098) {
                c12763.f42575 = 0;
                if (c12763.f42564) {
                    C7118.m19005(c12763.f42573);
                }
                i2 = 0;
            }
            m31732(i2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31731(C20979 c20979) {
        C3589.f13213.mo23642(c20979.f68325);
        C9186 c9186 = C3589.f13209;
        String str = c20979.f68324;
        c9186.mo23642(str);
        C3589.f13210.mo23642(str);
        C3589.f13220.mo23642(c20979.f68320);
        C3589.f13215.mo23642(c20979.f68321);
        C3589.f13217.mo23642(c20979.f68322);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31729(long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        C3589.f13218.mo23642(Integer.valueOf((int) (j / 50)));
        C3589.f13214.mo23642(Integer.valueOf(C3589.m10635(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m31725() {
        InterfaceC8530 interfaceC8530 = this.f42565;
        if (interfaceC8530.mo20302()) {
            return;
        }
        this.f42566++;
        if (!this.f42563) {
            Application applicationM39277 = C16737.m39277();
            int i = ServiceC17701.f56205;
            C10405.m26303(applicationM39277, new Intent(applicationM39277, (Class<?>) ServiceC17701.class).putExtra("playbackSessionId", this.f42570));
            this.f42563 = true;
        }
        C13689 c13689Mo7413 = this.f42567.mo7413();
        C0767 c0767 = this.f42569;
        if (c0767 != null && c0767.m3297() != c13689Mo7413) {
            this.f42569 = null;
        }
        if (!interfaceC8530.mo20303() || this.f42568 != c13689Mo7413) {
            this.f42568 = null;
            Handler handlerM39278 = C16737.m39278();
            Object obj = f42562;
            handlerM39278.removeCallbacksAndMessages(obj);
            C16737.m39278().postAtTime(new RunnableC13469(0, c13689Mo7413), obj, SystemClock.uptimeMillis() + 400);
            interfaceC8530.mo20301(c13689Mo7413);
            return;
        }
        if (m31718()) {
            return;
        }
        interfaceC8530.start();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m31727(C12763 c12763) {
        if (c12763.m31718()) {
            return;
        }
        c12763.f42565.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31735(int i) {
        this.f42572 = false;
        int iM31724 = m31724(i);
        InterfaceC8530 interfaceC8530 = this.f42565;
        boolean zMo20303 = interfaceC8530.mo20303();
        AbstractC9677 abstractC9677 = this.f42573;
        boolean z = this.f42564;
        C2758 c2758 = this.f42567;
        if (!zMo20303) {
            if (interfaceC8530.mo20302() || this.f42575 < 0) {
                return;
            }
            this.f42575 = iM31724;
            m31732(iM31724);
            if (this.f42571 && z) {
                C7118.m19007(abstractC9677, c2758.mo7403(), iM31724);
                return;
            }
            return;
        }
        C13689 c13689Mo7413 = c2758.mo7413();
        C0767 c0767 = new C0767(c13689Mo7413, iM31724);
        this.f42569 = c0767;
        interfaceC8530.mo20300(iM31724, new RunnableC11352(this, c0767, c13689Mo7413));
        m31732(iM31724);
        if (this.f42571) {
            this.f42575 = iM31724;
            if (z) {
                C7118.m19007(abstractC9677, c2758.mo7403(), iM31724);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m31732(int i) {
        int i2 = i / 50;
        C9186 c9186 = C3589.f13222;
        Integer num = (Integer) c9186.m44956();
        C13638.requireNonNull(num);
        if (i2 != num.intValue()) {
            c9186.mo23642(Integer.valueOf(i2));
        }
        int iM10635 = C3589.m10635(i);
        C9186 c9187 = C3589.f13216;
        Integer num2 = (Integer) c9187.m44956();
        C13638.requireNonNull(num2);
        if (iM10635 != num2.intValue()) {
            c9187.mo23642(Integer.valueOf(iM10635));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m31724(int i) {
        int iMax = Math.max(i, 0);
        Integer num = (Integer) C3589.f13218.m44956();
        return (num == null || num.intValue() <= 0) ? iMax : Math.min(iMax, num.intValue() * 50);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31736(boolean z) {
        InterfaceC8530 interfaceC8530 = this.f42565;
        if (interfaceC8530.mo20296()) {
            return;
        }
        C16737.m39278().removeCallbacksAndMessages(f42562);
        this.f42566++;
        this.f42569 = null;
        interfaceC8530.mo20298();
        C3589.m10648(this);
        if (z) {
            C21843.m48614(C16737.m39277()).m48618(new Intent("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m31728() {
        InterfaceC8530 interfaceC8530 = this.f42565;
        return interfaceC8530.isPlaying() || interfaceC8530.mo20302() || m31718();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31733() {
        this.f42574 = true;
        InterfaceC8530 interfaceC8530 = this.f42565;
        if (interfaceC8530.mo20302() || interfaceC8530.isPlaying()) {
            return;
        }
        m31725();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31734() {
        if (this.f42574 && m31728()) {
            this.f42574 = false;
            this.f42565.pause();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31738() {
        if (this.f42574 && m31728()) {
            m31739();
        } else {
            m31733();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31739() {
        int currentPosition;
        if (this.f42574 && m31728()) {
            this.f42574 = false;
            InterfaceC8530 interfaceC8530 = this.f42565;
            interfaceC8530.pause();
            this.f42571 = true;
            if (m31718()) {
                currentPosition = this.f42569.position();
            } else {
                currentPosition = interfaceC8530.mo20303() ? interfaceC8530.getCurrentPosition() : Math.max(this.f42575, 0);
            }
            this.f42575 = currentPosition;
            if (this.f42564) {
                C7118.m19007(this.f42573, this.f42567.mo7403(), currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m31740(int i) {
        C2758 c2758 = this.f42567;
        if (c2758.mo7403() == i || this.f42565.mo20302()) {
            return false;
        }
        this.f42574 = true;
        c2758.m7407(i);
        m31725();
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31737() {
        if (this.f42565.mo20302()) {
            return;
        }
        this.f42574 = true;
        this.f42567.mo7411();
        m31725();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m31741() {
        if (this.f42565.mo20302()) {
            return;
        }
        this.f42574 = true;
        this.f42567.mo7405();
        m31725();
    }
}
