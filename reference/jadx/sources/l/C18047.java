package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18047 extends AbstractC0148 {
    @Override // l.AbstractC0148
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final String mo1325() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۤ */
    public final String mo1330() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    public final String getName() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1333() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18881 mo1326(int i) {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    public final C20613 getIcon() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ᩴ */
    public final String mo1332() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC0148
    /* JADX INFO: renamed from: ۙ */
    public final void mo1328(AbstractActivityC17204 abstractActivityC17204) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18047 m42053(final AbstractActivityC17204 abstractActivityC17204, TextView textView, AbstractC0148 abstractC0148) {
        final C18047 c18047 = new C18047(-1);
        c18047.m1334(abstractC0148);
        textView.setText(abstractActivityC17204.getString(R.string.MT_Protector) + " >>");
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۗ۫
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                View viewM40395 = abstractActivityC17205.m40395(R.layout.MT_Protector);
                final C3131 c3131 = new C3131(viewM40395.findViewById(R.id.MT_Protector));
                final C3131 c3132 = new C3131(viewM40395.findViewById(R.id.MT_Protector));
                final C3131 c3133 = new C3131(viewM40395.findViewById(R.id.MT_Protector));
                final C3131 c3134 = new C3131(viewM40395.findViewById(R.id.MT_Protector));
                final C3131 c3135 = new C3131(viewM40395.findViewById(R.id.MT_Protector));
                final C18047 c18048 = this.f65132;
                boolean z = c18048.f1126;
                C1255 c1255 = c3131.f10144;
                c1255.setChecked(z);
                c3132.f10144.setChecked(c18048.f1124);
                c3133.f10144.setChecked(c18048.f1119);
                c3134.f10141.setText(abstractActivityC17205.getString(R.string.MT_Protector, c18048.f1117));
                c3135.f10141.setText(abstractActivityC17205.getString(R.string.MT_Protector, Integer.valueOf(c18048.f1118)));
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨۗ۫
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        boolean z3 = !z2;
                        c3132.m10211(z3);
                        c3133.m10211(z3);
                        c3134.m10211(z3);
                        c3135.m10211(z3);
                    }
                };
                c1255.setOnCheckedChangeListener(onCheckedChangeListener);
                onCheckedChangeListener.onCheckedChanged(c1255, c1255.isChecked());
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۛۗ۫
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C3131 c3136 = c3134;
                        CharSequence text = c3136.f10142.getText();
                        Object obj = c3136.f10140;
                        String str = obj == null ? c18048.f1117 : (String) obj;
                        final AbstractActivityC17204 abstractActivityC17206 = abstractActivityC17205;
                        C12559.m31259(abstractActivityC17206, text, str, new InterfaceC0818() { // from class: l.ܰۗ۫
                            @Override // l.InterfaceC0818
                            public final void accept(Object obj2) {
                                String str2 = (String) obj2;
                                C3131 c3137 = c3136;
                                c3137.f10140 = str2;
                                c3137.f10141.setText(abstractActivityC17206.getString(R.string.MT_Protector, str2));
                            }
                        });
                    }
                };
                ViewGroup viewGroup = c3134.f10143;
                viewGroup.setOnClickListener(onClickListener);
                if (!c3134.f10142.isEnabled()) {
                    viewGroup.setClickable(false);
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.᩺ۗ۫
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C3131 c3136 = c3135;
                        CharSequence text = c3136.f10142.getText();
                        Object obj = c3136.f10140;
                        int iIntValue = obj == null ? c18048.f1118 : ((Integer) obj).intValue();
                        final AbstractActivityC17204 abstractActivityC17206 = abstractActivityC17205;
                        C10870.m27609(abstractActivityC17206, text, iIntValue, new InterfaceC14984() { // from class: l.᩶ۗ۫
                            @Override // java.util.function.Consumer
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                mo15049((Integer) obj2);
                            }

                            @Override // l.InterfaceC14984
                            /* JADX INFO: renamed from: ۤ */
                            public final /* synthetic */ void mo15049(Integer num) {
                                C19460.m45001((InterfaceC14984) this, num);
                            }

                            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                                return C19460.m45000((InterfaceC14984) this, intConsumer);
                            }

                            public final Consumer andThen(Consumer consumer) {
                                return C12312.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.IntConsumer
                            public final void accept(int i) {
                                Integer numValueOf = Integer.valueOf(i);
                                C3131 c3137 = c3136;
                                c3137.f10140 = numValueOf;
                                c3137.f10141.setText(abstractActivityC17206.getString(R.string.MT_Protector, Integer.valueOf(i)));
                            }
                        });
                    }
                };
                ViewGroup viewGroup2 = c3135.f10143;
                viewGroup2.setOnClickListener(onClickListener2);
                if (!c3135.f10142.isEnabled()) {
                    viewGroup2.setClickable(false);
                }
                C2361 c2361BuildDialog = abstractActivityC17205.buildDialog();
                c2361BuildDialog.m8005(viewM40395);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۗ۫
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C18047 c18049 = c18048;
                        c18049.getClass();
                        c18049.f1126 = c3131.f10144.isChecked();
                        c18049.f1124 = c3132.f10144.isChecked();
                        c18049.f1119 = c3133.f10144.isChecked();
                        Object obj = c3134.f10140;
                        if (obj != null) {
                            String str = (String) obj;
                            c18049.f1117 = str;
                            c18049.f1121 = AbstractC0148.m1314(str);
                        }
                        Object obj2 = c3135.f10140;
                        if (obj2 != null) {
                            c18049.f1118 = ((Integer) obj2).intValue();
                        }
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
            }
        });
        return c18047;
    }
}
