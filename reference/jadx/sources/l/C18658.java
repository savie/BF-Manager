package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܿ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18658 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f60671;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f60672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f60673;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19404 f60674;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f60675 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60676;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60677;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f60678;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
    }

    public C18658(ViewOnClickListenerC19404 viewOnClickListenerC19404, AbstractActivityC17204 abstractActivityC17204, Spinner spinner, String str, ArrayList arrayList, String str2, boolean z) {
        this.f60674 = viewOnClickListenerC19404;
        this.f60672 = abstractActivityC17204;
        this.f60673 = spinner;
        this.f60677 = str;
        this.f60678 = arrayList;
        this.f60676 = str2;
        this.f60671 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f60672, R.string.MT_Protector);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String string;
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f60674;
        C11378 c11378 = new C11378((AbstractActivityC17204) viewOnClickListenerC19404.requireActivity());
        String str = (String) viewOnClickListenerC19404.f62714.m46619().get(Math.max(0, this.f60673.getSelectedItemPosition()));
        try {
            C22941 c22941M51705 = C22941.m51705(C14584.m35193(this.f60677, new String[0]), (byte[]) null);
            try {
                viewOnClickListenerC19404.f62714.m46591(false);
                for (C8002 c8002 : this.f60678) {
                    String strM35187 = C14584.m35187(c8002.getName(), false);
                    String strSubstring = strM35187.substring(0, strM35187.length() - 6);
                    this.f7780.m33189(viewOnClickListenerC19404.getString(R.string.MT_Protector, strSubstring));
                    String str2 = this.f60676 + strSubstring;
                    String strM15490 = C5125.m15490(c22941M51705.m51727(c8002), StandardCharsets.UTF_8);
                    boolean zM46617 = viewOnClickListenerC19404.f62714.m46617(str2);
                    ArrayList arrayList = this.f60675;
                    if (zM46617) {
                        if (c11378.mo28694()) {
                            c11378.m28699(str2);
                            if (c11378.mo924()) {
                                break;
                            }
                        }
                        int iMo28700 = c11378.mo28700();
                        if (iMo28700 == 0) {
                            viewOnClickListenerC19404.f62714.m46576(str2, strM15490);
                            arrayList.add(str2);
                        } else if (iMo28700 == 2) {
                            int i = 1;
                            do {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                i++;
                                sb.append(i);
                                string = sb.toString();
                            } while (viewOnClickListenerC19404.f62714.m46617(string));
                            viewOnClickListenerC19404.f62714.m46577(str, string, strM15490);
                            arrayList.add(string);
                        }
                    } else {
                        viewOnClickListenerC19404.f62714.m46577(str, str2, strM15490);
                        arrayList.add(str2);
                    }
                }
                c22941M51705.close();
                viewOnClickListenerC19404.f62714.m46591(true);
            } catch (Throwable th) {
                try {
                    c22941M51705.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC19404.f62714.m46591(true);
            throw th3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f60672.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ArrayList arrayList = this.f60675;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f60674;
            viewOnClickListenerC19404.m44896();
            viewOnClickListenerC19404.f62713.m35940((Collection) arrayList);
        }
        this.f7780.m33185();
        if (this.f60671) {
            C14584.m35193(this.f60677, new String[0]).mo4296();
        }
    }
}
