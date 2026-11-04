package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC14242 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TextView f44995;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f44996;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC11499 f44997;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f44998;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ImageView f44999;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f45000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC2386 f45001;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC14242(ViewOnClickListenerC11499 viewOnClickListenerC11499, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewOnClickListenerC11499).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f44997 = viewOnClickListenerC11499;
        View viewFindViewById = this.itemView.findViewById(R.id.MT_Protector);
        C15243.m36591(viewFindViewById, "findViewById(...)");
        this.f44996 = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.MT_Protector);
        C15243.m36591(viewFindViewById2, "findViewById(...)");
        this.f44998 = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.icon);
        C15243.m36591(viewFindViewById3, "findViewById(...)");
        this.f44999 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.MT_Protector);
        C15243.m36591(viewFindViewById4, "findViewById(...)");
        this.f45000 = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.MT_Protector);
        C15243.m36591(viewFindViewById5, "findViewById(...)");
        this.f44995 = (TextView) viewFindViewById5;
        this.itemView.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m34569() {
        InterfaceC2386 interfaceC2386 = this.f45001;
        if (interfaceC2386 != null) {
            return interfaceC2386;
        }
        C15243.m36592("fileItem");
        throw null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final View m34568() {
        return this.f44996;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m34565() {
        return this.f44998;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ImageView m34566() {
        return this.f44999;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView m34567() {
        return this.f45000;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView m34570() {
        return this.f44995;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7495 c7495;
        ViewOnClickListenerC11499 viewOnClickListenerC11499 = this.f44997;
        C3072 c3072 = viewOnClickListenerC11499.f36173;
        if (c3072 == null) {
            C15243.m36592("swipeRefreshLayout");
            throw null;
        }
        if (c3072.m10026() || (c7495 = viewOnClickListenerC11499.f36186) == null) {
            return;
        }
        if (m34569().mo8092()) {
            viewOnClickListenerC11499.m28930();
            return;
        }
        if (m34569().isDirectory()) {
            C14307 c14307 = c7495.f24220.f28934;
            C15243.m36591(c14307, "backPositionMap");
            c14307.put(c7495.m20218(), Integer.valueOf(viewOnClickListenerC11499.f36178.m22356()));
            viewOnClickListenerC11499.m28903(C14483.m34972(m34569().getPath(), "/"), (InterfaceC19479) null);
            return;
        }
        int i = viewOnClickListenerC11499.f36180;
        if (i == 1) {
            String path = m34569().getPath();
            C15243.m36591(path, "getPath(...)");
            C22961.m51794(path, (C8877) null);
            String path2 = m34569().getPath();
            C15243.m36591(path2, "getPath(...)");
            viewOnClickListenerC11499.m28925(path2);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new RuntimeException();
            }
            if (m34569().mo8090()) {
                m34569().setChecked(!m34569().isChecked());
                ViewOnClickListenerC11499.m28913(viewOnClickListenerC11499, this);
                viewOnClickListenerC11499.m28962();
                return;
            }
            return;
        }
        String name = m34569().getName();
        C23255 c23255 = viewOnClickListenerC11499.f36191;
        if (c23255 == null) {
            C15243.m36592("filenameEditText");
            throw null;
        }
        c23255.mo52335((CharSequence) name);
        C15243.m36586((Object) name);
        int iM3583 = C0878.m3583(name);
        if (iM3583 == -1) {
            iM3583 = name.length();
        }
        C23255 c23256 = viewOnClickListenerC11499.f36191;
        if (c23256 == null) {
            C15243.m36592("filenameEditText");
            throw null;
        }
        c23256.mo52316(0, iM3583);
        C23255 c23257 = viewOnClickListenerC11499.f36191;
        if (c23257 == null) {
            C15243.m36592("filenameEditText");
            throw null;
        }
        C21576.m49076(c23257);
        viewOnClickListenerC11499.f36184 = getBindingAdapterPosition();
        viewOnClickListenerC11499.f36177 = System.currentTimeMillis() + ((long) 500);
    }
}
