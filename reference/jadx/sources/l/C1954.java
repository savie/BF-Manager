package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1954 implements InterfaceC19595 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f7352;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7354;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3365[] f7355;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7353 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0647 f7356 = new C14656(this);

    public C1954(int i, HashMap map) {
        this.f7354 = i;
        this.f7352 = map;
        this.f7355 = new C3365[i];
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo6323(Object obj, Object obj2, AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        ArrayList arrayList;
        C9717 c9717;
        C9717 c9718;
        C3365[] c3365Arr = (C3365[]) obj;
        C3365[] c3365Arr2 = (C3365[]) obj2;
        int i = this.f7354;
        if (c3365Arr2 == null) {
            c3365Arr2 = new C3365[i];
            System.arraycopy(c3365Arr, 0, c3365Arr2, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                C3365 c3365 = c3365Arr[i2];
                C3365 c3366 = c3365Arr2[i2];
                if (c3365 != null) {
                    if (c3366 == null) {
                        c3365Arr2[i2] = c3365;
                    } else if (c3365 != c3366) {
                        C9717 c9719 = c3365.f12477;
                        if (c9719 != null) {
                            c9719.f32713 = true;
                        }
                        C9717 c97110 = c3366.f12477;
                        if (c97110 != null) {
                            c97110.f32713 = true;
                        }
                    }
                }
            }
        }
        if (abstractC4778.f16795 == EnumC2890.LABEL && (arrayList = ((C17002) abstractC4778).f54351) != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (AbstractC7124 abstractC7124 : ((C15592) it.next()).f31401.mo19023()) {
                    int i3 = ((C2184) abstractC7124).f7921;
                    C3365 c3367 = c3365Arr[i3];
                    C3365 c3368 = c3365Arr2[i3];
                    if (c3368 != null) {
                        if (!c3368.f12476 && (c9718 = c3368.f12477) != null) {
                            c9718.f32713 = true;
                        }
                    } else if (c3367 != null && !c3367.f12476 && (c9717 = c3367.f12477) != null) {
                        c9717.f32713 = true;
                    }
                }
            }
        }
        return c3365Arr2;
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo6324(Object obj, AbstractC4777 abstractC4777) {
        this.f7353 = false;
        int i = this.f7354;
        C3365[] c3365Arr = this.f7355;
        System.arraycopy((C3365[]) obj, 0, c3365Arr, 0, i);
        this.f7356.mo2941(abstractC4777);
        if (abstractC4777.f16796.size() > 1) {
            this.f7353 = true;
        }
        if (!this.f7353) {
            abstractC4777.f16794 = null;
        }
        return c3365Arr;
    }

    @Override // l.InterfaceC19595
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo6322() {
        return new C3365[this.f7354];
    }
}
