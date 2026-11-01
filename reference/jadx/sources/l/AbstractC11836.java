package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11836 {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo13250();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11836 m29529(InterfaceC8858 interfaceC8858, C20178 c20178) {
        List listMo9699 = interfaceC8858.mo9699();
        int size = listMo9699.size() + 3;
        String[] strArr = new String[size];
        int i = 0;
        strArr[0] = MotionUtils.EASING_TYPE_FORMAT_START;
        int size2 = listMo9699.size();
        int i2 = 1;
        while (i < size2) {
            strArr[i2] = c20178.m45610(((CharSequence) listMo9699.get(i)).toString());
            i++;
            i2++;
        }
        strArr[i2] = MotionUtils.EASING_TYPE_FORMAT_END;
        strArr[i2 + 1] = c20178.m45610(interfaceC8858.mo9698());
        return new C4779(strArr, size);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11836 m29530(InterfaceC18735 interfaceC18735, C20178 c20178) {
        return new C13953(c20178.m45610(interfaceC18735.getType()));
    }

    public final String toString() {
        throw new RuntimeException();
    }
}
