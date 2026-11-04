package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۚۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5435 extends AbstractC8708 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C1997 f18933;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f18934;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f18935;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f18936;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3480 f18937;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f18938;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f18939;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f18940;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24827 f18941;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1706[] f18942;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f18943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f18944;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f18945;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18946;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18947;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܰ */
    public final String mo9092() {
        String strM48109 = C21054.m48109(mo9090());
        return !TextUtils.isEmpty(strM48109) ? strM48109 : this.f18941.f80305;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5435(C24827 c24827, C24827 c24828, IInArchive iInArchive, AbstractC22044 abstractC22044, ArrayList arrayList, C1706[] c1706Arr, String[] strArr, AbstractC22044 abstractC22045, boolean z, C3480 c3480, int i) {
        super(c24828);
        this.f18941 = c24827;
        this.f18934 = iInArchive;
        this.f18943 = abstractC22044;
        this.f18940 = arrayList;
        this.f18942 = c1706Arr;
        this.f18935 = strArr;
        this.f18939 = abstractC22045;
        this.f18936 = z;
        this.f18937 = c3480;
        this.f18947 = i;
        this.f18945 = iInArchive.getNumberOfItems();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final String mo9090() {
        return this.f18943.mo4294();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩸ۙ */
    public final IInArchive mo9096() {
        return this.f18934;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9094(IInArchive iInArchive) {
        C20244.m46520(iInArchive);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo9089(String str) {
        this.f18941.f80305 = str;
        C21054.m48119(mo9090(), str);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ۙ */
    public final void mo9095() {
        this.f18946 = 0;
        this.f18940.clear();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final void mo9093(int i) {
        this.f18946++;
        if (this.f18942[i] == null) {
            this.f18940.add(C1997.m6830(this.f18934, i));
        }
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֫ */
    public final void mo7308(int i) {
        this.f18944 = false;
        C24827 c24827 = this.f18941;
        c24827.f80306 = false;
        this.f18946++;
        C1997 c1997M6830 = C1997.m6830(this.f18934, i);
        String str = this.f18935[i];
        if (c24827.f80309) {
            c24827.mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + this.f18946 + "/" + this.f18945 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c24827.mo29447(str);
        if (this.f18942[i] != null) {
            return;
        }
        AbstractC22044 abstractC22044M49876 = this.f18939.m49876(str);
        if (abstractC22044M49876.mo2934()) {
            int iM55336 = c24827.m55336(abstractC22044M49876, str, c1997M6830.m6834(), c1997M6830.m6831());
            if (c24827.mo924()) {
                return;
            }
            if (iM55336 == 0) {
                c24827.f80306 = true;
                c24827.f80307.m54796(abstractC22044M49876);
                if (c24827.f80310.mo28695() && abstractC22044M49876.mo4292()) {
                    abstractC22044M49876.mo4300(this);
                }
            } else {
                if (iM55336 == 1) {
                    return;
                }
                if (iM55336 == 2) {
                    abstractC22044M49876 = abstractC22044M49876.m49839(true);
                }
            }
        }
        this.f18938 = abstractC22044M49876;
        this.f18933 = c1997M6830;
        this.f18944 = true;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo7311() {
        if (!this.f18944) {
            return null;
        }
        this.f18941.m55344(this.f18938.m49858());
        return new C8919(this.f18938);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֨ */
    public final void mo9088() {
        this.f18938.mo4287();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩶ */
    public final void mo7312() {
        if (this.f18944) {
            if (this.f18933.m6831() >= 0 && this.f18936 && this.f18938.mo2945()) {
                this.f18938.mo2942(this.f18933.m6831());
            }
            C24827 c24827 = this.f18941;
            if (c24827.f80306) {
                c24827.f80307.m54797(this.f18938);
            }
            this.f18937.m11432(this.f18935[this.f18933.m6835()], this.f18938.getName());
            C20108.m46234(this.f18938);
            c24827.m55343(this.f18938.mo4294().substring(this.f18947));
        }
    }
}
