package l;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13727 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f45248;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f45249;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f45250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC17026 f45251;

    public C13727(AbstractC17026 abstractC17026) {
        super(abstractC17026.getDispatchMode());
        this.f45249 = new HashMap();
        this.f45251 = abstractC17026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5259 m33427(WindowInsetsAnimation windowInsetsAnimation) {
        C5259 c5259 = (C5259) this.f45249.get(windowInsetsAnimation);
        if (c5259 != null) {
            return c5259;
        }
        C5259 c5259M14528 = C5259.m14528(windowInsetsAnimation);
        this.f45249.put(windowInsetsAnimation, c5259M14528);
        return c5259M14528;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f45251.onPrepare(m33427(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C12088 c12088OnStart = this.f45251.onStart(m33427(windowInsetsAnimation), C12088.m30078(bounds));
        c12088OnStart.getClass();
        C4553.m12695();
        return C2914.m8717(c12088OnStart.m30079().m33796(), c12088OnStart.m30080().m33796());
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f45248;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f45248 = arrayList2;
            this.f45250 = C0561.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                C5259 c5259M33427 = m33427(windowInsetsAnimation);
                c5259M33427.m14530(windowInsetsAnimation.getFraction());
                this.f45248.add(c5259M33427);
            } else {
                return this.f45251.onProgress(C15844.m37669(null, windowInsets), this.f45250).m37687();
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f45251.onEnd(m33427(windowInsetsAnimation));
        this.f45249.remove(windowInsetsAnimation);
    }
}
