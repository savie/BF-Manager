package l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5B43 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15909 extends AbstractC10264 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f51514;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f51515;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20142 f51516;

    public C15909(Object obj, AbstractC20847 abstractC20847) {
        super(obj, abstractC20847);
        this.f51516 = null;
        this.f51514 = Float.MAX_VALUE;
        this.f51515 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37818(C20142 c20142) {
        this.f51516 = c20142;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37820() {
        if (this.f51516.f65398 <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f35005) {
            this.f51515 = true;
        }
    }

    @Override // l.AbstractC10264
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo26054(long j) {
        if (this.f51515) {
            float f = this.f51514;
            if (f != Float.MAX_VALUE) {
                this.f51516.m45504(f);
                this.f51514 = Float.MAX_VALUE;
            }
            this.f35001 = this.f51516.m45498();
            this.f35006 = 0.0f;
            this.f51515 = false;
            return true;
        }
        if (this.f51514 != Float.MAX_VALUE) {
            this.f51516.getClass();
            long j2 = j / 2;
            C18730 c18730M45499 = this.f51516.m45499(this.f35001, this.f35006, j2);
            this.f51516.m45504(this.f51514);
            this.f51514 = Float.MAX_VALUE;
            C18730 c18730M454910 = this.f51516.m45499(c18730M45499.f60749, c18730M45499.f60750, j2);
            this.f35001 = c18730M454910.f60749;
            this.f35006 = c18730M454910.f60750;
        } else {
            C18730 c18730M454911 = this.f51516.m45499(this.f35001, this.f35006, j);
            this.f35001 = c18730M454911.f60749;
            this.f35006 = c18730M454911.f60750;
        }
        float fMax = Math.max(this.f35001, this.f35002);
        this.f35001 = fMax;
        float fMin = Math.min(fMax, Float.MAX_VALUE);
        this.f35001 = fMin;
        if (!this.f51516.m45502(fMin, this.f35006)) {
            return false;
        }
        this.f35001 = this.f51516.m45498();
        this.f35006 = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37819(float f) {
        if (this.f35005) {
            this.f51514 = f;
            return;
        }
        if (this.f51516 == null) {
            this.f51516 = new C20142(f);
        }
        this.f51516.m45504(f);
        C20142 c20142 = this.f51516;
        if (c20142 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM45498 = c20142.m45498();
        if (dM45498 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f2 = this.f35002;
        if (dM45498 >= f2) {
            this.f51516.m45500(m26048());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            boolean z = this.f35005;
            if (z || z) {
                return;
            }
            this.f35005 = true;
            if (!this.f34996) {
                this.f35001 = this.f35000.getValue(this.f35003);
            }
            float f3 = this.f35001;
            if (f3 <= Float.MAX_VALUE && f3 >= f2) {
                ThreadLocal threadLocal = C3269.f12130;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C3269());
                }
                C3269 c3269 = (C3269) threadLocal.get();
                ArrayList arrayList = c3269.f12132;
                if (arrayList.size() == 0) {
                    c3269.m9748().mo24530();
                }
                if (arrayList.contains(this)) {
                    return;
                }
                arrayList.add(this);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
}
