package l;

import android.os.IBinder;
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3102 implements InterfaceC20019 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f10027;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m10112(AbstractC22044 abstractC22044, String str) {
        AbstractC22044 abstractC22045;
        String strSubstring;
        String strConcat;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Relative path can not be empty.");
        }
        if (str.startsWith("/") || str.endsWith("/")) {
            throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(str));
        }
        int iLastIndexOf = str.lastIndexOf(47);
        int i = -1;
        if (iLastIndexOf != -1) {
            String strSubstring2 = str.substring(0, iLastIndexOf);
            if (strSubstring2 != null && !strSubstring2.isEmpty()) {
                if (strSubstring2.startsWith("/") || strSubstring2.endsWith("/")) {
                    throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(strSubstring2));
                }
                if (abstractC22044.mo2934()) {
                    int iIndexOf = strSubstring2.indexOf(47);
                    int i2 = -1;
                    while (iIndexOf != -1) {
                        AbstractC22044 abstractC22044M10111 = m10111(strSubstring2.substring(i2 + 1, iIndexOf), abstractC22044.mo4299(true));
                        if (abstractC22044M10111 == null) {
                            break;
                        }
                        i2 = iIndexOf;
                        iIndexOf = strSubstring2.indexOf(47, iIndexOf + 1);
                        abstractC22044 = abstractC22044M10111;
                    }
                    String strSubstring3 = strSubstring2.substring(i2 + 1);
                    int iIndexOf2 = strSubstring3.indexOf(47);
                    if (iIndexOf2 == -1) {
                        AbstractC22044 abstractC22044M10112 = m10111(strSubstring3, abstractC22044.mo4299(true));
                        if (abstractC22044M10112 == null) {
                            abstractC22044M10112 = abstractC22044.m49876(strSubstring3);
                            while (abstractC22044M10112.mo2934()) {
                                StringBuilder sbM10405 = C3188.m10405(strSubstring3, "-");
                                iIndexOf2++;
                                sbM10405.append(iIndexOf2);
                                abstractC22044M10112 = abstractC22044.m49876(sbM10405.toString());
                            }
                        }
                        abstractC22044 = abstractC22044M10112;
                    } else {
                        String strSubstring4 = strSubstring3.substring(0, iIndexOf2);
                        String strSubstring5 = strSubstring3.substring(iIndexOf2 + 1);
                        AbstractC22044 abstractC22044M10113 = m10111(strSubstring4, abstractC22044.mo4299(true));
                        if (abstractC22044M10113 == null) {
                            abstractC22044M10113 = abstractC22044.m49876(strSubstring4);
                            int i3 = -1;
                            while (abstractC22044M10113.mo2934()) {
                                StringBuilder sbM10406 = C3188.m10405(strSubstring4, "-");
                                i3++;
                                sbM10406.append(i3);
                                abstractC22044M10113 = abstractC22044.m49876(sbM10406.toString());
                            }
                        }
                        abstractC22044 = abstractC22044M10113.m49876(strSubstring5);
                    }
                } else {
                    abstractC22044 = abstractC22044.m49876(strSubstring2);
                }
            }
            str = str.substring(iLastIndexOf + 1);
        }
        Iterator it = abstractC22044.mo4299(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC22045 = null;
                break;
            }
            abstractC22045 = (AbstractC22044) it.next();
            if (abstractC22045.mo4304()) {
                String name = abstractC22045.getName();
                if (!name.equals(str)) {
                    int iLastIndexOf2 = name.lastIndexOf(46);
                    if (iLastIndexOf2 > 0) {
                        int iLastIndexOf3 = name.lastIndexOf(46, iLastIndexOf2 - 1);
                        if (iLastIndexOf3 == -1) {
                            if (m10114(iLastIndexOf2 + 1, name.length(), name) && name.substring(0, iLastIndexOf2).equals(str)) {
                                break;
                            }
                        } else if (m10114(iLastIndexOf3 + 1, iLastIndexOf2, name)) {
                            if ((name.substring(0, iLastIndexOf3) + name.substring(iLastIndexOf2)).equals(str)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            }
        }
        if (abstractC22045 != null) {
            return abstractC22045;
        }
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str);
        int iLastIndexOf4 = str.lastIndexOf(46);
        if (iLastIndexOf4 == -1) {
            strConcat = str.concat(".");
            strSubstring = "";
        } else {
            String strSubstring6 = str.substring(0, iLastIndexOf4 + 1);
            strSubstring = str.substring(iLastIndexOf4);
            strConcat = strSubstring6;
        }
        while (abstractC22044M49876.mo2934()) {
            StringBuilder sbM27333 = C10732.m27333(strConcat);
            i++;
            sbM27333.append(i);
            sbM27333.append(strSubstring);
            abstractC22044M49876 = abstractC22044.m49876(sbM27333.toString());
        }
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m10117(String str) {
        IBinder iBinderM52219 = C23240.m52219("activity");
        IBinder iBinder = null;
        if (iBinderM52219 != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.app.IActivityManager");
                parcelObtain.writeInt(2);
                iBinderM52219.transact(1599296841, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                IBinder strongBinder = parcelObtain2.readStrongBinder();
                if (strongBinder != null) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    iBinder = strongBinder;
                } else {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            } catch (Throwable unused) {
            }
        }
        if (iBinder != null) {
            C12797.m31696(iBinder, str);
            f10027 = true;
        } else {
            f10027 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10113() {
        return f10027;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static byte m10120(long j) {
        return (byte) ((72 - Long.numberOfLeadingZeros(j ^ (j >> 63))) >> 3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m10121(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        int length = (8 - bArr.length) * 8;
        return (j << length) >> length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m10123(long j) {
        int iM10120 = m10120(j);
        byte[] bArr = new byte[iM10120];
        for (int i = 0; i < iM10120; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static byte m10119(long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        return (byte) ((iNumberOfLeadingZeros + 7) >> 3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m10116(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m10118(long j) {
        int iM10119 = m10119(j);
        byte[] bArr = new byte[iM10119];
        for (int i = 0; i < iM10119; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m10111(String str, List list) {
        int iLastIndexOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
            if (abstractC22044.mo4281()) {
                String name = abstractC22044.getName();
                if (name.equals(str) || ((iLastIndexOf = name.lastIndexOf(45)) != -1 && m10114(iLastIndexOf + 1, name.length(), name) && name.substring(0, iLastIndexOf).equals(str))) {
                    return abstractC22044;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m10124(long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        return (iNumberOfTrailingZeros + 7) >> 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m10109(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j << ((8 - bArr.length) * 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m10115(long j) {
        int iM10124 = m10124(j);
        long j2 = j >> (64 - (iM10124 * 8));
        byte[] bArr = new byte[iM10124];
        for (int i = 0; i < iM10124; i++) {
            bArr[i] = (byte) j2;
            j2 >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10114(int i, int i2, String str) {
        if (i >= i2) {
            return false;
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m10122(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return str;
        }
        int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
        if (iLastIndexOf2 == -1) {
            return m10114(iLastIndexOf + 1, str.length(), str) ? str.substring(0, iLastIndexOf) : str;
        }
        if (!m10114(iLastIndexOf2 + 1, iLastIndexOf, str)) {
            return str;
        }
        return str.substring(0, iLastIndexOf2) + str.substring(iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10110(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return (iLastIndexOf == -1 || !m10114(iLastIndexOf + 1, str.length(), str)) ? str : str.substring(0, iLastIndexOf);
    }
}
