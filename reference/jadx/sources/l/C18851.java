package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G97V */
/* JADX INFO: loaded from: classes5.dex */
public class C18851 extends C11441 {
    @Override // l.C11441, l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        HashSet hashSet;
        int length;
        C23791 c23791M35096;
        C23791 c23791M35097;
        int i = 0;
        try {
            C5202 c5202Mo3077 = super.mo3077();
            String[] strArrM41566 = m41566("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM41566.length;
            while (i < length) {
                String str = strArrM41566[i];
                if (str.startsWith("$RECYCLE.BIN$/") && (c23791M35097 = C14619.m35096(str.substring(14))) != null) {
                    hashSet.add(c23791M35097.m52328());
                }
            }
            return c5202Mo3077;
        } finally {
            String[] strArrM41567 = m41566("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM41567.length;
            while (i < length) {
                String str2 = strArrM41567[i];
                if (str2.startsWith("$RECYCLE.BIN$/") && (c23791M35096 = C14619.m35096(str2.substring(14))) != null) {
                    hashSet.add(c23791M35096.m52328());
                }
                i++;
            }
            C20370.m46019(hashSet);
        }
    }
}
