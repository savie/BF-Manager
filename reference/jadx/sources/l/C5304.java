package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98EM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View f18676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f18677;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f18678;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f18679;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10905 f18680;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10905 f18682;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16872 f18683;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19327 f18684 = new C19327();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f18681 = R.string.MT_Protector;

    public C5304(Main main) {
        this.f18677 = main;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        C16872 c16872 = (C16872) viewM40395.findViewById(R.id.MT_Protector);
        this.f18683 = c16872;
        this.f18678 = (ProgressBar) c16872.findViewById(R.id.MT_Protector);
        this.f18682 = (C10905) c16872.findViewById(R.id.MT_Protector);
        this.f18680 = (C10905) c16872.findViewById(R.id.MT_Protector);
        this.f18676 = c16872.findViewById(R.id.MT_Protector);
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        this.f18679 = c2361BuildDialog.m7999();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15905() {
        this.f18678.setVisibility(0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m15931() {
        this.f18678.setVisibility(8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21712 m15928(int i) {
        Object obj = this.f18684.get(i);
        if (obj instanceof C21712) {
            return (C21712) obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15918(InterfaceC0818 interfaceC0818) {
        Object obj = this.f18684.get(R.string.MT_Protector);
        if (obj instanceof C21712) {
            interfaceC0818.accept((C21712) obj);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m15923(InterfaceC0818 interfaceC0818) {
        Object obj = this.f18684.get(R.string.MT_Protector);
        if (obj instanceof C14998) {
            interfaceC0818.accept((C14998) obj);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15930(InterfaceC0818 interfaceC0818) {
        Object obj = this.f18684.get(R.string.MT_Protector);
        if (obj instanceof C22458) {
            interfaceC0818.accept((C22458) obj);
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
    public final C21712 m15908(int i, InterfaceC10523 interfaceC10523) {
        C19327 c19327 = this.f18684;
        if (c19327.mo13467(i)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f18677;
        TextView textView = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        int i2 = this.f18681;
        this.f18681 = i2 + 1;
        textView.setId(i2);
        int i3 = this.f18681;
        this.f18681 = i3 + 1;
        textView2.setId(i3);
        textView.setText(i);
        C11651 c11651 = new C11651(-2);
        c11651.f37703 = textView2.getId();
        c11651.f37745 = 0;
        C16872 c16872 = this.f18683;
        c16872.addView(textView, c11651);
        C11651 c11652 = new C11651(0);
        c11652.setMarginStart(C6907.m19160(8.0f));
        ((ViewGroup.MarginLayoutParams) c11652).topMargin = C6907.m19160(this.f18676.getId() == R.id.MT_Protector ? 0 : 1);
        c11652.f37730 = 0;
        c11652.f37727 = R.id.MT_Protector;
        c11652.f37737 = this.f18676.getId();
        c16872.addView(textView2, c11652);
        this.f18682.m32669(textView);
        C21712 c21712 = new C21712(textView, textView2);
        c19327.mo13466(i, c21712);
        this.f18676 = textView2;
        if (interfaceC10523 != null) {
            interfaceC10523.accept(textView2);
        }
        return c21712;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14998 m15906(InterfaceC12761 interfaceC12761) {
        C19327 c19327 = this.f18684;
        if (c19327.mo13467(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f18677;
        TextView textView = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC17204.m40395(R.layout.MT_Protector);
        int i = this.f18681;
        this.f18681 = i + 1;
        textView.setId(i);
        int i2 = this.f18681;
        this.f18681 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f18681;
        this.f18681 = i3 + 1;
        button.setId(i3);
        textView.setText(R.string.MT_Protector);
        C11651 c11651 = new C11651(-2);
        c11651.f37703 = textView2.getId();
        c11651.f37745 = 0;
        C16872 c16872 = this.f18683;
        c16872.addView(textView, c11651);
        C11651 c11652 = new C11651(-2);
        c11652.setMarginStart(C6907.m19160(8.0f));
        c11652.f37727 = R.id.MT_Protector;
        c11652.f37693 = button.getId();
        c11652.f37746 = button.getId();
        c16872.addView(textView2, c11652);
        C11651 c11653 = new C11651(-2);
        c11653.setMarginStart(C6907.m19160(4.0f));
        ((ViewGroup.MarginLayoutParams) c11653).topMargin = C6907.m19160(this.f18676.getId() == R.id.MT_Protector ? 0 : 1);
        c11653.f37727 = R.id.MT_Protector;
        c11653.f37737 = this.f18676.getId();
        c16872.addView(button, c11653);
        this.f18682.m32669(textView);
        this.f18680.m32669(textView2);
        C14998 c14998 = new C14998(textView, textView2, button);
        c19327.mo13466(R.string.MT_Protector, c14998);
        this.f18676 = button;
        interfaceC12761.mo19441(textView2, button);
        return c14998;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22458 m15911(InterfaceC19474 interfaceC19474) {
        C19327 c19327 = this.f18684;
        if (c19327.mo13467(R.string.MT_Protector)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f18677;
        TextView textView = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView2 = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView3 = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        TextView textView4 = (TextView) abstractActivityC17204.m40395(R.layout.MT_Protector);
        Button button = (Button) abstractActivityC17204.m40395(R.layout.MT_Protector);
        int i = this.f18681;
        this.f18681 = i + 1;
        textView.setId(i);
        int i2 = this.f18681;
        this.f18681 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f18681;
        this.f18681 = i3 + 1;
        textView3.setId(i3);
        int i4 = this.f18681;
        this.f18681 = i4 + 1;
        textView4.setId(i4);
        int i5 = this.f18681;
        this.f18681 = i5 + 1;
        button.setId(i5);
        textView.setText(R.string.MT_Protector);
        C11651 c11651 = new C11651(-2);
        c11651.f37703 = textView3.getId();
        c11651.f37745 = 0;
        C16872 c16872 = this.f18683;
        c16872.addView(textView, c11651);
        C11651 c11652 = new C11651(-2);
        c11652.setMarginStart(C6907.m19160(8.0f));
        ((ViewGroup.MarginLayoutParams) c11652).topMargin = C6907.m19160(this.f18676.getId() == R.id.MT_Protector ? 0 : 1);
        c11652.f37727 = R.id.MT_Protector;
        c11652.f37737 = this.f18676.getId();
        c16872.addView(textView3, c11652);
        textView2.setText(R.string.MT_Protector);
        C11651 c11653 = new C11651(-2);
        c11653.f37703 = textView4.getId();
        c11653.f37745 = 0;
        c16872.addView(textView2, c11653);
        C11651 c11654 = new C11651(-2);
        c11654.setMarginStart(C6907.m19160(8.0f));
        ((ViewGroup.MarginLayoutParams) c11654).topMargin = C6907.m19160(1.0f);
        c11654.f37727 = R.id.MT_Protector;
        c11654.f37737 = textView3.getId();
        c16872.addView(textView4, c11654);
        C11651 c11655 = new C11651(-2);
        c11655.setMarginStart(C6907.m19160(4.0f));
        c11655.f37727 = R.id.MT_Protector;
        c11655.f37693 = textView3.getId();
        c11655.f37746 = textView4.getId();
        c16872.addView(button, c11655);
        C10905 c10905 = this.f18682;
        c10905.m32669(textView);
        c10905.m32669(textView2);
        C10905 c10906 = this.f18680;
        c10906.m32669(textView3);
        c10906.m32669(textView4);
        C22458 c22458 = new C22458(textView, textView3, textView2, textView4, button);
        c19327.mo13466(R.string.MT_Protector, c22458);
        this.f18676 = textView4;
        interfaceC19474.mo12172(textView3, textView4, button);
        return c22458;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m15924() {
        this.f18679.m22424(-1, this.f18677.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m15926() {
        this.f18679.m22424(-2, this.f18677.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15925() {
        this.f18679.m22424(-3, this.f18677.getString(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m15920() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f18679;
        dialogInterfaceC8327.m22432();
        C5416.m16144(dialogInterfaceC8327);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15912() {
        this.f18679.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15914(DialogInterface.OnDismissListener onDismissListener) {
        this.f18679.m22426(onDismissListener);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Button m15927() {
        return this.f18679.m22433();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Button m15921() {
        return this.f18679.m22440();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21712 m15907(int i, String str) {
        return m15908(i, new C10912(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15917(List list) {
        m15908(R.string.MT_Protector, new C18136(list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15916(String str, ViewOnLongClickListenerC9293 viewOnLongClickListenerC9293) {
        m15908(R.string.MT_Protector, new C9869(str, viewOnLongClickListenerC9293));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15915(final String str, final View.OnLongClickListener onLongClickListener) {
        m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ۜۢܳ
            @Override // l.InterfaceC10523
            public final void accept(TextView textView) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(5);
                ViewOnClickListenerC15284.m36687(textView, str);
                View.OnLongClickListener onLongClickListener2 = onLongClickListener;
                if (onLongClickListener2 != null) {
                    textView.setOnLongClickListener(onLongClickListener2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnLongClickListener, l.ۡۢܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15919(final C13352 c13352) {
        ?? r0 = new View.OnLongClickListener() { // from class: l.ۡۢܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C21576.m49061(R.string.MT_Protector, c13352.getPath());
                return true;
            }
        };
        m15916(C18969.m44060(500, c13352.getName()), (ViewOnLongClickListenerC9293) r0);
        m15915(C18969.m44060(500, c13352.getParent()), (View.OnLongClickListener) r0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15913(int i) {
        m15908(R.string.MT_Protector, new C8548(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21712 m15922(final long j) {
        return m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ۖۢܳ
            @Override // l.InterfaceC10523
            public final void accept(TextView textView) {
                C16773.m39592(textView, j);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21712 m15909(final long j) {
        return m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.֨ۢܳ
            @Override // l.InterfaceC10523
            public final void accept(TextView textView) {
                C16773.m39592(textView, j);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21712 m15929(long j) {
        return m15907(R.string.MT_Protector, C22482.m50718(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21712 m15910(String str, View.OnClickListener onClickListener) {
        return m15908(R.string.MT_Protector, new C13768(onClickListener, str));
    }
}
