package l;

import android.R;

/* JADX INFO: renamed from: l.᩹᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22485 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8374 f73406;

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21386() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22485(ViewOnClickListenerC8374 viewOnClickListenerC8374) {
        super(viewOnClickListenerC8374, R.string.paste);
        this.f73406 = viewOnClickListenerC8374;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        C13465.m32962((Object) strM40352);
        if (!strM40352.startsWith("/")) {
            strM40352 = "/".concat(strM40352);
        }
        C13465.m32962((Object) strM40352);
        this.f73406.m21931(strM40352, (InterfaceC4871) null);
        m40364();
    }
}
