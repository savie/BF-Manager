package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC2021 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21159 f7538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10948 f7539;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22959 f7540 = C22959.m50800();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10948 f7541;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4433 f7542;

    public ViewOnClickListenerC2021(C21159 c21159, C10948 c10948, C10948 c10949, InterfaceC4433 interfaceC4433) {
        this.f7538 = c21159;
        this.f7539 = c10948;
        this.f7541 = c10949;
        this.f7542 = interfaceC4433;
    }

    @Override // android.view.View.OnClickListener
    @InterfaceC16341
    public void onClick(View view) {
        C13607 c13607M47617 = this.f7538.m47617();
        C10948 c10948 = this.f7539;
        boolean zHasFocus = c10948.hasFocus();
        C22959 c22959 = this.f7540;
        C10948 c10949 = this.f7541;
        if ((zHasFocus || c10949.hasFocus()) && c13607M47617.mo33253()) {
            if (!c10948.hasFocus()) {
                c10948 = c10949;
            }
            if (c13607M47617.mo33244() || !c22959.m50803()) {
                c13607M47617.mo33248(view, c10948);
                return;
            }
            return;
        }
        if (c13607M47617.mo33244() || !c22959.m50803()) {
            c13607M47617.mo33247(view, this.f7542);
        }
    }

    @Override // android.view.View.OnLongClickListener
    @InterfaceC16341
    public boolean onLongClick(View view) {
        C13607 c13607M47618 = this.f7538.m47618();
        if (c13607M47618 == null) {
            return false;
        }
        C10948 c10948 = this.f7539;
        boolean zHasFocus = c10948.hasFocus();
        C10948 c10949 = this.f7541;
        if ((zHasFocus || c10949.hasFocus()) && c13607M47618.mo33253()) {
            if (!c10948.hasFocus()) {
                c10948 = c10949;
            }
            c13607M47618.mo33248(view, c10948);
            return true;
        }
        c13607M47618.mo33247(view, this.f7542);
        return true;
    }
}
