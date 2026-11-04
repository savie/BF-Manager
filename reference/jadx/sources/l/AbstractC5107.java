package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;

/* JADX INFO: renamed from: l.ۙᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5107 {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo15452();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5107 m15450(InterfaceC4859 interfaceC4859, C24367 c24367) {
        List listMo6805 = interfaceC4859.mo6805();
        int size = listMo6805.size() + 3;
        String[] strArr = new String[size];
        int i = 0;
        strArr[0] = MotionUtils.EASING_TYPE_FORMAT_START;
        int size2 = listMo6805.size();
        int i2 = 1;
        while (i < size2) {
            strArr[i2] = c24367.m54478(((CharSequence) listMo6805.get(i)).toString());
            i++;
            i2++;
        }
        strArr[i2] = MotionUtils.EASING_TYPE_FORMAT_END;
        strArr[i2 + 1] = c24367.m54478(interfaceC4859.mo6802());
        return new C7432(strArr, size);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC5107 m15451(InterfaceC8304 interfaceC8304, C24367 c24367) {
        return new C14143(c24367.m54478(interfaceC8304.getType()));
    }

    public final String toString() {
        throw new RuntimeException();
    }
}
