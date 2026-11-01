package l;

import com.google.android.material.motion.MotionUtils;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ܽۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes5.dex */
public class C16440 extends C5856 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // l.AbstractC10796, l.InterfaceC10609, java.util.List
    public final InterfaceC10609 subList(int i, int i2) {
        m27091(i);
        m27091(i2);
        if (i <= i2) {
            return new C16440(this, i, i2);
        }
        throw new IllegalArgumentException(C8015.m21119("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
