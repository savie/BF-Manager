package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 27TW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20707 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47380(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C9518) it.next()).f30825.f62163.f50848;
            if (C9681.m25257(str2)) {
                return "video/mp4";
            }
            if (C9681.m25258(str2)) {
                z = true;
            } else if (C9681.m25254(str2)) {
                if (C17359.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (C17359.equals(str2, "image/avif")) {
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
