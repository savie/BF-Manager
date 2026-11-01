package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C18496 extends AbstractC4674 {
    public C18496() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("local") && !c21422.m47977();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        boolean z;
        boolean z2;
        c21422.m47963("local");
        List listM47979 = c21422.m47979();
        int i = 0;
        if (listM47979.size() == 1) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            String name = interfaceC2557.getName();
            String lowerCase = name.toLowerCase();
            boolean z3 = interfaceC2557.mo7985() && lowerCase.endsWith(".bak");
            int length = interfaceC2557.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length == -1) {
                length = name.length();
            } else if (lowerCase.endsWith(".rename") || lowerCase.endsWith(".apk.1")) {
                int length2 = name.length();
                int i2 = length;
                length = length2;
                i = i2;
            }
            C6501 c6501 = new C6501(c21422.m47980(), c21422, name, interfaceC2557);
            c6501.m40376(R.string.MT_Protector);
            c6501.m40346((CharSequence) interfaceC2557.getName());
            c6501.m40336(6);
            c6501.m40340();
            c6501.m40342(i, length);
            if (z3) {
                c6501.m40343(R.string.MT_Protector, new ViewOnClickListenerC8043(interfaceC2557, c21422, c6501, 2), (ViewOnLongClickListenerC0856) null);
            } else {
                c6501.m40343(android.R.string.paste, new ViewOnClickListenerC7626(2, c6501), new ViewOnLongClickListenerC0856(c6501));
            }
            c6501.m40368(!z3);
            return;
        }
        ArrayList arrayList = new ArrayList(listM47979);
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String strMo7967 = ((InterfaceC2557) it.next()).mo7967();
            if (strMo7967.equals("application/vnd.android.package-archive")) {
                if (i != 0) {
                    z2 = i;
                    z = true;
                    Main mainM47980 = c21422.m47980();
                    new C21318(this, mainM47980, arrayList, z, z2, c21422, arrayList, mainM47980).m22699();
                }
                z4 = true;
            } else if (!strMo7967.startsWith("image/")) {
                continue;
            } else {
                if (z4) {
                    z = z4;
                    z2 = 1;
                    Main mainM47981 = c21422.m47980();
                    new C21318(this, mainM47981, arrayList, z, z2, c21422, arrayList, mainM47981).m22699();
                }
                i = 1;
            }
        }
        z = z4;
        z2 = i;
        Main mainM47982 = c21422.m47980();
        new C21318(this, mainM47982, arrayList, z, z2, c21422, arrayList, mainM47982).m22699();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42891(C18496 c18496, C21422 c21422, ArrayList arrayList) {
        String[] strArr = (String[]) C9030.stream(arrayList).map(new C18663(1)).toArray(new C8731(1));
        String[] strArr2 = (String[]) C9030.stream(arrayList).map(new C6072(1)).toArray(new C12852());
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C17790.class);
        c10142.m25777(c21422);
        c10142.m25771("oldNames", strArr);
        c10142.m25771("newNames", strArr2);
        c10142.m25768(MotionUtils.EASING_TYPE_PATH, c21422.m47959());
        c10142.m25763();
    }
}
