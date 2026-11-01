package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I96L */
/* JADX INFO: loaded from: classes4.dex */
public final class C19080 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC8497 f61654;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f61656;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f61658;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public VelocityTracker f61659;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f61655 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f61661 = -1;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f61657 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f61660 = {Integer.MAX_VALUE, 0};

    public C19080(Context context, InterfaceC8497 interfaceC8497) {
        this.f61656 = context;
        this.f61654 = interfaceC8497;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43852(MotionEvent motionEvent, int i) {
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i2 = this.f61661;
        int[] iArr = this.f61660;
        if (i2 == source && this.f61657 == deviceId && this.f61655 == i) {
            z = false;
        } else {
            Context context = this.f61656;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i3 = C3619.f13296;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                scaledMinimumFlingVelocity = C12793.m31776(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C13638.requireNonNull(viewConfiguration);
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
                scaledMaximumFlingVelocity = C12793.m31775(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    C13638.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f61661 = source;
            this.f61657 = deviceId;
            this.f61655 = i;
            z = true;
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f61659;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f61659 = null;
                return;
            }
            return;
        }
        if (this.f61659 == null) {
            this.f61659 = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f61659;
        C8226.m21541(velocityTracker2, motionEvent);
        C8226.m21540(velocityTracker2);
        float fM21539 = C8226.m21539(velocityTracker2, i);
        InterfaceC8497 interfaceC8497 = this.f61654;
        float fMo22203 = interfaceC8497.mo22203() * fM21539;
        float fSignum = Math.signum(fMo22203);
        if (z || (fSignum != Math.signum(this.f61658) && fSignum != 0.0f)) {
            interfaceC8497.mo22205();
        }
        if (Math.abs(fMo22203) < iArr[0]) {
            return;
        }
        int i5 = iArr[1];
        float fMax = Math.max(-i5, Math.min(fMo22203, i5));
        this.f61658 = interfaceC8497.mo22204(fMax) ? fMax : 0.0f;
    }
}
