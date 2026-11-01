package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C10780 implements InterfaceC11754 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f36729;

    public C10780(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f36729 = layoutInflaterFactory2C9161;
    }

    @Override // l.InterfaceC11754
    public final C15844 onApplyWindowInsets(View view, C15844 c15844) {
        int iM37681 = c15844.m37681();
        int iM23541 = this.f36729.m23541(c15844);
        if (iM37681 != iM23541) {
            int iM37683 = c15844.m37683();
            int iM37672 = c15844.m37672();
            int iM37670 = c15844.m37670();
            C1025 c1025 = new C1025(c15844);
            c1025.m3872(C13954.m33793(iM37683, iM23541, iM37672, iM37670));
            c15844 = c1025.m3869();
        }
        return C5031.m14008(view, c15844);
    }
}
