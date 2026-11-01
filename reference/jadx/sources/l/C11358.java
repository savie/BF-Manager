package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11358 extends AbstractC17581 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C14076 f38308;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3097 f38309;

    public C11358(EnumC9947 enumC9947, AbstractC7124[] abstractC7124Arr, C14076 c14076, C3097 c3097) {
        super(enumC9947, abstractC7124Arr);
        this.f38308 = c14076;
        this.f38309 = c3097;
    }

    @Override // l.AbstractC17581
    /* JADX INFO: renamed from: ۘ */
    public final C14076 mo12099() {
        return this.f38308;
    }

    @Override // l.AbstractC8536, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C11358(this.f23823, m22290(), this.f38308, this.f38309);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C11358(this.f23823, m22291(c10527), this.f38308, this.f38309);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29544[0]);
        sb.append('.');
        sb.append(this.f38309.m9295());
        String[] strArrM34051 = this.f38308.m34051();
        sb.append('(');
        int i = 1;
        boolean z = true;
        int i2 = 0;
        while (i < this.f29544.length) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(C19378.m44398(strArrM34051[i2]));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f29544[i]);
            i++;
            i2++;
        }
        sb.append(')');
        return sb.toString();
    }
}
