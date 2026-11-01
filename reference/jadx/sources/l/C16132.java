package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16132 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f52132;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f52132 = sparseIntArray;
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
    public static void m38187(C20365 c20365, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f52132;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C10884.f36999) {
                        int resourceId = typedArray.getResourceId(index, c20365.f30945);
                        c20365.f30945 = resourceId;
                        if (resourceId == -1) {
                            c20365.f30943 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c20365.f30943 = typedArray.getString(index);
                    } else {
                        c20365.f30945 = typedArray.getResourceId(index, c20365.f30945);
                    }
                    break;
                case 2:
                    c20365.f30946 = typedArray.getInt(index, c20365.f30946);
                    break;
                case 3:
                    typedArray.getString(index);
                    break;
                case 4:
                    c20365.f65957 = typedArray.getInteger(index, c20365.f65957);
                    break;
                case 5:
                    c20365.f65946 = typedArray.getInt(index, c20365.f65946);
                    break;
                case 6:
                    c20365.f65949 = typedArray.getFloat(index, c20365.f65949);
                    break;
                case 7:
                    if (typedArray.peekValue(index).type == 5) {
                        c20365.f65948 = typedArray.getDimension(index, c20365.f65948);
                    } else {
                        c20365.f65948 = typedArray.getFloat(index, c20365.f65948);
                    }
                    break;
                case 8:
                    c20365.f65955 = typedArray.getInt(index, c20365.f65955);
                    break;
                case 9:
                    c20365.f65944 = typedArray.getFloat(index, c20365.f65944);
                    break;
                case 10:
                    c20365.f65942 = typedArray.getDimension(index, c20365.f65942);
                    break;
                case 11:
                    c20365.f65943 = typedArray.getFloat(index, c20365.f65943);
                    break;
                case 12:
                    c20365.f65945 = typedArray.getFloat(index, c20365.f65945);
                    break;
                case 13:
                    c20365.f65958 = typedArray.getFloat(index, c20365.f65958);
                    break;
                case 14:
                    c20365.f65952 = typedArray.getFloat(index, c20365.f65952);
                    break;
                case 15:
                    c20365.f65951 = typedArray.getFloat(index, c20365.f65951);
                    break;
                case 16:
                    c20365.f65956 = typedArray.getFloat(index, c20365.f65956);
                    break;
                case 17:
                    c20365.f65953 = typedArray.getDimension(index, c20365.f65953);
                    break;
                case 18:
                    c20365.f65947 = typedArray.getDimension(index, c20365.f65947);
                    break;
                case 19:
                    c20365.f65954 = typedArray.getDimension(index, c20365.f65954);
                    break;
                case 20:
                    c20365.f65950 = typedArray.getFloat(index, c20365.f65950);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
