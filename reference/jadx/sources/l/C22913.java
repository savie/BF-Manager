package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩺ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes2.dex */
public class C22913 extends C17973 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m21307(i);
        m21307(i2);
        if (i <= i2) {
            return new C22913(this, i, i2);
        }
        throw new IllegalArgumentException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
