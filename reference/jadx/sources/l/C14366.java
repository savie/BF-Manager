package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.j0.a;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C60Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C14366 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f45293;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f45295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45296;

    public C14366() {
    }

    public C14366(int i, int i2, int i3) {
        m34800(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34800(int i, int i2, int i3) {
        this.f45295 = i;
        this.f45294 = i2;
        this.f45296 = i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m34803() {
        return this.f45293;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34802(boolean z) {
        this.f45293 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34801(C15508 c15508) {
        int i = this.f45295;
        int i2 = this.f45294;
        int i3 = i2 - i;
        boolean z = false;
        if (i3 > 300000) {
            if (i3 > 350000) {
                z = true;
                break;
            }
            int i4 = 0;
            while (i < i2) {
                char cCharAt = c15508.charAt(i);
                if (cCharAt > 127 && ((19968 > cCharAt || cCharAt > 40869) && !C9383.m24706(cCharAt) && (i4 = i4 + 1) > 75000)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f45293 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34804() {
        return this.f45293 && this.f45294 - this.f45295 > 300000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34799() {
        return m34804() ? this.f45295 + a.a : this.f45294;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m34798(CharSequence charSequence, C5438 c5438) {
        if (!m34804()) {
            return c5438.m16205(charSequence, this.f45295, this.f45294, 0.0f);
        }
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        int i = this.f45295;
        return c5438.f18967.measureText(strM49088) + c5438.m16205(charSequence, i, a.a + i, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(");
        sb.append(this.f45295);
        sb.append(", ");
        sb.append(this.f45294);
        sb.append(", ");
        return C12669.m31437(this.f45296, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    public final C14366 clone() {
        try {
            return (C14366) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
