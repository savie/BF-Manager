package l;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۙᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5087 implements InterfaceC8103, InterfaceC17544, InterfaceC21100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17779;

    public /* synthetic */ C5087(int i, Object obj) {
        this.f17778 = i;
        this.f17779 = obj;
    }

    public /* synthetic */ C5087(C20003 c20003, InterfaceC11052 interfaceC11052) {
        this.f17778 = 0;
        this.f17779 = interfaceC11052;
    }

    @Override // l.InterfaceC8103
    public void accept(Object obj) {
        ((C22811) this.f17779).m19807((C16187) obj);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        switch (this.f17778) {
            case 3:
                ((InterfaceC6116) this.f17779).mo17643(i);
                break;
            default:
                ((C11749) this.f17779).mo16839(i);
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m15385(C10138 c10138, int i, Bundle bundle) {
        C13801 c13801 = (C13801) this.f17779;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c10138.m26156();
                Parcelable parcelable = (Parcelable) c10138.m26154();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        C12990 c12990 = new C12990(new ClipData(c10138.m26155(), new ClipData.Item(c10138.m26152())), 2);
        c12990.m32399(c10138.m26153());
        c12990.m32400(bundle);
        return C22666.m51084(c13801, c12990.m32397()) == null;
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22354((AbstractC22044) this.f17779);
    }
}
