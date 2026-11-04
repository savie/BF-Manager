package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۗۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC3401 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f11061;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f11062;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C24720 f11063 = C24720.m55197();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16626 f11064;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7960 f11065;

    public ViewOnClickListenerC3401(C16626 c16626, C23255 c23255, C23255 c23256, InterfaceC7960 interfaceC7960) {
        this.f11064 = c16626;
        this.f11062 = c23255;
        this.f11061 = c23256;
        this.f11065 = interfaceC7960;
    }

    @Override // android.view.View.OnClickListener
    @InterfaceC19352
    public void onClick(View view) {
        C19147 c19147M39343 = this.f11064.m39343();
        C23255 c23255 = this.f11062;
        boolean zHasFocus = c23255.hasFocus();
        C24720 c24720 = this.f11063;
        C23255 c23256 = this.f11061;
        if ((zHasFocus || c23256.hasFocus()) && c19147M39343.mo35299()) {
            if (!c23255.hasFocus()) {
                c23255 = c23256;
            }
            if (c19147M39343.mo11457() || !c24720.m55200()) {
                c19147M39343.mo11456(view, c23255);
                return;
            }
            return;
        }
        if (c19147M39343.mo11457() || !c24720.m55200()) {
            c19147M39343.mo11455(view, this.f11065);
        }
    }

    @Override // android.view.View.OnLongClickListener
    @InterfaceC19352
    public boolean onLongClick(View view) {
        C19147 c19147M39345 = this.f11064.m39345();
        if (c19147M39345 == null) {
            return false;
        }
        C23255 c23255 = this.f11062;
        boolean zHasFocus = c23255.hasFocus();
        C23255 c23256 = this.f11061;
        if ((zHasFocus || c23256.hasFocus()) && c19147M39345.mo35299()) {
            if (!c23255.hasFocus()) {
                c23255 = c23256;
            }
            c19147M39345.mo11456(view, c23255);
            return true;
        }
        c19147M39345.mo11455(view, this.f11065);
        return true;
    }
}
