package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.j0.a;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܳۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C60Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C14435 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f47316;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f47317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f47318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f47319;

    public C14435() {
    }

    public C14435(int i, int i2, int i3) {
        m34709(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34709(int i, int i2, int i3) {
        this.f47316 = i;
        this.f47317 = i2;
        this.f47319 = i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m34706() {
        return this.f47318;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34711(boolean z) {
        this.f47318 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34710(C3329 c3329) {
        int i = this.f47316;
        int i2 = this.f47317;
        int i3 = i2 - i;
        boolean z = false;
        if (i3 > 300000) {
            if (i3 > 350000) {
                z = true;
                break;
            }
            int i4 = 0;
            while (i < i2) {
                char cCharAt = c3329.charAt(i);
                if (cCharAt > 127 && ((19968 > cCharAt || cCharAt > 40869) && !C9739.m24695(cCharAt) && (i4 = i4 + 1) > 75000)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f47318 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m34712() {
        return this.f47318 && this.f47317 - this.f47316 > 300000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34708() {
        return m34712() ? this.f47316 + a.a : this.f47317;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m34707(CharSequence charSequence, C6585 c6585) {
        if (!m34712()) {
            return c6585.m17871(charSequence, this.f47316, this.f47317, 0.0f);
        }
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        int i = this.f47316;
        return c6585.f22196.measureText(strM39288) + c6585.m17871(charSequence, i, a.a + i, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(");
        sb.append(this.f47316);
        sb.append(", ");
        sb.append(this.f47317);
        sb.append(", ");
        return C12441.m30911(this.f47319, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    public final C14435 clone() {
        try {
            return (C14435) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
