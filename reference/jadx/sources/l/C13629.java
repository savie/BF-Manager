package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13629 {
    public static final C25388 a = new C25388();
    public static final C17533 b = new C17533();
    public static final C5996 c = new C5996();
    public static final C11566 d = new C11566();

    public static InterfaceC7664 spliterator(int[] iArr, int i, int i2, int i3) {
        a(((int[]) C17359.requireNonNull(iArr)).length, i, i2);
        return new C16436(iArr, i, i2, i3);
    }

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public static InterfaceC8409 spliterator(Collection collection, int i) {
        return new C20912((Collection) C17359.requireNonNull(collection), i);
    }

    public static InterfaceC8409 spliterator(Iterator it, long j, int i) {
        return new C20912((Iterator) C17359.requireNonNull(it), j, i);
    }

    public static InterfaceC8409 spliteratorUnknownSize(Iterator it, int i) {
        return new C20912((Iterator) C17359.requireNonNull(it), i);
    }

    public static Iterator iterator(InterfaceC8409 interfaceC8409) {
        C17359.requireNonNull(interfaceC8409);
        return new C12840(interfaceC8409);
    }
}
