package l;

import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۡ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final class C8562 extends AbstractDialogInterfaceOnClickListenerC4454 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f29589;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f29590;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8562(C20556 c20556, AbstractActivityC12483 abstractActivityC12483, String str) {
        super(abstractActivityC12483, "srepr");
        this.f29589 = c20556;
        this.f29590 = str;
        m12428(R.string.MT_Protector);
        C22357 c22357 = new C22357(c20556.f66564, null, R.style.MT_Protector);
        c22357.setText(R.string.MT_Protector);
        m12429(c22357);
        C10948 c10948M23516 = m12433().m23516();
        c10948M23516.mo16989((CharSequence) str);
        c10948M23516.m16857(PluginEditText.SYNTAX_REGEX_REPLACEMENT, true);
        c10948M23516.m27484(131073);
        c10948M23516.m16962("$0\\n");
        m12425();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC4454
    /* JADX INFO: renamed from: ۚ */
    public final void mo12431() {
        C20556 c20556 = this.f29589;
        String strM12432 = m12432();
        try {
            C9751.m24733((C14690) null, strM12432);
            if (!strM12432.equals(this.f29590)) {
                c20556.m46361();
                ApplicationC0716.f2992.edit().putString("srep", strM12432).apply();
                m12434();
            }
            m12427();
        } catch (PatternSyntaxException e) {
            C20556.m46342(c20556, e);
        }
    }
}
