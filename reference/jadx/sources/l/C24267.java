package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24267 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f78571;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f78571 = sparseIntArray;
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
    public static void m54268(C4129 c4129, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f78571;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c4129.f14016 = typedArray.getString(index);
                    continue;
                    break;
                case 2:
                    c4129.f14001 = typedArray.getString(index);
                    continue;
                    break;
                case 4:
                    c4129.f14009 = typedArray.getString(index);
                    continue;
                    break;
                case 5:
                    c4129.f14015 = typedArray.getFloat(index, c4129.f14015);
                    continue;
                    break;
                case 6:
                    c4129.f14002 = typedArray.getResourceId(index, c4129.f14002);
                    continue;
                    break;
                case 7:
                    if (C21855.f69626) {
                        int resourceId = typedArray.getResourceId(index, c4129.f2498);
                        c4129.f2498 = resourceId;
                        if (resourceId == -1) {
                            c4129.f2500 = typedArray.getString(index);
                        } else {
                            continue;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c4129.f2500 = typedArray.getString(index);
                    } else {
                        c4129.f2498 = typedArray.getResourceId(index, c4129.f2498);
                    }
                    break;
                case 8:
                    int integer = typedArray.getInteger(index, c4129.f2499);
                    c4129.f2499 = integer;
                    c4129.f14010 = (integer + 0.5f) / 100.0f;
                    continue;
                    break;
                case 9:
                    c4129.f14004 = typedArray.getResourceId(index, c4129.f14004);
                    continue;
                    break;
                case 10:
                    c4129.f14014 = typedArray.getBoolean(index, c4129.f14014);
                    continue;
                    break;
                case 11:
                    c4129.f14008 = typedArray.getResourceId(index, c4129.f14008);
                    break;
            }
            Integer.toHexString(index);
            sparseIntArray.get(index);
        }
    }
}
