package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC10866 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ImageView f36946;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f36947;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f36948;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f36949;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f36950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f36951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC2557 f36952;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10866(ViewOnClickListenerC8374 viewOnClickListenerC8374, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewOnClickListenerC8374).inflate(R.layout.MT_Protector, viewGroup, false));
        this.f36947 = viewOnClickListenerC8374;
        View viewFindViewById = this.itemView.findViewById(R.id.MT_Protector);
        C13465.m32967(viewFindViewById, "findViewById(...)");
        this.f36948 = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.MT_Protector);
        C13465.m32967(viewFindViewById2, "findViewById(...)");
        this.f36949 = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.icon);
        C13465.m32967(viewFindViewById3, "findViewById(...)");
        this.f36946 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.MT_Protector);
        C13465.m32967(viewFindViewById4, "findViewById(...)");
        this.f36951 = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.MT_Protector);
        C13465.m32967(viewFindViewById5, "findViewById(...)");
        this.f36950 = (TextView) viewFindViewById5;
        this.itemView.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m27224() {
        InterfaceC2557 interfaceC2557 = this.f36952;
        if (interfaceC2557 != null) {
            return interfaceC2557;
        }
        C13465.m32968("fileItem");
        throw null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View m27222() {
        return this.f36948;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m27221() {
        return this.f36949;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ImageView m27223() {
        return this.f36946;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView m27225() {
        return this.f36951;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView m27220() {
        return this.f36950;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C11672 c11672;
        ViewOnClickListenerC8374 viewOnClickListenerC8374 = this.f36947;
        C6018 c6018 = viewOnClickListenerC8374.f29078;
        if (c6018 == null) {
            C13465.m32968("swipeRefreshLayout");
            throw null;
        }
        if (c6018.m16340() || (c11672 = viewOnClickListenerC8374.f29060) == null) {
            return;
        }
        if (m27224().mo7969()) {
            viewOnClickListenerC8374.m21914();
            return;
        }
        if (m27224().isDirectory()) {
            C21445 c21445 = c11672.f38589.f44775;
            C13465.m32967(c21445, "backPositionMap");
            c21445.put(c11672.m28629(), Integer.valueOf(viewOnClickListenerC8374.f29051.m8333()));
            viewOnClickListenerC8374.m21931(C15489.m37076(m27224().getPath(), "/"), (InterfaceC4871) null);
            return;
        }
        int i = viewOnClickListenerC8374.f29065;
        if (i == 1) {
            String path = m27224().getPath();
            C13465.m32967(path, "getPath(...)");
            C23186.m51183(path, (C5546) null);
            String path2 = m27224().getPath();
            C13465.m32967(path2, "getPath(...)");
            viewOnClickListenerC8374.m21959(path2);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new RuntimeException();
            }
            if (m27224().mo7985()) {
                m27224().setChecked(!m27224().isChecked());
                ViewOnClickListenerC8374.m21941(viewOnClickListenerC8374, this);
                viewOnClickListenerC8374.m21985();
                return;
            }
            return;
        }
        String name = m27224().getName();
        EditText editText = viewOnClickListenerC8374.f29066;
        if (editText == null) {
            C13465.m32968("filenameEditText");
            throw null;
        }
        editText.setText(name);
        C13465.m32962((Object) name);
        int iM31144 = C12529.m31144(name);
        if (iM31144 == -1) {
            iM31144 = name.length();
        }
        EditText editText2 = viewOnClickListenerC8374.f29066;
        if (editText2 == null) {
            C13465.m32968("filenameEditText");
            throw null;
        }
        editText2.setSelection(0, iM31144);
        EditText editText3 = viewOnClickListenerC8374.f29066;
        if (editText3 == null) {
            C13465.m32968("filenameEditText");
            throw null;
        }
        C16737.m39284(editText3);
        viewOnClickListenerC8374.f29072 = getBindingAdapterPosition();
        viewOnClickListenerC8374.f29059 = System.currentTimeMillis() + ((long) 500);
    }
}
