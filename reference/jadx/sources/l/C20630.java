package l;

import bin.mt.plus.R;
import java.io.File;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩷ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27Y0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20630 implements InterfaceC7359, InterfaceC0738, InterfaceC3485, InterfaceC3740, InterfaceC19782 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46499(Class cls, Hashtable hashtable, String str, Class cls2, String str2) {
        hashtable.put(str, cls.getName());
        hashtable.put(str2, cls2.getName());
    }

    @Override // l.InterfaceC19782
    public void accept(Object obj) {
        C15071.m36107((File) obj);
    }

    @Override // l.InterfaceC0738
    /* JADX INFO: renamed from: ۙ */
    public void mo3203() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46498(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4815(C4751 c4751) {
        C8291 c8291 = (C8291) c4751;
        int i = c8291.m42292().getInt(c8291.m13157(), 0);
        boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        String[] strArrSplit = c8291.m13133().getString(R.string.MT_Protector).split("\\|");
        if (strArrSplit.length != 4) {
            throw new IllegalArgumentException(Arrays.toString(strArrSplit));
        }
        StringBuilder sb = new StringBuilder();
        if (zArr[0]) {
            sb.append(strArrSplit[1]);
        } else {
            sb.append(strArrSplit[0]);
        }
        sb.append(", ");
        if (zArr[1]) {
            sb.append(strArrSplit[3]);
        } else {
            sb.append(strArrSplit[2]);
        }
        return sb.toString();
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new LinkedHashMap();
    }
}
