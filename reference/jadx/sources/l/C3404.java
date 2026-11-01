package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۗᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes3.dex */
public class C3404 extends C11894 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m8301(i);
        m8301(i2);
        if (i <= i2) {
            return new C3404(this, i, i2);
        }
        throw new IllegalArgumentException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
