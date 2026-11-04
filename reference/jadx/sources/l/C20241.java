package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20241 extends AbstractC9843 {
    public C20241() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("local") && !c12915.m31988();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        boolean z;
        boolean z2;
        c12915.m31970("local");
        List listM31982 = c12915.m31982();
        int i = 0;
        if (listM31982.size() == 1) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            String name = interfaceC2386.getName();
            String lowerCase = name.toLowerCase();
            boolean z3 = interfaceC2386.mo8090() && lowerCase.endsWith(".bak");
            int length = interfaceC2386.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length == -1) {
                length = name.length();
            } else if (lowerCase.endsWith(".rename") || lowerCase.endsWith(".apk.1")) {
                int length2 = name.length();
                int i2 = length;
                length = length2;
                i = i2;
            }
            C16511 c16511 = new C16511(c12915.m31979(), c12915, name, interfaceC2386);
            c16511.m22945(R.string.MT_Protector);
            c16511.m22924((CharSequence) interfaceC2386.getName());
            c16511.m22957(6);
            c16511.m22918();
            c16511.m22920(i, length);
            if (z3) {
                c16511.m22921(R.string.MT_Protector, new ViewOnClickListenerC8216(interfaceC2386, c12915, c16511, 1), (ViewOnLongClickListenerC1596) null);
            } else {
                c16511.m22921(android.R.string.paste, new ViewOnClickListenerC5325(c16511, 0), new ViewOnLongClickListenerC1596(c16511));
            }
            C14031.m34164(c16511, interfaceC2386);
            c16511.m22955(!z3);
            C5416.m16144(c16511.m22956());
            return;
        }
        ArrayList arrayList = new ArrayList(listM31982);
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String strMo8114 = ((InterfaceC2386) it.next()).mo8114();
            if (strMo8114.equals("application/vnd.android.package-archive")) {
                if (i != 0) {
                    z2 = i;
                    z = true;
                    Main mainM31979 = c12915.m31979();
                    new C23225(this, mainM31979, arrayList, z, z2, c12915, arrayList, mainM31979).m53490();
                }
                z4 = true;
            } else if (!strMo8114.startsWith("image/")) {
                continue;
            } else {
                if (z4) {
                    z = z4;
                    z2 = 1;
                    Main mainM319710 = c12915.m31979();
                    new C23225(this, mainM319710, arrayList, z, z2, c12915, arrayList, mainM319710).m53490();
                }
                i = 1;
            }
        }
        z = z4;
        z2 = i;
        Main mainM319711 = c12915.m31979();
        new C23225(this, mainM319711, arrayList, z, z2, c12915, arrayList, mainM319711).m53490();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46511(C20241 c20241, C12915 c12915, ArrayList arrayList) {
        String[] strArr = (String[]) C1170.stream(arrayList).map(new C7351(1)).toArray(new C11290());
        String[] strArr2 = (String[]) C1170.stream(arrayList).map(new C18285(1)).toArray(new C7338(1));
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C3087.class);
        c8458.m22728(c12915);
        c8458.m22722("oldNames", strArr);
        c8458.m22722("newNames", strArr2);
        c8458.m22719(MotionUtils.EASING_TYPE_PATH, c12915.m31978());
        c8458.m22714();
    }
}
