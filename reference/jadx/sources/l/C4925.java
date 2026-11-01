package l;

import android.util.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4925 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f17255 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList f17256 = new ArrayList();

    static {
        m13712();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m13712() {
        C17367 c17367M40441;
        boolean z;
        try {
            byte[] bArrMo16347 = ApplicationC0716.f2992.mo16347("mfr", (byte[]) null);
            if (bArrMo16347 != null) {
                c17367M40441 = new C17367(bArrMo16347);
                z = false;
            } else {
                String string = ApplicationC0716.f2992.getString("mfr", null);
                if (string == null) {
                    return;
                }
                c17367M40441 = C17367.m40441(Base64.decode(string, 0));
                z = true;
            }
            C20190.m45649((InterfaceC0433) c17367M40441, 1419064394);
            int i = c17367M40441.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C3326(c17367M40441.m40457(), c17367M40441.m40442()));
            }
            f17256 = arrayList;
            if (z) {
                m13710();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m13713() {
        return f17256;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m13710() {
        ArrayList<C3326> arrayList = new ArrayList(f17256);
        C11018 c11018M43576 = C18917.m43576(1419064394);
        c11018M43576.writeInt(arrayList.size());
        for (C3326 c3326 : arrayList) {
            c11018M43576.m27792(c3326.f12315);
            c11018M43576.m27782((CharSequence) c3326.f12316);
        }
        ApplicationC0716.f2992.edit().mo4067("mfr", c11018M43576.m27773()).apply();
    }
}
