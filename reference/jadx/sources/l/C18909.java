package l;

import android.R;

/* JADX INFO: renamed from: l.ᩳۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18909 extends AbstractC24131 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6976 f61358;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC20581 f61359 = new C18163(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20581 f61357 = new C0264(this);

    public C18909(C6976 c6976) {
        this.f61358 = c6976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43893() {
        int itemCount;
        int i = R.id.accessibilityActionPageLeft;
        C6976 c6976 = this.f61358;
        C22666.m51125(R.id.accessibilityActionPageLeft, c6976);
        C22666.m51125(R.id.accessibilityActionPageRight, c6976);
        C22666.m51125(R.id.accessibilityActionPageUp, c6976);
        C22666.m51125(R.id.accessibilityActionPageDown, c6976);
        if (c6976.f23017.getAdapter() == null || (itemCount = c6976.f23017.getAdapter().getItemCount()) == 0 || !c6976.m19285()) {
            return;
        }
        int iM19290 = c6976.m19290();
        InterfaceC20581 interfaceC20581 = this.f61357;
        InterfaceC20581 interfaceC20582 = this.f61359;
        if (iM19290 == 0) {
            boolean z = c6976.f23026.getLayoutDirection() == 1;
            int i2 = z ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (z) {
                i = R.id.accessibilityActionPageRight;
            }
            if (c6976.f23027 < itemCount - 1) {
                C22666.m51096(c6976, new C8451(i2, (String) null), null, interfaceC20582);
            }
            if (c6976.f23027 > 0) {
                C22666.m51096(c6976, new C8451(i, (String) null), null, interfaceC20581);
                return;
            }
            return;
        }
        if (c6976.f23027 < itemCount - 1) {
            C22666.m51096(c6976, new C8451(R.id.accessibilityActionPageDown, (String) null), null, interfaceC20582);
        }
        if (c6976.f23027 > 0) {
            C22666.m51096(c6976, new C8451(R.id.accessibilityActionPageUp, (String) null), null, interfaceC20581);
        }
    }
}
