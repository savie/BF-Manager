package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;
import bin.mt.plus.R;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes.dex */
public final class C0671 {

    /* JADX INFO: renamed from: ۨ᩵ܽ, reason: not valid java name and contains not printable characters */
    public static int f2816;

    /* JADX INFO: renamed from: ۖ֨ۨ, reason: not valid java name and contains not printable characters */
    public static C21136 m2998(Object obj) {
        return ((ActivityC20431) obj).f66235;
    }

    /* JADX INFO: renamed from: ۛᩳۚ, reason: not valid java name and contains not printable characters */
    public static int m3004(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ۛ᩵ۨ, reason: not valid java name and contains not printable characters */
    public static int m3005(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ۟ܳۙ, reason: not valid java name and contains not printable characters */
    public static String m3006() {
        return C1709.m5696();
    }

    /* JADX INFO: renamed from: ۢۘ۟, reason: not valid java name and contains not printable characters */
    public static void m3007(Object obj) {
        ((Lock) obj).unlock();
    }

    /* JADX INFO: renamed from: ۤܶܰ, reason: not valid java name and contains not printable characters */
    public static int m3008() {
        return -1175865780;
    }

    /* JADX INFO: renamed from: ۤ᩺ۢ, reason: not valid java name and contains not printable characters */
    public static String m3009(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨܽۜ, reason: not valid java name and contains not printable characters */
    public static int m3011(Object obj) {
        return ((C6111) obj).m16978();
    }

    /* JADX INFO: renamed from: ۬ᩴ֫, reason: not valid java name and contains not printable characters */
    public static int m3012(Object obj) {
        return ((C17367) obj).m40462();
    }

    /* JADX INFO: renamed from: ܳۖۜ, reason: not valid java name and contains not printable characters */
    public static void m3015(Object obj, Object obj2) {
        ((C8067) obj).m21261((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܳܽܽ, reason: not valid java name and contains not printable characters */
    public static void m3016(Object obj, Object obj2) {
        ((AbstractC3492) obj).m10245((AbstractActivityC12483) obj2);
    }

    /* JADX INFO: renamed from: ܶܰۛ, reason: not valid java name and contains not printable characters */
    public static String m3017(int i) {
        return C16737.m39288(i);
    }

    /* JADX INFO: renamed from: ᩵۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3018(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩷ۜ᩹, reason: not valid java name and contains not printable characters */
    public static void m3019(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC12483) obj).m31002((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ᩹ᩳ֫, reason: not valid java name and contains not printable characters */
    public static String m3020(Object obj) {
        return ((InterfaceC19133) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ᩺֨ۚ, reason: not valid java name and contains not printable characters */
    public static String m3021(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16195 m3001(View view) {
        Context context = view.getContext();
        ViewParent parent = view.getParent();
        if (parent instanceof C22815) {
            C22815 c22815 = (C22815) parent;
            context = c22815.getContext();
            int iM50507 = c22815.m50507();
            if (iM50507 != 0) {
                context = new C5716(context, iM50507);
            }
        }
        return new C16195(context, view, 8388611, R.attr.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3002(C16195 c16195, String str, View view) {
        C17356.m40382(c16195.m38298(), str);
        C2269 c2269 = c16195.f52293;
        C18498.m42893(c2269);
        ListView listViewMo17704 = !c2269.m6953() ? null : c2269.m6962().mo17704();
        if (listViewMo17704 == null || m3014(listViewMo17704, view)) {
            return;
        }
        listViewMo17704.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC20428(listViewMo17704, view));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m3014(ListView listView, View view) {
        if (listView.getFirstVisiblePosition() == 0) {
            View childAt = listView.getChildAt(0);
            View viewFindViewById = childAt == null ? null : childAt.findViewById(android.R.id.title);
            if (viewFindViewById != null) {
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) parent;
                    ViewParent parent2 = view.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    frameLayout.removeAllViews();
                    frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setForeground(C15945.m37904(frameLayout.getContext(), R.drawable.MT_Protector));
                    frameLayout.setForegroundGravity(87);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2269 m3000(C16195 c16195) {
        return c16195.f52293;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m3010(C16195 c16195) {
        try {
            AbstractC13560 abstractC13560M6962 = c16195.f52293.m6962();
            Field declaredField = Class.forName("l.᩸ۘ").getDeclaredField("mAdapter");
            declaredField.setAccessible(true);
            C20179 c20179 = (C20179) declaredField.get(abstractC13560M6962);
            Field declaredField2 = C20179.class.getDeclaredField("۫");
            declaredField2.setAccessible(true);
            declaredField2.setInt(c20179, R.layout.MT_Protector);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m3013(C16195 c16195) {
        try {
            C18498.m42892(c16195.f52293.m6962());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ListView m2999(C19723 c19723) {
        return c19723.f23605;
    }
}
