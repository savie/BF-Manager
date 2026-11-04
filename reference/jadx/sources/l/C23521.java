package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1AV */
/* JADX INFO: loaded from: classes.dex */
public final class C23521 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f76006;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f76006 = sparseIntArray;
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
    public static void m52703(C3383 c3383, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f76006;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C21855.f69626) {
                        int resourceId = typedArray.getResourceId(index, c3383.f2498);
                        c3383.f2498 = resourceId;
                        if (resourceId == -1) {
                            c3383.f2500 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c3383.f2500 = typedArray.getString(index);
                    } else {
                        c3383.f2498 = typedArray.getResourceId(index, c3383.f2498);
                    }
                    break;
                case 2:
                    c3383.f2499 = typedArray.getInt(index, c3383.f2499);
                    break;
                case 3:
                    if (typedArray.peekValue(index).type == 3) {
                        c3383.f11029 = typedArray.getString(index);
                    } else {
                        c3383.f11029 = C12573.f40368[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    c3383.f65771 = typedArray.getInteger(index, c3383.f65771);
                    break;
                case 5:
                    c3383.f11027 = typedArray.getInt(index, c3383.f11027);
                    break;
                case 6:
                    c3383.f11025 = typedArray.getFloat(index, c3383.f11025);
                    break;
                case 7:
                    c3383.f11030 = typedArray.getFloat(index, c3383.f11030);
                    break;
                case 8:
                    float f = typedArray.getFloat(index, c3383.f11024);
                    c3383.f11023 = f;
                    c3383.f11024 = f;
                    break;
                case 9:
                    c3383.f11028 = typedArray.getInt(index, c3383.f11028);
                    break;
                case 10:
                    c3383.f11026 = typedArray.getInt(index, c3383.f11026);
                    break;
                case 11:
                    c3383.f11023 = typedArray.getFloat(index, c3383.f11023);
                    break;
                case 12:
                    c3383.f11024 = typedArray.getFloat(index, c3383.f11024);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
