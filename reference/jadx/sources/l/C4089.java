package l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5B43 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4089 extends AbstractC12292 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C14529 f13930;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f13931;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f13932;

    public C4089(Object obj, AbstractC24227 abstractC24227) {
        super(obj, abstractC24227);
        this.f13930 = null;
        this.f13932 = Float.MAX_VALUE;
        this.f13931 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13165(C14529 c14529) {
        this.f13930 = c14529;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13167() {
        if (this.f13930.f45712 <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f39524) {
            this.f13931 = true;
        }
    }

    @Override // l.AbstractC12292
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo13168(long j) {
        if (this.f13931) {
            float f = this.f13932;
            if (f != Float.MAX_VALUE) {
                this.f13930.m35074(f);
                this.f13932 = Float.MAX_VALUE;
            }
            this.f39522 = this.f13930.m35068();
            this.f39528 = 0.0f;
            this.f13931 = false;
            return true;
        }
        if (this.f13932 != Float.MAX_VALUE) {
            this.f13930.getClass();
            long j2 = j / 2;
            C16021 c16021M35069 = this.f13930.m35069(this.f39522, this.f39528, j2);
            this.f13930.m35074(this.f13932);
            this.f13932 = Float.MAX_VALUE;
            C16021 c16021M350610 = this.f13930.m35069(c16021M35069.f51972, c16021M35069.f51973, j2);
            this.f39522 = c16021M350610.f51972;
            this.f39528 = c16021M350610.f51973;
        } else {
            C16021 c16021M350611 = this.f13930.m35069(this.f39522, this.f39528, j);
            this.f39522 = c16021M350611.f51972;
            this.f39528 = c16021M350611.f51973;
        }
        float fMax = Math.max(this.f39522, this.f39521);
        this.f39522 = fMax;
        float fMin = Math.min(fMax, Float.MAX_VALUE);
        this.f39522 = fMin;
        if (!this.f13930.m35072(fMin, this.f39528)) {
            return false;
        }
        this.f39522 = this.f13930.m35068();
        this.f39528 = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13166(float f) {
        if (this.f39524) {
            this.f13932 = f;
            return;
        }
        if (this.f13930 == null) {
            this.f13930 = new C14529(f);
        }
        this.f13930.m35074(f);
        C14529 c14529 = this.f13930;
        if (c14529 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM35068 = c14529.m35068();
        if (dM35068 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f2 = this.f39521;
        if (dM35068 >= f2) {
            this.f13930.m35070(m30680());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            boolean z = this.f39524;
            if (z || z) {
                return;
            }
            this.f39524 = true;
            if (!this.f39523) {
                this.f39522 = this.f39525.getValue(this.f39520);
            }
            float f3 = this.f39522;
            if (f3 <= Float.MAX_VALUE && f3 >= f2) {
                ThreadLocal threadLocal = C7401.f24380;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C7401());
                }
                C7401 c7401 = (C7401) threadLocal.get();
                ArrayList arrayList = c7401.f24381;
                if (arrayList.size() == 0) {
                    c7401.m20312().mo23783();
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
