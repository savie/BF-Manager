package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1AV */
/* JADX INFO: loaded from: classes3.dex */
public final class C13000 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f43357;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43357 = sparseIntArray;
        sparseIntArray.append(4, 1);
        sparseIntArray.append(2, 2);
        sparseIntArray.append(11, 3);
        sparseIntArray.append(0, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(8, 6);
        sparseIntArray.append(9, 7);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(10, 8);
        sparseIntArray.append(7, 11);
        sparseIntArray.append(6, 12);
        sparseIntArray.append(5, 10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32168(C3826 c3826, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f43357;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C10884.f36999) {
                        int resourceId = typedArray.getResourceId(index, c3826.f30945);
                        c3826.f30945 = resourceId;
                        if (resourceId == -1) {
                            c3826.f30943 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c3826.f30943 = typedArray.getString(index);
                    } else {
                        c3826.f30945 = typedArray.getResourceId(index, c3826.f30945);
                    }
                    break;
                case 2:
                    c3826.f30946 = typedArray.getInt(index, c3826.f30946);
                    break;
                case 3:
                    if (typedArray.peekValue(index).type == 3) {
                        c3826.f14184 = typedArray.getString(index);
                    } else {
                        c3826.f14184 = C23188.f75244[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    c3826.f22460 = typedArray.getInteger(index, c3826.f22460);
                    break;
                case 5:
                    c3826.f14185 = typedArray.getInt(index, c3826.f14185);
                    break;
                case 6:
                    c3826.f14181 = typedArray.getFloat(index, c3826.f14181);
                    break;
                case 7:
                    c3826.f14186 = typedArray.getFloat(index, c3826.f14186);
                    break;
                case 8:
                    float f = typedArray.getFloat(index, c3826.f14182);
                    c3826.f14180 = f;
                    c3826.f14182 = f;
                    break;
                case 9:
                    c3826.f14183 = typedArray.getInt(index, c3826.f14183);
                    break;
                case 10:
                    c3826.f14179 = typedArray.getInt(index, c3826.f14179);
                    break;
                case 11:
                    c3826.f14180 = typedArray.getFloat(index, c3826.f14180);
                    break;
                case 12:
                    c3826.f14182 = typedArray.getFloat(index, c3826.f14182);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
