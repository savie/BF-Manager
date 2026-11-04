package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8099 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f26760;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26760 = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(7, 4);
        sparseIntArray.append(8, 5);
        sparseIntArray.append(9, 6);
        sparseIntArray.append(1, 19);
        sparseIntArray.append(2, 20);
        sparseIntArray.append(5, 7);
        sparseIntArray.append(17, 8);
        sparseIntArray.append(16, 9);
        sparseIntArray.append(15, 10);
        sparseIntArray.append(13, 12);
        sparseIntArray.append(12, 13);
        sparseIntArray.append(6, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(10, 17);
        sparseIntArray.append(14, 18);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21980(C19286 c19286, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f26760;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c19286.f62352 = typedArray.getFloat(index, c19286.f62352);
                    break;
                case 2:
                    c19286.f62347 = typedArray.getDimension(index, c19286.f62347);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c19286.f62355 = typedArray.getFloat(index, c19286.f62355);
                    break;
                case 5:
                    c19286.f62350 = typedArray.getFloat(index, c19286.f62350);
                    break;
                case 6:
                    c19286.f62351 = typedArray.getFloat(index, c19286.f62351);
                    break;
                case 7:
                    c19286.f62349 = typedArray.getFloat(index, c19286.f62349);
                    break;
                case 8:
                    c19286.f62342 = typedArray.getFloat(index, c19286.f62342);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C21855.f69626) {
                        int resourceId = typedArray.getResourceId(index, c19286.f2498);
                        c19286.f2498 = resourceId;
                        if (resourceId == -1) {
                            c19286.f2500 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c19286.f2500 = typedArray.getString(index);
                    } else {
                        c19286.f2498 = typedArray.getResourceId(index, c19286.f2498);
                    }
                    break;
                case 12:
                    c19286.f2499 = typedArray.getInt(index, c19286.f2499);
                    break;
                case 13:
                    c19286.f62348 = typedArray.getInteger(index, c19286.f62348);
                    break;
                case 14:
                    c19286.f62354 = typedArray.getFloat(index, c19286.f62354);
                    break;
                case 15:
                    c19286.f62353 = typedArray.getDimension(index, c19286.f62353);
                    break;
                case 16:
                    c19286.f62346 = typedArray.getDimension(index, c19286.f62346);
                    break;
                case 17:
                    c19286.f62344 = typedArray.getDimension(index, c19286.f62344);
                    break;
                case 18:
                    c19286.f62345 = typedArray.getFloat(index, c19286.f62345);
                    break;
                case 19:
                    c19286.f62343 = typedArray.getDimension(index, c19286.f62343);
                    break;
                case 20:
                    c19286.f62341 = typedArray.getDimension(index, c19286.f62341);
                    break;
            }
        }
    }
}
