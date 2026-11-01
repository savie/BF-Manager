package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֨֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H4VC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0773 extends AbstractC8536 {
    public C0773(AbstractC7124[] abstractC7124Arr) {
        super(EnumC9947.PHI, abstractC7124Arr);
    }

    @Override // l.AbstractC8536, l.AbstractC7124
    public final AbstractC7124 clone() {
        return new C0773(m22290());
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C0773(m22291(c10527));
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo3326() {
        StringBuilder sb = new StringBuilder("φ(");
        boolean z = true;
        for (AbstractC7124 abstractC7124 : this.f29544) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(abstractC7124);
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
