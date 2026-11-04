package l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 48YG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8184 implements InterfaceC18625 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f27001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f27002 = new ArrayList(3);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView.BufferType f26999 = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f27000 = true;

    public C8184(Context context) {
        this.f27001 = context;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22097(C4981 c4981) {
        this.f27002.add(c4981);
    }

    @Override // l.InterfaceC18625
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18625 mo22096(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2963 interfaceC2963 = (InterfaceC2963) it.next();
            interfaceC2963.getClass();
            this.f27002.add(interfaceC2963);
        }
        return this;
    }

    @Override // l.InterfaceC18625
    public final AbstractC0726 build() {
        ArrayList arrayList = this.f27002;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        ArrayList<InterfaceC2963> arrayListM56392 = new C25251(arrayList).m56392();
        C11991 c11991 = new C11991();
        C19897 c19897M36925 = C15421.m36925(this.f27001);
        C19371 c19371 = new C19371();
        C5859 c5859 = new C5859();
        C14149 c14149 = new C14149();
        for (InterfaceC2963 interfaceC2963 : arrayListM56392) {
            interfaceC2963.mo9656(c11991);
            interfaceC2963.mo2600(c19897M36925);
            interfaceC2963.mo8845(c19371);
            interfaceC2963.mo8843(c5859);
            interfaceC2963.mo9654(c14149);
        }
        C15553 c15553 = new C15553(c5859, c19371.m44804(c19897M36925.m45818(), c14149.m34369()));
        return new C1472(this.f26999, c11991.m30140(), c15553, C4681.unmodifiableList(arrayListM56392), this.f27000);
    }
}
