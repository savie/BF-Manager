package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19988 {
    public static final C3571 a = new C3571();
    public static final C14157 b = new C14157();
    public static final C14862 c = new C14862();
    public static final C9550 d = new C9550();

    public static InterfaceC18576 spliterator(int[] iArr, int i, int i2, int i3) {
        a(((int[]) C13638.requireNonNull(iArr)).length, i, i2);
        return new C11769(iArr, i, i2, i3);
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

    public static InterfaceC20693 spliterator(Collection collection, int i) {
        return new C22352((Collection) C13638.requireNonNull(collection), i);
    }

    public static C22352 b(Iterator it, int i) {
        return new C22352((Iterator) C13638.requireNonNull(it), i);
    }

    public static Iterator iterator(InterfaceC20693 interfaceC20693) {
        C13638.requireNonNull(interfaceC20693);
        return new C6345(interfaceC20693);
    }
}
