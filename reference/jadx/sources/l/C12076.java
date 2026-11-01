package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۫֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12076 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17515 f40420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m30041(View view, InterfaceC19985 interfaceC19985) {
        C13465.m32966(view, "<this>");
        view.setTag(R.id.MT_Protector, interfaceC19985);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30044(Set set, Set set2) {
        if (set.size() != set2.size()) {
            return false;
        }
        Iterator it = set.iterator();
        Iterator it2 = set2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!C13638.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static byte m30046(long j) {
        return (byte) ((72 - Long.numberOfLeadingZeros(j ^ (j >> 63))) >> 3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30042(Iterable iterable, Iterable iterable2, boolean z) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((C11335) it.next()).m28397((C11335) it2.next(), z)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m30049(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        int length = (8 - bArr.length) * 8;
        return (j << length) >> length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30043(Iterable iterable, Iterable iterable2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!((C11770) it.next()).m29397((C11770) it2.next(), z, z2, z3, z4, z5)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m30050(long j) {
        int iM30046 = m30046(j);
        byte[] bArr = new byte[iM30046];
        for (int i = 0; i < iM30046; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static byte m30051(long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        return (byte) ((iNumberOfLeadingZeros + 7) >> 3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17515 m30040() {
        if (f40420 == null) {
            try {
                if (C21460.m48080("com.portaudio.PortAudio", false) != null) {
                    f40420 = (InterfaceC17515) C21460.m48080("com.jsyn.devices.jportaudio.JPortAudioDevice", true).newInstance();
                }
            } catch (Throwable th) {
                System.err.println("Could not load JPortAudio device. " + th);
            }
        }
        if (f40420 == null) {
            try {
                Class clsM48080 = C21460.m48080("com.jsyn.devices.javasound.JavaSoundAudioDevice", false);
                if (clsM48080 != null) {
                    f40420 = (InterfaceC17515) clsM48080.newInstance();
                }
            } catch (Throwable th2) {
                System.err.println("Could not load JavaSound device. " + th2);
            }
        }
        return f40420;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m30047(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m30048(long j) {
        int iM30051 = m30051(j);
        byte[] bArr = new byte[iM30051];
        for (int i = 0; i < iM30051; i++) {
            bArr[i] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m30038(long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        return (iNumberOfTrailingZeros + 7) >> 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m30039(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < bArr.length; i++) {
            j |= ((long) (bArr[i] & 255)) << (i * 8);
        }
        return j << ((8 - bArr.length) * 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30045(long j) {
        int iM30038 = m30038(j);
        long j2 = j >> (64 - (iM30038 * 8));
        byte[] bArr = new byte[iM30038];
        for (int i = 0; i < iM30038; i++) {
            bArr[i] = (byte) j2;
            j2 >>= 8;
        }
        return bArr;
    }
}
