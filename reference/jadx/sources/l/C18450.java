package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܿܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B5C */
/* JADX INFO: loaded from: classes4.dex */
public final class C18450 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f60066;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f60067;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42987(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42984(C11417 c11417) {
        JSONArray jSONArrayArray = JSON.array();
        String str = c11417.f35897;
        if (str != null) {
            jSONArrayArray.add(C2729.m9064(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("temporary", true), "mt_apk_workspace_open", "inspect", "Open built APK as a temporary workspace for one-time inspection"));
        }
        return C15300.m36728(JSON.object().add("workspaceId", c11417.f35910).add("editSessionId", c11417.f35899).add("outputPath", c11417.f35901).add("apkFileName", c11417.f35908).add("size", c11417.f35904).add("signingPerformed", c11417.f35906).add("signSchemes", C12556.m31235(c11417.f35911)).add("signatureSummary", C17799.m41654(c11417.f35905, false)).add("changedDexEntries", C12556.m31235(c11417.f35909)).add("changedClassCount", c11417.f35900).add("deletedClassCount", c11417.f35903).add("addedZipEntries", C12556.m31235(c11417.f35898)).add("changedZipEntries", C12556.m31235(c11417.f35907)).add("deletedZipEntries", C12556.m31235(c11417.f35902)), jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m42989(int i, Object[] objArr) {
        if (i < objArr.length) {
            return objArr;
        }
        int length = objArr.length;
        while (length < i + 1) {
            length *= 2;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42983(int i, int i2, int[] iArr) {
        int length = iArr.length;
        int length2 = iArr.length - 2;
        int i3 = i;
        while (i3 >= i2 && iArr[i3] % length > i) {
            length2 = i3;
            i3 -= (i - i3) + 1;
        }
        int iMax = Math.max(i2 - 1, i3);
        while (length2 > iMax + 1) {
            int i4 = (iMax + length2) >> 1;
            if (iArr[i4] % length > i) {
                length2 = i4;
            } else {
                iMax = i4;
            }
        }
        return length2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42988(int i, byte[] bArr) {
        if (i < bArr.length) {
            return bArr;
        }
        int length = bArr.length;
        while (length < i + 1) {
            length *= 2;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42985(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C14442.m34864(i2, "Start index (", ") is negative"));
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(C0703.m3016("Start index (", i2, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i3));
        }
        if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(C0703.m3016("End index (", i3, ") is greater than array length (", MotionUtils.EASING_TYPE_FORMAT_END, i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42990(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C14442.m34864(i2, "Offset (", ") is negative"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(C14442.m34864(i3, "Length (", ") is negative"));
        }
        if (i3 <= i - i2) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Last index (" + (((long) i2) + ((long) i3)) + ") is greater than array length (" + i + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42986(int[] iArr) {
        int iMin;
        int i;
        int i2;
        int length = iArr.length;
        int i3 = 1;
        if (length != 1) {
            int i4 = 2;
            if (length != 2) {
                int length2 = iArr.length;
                iArr[0] = iArr[0] + iArr[1];
                int i5 = 2;
                int i6 = 0;
                for (int i7 = 1; i7 < length2 - 1; i7++) {
                    if (i5 < length2) {
                        int i8 = iArr[i6];
                        i = iArr[i5];
                        if (i8 < i) {
                            i = iArr[i6];
                            iArr[i6] = i7;
                            i6++;
                        } else {
                            i5++;
                        }
                    } else {
                        i = iArr[i6];
                        iArr[i6] = i7;
                        i6++;
                    }
                    if (i5 >= length2 || (i6 < i7 && iArr[i6] < iArr[i5])) {
                        i2 = i + iArr[i6];
                        iArr[i6] = i7 + length2;
                        i6++;
                    } else {
                        i2 = i + iArr[i5];
                        i5++;
                    }
                    iArr[i7] = i2;
                }
                int length3 = iArr.length - 2;
                for (int i9 = 1; i9 < 19 && length3 > 1; i9++) {
                    length3 = m42983(length3 - 1, 0, iArr);
                }
                if (iArr[0] % iArr.length >= length3) {
                    int length4 = iArr.length - 2;
                    int length5 = iArr.length - 1;
                    while (i4 > 0) {
                        int iM42983 = m42983(length4 - 1, 0, iArr);
                        int i10 = length4 - iM42983;
                        int i11 = i4 - i10;
                        while (i11 > 0) {
                            iArr[length5] = i3;
                            i11--;
                            length5--;
                        }
                        i4 = i10 << 1;
                        i3++;
                        length4 = iM42983;
                    }
                    return;
                }
                int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length3 - 1);
                int i12 = 20 - iNumberOfLeadingZeros;
                int length6 = iArr.length - 2;
                int length7 = iArr.length - 1;
                i4 = i12 != 1 ? 1 : 2;
                int i13 = i12 == 1 ? length3 - 2 : length3;
                int i14 = i4 << 1;
                while (i14 > 0) {
                    int iM42984 = length6 <= length3 ? length6 : m42983(length6 - 1, length3, iArr);
                    if (i4 >= i12) {
                        iMin = Math.min(i13, 1 << (i4 - i12));
                    } else if (i4 == 19 - iNumberOfLeadingZeros) {
                        if (iArr[iM42984] == length6) {
                            iM42984++;
                        }
                        iMin = 1;
                    } else {
                        iMin = 0;
                    }
                    int i15 = (length6 - iM42984) + iMin;
                    int i16 = i14 - i15;
                    while (i16 > 0) {
                        iArr[length7] = i4;
                        i16--;
                        length7--;
                    }
                    i13 -= iMin;
                    i14 = i15 << 1;
                    i4++;
                    length6 = iM42984;
                }
                return;
            }
            iArr[1] = 1;
        }
        iArr[0] = 1;
    }
}
