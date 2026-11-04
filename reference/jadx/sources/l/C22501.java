package l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5304 f72798;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2559 f72799;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f72800;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8614 f72801;

    public C22501(C8614 c8614, List list) {
        this.f72801 = c8614;
        this.f72800 = list;
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        this.f72798 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50741(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.isDirectory() || !(interfaceC2386 instanceof C2559)) {
            throw new IllegalArgumentException();
        }
        C2559 c2559 = (C2559) interfaceC2386;
        this.f72799 = c2559;
        C5304 c5304 = this.f72798;
        c5304.m15919(c2559);
        c5304.m15913(c2559.mo8107() ? R.string.MT_Protector : R.string.MT_Protector);
        c5304.m15922(c2559.getSize());
        c5304.m15929(c2559.getTime());
        C9097 c9097Mo5155 = c2559.mo5155();
        if (c9097Mo5155 != null) {
            c5304.m15906(new C24159(c9097Mo5155)).m36104(6);
            String strM24241 = c9097Mo5155.m24241();
            String strM24237 = c9097Mo5155.m24237();
            if (!TextUtils.isEmpty(strM24241) || !TextUtils.isEmpty(strM24237)) {
                c5304.m15911(new C3745(strM24241, strM24237)).m50629();
            }
        }
        if (c2559.mo8107()) {
            c5304.m15910(c2559.mo8112(), (View.OnClickListener) null).m49281(6);
        }
        c5304.m15926();
        c5304.m15920();
        C10060.m26010(c5304.m15927(), this.f72801, c2559);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50742(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090() || !(interfaceC2386 instanceof C2559)) {
            throw new IllegalArgumentException();
        }
        C2559 c2559 = (C2559) interfaceC2386;
        this.f72799 = c2559;
        C5304 c5304 = this.f72798;
        c5304.m15919(c2559);
        c5304.m15913(c2559.mo8107() ? R.string.MT_Protector : R.string.MT_Protector);
        c5304.m15922(c2559.getSize());
        c5304.m15929(c2559.getTime());
        C9097 c9097Mo5155 = c2559.mo5155();
        if (c9097Mo5155 != null) {
            c5304.m15906(new C19301(c9097Mo5155)).m36104(6);
            String strM24241 = c9097Mo5155.m24241();
            String strM24237 = c9097Mo5155.m24237();
            if (!TextUtils.isEmpty(strM24241) || !TextUtils.isEmpty(strM24237)) {
                c5304.m15911(new C4601(strM24241, strM24237)).m50629();
            }
        }
        if (c2559.mo8107()) {
            c5304.m15910(c2559.mo8112(), (View.OnClickListener) null).m49281(6);
        }
        c5304.m15908(R.string.MT_Protector, new C6259(this)).m49281(8);
        c5304.m15920();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50740(String str) {
        C5304 c5304 = this.f72798;
        List list = this.f72800;
        c5304.m15917(list);
        c5304.m15915(str, new View.OnLongClickListener() { // from class: l.۠ۡ۫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C22501.m50735(this.f27854);
                return true;
            }
        });
        Iterator it = list.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC2386) it.next()).getSize();
        }
        c5304.m15922(size);
        c5304.m15908(R.string.MT_Protector, new C8114(this)).m49281(8);
        c5304.m15920();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50734(AbstractC7629 abstractC7629, List list, TextView textView, TextView textView2) {
        textView.setText("...");
        textView2.setText("...");
        C5261.f18540.submit(new RunnableC20928(list, textView, textView2, abstractC7629, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50735(C22501 c22501) {
        C2559 c2559 = c22501.f72799;
        if (c2559 != null) {
            C21576.m49061(R.string.MT_Protector, c2559.getPath());
        }
    }
}
