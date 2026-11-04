package l;

import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩻۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes.dex */
public final class C25074 extends AbstractDialogInterfaceOnClickListenerC17480 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f81093;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f81094;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25074(C23582 c23582, AbstractActivityC17204 abstractActivityC17204, String str) {
        super(abstractActivityC17204, "srepr");
        this.f81093 = c23582;
        this.f81094 = str;
        m40982(R.string.MT_Protector);
        C5752 c5752 = new C5752(c23582.f76553, null, R.style.MT_Protector);
        c5752.setText(R.string.MT_Protector);
        m40983(c5752);
        C23255 c23255M41605 = m40988().m41605();
        c23255M41605.mo52335((CharSequence) str);
        c23255M41605.m53903(PluginEditText.SYNTAX_REGEX_REPLACEMENT, true);
        c23255M41605.m52326(131073);
        c23255M41605.m52337("$0\\n");
        m40986();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17480
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5598() {
        C23582 c23582 = this.f81093;
        String strM40985 = m40985();
        try {
            C7974.m21762((C18415) null, strM40985);
            if (!strM40985.equals(this.f81094)) {
                c23582.m52795();
                ApplicationC17729.f58258.edit().putString("srep", strM40985).apply();
                m40987();
            }
            m40981();
        } catch (PatternSyntaxException e) {
            C23582.m52781(c23582, e);
        }
    }
}
