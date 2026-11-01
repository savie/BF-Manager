package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۘۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3865 extends AbstractC3516 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f14443;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f14444;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f14445;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f14446;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15156 f14447;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19533 f14448;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f14449;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6688[] f14450;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f14451;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14452;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f14453;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18334 f14454;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f14455;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14456;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f14457;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo11192() {
        String strM27967 = C11088.m27967(mo11189());
        return !TextUtils.isEmpty(strM27967) ? strM27967 : this.f14447.f49502;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3865(C15156 c15156, C15156 c15157, IInArchive iInArchive, AbstractC20745 abstractC20745, ArrayList arrayList, C6688[] c6688Arr, String[] strArr, AbstractC20745 abstractC20746, boolean z, C19533 c19533, int i) {
        super(c15157);
        this.f14447 = c15156;
        this.f14449 = iInArchive;
        this.f14445 = abstractC20745;
        this.f14457 = arrayList;
        this.f14450 = c6688Arr;
        this.f14453 = strArr;
        this.f14444 = abstractC20746;
        this.f14446 = z;
        this.f14448 = c19533;
        this.f14452 = i;
        this.f14455 = iInArchive.getNumberOfItems();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String mo11189() {
        return this.f14445.mo33986();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final IInArchive mo11185() {
        return this.f14449;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11190(IInArchive iInArchive) {
        C19431.m44468(iInArchive);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11187(String str) {
        this.f14447.f49502 = str;
        C11088.m27975(mo11189(), str);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void mo11191() {
        this.f14456 = 0;
        this.f14457.clear();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo11195(int i) {
        this.f14456++;
        if (this.f14450[i] == null) {
            this.f14457.add(C18334.m42567(this.f14449, i));
        }
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo11186(int i) {
        this.f14443 = false;
        C15156 c15156 = this.f14447;
        c15156.f49510 = false;
        this.f14456++;
        C18334 c18334M42567 = C18334.m42567(this.f14449, i);
        String str = this.f14453[i];
        if (c15156.f49505) {
            c15156.mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + this.f14456 + "/" + this.f14455 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c15156.mo41554(str);
        if (this.f14450[i] != null) {
            return;
        }
        AbstractC20745 abstractC20745M46690 = this.f14444.m46690(str);
        if (abstractC20745M46690.mo33975()) {
            int iM36322 = c15156.m36322(abstractC20745M46690, str, c18334M42567.m42577(), c18334M42567.m42570());
            if (c15156.mo2357()) {
                return;
            }
            if (iM36322 == 0) {
                c15156.f49510 = true;
                c15156.f49504.m14408(abstractC20745M46690);
                if (c15156.f49506.mo11432() && abstractC20745M46690.mo35233()) {
                    abstractC20745M46690.mo35234(this);
                }
            } else {
                if (iM36322 == 1) {
                    return;
                }
                if (iM36322 == 2) {
                    abstractC20745M46690 = abstractC20745M46690.m46693(true);
                }
            }
        }
        this.f14451 = abstractC20745M46690;
        this.f14454 = c18334M42567;
        this.f14443 = true;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ISequentialOutStream mo11194() {
        if (!this.f14443) {
            return null;
        }
        this.f14447.m36329(this.f14451.m46689());
        return new C7861(this.f14451);
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo11188() {
        this.f14451.mo24644();
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void mo11193() {
        if (this.f14443) {
            if (this.f14454.m42570() >= 0 && this.f14446 && this.f14451.mo8448()) {
                this.f14451.mo32855(this.f14454.m42570());
            }
            C15156 c15156 = this.f14447;
            if (c15156.f49510) {
                c15156.f49504.m14402(this.f14451);
            }
            this.f14448.m44616(this.f14453[this.f14454.m42575()], this.f14451.getName());
            C22252.m49409(this.f14451);
            c15156.m36330(this.f14451.mo33986().substring(this.f14452));
        }
    }
}
