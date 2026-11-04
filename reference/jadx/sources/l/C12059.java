package l;

import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ۨۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12059 extends AbstractViewOnClickListenerC21206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f38841;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f38842;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f38843;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11983 f38844;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23994 f38845;

    @Override // l.AbstractC6796
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3322() {
        return 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12059(C23994 c23994, Main main, AbstractC22044 abstractC22044) {
        super(main);
        this.f38845 = c23994;
        this.f38844 = C20613.f66076.f66117;
        this.f38843 = abstractC22044.getName();
        String strMo4294 = abstractC22044.mo4294();
        this.f38841 = strMo4294;
        int iIndexOf = strMo4294.indexOf("Android/data/");
        if (iIndexOf == -1) {
            this.f38842 = strMo4294;
        } else {
            this.f38842 = strMo4294.substring(iIndexOf);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C23994 c23994 = this.f38845;
        if (c23994.f27860.m24482() || AbstractViewOnClickListenerC21206.f67690.m55200()) {
            return;
        }
        AbstractC22044 abstractC22044M35193 = C14584.m35193(this.f38841, new String[0]);
        if (abstractC22044M35193.mo2934()) {
            String strMo4294 = abstractC22044M35193.mo4294();
            int i = ActivityC0848.f3169;
            Main main = this.f22654;
            Intent intent = new Intent(main, (Class<?>) ActivityC0848.class);
            intent.putExtra("projectPath", strMo4294);
            main.startActivity(intent);
            return;
        }
        c23994.m53552();
    }
}
