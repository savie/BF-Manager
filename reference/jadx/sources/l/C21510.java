package l;

import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21510 implements InterfaceC19474, InterfaceC0073 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68741;

    public /* synthetic */ C21510(Object obj, Object obj2) {
        this.f68740 = obj;
        this.f68741 = obj2;
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo1127() {
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public void mo1128(String str) {
        C19272.m44610((C19272) this.f68740, (AbstractActivityC17204) this.f68741, str);
    }

    @Override // l.InterfaceC19474
    /* JADX INFO: renamed from: ۙ */
    public void mo12172(TextView textView, TextView textView2, Button button) {
        C9097 c9097 = (C9097) this.f68740;
        ArrayList arrayList = (ArrayList) this.f68741;
        textView.setText(c9097.m24241());
        textView2.setText(c9097.m24237());
        arrayList.add(button);
    }
}
