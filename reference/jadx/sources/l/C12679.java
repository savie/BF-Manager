package l;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.alipay.sdk.m.y.k;

/* JADX INFO: renamed from: l.ۨ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12679 implements InterfaceC2984 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f40605;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Point f40606;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C24132 f40607;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public FutureC23690 f40608;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f40609;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f40610;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f40611;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7941 f40612;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15926 f40613;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f40614;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40615;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View.OnAttachStateChangeListener f40616;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C20884 f40617;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16320 f40619;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Point f40621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle f40622;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Throwable f40623;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23056 f40624;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f40625;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23582 f40626;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Handler f40618 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f40620 = "created";

    @Override // l.InterfaceC2984
    /* JADX INFO: renamed from: ۙ */
    public final String mo3661() {
        StringBuilder sb = new StringBuilder("stage=");
        sb.append(this.f40620);
        sb.append("\nowner=");
        C16320 c16320 = this.f40619;
        sb.append(C8950.m23919(c16320));
        sb.append("\nownerReleaseStage=");
        sb.append(c16320.m38742());
        sb.append("\nfragment=");
        C7941 c7941 = this.f40612;
        sb.append(C8950.m23919(c7941));
        sb.append("\nactivity=");
        sb.append(C8950.m23919(c7941.getActivity()));
        sb.append("\nattempt=");
        sb.append(C8950.m23920(this.f40608));
        sb.append("\nexitingView=");
        sb.append(this.f40614);
        sb.append("\nviewDestroyed=");
        sb.append(this.f40615);
        sb.append("\nreserved=");
        sb.append(this.f40610);
        sb.append("\ndetached=");
        sb.append(this.f40611);
        sb.append("\nexitListener=");
        sb.append(this.f40616 != null);
        sb.append("\nfinalRevision=");
        sb.append(this.f40605);
        sb.append("\nfailedAt=");
        sb.append(this.f40609);
        sb.append("\nfailure=");
        sb.append(Log.getStackTraceString(this.f40623));
        sb.append("\n");
        C24132 c24132 = this.f40607;
        sb.append(C8950.m23918((View) c24132));
        sb.append("\n");
        sb.append(c24132.m53973());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20884 m31475() {
        return this.f40617;
    }

    public C12679(C7941 c7941, C16320 c16320, int i, C23056 c23056, boolean z) {
        this.f40612 = c7941;
        this.f40619 = c16320;
        this.f40625 = i;
        this.f40614 = z;
        C24132 c24132 = c7941.f26387;
        this.f40607 = c24132;
        this.f40626 = c7941.f26385;
        this.f40621 = c24132.m53978(c24132.m53968());
        this.f40606 = new Point(c24132.getScrollX(), c24132.m54026());
        this.f40622 = new Bundle(c7941.f23990);
        this.f40624 = c23056 == null ? null : c23056.m51960();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m31471() {
        FutureC23690 futureC23690 = this.f40608;
        if (futureC23690 != null && !futureC23690.m52954()) {
            return m31470();
        }
        this.f40608 = new FutureC23690();
        this.f40623 = null;
        this.f40609 = null;
        this.f40620 = "stopping_input";
        C16320 c16320 = this.f40619;
        c16320.m38735("session_close", this);
        c16320.m38736(new C2239(this));
        if (this.f40613 == null) {
            this.f40613 = this.f40607.m53894(c16320.f52980);
        }
        c16320.m38745().m52931((InterfaceC2017) new C20050(this));
        return m31470();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC23690 m31461(C12679 c12679) {
        return c12679.f40615 ? c12679.m31471() : c12679.m31470();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31462(C12679 c12679, Throwable th) {
        if (th == null) {
            c12679.m31460();
        } else {
            c12679.m31456(th);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Point m31472() {
        return new Point(this.f40621);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Point m31473() {
        return new Point(this.f40606);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m31470() {
        return this.f40608.m52949((InterfaceC25138) new C2764(0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31474() {
        this.f40615 = true;
        if (this.f40611) {
            this.f40626.m52821();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m31460() {
        C23582 c23582 = this.f40626;
        try {
            boolean z = this.f40611;
            C16320 c16320 = this.f40619;
            if (!z) {
                if (!this.f40610) {
                    this.f40620 = "waiting_capture_ready";
                    if (!this.f40607.m53938(c16320.f52980, this.f40613)) {
                        this.f40618.postDelayed(new RunnableC13337(this, 1), 10L);
                        return;
                    }
                    this.f40610 = true;
                }
                this.f40620 = "capturing_checkpoint";
                C6178 c6178 = new C6178();
                C6178 c6179 = new C6178();
                c23582.m52823(c6178);
                c23582.m52809(c6179);
                this.f40622.putBoolean("changed", this.f40612.m21640(c16320.f52980.isChanged()));
                byte[] bArrM17796 = c6178.m17796();
                byte[] bArrM17797 = c6179.m17796();
                C4631 c4631M14447 = C4631.m14447(this.f40607, this.f40622, this.f40624, bArrM17796, bArrM17797, this.f40625, -1L, null);
                this.f40617 = new C20884(c4631M14447.m14457(), bArrM17796, bArrM17797);
                this.f40620 = "persisting_checkpoint";
                FutureC23690 futureC23690M17384 = c16320.f52985.m17384(c4631M14447);
                C17505 c17505Mo11043 = c16320.f52980.mo11043();
                C17359.requireNonNull(c17505Mo11043);
                futureC23690M17384.m52943((InterfaceC25138) new C25360(c17505Mo11043)).m52931((InterfaceC2017) new C5880(this));
                return;
            }
            this.f40620 = "waiting_owner_close";
            c16320.m38730(this.f40605).m52931((InterfaceC2017) new C17154(this));
        } catch (Throwable th) {
            m31456(th);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31466(C12679 c12679, Long l2, Throwable th) {
        if (th != null) {
            c12679.m31456(th);
        } else if (c12679.f40619.f52980.mo11043().m41105() != l2.longValue()) {
            c12679.f40620 = "recapturing_changed_revision";
            c12679.f40618.post(new RunnableC13337(c12679, 1));
        } else {
            c12679.f40605 = l2.longValue();
            c12679.m31455();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m31455() {
        C16320 c16320 = this.f40619;
        boolean z = this.f40614;
        C24132 c24132 = this.f40607;
        if (z && c24132.isAttachedToWindow()) {
            this.f40620 = "waiting_view_detach";
            if (this.f40616 == null) {
                ViewOnAttachStateChangeListenerC3730 viewOnAttachStateChangeListenerC3730 = new ViewOnAttachStateChangeListenerC3730(this);
                this.f40616 = viewOnAttachStateChangeListenerC3730;
                c24132.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3730);
                return;
            }
            return;
        }
        try {
            this.f40620 = "waiting_release_ready";
            if (c16320.f52980.mo11043().m41105() != this.f40605) {
                m31460();
                return;
            }
            if (!c24132.m54020()) {
                this.f40618.postDelayed(new Runnable() { // from class: l.᩹᩹᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77272.m31455();
                    }
                }, 10L);
                return;
            }
            this.f40620 = "detaching_text";
            c24132.m53926((InterfaceC19106) c16320.f52980);
            this.f40611 = true;
            if (this.f40615) {
                this.f40626.m52821();
            }
            this.f40620 = "waiting_owner_close";
            c16320.m38730(this.f40605).m52931((InterfaceC2017) new C17154(this));
        } catch (Throwable th) {
            m31456(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31459(C12679 c12679, Throwable th) {
        C24132 c24132 = c12679.f40607;
        if (th != null) {
            c12679.m31456(th);
            return;
        }
        c24132.m53992(false);
        c24132.m53919(c12679.f40613);
        c12679.f40612.m21625(c12679);
        c12679.f40620 = "finished";
        c12679.f40608.m52935((Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31456(Throwable th) {
        if ((th instanceof C3552) && th.getCause() != null) {
            th = th.getCause();
        }
        this.f40609 = this.f40620;
        this.f40620 = k.j;
        this.f40623 = th;
        this.f40608.m52937(th);
        this.f40612.m21626(this, th);
    }
}
