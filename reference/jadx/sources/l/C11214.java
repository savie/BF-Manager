package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.PowerManager;

/* JADX INFO: renamed from: l.ۧ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes4.dex */
public final class C11214 extends AbstractC4283 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final PowerManager.WakeLock f37936;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Context f37937;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final PowerManager.WakeLock f37938;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f37939;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f37940;

    public C11214(ContextWrapper contextWrapper, ComponentName componentName) {
        super(componentName);
        this.f37937 = contextWrapper.getApplicationContext();
        PowerManager powerManager = (PowerManager) contextWrapper.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f37938 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f37936 = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // l.AbstractC4283
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f15432);
        if (this.f37937.startService(intent2) != null) {
            synchronized (this) {
                if (!this.f37940) {
                    this.f37940 = true;
                    if (!this.f37939) {
                        this.f37938.acquire(60000L);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC4283
    /* JADX INFO: renamed from: ۨ */
    public final void mo12089() {
        synchronized (this) {
            this.f37940 = false;
        }
    }

    @Override // l.AbstractC4283
    /* JADX INFO: renamed from: ܰ */
    public final void mo12090() {
        synchronized (this) {
            if (!this.f37939) {
                this.f37939 = true;
                this.f37936.acquire(600000L);
                this.f37938.release();
            }
        }
    }

    @Override // l.AbstractC4283
    /* JADX INFO: renamed from: ۙ */
    public final void mo12087() {
        synchronized (this) {
            if (this.f37939) {
                if (this.f37940) {
                    this.f37938.acquire(60000L);
                }
                this.f37939 = false;
                this.f37936.release();
            }
        }
    }
}
