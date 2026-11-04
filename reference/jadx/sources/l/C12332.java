package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12332 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f39614;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f39614 = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(9, 2);
        sparseIntArray.append(5, 4);
        sparseIntArray.append(6, 5);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(3, 7);
        sparseIntArray.append(15, 8);
        sparseIntArray.append(14, 9);
        sparseIntArray.append(13, 10);
        sparseIntArray.append(11, 12);
        sparseIntArray.append(10, 13);
        sparseIntArray.append(4, 14);
        sparseIntArray.append(1, 15);
        sparseIntArray.append(2, 16);
        sparseIntArray.append(8, 17);
        sparseIntArray.append(12, 18);
        sparseIntArray.append(18, 20);
        sparseIntArray.append(17, 21);
        sparseIntArray.append(19, 19);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30755(C6367 c6367, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f39614;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c6367.f21510 = typedArray.getFloat(index, c6367.f21510);
                    break;
                case 2:
                    c6367.f21505 = typedArray.getDimension(index, c6367.f21505);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c6367.f21499 = typedArray.getFloat(index, c6367.f21499);
                    break;
                case 5:
                    c6367.f21503 = typedArray.getFloat(index, c6367.f21503);
                    break;
                case 6:
                    c6367.f21514 = typedArray.getFloat(index, c6367.f21514);
                    break;
                case 7:
                    c6367.f21508 = typedArray.getFloat(index, c6367.f21508);
                    break;
                case 8:
                    c6367.f21507 = typedArray.getFloat(index, c6367.f21507);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C21855.f69626) {
                        int resourceId = typedArray.getResourceId(index, c6367.f2498);
                        c6367.f2498 = resourceId;
                        if (resourceId == -1) {
                            c6367.f2500 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c6367.f2500 = typedArray.getString(index);
                    } else {
                        c6367.f2498 = typedArray.getResourceId(index, c6367.f2498);
                    }
                    break;
                case 12:
                    c6367.f2499 = typedArray.getInt(index, c6367.f2499);
                    break;
                case 13:
                    c6367.f21506 = typedArray.getInteger(index, c6367.f21506);
                    break;
                case 14:
                    c6367.f21509 = typedArray.getFloat(index, c6367.f21509);
                    break;
                case 15:
                    c6367.f21512 = typedArray.getDimension(index, c6367.f21512);
                    break;
                case 16:
                    c6367.f21500 = typedArray.getDimension(index, c6367.f21500);
                    break;
                case 17:
                    c6367.f21511 = typedArray.getDimension(index, c6367.f21511);
                    break;
                case 18:
                    c6367.f21501 = typedArray.getFloat(index, c6367.f21501);
                    break;
                case 19:
                    c6367.f21513 = typedArray.getInt(index, c6367.f21513);
                    break;
                case 20:
                    c6367.f21502 = typedArray.getFloat(index, c6367.f21502);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        c6367.f21504 = typedArray.getDimension(index, c6367.f21504);
                    } else {
                        c6367.f21504 = typedArray.getFloat(index, c6367.f21504);
                    }
                    break;
            }
        }
    }
}
