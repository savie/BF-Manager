package l;

import android.graphics.Canvas;
import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.util.Consumer;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: renamed from: l.ᩴܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19863 implements Consumer, InterfaceC18006, CanvasCompat.CanvasOperation {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63894;

    public /* synthetic */ C19863(Object obj) {
        this.f63894 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        ((LoadingDialog) this.f63894).lambda$new$1((CharSequence) obj);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        ((NavigationView) this.f63894).lambda$dispatchDraw$0(canvas);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ((ViewOnClickListenerC20698) this.f63894).m47364((String) obj);
    }
}
