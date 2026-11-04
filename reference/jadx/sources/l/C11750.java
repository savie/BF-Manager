package l;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۧܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6FC */
/* JADX INFO: loaded from: classes3.dex */
public class C11750 extends AccessibilityService {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37991;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f37992;

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C7207.m19791());
        C17695.m41415().m41432(this);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        this.f37992 = false;
        this.f37991 = true;
        C17695.m41415().m41444(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29499() {
        return this.f37991 && !this.f37992;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29500() {
        return this.f37992;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29498(boolean z) {
        this.f37992 = z;
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C17695.m41415().m41423(this, accessibilityEvent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C17695.m41415().m41422(this);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f37991 = false;
        C17695.m41415().m41441(this);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f37991 = false;
        C17695.m41415().m41446(this);
        super.onDestroy();
    }
}
