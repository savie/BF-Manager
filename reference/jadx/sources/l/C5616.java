package l;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H8OG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5616 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19786 m16597(C21287 c21287, boolean z, boolean z2) throws C2970 {
        if (z) {
            m16598(3, c21287, false);
        }
        c21287.m48488((int) c21287.m48505(), StandardCharsets.UTF_8);
        long jM48505 = c21287.m48505();
        String[] strArr = new String[(int) jM48505];
        for (int i = 0; i < jM48505; i++) {
            strArr[i] = c21287.m48488((int) c21287.m48505(), StandardCharsets.UTF_8);
        }
        if (z2 && (c21287.m48493() & 1) == 0) {
            throw C2970.m9688("framing bit expected to be set", (Throwable) null);
        }
        return new C19786(strArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19378 m16596(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = C7116.f23455;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                C1896.m6517("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C17943.m41885(new C21287(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    C1896.m6514("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C16209(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C19378(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16598(int i, C21287 c21287, boolean z) throws C2970 {
        if (c21287.m48486() < 7) {
            if (z) {
                return false;
            }
            throw C2970.m9688("too short header: " + c21287.m48486(), (Throwable) null);
        }
        if (c21287.m48493() != i) {
            if (z) {
                return false;
            }
            throw C2970.m9688("expected header type " + Integer.toHexString(i), (Throwable) null);
        }
        if (c21287.m48493() == 118 && c21287.m48493() == 111 && c21287.m48493() == 114 && c21287.m48493() == 98 && c21287.m48493() == 105 && c21287.m48493() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C2970.m9688("expected characters 'vorbis'", (Throwable) null);
    }
}
