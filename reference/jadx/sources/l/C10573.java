package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10573 extends AbstractC4674 {
    public C10573() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974(b.k) && !c21422.m47977();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[LOOP:0: B:22:0x007e->B:24:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        int i;
        int length;
        final AbstractC12233 abstractC12233;
        Map mapM39768;
        final C15512 c15512;
        c21422.m47963(b.k);
        List listM47979 = c21422.m47979();
        if (listM47979.size() == 1) {
            final InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            String name = interfaceC2557.getName();
            boolean z = interfaceC2557.mo7985() && name.toLowerCase().endsWith(".bak");
            int length2 = interfaceC2557.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length2 == -1) {
                length2 = name.length();
            } else {
                if (name.toLowerCase().endsWith(".rename")) {
                    i = length2;
                    length = name.length();
                }
                abstractC12233 = (AbstractC12233) c21422.m47960().mo13029();
                boolean zMo24615 = abstractC12233.mo24615();
                mapM39768 = C16982.m39768(zMo24615);
                for (InterfaceC2557 interfaceC2558 : c21422.m47973()) {
                    mapM39768.put(interfaceC2558.getName(), Boolean.valueOf(interfaceC2558.isDirectory()));
                }
                c15512 = new C15512(c21422.m47980(), name, zMo24615, mapM39768, interfaceC2557, c21422, abstractC12233);
                c15512.m40376(R.string.MT_Protector);
                c15512.m40346((CharSequence) interfaceC2557.getName());
                c15512.m40336(6);
                c15512.m40340();
                c15512.m40342(i, length);
                if (z) {
                    c15512.m40343(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.۬᩹֨
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            new C21861(interfaceC2557, c21422, abstractC12233, c15512).m10243();
                        }
                    }, (ViewOnLongClickListenerC0856) null);
                } else {
                    c15512.m40343(android.R.string.paste, new ViewOnClickListenerC7626(2, c15512), new ViewOnLongClickListenerC0856(c15512));
                }
                c15512.m40368(!z);
                return;
            }
            length = length2;
            i = 0;
            abstractC12233 = (AbstractC12233) c21422.m47960().mo13029();
            boolean zMo24616 = abstractC12233.mo24615();
            mapM39768 = C16982.m39768(zMo24616);
            while (r1.hasNext()) {
                mapM39768.put(interfaceC2558.getName(), Boolean.valueOf(interfaceC2558.isDirectory()));
            }
            c15512 = new C15512(c21422.m47980(), name, zMo24616, mapM39768, interfaceC2557, c21422, abstractC12233);
            c15512.m40376(R.string.MT_Protector);
            c15512.m40346((CharSequence) interfaceC2557.getName());
            c15512.m40336(6);
            c15512.m40340();
            c15512.m40342(i, length);
            if (z) {
                c15512.m40343(R.string.MT_Protector, new View.OnClickListener(this) { // from class: l.۬᩹֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        new C21861(interfaceC2557, c21422, abstractC12233, c15512).m10243();
                    }
                }, (ViewOnLongClickListenerC0856) null);
            } else {
                c15512.m40343(android.R.string.paste, new ViewOnClickListenerC7626(2, c15512), new ViewOnLongClickListenerC0856(c15512));
            }
            c15512.m40368(!z);
            return;
        }
        ArrayList arrayList = new ArrayList(listM47979);
        Main mainM47980 = c21422.m47980();
        new C19745(this, mainM47980, arrayList, c21422, arrayList, mainM47980).m22699();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26742(C10573 c10573, C21422 c21422, ArrayList arrayList) {
        int i = 1;
        String[] strArr = (String[]) C9030.stream(arrayList).map(new C18663(i)).toArray(new C19314(1));
        String[] strArr2 = (String[]) C9030.stream(arrayList).map(new C6072(i)).toArray(new C20646(1));
        int i2 = C20725.f67443;
        C10142 c10142 = new C10142(C9162.class);
        c10142.m25777(c21422);
        c10142.m25773(c21422.m47960());
        c10142.m25771("oldNames", strArr);
        c10142.m25771("newNames", strArr2);
        c10142.m25768(MotionUtils.EASING_TYPE_PATH, c21422.m47959());
        c10142.m25763();
    }
}
