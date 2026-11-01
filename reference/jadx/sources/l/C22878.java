package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22878 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f74416;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f74416 = sparseIntArray;
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
    public static void m50643(C15117 c15117, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f74416;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c15117.f49371 = typedArray.getFloat(index, c15117.f49371);
                    break;
                case 2:
                    c15117.f49369 = typedArray.getDimension(index, c15117.f49369);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c15117.f49370 = typedArray.getFloat(index, c15117.f49370);
                    break;
                case 5:
                    c15117.f49372 = typedArray.getFloat(index, c15117.f49372);
                    break;
                case 6:
                    c15117.f49384 = typedArray.getFloat(index, c15117.f49384);
                    break;
                case 7:
                    c15117.f49378 = typedArray.getFloat(index, c15117.f49378);
                    break;
                case 8:
                    c15117.f49379 = typedArray.getFloat(index, c15117.f49379);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C10884.f36999) {
                        int resourceId = typedArray.getResourceId(index, c15117.f30945);
                        c15117.f30945 = resourceId;
                        if (resourceId == -1) {
                            c15117.f30943 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c15117.f30943 = typedArray.getString(index);
                    } else {
                        c15117.f30945 = typedArray.getResourceId(index, c15117.f30945);
                    }
                    break;
                case 12:
                    c15117.f30946 = typedArray.getInt(index, c15117.f30946);
                    break;
                case 13:
                    c15117.f49383 = typedArray.getInteger(index, c15117.f49383);
                    break;
                case 14:
                    c15117.f49382 = typedArray.getFloat(index, c15117.f49382);
                    break;
                case 15:
                    c15117.f49380 = typedArray.getDimension(index, c15117.f49380);
                    break;
                case 16:
                    c15117.f49374 = typedArray.getDimension(index, c15117.f49374);
                    break;
                case 17:
                    c15117.f49381 = typedArray.getDimension(index, c15117.f49381);
                    break;
                case 18:
                    c15117.f49377 = typedArray.getFloat(index, c15117.f49377);
                    break;
                case 19:
                    c15117.f49373 = typedArray.getInt(index, c15117.f49373);
                    break;
                case 20:
                    c15117.f49376 = typedArray.getFloat(index, c15117.f49376);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        c15117.f49375 = typedArray.getDimension(index, c15117.f49375);
                    } else {
                        c15117.f49375 = typedArray.getFloat(index, c15117.f49375);
                    }
                    break;
            }
        }
    }
}
