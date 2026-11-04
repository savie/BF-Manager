package l;

import android.util.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f3749 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList f3750 = new ArrayList();

    static {
        m3940();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m3940() {
        C20348 c20348M46740;
        boolean z;
        try {
            byte[] bArrMo7903 = ApplicationC17729.f58258.mo7903("mfr", (byte[]) null);
            if (bArrMo7903 != null) {
                c20348M46740 = new C20348(bArrMo7903);
                z = false;
            } else {
                String string = ApplicationC17729.f58258.getString("mfr", null);
                if (string == null) {
                    return;
                }
                c20348M46740 = C20348.m46740(Base64.decode(string, 0));
                z = true;
            }
            C17364.m40795((InterfaceC15872) c20348M46740, 1419064394);
            int i = c20348M46740.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C9984(c20348M46740.m46757(), c20348M46740.m46756()));
            }
            f3750 = arrayList;
            if (z) {
                m3942();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m3941() {
        return f3750;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m3942() {
        ArrayList<C9984> arrayList = new ArrayList(f3750);
        C6178 c6178M34975 = C14483.m34975(1419064394);
        c6178M34975.writeInt(arrayList.size());
        for (C9984 c9984 : arrayList) {
            c6178M34975.m17804(c9984.f32084);
            c6178M34975.m17786((CharSequence) c9984.f32085);
        }
        ApplicationC17729.f58258.edit().mo3488("mfr", c6178M34975.m17796()).apply();
    }
}
