package l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G696 */
/* JADX INFO: loaded from: classes3.dex */
public class C6854 extends C19555 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4031 f23064;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C23083 f23065;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f23066;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18477(int i) {
        this.f23066 = i;
        this.f23065.f74999.setColor(i);
    }

    public C6854(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23066 = C20368.f65975;
        m18475();
    }

    public C6854(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23066 = C20368.f65975;
        m18475();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18478(InterfaceC4031 interfaceC4031) {
        this.f23064 = interfaceC4031;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18479(boolean z) {
        this.f23065.m51078(z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m18475() {
        if (isInEditMode()) {
            return;
        }
        C23083 c23083 = (C23083) LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f23065 = c23083;
        c23083.f74999.setColor(this.f23066);
        float fApplyDimension = TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.f23065.m51079((int) fApplyDimension);
        super.m44656(fApplyDimension);
        final C23083 c23084 = this.f23065;
        post(new Runnable() { // from class: l.ᩳܶ᩺
            @Override // java.lang.Runnable
            public final void run() {
                this.f58020.f62848.addView(c23084);
            }
        });
        super.m44658(new C1209(this));
        super.m44657(new C13205(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18474(C6854 c6854) {
        c6854.f23065.f75000 = false;
        InterfaceC4031 interfaceC4031 = c6854.f23064;
        if (interfaceC4031 != null) {
            interfaceC4031.mo11533(c6854);
        }
        super.m44659();
    }
}
