package l;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15773 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10128 m37514(C2460 c2460, boolean z, boolean z2) throws C22861 {
        if (z) {
            m37515(3, c2460, false);
        }
        c2460.m7505((int) c2460.m7524(), StandardCharsets.UTF_8);
        long jM7524 = c2460.m7524();
        String[] strArr = new String[(int) jM7524];
        for (int i = 0; i < jM7524; i++) {
            strArr[i] = c2460.m7505((int) c2460.m7524(), StandardCharsets.UTF_8);
        }
        if (z2 && (c2460.m7516() & 1) == 0) {
            throw C22861.m50610("framing bit expected to be set", (Throwable) null);
        }
        return new C10128(strArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0987 m37513(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = C17983.f57504;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                C0303.m1848("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C12722.m31570(new C2460(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    C0303.m1852("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C17431(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0987(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37515(int i, C2460 c2460, boolean z) throws C22861 {
        if (c2460.m7503() < 7) {
            if (z) {
                return false;
            }
            throw C22861.m50610("too short header: " + c2460.m7503(), (Throwable) null);
        }
        if (c2460.m7516() != i) {
            if (z) {
                return false;
            }
            throw C22861.m50610("expected header type " + Integer.toHexString(i), (Throwable) null);
        }
        if (c2460.m7516() == 118 && c2460.m7516() == 111 && c2460.m7516() == 114 && c2460.m7516() == 98 && c2460.m7516() == 105 && c2460.m7516() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C22861.m50610("expected characters 'vorbis'", (Throwable) null);
    }
}
