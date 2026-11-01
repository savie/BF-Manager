package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27TW */
/* JADX INFO: loaded from: classes.dex */
public final class C23969 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52813(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C4107) it.next()).f15054.f73295.f25265;
            if (C6632.m17982(str2)) {
                return "video/mp4";
            }
            if (C6632.m17975(str2)) {
                z = true;
            } else if (C6632.m17985(str2)) {
                if (C13638.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (C13638.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
