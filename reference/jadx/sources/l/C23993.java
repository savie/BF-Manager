package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G97V */
/* JADX INFO: loaded from: classes2.dex */
public class C23993 extends C22479 {
    @Override // l.C22479, l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() {
        HashSet hashSet;
        int length;
        C4775 c4775M49624;
        C4775 c4775M49625;
        int i = 0;
        try {
            C12187 c12187Mo2531 = super.mo2531();
            String[] strArrM43831 = m43831("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM43831.length;
            while (i < length) {
                String str = strArrM43831[i];
                if (str.startsWith("$RECYCLE.BIN$/") && (c4775M49625 = C21929.m49624(str.substring(14))) != null) {
                    hashSet.add(c4775M49625.m14739());
                }
            }
            return c12187Mo2531;
        } finally {
            String[] strArrM43832 = m43831("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM43832.length;
            while (i < length) {
                String str2 = strArrM43832[i];
                if (str2.startsWith("$RECYCLE.BIN$/") && (c4775M49624 = C21929.m49624(str2.substring(14))) != null) {
                    hashSet.add(c4775M49624.m14739());
                }
                i++;
            }
            C19632.m45277(hashSet);
        }
    }
}
