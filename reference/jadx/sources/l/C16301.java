package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16301 extends AbstractC12068 {
    @Override // l.AbstractC12068
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final String mo4700() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۖ */
    public final String mo4699() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    public final String getName() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۨ */
    public final String mo4705() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12233 mo4701(int i) {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    public final C0690 getIcon() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۚ */
    public final String mo4704() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC12068
    /* JADX INFO: renamed from: ۙ */
    public final void mo4703(AbstractActivityC12483 abstractActivityC12483) {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16301 m38449(final AbstractActivityC12483 abstractActivityC12483, TextView textView, AbstractC12068 abstractC12068) {
        final C16301 c16301 = new C16301(-1);
        c16301.m29999(abstractC12068);
        textView.setText(abstractActivityC12483.getString(R.string.MT_Protector) + " >>");
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ۡ֨֨
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
                final AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                View viewM30995 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                final C19123 c19123 = new C19123(viewM30995.findViewById(R.id.MT_Protector));
                final C19123 c19124 = new C19123(viewM30995.findViewById(R.id.MT_Protector));
                final C19123 c19125 = new C19123(viewM30995.findViewById(R.id.MT_Protector));
                final C19123 c19126 = new C19123(viewM30995.findViewById(R.id.MT_Protector));
                final C19123 c19127 = new C19123(viewM30995.findViewById(R.id.MT_Protector));
                final C16301 c16302 = this.f29561;
                boolean z = c16302.f40393;
                C12562 c12562 = c19123.f61781;
                c12562.setChecked(z);
                c19124.f61781.setChecked(c16302.f40388);
                c19125.f61781.setChecked(c16302.f40392);
                c19126.f61784.setText(abstractActivityC12484.getString(R.string.MT_Protector, c16302.f40394));
                c19127.f61784.setText(abstractActivityC12484.getString(R.string.MT_Protector, Integer.valueOf(c16302.f40390)));
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۤ֨֨
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        boolean z3 = !z2;
                        c19124.m43938(z3);
                        c19125.m43938(z3);
                        c19126.m43938(z3);
                        c19127.m43938(z3);
                    }
                };
                c12562.setOnCheckedChangeListener(onCheckedChangeListener);
                onCheckedChangeListener.onCheckedChanged(c12562, c12562.isChecked());
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۟֨֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C19123 c19128 = c19126;
                        CharSequence text = c19128.f61783.getText();
                        Object obj = c19128.f61782;
                        String str = obj == null ? c16302.f40394 : (String) obj;
                        final AbstractActivityC12483 abstractActivityC12485 = abstractActivityC12484;
                        C16053.m38047(abstractActivityC12485, text, str, new InterfaceC17295() { // from class: l.᩶֨֨
                            @Override // l.InterfaceC17295
                            public final void accept(Object obj2) {
                                String str2 = (String) obj2;
                                C19123 c19129 = c19128;
                                c19129.f61782 = str2;
                                c19129.f61784.setText(abstractActivityC12485.getString(R.string.MT_Protector, str2));
                            }
                        });
                    }
                };
                ViewGroup viewGroup = c19126.f61785;
                viewGroup.setOnClickListener(onClickListener);
                if (!c19126.f61783.isEnabled()) {
                    viewGroup.setClickable(false);
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.᩷֨֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C19123 c19128 = c19127;
                        CharSequence text = c19128.f61783.getText();
                        Object obj = c19128.f61782;
                        int iIntValue = obj == null ? c16302.f40390 : ((Integer) obj).intValue();
                        final AbstractActivityC12483 abstractActivityC12485 = abstractActivityC12484;
                        C13251.m32730(abstractActivityC12485, text, iIntValue, new InterfaceC23537() { // from class: l.֡֨֨
                            @Override // java.util.function.Consumer
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                mo1000((Integer) obj2);
                            }

                            @Override // l.InterfaceC23537
                            /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ void mo1000(Integer num) {
                                C10837.m27159((InterfaceC23537) this, num);
                            }

                            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                                return C10837.m27158((InterfaceC23537) this, intConsumer);
                            }

                            public final Consumer andThen(Consumer consumer) {
                                return C1455.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.IntConsumer
                            public final void accept(int i) {
                                Integer numValueOf = Integer.valueOf(i);
                                C19123 c19129 = c19128;
                                c19129.f61782 = numValueOf;
                                c19129.f61784.setText(abstractActivityC12485.getString(R.string.MT_Protector, Integer.valueOf(i)));
                            }
                        });
                    }
                };
                ViewGroup viewGroup2 = c19127.f61785;
                viewGroup2.setOnClickListener(onClickListener2);
                if (!c19127.f61783.isEnabled()) {
                    viewGroup2.setClickable(false);
                }
                C8067 c8067BuildDialog = abstractActivityC12484.buildDialog();
                c8067BuildDialog.m21258(viewM30995);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ֨֨
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C16301 c16303 = c16302;
                        c16303.getClass();
                        c16303.f40393 = c19123.f61781.isChecked();
                        c16303.f40388 = c19124.f61781.isChecked();
                        c16303.f40392 = c19125.f61781.isChecked();
                        Object obj = c19126.f61782;
                        if (obj != null) {
                            String str = (String) obj;
                            c16303.f40394 = str;
                            c16303.f40391 = AbstractC12068.m29987(str);
                        }
                        Object obj2 = c19127.f61782;
                        if (obj2 != null) {
                            c16303.f40390 = ((Integer) obj2).intValue();
                        }
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
            }
        });
        return c16301;
    }
}
