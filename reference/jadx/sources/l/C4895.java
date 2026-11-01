package l;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۙ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4895 implements InterfaceC5601, InterfaceC10014, InterfaceC18848, InterfaceC21921, InterfaceC7728 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17178;

    public /* synthetic */ C4895(Object obj) {
        this.f17178 = obj;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((C17130) this.f17178).mo21455(i);
    }

    @Override // l.InterfaceC10014
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13621(int i, int i2, int i3, int i4) {
        C3040.m9082((C3040) this.f17178, i2, i3, i4);
    }

    @Override // l.InterfaceC7728
    /* JADX INFO: renamed from: ۙ */
    public void mo11010(C16195 c16195) {
        ((C9497) this.f17178).f32141.suppressLayout(false);
    }

    @Override // l.InterfaceC5601
    /* JADX INFO: renamed from: ۙ */
    public int mo8451(int i, int i2) {
        return (i < 28 || i > 31) ? i2 : ((InterfaceC5601) this.f17178).mo8451(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m13622(C14246 c14246, int i, Bundle bundle) {
        C1647 c1647 = (C1647) this.f17178;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c14246.m34380();
                Parcelable parcelable = (Parcelable) c14246.m34382();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        C22608 c22608 = new C22608(new ClipData(c14246.m34384(), new ClipData.Item(c14246.m34381())), 2);
        c22608.m50118(c14246.m34383());
        c22608.m50119(bundle);
        return C5031.m13979(c1647, c22608.m50116()) == null;
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        C8265.m21682((C11545) this.f17178, abstractC20745);
    }
}
