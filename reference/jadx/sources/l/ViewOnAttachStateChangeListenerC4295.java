package l;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۙ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4295 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f15461;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21843 f15462;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3589 f15463;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7296 f15464;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17295 f15465;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f15466;

    public ViewOnAttachStateChangeListenerC4295(C3589 c3589, AbstractActivityC12483 abstractActivityC12483, C22515 c22515, C21843 c21843, BroadcastReceiver broadcastReceiver, InterfaceC7296 interfaceC7296) {
        this.f15463 = c3589;
        this.f15466 = abstractActivityC12483;
        this.f15465 = c22515;
        this.f15462 = c21843;
        this.f15461 = broadcastReceiver;
        this.f15464 = interfaceC7296;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractActivityC12483 abstractActivityC12483 = this.f15466;
        if (abstractActivityC12483 instanceof Main) {
            C3589.f13208 = true;
        }
        InterfaceC17295 interfaceC17295 = this.f15465;
        if (interfaceC17295 != null) {
            abstractActivityC12483.mo4085(interfaceC17295);
            abstractActivityC12483.mo4079(interfaceC17295);
        }
        this.f15462.m48617(this.f15461, new IntentFilter("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        abstractActivityC12483.getLifecycle().mo9171(this.f15464);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        C3589 c3589 = this.f15463;
        if (c3589.f13226 != null) {
            c3589.f13226.dismiss();
            c3589.f13226 = null;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f15466;
        if (abstractActivityC12483 instanceof Main) {
            C3589.f13208 = false;
        }
        InterfaceC17295 interfaceC17295 = this.f15465;
        if (interfaceC17295 != null) {
            abstractActivityC12483.mo4085(interfaceC17295);
        }
        this.f15462.m48616(this.f15461);
        abstractActivityC12483.getLifecycle().mo9172(this.f15464);
        if (c3589.f13225) {
            return;
        }
        if (abstractActivityC12483 instanceof ActivityC6412) {
            ActivityC6412 activityC6412 = (ActivityC6412) abstractActivityC12483;
            if (!abstractActivityC12483.isFinishing()) {
                abstractActivityC12483.finish();
            }
            if (C3589.f13219.m44956() != Boolean.FALSE || activityC6412.m17555()) {
                z = false;
            } else {
                z = true;
            }
        } else if (C3589.f13219.m44956() == Boolean.FALSE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !ApplicationC0716.f2992.getBoolean("mbp", false)) {
            z = true;
        }
        if (z) {
            C15586.m37239();
            if (C3589.f13211 != null) {
                boolean z2 = C3589.f13211.f42563;
                long j = C3589.f13211.f42570;
                C3589.f13211.m31736(true);
                C3589.f13211 = null;
                if (z2) {
                    AbstractActivityC12483 abstractActivityC12484 = c3589.f13224;
                    int i = ServiceC17701.f56205;
                    abstractActivityC12484.startService(new Intent(abstractActivityC12484, (Class<?>) ServiceC17701.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
                }
            }
        }
    }
}
