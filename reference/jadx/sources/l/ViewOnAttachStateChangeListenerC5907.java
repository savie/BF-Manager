package l;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۚ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC5907 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12314 f20216;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7247 f20217;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3669 f20218;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f20219;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0818 f20220;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f20221;

    public ViewOnAttachStateChangeListenerC5907(C3669 c3669, AbstractActivityC17204 abstractActivityC17204, C16590 c16590, C7247 c7247, BroadcastReceiver broadcastReceiver, InterfaceC12314 interfaceC12314) {
        this.f20218 = c3669;
        this.f20221 = abstractActivityC17204;
        this.f20220 = c16590;
        this.f20217 = c7247;
        this.f20219 = broadcastReceiver;
        this.f20216 = interfaceC12314;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractActivityC17204 abstractActivityC17204 = this.f20221;
        if (abstractActivityC17204 instanceof Main) {
            C3669.f12618 = true;
        }
        InterfaceC0818 interfaceC0818 = this.f20220;
        if (interfaceC0818 != null) {
            abstractActivityC17204.mo16529(interfaceC0818);
            abstractActivityC17204.mo16526(interfaceC0818);
        }
        this.f20217.m19880(this.f20219, new IntentFilter("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        abstractActivityC17204.getLifecycle().mo23077(this.f20216);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        C3669 c3669 = this.f20218;
        if (c3669.f12634 != null) {
            c3669.f12634.dismiss();
            c3669.f12634 = null;
        }
        if (c3669.f12635 != null) {
            c3669.f12635.dismiss();
            c3669.f12635 = null;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f20221;
        if (abstractActivityC17204 instanceof Main) {
            C3669.f12618 = false;
        }
        InterfaceC0818 interfaceC0818 = this.f20220;
        if (interfaceC0818 != null) {
            abstractActivityC17204.mo16529(interfaceC0818);
        }
        this.f20217.m19879(this.f20219);
        abstractActivityC17204.getLifecycle().mo23078(this.f20216);
        if (c3669.f12632) {
            return;
        }
        if (abstractActivityC17204 instanceof ActivityC20823) {
            ActivityC20823 activityC20823 = (ActivityC20823) abstractActivityC17204;
            if (!abstractActivityC17204.isFinishing()) {
                abstractActivityC17204.finish();
            }
            if (C3669.f12621.m40346() != Boolean.FALSE || activityC20823.m47631()) {
                z = false;
            } else {
                z = true;
            }
        } else if (C3669.f12621.m40346() == Boolean.FALSE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !ApplicationC17729.f58258.getBoolean("mbp", false)) {
            z = true;
        }
        if (z) {
            C1432.m5166();
            if (C3669.f12617 != null) {
                boolean z2 = C3669.f12617.f77120;
                long j = C3669.f12617.f77117;
                C3669.f12617.m53126(true);
                C3669.f12617 = null;
                if (z2) {
                    AbstractActivityC17204 abstractActivityC17205 = c3669.f12630;
                    int i = ServiceC4415.f15847;
                    abstractActivityC17205.startService(new Intent(abstractActivityC17205, (Class<?>) ServiceC4415.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
                }
            }
        }
    }
}
