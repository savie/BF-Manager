package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17146 extends AbstractC9843 {
    public C17146() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986(b.k) && !c12915.m31988();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[LOOP:0: B:22:0x007e->B:24:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        int i;
        int length;
        final AbstractC18881 abstractC18881;
        Map mapM2199;
        final C20130 c20130;
        c12915.m31970(b.k);
        List listM31982 = c12915.m31982();
        if (listM31982.size() == 1) {
            final InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            String name = interfaceC2386.getName();
            boolean z = interfaceC2386.mo8090() && name.toLowerCase().endsWith(".bak");
            int length2 = interfaceC2386.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length2 == -1) {
                length2 = name.length();
            } else {
                if (name.toLowerCase().endsWith(".rename")) {
                    i = length2;
                    length = name.length();
                }
                abstractC18881 = (AbstractC18881) c12915.m31987().mo10174();
                boolean zMo20839 = abstractC18881.mo20839();
                mapM2199 = C0391.m2199(zMo20839);
                for (InterfaceC2386 interfaceC2387 : c12915.m31985()) {
                    mapM2199.put(interfaceC2387.getName(), Boolean.valueOf(interfaceC2387.isDirectory()));
                }
                c20130 = new C20130(c12915.m31979(), name, zMo20839, mapM2199, interfaceC2386, c12915, abstractC18881);
                c20130.m22945(R.string.MT_Protector);
                c20130.m22924((CharSequence) interfaceC2386.getName());
                c20130.m22957(6);
                c20130.m22918();
                c20130.m22920(i, length);
                if (z) {
                    c20130.m22921(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.᩷᩹۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            new C15654(interfaceC2386, c12915, abstractC18881, c20130).m8197();
                        }
                    }, (ViewOnLongClickListenerC1596) null);
                } else {
                    c20130.m22921(android.R.string.paste, new ViewOnClickListenerC5325(c20130, 0), new ViewOnLongClickListenerC1596(c20130));
                }
                c20130.m22955(!z);
                return;
            }
            length = length2;
            i = 0;
            abstractC18881 = (AbstractC18881) c12915.m31987().mo10174();
            boolean zMo208310 = abstractC18881.mo20839();
            mapM2199 = C0391.m2199(zMo208310);
            while (r1.hasNext()) {
                mapM2199.put(interfaceC2387.getName(), Boolean.valueOf(interfaceC2387.isDirectory()));
            }
            c20130 = new C20130(c12915.m31979(), name, zMo208310, mapM2199, interfaceC2386, c12915, abstractC18881);
            c20130.m22945(R.string.MT_Protector);
            c20130.m22924((CharSequence) interfaceC2386.getName());
            c20130.m22957(6);
            c20130.m22918();
            c20130.m22920(i, length);
            if (z) {
                c20130.m22921(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.᩷᩹۫
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        new C15654(interfaceC2386, c12915, abstractC18881, c20130).m8197();
                    }
                }, (ViewOnLongClickListenerC1596) null);
            } else {
                c20130.m22921(android.R.string.paste, new ViewOnClickListenerC5325(c20130, 0), new ViewOnLongClickListenerC1596(c20130));
            }
            c20130.m22955(!z);
            return;
        }
        ArrayList arrayList = new ArrayList(listM31982);
        Main mainM31979 = c12915.m31979();
        new C11925(this, mainM31979, arrayList, c12915, arrayList, mainM31979).m53490();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40287(C17146 c17146, C12915 c12915, ArrayList arrayList) {
        int i = 1;
        String[] strArr = (String[]) C1170.stream(arrayList).map(new C7351(i)).toArray(new C10664(1));
        String[] strArr2 = (String[]) C1170.stream(arrayList).map(new C18285(i)).toArray(new C0714(1));
        int i2 = C13678.f43415;
        C8458 c8458 = new C8458(C25352.class);
        c8458.m22728(c12915);
        c8458.m22724(c12915.m31987());
        c8458.m22722("oldNames", strArr);
        c8458.m22722("newNames", strArr2);
        c8458.m22719(MotionUtils.EASING_TYPE_PATH, c12915.m31978());
        c8458.m22714();
    }
}
