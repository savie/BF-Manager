package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes.dex */
public final class C22204 extends AbstractC5796 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f71532;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final PowerManager.WakeLock f71533;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f71534;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final PowerManager.WakeLock f71535;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Context f71536;

    public C22204(ContextWrapper contextWrapper, ComponentName componentName) {
        super(componentName);
        this.f71536 = contextWrapper.getApplicationContext();
        PowerManager powerManager = (PowerManager) contextWrapper.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f71535 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f71533 = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // l.AbstractC5796
    /* JADX INFO: renamed from: ۙ */
    public final void mo16912(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f19914);
        if (this.f71536.startService(intent2) != null) {
            synchronized (this) {
                if (!this.f71534) {
                    this.f71534 = true;
                    if (!this.f71532) {
                        this.f71535.acquire(60000L);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC5796
    /* JADX INFO: renamed from: ۤ */
    public final void mo16913() {
        synchronized (this) {
            this.f71534 = false;
        }
    }

    @Override // l.AbstractC5796
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16914() {
        synchronized (this) {
            if (!this.f71532) {
                this.f71532 = true;
                this.f71533.acquire(600000L);
                this.f71535.release();
            }
        }
    }

    @Override // l.AbstractC5796
    /* JADX INFO: renamed from: ۙ */
    public final void mo16910() {
        synchronized (this) {
            if (this.f71532) {
                if (this.f71534) {
                    this.f71535.acquire(60000L);
                }
                this.f71532 = false;
                this.f71533.release();
            }
        }
    }
}
