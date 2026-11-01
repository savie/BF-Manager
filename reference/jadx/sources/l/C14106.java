package l;

import android.os.PowerManager;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14106 implements InterfaceC16966 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11989 f46342;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PowerManager.WakeLock f46343;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1777 f46344;

    public C14106(ViewOnClickListenerC11989 viewOnClickListenerC11989, C1777 c1777, PowerManager.WakeLock wakeLock) {
        this.f46342 = viewOnClickListenerC11989;
        this.f46344 = c1777;
        this.f46343 = wakeLock;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo16477() {
        return this.f46344.m5824();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۨ */
    public final ActivityC5677 mo16479() {
        return this.f46342.f40178;
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16481(int i) {
        this.f46344.m5840(i);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16475(int i) {
        this.f46344.m5832(C16737.m39264(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۙ */
    public final void mo16476(C10617 c10617) {
        ViewOnClickListenerC11989 viewOnClickListenerC11989 = this.f46342;
        viewOnClickListenerC11989.f40182.m42654(c10617, viewOnClickListenerC11989.f40169);
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ܰ */
    public final void mo16480() {
        this.f46344.m5825();
        PowerManager.WakeLock wakeLock = this.f46343;
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo16478() {
        return new C11322(this.f46342.f40178).m28381();
    }

    @Override // l.InterfaceC16966
    /* JADX INFO: renamed from: ۖ */
    public final void mo16474() {
        C15829.m37618(R.string.MT_Protector);
    }
}
