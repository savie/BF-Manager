package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I96L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f10722;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f10723;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f10724;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20449 f10725;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10729 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10726 = -1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f10727 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f10728 = {Integer.MAX_VALUE, 0};

    public C3295(Context context, InterfaceC20449 interfaceC20449) {
        this.f10722 = context;
        this.f10725 = interfaceC20449;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10869(MotionEvent motionEvent, int i) {
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i2 = this.f10726;
        int[] iArr = this.f10728;
        if (i2 == source && this.f10727 == deviceId && this.f10729 == i) {
            z = false;
        } else {
            Context context = this.f10722;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i3 = C5512.f19188;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                scaledMinimumFlingVelocity = C12969.m32362(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C17359.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i4 >= 34) {
                scaledMaximumFlingVelocity = C12969.m32361(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C17359.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f10726 = source;
            this.f10727 = deviceId;
            this.f10729 = i;
            z = true;
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f10723;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10723 = null;
                return;
            }
            return;
        }
        if (this.f10723 == null) {
            this.f10723 = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f10723;
        C20253.m46527(velocityTracker2, motionEvent);
        C20253.m46526(velocityTracker2);
        float fM46525 = C20253.m46525(velocityTracker2, i);
        InterfaceC20449 interfaceC20449 = this.f10725;
        float fMo27313 = interfaceC20449.mo27313() * fM46525;
        float fSignum = Math.signum(fMo27313);
        if (z || (fSignum != Math.signum(this.f10724) && fSignum != 0.0f)) {
            interfaceC20449.mo27315();
        }
        if (Math.abs(fMo27313) < iArr[0]) {
            return;
        }
        int i5 = iArr[1];
        float fMax = Math.max(-i5, Math.min(fMo27313, i5));
        this.f10724 = interfaceC20449.mo27314(fMax) ? fMax : 0.0f;
    }
}
