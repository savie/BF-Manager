package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f4940;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4940 = sparseIntArray;
        sparseIntArray.append(13, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(14, 3);
        sparseIntArray.append(10, 4);
        sparseIntArray.append(18, 5);
        sparseIntArray.append(17, 6);
        sparseIntArray.append(16, 7);
        sparseIntArray.append(19, 8);
        sparseIntArray.append(0, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(5, 11);
        sparseIntArray.append(6, 12);
        sparseIntArray.append(7, 13);
        sparseIntArray.append(15, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(1, 17);
        sparseIntArray.append(2, 18);
        sparseIntArray.append(8, 19);
        sparseIntArray.append(12, 20);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5087(C9589 c9589, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f4940;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C21855.f69626) {
                        int resourceId = typedArray.getResourceId(index, c9589.f2498);
                        c9589.f2498 = resourceId;
                        if (resourceId == -1) {
                            c9589.f2500 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c9589.f2500 = typedArray.getString(index);
                    } else {
                        c9589.f2498 = typedArray.getResourceId(index, c9589.f2498);
                    }
                    break;
                case 2:
                    c9589.f2499 = typedArray.getInt(index, c9589.f2499);
                    break;
                case 3:
                    typedArray.getString(index);
                    break;
                case 4:
                    c9589.f31026 = typedArray.getInteger(index, c9589.f31026);
                    break;
                case 5:
                    c9589.f31033 = typedArray.getInt(index, c9589.f31033);
                    break;
                case 6:
                    c9589.f31022 = typedArray.getFloat(index, c9589.f31022);
                    break;
                case 7:
                    if (typedArray.peekValue(index).type == 5) {
                        c9589.f31024 = typedArray.getDimension(index, c9589.f31024);
                    } else {
                        c9589.f31024 = typedArray.getFloat(index, c9589.f31024);
                    }
                    break;
                case 8:
                    c9589.f31020 = typedArray.getInt(index, c9589.f31020);
                    break;
                case 9:
                    c9589.f31030 = typedArray.getFloat(index, c9589.f31030);
                    break;
                case 10:
                    c9589.f31025 = typedArray.getDimension(index, c9589.f31025);
                    break;
                case 11:
                    c9589.f31018 = typedArray.getFloat(index, c9589.f31018);
                    break;
                case 12:
                    c9589.f31023 = typedArray.getFloat(index, c9589.f31023);
                    break;
                case 13:
                    c9589.f31034 = typedArray.getFloat(index, c9589.f31034);
                    break;
                case 14:
                    c9589.f31027 = typedArray.getFloat(index, c9589.f31027);
                    break;
                case 15:
                    c9589.f31028 = typedArray.getFloat(index, c9589.f31028);
                    break;
                case 16:
                    c9589.f31029 = typedArray.getFloat(index, c9589.f31029);
                    break;
                case 17:
                    c9589.f31032 = typedArray.getDimension(index, c9589.f31032);
                    break;
                case 18:
                    c9589.f31019 = typedArray.getDimension(index, c9589.f31019);
                    break;
                case 19:
                    c9589.f31031 = typedArray.getDimension(index, c9589.f31031);
                    break;
                case 20:
                    c9589.f31021 = typedArray.getFloat(index, c9589.f31021);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
