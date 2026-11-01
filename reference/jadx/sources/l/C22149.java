package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes.dex */
public final class C22149 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23935 f72452;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public View f72454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f72455;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23935 f72456;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f72457;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ProgressBar f72458;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5444 f72459;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7931 f72453 = new C7931();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72460 = R.string.MT_Protector;

    public C22149(Main main) {
        this.f72455 = main;
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        C5444 c5444 = (C5444) viewM30995.findViewById(R.id.MT_Protector);
        this.f72459 = c5444;
        this.f72458 = (ProgressBar) c5444.findViewById(R.id.MT_Protector);
        this.f72456 = (C23935) c5444.findViewById(R.id.MT_Protector);
        this.f72452 = (C23935) c5444.findViewById(R.id.MT_Protector);
        this.f72454 = c5444.findViewById(R.id.MT_Protector);
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        this.f72457 = c8067BuildDialog.m21252();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m49140() {
        this.f72458.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m49139() {
        this.f72458.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3181 m49161(int i) {
        Object obj = this.f72453.get(i);
        if (obj instanceof C3181) {
            return (C3181) obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49154(InterfaceC17295 interfaceC17295) {
        Object obj = this.f72453.get(R.string.MT_Protector);
        if (obj instanceof C3181) {
            interfaceC17295.accept((C3181) obj);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m49158(InterfaceC17295 interfaceC17295) {
        Object obj = this.f72453.get(R.string.MT_Protector);
        if (obj instanceof C2392) {
            interfaceC17295.accept((C2392) obj);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49163(InterfaceC17295 interfaceC17295) {
        Object obj = this.f72453.get(R.string.MT_Protector);
        if (obj instanceof C13683) {
            interfaceC17295.accept((C13683) obj);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3181 m49143(int i, InterfaceC4509 interfaceC4509) {
        C7931 c7931 = this.f72453;
        if (c7931.mo8945(i)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f72455;
        TextView textView = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        int i2 = this.f72460;
        this.f72460 = i2 + 1;
        textView.setId(i2);
        int i3 = this.f72460;
        this.f72460 = i3 + 1;
        textView2.setId(i3);
        textView.setText(i);
        C11795 c11795 = new C11795(-2);
        c11795.f39608 = textView2.getId();
        c11795.f39651 = 0;
        C5444 c5444 = this.f72459;
        c5444.addView(textView, c11795);
        C11795 c11796 = new C11795(0);
        c11796.setMarginStart(C13932.m33769(8.0f));
        ((ViewGroup.MarginLayoutParams) c11796).topMargin = C13932.m33769(this.f72454.getId() == R.id.MT_Protector ? 0 : 1);
        c11796.f39644 = 0;
        c11796.f39639 = R.id.MT_Protector;
        c11796.f39599 = this.f72454.getId();
        c5444.addView(textView2, c11796);
        this.f72456.m10197(textView);
        C3181 c3181 = new C3181(textView, textView2);
        c7931.mo8944(i, c3181);
        this.f72454 = textView2;
        if (interfaceC4509 != null) {
            interfaceC4509.mo4354(textView2);
        }
        return c3181;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2392 m49141(InterfaceC5215 interfaceC5215) {
        C7931 c7931 = this.f72453;
        if (c7931.mo8945(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f72455;
        TextView textView = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC12483.m30995(R.layout.MT_Protector);
        int i = this.f72460;
        this.f72460 = i + 1;
        textView.setId(i);
        int i2 = this.f72460;
        this.f72460 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f72460;
        this.f72460 = i3 + 1;
        button.setId(i3);
        textView.setText(R.string.MT_Protector);
        C11795 c11795 = new C11795(-2);
        c11795.f39608 = textView2.getId();
        c11795.f39651 = 0;
        C5444 c5444 = this.f72459;
        c5444.addView(textView, c11795);
        C11795 c11796 = new C11795(-2);
        c11796.setMarginStart(C13932.m33769(8.0f));
        c11796.f39639 = R.id.MT_Protector;
        c11796.f39641 = button.getId();
        c11796.f39633 = button.getId();
        c5444.addView(textView2, c11796);
        C11795 c11797 = new C11795(-2);
        c11797.setMarginStart(C13932.m33769(4.0f));
        ((ViewGroup.MarginLayoutParams) c11797).topMargin = C13932.m33769(this.f72454.getId() == R.id.MT_Protector ? 0 : 1);
        c11797.f39639 = R.id.MT_Protector;
        c11797.f39599 = this.f72454.getId();
        c5444.addView(button, c11797);
        this.f72456.m10197(textView);
        this.f72452.m10197(textView2);
        C2392 c2392 = new C2392(textView, textView2, button);
        c7931.mo8944(R.string.MT_Protector, c2392);
        this.f72454 = button;
        interfaceC5215.mo5013(textView2, button);
        return c2392;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13683 m49146(InterfaceC11566 interfaceC11566) {
        C7931 c7931 = this.f72453;
        if (c7931.mo8945(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f72455;
        TextView textView = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView3 = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        TextView textView4 = (TextView) abstractActivityC12483.m30995(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC12483.m30995(R.layout.MT_Protector);
        int i = this.f72460;
        this.f72460 = i + 1;
        textView.setId(i);
        int i2 = this.f72460;
        this.f72460 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f72460;
        this.f72460 = i3 + 1;
        textView3.setId(i3);
        int i4 = this.f72460;
        this.f72460 = i4 + 1;
        textView4.setId(i4);
        int i5 = this.f72460;
        this.f72460 = i5 + 1;
        button.setId(i5);
        textView.setText(R.string.MT_Protector);
        C11795 c11795 = new C11795(-2);
        c11795.f39608 = textView3.getId();
        c11795.f39651 = 0;
        C5444 c5444 = this.f72459;
        c5444.addView(textView, c11795);
        C11795 c11796 = new C11795(-2);
        c11796.setMarginStart(C13932.m33769(8.0f));
        ((ViewGroup.MarginLayoutParams) c11796).topMargin = C13932.m33769(this.f72454.getId() == R.id.MT_Protector ? 0 : 1);
        c11796.f39639 = R.id.MT_Protector;
        c11796.f39599 = this.f72454.getId();
        c5444.addView(textView3, c11796);
        textView2.setText(R.string.MT_Protector);
        C11795 c11797 = new C11795(-2);
        c11797.f39608 = textView4.getId();
        c11797.f39651 = 0;
        c5444.addView(textView2, c11797);
        C11795 c11798 = new C11795(-2);
        c11798.setMarginStart(C13932.m33769(8.0f));
        ((ViewGroup.MarginLayoutParams) c11798).topMargin = C13932.m33769(1.0f);
        c11798.f39639 = R.id.MT_Protector;
        c11798.f39599 = textView3.getId();
        c5444.addView(textView4, c11798);
        C11795 c11799 = new C11795(-2);
        c11799.setMarginStart(C13932.m33769(4.0f));
        c11799.f39639 = R.id.MT_Protector;
        c11799.f39641 = textView3.getId();
        c11799.f39633 = textView4.getId();
        c5444.addView(button, c11799);
        C23935 c23935 = this.f72456;
        c23935.m10197(textView);
        c23935.m10197(textView2);
        C23935 c23936 = this.f72452;
        c23936.m10197(textView3);
        c23936.m10197(textView4);
        C13683 c13683 = new C13683(textView, textView3, textView2, textView4, button);
        c7931.mo8944(R.string.MT_Protector, c13683);
        this.f72454 = textView4;
        interfaceC11566.mo5406(textView3, textView4, button);
        return c13683;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m49138() {
        this.f72457.m44365(-1, this.f72455.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m49155() {
        this.f72457.m44365(-2, this.f72455.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m49164() {
        this.f72457.m44365(-3, this.f72455.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m49159() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f72457;
        dialogInterfaceC19356.m44362();
        C23250.m51309(dialogInterfaceC19356);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49147() {
        this.f72457.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49149(DialogInterface.OnDismissListener onDismissListener) {
        this.f72457.m44367(onDismissListener);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Button m49160() {
        return this.f72457.m44374();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Button m49156() {
        return this.f72457.m44361();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3181 m49142(int i, String str) {
        return m49143(i, new C4328(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49152(List list) {
        m49143(R.string.MT_Protector, new C1188(list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49151(String str, ViewOnLongClickListenerC10944 viewOnLongClickListenerC10944) {
        m49143(R.string.MT_Protector, new C14472(str, viewOnLongClickListenerC10944));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49150(String str, View.OnLongClickListener onLongClickListener) {
        m49143(R.string.MT_Protector, new C8811(str, onLongClickListener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnLongClickListener, l.ۧۤ᩹] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49153(final C15404 c15404) {
        ?? r0 = new View.OnLongClickListener() { // from class: l.ۧۤ᩹
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C16737.m39266(R.string.MT_Protector, c15404.getPath());
                return true;
            }
        };
        m49151(C13012.m32189(500, c15404.getName()), (ViewOnLongClickListenerC10944) r0);
        m49150(C13012.m32189(500, c15404.getParent()), (View.OnLongClickListener) r0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49148(final int i) {
        m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.֫ۤ᩹
            @Override // l.InterfaceC4509
            /* JADX INFO: renamed from: ۙ */
            public final void mo4354(TextView textView) {
                textView.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3181 m49157(long j) {
        return m49143(R.string.MT_Protector, new C23644(0, j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3181 m49144(long j) {
        return m49143(R.string.MT_Protector, new C22219(j));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3181 m49162(long j) {
        return m49142(R.string.MT_Protector, C5319.m14744(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3181 m49145(String str, View.OnClickListener onClickListener) {
        return m49143(R.string.MT_Protector, new C23312(1, onClickListener, str));
    }
}
