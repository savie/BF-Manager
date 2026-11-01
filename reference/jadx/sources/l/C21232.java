package l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48YG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21232 implements InterfaceC22644 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f69158 = new ArrayList(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView.BufferType f69159 = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f69160 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f69161;

    public C21232(Context context) {
        this.f69161 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47706(C16064 c16064) {
        this.f69158.add(c16064);
    }

    @Override // l.InterfaceC22644
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22644 mo47705(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8533 interfaceC8533 = (InterfaceC8533) it.next();
            interfaceC8533.getClass();
            this.f69158.add(interfaceC8533);
        }
        return this;
    }

    @Override // l.InterfaceC22644
    public final AbstractC14883 build() {
        ArrayList arrayList = this.f69158;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        ArrayList<InterfaceC8533> arrayListM5124 = new C1476(arrayList).m5124();
        C9490 c9490 = new C9490();
        C12536 c12536M40659 = C17474.m40659(this.f69161);
        C17704 c17704 = new C17704();
        C10650 c10650 = new C10650();
        C20527 c20527 = new C20527();
        for (InterfaceC8533 interfaceC8533 : arrayListM5124) {
            interfaceC8533.mo3309(c9490);
            interfaceC8533.mo1044(c12536M40659);
            interfaceC8533.mo1045(c17704);
            interfaceC8533.mo1043(c10650);
            interfaceC8533.mo3310(c20527);
        }
        C16999 c16999 = new C16999(c10650, c17704.m41246(c12536M40659.m31164(), c20527.m46312()));
        return new C7827(this.f69159, c9490.m24309(), c16999, C0561.unmodifiableList(arrayListM5124), this.f69160);
    }
}
