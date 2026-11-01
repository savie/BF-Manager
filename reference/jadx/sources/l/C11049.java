package l;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: l.ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11049 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27868(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27870(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27867(View view) {
        view.cancelDragAndDrop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27869(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m27871(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m27872(View view) {
        view.dispatchFinishTemporaryDetach();
    }
}
