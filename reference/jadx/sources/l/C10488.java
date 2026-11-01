package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10488 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f35932;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35932 = sparseIntArray;
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
    public static void m26609(C7665 c7665, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f35932;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c7665.f25343 = typedArray.getFloat(index, c7665.f25343);
                    break;
                case 2:
                    c7665.f25341 = typedArray.getDimension(index, c7665.f25341);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c7665.f25355 = typedArray.getFloat(index, c7665.f25355);
                    break;
                case 5:
                    c7665.f25349 = typedArray.getFloat(index, c7665.f25349);
                    break;
                case 6:
                    c7665.f25353 = typedArray.getFloat(index, c7665.f25353);
                    break;
                case 7:
                    c7665.f25350 = typedArray.getFloat(index, c7665.f25350);
                    break;
                case 8:
                    c7665.f25345 = typedArray.getFloat(index, c7665.f25345);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C10884.f36999) {
                        int resourceId = typedArray.getResourceId(index, c7665.f30945);
                        c7665.f30945 = resourceId;
                        if (resourceId == -1) {
                            c7665.f30943 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c7665.f30943 = typedArray.getString(index);
                    } else {
                        c7665.f30945 = typedArray.getResourceId(index, c7665.f30945);
                    }
                    break;
                case 12:
                    c7665.f30946 = typedArray.getInt(index, c7665.f30946);
                    break;
                case 13:
                    c7665.f25354 = typedArray.getInteger(index, c7665.f25354);
                    break;
                case 14:
                    c7665.f25351 = typedArray.getFloat(index, c7665.f25351);
                    break;
                case 15:
                    c7665.f25352 = typedArray.getDimension(index, c7665.f25352);
                    break;
                case 16:
                    c7665.f25346 = typedArray.getDimension(index, c7665.f25346);
                    break;
                case 17:
                    c7665.f25347 = typedArray.getDimension(index, c7665.f25347);
                    break;
                case 18:
                    c7665.f25344 = typedArray.getFloat(index, c7665.f25344);
                    break;
                case 19:
                    c7665.f25348 = typedArray.getDimension(index, c7665.f25348);
                    break;
                case 20:
                    c7665.f25342 = typedArray.getDimension(index, c7665.f25342);
                    break;
            }
        }
    }
}
