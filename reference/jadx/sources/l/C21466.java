package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f69771;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f69771 = sparseIntArray;
        sparseIntArray.append(0, 8);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 1);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(9, 5);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(2, 10);
        sparseIntArray.append(8, 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48089(C17938 c17938, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f69771;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c17938.f57385 = typedArray.getString(index);
                    continue;
                    break;
                case 2:
                    c17938.f57378 = typedArray.getString(index);
                    continue;
                    break;
                case 4:
                    c17938.f57390 = typedArray.getString(index);
                    continue;
                    break;
                case 5:
                    c17938.f57387 = typedArray.getFloat(index, c17938.f57387);
                    continue;
                    break;
                case 6:
                    c17938.f57388 = typedArray.getResourceId(index, c17938.f57388);
                    continue;
                    break;
                case 7:
                    if (C10884.f36999) {
                        int resourceId = typedArray.getResourceId(index, c17938.f30945);
                        c17938.f30945 = resourceId;
                        if (resourceId == -1) {
                            c17938.f30943 = typedArray.getString(index);
                        } else {
                            continue;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c17938.f30943 = typedArray.getString(index);
                    } else {
                        c17938.f30945 = typedArray.getResourceId(index, c17938.f30945);
                    }
                    break;
                case 8:
                    int integer = typedArray.getInteger(index, c17938.f30946);
                    c17938.f30946 = integer;
                    c17938.f57384 = (integer + 0.5f) / 100.0f;
                    continue;
                    break;
                case 9:
                    c17938.f57380 = typedArray.getResourceId(index, c17938.f57380);
                    continue;
                    break;
                case 10:
                    c17938.f57386 = typedArray.getBoolean(index, c17938.f57386);
                    continue;
                    break;
                case 11:
                    c17938.f57383 = typedArray.getResourceId(index, c17938.f57383);
                    break;
            }
            Integer.toHexString(index);
            sparseIntArray.get(index);
        }
    }
}
