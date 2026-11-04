package l;

import android.os.PowerManager;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6946 implements InterfaceC23507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13657 f22953;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PowerManager.WakeLock f22954;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f22955;

    public C6946(ViewOnClickListenerC13657 viewOnClickListenerC13657, C10745 c10745, PowerManager.WakeLock wakeLock) {
        this.f22953 = viewOnClickListenerC13657;
        this.f22955 = c10745;
        this.f22954 = wakeLock;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19226() {
        return this.f22955.m27399();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 mo19227() {
        return this.f22953.f43376;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo19230(int i) {
        this.f22955.m27403(i);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19224(int i) {
        this.f22955.m27393(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19225(C1878 c1878) {
        ViewOnClickListenerC13657 viewOnClickListenerC13657 = this.f22953;
        viewOnClickListenerC13657.f43377.m51328(c1878, viewOnClickListenerC13657.f43368);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo19229() {
        this.f22955.m27405();
        PowerManager.WakeLock wakeLock = this.f22954;
        if (wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo19228() {
        return new C24253(this.f22953.f43376).m54266();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo19231() {
        C22673.m51159(R.string.MT_Protector);
    }
}
