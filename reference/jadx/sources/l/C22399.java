package l;

import com.google.android.material.motion.MotionUtils;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩷᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes2.dex */
public class C22399 extends C20161 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // l.AbstractC15685, l.InterfaceC9018, java.util.List
    public final InterfaceC9018 subList(int i, int i2) {
        m37462(i);
        m37462(i2);
        if (i <= i2) {
            return new C22399(this, i, i2);
        }
        throw new IllegalArgumentException(C0703.m3016("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
