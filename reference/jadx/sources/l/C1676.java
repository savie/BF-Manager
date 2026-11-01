package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C1676 extends C3087 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5592(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        C9439.m24197(i, i2, i3, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5591(Object[] objArr, C21203 c21203, int i, int i2) {
        C13465.m32966(objArr, "<this>");
        Arrays.fill(objArr, i, i2, c21203);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m5590(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C23238.f75405;
        }
        if (length == 1) {
            return C4892.m13617(objArr[0]);
        }
        return new ArrayList(new C23550(objArr));
    }
}
