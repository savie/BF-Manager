package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plugin.api.ui.dialog.BaseCancelableDialog;
import bin.mt.plugin.api.util.Consumer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G55Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9576 implements InterfaceC7359, InterfaceC11955, InterfaceC4509, Consumer, InterfaceC3740 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m24439(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24440(StringBuilder sb, int i) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        ((BaseCancelableDialog) obj).dismiss();
    }

    @Override // l.InterfaceC11955
    public Object apply(Object obj) {
        return Long.valueOf(((C17513) obj).f55685);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC10430) obj).getClass();
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ */
    public void mo4354(TextView textView) {
        textView.setText("0");
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        return new ArrayList();
    }
}
